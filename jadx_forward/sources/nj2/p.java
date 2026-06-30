package nj2;

/* loaded from: classes10.dex */
public final class p extends nj2.n {

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f419389u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.view.View parentRoot, android.view.View root, gk2.e liveData, zh2.e userInterface) {
        super(root, liveData, userInterface);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentRoot, "parentRoot");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userInterface, "userInterface");
        this.f419389u = parentRoot;
        this.f419387t = new yh2.j(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.pk.p1509xbeeb310a.C14241x3314254d(liveData, new nj2.o(this)), this.f419385r);
        this.f419379i.mo7960x6cab2c8d(h().f());
    }

    @Override // nj2.n
    public ej2.j c() {
        return new ej2.n(this.f419389u, this.f419375e, this.f419376f);
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
            arrayList3.add(new vi2.j((km2.q) it.next()));
        }
        arrayList2.addAll(arrayList3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f419377g, "fillApplyLinkUserList timeOutSize: " + i17 + " applyRealSize: " + this.f419385r.size());
    }

    @Override // nj2.n
    public java.lang.String j() {
        return "FinderLiveVisitorApplyPanelWidget";
    }
}
