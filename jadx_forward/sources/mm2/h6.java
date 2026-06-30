package mm2;

/* loaded from: classes10.dex */
public final class h6 extends mm2.j6 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.z22 f410646a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(r45.z22 songInfo) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
        this.f410646a = songInfo;
    }

    /* renamed from: equals */
    public boolean m147957xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mm2.h6) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f410646a, ((mm2.h6) obj).f410646a);
    }

    /* renamed from: hashCode */
    public int m147958x8cdac1b() {
        return this.f410646a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m147959x9616526c() {
        return "Preparing(songInfo=" + this.f410646a + ')';
    }
}
