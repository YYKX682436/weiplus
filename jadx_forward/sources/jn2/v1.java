package jn2;

/* loaded from: classes10.dex */
public final class v1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.s1 f382251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn2.z1 f382252e;

    public v1(jn2.s1 s1Var, jn2.z1 z1Var) {
        this.f382251d = s1Var;
        this.f382252e = z1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanelAdapter$onBindSingSongHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int m8183xf806b362 = this.f382251d.m8183xf806b362();
        jn2.z1 z1Var = this.f382252e;
        if (m8183xf806b362 >= 0 && m8183xf806b362 < z1Var.f382302h.size()) {
            java.lang.Object obj = z1Var.f382302h.get(m8183xf806b362);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            r45.z22 z22Var = (r45.z22) obj;
            nf2.w wVar = (nf2.w) z1Var.f382300f.m56789x25fe639c(nf2.w.class);
            if (wVar != null) {
                nf2.d1 d1Var = wVar.f418341m;
                if (d1Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1489xbf29e7f4.C14199x90952ee3 c14199x90952ee3 = d1Var.f418231s;
                    if (c14199x90952ee3 != null) {
                        c14199x90952ee3.i();
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsView", "stopRender");
                }
                wVar.f418346r = false;
                wVar.b7();
            }
            yz5.p pVar = z1Var.f382304m;
            if (pVar != null) {
                pVar.mo149xb9724478(java.lang.Integer.valueOf(m8183xf806b362), z22Var);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanelAdapter$onBindSingSongHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
