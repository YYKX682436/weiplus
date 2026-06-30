package vr0;

/* loaded from: classes14.dex */
public final class b0 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0549x195d1fd3 {

    /* renamed from: a, reason: collision with root package name */
    public final sr0.g f520982a = new sr0.g();

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Matrix f520983b = new android.graphics.Matrix();

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0549x195d1fd3
    /* renamed from: convertPoint */
    public android.graphics.PointF mo4381x2ce0df9d(float f17, float f18) {
        sr0.g gVar = this.f520982a;
        float width = f17 / gVar.f492979d.width();
        float height = f18 / gVar.f492979d.height();
        float[] fArr = new float[2];
        this.f520983b.mapPoints(fArr, new float[]{width, height});
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKitFocusHelper", "convertPoint origin:[" + width + ' ' + height + "] dest:[" + fArr[0] + ' ' + fArr[1] + ']');
        return new android.graphics.PointF(fArr[0], fArr[1]);
    }
}
