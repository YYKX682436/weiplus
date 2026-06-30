package ez;

/* loaded from: classes4.dex */
public final class e1 implements en1.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ez.f1 f339256d;

    public e1(ez.f1 f1Var) {
        this.f339256d = f1Var;
    }

    @Override // en1.j
    /* renamed from: onAuthResponse */
    public void mo8828x48bdb988(o45.ug ugVar, o45.vg vgVar, boolean z17) {
        int i17 = z17 ? 1 : 7;
        long t17 = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_BYP_INFO_KEY_LONG_SYNC, 0L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMTypingFeatureService", "onAuthResponse autoAuth=" + z17 + " docgi syncKey=" + t17);
        ez.f1.wi(this.f339256d, t17, i17);
    }

    @Override // en1.j
    /* renamed from: onRegResponse */
    public void mo8829x6279e596(o45.ci ciVar, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18) {
    }
}
