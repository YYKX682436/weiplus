package com.p314xaae8f345.mm.p943x351df9c2;

/* loaded from: classes5.dex */
public class v implements com.p314xaae8f345.mm.sdk.p2603x2137b148.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f152086a;

    public v(com.p314xaae8f345.mm.p943x351df9c2.z zVar, android.graphics.Bitmap bitmap) {
        this.f152086a = bitmap;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.w
    public void a(java.io.OutputStream outputStream) {
        try {
            try {
                this.f152086a.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, outputStream);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AvatarStorage", e17, "", new java.lang.Object[0]);
            }
            try {
                outputStream.close();
            } catch (java.lang.Exception unused) {
            }
        } catch (java.lang.Throwable th6) {
            try {
                outputStream.close();
            } catch (java.lang.Exception unused2) {
            }
            throw th6;
        }
    }
}
