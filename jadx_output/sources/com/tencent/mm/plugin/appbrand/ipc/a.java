package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.ipc.a f78394d = new com.tencent.mm.plugin.appbrand.ipc.a();

    public a() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f490024is, 0).show();
        try {
            j45.l.u(com.tencent.mm.sdk.platformtools.x2.f193071a, "com.tencent.mm.ui.LauncherUI", new android.content.Intent().addFlags(268435456).addFlags(67108864), null);
        } catch (java.lang.Exception unused) {
        }
        return jz5.f0.f302826a;
    }
}
