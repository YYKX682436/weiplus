package androidx.camera.core.impl;

/* loaded from: classes13.dex */
public final class SurfaceCombination {
    private final java.util.List<androidx.camera.core.impl.SurfaceConfig> mSurfaceConfigList = new java.util.ArrayList();

    private static void generateArrangements(java.util.List<int[]> list, int i17, int[] iArr, int i18) {
        boolean z17;
        if (i18 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i19 = 0; i19 < i17; i19++) {
            int i27 = 0;
            while (true) {
                if (i27 >= i18) {
                    z17 = false;
                    break;
                } else {
                    if (i19 == iArr[i27]) {
                        z17 = true;
                        break;
                    }
                    i27++;
                }
            }
            if (!z17) {
                iArr[i18] = i19;
                generateArrangements(list, i17, iArr, i18 + 1);
            }
        }
    }

    private java.util.List<int[]> getElementsArrangements(int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        generateArrangements(arrayList, i17, new int[i17], 0);
        return arrayList;
    }

    public boolean addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig surfaceConfig) {
        return this.mSurfaceConfigList.add(surfaceConfig);
    }

    public java.util.List<androidx.camera.core.impl.SurfaceConfig> getOrderedSupportedSurfaceConfigList(java.util.List<androidx.camera.core.impl.SurfaceConfig> list) {
        int i17;
        if (list.isEmpty()) {
            return new java.util.ArrayList();
        }
        if (list.size() != this.mSurfaceConfigList.size()) {
            return null;
        }
        java.util.List<int[]> elementsArrangements = getElementsArrangements(this.mSurfaceConfigList.size());
        androidx.camera.core.impl.SurfaceConfig[] surfaceConfigArr = new androidx.camera.core.impl.SurfaceConfig[list.size()];
        java.util.Iterator<int[]> it = elementsArrangements.iterator();
        while (true) {
            i17 = 0;
            if (!it.hasNext()) {
                break;
            }
            int[] next = it.next();
            boolean z17 = true;
            while (i17 < this.mSurfaceConfigList.size()) {
                if (next[i17] < list.size()) {
                    z17 &= this.mSurfaceConfigList.get(i17).isSupported(list.get(next[i17]));
                    if (!z17) {
                        break;
                    }
                    surfaceConfigArr[next[i17]] = this.mSurfaceConfigList.get(i17);
                }
                i17++;
            }
            if (z17) {
                i17 = 1;
                break;
            }
        }
        if (i17 != 0) {
            return java.util.Arrays.asList(surfaceConfigArr);
        }
        return null;
    }

    public java.util.List<androidx.camera.core.impl.SurfaceConfig> getSurfaceConfigList() {
        return this.mSurfaceConfigList;
    }

    public boolean removeSurfaceConfig(androidx.camera.core.impl.SurfaceConfig surfaceConfig) {
        return this.mSurfaceConfigList.remove(surfaceConfig);
    }
}
