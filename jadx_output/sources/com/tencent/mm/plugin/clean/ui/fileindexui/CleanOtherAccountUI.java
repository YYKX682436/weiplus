package com.tencent.mm.plugin.clean.ui.fileindexui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@gm0.a2
@ul5.d(0)
/* loaded from: classes3.dex */
public final class CleanOtherAccountUI extends com.tencent.mm.ui.vas.VASActivity {

    /* renamed from: d, reason: collision with root package name */
    public boolean f95794d;

    /* renamed from: e, reason: collision with root package name */
    public int f95795e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f95796f = jz5.h.b(cw1.t6.f223341d);

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.wcdb.support.CancellationSignal f95797g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f95798h;

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        if (!this.f95794d) {
            super.finish();
            return;
        }
        ((com.tencent.mm.app.y7) f14.g.b()).d(new android.content.Intent().putExtra("Intro_Need_Clear_Top ", true), getContext());
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dmc;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f95794d = false;
        boolean booleanExtra = getIntent().getBooleanExtra("cleanModuleFiles", false);
        boolean z17 = booleanExtra && com.tencent.xweb.WebView.f220193q;
        yv1.g1 b17 = yv1.g1.f466040p.b(getIntent().getIntExtra("session", -1));
        long j17 = b17.f466047f;
        int i17 = b17.f466048g;
        long j18 = (booleanExtra ? b17.f466049h : 0L) + j17;
        int i18 = i17 + (booleanExtra ? b17.f466050i : 0);
        this.f95795e = getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        setBackBtn(new cw1.u6(this));
        setMMTitle("");
        setActionbarColor(getColor(com.tencent.mm.R.color.aaw));
        hideActionbarLine();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.r0z);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.qzg);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.l68);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.qze);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.qzf);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mbo);
        android.widget.TextView textView4 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.m9e);
        android.widget.TextView textView5 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.d2_);
        android.widget.TextView textView6 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.s1x);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI", "initUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI", "initUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI", "initUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI", "initUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI", "initUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI", "initUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String a17 = fp.n0.a(j18);
        textView4.setText(getString(com.tencent.mm.R.string.dxx, a17));
        com.tencent.mm.ui.bk.s0(((android.widget.TextView) findViewById(com.tencent.mm.R.id.o3c)).getPaint());
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        com.tencent.mm.ui.bk.s0(textView3.getPaint());
        int i19 = (((i18 / 5) + com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL) - 1) / com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.o7z)).setText(getString(com.tencent.mm.R.string.f490914ey2, java.lang.Integer.valueOf(i19)));
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.s8_);
        int i27 = z17 ? 0 : 8;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(i27));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI", "initUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI", "initUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        cw1.j7 j7Var = new cw1.j7(this, booleanExtra, b17, j18, findViewById, findViewById2, findViewById3, textView3, textView4, z17, textView5, textView6, i18, textView, textView2);
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.b5i);
        android.widget.TextView textView7 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jbv);
        textView7.setText(getString(com.tencent.mm.R.string.dxp, a17));
        textView7.setOnClickListener(new cw1.a7(this, b17, findViewById, findViewById2, findViewById3, textView, textView2, i19, findViewById5, j7Var));
        findViewById5.setOnClickListener(new cw1.e7(this, textView, textView2, findViewById5));
        textView5.setOnClickListener(new cw1.f7(this));
    }
}
