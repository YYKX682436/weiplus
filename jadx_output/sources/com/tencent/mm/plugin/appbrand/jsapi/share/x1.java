package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public final class x1 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f83304a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f83305b;

    public x1(android.content.Intent intent, android.app.Activity activity) {
        this.f83304a = intent;
        this.f83305b = activity;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        android.content.Intent intent = this.f83304a;
        intent.putExtra("custom_send_text", str);
        nf.g.a(this.f83305b).g(com.tencent.mm.plugin.appbrand.jsapi.share.b2.f83117a, z17 ? -1 : 0, intent);
    }
}
