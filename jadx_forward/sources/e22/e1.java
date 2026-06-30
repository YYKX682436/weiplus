package e22;

/* loaded from: classes10.dex */
public final class e1 {
    public e1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final java.util.List a(e22.e1 e1Var, java.util.List list) {
        e1Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) obj;
            e22.e1 e1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13339x8f3095f9.f179687p;
            arrayList.add(new or.a(i18, 1, abstractC15633xee433078.mo63659xfb85f7b0() == 2 ? 3 : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(abstractC15633xee433078.f219971p, "image/gif") ? 4 : 1, null, 8, null));
            i17 = i18;
        }
        return arrayList;
    }
}
