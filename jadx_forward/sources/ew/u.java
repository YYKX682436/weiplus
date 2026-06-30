package ew;

/* loaded from: classes11.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final mn0.b0 f338538a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23517x16019274 f338539b;

    public u(mn0.b0 player, com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23517x16019274 finderLivePlayInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(player, "player");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderLivePlayInfo, "finderLivePlayInfo");
        this.f338538a = player;
        this.f338539b = finderLivePlayInfo;
    }

    /* renamed from: equals */
    public boolean m128255xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew.u)) {
            return false;
        }
        ew.u uVar = (ew.u) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f338538a, uVar.f338538a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f338539b, uVar.f338539b);
    }

    /* renamed from: hashCode */
    public int m128256x8cdac1b() {
        return (this.f338538a.hashCode() * 31) + this.f338539b.m86840x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m128257x9616526c() {
        return "LivePlayerWrapper(player=" + this.f338538a + ", finderLivePlayInfo=" + this.f338539b + ')';
    }
}
