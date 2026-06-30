package ut2;

/* loaded from: classes3.dex */
public final class f3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f512409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f512410e;

    public f3(cm2.m0 m0Var, ut2.s3 s3Var) {
        this.f512409d = m0Var;
        this.f512410e = s3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        bw5.x7 x7Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingViewHolder$setupRemindLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.no5 no5Var = this.f512409d.Q;
        if (no5Var != null && (x7Var = (bw5.x7) no5Var.m75936x14adae67(2)) != null) {
            i95.m c17 = i95.n0.c(pq.q.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            pq.q qVar = (pq.q) c17;
            android.content.Context context = this.f512410e.H().getContext();
            if (context == null) {
                context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            pq.q.Lb(qVar, new pq.a(context), x7Var, null, 4, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingViewHolder$setupRemindLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
