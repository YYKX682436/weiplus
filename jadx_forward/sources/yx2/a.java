package yx2;

/* loaded from: classes8.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx2.f f549360d;

    public a(yx2.f fVar) {
        this.f549360d = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea;
        r45.xk a17;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/snscover/FinderDetailLoader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yx2.f fVar = this.f549360d;
        android.content.Context context = fVar.f549380f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "access$getContext$p(...)");
        if (fVar.f549381g != null) {
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = fVar.f549381g;
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b((c19792x256d2725 == null || (m76760x76845fea3 = c19792x256d2725.m76760x76845fea()) == null) ? null : m76760x76845fea3.m76197x6c03c64c(), xy2.c.e(context));
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = fVar.f549381g;
            intent.putExtra("finder_username", (c19792x256d27252 == null || (m76760x76845fea2 = c19792x256d27252.m76760x76845fea()) == null) ? null : m76760x76845fea2.m76197x6c03c64c());
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 = fVar.f549381g;
            if (c19792x256d27253 == null || (m76760x76845fea = c19792x256d27253.m76760x76845fea()) == null || (a17 = ya2.d.a(m76760x76845fea, false)) == null || (str = a17.m75945x2fec8307(0)) == null) {
                str = "";
            }
            intent.putExtra("key_biz_username", str);
            ya2.e1 e1Var = ya2.e1.f542005a;
            if (b17) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                e1Var.x(context, intent, 20, 2);
            } else {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27254 = fVar.f549381g;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 w17 = c19792x256d27254 != null ? hc2.o0.w(c19792x256d27254) : null;
                if (w17 == null || !hc2.g0.e(w17, context, 0)) {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(20, 2, 32, intent);
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    e1Var.w(context, intent);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/snscover/FinderDetailLoader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
