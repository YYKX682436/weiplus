package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class g6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f78188d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(boolean z17) {
        super(0);
        this.f78188d = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String[] strArr = gm0.j1.f273205l;
        for (int i17 = 0; i17 < 5; i17++) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193072b + strArr[i17];
            if (com.tencent.mm.sdk.platformtools.x2.o(str)) {
                com.tencent.mm.ipcinvoker.f.a(str, new com.tencent.mm.ipcinvoker.type.IPCBoolean(this.f78188d), com.tencent.mm.plugin.appbrand.f6.f78044d, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
