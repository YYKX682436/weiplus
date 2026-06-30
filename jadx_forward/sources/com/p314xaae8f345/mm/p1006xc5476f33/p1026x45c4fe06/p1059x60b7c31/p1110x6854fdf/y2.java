package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public final class y2 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f164860a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f164861b;

    public y2(android.content.Intent intent, android.app.Activity activity) {
        this.f164860a = intent;
        this.f164861b = activity;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        android.content.Intent intent = this.f164860a;
        intent.putExtra("custom_send_text", str);
        nf.g.a(this.f164861b).g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.d3.f164661a, z17 ? -1 : 0, intent);
    }
}
