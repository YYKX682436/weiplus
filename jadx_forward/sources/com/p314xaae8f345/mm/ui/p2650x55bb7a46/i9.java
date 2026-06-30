package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class i9 implements c01.v8 {

    /* renamed from: a, reason: collision with root package name */
    public final yb5.d f283375a;

    public i9(yb5.d dVar) {
        this.f283375a = dVar;
    }

    @Override // c01.v8
    public void a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        mm.w.e("notifyFirstChat");
        yb5.d dVar = this.f283375a;
        if (dVar.f542241c.a(sb5.z0.class) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingUIKeywordChecker", "chatting ui maybe has exit!");
        } else {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) dVar.f542241c.a(sb5.z0.class))).C();
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) dVar.f542241c.a(sb5.z0.class))).M0();
        }
    }

    @Override // c01.v8
    public void b(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.os.Bundle bundle) {
    }

    @Override // c01.v8
    public void c(java.util.List list) {
    }

    @Override // c01.v8
    /* renamed from: getLooper */
    public android.os.Looper mo13945x23b2dd47() {
        return android.os.Looper.getMainLooper();
    }
}
