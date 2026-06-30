package co1;

/* loaded from: classes12.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final bw5.u0 f125312a;

    /* renamed from: b, reason: collision with root package name */
    public final bw5.t0 f125313b;

    public h(bw5.u0 msgItem, bw5.t0 mediaInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgItem, "msgItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        this.f125312a = msgItem;
        this.f125313b = mediaInfo;
    }

    /* renamed from: equals */
    public boolean m15399xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co1.h)) {
            return false;
        }
        co1.h hVar = (co1.h) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f125312a, hVar.f125312a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f125313b, hVar.f125313b);
    }

    /* renamed from: hashCode */
    public int m15400x8cdac1b() {
        return (this.f125312a.hashCode() * 31) + this.f125313b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m15401x9616526c() {
        return "RoamMediaMsgItem(msgItem=" + this.f125312a + ", mediaInfo=" + this.f125313b + ')';
    }
}
