package c03;

/* loaded from: classes2.dex */
public final class f extends hx2.h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c03.g f37653b;

    public f(c03.g gVar) {
        this.f37653b = gVar;
    }

    @Override // hx2.i
    public void b(gx2.q layout) {
        kotlin.jvm.internal.o.g(layout, "layout");
        com.tencent.pigeon.finder.FinderHalfScreenFlutterAPI finderHalfScreenFlutterAPI = this.f37653b.f37656f;
        if (finderHalfScreenFlutterAPI != null) {
            finderHalfScreenFlutterAPI.onHalfScreenCancel(c03.e.f37652d);
        }
    }

    @Override // hx2.i
    public void f(gx2.q layout, gx2.r closeAction) {
        com.tencent.pigeon.finder.FinderHalfScreenCancelMode finderHalfScreenCancelMode;
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(closeAction, "closeAction");
        super.f(layout, closeAction);
        int ordinal = closeAction.ordinal();
        if (ordinal == 0) {
            finderHalfScreenCancelMode = com.tencent.pigeon.finder.FinderHalfScreenCancelMode.UNKNOWN;
        } else if (ordinal == 1) {
            finderHalfScreenCancelMode = com.tencent.pigeon.finder.FinderHalfScreenCancelMode.CLICK_BG;
        } else if (ordinal == 2) {
            finderHalfScreenCancelMode = com.tencent.pigeon.finder.FinderHalfScreenCancelMode.DRAG;
        } else {
            if (ordinal != 3) {
                throw new jz5.j();
            }
            finderHalfScreenCancelMode = com.tencent.pigeon.finder.FinderHalfScreenCancelMode.BACK_PRESSED;
        }
        c03.g gVar = this.f37653b;
        if (finderHalfScreenCancelMode == gVar.f37659i) {
            return;
        }
        gVar.f37659i = finderHalfScreenCancelMode;
        java.util.Objects.toString(gVar.f37656f);
        com.tencent.pigeon.finder.FinderHalfScreenFlutterAPI finderHalfScreenFlutterAPI = gVar.f37656f;
        if (finderHalfScreenFlutterAPI != null) {
            finderHalfScreenFlutterAPI.onHalfScreenCancelModelUpdate(finderHalfScreenCancelMode, new c03.a(gVar));
        }
    }
}
