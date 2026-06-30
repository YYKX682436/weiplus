package com.p314xaae8f345.mm.p916x4268f0dc.p929x364492;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/mj_template/test/TemplateTestUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.mj_template.test.TemplateTestUI */
/* loaded from: classes.dex */
public final class ActivityC11028x640d33e0 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f151889e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f151890d = jz5.h.b(new qz0.a(this));

    public final android.widget.TextView T6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f151890d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.TextView) mo141623x754a37bb;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dhm;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (intent == null) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.i2 i2Var = p3325xe03a0797.p3326xc267989b.i2.f392010d;
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("CropImage_OutputPath_List");
            if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
                return;
            }
            T6().append("select local image from gallery\n\n");
            for (java.lang.String str : stringArrayListExtra) {
                T6().append(str + '\n');
            }
            p3325xe03a0797.p3326xc267989b.l.d(i2Var, null, null, new qz0.f(new ny0.f(stringArrayListExtra), this, null), 3, null);
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("CropImage_OutputPath_List");
        if (stringArrayListExtra2 == null || stringArrayListExtra2.isEmpty()) {
            return;
        }
        T6().append("select local image from gallery\n\n");
        for (java.lang.String str2 : stringArrayListExtra2) {
            T6().append(str2 + '\n');
        }
        java.lang.Object X = kz5.n0.X(stringArrayListExtra2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(X, "first(...)");
        p3325xe03a0797.p3326xc267989b.l.d(i2Var, null, null, new qz0.c(new my0.h((java.lang.String) X, null, my0.f.f414191e), this, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        findViewById(com.p314xaae8f345.mm.R.id.r0s).setOnClickListener(qz0.g.f449357d);
        findViewById(com.p314xaae8f345.mm.R.id.q4r).setOnClickListener(new qz0.h(this));
        findViewById(com.p314xaae8f345.mm.R.id.r0x).setOnClickListener(new qz0.i(this));
    }
}
