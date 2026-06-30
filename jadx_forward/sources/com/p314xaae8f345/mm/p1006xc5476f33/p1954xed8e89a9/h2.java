package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* loaded from: classes9.dex */
public final class h2 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.wl f235015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f235016e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235017f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f235018g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f235019h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.t1 f235020i;

    public h2(r45.wl wlVar, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, java.lang.String str, long j17, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.t1 t1Var) {
        this.f235015d = wlVar;
        this.f235016e = f0Var;
        this.f235017f = str;
        this.f235018g = j17;
        this.f235019h = i17;
        this.f235020i = t1Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfileUtilsKt", "handleLikeBlock errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.t1 t1Var = this.f235020i;
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f235016e;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProfileUtilsKt", "handleLikeBlock: sync blockStatus=" + f0Var.f391649d + " failed");
            if (t1Var == null) {
                return 0;
            }
            t1Var.a();
            return 0;
        }
        r45.wl wlVar = this.f235015d;
        if (wlVar.M == null) {
            wlVar.M = new r45.el();
        }
        r45.el elVar = wlVar.M;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(elVar);
        elVar.f455124d = f0Var.f391649d;
        qr3.c0.c(wlVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfileUtilsKt", "handleLikeBlock: update LoveStatus.block=" + f0Var.f391649d + " and saved");
        gr3.e.d(this.f235017f, f0Var.f391649d == 1 ? 605 : 604, this.f235018g, null, this.f235019h, 0, 0, null, null, null, 0, 0, 4032, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfileUtilsKt", "handleLikeBlock: sync blockStatus=" + f0Var.f391649d + " success");
        if (t1Var == null) {
            return 0;
        }
        t1Var.mo67622xe05b4124(f0Var.f391649d);
        return 0;
    }
}
