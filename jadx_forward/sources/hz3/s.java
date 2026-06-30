package hz3;

/* loaded from: classes12.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f367887a;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Point f367889c;

    /* renamed from: f, reason: collision with root package name */
    public int f367892f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f367893g;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f367888b = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f367890d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f367891e = "";

    public s(long j17, int i17) {
        this.f367887a = i17;
    }

    public final r45.si a() {
        r45.si siVar = new r45.si();
        int i17 = this.f367892f;
        if (i17 == 1) {
            siVar.f467276d = 1;
        } else if (i17 == 0) {
            siVar.f467276d = 2;
        }
        siVar.f467279g = this.f367890d;
        siVar.f467280h = this.f367891e;
        android.graphics.Point point = this.f367889c;
        siVar.f467277e = point != null ? point.x : 0;
        siVar.f467278f = point != null ? point.y : 0;
        siVar.f467281i = 0;
        return siVar;
    }
}
