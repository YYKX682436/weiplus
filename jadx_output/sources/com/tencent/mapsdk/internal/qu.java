package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class qu {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.mv f51068a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f51069b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.bd f51070c;

    public qu(android.content.Context context, com.tencent.mapsdk.internal.bd bdVar, java.lang.String str) {
        this.f51070c = bdVar;
        if (str == null) {
            this.f51068a = com.tencent.mapsdk.internal.my.a(context);
        } else {
            this.f51068a = com.tencent.mapsdk.internal.mx.a(context, str);
        }
        if (!a()) {
            bdVar.i().c(false);
        } else {
            this.f51069b = this.f51068a.c(com.tencent.mapsdk.internal.er.E);
            bdVar.i().c(this.f51069b);
        }
    }

    public static boolean a() {
        java.lang.String[] strArr = android.os.Build.SUPPORTED_64_BIT_ABIS;
        return (strArr == null || strArr.length == 0) ? false : true;
    }

    private void b() {
        if (!a()) {
            this.f51070c.i().c(false);
        } else {
            this.f51069b = this.f51068a.c(com.tencent.mapsdk.internal.er.E);
            this.f51070c.i().c(this.f51069b);
        }
    }

    private void a(boolean z17) {
        if (a()) {
            this.f51069b = z17;
            this.f51068a.a(com.tencent.mapsdk.internal.er.E, z17);
            this.f51070c.i().c(this.f51069b);
            return;
        }
        this.f51070c.i().c(false);
    }
}
