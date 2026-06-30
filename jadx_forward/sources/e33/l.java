package e33;

/* loaded from: classes5.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f328846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f328847e;

    public l(e33.m mVar, android.view.View view, android.view.View view2) {
        this.f328846d = view;
        this.f328847e = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f328846d;
        view.getHitRect(rect);
        rect.left -= i65.a.b(view.getContext(), 20);
        rect.top -= i65.a.b(view.getContext(), 20);
        rect.right += i65.a.b(view.getContext(), 20);
        rect.bottom += i65.a.b(view.getContext(), 20);
        this.f328847e.setTouchDelegate(new android.view.TouchDelegate(rect, view));
    }
}
