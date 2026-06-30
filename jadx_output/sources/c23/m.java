package c23;

/* loaded from: classes.dex */
public final class m extends wm3.a implements c23.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f38043d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f38044e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f38045f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f38046g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f38047h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f38048i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f38043d = jz5.h.b(new c23.k(activity, this));
        this.f38044e = jz5.h.b(new c23.d(activity));
        this.f38045f = jz5.h.b(new c23.i(activity));
        this.f38046g = jz5.h.b(new c23.c(activity, this));
        this.f38047h = jz5.h.b(new c23.j(this));
        this.f38048i = jz5.h.b(new c23.l(activity));
    }

    public d23.g T6() {
        return (d23.g) ((jz5.n) this.f38046g).getValue();
    }

    public final com.tencent.mm.ui.tools.f5 U6() {
        return (com.tencent.mm.ui.tools.f5) ((jz5.n) this.f38044e).getValue();
    }

    public com.tencent.mm.plugin.websearch.webview.WebSearchWebView V6() {
        return (com.tencent.mm.plugin.websearch.webview.WebSearchWebView) ((jz5.n) this.f38043d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        if (!com.tencent.mm.plugin.fts.ui.n3.h()) {
            ((android.widget.FrameLayout) ((jz5.n) this.f38048i).getValue()).setVisibility(8);
            return;
        }
        T6().u("onCreate", "");
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.m3(getActivity(), new c23.f(this));
        }
        su4.k2.a(103, java.lang.String.valueOf(o13.p.f342251d), java.lang.String.valueOf(o13.p.f342250c), false, "", 0, "", false, "");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        U6().f210400e = new c23.g(this);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        if (com.tencent.mm.plugin.fts.ui.n3.h()) {
            ((d23.j) ((jz5.n) this.f38047h).getValue()).e();
            V6().removeJavascriptInterface("ftsJSApi");
            V6().destroy();
        }
        U6().d();
        U6().f210400e = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        if (com.tencent.mm.plugin.fts.ui.n3.h()) {
            T6().u("onPause", "");
        }
        U6().d();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (com.tencent.mm.plugin.fts.ui.n3.h()) {
            T6().u("onResume", "");
        }
        getRootView().post(new c23.h(this));
    }
}
