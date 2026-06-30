package lx;

/* loaded from: classes11.dex */
public final class a6 {

    /* renamed from: a, reason: collision with root package name */
    public final mn0.b0 f403223a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23517x16019274 f403224b;

    public a6(mn0.b0 player, com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23517x16019274 finderLivePlayInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(player, "player");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderLivePlayInfo, "finderLivePlayInfo");
        this.f403223a = player;
        this.f403224b = finderLivePlayInfo;
    }

    /* renamed from: equals */
    public boolean m146447xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx.a6)) {
            return false;
        }
        lx.a6 a6Var = (lx.a6) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f403223a, a6Var.f403223a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f403224b, a6Var.f403224b);
    }

    /* renamed from: hashCode */
    public int m146448x8cdac1b() {
        return (this.f403223a.hashCode() * 31) + this.f403224b.m86840x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m146449x9616526c() {
        return "LivePlayerWrapper(player=" + this.f403223a + ", finderLivePlayInfo=" + this.f403224b + ')';
    }
}
