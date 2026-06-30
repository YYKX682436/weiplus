package c03;

/* loaded from: classes2.dex */
public final class g extends com.tencent.mm.ui.component.UIComponent implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.finder.FinderHalfScreenNativeAPI {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f37654d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f37655e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.pigeon.finder.FinderHalfScreenFlutterAPI f37656f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f37657g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f37658h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.pigeon.finder.FinderHalfScreenCancelMode f37659i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f37658h = kz5.p0.f313996d;
        this.f37659i = com.tencent.pigeon.finder.FinderHalfScreenCancelMode.UNKNOWN;
    }

    @Override // com.tencent.pigeon.finder.FinderHalfScreenNativeAPI
    public void cancelHalfScreen(boolean z17) {
        gx2.q qVar;
        java.lang.ref.WeakReference weakReference = this.f37654d;
        if (weakReference == null || (qVar = (gx2.q) weakReference.get()) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.b(qVar, false, null, false, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.finder.FinderHalfScreenNativeAPI.Companion companion = com.tencent.pigeon.finder.FinderHalfScreenNativeAPI.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.finder.FinderHalfScreenNativeAPI.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        this.f37656f = new com.tencent.pigeon.finder.FinderHalfScreenFlutterAPI(binaryMessenger2, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        gx2.q qVar;
        gx2.q qVar2;
        java.lang.ref.WeakReference weakReference = this.f37654d;
        boolean z17 = false;
        if (weakReference != null && (qVar2 = (gx2.q) weakReference.get()) != null && qVar2.isDrawerOpen) {
            z17 = true;
        }
        if (!z17) {
            return super.onBackPressed();
        }
        java.lang.ref.WeakReference weakReference2 = this.f37654d;
        if (weakReference2 != null && (qVar = (gx2.q) weakReference2.get()) != null) {
            com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.b(qVar, false, gx2.r.f277378g, false, null, 13, null);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        pi0.n1 n1Var;
        com.tencent.pigeon.finder.FinderHalfScreenCancelMode finderHalfScreenCancelMode = com.tencent.pigeon.finder.FinderHalfScreenCancelMode.UNKNOWN;
        if (finderHalfScreenCancelMode != this.f37659i) {
            this.f37659i = finderHalfScreenCancelMode;
            java.util.Objects.toString(this.f37656f);
            com.tencent.pigeon.finder.FinderHalfScreenFlutterAPI finderHalfScreenFlutterAPI = this.f37656f;
            if (finderHalfScreenFlutterAPI != null) {
                finderHalfScreenFlutterAPI.onHalfScreenCancelModelUpdate(finderHalfScreenCancelMode, new c03.a(this));
            }
        }
        java.lang.ref.WeakReference weakReference = this.f37655e;
        if (weakReference == null || (n1Var = (pi0.n1) weakReference.get()) == null) {
            return;
        }
        n1Var.a();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.finder.FinderHalfScreenNativeAPI.Companion companion = com.tencent.pigeon.finder.FinderHalfScreenNativeAPI.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.finder.FinderHalfScreenNativeAPI.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        this.f37656f = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onFinished() {
        pi0.n1 n1Var;
        super.onFinished();
        com.tencent.pigeon.finder.FinderHalfScreenCancelMode finderHalfScreenCancelMode = com.tencent.pigeon.finder.FinderHalfScreenCancelMode.UNKNOWN;
        if (finderHalfScreenCancelMode != this.f37659i) {
            this.f37659i = finderHalfScreenCancelMode;
            java.util.Objects.toString(this.f37656f);
            com.tencent.pigeon.finder.FinderHalfScreenFlutterAPI finderHalfScreenFlutterAPI = this.f37656f;
            if (finderHalfScreenFlutterAPI != null) {
                finderHalfScreenFlutterAPI.onHalfScreenCancelModelUpdate(finderHalfScreenCancelMode, new c03.a(this));
            }
        }
        java.lang.ref.WeakReference weakReference = this.f37655e;
        if (weakReference == null || (n1Var = (pi0.n1) weakReference.get()) == null) {
            return;
        }
        n1Var.a();
    }

    @Override // com.tencent.pigeon.finder.FinderHalfScreenNativeAPI
    public void updateDragPreventState(boolean z17) {
        this.f37657g = z17;
    }

    @Override // com.tencent.pigeon.finder.FinderHalfScreenNativeAPI
    public void updateHalfScreenContentHeight(double d17) {
        gx2.q qVar;
        java.lang.ref.WeakReference weakReference = this.f37654d;
        if (weakReference == null || (qVar = (gx2.q) weakReference.get()) == null) {
            return;
        }
        qVar.setExpandHeight(i65.a.a(getContext(), (float) d17) + qVar.getHeaderContainer().getHeight());
    }

    @Override // com.tencent.pigeon.finder.FinderHalfScreenNativeAPI
    public void updatePreventDragArea(java.util.List areas) {
        kotlin.jvm.internal.o.g(areas, "areas");
        this.f37658h = areas;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f37658h = kz5.p0.f313996d;
        this.f37659i = com.tencent.pigeon.finder.FinderHalfScreenCancelMode.UNKNOWN;
    }
}
