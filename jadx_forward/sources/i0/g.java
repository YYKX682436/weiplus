package i0;

/* loaded from: classes14.dex */
public final class g extends i0.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i0.b topStart, i0.b topEnd, i0.b bottomEnd, i0.b bottomStart) {
        super(topStart, topEnd, bottomEnd, bottomStart);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topStart, "topStart");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topEnd, "topEnd");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomEnd, "bottomEnd");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomStart, "bottomStart");
    }

    @Override // i0.a
    public i0.a b(i0.b topStart, i0.b topEnd, i0.b bottomEnd, i0.b bottomStart) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topStart, "topStart");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topEnd, "topEnd");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomEnd, "bottomEnd");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomStart, "bottomStart");
        return new i0.g(topStart, topEnd, bottomEnd, bottomStart);
    }

    /* renamed from: equals */
    public boolean m134320xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0.g)) {
            return false;
        }
        i0.g gVar = (i0.g) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f368019a, gVar.f368019a)) {
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f368020b, gVar.f368020b)) {
            return false;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f368021c, gVar.f368021c)) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f368022d, gVar.f368022d);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m134321x8cdac1b() {
        return (((((this.f368019a.hashCode() * 31) + this.f368020b.hashCode()) * 31) + this.f368021c.hashCode()) * 31) + this.f368022d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m134322x9616526c() {
        return "RoundedCornerShape(topStart = " + this.f368019a + ", topEnd = " + this.f368020b + ", bottomEnd = " + this.f368021c + ", bottomStart = " + this.f368022d + ')';
    }
}
