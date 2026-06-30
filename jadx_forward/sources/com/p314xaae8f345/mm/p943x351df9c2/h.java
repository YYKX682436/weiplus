package com.p314xaae8f345.mm.p943x351df9c2;

/* loaded from: classes11.dex */
public class h implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f151982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p943x351df9c2.r f151983e;

    public h(com.p314xaae8f345.mm.p943x351df9c2.r rVar, java.lang.String str) {
        this.f151983e = rVar;
        this.f151982d = str;
    }

    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "AvatarService#checkAvatarExpire";
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f151982d)) {
            return;
        }
        if (this.f151982d.equals(this.f151983e.f152058h)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarService", "thisUser is empty!!");
            return;
        }
        com.p314xaae8f345.mm.p943x351df9c2.s0 g17 = this.f151983e.g();
        if (g17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarService", "istg is null!!");
            return;
        }
        com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = g17.n0(this.f151982d);
        if (n07 == null || !n07.e().equals(this.f151982d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarService", "imgFlag is null or username not equal");
            return;
        }
        if (!(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() - (((long) n07.f152068g) * 60) > 86400)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarService", "imgFlag is expired!!");
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n07.d())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AvatarService", "dkhurl user has no url [%s]", this.f151982d);
        } else {
            this.f151983e.i(this.f151982d);
        }
    }

    /* renamed from: toString */
    public java.lang.String m47931x9616526c() {
        return super.toString() + "|checkAvatarExpire";
    }
}
