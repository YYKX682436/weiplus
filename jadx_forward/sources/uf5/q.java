package uf5;

/* loaded from: classes8.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf5.x f508816d;

    public q(uf5.x xVar) {
        this.f508816d = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        uf5.l lVar;
        uf5.k kVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/privacy/BatchLabelUIC$initBatchBottomBar$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        uf5.x xVar = this.f508816d;
        j75.f Q6 = xVar.Q6();
        if (Q6 != null && (lVar = (uf5.l) Q6.mo140437x75286adb()) != null && (kVar = xVar.f508859i) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(lVar.f508800f);
            if (!arrayList2.isEmpty()) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2);
                java.util.HashSet hashSet = new java.util.HashSet(arrayList2);
                bh5.c cVar = new bh5.c();
                android.app.Activity activity = kVar.f508787a;
                bh5.d dVar = cVar.f102455a;
                dVar.f102457a = activity;
                cVar.c(true);
                dVar.f102460d.f314154g = new uf5.j(kVar, hashSet, arrayList3);
                cVar.f(false);
                cVar.g();
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/privacy/BatchLabelUIC$initBatchBottomBar$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
