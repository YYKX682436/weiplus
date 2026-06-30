package com.tencent.mm.plugin.appbrand.jsapi.profile;

/* loaded from: classes.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f82772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82773e;

    public a(android.content.Context context, java.lang.String str) {
        this.f82772d = context;
        this.f82773e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f82772d;
        android.widget.Toast makeText = dp.a.makeText(context, "", 3000);
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.d0k, null);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487357oe3)).setText(this.f82773e);
        makeText.setGravity(17, 0, 0);
        makeText.setView(inflate);
        makeText.show();
    }
}
