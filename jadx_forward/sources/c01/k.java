package c01;

/* loaded from: classes14.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public fp.e f118806a;

    /* renamed from: c, reason: collision with root package name */
    public fp.c f118808c;

    /* renamed from: d, reason: collision with root package name */
    public c01.i f118809d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f118810e = false;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f118807b = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;

    public boolean a() {
        return b(false);
    }

    public boolean b(boolean z17) {
        fp.e eVar = this.f118806a;
        boolean a17 = eVar != null ? eVar.a() : false;
        this.f118810e = false;
        if (z17) {
            this.f118806a = null;
            this.f118808c = null;
            this.f118809d = null;
        }
        return a17;
    }

    public boolean c(c01.i iVar) {
        this.f118809d = iVar;
        c01.j jVar = new c01.j(this, null);
        if (this.f118806a == null) {
            this.f118806a = new fp.e(this.f118807b);
        }
        if (this.f118808c != jVar) {
            this.f118808c = jVar;
        }
        fp.e eVar = this.f118806a;
        fp.c cVar = this.f118808c;
        fp.d dVar = eVar.f346709a;
        if (dVar != null) {
            ((fp.g) dVar).f346731c = cVar;
        }
        if (eVar == null || this.f118810e) {
            return false;
        }
        eVar.b();
        this.f118810e = true;
        return true;
    }
}
