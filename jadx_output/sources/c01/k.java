package c01;

/* loaded from: classes14.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public fp.e f37273a;

    /* renamed from: c, reason: collision with root package name */
    public fp.c f37275c;

    /* renamed from: d, reason: collision with root package name */
    public c01.i f37276d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f37277e = false;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f37274b = com.tencent.mm.sdk.platformtools.x2.f193071a;

    public boolean a() {
        return b(false);
    }

    public boolean b(boolean z17) {
        fp.e eVar = this.f37273a;
        boolean a17 = eVar != null ? eVar.a() : false;
        this.f37277e = false;
        if (z17) {
            this.f37273a = null;
            this.f37275c = null;
            this.f37276d = null;
        }
        return a17;
    }

    public boolean c(c01.i iVar) {
        this.f37276d = iVar;
        c01.j jVar = new c01.j(this, null);
        if (this.f37273a == null) {
            this.f37273a = new fp.e(this.f37274b);
        }
        if (this.f37275c != jVar) {
            this.f37275c = jVar;
        }
        fp.e eVar = this.f37273a;
        fp.c cVar = this.f37275c;
        fp.d dVar = eVar.f265176a;
        if (dVar != null) {
            ((fp.g) dVar).f265198c = cVar;
        }
        if (eVar == null || this.f37277e) {
            return false;
        }
        eVar.b();
        this.f37277e = true;
        return true;
    }
}
