package ab5;

/* loaded from: classes9.dex */
public class a0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f84451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f84453f;

    public a0(android.content.Context context, java.lang.String str, boolean z17) {
        this.f84451d = context;
        this.f84452e = str;
        this.f84453f = z17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        c01.d9.e().q(1176, this);
        if (i17 == 0 && i18 == 0) {
            return;
        }
        db5.t7.m123882x26a183b(this.f84451d, com.p314xaae8f345.mm.R.C30867xcad56011.f574185hd0, 0).show();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6210x3f282433 c6210x3f282433 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6210x3f282433();
        java.lang.String str2 = this.f84452e;
        am.g00 g00Var = c6210x3f282433.f136460g;
        g00Var.f88257a = str2;
        g00Var.f88258b = !this.f84453f ? 2 : 1;
        g00Var.f88259c = 2;
        c6210x3f282433.e();
    }
}
