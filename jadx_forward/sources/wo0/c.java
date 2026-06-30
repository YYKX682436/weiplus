package wo0;

/* loaded from: classes15.dex */
public abstract class c implements vo0.b {

    /* renamed from: a, reason: collision with root package name */
    public final ip0.a f529403a;

    /* renamed from: b, reason: collision with root package name */
    public final yo0.e f529404b;

    /* renamed from: c, reason: collision with root package name */
    public yo0.i f529405c;

    /* renamed from: d, reason: collision with root package name */
    public ep0.e f529406d;

    /* renamed from: e, reason: collision with root package name */
    public ep0.d f529407e;

    /* renamed from: f, reason: collision with root package name */
    public ep0.f f529408f;

    /* renamed from: g, reason: collision with root package name */
    public ep0.c f529409g;

    /* renamed from: h, reason: collision with root package name */
    public ep0.g f529410h;

    /* renamed from: i, reason: collision with root package name */
    public ep0.b f529411i;

    /* renamed from: j, reason: collision with root package name */
    public ep0.a f529412j;

    /* renamed from: k, reason: collision with root package name */
    public dp0.a f529413k;

    /* renamed from: l, reason: collision with root package name */
    public android.graphics.drawable.Drawable f529414l;

    /* renamed from: m, reason: collision with root package name */
    public cp0.f f529415m;

    public c(ip0.a reqValue, yo0.e mImageLoaderConfiguration) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqValue, "reqValue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mImageLoaderConfiguration, "mImageLoaderConfiguration");
        this.f529403a = reqValue;
        this.f529404b = mImageLoaderConfiguration;
    }

    @Override // vo0.b
    public void a() {
        this.f529415m = new cp0.a();
        f();
    }

    public void d() {
        this.f529415m = new cp0.a();
        vo0.h hVar = new vo0.h(this, this.f529404b);
        hVar.f520024u = hVar.f520004a.f529403a;
        hVar.b();
    }

    public java.lang.Object e() {
        yo0.i iVar = this.f529405c;
        yo0.e eVar = this.f529404b;
        if (iVar == null) {
            eVar.e();
        }
        com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01.e l17 = eVar.l();
        dp0.a aVar = this.f529413k;
        if (aVar == null) {
            aVar = eVar.d();
        }
        hp0.g a17 = l17.a(this.f529403a, aVar);
        if (a17 != null) {
            return a17.f364446a;
        }
        return null;
    }

    public void f() {
        vo0.h hVar = new vo0.h(this, this.f529404b);
        hVar.f520024u = hVar.f520004a.f529403a;
        hVar.b();
    }

    public vo0.b g(yo0.i options) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(options, "options");
        this.f529405c = options;
        return this;
    }

    public final vo0.b h(dp0.d _transcoder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(_transcoder, "_transcoder");
        dp0.a aVar = this.f529413k;
        if (aVar == null) {
            this.f529413k = new dp0.a(_transcoder);
        } else if (aVar != null) {
            aVar.c(_transcoder);
        }
        return this;
    }
}
