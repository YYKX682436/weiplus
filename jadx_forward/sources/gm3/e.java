package gm3;

/* loaded from: classes4.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final gm3.e f355085d = new gm3.e();

    public e() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.ArrayList it = (java.util.ArrayList) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        kz5.g0.s(it);
        if (it.size() == 1) {
            gm3.c cVar = (gm3.c) kz5.n0.Z(it);
            if (cVar != null) {
                cVar.f355083n = com.p314xaae8f345.mm.R.C30861xcebc809e.ard;
            }
        } else if (it.size() > 1) {
            int i17 = 0;
            for (java.lang.Object obj2 : it) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                gm3.c cVar2 = (gm3.c) obj2;
                if (i17 == 0) {
                    cVar2.f355083n = com.p314xaae8f345.mm.R.C30861xcebc809e.arb;
                } else if (i17 == it.size() - 1) {
                    cVar2.f355083n = com.p314xaae8f345.mm.R.C30861xcebc809e.ara;
                } else {
                    cVar2.f355083n = com.p314xaae8f345.mm.R.C30861xcebc809e.arc;
                }
                i17 = i18;
            }
        }
        return jz5.f0.f384359a;
    }
}
