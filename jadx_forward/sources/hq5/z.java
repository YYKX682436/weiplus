package hq5;

/* loaded from: classes5.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq5.a0 f364817d;

    public z(hq5.a0 a0Var) {
        this.f364817d = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        cq5.a aVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wedrop/ui/uic/ui/WeDropPreviewUIC$onCreateAfter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hq5.a0 a0Var = this.f364817d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a0Var.f364747d, "click preview area, state: " + a0Var.f364750g);
        if (a0Var.f364750g == 10) {
            boolean T6 = hq5.a0.T6(a0Var);
            jq5.o oVar = jq5.o.f382816a;
            if (T6) {
                oVar.b(a0Var.m158354x19263085());
            } else {
                oVar.c(a0Var.m158354x19263085());
            }
        }
        int i17 = a0Var.f364750g;
        if (i17 != 15) {
            switch (i17) {
                case 7:
                    break;
                case 8:
                    if (!hq5.a0.T6(a0Var)) {
                        aVar = cq5.a.f303027i;
                        break;
                    } else {
                        aVar = cq5.a.f303028m;
                        break;
                    }
                case 9:
                    if (!hq5.a0.T6(a0Var)) {
                        aVar = cq5.a.f303025g;
                        break;
                    } else {
                        aVar = cq5.a.f303026h;
                        break;
                    }
                case 10:
                    if (!hq5.a0.T6(a0Var)) {
                        aVar = cq5.a.f303029n;
                        break;
                    } else {
                        aVar = cq5.a.f303030o;
                        break;
                    }
                default:
                    yj0.a.h(this, "com/tencent/mm/wedrop/ui/uic/ui/WeDropPreviewUIC$onCreateAfter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
            }
            cq5.i.f303076a.d(aVar);
            yj0.a.h(this, "com/tencent/mm/wedrop/ui/uic/ui/WeDropPreviewUIC$onCreateAfter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
        aVar = hq5.a0.T6(a0Var) ? cq5.a.f303024f : cq5.a.f303023e;
        cq5.i.f303076a.d(aVar);
        yj0.a.h(this, "com/tencent/mm/wedrop/ui/uic/ui/WeDropPreviewUIC$onCreateAfter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
