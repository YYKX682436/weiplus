package p61;

/* loaded from: classes14.dex */
public class f5 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f433784d;

    /* renamed from: n, reason: collision with root package name */
    public final p61.d5 f433791n;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f433785e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f433786f = null;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f433788h = "";

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2641xabe4e85a.C21463x46cf9db f433787g = null;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f433789i = null;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f433790m = "";

    public f5(android.content.Context context, p61.d5 d5Var) {
        this.f433784d = context;
        this.f433791n = d5Var;
    }

    public void a() {
        android.view.View inflate = android.view.View.inflate(this.f433784d, com.p314xaae8f345.mm.R.C30864xbddafb2a.cke, null);
        this.f433785e = inflate;
        android.widget.EditText editText = (android.widget.EditText) inflate.findViewById(com.p314xaae8f345.mm.R.id.mmo);
        editText.setHint(com.p314xaae8f345.mm.R.C30867xcad56011.aii);
        p61.w4 w4Var = new p61.w4(this, editText);
        p61.x4 x4Var = new p61.x4(this);
        android.content.Context context = this.f433784d;
        db5.e1.x(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aid), null, this.f433785e, w4Var, x4Var);
    }

    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.C11371xe63d27f c11371xe63d27f;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5728x615a84ab c5728x615a84ab;
        java.lang.Runnable runnable;
        gm0.j1.d().q(384, this);
        p61.d5 d5Var = this.f433791n;
        if (d5Var == null || (c5728x615a84ab = (c11371xe63d27f = (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.C11371xe63d27f) d5Var).f154624d) == null || (runnable = c5728x615a84ab.f136050g.f89087b) == null) {
            return;
        }
        c5728x615a84ab.f136051h.f89161a = false;
        runnable.run();
        c11371xe63d27f.f154624d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0088 A[RETURN] */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r17, int r18, java.lang.String r19, com.p314xaae8f345.mm.p944x882e457a.m1 r20) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p61.f5.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
