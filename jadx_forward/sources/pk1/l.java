package pk1;

/* loaded from: classes15.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk1.q f436994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f436995e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f436996f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ye1.h f436997g;

    public l(pk1.q qVar, java.lang.String str, java.lang.String str2, ye1.h hVar) {
        this.f436994d = qVar;
        this.f436995e = str;
        this.f436996f = str2;
        this.f436997g = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*ye1.a*/.u(this.f436995e, this.f436996f, this.f436997g);
    }
}
