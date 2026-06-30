package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/WrappedComposition;", "Ln0/f1;", "Landroidx/lifecycle/v;", "Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "original", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Ln0/f1;)V", "ui_release"}, k = 1, mv = {1, 6, 0})
/* renamed from: androidx.compose.ui.platform.WrappedComposition */
/* loaded from: classes14.dex */
public final class C1066x9f035405 implements n0.f1, p012xc85e97e9.p093xedfae76a.v {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 f92029d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.f1 f92030e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f92031f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.o f92032g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.p f92033h;

    public C1066x9f035405(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 owner, n0.f1 original) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(original, "original");
        this.f92029d = owner;
        this.f92030e = original;
        yz5.p pVar = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.s1.f92274a;
        this.f92033h = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.s1.f92274a;
    }

    @Override // n0.f1
    public boolean a() {
        return this.f92030e.a();
    }

    @Override // n0.f1
    public void b(yz5.p content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        this.f92029d.m7058xde2fcd05(new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.p5(this, content));
    }

    @Override // n0.f1
    public boolean c() {
        return this.f92030e.c();
    }

    @Override // n0.f1
    /* renamed from: dispose */
    public void mo7062x63a5261f() {
        if (!this.f92031f) {
            this.f92031f = true;
            this.f92029d.m7051xfb86a31b().setTag(com.p314xaae8f345.mm.R.id.pqt, null);
            p012xc85e97e9.p093xedfae76a.o oVar = this.f92032g;
            if (oVar != null) {
                oVar.c(this);
            }
        }
        this.f92030e.mo7062x63a5261f();
    }

    @Override // p012xc85e97e9.p093xedfae76a.v
    /* renamed from: onStateChanged */
    public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y source, p012xc85e97e9.p093xedfae76a.m event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (event == p012xc85e97e9.p093xedfae76a.m.ON_DESTROY) {
            mo7062x63a5261f();
        } else {
            if (event != p012xc85e97e9.p093xedfae76a.m.ON_CREATE || this.f92031f) {
                return;
            }
            b(this.f92033h);
        }
    }
}
