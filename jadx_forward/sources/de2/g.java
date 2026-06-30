package de2;

/* loaded from: classes3.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f310910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f310911e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ de2.h f310912f;

    public g(android.widget.Button button, yz5.a aVar, de2.h hVar) {
        this.f310910d = button;
        this.f310911e = aVar;
        this.f310912f = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/box/FinderLiveBoxHintBottomSheet$btnTextView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.Button button = this.f310910d;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(button.getText(), button.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573073dg5));
        de2.h hVar = this.f310912f;
        if (b17) {
            ml2.t1 t1Var = ml2.t1.C1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveBoxReportUtils", "boxClickReport elementId: group_chat_button");
            i95.m c17 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, t1Var, null, null, null, null, null, false, 126, null);
            this.f310911e.mo152xb9724478();
            hVar.f310917e.f526369c.q();
        } else {
            hVar.f310917e.f526369c.q();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/box/FinderLiveBoxHintBottomSheet$btnTextView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
