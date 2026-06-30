package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f94182d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.ipcinvoker.r rVar) {
        super(4);
        this.f94182d = rVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.lang.String errMsg = (java.lang.String) obj3;
        r45.js5 resp = (r45.js5) obj4;
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        kotlin.jvm.internal.o.g(resp, "resp");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("errType", intValue);
        bundle.putInt("errCode", intValue2);
        bundle.putString("errMsg", errMsg);
        bundle.putByteArray("resp", resp.toByteArray());
        this.f94182d.a(bundle);
        return jz5.f0.f302826a;
    }
}
