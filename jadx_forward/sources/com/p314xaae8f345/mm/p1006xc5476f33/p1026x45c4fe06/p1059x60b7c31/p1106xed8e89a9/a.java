package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9;

/* loaded from: classes.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f164305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164306e;

    public a(android.content.Context context, java.lang.String str) {
        this.f164305d = context;
        this.f164306e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f164305d;
        android.widget.Toast m125854x26a183b = dp.a.m125854x26a183b(context, "", 3000);
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.d0k, null);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568890oe3)).setText(this.f164306e);
        m125854x26a183b.setGravity(17, 0, 0);
        m125854x26a183b.setView(inflate);
        m125854x26a183b.show();
    }
}
