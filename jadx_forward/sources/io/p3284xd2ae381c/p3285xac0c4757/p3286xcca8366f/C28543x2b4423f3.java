package io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.flutter.embedding.android.FlutterDrawInfoView */
/* loaded from: classes15.dex */
public class C28543x2b4423f3 extends android.view.View {
    private static final java.lang.String TAG = "FlutterDrawInfoView";

    /* renamed from: flutterEngine */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e f70527x3a4f997e;

    /* renamed from: needNotifyDraw */
    private boolean f70528x8ac58d63;

    public C28543x2b4423f3(android.content.Context context) {
        super(context);
        this.f70528x8ac58d63 = false;
    }

    /* renamed from: bindFlutterEngine */
    public void m137095xa6b43041(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e) {
        this.f70527x3a4f997e = c28580x69eec95e;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        io.p3284xd2ae381c.Log.i(TAG, "onAttachedToWindow");
        this.f70528x8ac58d63 = true;
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        io.p3284xd2ae381c.Log.i(TAG, "onDetachedFromWindow");
        this.f70528x8ac58d63 = false;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        if (this.f70528x8ac58d63) {
            io.p3284xd2ae381c.Log.i(TAG, "onDraw");
            this.f70528x8ac58d63 = false;
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e = this.f70527x3a4f997e;
            if (c28580x69eec95e != null) {
                c28580x69eec95e.m137452xc48e5f38();
            }
        }
    }
}
