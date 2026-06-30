package com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheProgressUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "Lyv1/b0;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@gm0.a2
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheProgressUI */
/* loaded from: classes12.dex */
public final class ActivityC13109x1b5b413a extends com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 implements yv1.b0 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f177206q = 0;

    /* renamed from: d, reason: collision with root package name */
    public final yv1.b1 f177207d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f177208e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ProgressBar f177209f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f177210g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f177211h;

    /* renamed from: i, reason: collision with root package name */
    public int f177212i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f177213m;

    /* renamed from: n, reason: collision with root package name */
    public long f177214n;

    /* renamed from: o, reason: collision with root package name */
    public long f177215o;

    /* renamed from: p, reason: collision with root package name */
    public int f177216p;

    public ActivityC13109x1b5b413a() {
        i95.m c17 = i95.n0.c(c01.f8.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.clean.CleanService");
        this.f177207d = (yv1.b1) c17;
        this.f177208e = jz5.h.b(cw1.m1.f304669d);
        this.f177212i = -1;
        this.f177213m = "";
    }

    public final boolean U6() {
        return ((java.lang.Boolean) ((jz5.n) this.f177208e).mo141623x754a37bb()).booleanValue();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        android.view.View view = this.f177211h;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
            throw null;
        }
        if (view.getVisibility() == 0) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[6];
            lVarArr[0] = new jz5.l("storage_ui_version", java.lang.Integer.valueOf(U6() ? 2 : 1));
            lVarArr[1] = new jz5.l("storage_enter_scene", java.lang.Integer.valueOf(this.f177216p));
            yv1.g1 a17 = yv1.g1.f547573p.a(this.f177212i);
            lVarArr[2] = new jz5.l("storage_manage_sessionid", a17 != null ? a17.f547576b : null);
            lVarArr[3] = new jz5.l("cache_remove_sessionid", this.f177213m);
            lVarArr[4] = new jz5.l("cache_removed_size", java.lang.Long.valueOf(this.f177214n));
            lVarArr[5] = new jz5.l("cache_remove_size", java.lang.Long.valueOf(this.f177215o));
            ((cy1.a) rVar).Hj("cache_remove_back", "view_clk", kz5.c1.k(lVarArr), 32903);
        }
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e2l;
    }

    @Override // yv1.b0
    public void j4(boolean z17, boolean z18, long j17, long j18) {
        ((ku5.t0) ku5.t0.f394148d).B(new cw1.r1(this, j17, j18, z17, z18));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01da  */
    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r38) {
        /*
            Method dump skipped, instructions count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13109x1b5b413a.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.f177207d.aj(this);
        super.onDestroy();
    }
}
