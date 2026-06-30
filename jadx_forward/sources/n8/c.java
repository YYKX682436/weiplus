package n8;

/* loaded from: classes15.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final n8.c f417004d = new n8.c(0, 0, 1, null);

    /* renamed from: a, reason: collision with root package name */
    public final int f417005a;

    /* renamed from: b, reason: collision with root package name */
    public final int f417006b;

    /* renamed from: c, reason: collision with root package name */
    public android.media.AudioAttributes f417007c;

    public c(int i17, int i18, int i19, n8.b bVar) {
        this.f417005a = i17;
        this.f417006b = i19;
    }

    /* renamed from: equals */
    public boolean m149199xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n8.c.class != obj.getClass()) {
            return false;
        }
        n8.c cVar = (n8.c) obj;
        return this.f417005a == cVar.f417005a && this.f417006b == cVar.f417006b;
    }

    /* renamed from: hashCode */
    public int m149200x8cdac1b() {
        return ((((this.f417005a + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de) * 31) + 0) * 31) + this.f417006b;
    }
}
