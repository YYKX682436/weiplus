package rk4;

/* loaded from: classes8.dex */
public final class e1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f478158d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(yz5.l lVar) {
        super(1);
        this.f478158d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        pr4.a it = (pr4.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("consumeWCCoin onFailed, errorType: ");
        pr4.j jVar = it.f439518a;
        sb6.append(jVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FlutterTingInteractPlugin", sb6.toString());
        int ordinal = jVar.ordinal();
        yz5.l lVar = this.f478158d;
        if (ordinal == 1) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24950x48e49199(99993, "consumeWCCoin onFailed, no money!", new byte[0]))));
        } else if (ordinal != 2) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24950x48e49199(99992, "consumeWCCoin onFailed, defaultError!", new byte[0]))));
        } else {
            p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24950x48e49199(99994, "consumeWCCoin onFailed, intercept!", new byte[0]))));
        }
        return jz5.f0.f384359a;
    }
}
