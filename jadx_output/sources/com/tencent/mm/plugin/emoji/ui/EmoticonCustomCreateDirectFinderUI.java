package com.tencent.mm.plugin.emoji.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/EmoticonCustomCreateDirectFinderUI;", "Lcom/tencent/mm/ui/MMBaseActivity;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class EmoticonCustomCreateDirectFinderUI extends com.tencent.mm.ui.MMBaseActivity {

    /* renamed from: e, reason: collision with root package name */
    public long f97854e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f97855f = "";

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f97856g = kotlinx.coroutines.z0.b();

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.f4 f97857h;

    /* renamed from: i, reason: collision with root package name */
    public android.content.Context f97858i;

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f97854e = getIntent().getLongExtra("feedId", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("nonceId");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f97855f = stringExtra;
        this.f97858i = this;
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(this);
        e4Var.f211780g = 2;
        e4Var.f211776c = getString(com.tencent.mm.R.string.ldg);
        com.tencent.mm.ui.widget.dialog.f4 c17 = e4Var.c();
        kotlin.jvm.internal.o.f(c17, "show(...)");
        this.f97857h = c17;
        kotlinx.coroutines.l.d(this.f97856g, null, null, new com.tencent.mm.plugin.emoji.ui.t3(this, null), 3, null);
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        kotlinx.coroutines.z0.e(this.f97856g, null, 1, null);
    }
}
