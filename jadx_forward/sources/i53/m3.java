package i53;

/* loaded from: classes12.dex */
public class m3 implements i53.i4 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f370190f = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.m.b(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.l.ONE_WEEK) + "video/";

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f370191a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f370192b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f370193c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1740x373aa5.C15868x12159658 f370194d;

    /* renamed from: e, reason: collision with root package name */
    public i53.l3 f370195e;

    public m3(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f370191a = abstractActivityC21394xb3d2c0cf;
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameVideoDownloadPerform", "cancel video download!");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f370191a;
        abstractActivityC21394xb3d2c0cf.setResult(0);
        abstractActivityC21394xb3d2c0cf.finish();
    }

    public final void b(java.lang.String str) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        dn.o oVar = new dn.o();
        oVar.f323318d = "task_GameVideoDownloadUI";
        oVar.f69601xaca5bdda = this.f370192b;
        oVar.M1 = str;
        oVar.H1 = 0;
        oVar.Z = 3;
        oVar.f323342y0 = 4;
        com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.vfs.w6.r(this.f370193c));
        oVar.f69595x6d25b0d9 = this.f370193c;
        oVar.f323348c2 = new i53.k3(this, currentTimeMillis, str);
        i53.l3 l3Var = new i53.l3(this, oVar);
        this.f370195e = l3Var;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(l3Var, 500L);
    }
}
