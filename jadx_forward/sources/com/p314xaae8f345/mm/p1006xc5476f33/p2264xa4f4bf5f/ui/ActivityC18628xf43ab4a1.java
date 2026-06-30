package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

@db5.a(m123858x6ac9171 = 35)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusCommentTransparentActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "com/tencent/mm/plugin/textstatus/ui/i5", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusCommentTransparentActivity */
/* loaded from: classes10.dex */
public final class ActivityC18628xf43ab4a1 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.i5 f255034d = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.i5(null);

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        setResult(-1);
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.j5(this), 400L);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).oj(this);
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.k5(this), 400L);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        super.onCreate(bundle);
        mo64405x4dab7448(0);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        vj5.o.e(getWindow());
        mo78578x8b18f126(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo78529xe76c1b79();
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.o();
        }
        getWindow().setSoftInputMode(48);
        ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Zi(this, new o04.e(pj4.p0.class, 9, true));
        pj4.p0 p0Var = (pj4.p0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(this, 9, pj4.p0.class);
        if (p0Var != null) {
            p0Var.f436775m = getIntent().getIntExtra("KEY_CURRENT_SCENE", 0);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_USER_NAME");
        java.lang.String str = stringExtra == null ? "" : stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("KEY_STATUS_ID");
        java.lang.String str2 = stringExtra2 == null ? "" : stringExtra2;
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo77785xc570fb34(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.m5(getIntent().getIntExtra("KEY_ACTION", 0), this, str, str2, getIntent().getBooleanExtra("KEY_IS_EXPIRED", false), getIntent().getLongExtra("KEY_REF_COMMENT_ID", 0L)));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, al5.f3
    /* renamed from: onSwipeBack */
    public void mo2295x59cfc822() {
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).oj(this);
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.n5(this), 400L);
    }
}
