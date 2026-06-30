package in5;

/* loaded from: classes8.dex */
public final class m0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.n0 f374624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f374625e;

    public m0(in5.n0 n0Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        this.f374624d = n0Var;
        this.f374625e = k3Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/recyclerview/RecyclerViewAdapterEx$onCreateViewHolder$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(motionEvent, "motionEvent");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 m07 = this.f374624d.b0().m0(view);
        int m8183xf806b362 = m07 != null ? m07.m8183xf806b362() : -1;
        in5.n0 n0Var = this.f374624d;
        in5.z zVar = n0Var.f374639p;
        boolean f17 = zVar != null ? zVar.f(n0Var, view, m8183xf806b362, this.f374625e, motionEvent) : false;
        yj0.a.i(f17, this, "com/tencent/mm/view/recyclerview/RecyclerViewAdapterEx$onCreateViewHolder$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return f17;
    }
}
