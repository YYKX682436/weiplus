package bf2;

/* loaded from: classes3.dex */
public abstract class f extends bf2.g {

    /* renamed from: b, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f101138b;

    /* renamed from: c, reason: collision with root package name */
    public fm2.c f101139c;

    /* renamed from: d, reason: collision with root package name */
    public km2.m f101140d;

    /* renamed from: e, reason: collision with root package name */
    public r45.qt2 f101141e;

    public f(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f101138b = context;
    }

    public final android.view.View e(int i17, android.view.View root) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        android.view.View inflate = ((android.view.ViewStub) root.findViewById(i17)).inflate();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return inflate;
    }

    public fm2.c f() {
        return this.f101139c;
    }

    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 g() {
        return this.f101138b;
    }

    public dk2.xf h() {
        return dk2.ef.f314905a.j(this.f101139c);
    }

    public void i(fm2.c baseRouter, r45.qt2 qt2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseRouter, "baseRouter");
        this.f101140d = baseRouter.m57663xfb7e5820();
        gk2.e m57654xd7793f26 = baseRouter.m57654xd7793f26();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m57654xd7793f26, "<set-?>");
        this.f101142a = m57654xd7793f26;
        this.f101139c = baseRouter;
        this.f101141e = qt2Var;
    }

    public final android.view.View j(int i17, android.view.View root) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        android.view.ViewStub viewStub = (android.view.ViewStub) root.findViewById(i17);
        if (viewStub != null) {
            return viewStub.inflate();
        }
        return null;
    }
}
