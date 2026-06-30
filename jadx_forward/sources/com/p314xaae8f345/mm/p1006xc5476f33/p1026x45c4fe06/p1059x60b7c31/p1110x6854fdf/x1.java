package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public final class x1 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f164837a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f164838b;

    public x1(android.content.Intent intent, android.app.Activity activity) {
        this.f164837a = intent;
        this.f164838b = activity;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        android.content.Intent intent = this.f164837a;
        intent.putExtra("custom_send_text", str);
        nf.g.a(this.f164838b).g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.b2.f164650a, z17 ? -1 : 0, intent);
    }
}
