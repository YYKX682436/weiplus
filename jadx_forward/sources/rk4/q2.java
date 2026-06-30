package rk4;

/* loaded from: classes.dex */
public final class q2 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f478458a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25175x712785bf f478459d;

    public q2(yz5.l lVar, com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25175x712785bf c25175x712785bf) {
        this.f478458a = lVar;
        this.f478459d = c25175x712785bf;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        android.os.Bundle extras;
        java.lang.String string = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString("Select_Conv_User");
        yz5.l lVar = this.f478458a;
        if (i18 == -1) {
            if (!(string == null || string.length() == 0)) {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r26.n0.f0(string, new java.lang.String[]{","}, false, 0, 6, null))));
                return;
            }
        }
        java.lang.Object obj = kz5.p0.f395529d;
        if (i18 != 0) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(obj)));
            return;
        }
        p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        java.util.List<java.lang.String> m93090x65cb4dcb = this.f478459d.m93090x65cb4dcb();
        if (m93090x65cb4dcb != null) {
            obj = kz5.n0.V(m93090x65cb4dcb);
        }
        lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(obj)));
    }
}
