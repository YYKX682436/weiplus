package l2;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f396639a;

    /* renamed from: equals */
    public boolean m144890xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof l2.a) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f396639a), java.lang.Float.valueOf(((l2.a) obj).f396639a));
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m144891x8cdac1b() {
        return java.lang.Float.hashCode(this.f396639a);
    }

    /* renamed from: toString */
    public java.lang.String m144892x9616526c() {
        return "BaselineShift(multiplier=" + this.f396639a + ')';
    }
}
