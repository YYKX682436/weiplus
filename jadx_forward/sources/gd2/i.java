package gd2;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f352065a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f352066b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 f352067c;

    /* renamed from: d, reason: collision with root package name */
    public final gd2.x f352068d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f352069e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f352070f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f352071g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f352072h;

    /* renamed from: i, reason: collision with root package name */
    public final o25.y1 f352073i;

    public i(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, java.lang.String curFilename, com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 gallery, gd2.x photoTransLogic, yz5.a isCurrentImgCanShowTransEntrance, yz5.a isCurrentImgCanShowOCREntrance) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curFilename, "curFilename");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gallery, "gallery");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(photoTransLogic, "photoTransLogic");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isCurrentImgCanShowTransEntrance, "isCurrentImgCanShowTransEntrance");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isCurrentImgCanShowOCREntrance, "isCurrentImgCanShowOCREntrance");
        this.f352065a = context;
        this.f352066b = curFilename;
        this.f352067c = gallery;
        this.f352068d = photoTransLogic;
        this.f352069e = isCurrentImgCanShowTransEntrance;
        this.f352070f = isCurrentImgCanShowOCREntrance;
        this.f352072h = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.k1.f240283b;
        i95.m c17 = i95.n0.c(o25.y1.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        this.f352073i = new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m();
        context.mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.f() { // from class: com.tencent.mm.plugin.finder.feed.ui.commentimage.menu.FinderCommentImageMenu$1
            @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
            /* renamed from: onPause */
            public void mo7796xb01dfb57(p012xc85e97e9.p093xedfae76a.y owner) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                gd2.i.this.f352073i.getClass();
            }

            @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
            /* renamed from: onResume */
            public void mo7055x57429eec(p012xc85e97e9.p093xedfae76a.y owner) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                gd2.i.this.f352073i.getClass();
            }
        });
    }

    public final void a() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f352071g;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f352065a;
        if (k0Var == null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) abstractActivityC21394xb3d2c0cf, 0, false);
            this.f352071g = k0Var2;
            k0Var2.f293405n = new gd2.a(this);
            k0Var2.f293407o = new gd2.b(this);
            k0Var2.f293414s = new gd2.c(this);
            k0Var2.f293417v = new gd2.d(this);
            k0Var2.f293409p = new gd2.e(this);
            k0Var2.f293418w = new gd2.h(this);
        }
        if (this.f352068d.f352105i == 1 || abstractActivityC21394xb3d2c0cf.isFinishing()) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var3 = this.f352071g;
        if (k0Var3 != null) {
            k0Var3.v();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("menu");
            throw null;
        }
    }
}
