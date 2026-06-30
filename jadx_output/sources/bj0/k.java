package bj0;

/* loaded from: classes11.dex */
public final class k implements bj0.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.flutter.ui.FlutterViewEngine f21114a;

    public k(com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine) {
        this.f21114a = flutterViewEngine;
    }

    @Override // bj0.u
    public void b() {
        com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine = this.f21114a;
        io.flutter.Log.i(flutterViewEngine.C, "onEnterAnimBegin");
        flutterViewEngine.f68146x = true;
    }

    @Override // bj0.u
    public void e() {
        com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine = this.f21114a;
        flutterViewEngine.f68146x = false;
        io.flutter.Log.i(flutterViewEngine.C, "onEnterAnimEnd");
        if (flutterViewEngine.e()) {
            flutterViewEngine.j();
        }
    }
}
