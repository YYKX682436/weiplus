package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes14.dex */
public final class tl implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f281548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.tc6 f281549e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm f281550f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f281551g;

    public tl(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, r45.tc6 tc6Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm fmVar, long j17) {
        this.f281548d = f0Var;
        this.f281549e = tc6Var;
        this.f281550f = fmVar;
        this.f281551g = j17;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f281548d;
        int i17 = f0Var.f391649d + 1;
        f0Var.f391649d = i17;
        r45.tc6 tc6Var = this.f281549e;
        int length = tc6Var.f467849e + tc6Var.f467848d.length();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm fmVar = this.f281550f;
        if (i17 > length) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = fmVar.f280597m;
            if (b4Var != null) {
                b4Var.d();
            }
        } else {
            sb5.h2 h2Var = fmVar.f280596i;
            if (h2Var != null) {
                h2Var.a(f0Var.f391649d, java.lang.Long.valueOf(this.f281551g));
            }
        }
        return true;
    }
}
