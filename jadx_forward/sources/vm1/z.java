package vm1;

/* loaded from: classes8.dex */
public final class z implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f519613a;

    public z(yz5.l lVar) {
        this.f519613a = lVar;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FlutterBizAudioInteractPlugin", "getWeCoinBalance onFailed, errorType: " + i17 + ", errorCode: " + i18 + ", msg: " + str);
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f519613a.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24950x48e49199(-1L, "getWCCoinBalance fail!", new byte[0]))));
    }

    @Override // js4.o
    /* renamed from: onSuccess */
    public void mo14245xe05b4124(java.lang.Object obj) {
        r45.fs3 data = (r45.fs3) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        bw5.jp0 jp0Var = new bw5.jp0();
        jp0Var.f110611d = data.f456118d;
        jp0Var.f110612e[1] = true;
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f519613a.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24950x48e49199(0L, "", jp0Var.mo14344x5f01b1f6()))));
    }
}
