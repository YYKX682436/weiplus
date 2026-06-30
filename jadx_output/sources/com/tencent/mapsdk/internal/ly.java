package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class ly extends com.tencent.mapsdk.internal.mc {

    /* renamed from: b, reason: collision with root package name */
    protected java.lang.String f50403b;

    private java.lang.String c() {
        return this.f50403b;
    }

    @Override // com.tencent.mapsdk.internal.mc, com.tencent.mapsdk.internal.lu
    public final java.io.InputStream e(java.lang.String str) {
        try {
            java.lang.String file = new java.net.URL(str).getFile();
            if (!com.tencent.mapsdk.internal.hr.a(file)) {
                this.f50403b = file.substring(file.lastIndexOf("/") + 1).replace("%20", " ");
            }
        } catch (java.net.MalformedURLException unused) {
        }
        return super.e(str);
    }
}
