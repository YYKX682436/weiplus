package com.tencent.mm.modelavatar;

/* loaded from: classes11.dex */
public class h implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f70449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelavatar.r f70450e;

    public h(com.tencent.mm.modelavatar.r rVar, java.lang.String str) {
        this.f70450e = rVar;
        this.f70449d = str;
    }

    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "AvatarService#checkAvatarExpire";
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f70449d)) {
            return;
        }
        if (this.f70449d.equals(this.f70450e.f70525h)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AvatarService", "thisUser is empty!!");
            return;
        }
        com.tencent.mm.modelavatar.s0 g17 = this.f70450e.g();
        if (g17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AvatarService", "istg is null!!");
            return;
        }
        com.tencent.mm.modelavatar.r0 n07 = g17.n0(this.f70449d);
        if (n07 == null || !n07.e().equals(this.f70449d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AvatarService", "imgFlag is null or username not equal");
            return;
        }
        if (!(com.tencent.mm.sdk.platformtools.t8.i1() - (((long) n07.f70535g) * 60) > 86400)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AvatarService", "imgFlag is expired!!");
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(n07.d())) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AvatarService", "dkhurl user has no url [%s]", this.f70449d);
        } else {
            this.f70450e.i(this.f70449d);
        }
    }

    public java.lang.String toString() {
        return super.toString() + "|checkAvatarExpire";
    }
}
