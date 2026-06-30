package lz3;

/* loaded from: classes15.dex */
public abstract class b implements lz3.e {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f403898a;

    /* renamed from: b, reason: collision with root package name */
    public lz3.c f403899b;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lz3.e
    public void e(lz3.c animationInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationInfo, "animationInfo");
        this.f403899b = animationInfo;
        android.view.View view = animationInfo.f403900a;
        this.f403898a = view;
        if (view instanceof db5.f0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            db5.f0 f0Var = (db5.f0) view;
            android.graphics.PointF mo45728xfdb07fbf = f0Var.mo45728xfdb07fbf();
            android.graphics.PointF mo45729x3ffd66 = f0Var.mo45729x3ffd66();
            lz3.d dVar = animationInfo.f403904e;
            dVar.f403906a.set(mo45728xfdb07fbf != null ? mo45728xfdb07fbf.x : 1.0f, mo45728xfdb07fbf != null ? mo45728xfdb07fbf.y : 1.0f);
            dVar.f403907b.set(mo45729x3ffd66 != null ? mo45729x3ffd66.x : 0.0f, mo45729x3ffd66 != null ? mo45729x3ffd66.y : 0.0f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseOCRImageAnimator", "onShowStart start scale: %s, translation: %s", dVar.f403906a, dVar.f403907b);
            int mo79182x97cbed21 = f0Var.mo79182x97cbed21();
            int mo79180x47e2bd2c = f0Var.mo79180x47e2bd2c();
            android.graphics.PointF pointF = animationInfo.f403903d;
            float f17 = pointF.x;
            float f18 = pointF.y;
            float f19 = mo79182x97cbed21;
            float f27 = mo79180x47e2bd2c;
            float f28 = (f19 * 1.0f) / f27;
            float f29 = f17 * 1.0f;
            float f37 = f29 / f18;
            lz3.d dVar2 = animationInfo.f403905f;
            if (f28 > f37) {
                animationInfo.f403901b = false;
                android.graphics.PointF pointF2 = dVar2.f403906a;
                float f38 = f29 / f19;
                pointF2.x = f38;
                pointF2.y = f38;
                android.graphics.PointF pointF3 = dVar2.f403907b;
                pointF3.x = 0.0f;
                pointF3.y = (f18 - (f38 * f27)) / 2.0f;
            } else {
                animationInfo.f403901b = true;
                android.graphics.PointF pointF4 = dVar2.f403906a;
                float f39 = (f18 * 1.0f) / f27;
                pointF4.x = f39;
                pointF4.y = f39;
                android.graphics.PointF pointF5 = dVar2.f403907b;
                pointF5.x = (f17 - (f39 * f19)) / 2.0f;
                pointF5.y = 0.0f;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseOCRImageAnimator", "onShowStart target scale: %s, translation: %s, isLongImage: %b", dVar2.f403906a, dVar2.f403907b, java.lang.Boolean.valueOf(animationInfo.f403901b));
        }
    }
}
