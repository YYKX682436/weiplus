package bj0;

/* loaded from: classes11.dex */
public final class j implements io.flutter.embedding.android.ExclusiveAppComponent {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.flutter.ui.FlutterViewEngine f21113a;

    public j(com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine) {
        this.f21113a = flutterViewEngine;
    }

    @Override // io.flutter.embedding.android.ExclusiveAppComponent
    public void detachFromFlutterEngine() {
        this.f21113a.g();
    }

    @Override // io.flutter.embedding.android.ExclusiveAppComponent
    public java.lang.Object getAppComponent() {
        return this.f21113a.f68135m;
    }
}
