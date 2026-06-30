package qi2;

/* loaded from: classes10.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qi2.z f445186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi2.c0 f445187e;

    public x(qi2.z zVar, qi2.c0 c0Var) {
        this.f445186d = zVar;
        this.f445187e = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorTeamPkApplyPanelWidget$TeamViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qi2.z zVar = this.f445186d;
        if (zVar.f445201k) {
            qi2.c0 c0Var = this.f445187e;
            c0Var.getClass();
            fj2.k kVar = zVar.f445196f;
            fj2.k kVar2 = fj2.k.f344708d;
            java.util.LinkedList linkedList = c0Var.f445040p;
            java.util.LinkedList linkedList2 = c0Var.f445039o;
            if (kVar == kVar2) {
                if (linkedList.size() <= 2) {
                    zVar.a(fj2.k.f344709e);
                    fg2.g gVar = c0Var.f445038n;
                    if (gVar == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                        throw null;
                    }
                    android.widget.LinearLayout blueTeamLayout = gVar.f343567b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(blueTeamLayout, "blueTeamLayout");
                    c0Var.z(zVar, blueTeamLayout);
                    km2.q qVar = zVar.f445197g;
                    if (qVar != null) {
                        linkedList2.remove(qVar);
                        linkedList.add(qVar);
                    }
                }
            } else if (linkedList2.size() <= 2) {
                zVar.a(kVar2);
                fg2.g gVar2 = c0Var.f445038n;
                if (gVar2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                android.widget.LinearLayout redTeamLayout = gVar2.f343572g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(redTeamLayout, "redTeamLayout");
                c0Var.z(zVar, redTeamLayout);
                km2.q qVar2 = zVar.f445197g;
                if (qVar2 != null) {
                    linkedList.remove(qVar2);
                    linkedList2.add(qVar2);
                }
            }
            c0Var.C();
        } else {
            db5.t7.m123882x26a183b(zVar.f445191a.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.eg9, 0).show();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorTeamPkApplyPanelWidget$TeamViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
