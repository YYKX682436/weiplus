package i72;

/* loaded from: classes8.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f370962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i72.p f370963e;

    public o(i72.p pVar, android.graphics.Bitmap bitmap) {
        this.f370963e = pVar;
        this.f370962d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        i72.p pVar = this.f370963e;
        android.view.View view = pVar.f370965e.f181667v;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/facedetect/views/FaceDetectView$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/facedetect/views/FaceDetectView$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        pVar.f370965e.f181667v.setBackgroundDrawable(new android.graphics.drawable.BitmapDrawable(this.f370962d));
    }
}
