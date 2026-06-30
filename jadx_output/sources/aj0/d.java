package aj0;

/* loaded from: classes11.dex */
public final class d implements io.flutter.embedding.engine.renderer.FlutterPreRenderFinishedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aj0.e f5223a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f5224b;

    public d(aj0.e eVar, long j17) {
        this.f5223a = eVar;
        this.f5224b = j17;
    }

    @Override // io.flutter.embedding.engine.renderer.FlutterPreRenderFinishedListener
    public void onPreRenderFinished(boolean z17, android.graphics.Bitmap bitmap) {
        aj0.e eVar = this.f5223a;
        if (((kotlinx.coroutines.c3) eVar.f5233i).A()) {
            return;
        }
        ((kotlinx.coroutines.u2) eVar.f5233i).U(jz5.f0.f302826a);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pre finished, success:");
        sb6.append(z17);
        sb6.append(", cost:");
        sb6.append(java.lang.System.currentTimeMillis() - this.f5224b);
        sb6.append(", bitmap:");
        sb6.append(bitmap != null ? java.lang.Integer.valueOf(bitmap.getWidth()) : null);
        sb6.append('x');
        sb6.append(bitmap != null ? java.lang.Integer.valueOf(bitmap.getHeight()) : null);
        io.flutter.Log.i(eVar.f5229e, sb6.toString());
        if (z17) {
            eVar.f5232h = bitmap;
        }
        yz5.l lVar = eVar.f5234j;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(z17));
        }
    }
}
