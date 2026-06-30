package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1836x2efde3.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/demo/ui/MagicBrushDemoActivity;", "Lcom/tencent/mm/ui/MMActivity;", "Landroid/view/View;", "view", "Ljz5/f0;", "onClick", "<init>", "()V", "mb-samples_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.magicbrush.demo.ui.MagicBrushDemoActivity */
/* loaded from: classes7.dex */
public final class ActivityC16431x30fdd85f extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public wc3.b f229452d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f229453e;

    public final void T6(wc3.b bVar) {
        wc3.b bVar2 = this.f229452d;
        if (bVar2 != null) {
            android.view.ViewGroup viewGroup = bVar2.f526041f;
            if (viewGroup == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("containerView");
                throw null;
            }
            viewGroup.removeAllViews();
            jc3.j0 j0Var = bVar2.f526040e;
            if (j0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("magicBrush");
                throw null;
            }
            ((rc3.w0) j0Var).m162151x5cd39ffa();
        }
        this.f229452d = bVar;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bvg;
    }

    /* renamed from: onClick */
    public final void m66316xaf6b9ae9(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        int id6 = view.getId();
        if (id6 == com.p314xaae8f345.mm.R.id.b5x) {
            T6(new wc3.b());
            wc3.b bVar = this.f229452d;
            if (bVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("magicBrushDemoLogic");
                throw null;
            }
            android.widget.FrameLayout frameLayout = this.f229453e;
            if (frameLayout == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("containerView");
                throw null;
            }
            bVar.f526041f = frameLayout;
            wc3.b bVar2 = this.f229452d;
            if (bVar2 != null) {
                bVar2.C0(this);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("magicBrushDemoLogic");
                throw null;
            }
        }
        if (id6 == com.p314xaae8f345.mm.R.id.lcu) {
            T6(new wc3.d());
            wc3.b bVar3 = this.f229452d;
            if (bVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("magicBrushDemoLogic");
                throw null;
            }
            android.widget.FrameLayout frameLayout2 = this.f229453e;
            if (frameLayout2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("containerView");
                throw null;
            }
            bVar3.f526041f = frameLayout2;
            if (this.f229452d == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("magicBrushDemoLogic");
                throw null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushDemoPublicService", "MagicBrushDemoPublicService start");
            wc3.b bVar4 = this.f229452d;
            if (bVar4 != null) {
                bVar4.C0(this);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("magicBrushDemoLogic");
                throw null;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("MagicBrush2.0 Demo");
        mo54448x9c8c0d33(new zc3.d(this));
        ((android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.ctq)).setBackgroundColor(-1);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f565580cu0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f229453e = (android.widget.FrameLayout) findViewById;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        wc3.b bVar = this.f229452d;
        if (bVar != null) {
            bVar.mo173457x5cd39ffa();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("magicBrushDemoLogic");
            throw null;
        }
    }
}
