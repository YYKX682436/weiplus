package com.p3263xee53b379;

/* loaded from: classes7.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f302247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f302248e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f302249f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f302250g;

    public j(java.lang.String str, java.lang.String str2, android.content.Context context, java.lang.String str3) {
        this.f302247d = str;
        this.f302248e = str2;
        this.f302249f = context;
        this.f302250g = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f302248e;
        java.lang.String str2 = this.f302247d;
        android.content.Context context = this.f302249f;
        try {
            java.lang.String format = java.lang.String.format(str2, qy5.b.g(str));
            "merUrl: ".concat(java.lang.String.valueOf(format));
            py5.c cVar = new py5.c(format, (byte) 0);
            java.lang.String b17 = qy5.b.b(context);
            py5.b bVar = new py5.b(cVar, b17);
            int a17 = android.text.TextUtils.isEmpty(str) ? 22 : bVar.a();
            java.lang.String str3 = this.f302250g;
            if (a17 == 0) {
                com.p3263xee53b379.a.b(context, bVar.f440630a, str3);
                return;
            }
            if (a17 == 22) {
                java.lang.String format2 = java.lang.String.format(str2, "conf_mode_02");
                "baseUrl: ".concat(java.lang.String.valueOf(format2));
                cVar.f440635b = format2;
                py5.b bVar2 = new py5.b(cVar, b17);
                if (bVar2.a() == 0) {
                    com.p3263xee53b379.a.b(context, bVar2.f440630a, str3);
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
