package kl2;

/* loaded from: classes3.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl2.v f390343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f390344e;

    public r(kl2.v vVar, int i17) {
        this.f390343d = vVar;
        this.f390344e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/quota/widget/RestrictConsumeManagerListWidget$ItemAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kl2.v vVar = this.f390343d;
        java.util.LinkedList linkedList = vVar.f390355n;
        java.util.Iterator it = linkedList.iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            int i18 = this.f390344e;
            if (!hasNext) {
                vVar.f390356o.m8146xced61ae5();
                vVar.a();
                vVar.f390352h.mo146xb9724478(java.lang.Long.valueOf(((kl2.t) linkedList.get(i18)).f390347a));
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/quota/widget/RestrictConsumeManagerListWidget$ItemAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            java.lang.Object next = it.next();
            int i19 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            ((kl2.t) next).f390348b = i17 == i18;
            i17 = i19;
        }
    }
}
