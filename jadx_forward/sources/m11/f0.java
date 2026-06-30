package m11;

/* loaded from: classes12.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f404219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404220e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f404221f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f404222g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f404223h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404224i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m11.l0 f404225m;

    public f0(m11.l0 l0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, float f17, boolean z17, int i17, java.lang.String str2) {
        this.f404225m = l0Var;
        this.f404219d = f9Var;
        this.f404220e = str;
        this.f404221f = f17;
        this.f404222g = z17;
        this.f404223h = i17;
        this.f404224i = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f404225m.s0(this.f404219d, this.f404220e, true, this.f404221f, true, false, this.f404222g, this.f404223h);
        if (m11.l0.f404268v == -1) {
            boolean equals = "1".equals(j62.e.g().a("clicfg_c2c_image_checkrefresh_check_diff", "1", false, true));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgInfoStorage", "checkrefreshCheckDiff, check = " + equals);
            m11.l0.f404268v = equals ? 1 : 0;
        }
        this.f404225m.f404277n.d(new m11.e0(this));
    }

    /* renamed from: toString */
    public java.lang.String m146620x9616526c() {
        return super.toString() + "|loadImageBackground";
    }
}
