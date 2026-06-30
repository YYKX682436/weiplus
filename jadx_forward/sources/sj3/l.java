package sj3;

/* loaded from: classes5.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f490149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f490150e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f490151f;

    public l(android.view.View view, int i17, android.view.View view2) {
        this.f490149d = view;
        this.f490150e = i17;
        this.f490151f = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f490149d;
        view.getHitRect(rect);
        int i17 = rect.top;
        int i18 = this.f490150e;
        rect.top = i17 - i18;
        rect.bottom += i18;
        rect.left -= i18;
        rect.right += i18;
        this.f490151f.setTouchDelegate(new android.view.TouchDelegate(rect, view));
    }
}
