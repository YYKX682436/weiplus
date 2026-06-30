package ut2;

/* loaded from: classes3.dex */
public final class g4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.zv f512424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.h4 f512425e;

    public g4(bw5.zv zvVar, ut2.h4 h4Var) {
        this.f512424d = zvVar;
        this.f512425e = h4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderGuideHolder$refreshGuideLayout$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bw5.zv zvVar = this.f512424d;
        bw5.x7 x7Var = zvVar.f117726m[3] ? zvVar.f117722f : new bw5.x7();
        if (x7Var != null) {
            i95.m c17 = i95.n0.c(pq.q.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            pq.q qVar = (pq.q) c17;
            android.content.Context context = this.f512425e.f512437c.getContext();
            if (context == null) {
                context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            pq.q.Lb(qVar, new pq.a(context), x7Var, null, 4, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderGuideHolder$refreshGuideLayout$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
