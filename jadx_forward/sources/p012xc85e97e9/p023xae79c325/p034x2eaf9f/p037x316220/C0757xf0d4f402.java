package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.SurfaceCombination */
/* loaded from: classes13.dex */
public final class C0757xf0d4f402 {

    /* renamed from: mSurfaceConfigList */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f> f1797xb2df52a0 = new java.util.ArrayList();

    /* renamed from: generateArrangements */
    private static void m5674x67d3c0be(java.util.List<int[]> list, int i17, int[] iArr, int i18) {
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
                m5674x67d3c0be(list, i17, iArr, i18 + 1);
            }
        }
    }

    /* renamed from: getElementsArrangements */
    private java.util.List<int[]> m5675xa918f5b6(int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        m5674x67d3c0be(arrayList, i17, new int[i17], 0);
        return arrayList;
    }

    /* renamed from: addSurfaceConfig */
    public boolean m5676xf9dfeb2e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f abstractC0758x2d42962f) {
        return this.f1797xb2df52a0.add(abstractC0758x2d42962f);
    }

    /* renamed from: getOrderedSupportedSurfaceConfigList */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f> m5677x4e7bd216(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f> list) {
        int i17;
        if (list.isEmpty()) {
            return new java.util.ArrayList();
        }
        if (list.size() != this.f1797xb2df52a0.size()) {
            return null;
        }
        java.util.List<int[]> m5675xa918f5b6 = m5675xa918f5b6(this.f1797xb2df52a0.size());
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f[] abstractC0758x2d42962fArr = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f[list.size()];
        java.util.Iterator<int[]> it = m5675xa918f5b6.iterator();
        while (true) {
            i17 = 0;
            if (!it.hasNext()) {
                break;
            }
            int[] next = it.next();
            boolean z17 = true;
            while (i17 < this.f1797xb2df52a0.size()) {
                if (next[i17] < list.size()) {
                    z17 &= this.f1797xb2df52a0.get(i17).m5684x450f16a4(list.get(next[i17]));
                    if (!z17) {
                        break;
                    }
                    abstractC0758x2d42962fArr[next[i17]] = this.f1797xb2df52a0.get(i17);
                }
                i17++;
            }
            if (z17) {
                i17 = 1;
                break;
            }
        }
        if (i17 != 0) {
            return java.util.Arrays.asList(abstractC0758x2d42962fArr);
        }
        return null;
    }

    /* renamed from: getSurfaceConfigList */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f> m5678x693252d7() {
        return this.f1797xb2df52a0;
    }

    /* renamed from: removeSurfaceConfig */
    public boolean m5679xfee6942b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f abstractC0758x2d42962f) {
        return this.f1797xb2df52a0.remove(abstractC0758x2d42962f);
    }
}
