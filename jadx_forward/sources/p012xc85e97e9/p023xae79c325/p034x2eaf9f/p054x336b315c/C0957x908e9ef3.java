package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c;

/* renamed from: androidx.camera.core.streamsharing.DynamicRangeUtils */
/* loaded from: classes14.dex */
public class C0957x908e9ef3 {
    private C0957x908e9ef3() {
    }

    /* renamed from: intersectDynamicRange */
    private static p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e m6509xbc9e3afd(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> list) {
        if (list.isEmpty()) {
            return null;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e = list.get(0);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(c0491x2bb48c5e.m4386xe1d96ac9());
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(c0491x2bb48c5e.m4385xbc5bbb2c());
        for (int i17 = 1; i17 < list.size(); i17++) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e2 = list.get(i17);
            valueOf = m6511xb13f7f70(valueOf, java.lang.Integer.valueOf(c0491x2bb48c5e2.m4386xe1d96ac9()));
            valueOf2 = m6510x8bc1cfd3(valueOf2, java.lang.Integer.valueOf(c0491x2bb48c5e2.m4385xbc5bbb2c()));
            if (valueOf == null || valueOf2 == null) {
                return null;
            }
        }
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e(valueOf.intValue(), valueOf2.intValue());
    }

    /* renamed from: intersectDynamicRangeBitDepth */
    private static java.lang.Integer m6510x8bc1cfd3(java.lang.Integer num, java.lang.Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (num2.equals(0) || num.equals(num2)) {
            return num;
        }
        return null;
    }

    /* renamed from: intersectDynamicRangeEncoding */
    private static java.lang.Integer m6511xb13f7f70(java.lang.Integer num, java.lang.Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (num2.equals(0)) {
            return num;
        }
        if (num.equals(2) && !num2.equals(1)) {
            return num2;
        }
        if ((!num2.equals(2) || num.equals(1)) && !num.equals(num2)) {
            return null;
        }
        return num;
    }

    /* renamed from: resolveDynamicRange */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e m6512x782d8c4a(java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>> set) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m5475x82dbcab4());
        }
        return m6509xbc9e3afd(arrayList);
    }
}
