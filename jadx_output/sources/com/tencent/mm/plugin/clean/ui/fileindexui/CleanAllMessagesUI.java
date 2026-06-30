package com.tencent.mm.plugin.clean.ui.fileindexui;

@db5.a(1)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "cw1/m", "app_release"}, k = 1, mv = {1, 9, 0})
@gm0.a2
@ul5.d(0)
/* loaded from: classes3.dex */
public final class CleanAllMessagesUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f95646n = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wcdb.support.CancellationSignal f95647d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f95648e;

    /* renamed from: f, reason: collision with root package name */
    public cw1.m f95649f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.p f95650g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f95651h = jz5.h.b(cw1.o.f223185d);

    /* renamed from: i, reason: collision with root package name */
    public int f95652i;

    /* renamed from: m, reason: collision with root package name */
    public long f95653m;

    public final boolean T6() {
        return ((java.lang.Boolean) ((jz5.n) this.f95651h).getValue()).booleanValue();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488611yp;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new cw1.p(this));
        setMMTitle("");
        setActionbarColor(getColor(com.tencent.mm.R.color.aaw));
        hideActionbarLine();
        android.content.Intent intent = getIntent();
        this.f95652i = intent != null ? intent.getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0) : 0;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.r0z);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.qzg);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.l68);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.qze);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.qzf);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mbo);
        android.widget.TextView textView4 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.d2_);
        android.widget.TextView textView5 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dsg);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (T6()) {
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.o3d)).setText(getString(com.tencent.mm.R.string.f491280ni5));
        }
        com.tencent.mm.ui.bk.s0(((android.widget.TextView) findViewById(com.tencent.mm.R.id.o3c)).getPaint());
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        com.tencent.mm.ui.bk.s0(textView3.getPaint());
        cw1.k0 k0Var = new cw1.k0(this, textView2, findViewById, findViewById2, findViewById3, textView3, textView5);
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.b5i);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.jbv)).setOnClickListener(new cw1.c0(this, findViewById, findViewById2, findViewById3, textView2, findViewById4, k0Var));
        findViewById4.setOnClickListener(new cw1.g0(this, textView, textView2, findViewById4));
        textView4.setOnClickListener(new cw1.h0(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        cw1.m mVar = this.f95649f;
        if (mVar != null) {
            mVar.f223124a = null;
            mVar.f223125b = null;
            com.tencent.mm.ui.widget.dialog.z2 z2Var = mVar.f223126c;
            if (z2Var != null) {
                z2Var.B();
            }
            mVar.f223126c = null;
        }
        this.f95649f = null;
        yz5.p pVar = this.f95650g;
        if (pVar != null) {
            ((yv1.q) ((c01.d8) i95.n0.c(c01.d8.class))).getClass();
            yv1.m mVar2 = yv1.q.f466135e;
            synchronized (yv1.m.b(mVar2)) {
                yv1.m.b(mVar2).remove(pVar);
            }
            this.f95650g = null;
        }
        this.f95653m = 0L;
        java.util.concurrent.Future future = ((yv1.q) ((c01.d8) i95.n0.c(c01.d8.class))).f466138d;
        if (future != null) {
            future.cancel(true);
        }
    }
}
