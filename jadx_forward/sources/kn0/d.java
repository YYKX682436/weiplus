package kn0;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f391035a;

    public d(int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f391035a = (i18 & 1) != 0 ? 0 : i17;
    }

    public final int a() {
        return this.f391035a;
    }

    /* renamed from: equals */
    public boolean m143730xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kn0.d) && this.f391035a == ((kn0.d) obj).f391035a;
    }

    /* renamed from: hashCode */
    public int m143731x8cdac1b() {
        return java.lang.Integer.hashCode(this.f391035a);
    }

    /* renamed from: toString */
    public java.lang.String m143732x9616526c() {
        return "LiveConfig(micWaveThresHolder=" + this.f391035a + ')';
    }
}
