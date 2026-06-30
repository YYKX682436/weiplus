package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes11.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final mn0.b0 f263217a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25250xe2010b39 f263218b;

    public v1(mn0.b0 player, com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25250xe2010b39 finderLivePlayInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(player, "player");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderLivePlayInfo, "finderLivePlayInfo");
        this.f263217a = player;
        this.f263218b = finderLivePlayInfo;
    }

    /* renamed from: equals */
    public boolean m74090xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.v1)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.v1 v1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.v1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f263217a, v1Var.f263217a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f263218b, v1Var.f263218b);
    }

    /* renamed from: hashCode */
    public int m74091x8cdac1b() {
        return (this.f263217a.hashCode() * 31) + this.f263218b.m93394x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m74092x9616526c() {
        return "LivePlayerWrapper(player=" + this.f263217a + ", finderLivePlayInfo=" + this.f263218b + ')';
    }
}
