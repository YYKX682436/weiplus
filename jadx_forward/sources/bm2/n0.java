package bm2;

/* loaded from: classes3.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.v0 f103655d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.c52 f103656e;

    public n0(bm2.v0 v0Var, r45.c52 c52Var) {
        this.f103655d = v0Var;
        this.f103656e = c52Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        gk2.e q57;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bm2.v0 v0Var = this.f103655d;
        android.view.View.OnClickListener onClickListener = v0Var.f103902o;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            wt2.a aVar = v0Var.f103901n;
            boolean z17 = false;
            if (aVar != null && (q57 = aVar.q5()) != null && ((mm2.c1) q57.a(mm2.c1.class)).S) {
                z17 = true;
            }
            int i17 = z17 ? 8 : 6;
            bf2.c cVar = bf2.c.f101131a;
            java.lang.String m75945x2fec8307 = this.f103656e.m75945x2fec8307(3);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            bf2.c.b(cVar, eVar, i17, 3, m75945x2fec8307, 0, 16, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
