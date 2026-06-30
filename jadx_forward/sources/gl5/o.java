package gl5;

/* loaded from: classes15.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Path f354581a = new android.graphics.Path();

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f354582b;

    /* renamed from: c, reason: collision with root package name */
    public int f354583c;

    /* renamed from: d, reason: collision with root package name */
    public int f354584d;

    /* renamed from: e, reason: collision with root package name */
    public long f354585e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.RectF f354586f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gl5.e0 f354587g;

    public o(gl5.e0 e0Var) {
        this.f354587g = e0Var;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f354582b = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
    }

    public final void a(boolean z17) {
        gl5.e0 e0Var = this.f354587g;
        if (e0Var.U.m81661x22f21e20() == null) {
            return;
        }
        if (this.f354586f == null) {
            this.f354586f = new android.graphics.RectF();
        }
        this.f354581a.computeBounds(this.f354586f, false);
        int m81628xdc9a71d7 = e0Var.U.m81628xdc9a71d7();
        int m81640x14c7f93 = e0Var.U.m81640x14c7f93() + e0Var.U.L(true);
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = e0Var.U;
            android.graphics.RectF rectF = this.f354586f;
            viewTreeObserverOnPreDrawListenerC22668xe0605023.postInvalidateOnAnimation(((int) rectF.left) + m81628xdc9a71d7, ((int) rectF.top) + m81640x14c7f93, m81628xdc9a71d7 + ((int) rectF.right), m81640x14c7f93 + ((int) rectF.bottom));
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe06050232 = e0Var.U;
            android.graphics.RectF rectF2 = this.f354586f;
            viewTreeObserverOnPreDrawListenerC22668xe06050232.postInvalidate((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        }
    }
}
