package androidx.compose.ui.platform;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/WrappedComposition;", "Ln0/f1;", "Landroidx/lifecycle/v;", "Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "original", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Ln0/f1;)V", "ui_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes14.dex */
public final class WrappedComposition implements n0.f1, androidx.lifecycle.v {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.compose.ui.platform.AndroidComposeView f10496d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.f1 f10497e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10498f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.lifecycle.o f10499g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.p f10500h;

    public WrappedComposition(androidx.compose.ui.platform.AndroidComposeView owner, n0.f1 original) {
        kotlin.jvm.internal.o.g(owner, "owner");
        kotlin.jvm.internal.o.g(original, "original");
        this.f10496d = owner;
        this.f10497e = original;
        yz5.p pVar = androidx.compose.ui.platform.s1.f10741a;
        this.f10500h = androidx.compose.ui.platform.s1.f10741a;
    }

    @Override // n0.f1
    public boolean a() {
        return this.f10497e.a();
    }

    @Override // n0.f1
    public void b(yz5.p content) {
        kotlin.jvm.internal.o.g(content, "content");
        this.f10496d.setOnViewTreeOwnersAvailable(new androidx.compose.ui.platform.p5(this, content));
    }

    @Override // n0.f1
    public boolean c() {
        return this.f10497e.c();
    }

    @Override // n0.f1
    public void dispose() {
        if (!this.f10498f) {
            this.f10498f = true;
            this.f10496d.getView().setTag(com.tencent.mm.R.id.pqt, null);
            androidx.lifecycle.o oVar = this.f10499g;
            if (oVar != null) {
                oVar.c(this);
            }
        }
        this.f10497e.dispose();
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(event, "event");
        if (event == androidx.lifecycle.m.ON_DESTROY) {
            dispose();
        } else {
            if (event != androidx.lifecycle.m.ON_CREATE || this.f10498f) {
                return;
            }
            b(this.f10500h);
        }
    }
}
