package yi4;

/* loaded from: classes9.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f544147a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f544148b;

    public i(byte[] bArr, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f544147a = bArr;
        this.f544148b = callback;
    }

    /* renamed from: equals */
    public boolean m177192xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi4.i)) {
            return false;
        }
        yi4.i iVar = (yi4.i) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f544147a, iVar.f544147a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f544148b, iVar.f544148b);
    }

    /* renamed from: hashCode */
    public int m177193x8cdac1b() {
        byte[] bArr = this.f544147a;
        return ((bArr == null ? 0 : java.util.Arrays.hashCode(bArr)) * 31) + this.f544148b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m177194x9616526c() {
        return "PendingSelectPoi(current=" + java.util.Arrays.toString(this.f544147a) + ", callback=" + this.f544148b + ')';
    }
}
