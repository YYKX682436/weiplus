package p6;

/* loaded from: classes16.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f433640a;

    /* renamed from: b, reason: collision with root package name */
    public long f433641b;

    /* renamed from: c, reason: collision with root package name */
    public int f433642c;

    /* renamed from: d, reason: collision with root package name */
    public int f433643d;

    /* renamed from: e, reason: collision with root package name */
    public int f433644e;

    /* renamed from: f, reason: collision with root package name */
    public m6.c f433645f;

    /* renamed from: g, reason: collision with root package name */
    public q6.a f433646g;

    /* renamed from: h, reason: collision with root package name */
    public int f433647h;

    /* renamed from: i, reason: collision with root package name */
    public int f433648i;

    /* renamed from: j, reason: collision with root package name */
    public java.io.File f433649j;

    public static boolean a(m6.c cVar) {
        o6.a aVar;
        java.util.ArrayList arrayList;
        if (cVar == null) {
            return false;
        }
        if (1 != cVar.mo146857x52c258a2()) {
            return 2 == cVar.mo146857x52c258a2() && (arrayList = (aVar = (o6.a) cVar).f424707b) != null && arrayList.size() >= 1 && ((o6.c) aVar.f424707b.get(0)).f424709b != null && ((o6.c) aVar.f424707b.get(0)).f424709b.size() >= 1 && ((m6.e) ((o6.c) aVar.f424707b.get(0)).f424709b.get(0)).f405882a != null;
        }
        n6.a aVar2 = (n6.a) cVar;
        java.util.ArrayList arrayList2 = aVar2.f416702b;
        return (arrayList2 == null || arrayList2.size() < 1 || ((m6.e) aVar2.f416702b.get(0)).f405882a == null) ? false : true;
    }

    public void b() {
        this.f433640a = null;
        this.f433641b = 0L;
        this.f433642c = 0;
        this.f433643d = 0;
        this.f433644e = 0;
        this.f433645f = null;
        this.f433646g = null;
        this.f433647h = 0;
        this.f433648i = 0;
    }

    /* renamed from: toString */
    public java.lang.String m157873x9616526c() {
        return "CurrentPlayingHeInfo{mHeString='" + this.f433640a + "', mStartTime=" + this.f433641b + ", mLoop=" + this.f433642c + ", mAmplitude=" + this.f433643d + ", mFreq=" + this.f433644e + ", mHeRoot=" + this.f433645f + ", mSyncCallback=" + this.f433646g + ", mStartPosition=" + this.f433647h + ", mStatus:" + this.f433648i + '}';
    }
}
