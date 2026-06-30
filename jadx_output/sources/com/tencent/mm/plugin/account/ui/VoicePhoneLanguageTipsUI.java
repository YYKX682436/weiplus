package com.tencent.mm.plugin.account.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/account/ui/VoicePhoneLanguageTipsUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "plugin-account_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes.dex */
public final class VoicePhoneLanguageTipsUI extends com.tencent.mm.ui.vas.VASActivity {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f73684m = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f73685d = jz5.h.b(new com.tencent.mm.plugin.account.ui.cj(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f73686e = jz5.h.b(new com.tencent.mm.plugin.account.ui.bj(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f73687f = jz5.h.b(new com.tencent.mm.plugin.account.ui.gj(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f73688g = jz5.h.b(new com.tencent.mm.plugin.account.ui.jj(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f73689h = jz5.h.b(new com.tencent.mm.plugin.account.ui.ij(this));

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f73690i = (java.lang.String) ((java.util.Map.Entry) kz5.n0.S0(v61.h0.f433443c.entrySet()).get(v61.h0.f433441a.a())).getKey();

    public final void U6() {
        java.lang.Object value = ((jz5.n) this.f73688g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        v61.g0 g0Var = v61.h0.f433441a;
        ((android.widget.TextView) value).setText((java.lang.CharSequence) v61.h0.f433443c.get(this.f73690i));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dpk;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        super.onCreate(bundle);
        setMMTitle("");
        hideActionbarLine();
        hideActionBarOperationArea();
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        U6();
        java.lang.Object value = ((jz5.n) this.f73687f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((android.view.ViewGroup) value).setOnClickListener(new com.tencent.mm.plugin.account.ui.dj(this));
        java.lang.Object value2 = ((jz5.n) this.f73685d).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((com.tencent.mm.ui.widget.button.WeButton) value2).setOnClickListener(new com.tencent.mm.plugin.account.ui.ej(this));
        java.lang.Object value3 = ((jz5.n) this.f73686e).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        ((com.tencent.mm.ui.widget.button.WeButton) value3).setOnClickListener(new com.tencent.mm.plugin.account.ui.fj(this));
        java.lang.Object value4 = ((jz5.n) this.f73689h).getValue();
        kotlin.jvm.internal.o.f(value4, "getValue(...)");
        com.tencent.mm.ui.bk.s0(((android.widget.TextView) value4).getPaint());
    }
}
