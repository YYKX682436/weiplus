package zu2;

/* loaded from: classes3.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f557288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f557289e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jx2.j f557290f;

    public z(android.view.View view, android.view.View view2, jx2.j jVar) {
        this.f557288d = view;
        this.f557289e = view2;
        this.f557290f = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f557288d;
        int left = view.getLeft() + (view.getMeasuredWidth() / 2);
        android.view.View anchor = this.f557289e;
        int measuredWidth = left - (anchor.getMeasuredWidth() / 2);
        jx2.j jVar = this.f557290f;
        jVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchor, "anchor");
        jVar.f383967d = measuredWidth;
        jVar.a(anchor, null);
        android.view.View findViewById = jVar.getContentView().findViewById(com.p314xaae8f345.mm.R.id.a4x);
        android.view.View findViewById2 = jVar.getContentView().findViewById(com.p314xaae8f345.mm.R.id.a4q);
        if (findViewById != null) {
            findViewById.requestLayout();
        }
        if (findViewById2 != null) {
            findViewById2.requestLayout();
        }
    }
}
