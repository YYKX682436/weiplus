package nj2;

/* loaded from: classes10.dex */
public final class r extends nj2.n {

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f419391u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(android.view.View parentView, nj2.z panel, android.view.View root, gk2.e liveData, zh2.e micUserInterface) {
        super(root, liveData, micUserInterface);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentView, "parentView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micUserInterface, "micUserInterface");
        this.f419391u = parentView;
        this.f419387t = new yh2.l(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.pk.p1509xbeeb310a.C14241x3314254d(liveData, new nj2.q(this)), this.f419385r);
        this.f419379i.mo7960x6cab2c8d(h().f());
    }

    @Override // nj2.n
    public ej2.j c() {
        return new ej2.n(this.f419391u, this.f419375e, this.f419376f);
    }

    @Override // nj2.n
    public void d() {
        android.view.View view = this.f419374d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveVoiceRoomApplyPanelWidget", "emptyViewHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveVoiceRoomApplyPanelWidget", "emptyViewHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f419379i.setVisibility(0);
        android.view.View view2 = this.f419382o;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveVoiceRoomApplyPanelWidget", "emptyViewHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveVoiceRoomApplyPanelWidget", "emptyViewHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveVoiceRoomApplyPanelWidget", "emptyViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveVoiceRoomApplyPanelWidget", "emptyViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f419374d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveVoiceRoomApplyPanelWidget", "emptyViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveVoiceRoomApplyPanelWidget", "emptyViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // nj2.n
    public void f() {
        java.util.ArrayList arrayList;
        int i17;
        this.f419385r.clear();
        java.util.ArrayList arrayList2 = this.f419385r;
        java.util.List list = ((mm2.o4) this.f419375e.a(mm2.o4.class)).f410851o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-linkMicUserList>(...)");
        synchronized (list) {
            arrayList = new java.util.ArrayList();
            i17 = 0;
            for (java.lang.Object obj : list) {
                km2.q qVar = (km2.q) obj;
                java.lang.String str = qVar.f390703a;
                if (str == null) {
                    str = "";
                }
                boolean l17 = l(str);
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
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(new vi2.k((km2.q) it.next()));
        }
        arrayList2.addAll(arrayList3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f419377g, "fillApplyLinkUserList timeOutSize: " + i17 + " applyRealSize: " + this.f419385r.size());
    }

    @Override // nj2.n
    public java.lang.String j() {
        return "VoiceRoomApplyPanelWidget";
    }
}
