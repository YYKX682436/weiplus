package com.tencent.mm.modelavatar;

/* loaded from: classes5.dex */
public class w implements com.tencent.mm.sdk.platformtools.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f70554a;

    public w(android.graphics.Bitmap bitmap) {
        this.f70554a = bitmap;
    }

    @Override // com.tencent.mm.sdk.platformtools.w
    public void a(java.io.OutputStream outputStream) {
        try {
            try {
                this.f70554a.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, outputStream);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AvatarStorage", e17, "", new java.lang.Object[0]);
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
