package fc3;

/* loaded from: classes9.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f342600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fc3.s f342601e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fc3.k f342602f;

    public o(android.widget.TextView textView, fc3.s sVar, fc3.k kVar) {
        this.f342600d = textView;
        this.f342601e = sVar;
        this.f342602f = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fc3.s sVar = this.f342601e;
        float f17 = sVar.f342613e.x;
        android.widget.TextView textView = this.f342600d;
        textView.setX(f17 - (textView.getWidth() / 2));
        textView.setY(sVar.f342613e.y - (textView.getHeight() / 2));
        textView.setAlpha(sVar.f342615g);
        java.util.ArrayList arrayList = (java.util.ArrayList) sVar.f342611c;
        fc3.k kVar = this.f342602f;
        arrayList.add(kVar);
        float f18 = kVar.f342586d - sVar.f342615g;
        float f19 = kVar.f342585c - sVar.f342614f;
        android.graphics.PointF pointF = kVar.f342584b;
        android.graphics.PointF pointF2 = sVar.f342613e;
        android.graphics.PointF pointF3 = new android.graphics.PointF(pointF.x, pointF.y);
        pointF3.offset(-pointF2.x, -pointF2.y);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        android.widget.TextView textView2 = this.f342600d;
        ofFloat.setDuration(sVar.f342612d);
        ofFloat.setInterpolator(sVar.f342617i);
        ofFloat.addUpdateListener(new fc3.m(f19, textView2, sVar, f18, pointF3));
        ofFloat.addListener(new fc3.n(sVar, kVar));
        ofFloat.start();
    }
}
