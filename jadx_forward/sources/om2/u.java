package om2;

/* loaded from: classes10.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f427916a;

    /* renamed from: b, reason: collision with root package name */
    public final om2.p f427917b;

    public u(java.lang.String uId, om2.p baseInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uId, "uId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseInfo, "baseInfo");
        this.f427916a = uId;
        this.f427917b = baseInfo;
    }

    /* renamed from: equals */
    public boolean m151685xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om2.u)) {
            return false;
        }
        om2.u uVar = (om2.u) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427916a, uVar.f427916a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427917b, uVar.f427917b);
    }

    /* renamed from: hashCode */
    public int m151686x8cdac1b() {
        return (this.f427916a.hashCode() * 31) + this.f427917b.m151671x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m151687x9616526c() {
        return "LiveSongScoreInfo(uId=" + this.f427916a + ", baseInfo=" + this.f427917b + ')';
    }
}
