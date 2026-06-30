package nj2;

/* loaded from: classes10.dex */
public final class j extends nj2.n {

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f419370u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.view.View parentView, nj2.h panel, android.view.View root, gk2.e liveData, zh2.e micUserInterface) {
        super(root, liveData, micUserInterface);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentView, "parentView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micUserInterface, "micUserInterface");
        this.f419370u = parentView;
        this.f419387t = new yh2.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.pk.p1509xbeeb310a.C14237xc8c44bd2(liveData, new nj2.i(this)), this.f419385r);
        this.f419379i.N(new ii2.c(new ii2.a(parentView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560847vu), new android.graphics.Rect(0, 0, 0, 1), ii2.b.f373154d, null, 8, null)));
        this.f419379i.mo7960x6cab2c8d(h().f());
    }

    @Override // nj2.n
    public ej2.j c() {
        return new ej2.n(this.f419370u, this.f419375e, this.f419376f);
    }

    @Override // nj2.n
    public void d() {
        android.view.View view = this.f419374d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveApplyPayMicPanelWidget", "emptyViewHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveApplyPayMicPanelWidget", "emptyViewHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f419379i.setVisibility(0);
        android.view.View view2 = this.f419382o;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveApplyPayMicPanelWidget", "emptyViewHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveApplyPayMicPanelWidget", "emptyViewHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f419384q.setText(this.f419374d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dvt, java.lang.Integer.valueOf(this.f419385r.size())));
    }

    @Override // nj2.n
    public void e() {
        this.f419379i.setVisibility(8);
        android.view.View view = this.f419382o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveApplyPayMicPanelWidget", "emptyViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveApplyPayMicPanelWidget", "emptyViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f419374d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveApplyPayMicPanelWidget", "emptyViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveApplyPayMicPanelWidget", "emptyViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // nj2.n
    public void f() {
        java.util.ArrayList<km2.q> arrayList;
        int i17;
        java.lang.String str;
        this.f419385r.clear();
        java.util.ArrayList arrayList2 = this.f419385r;
        java.util.List list = ((mm2.o4) this.f419375e.a(mm2.o4.class)).f410851o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-linkMicUserList>(...)");
        synchronized (list) {
            arrayList = new java.util.ArrayList();
            i17 = 0;
            for (java.lang.Object obj : list) {
                km2.q qVar = (km2.q) obj;
                java.lang.String str2 = qVar.f390703a;
                if (str2 == null) {
                    str2 = "";
                }
                boolean l17 = l(str2);
                boolean z17 = true;
                boolean z18 = qVar.A > 0 && c01.id.c() > qVar.A && !l17;
                if (z18) {
                    i17++;
                }
                if (qVar.f390710h || z18 || l17) {
                    z17 = false;
                }
                if (z17) {
                    arrayList.add(obj);
                }
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (km2.q qVar2 : arrayList) {
            km2.b0 b0Var = qVar2.f390702J;
            if (b0Var == null || (str = b0Var.f390608b) == null) {
                str = "";
            }
            arrayList3.add(new vi2.a(qVar2, str, b0Var != null ? b0Var.f390607a : 0));
        }
        arrayList2.addAll(arrayList3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f419377g, "fillApplyLinkUserList timeOutSize: " + i17 + " applyRealSize: " + this.f419385r.size());
    }

    @Override // nj2.n
    public java.lang.String j() {
        return "VoiceRoomApplyPanelWidget";
    }
}
