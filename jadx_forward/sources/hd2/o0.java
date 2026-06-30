package hd2;

/* loaded from: classes2.dex */
public final class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f362039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14135xb71edba3 f362040e;

    public o0(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14135xb71edba3 c14135xb71edba3) {
        this.f362039d = context;
        this.f362040e = c14135xb71edba3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment$onNormalOrAbnormal$finderAccountAreaClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        ya2.g gVar = ya2.h.f542017a;
        android.content.Context context = this.f362039d;
        ya2.b2 b17 = gVar.b(xy2.c.e(context));
        if (b17 != null && b17.G0()) {
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15028x68e5fbe.class);
            android.content.Context context2 = this.f362039d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment$onNormalOrAbnormal$finderAccountAreaClickListener$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment$onNormalOrAbnormal$finderAccountAreaClickListener$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            g92.b bVar = g92.b.f351302e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14135xb71edba3 c14135xb71edba3 = this.f362040e;
            m92.i X4 = bVar.X4(c14135xb71edba3.f191586q);
            jz5.f0 f0Var = null;
            if (X4 != null) {
                if (X4.f406520a == 1) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Mj(context, c14135xb71edba3.f191586q);
                    c14135xb71edba3.f191585p = null;
                } else {
                    c14135xb71edba3.t0(context);
                }
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                c14135xb71edba3.t0(context);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment$onNormalOrAbnormal$finderAccountAreaClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
