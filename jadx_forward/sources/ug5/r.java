package ug5;

/* loaded from: classes3.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f509178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ug5.v f509179e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f509180f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f509181g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ug5.i f509182h;

    public r(android.view.View view, ug5.v vVar, android.widget.FrameLayout frameLayout, android.view.View view2, ug5.i iVar) {
        this.f509178d = view;
        this.f509179e = vVar;
        this.f509180f = frameLayout;
        this.f509181g = view2;
        this.f509182h = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f509178d;
        view.animate().setListener(null);
        view.animate().setUpdateListener(null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("do Animation, withEndAction done, params: ");
        ug5.v vVar = this.f509179e;
        sb6.append(vVar.f509191a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentPerformer", sb6.toString());
        android.widget.FrameLayout frameLayout = this.f509180f;
        ug5.i iVar = this.f509182h;
        android.view.View view2 = this.f509181g;
        ug5.v vVar2 = this.f509179e;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (n3.x0.b(frameLayout)) {
            frameLayout.addOnAttachStateChangeListener(new ug5.q(frameLayout, iVar, view2, frameLayout, vVar2));
        } else {
            android.content.Context context = view2.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            iVar.a(context, view2, frameLayout, vVar2);
        }
        ug5.g gVar = vVar.f509191a;
        boolean z17 = gVar.f509143x;
        android.view.View view3 = this.f509181g;
        if (z17) {
            ug5.o oVar = new ug5.o(vVar);
            gVar.getClass();
            view3.postDelayed(oVar, 0L);
        } else {
            long j17 = gVar.f509137r;
            if (j17 > 0) {
                view3.postDelayed(new ug5.p(vVar), j17);
            }
        }
    }
}
