package bf2;

/* loaded from: classes3.dex */
public abstract class f extends bf2.g {

    /* renamed from: b, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f19605b;

    /* renamed from: c, reason: collision with root package name */
    public fm2.c f19606c;

    /* renamed from: d, reason: collision with root package name */
    public km2.m f19607d;

    /* renamed from: e, reason: collision with root package name */
    public r45.qt2 f19608e;

    public f(androidx.appcompat.app.AppCompatActivity context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f19605b = context;
    }

    public final android.view.View e(int i17, android.view.View root) {
        kotlin.jvm.internal.o.g(root, "root");
        android.view.View inflate = ((android.view.ViewStub) root.findViewById(i17)).inflate();
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return inflate;
    }

    public fm2.c f() {
        return this.f19606c;
    }

    public final androidx.appcompat.app.AppCompatActivity g() {
        return this.f19605b;
    }

    public dk2.xf h() {
        return dk2.ef.f233372a.j(this.f19606c);
    }

    public void i(fm2.c baseRouter, r45.qt2 qt2Var) {
        kotlin.jvm.internal.o.g(baseRouter, "baseRouter");
        this.f19607d = baseRouter.getData();
        gk2.e buContext = baseRouter.getBuContext();
        kotlin.jvm.internal.o.g(buContext, "<set-?>");
        this.f19609a = buContext;
        this.f19606c = baseRouter;
        this.f19608e = qt2Var;
    }

    public final android.view.View j(int i17, android.view.View root) {
        kotlin.jvm.internal.o.g(root, "root");
        android.view.ViewStub viewStub = (android.view.ViewStub) root.findViewById(i17);
        if (viewStub != null) {
            return viewStub.inflate();
        }
        return null;
    }
}
