package n0;

/* loaded from: classes13.dex */
public final class e3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f415034a;

    public e3(java.util.List list, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        list = (i17 & 1) != 0 ? new java.util.ArrayList() : list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        this.f415034a = list;
    }

    public final void a(int i17) {
        java.util.List list = this.f415034a;
        if ((!list.isEmpty()) && (((java.lang.Number) list.get(0)).intValue() == i17 || ((java.lang.Number) list.get(list.size() - 1)).intValue() == i17)) {
            return;
        }
        int size = list.size();
        list.add(java.lang.Integer.valueOf(i17));
        while (size > 0) {
            int i18 = ((size + 1) >>> 1) - 1;
            int intValue = ((java.lang.Number) list.get(i18)).intValue();
            if (i17 <= intValue) {
                break;
            }
            list.set(size, java.lang.Integer.valueOf(intValue));
            size = i18;
        }
        list.set(size, java.lang.Integer.valueOf(i17));
    }

    public final int b() {
        int intValue;
        java.util.List list = this.f415034a;
        if (!(list.size() > 0)) {
            n0.e1.c("Set is empty".toString());
            throw null;
        }
        int intValue2 = ((java.lang.Number) list.get(0)).intValue();
        while ((!list.isEmpty()) && ((java.lang.Number) list.get(0)).intValue() == intValue2) {
            list.set(0, kz5.n0.i0(list));
            list.remove(list.size() - 1);
            int size = list.size();
            int size2 = list.size() >>> 1;
            int i17 = 0;
            while (i17 < size2) {
                int intValue3 = ((java.lang.Number) list.get(i17)).intValue();
                int i18 = (i17 + 1) * 2;
                int i19 = i18 - 1;
                int intValue4 = ((java.lang.Number) list.get(i19)).intValue();
                if (i18 >= size || (intValue = ((java.lang.Number) list.get(i18)).intValue()) <= intValue4) {
                    if (intValue4 > intValue3) {
                        list.set(i17, java.lang.Integer.valueOf(intValue4));
                        list.set(i19, java.lang.Integer.valueOf(intValue3));
                        i17 = i19;
                    }
                } else if (intValue > intValue3) {
                    list.set(i17, java.lang.Integer.valueOf(intValue));
                    list.set(i18, java.lang.Integer.valueOf(intValue3));
                    i17 = i18;
                }
            }
        }
        return intValue2;
    }
}
