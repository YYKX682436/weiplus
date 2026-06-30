package jx2;

/* loaded from: classes3.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jx2.k f383950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jx2.h f383951e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f383952f;

    public g(jx2.k kVar, jx2.h hVar, android.content.Context context) {
        this.f383950d = kVar;
        this.f383951e = hVar;
        this.f383952f = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController$showSecondPage$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jx2.h hVar = this.f383951e;
        java.util.List S0 = kz5.n0.S0(hVar.f383962j);
        jx2.k kVar = this.f383950d;
        jx2.l lVar = (jx2.l) kVar;
        lVar.getClass();
        jx2.a aVar = (jx2.a) kz5.n0.Z(S0);
        if (aVar != null) {
            lVar.f383971c.b(aVar.f383932a);
        }
        hVar.f383962j.isEmpty();
        java.lang.String string = ((jx2.l) kVar).f383969a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ck6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        db5.t7.h(this.f383952f, string);
        yz5.a aVar2 = hVar.f383963k;
        if (aVar2 != null) {
            aVar2.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController$showSecondPage$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
