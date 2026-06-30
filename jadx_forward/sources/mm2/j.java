package mm2;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public mm2.l f410682a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.ce2 f410683b;

    public j(mm2.l playState, r45.ce2 adVideoInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playState, "playState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adVideoInfo, "adVideoInfo");
        this.f410682a = playState;
        this.f410683b = adVideoInfo;
    }

    /* renamed from: equals */
    public boolean m147970xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.j)) {
            return false;
        }
        mm2.j jVar = (mm2.j) obj;
        return this.f410682a == jVar.f410682a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f410683b, jVar.f410683b);
    }

    /* renamed from: hashCode */
    public int m147971x8cdac1b() {
        return (this.f410682a.hashCode() * 31) + this.f410683b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m147972x9616526c() {
        return "LivingAdVideoInfo(playState=" + this.f410682a + ", adVideoInfo=" + this.f410683b + ')';
    }
}
