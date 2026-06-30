package rk4;

/* loaded from: classes.dex */
public final class s2 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f478496d;

    public s2(yz5.l lVar) {
        this.f478496d = lVar;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p943x351df9c2.s0 Ni;
        com.p314xaae8f345.mm.p943x351df9c2.r0 n07;
        android.os.Bundle extras;
        java.lang.String str = null;
        java.lang.String string = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString("Select_Conv_User");
        yz5.l lVar = this.f478496d;
        if (i18 == -1) {
            if (!(string == null || string.length() == 0)) {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                java.lang.String e17 = c01.a2.e(string);
                if (((kv.a0) i95.n0.c(kv.a0.class)) != null && (Ni = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni()) != null && (n07 = Ni.n0(string)) != null) {
                    str = n07.d();
                }
                lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24953x8ceac238(e17, str, string))));
                return;
            }
        }
        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24953x8ceac238(null, null, null, 7, null))));
    }
}
