package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public final class y2 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f83327a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f83328b;

    public y2(android.content.Intent intent, android.app.Activity activity) {
        this.f83327a = intent;
        this.f83328b = activity;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        android.content.Intent intent = this.f83327a;
        intent.putExtra("custom_send_text", str);
        nf.g.a(this.f83328b).g(com.tencent.mm.plugin.appbrand.jsapi.share.d3.f83128a, z17 ? -1 : 0, intent);
    }
}
