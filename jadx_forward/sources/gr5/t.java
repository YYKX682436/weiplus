package gr5;

/* loaded from: classes8.dex */
public final class t implements gr5.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f356480b;

    public t(int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f356480b = (i18 & 1) != 0 ? 200 : i17;
    }

    /* renamed from: equals */
    public boolean m132119xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && gr5.t.class == obj.getClass() && this.f356480b == ((gr5.t) obj).f356480b;
    }

    /* renamed from: hashCode */
    public int m132120x8cdac1b() {
        return this.f356480b;
    }

    /* renamed from: toString */
    public java.lang.String m132121x9616526c() {
        return "DefaultPanToScaleTransformer(reference=" + this.f356480b + ')';
    }
}
