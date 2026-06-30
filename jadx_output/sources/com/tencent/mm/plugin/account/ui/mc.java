package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class mc extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg f74043a;

    public mc(com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg mobileLoginOrForceReg) {
        this.f74043a = mobileLoginOrForceReg;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        java.lang.Object obj = message.obj;
        if (obj != null) {
            this.f74043a.f73506f.setImageBitmap((android.graphics.Bitmap) obj);
        }
    }
}
