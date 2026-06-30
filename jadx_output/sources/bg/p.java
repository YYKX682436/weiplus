package bg;

/* loaded from: classes7.dex */
public class p implements com.tencent.mm.plugin.appbrand.jsapi.media.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg.f f19824a;

    public p(bg.f fVar) {
        this.f19824a = fVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.r1
    public void onPause() {
        bg.f fVar = this.f19824a;
        com.tencent.mars.xlog.Log.i(fVar.A(), "onPause");
        fVar.Q(new bg.f$$c(fVar, true));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.r1
    public void onResume() {
        bg.f fVar = this.f19824a;
        com.tencent.mars.xlog.Log.i(fVar.A(), "onResume");
        fVar.Q(new bg.t(fVar));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.r1
    public void onStop() {
        bg.f fVar = this.f19824a;
        com.tencent.mars.xlog.Log.i(fVar.A(), "onStop");
        fVar.Q(new bg.f$$b(fVar));
    }
}
