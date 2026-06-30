package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.brandservice.ui.timeline.g f94130d = new com.tencent.mm.plugin.brandservice.ui.timeline.g();

    public g() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R("brandService");
        boolean z17 = !R.i("ProfileAllaysShowLive", false);
        R.G("ProfileAllaysShowLive", z17);
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "Success! AllaysShowProfileLive=" + z17, 1).show();
        return jz5.f0.f302826a;
    }
}
