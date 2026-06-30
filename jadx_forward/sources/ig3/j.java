package ig3;

/* loaded from: classes3.dex */
public final class j implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f372966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f372967e;

    public j(android.view.View view, yz5.a aVar) {
        this.f372966d = view;
        this.f372967e = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f372966d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f372967e.mo152xb9724478();
    }
}
