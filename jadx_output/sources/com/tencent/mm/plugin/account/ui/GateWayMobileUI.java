package com.tencent.mm.plugin.account.ui;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/account/ui/GateWayMobileUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "com/tencent/mm/plugin/account/ui/r1", "plugin-account_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes4.dex */
public final class GateWayMobileUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: p, reason: collision with root package name */
    public static final com.tencent.mm.plugin.account.ui.r1 f73277p = new com.tencent.mm.plugin.account.ui.r1(null);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f73278d = jz5.h.b(new com.tencent.mm.plugin.account.ui.u1(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f73279e = jz5.h.b(new com.tencent.mm.plugin.account.ui.y1(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f73280f = jz5.h.b(new com.tencent.mm.plugin.account.ui.z1(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f73281g = jz5.h.b(new com.tencent.mm.plugin.account.ui.t1(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f73282h = jz5.h.b(new com.tencent.mm.plugin.account.ui.g2(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f73283i = jz5.h.b(new com.tencent.mm.plugin.account.ui.s1(this));

    /* renamed from: m, reason: collision with root package name */
    public boolean f73284m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f73285n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.z2 f73286o;

    public final java.util.List T6() {
        int intValue = ((java.lang.Number) ((jz5.n) this.f73283i).getValue()).intValue();
        java.lang.String string = intValue != 1 ? intValue != 2 ? intValue != 3 ? "" : getString(com.tencent.mm.R.string.mso) : getString(com.tencent.mm.R.string.msp) : getString(com.tencent.mm.R.string.msq);
        kotlin.jvm.internal.o.d(string);
        java.lang.String str = (java.lang.String) ((jz5.n) this.f73279e).getValue();
        if (str != null) {
            if (str.length() > 0) {
                string = str;
            }
        }
        return kz5.c0.k(string);
    }

    public final void U6() {
        kotlinx.coroutines.l.d(v65.m.b(this), kotlinx.coroutines.q1.f310568a, null, new com.tencent.mm.plugin.account.ui.i2(this, com.tencent.mm.ui.widget.dialog.u3.f(this, getString(com.tencent.mm.R.string.ggc), false, 0, null), null), 2, null);
    }

    public final void V6(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(this, com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.class);
        intent.putExtra("KForceMobileNum", str);
        intent.putExtra("KForceMobileMsgId", (java.lang.String) ((jz5.n) this.f73282h).getValue());
        intent.putExtras(getIntent());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/GateWayMobileUI", "toReg", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/account/ui/GateWayMobileUI", "toReg", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dup;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.rqf);
        textView.setText(getString(com.tencent.mm.R.string.msv, (java.lang.String) ((jz5.n) this.f73281g).getValue()));
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.rqd)).setOnClickListener(new com.tencent.mm.plugin.account.ui.v1(this));
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.rqe)).setOnClickListener(new com.tencent.mm.plugin.account.ui.w1(this));
        setBackBtn(new com.tencent.mm.plugin.account.ui.x1(this), com.tencent.mm.R.raw.actionbar_icon_close_black);
        setMMTitle("");
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        hideActionbarLine();
        if (fp.h.c(23)) {
            getWindow().setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
            updataStatusBarIcon(com.tencent.mm.ui.bk.C());
        }
    }
}
