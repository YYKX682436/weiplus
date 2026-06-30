package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public final class g6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f91459d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(java.lang.String str) {
        super(1);
        this.f91459d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tenpay.miniapp.MiniAppSecureEditText it = (com.tenpay.miniapp.MiniAppSecureEditText) obj;
        kotlin.jvm.internal.o.g(it, "it");
        it.customAppendSalt(this.f91459d);
        return jz5.f0.f302826a;
    }
}
