package ny2;

/* loaded from: classes.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ny2.h f422962d;

    public f(ny2.h hVar) {
        this.f422962d = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.le2 le2Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/vote/uic/FinderLiveAnchorEditVoteUIC$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ny2.h hVar = this.f422962d;
        hVar.f422971n.a();
        ky2.w wVar = hVar.f422967g;
        ky2.r rVar = null;
        if (wVar != null) {
            r45.le2 le2Var2 = new r45.le2();
            java.util.List dataList = wVar.f395118e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(dataList, "dataList");
            java.util.Iterator it = dataList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ?? next = it.next();
                if ((((ky2.r) next).f395110c == 0) != false) {
                    rVar = next;
                    break;
                }
            }
            ky2.r rVar2 = rVar;
            if (rVar2 != null) {
                ky2.s sVar = rVar2.f395109b;
                le2Var2.set(3, java.lang.Integer.valueOf(sVar.f395112b * 60));
                le2Var2.set(1, sVar.f395113c);
                le2Var2.set(0, java.lang.Integer.valueOf(!sVar.f395111a ? 1 : 0));
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : dataList) {
                if ((((ky2.r) obj).f395110c == 2) != false) {
                    arrayList2.add(obj);
                }
            }
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                ky2.r rVar3 = (ky2.r) it6.next();
                java.lang.String str = rVar3.f395108a;
                if ((str == null || str.length() == 0) == false) {
                    java.util.LinkedList m75941xfb821914 = le2Var2.m75941xfb821914(2);
                    r45.m30 m30Var = new r45.m30();
                    m30Var.set(0, rVar3.f395108a);
                    m75941xfb821914.add(m30Var);
                }
            }
            le2Var = le2Var2;
        } else {
            le2Var = null;
        }
        pq5.g l17 = new ly2.b(hVar.f422968h, hVar.f422969i, hVar.f422970m, le2Var, 0).l();
        l17.K(new ny2.e(hVar));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = hVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/vote/uic/FinderLiveAnchorEditVoteUIC$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
