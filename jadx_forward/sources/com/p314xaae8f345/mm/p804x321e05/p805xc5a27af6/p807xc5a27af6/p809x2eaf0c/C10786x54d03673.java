package com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.p809x2eaf0c;

/* renamed from: com.tencent.mm.kara.feature.feature.comm.SomeoneRelationshipFeatureGroup */
/* loaded from: classes11.dex */
public class C10786x54d03673 extends pl0.e {

    /* renamed from: chatAlert */
    @fl0.a
    public int f29372x5ee65ce4;

    /* renamed from: hideItsPost */
    @fl0.a
    public int f29373x77adbdc6;

    /* renamed from: hideMyPost */
    @fl0.a
    public int f29374xae6b44e;

    /* renamed from: isMyContact */
    @fl0.a
    public int f29375x1cbe76ca;

    /* renamed from: isSessionStickyOnTop */
    @fl0.a
    public int f29376xe54480e1;

    /* renamed from: isStared */
    @fl0.a
    public int f29377xf2fab83b;

    /* renamed from: muteNotifications */
    @fl0.a
    public int f29378xbf60634f;

    /* renamed from: numberOfMessages */
    @fl0.a
    public int f29379x2cb79c6c;

    /* renamed from: numberOfMyMessages */
    @fl0.a
    public int f29380x41f55a38;

    /* renamed from: privacy */
    @fl0.a
    public int[] f29381xed412388;

    /* renamed from: proportionOfMyMessages */
    @fl0.a
    public float f29382xad7a1209;

    @fl0.a
    public int[] sex;

    /* renamed from: userName */
    private java.lang.String f29383xf01afcf6;

    public C10786x54d03673(java.lang.String str) {
        this.f29383xf01afcf6 = str;
    }

    @Override // pl0.e, fl0.b
    /* renamed from: build */
    public void mo46315x59bc66e() {
        super.mo46315x59bc66e();
        if (android.text.TextUtils.isEmpty(this.f29383xf01afcf6)) {
            return;
        }
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f29383xf01afcf6, true);
        if (n17 == null) {
            return;
        }
        sl0.a0 a0Var = sl0.a0.f490582e;
        this.f29372x5ee65ce4 = a0Var.b(this.f29383xf01afcf6) ? 1 : 0;
        this.f29373x77adbdc6 = !a0Var.d(this.f29383xf01afcf6) ? 1 : 0;
        this.f29374xae6b44e = 1 ^ (n17.x2() ? 1 : 0);
        this.f29375x1cbe76ca = n17.r2() ? 1 : 0;
        this.f29376xe54480e1 = a0Var.c(n17) ? 1 : 0;
        this.f29378xbf60634f = c01.e2.P(n17) ? 1 : 0;
        this.f29380x41f55a38 = a0Var.f(this.f29383xf01afcf6);
        int e17 = a0Var.e(this.f29383xf01afcf6);
        this.f29379x2cb79c6c = e17;
        if (e17 > 0) {
            this.f29382xad7a1209 = this.f29380x41f55a38 / e17;
        }
    }

    @Override // fl0.b
    /* renamed from: getName */
    public java.lang.String mo46314xfb82e301() {
        return "sender";
    }
}
