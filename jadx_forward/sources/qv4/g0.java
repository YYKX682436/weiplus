package qv4;

/* loaded from: classes3.dex */
public final class g0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f448508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f448509e;

    public g0(android.view.View view, yz5.a aVar) {
        this.f448508d = view;
        this.f448509e = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f448508d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f448509e.mo152xb9724478();
    }
}
