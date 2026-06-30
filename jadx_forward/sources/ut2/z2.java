package ut2;

/* loaded from: classes3.dex */
public final class z2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.n00 f512705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f512706e;

    public z2(bw5.n00 n00Var, ut2.s3 s3Var) {
        this.f512705d = n00Var;
        this.f512706e = s3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingViewHolder$setupAskForOpenPriceGroup$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bw5.n00 n00Var = this.f512705d;
        bw5.x7 x7Var = n00Var.f111983h[3] ? n00Var.f111981f : new bw5.x7();
        if (x7Var != null) {
            i95.m c17 = i95.n0.c(pq.q.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            pq.q qVar = (pq.q) c17;
            android.content.Context context = this.f512706e.H().getContext();
            if (context == null) {
                context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            pq.q.Lb(qVar, new pq.a(context), x7Var, null, 4, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingViewHolder$setupAskForOpenPriceGroup$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
