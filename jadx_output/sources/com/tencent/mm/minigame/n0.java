package com.tencent.mm.minigame;

/* loaded from: classes.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f69120d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(java.lang.String str) {
        super(0);
        this.f69120d = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        try {
            android.widget.Toast.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f69120d, 0).show();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("WVA.JsApiOperateWVA", "Toast show failed: " + e17.getMessage());
        }
        return jz5.f0.f302826a;
    }
}
