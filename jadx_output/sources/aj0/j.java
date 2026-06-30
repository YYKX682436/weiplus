package aj0;

/* loaded from: classes11.dex */
public final class j implements io.flutter.embedding.engine.renderer.FlutterUiDisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f5253a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ aj0.l f5254b;

    public j(yz5.a aVar, aj0.l lVar) {
        this.f5253a = aVar;
        this.f5254b = lVar;
    }

    @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
    public void onFlutterUiDisplayed() {
        this.f5253a.invoke();
        this.f5254b.f5262f.removeIsDisplayingFlutterUiListener(this);
    }

    @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
    public void onFlutterUiNoLongerDisplayed() {
    }
}
