package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class tx implements com.tencent.mapsdk.internal.oq {

    /* renamed from: a, reason: collision with root package name */
    private android.content.Context f52258a;

    /* renamed from: b, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.mz f52259b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f52260c;

    public tx(android.content.Context context, java.lang.String str) {
        if (context == null) {
            this.f52259b = null;
            return;
        }
        android.content.Context applicationContext = context.getApplicationContext();
        this.f52258a = applicationContext;
        this.f52259b = com.tencent.mapsdk.internal.mz.a(applicationContext, (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null);
        this.f52260c = str;
    }

    @Override // com.tencent.mapsdk.internal.oq
    public final java.lang.String a() {
        com.tencent.mapsdk.internal.mz mzVar = this.f52259b;
        if (mzVar != null) {
            return mzVar.d();
        }
        return null;
    }

    @Override // com.tencent.mapsdk.internal.oq
    public final java.lang.String b() {
        com.tencent.mapsdk.internal.mz mzVar = this.f52259b;
        if (mzVar == null) {
            return null;
        }
        com.tencent.mapsdk.internal.kt.a(mzVar.f50471b);
        return mzVar.f50471b;
    }

    @Override // com.tencent.mapsdk.internal.oq
    public final java.lang.String c() {
        com.tencent.mapsdk.internal.mz mzVar = this.f52259b;
        if (mzVar != null) {
            return mzVar.a(this.f52260c);
        }
        return null;
    }

    @Override // com.tencent.mapsdk.internal.oq
    public final java.lang.String d() {
        com.tencent.mapsdk.internal.mz mzVar = this.f52259b;
        if (mzVar != null) {
            return mzVar.c(this.f52260c);
        }
        return null;
    }

    @Override // com.tencent.mapsdk.internal.oq
    public final java.lang.String e() {
        com.tencent.mapsdk.internal.mz mzVar = this.f52259b;
        if (mzVar != null) {
            return mzVar.b(this.f52260c);
        }
        return null;
    }

    @Override // com.tencent.mapsdk.internal.oq
    public final java.lang.String f() {
        return null;
    }

    @Override // com.tencent.mapsdk.internal.oq
    public final java.lang.String g() {
        return null;
    }

    @Override // com.tencent.mapsdk.internal.oq
    public final java.lang.String h() {
        return null;
    }

    @Override // com.tencent.mapsdk.internal.oq
    public final java.lang.String i() {
        com.tencent.mapsdk.internal.mz mzVar = this.f52259b;
        if (mzVar == null) {
            return null;
        }
        com.tencent.mapsdk.internal.kt.a(mzVar.f50472c);
        return mzVar.f50472c;
    }

    @Override // com.tencent.mapsdk.internal.oq
    public final java.lang.String j() {
        return null;
    }
}
