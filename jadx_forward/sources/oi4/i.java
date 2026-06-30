package oi4;

/* loaded from: classes.dex */
public final class i implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oi4.j f427172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f427173e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f427174f;

    public i(oi4.j jVar, in5.s0 s0Var, int i17) {
        this.f427172d = jVar;
        this.f427173e = s0Var;
        this.f427174f = i17;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/like/LikeItemConvert$onBindViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        yz5.q qVar = this.f427172d.f427175g;
        if (qVar != null) {
            android.view.View itemView = this.f427173e.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/textstatus/convert/like/LikeItemConvert$onBindViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
