package androidx.fragment.app;

/* loaded from: classes14.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.b3 f11362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f11363e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f11364f;

    public j(androidx.fragment.app.p pVar, androidx.fragment.app.b3 b3Var, android.view.View view, android.graphics.Rect rect) {
        this.f11362d = b3Var;
        this.f11363e = view;
        this.f11364f = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f11362d.i(this.f11363e, this.f11364f);
    }
}
