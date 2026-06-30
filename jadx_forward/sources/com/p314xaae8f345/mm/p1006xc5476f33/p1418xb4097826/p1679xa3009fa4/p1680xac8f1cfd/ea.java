package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class ea extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f215773d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f215774e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f215775f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f215773d = new java.util.ArrayList();
    }

    public final void O6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ba request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        boolean z17 = this.f215775f;
        java.lang.String str = request.f215393b;
        if (z17 && this.f215774e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDialogCoordinatorUIC", "registerDialogRequest: skipped, dialog is showing, name=" + str);
            return;
        }
        java.util.List list = this.f215773d;
        kz5.h0.B(list, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ca(request));
        ((java.util.ArrayList) list).add(request);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDialogCoordinatorUIC", "registerDialogRequest: name=" + str + ", priority=" + request.f215392a);
        if (!this.f215775f || this.f215774e) {
            return;
        }
        P6();
    }

    public final void P6() {
        if (!this.f215775f || this.f215774e) {
            return;
        }
        java.util.List list = this.f215773d;
        if (((java.util.ArrayList) list).isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDialogCoordinatorUIC", "showHighestPriority: no pending dialogs");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ba baVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ba) kz5.n0.X(kz5.n0.F0(list, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.da()));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (true ^ p3321xbce91901.jvm.p3324x21ffc6bd.o.b((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ba) obj, baVar)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ba) it.next()).f215393b);
        }
        ((java.util.ArrayList) list).clear();
        this.f215774e = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDialogCoordinatorUIC", "showHighestPriority: showing " + baVar.f215393b + ", dropped=" + arrayList2);
        baVar.f215394c.mo152xb9724478();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        if (bundle != null) {
            this.f215775f = true;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onEnterAnimationComplete */
    public void mo53055x51d329a4() {
        super.mo53055x51d329a4();
        this.f215775f = true;
        P6();
    }
}
