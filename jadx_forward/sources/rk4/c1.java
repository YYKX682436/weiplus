package rk4;

/* loaded from: classes8.dex */
public final class c1 implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f478107a;

    public c1(yz5.l lVar) {
        this.f478107a = lVar;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FlutterTingInteractPlugin", "buyWCCoin onFailed, errorType = " + i17 + ", errorCode = " + i18 + ", errorMsg = " + str);
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f478107a.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24950x48e49199(-1L, "buyWCCoin fail!", new byte[0]))));
    }

    @Override // js4.o
    /* renamed from: onSuccess */
    public void mo14245xe05b4124(java.lang.Object obj) {
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f478107a.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24950x48e49199(0L, "", new byte[0]))));
    }
}
