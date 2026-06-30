package com.tencent.mm.plugin.eggspring.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/eggspring/ui/SpringCardActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-eggspring_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SpringCardActivity extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.gif.MMAnimateView f97431d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.gif.MMAnimateView f97432e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.app.t2 f97433f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f97434g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f97435h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f97436i = new f12.b(this);

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f97435h;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cve;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1001) {
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(2097280);
        new android.os.Handler(getMainLooper());
        setMMTitle("");
        setBackBtn(new f12.c(this), com.tencent.mm.R.raw.icons_outlined_close);
        int color = getContext().getResources().getColor(com.tencent.mm.R.color.a6x);
        setActionbarColor(color);
        if (com.tencent.mm.ui.uk.g(color)) {
            updateBackBtn(com.tencent.mm.ui.uk.e(this, com.tencent.mm.R.raw.icons_outlined_close, -1));
        } else {
            updateBackBtn(com.tencent.mm.ui.uk.e(this, com.tencent.mm.R.raw.icons_outlined_close, -16777216));
        }
        hideActionbarLine();
        getWindow().getDecorView().setSystemUiVisibility(2050);
        supportLightStatusBar();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.m7o);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ixx);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f97431d = (com.tencent.mm.plugin.gif.MMAnimateView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.ixy);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f97432e = (com.tencent.mm.plugin.gif.MMAnimateView) findViewById3;
        f12.a aVar = new f12.a(this);
        com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView = this.f97431d;
        if (mMAnimateView == null) {
            kotlin.jvm.internal.o.o("luckyBagLoadingImg");
            throw null;
        }
        mMAnimateView.setOnClickListener(aVar);
        com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView2 = this.f97432e;
        if (mMAnimateView2 == null) {
            kotlin.jvm.internal.o.o("luckyBagLoop");
            throw null;
        }
        mMAnimateView2.setOnClickListener(aVar);
        f12.d dVar = new f12.d();
        this.f97433f = dVar;
        com.tencent.mm.app.w.INSTANCE.a(dVar);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.SpringCardActivity", "onDestroy: ");
        com.tencent.mm.app.w wVar = com.tencent.mm.app.w.INSTANCE;
        com.tencent.mm.app.t2 t2Var = this.f97433f;
        if (t2Var != null) {
            wVar.p(t2Var);
        } else {
            kotlin.jvm.internal.o.o("appForegroundLis");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.SpringCardActivity", "onResume: ");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.tencent.mars.xlog.Log.i("MicroMsg.SpringCardActivity", "onStop: " + this.f97434g);
        if (this.f97434g) {
            finish();
        }
    }
}
