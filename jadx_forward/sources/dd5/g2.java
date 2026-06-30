package dd5;

/* loaded from: classes8.dex */
public final class g2 implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f310687a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f310688b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.zs4 f310689c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f310690d;

    public g2(java.lang.CharSequence title, java.lang.CharSequence desc, r45.zs4 musicViewData, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicViewData, "musicViewData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        this.f310687a = title;
        this.f310688b = desc;
        this.f310689c = musicViewData;
        this.f310690d = msgInfo;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return kz5.c0.i(this.f310687a, this.f310688b);
    }

    /* renamed from: equals */
    public boolean m124027xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.g2)) {
            return false;
        }
        dd5.g2 g2Var = (dd5.g2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310687a, g2Var.f310687a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310688b, g2Var.f310688b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310689c, g2Var.f310689c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310690d, g2Var.f310690d);
    }

    /* renamed from: hashCode */
    public int m124028x8cdac1b() {
        return (((((this.f310687a.hashCode() * 31) + this.f310688b.hashCode()) * 31) + this.f310689c.hashCode()) * 31) + this.f310690d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m124029x9616526c() {
        return "ViewModel(title=" + ((java.lang.Object) this.f310687a) + ", desc=" + ((java.lang.Object) this.f310688b) + ", musicViewData=" + this.f310689c + ", msgInfo=" + this.f310690d + ')';
    }
}
