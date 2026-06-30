package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class z2 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f253195a;

    public z2(android.graphics.Bitmap bitmap) {
        this.f253195a = bitmap;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.w
    public void a(java.io.OutputStream outputStream) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.FlipView$4");
        try {
            try {
                this.f253195a.compress(android.graphics.Bitmap.CompressFormat.PNG, 80, outputStream);
            } catch (java.lang.Throwable th6) {
                try {
                    outputStream.close();
                } catch (java.lang.Exception unused) {
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.FlipView$4");
                throw th6;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FlipView", e17, "", new java.lang.Object[0]);
        }
        try {
            outputStream.close();
        } catch (java.lang.Exception unused2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.FlipView$4");
        }
    }
}
