package rl2;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f478717a;

    /* renamed from: b, reason: collision with root package name */
    public int f478718b;

    /* renamed from: c, reason: collision with root package name */
    public int f478719c;

    /* renamed from: d, reason: collision with root package name */
    public int f478720d;

    /* renamed from: e, reason: collision with root package name */
    public int f478721e;

    public c(long j17, int i17, int i18, int i19, int i27) {
        this.f478717a = j17;
        this.f478718b = i17;
        this.f478719c = i18;
        this.f478720d = i19;
        this.f478721e = i27;
    }

    /* renamed from: equals */
    public boolean m162704xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl2.c)) {
            return false;
        }
        rl2.c cVar = (rl2.c) obj;
        return this.f478717a == cVar.f478717a && this.f478718b == cVar.f478718b && this.f478719c == cVar.f478719c && this.f478720d == cVar.f478720d && this.f478721e == cVar.f478721e;
    }

    /* renamed from: hashCode */
    public int m162705x8cdac1b() {
        return (((((((java.lang.Long.hashCode(this.f478717a) * 31) + java.lang.Integer.hashCode(this.f478718b)) * 31) + java.lang.Integer.hashCode(this.f478719c)) * 31) + java.lang.Integer.hashCode(this.f478720d)) * 31) + java.lang.Integer.hashCode(this.f478721e);
    }

    /* renamed from: toString */
    public java.lang.String m162706x9616526c() {
        return "liveId:" + this.f478717a + ",time:(" + this.f478718b + ", " + this.f478719c + "),payForLive:" + this.f478720d + ",invalid:" + this.f478721e;
    }

    public /* synthetic */ c(long j17, int i17, int i18, int i19, int i27, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i28 & 1) != 0 ? 0L : j17, (i28 & 2) != 0 ? 0 : i17, (i28 & 4) != 0 ? 0 : i18, (i28 & 8) != 0 ? 0 : i19, (i28 & 16) != 0 ? 0 : i27);
    }
}
