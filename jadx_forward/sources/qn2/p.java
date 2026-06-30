package qn2;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f446662a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.ImageView f446663b;

    public p(android.widget.TextView giftCount, android.widget.ImageView giftIcon) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftCount, "giftCount");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftIcon, "giftIcon");
        this.f446662a = giftCount;
        this.f446663b = giftIcon;
    }

    /* renamed from: equals */
    public boolean m160548xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn2.p)) {
            return false;
        }
        qn2.p pVar = (qn2.p) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f446662a, pVar.f446662a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f446663b, pVar.f446663b);
    }

    /* renamed from: hashCode */
    public int m160549x8cdac1b() {
        return (this.f446662a.hashCode() * 31) + this.f446663b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m160550x9616526c() {
        return "ViewHolder(giftCount=" + this.f446662a + ", giftIcon=" + this.f446663b + ')';
    }
}
