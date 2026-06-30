package com.tencent.mm.plugin.crashfix.patch.phonestateoverflow;

/* loaded from: classes7.dex */
public class e implements vx1.f {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f96683a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f96684b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Handler f96685c = new android.os.Handler(android.os.Looper.getMainLooper());

    @Override // vx1.f
    public boolean a(int i17) {
        if (i17 < 30 || (i17 >= 31 && com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationInfo().targetSdkVersion >= 31)) {
            return false;
        }
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_r_phonestate_overflow_v2, 1) == 1;
    }

    @Override // vx1.f
    public boolean b() {
        new com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow$1(this, com.tencent.mm.app.a0.f53288d).alive();
        return true;
    }
}
