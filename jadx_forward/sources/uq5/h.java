package uq5;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int f511769a;

    /* renamed from: b, reason: collision with root package name */
    public int f511770b;

    /* renamed from: c, reason: collision with root package name */
    public long f511771c;

    public h(int i17, int i18, long j17, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i19 & 1) != 0 ? 0 : i17;
        i18 = (i19 & 2) != 0 ? 0 : i18;
        j17 = (i19 & 4) != 0 ? 0L : j17;
        this.f511769a = i17;
        this.f511770b = i18;
        this.f511771c = j17;
    }

    /* renamed from: equals */
    public boolean m168414xb2c87fbf(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof uq5.h) {
                uq5.h hVar = (uq5.h) obj;
                if (this.f511769a == hVar.f511769a) {
                    if (this.f511770b == hVar.f511770b) {
                        if (this.f511771c == hVar.f511771c) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: hashCode */
    public int m168415x8cdac1b() {
        int i17 = ((this.f511769a * 31) + this.f511770b) * 31;
        long j17 = this.f511771c;
        return i17 + ((int) (j17 ^ (j17 >>> 32)));
    }

    /* renamed from: toString */
    public java.lang.String m168416x9616526c() {
        return "ProfileRecorder(startCount=" + this.f511769a + ", successCount=" + this.f511770b + ", costAvg=" + this.f511771c + ")";
    }
}
