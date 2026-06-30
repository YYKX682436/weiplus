package vo0;

/* loaded from: classes10.dex */
public class a extends vo0.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yo0.e configuration) {
        super(configuration);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configuration, "configuration");
    }

    @Override // vo0.d
    public wo0.c b(java.lang.Object obj, yo0.i options) {
        java.lang.String url = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(options, "options");
        wo0.b bVar = new wo0.b(new ip0.a(url), this.f519999a);
        if (options.f545639k) {
            dp0.e eVar = new dp0.e(true, 0.5f);
            eVar.f323649c = dp0.c.f323644e;
            bVar.h(new dp0.a(eVar));
        }
        bVar.f529405c = options;
        return bVar;
    }

    @Override // vo0.d
    public wo0.c d(java.lang.Object obj) {
        java.lang.String url = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        return new wo0.b(new ip0.a(url), this.f519999a);
    }

    @Override // vo0.d
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public wo0.c a(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        return new wo0.b(new ip0.a(url), this.f519999a);
    }

    @Override // vo0.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void c(java.lang.String url, android.widget.ImageView view, yo0.i options) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(options, "options");
        wo0.b bVar = new wo0.b(new ip0.a(url), this.f519999a);
        if (options.f545639k) {
            dp0.e eVar = new dp0.e(true, 0.5f);
            eVar.f323649c = dp0.c.f323644e;
            bVar.h(new dp0.a(eVar));
        }
        bVar.f529405c = options;
        bVar.c(view);
    }

    public final wo0.c g(java.lang.String assertPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(assertPath, "assertPath");
        return new wo0.b(new ip0.a(assertPath, ip0.b.ASSET_DATA), this.f519999a);
    }

    public final void h(java.lang.String url, android.widget.ImageView view, yo0.i options, yz5.p pVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(options, "options");
        wo0.b bVar = new wo0.b(new ip0.a(url), this.f519999a);
        if (options.f545639k) {
            dp0.e eVar = new dp0.e(true, 0.5f);
            eVar.f323649c = dp0.c.f323644e;
            bVar.h(new dp0.a(eVar));
        }
        bVar.f529405c = options;
        bVar.i(view, pVar);
    }

    public wo0.c i(java.lang.String filePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        return new wo0.b(new ip0.a(filePath, ip0.b.LOCAL_PATH), this.f519999a);
    }
}
