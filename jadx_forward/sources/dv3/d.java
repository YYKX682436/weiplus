package dv3;

/* loaded from: classes5.dex */
public final class d extends dv3.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(in5.s itemConvertFactory, java.util.ArrayList data) {
        super(itemConvertFactory, data);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemConvertFactory, "itemConvertFactory");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
    }

    @Override // dv3.c
    public java.util.List J0(java.util.List audios) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audios, "audios");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        for (java.lang.Object obj : audios) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a) obj;
            c16997xb0aa383a.f();
            java.lang.Integer f17 = c16997xb0aa383a.f();
            if (f17 != null && f17.intValue() == 5) {
                arrayList.add(new rv3.j());
            } else {
                java.lang.Integer f18 = c16997xb0aa383a.f();
                if (f18 != null && f18.intValue() == 1) {
                    arrayList.add(new rv3.h(c16997xb0aa383a));
                }
            }
            i17 = i18;
        }
        return arrayList;
    }
}
