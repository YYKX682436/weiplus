package mm2;

/* loaded from: classes3.dex */
public final class r2 implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f410906d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f410907e;

    public r2(java.lang.String giftId, java.lang.String wishId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftId, "giftId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wishId, "wishId");
        this.f410906d = giftId;
        this.f410907e = wishId;
    }

    /* renamed from: equals */
    public boolean m148008xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.r2)) {
            return false;
        }
        mm2.r2 r2Var = (mm2.r2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f410906d, r2Var.f410906d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f410907e, r2Var.f410907e);
    }

    /* renamed from: hashCode */
    public int m148009x8cdac1b() {
        return (this.f410906d.hashCode() * 31) + this.f410907e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m148010x9616526c() {
        return "SendGiftData(giftId=" + this.f410906d + ", wishId=" + this.f410907e + ')';
    }
}
