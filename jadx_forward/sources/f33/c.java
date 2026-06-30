package f33;

/* loaded from: classes5.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f340844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f340845e;

    public c(f33.e eVar, android.view.View view, android.view.View view2) {
        this.f340844d = view;
        this.f340845e = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f340844d;
        view.getHitRect(rect);
        int b17 = i65.a.b(view.getContext(), 20);
        rect.left -= b17;
        rect.top -= b17;
        rect.right += b17;
        rect.bottom += b17;
        this.f340845e.setTouchDelegate(new android.view.TouchDelegate(rect, view));
    }
}
