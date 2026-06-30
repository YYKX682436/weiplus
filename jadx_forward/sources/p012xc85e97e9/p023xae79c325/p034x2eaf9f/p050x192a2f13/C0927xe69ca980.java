package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13;

/* renamed from: androidx.camera.core.processing.TargetUtils */
/* loaded from: classes13.dex */
public class C0927xe69ca980 {
    private C0927xe69ca980() {
    }

    /* renamed from: checkSupportedTargets */
    public static void m6382xa6199d9c(java.util.Collection<java.lang.Integer> collection, int i17) {
        m3.h.b(collection.contains(java.lang.Integer.valueOf(i17)), java.lang.String.format(java.util.Locale.US, "Effects target %s is not in the supported list %s.", m6383x8dc88bb2(i17), m6384x2b48eb01(collection)));
    }

    /* renamed from: getHumanReadableName */
    public static java.lang.String m6383x8dc88bb2(int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ((i17 & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i17 & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i17 & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb6.append((java.lang.CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb6.append((java.lang.CharSequence) "|");
            }
        }
        return sb6.toString();
    }

    /* renamed from: getHumanReadableNames */
    private static java.lang.String m6384x2b48eb01(java.util.Collection<java.lang.Integer> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.Integer> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(m6383x8dc88bb2(it.next().intValue()));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        java.util.Iterator it6 = arrayList.iterator();
        if (it6.hasNext()) {
            while (true) {
                sb7.append((java.lang.CharSequence) it6.next());
                if (!it6.hasNext()) {
                    break;
                }
                sb7.append((java.lang.CharSequence) ", ");
            }
        }
        sb6.append(sb7.toString());
        sb6.append("]");
        return sb6.toString();
    }

    /* renamed from: getNumberOfTargets */
    public static int m6385xee1f13ac(int i17) {
        int i18 = 0;
        while (i17 != 0) {
            i18 += i17 & 1;
            i17 >>= 1;
        }
        return i18;
    }

    /* renamed from: isSuperset */
    public static boolean m6386x6cfb7e51(int i17, int i18) {
        return (i17 & i18) == i18;
    }
}
