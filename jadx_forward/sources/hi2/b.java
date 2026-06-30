package hi2;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f363039a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f363040b;

    public b(byte[] bArr, boolean z17) {
        this.f363039a = bArr;
        this.f363040b = z17;
    }

    /* renamed from: equals */
    public boolean m133568xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi2.b)) {
            return false;
        }
        hi2.b bVar = (hi2.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f363039a, bVar.f363039a) && this.f363040b == bVar.f363040b;
    }

    /* renamed from: hashCode */
    public int m133569x8cdac1b() {
        byte[] bArr = this.f363039a;
        return ((bArr == null ? 0 : java.util.Arrays.hashCode(bArr)) * 31) + java.lang.Boolean.hashCode(this.f363040b);
    }

    /* renamed from: toString */
    public java.lang.String m133570x9616526c() {
        return "VistorMicRequestExtData(buffer=" + java.util.Arrays.toString(this.f363039a) + ", isAutoLink=" + this.f363040b + ')';
    }
}
