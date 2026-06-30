package in5;

/* loaded from: classes.dex */
public final class e1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f374565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f374566e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f374567f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.c f374568g;

    public e1(com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf, int i17, android.view.View view, in5.c cVar) {
        this.f374565d = c22848x6ddd90cf;
        this.f374566e = i17;
        this.f374567f = view;
        this.f374568g = cVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/recyclerview/WxRecyclerAdapter$bindViewListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f374565d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 m07 = c22848x6ddd90cf.b0().m0(view);
        int m8183xf806b362 = m07 != null ? m07.m8183xf806b362() : this.f374566e;
        in5.u uVar = c22848x6ddd90cf.B;
        if (uVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(motionEvent);
            z17 = uVar.a(this.f374567f, motionEvent, this.f374568g, m8183xf806b362);
        } else {
            z17 = false;
        }
        yj0.a.i(z17, this, "com/tencent/mm/view/recyclerview/WxRecyclerAdapter$bindViewListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
