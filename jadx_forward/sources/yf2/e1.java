package yf2;

/* loaded from: classes3.dex */
public final class e1 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf2.m1 f543217d;

    public e1(yf2.m1 m1Var) {
        this.f543217d = m1Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.util.LinkedList linkedList = (java.util.LinkedList) obj;
        yf2.m1 m1Var = this.f543217d;
        m1Var.getClass();
        m1Var.f543282n = linkedList;
        yf2.t tVar = m1Var.f543284p;
        kz5.h0.B(tVar.f543320a, yf2.s.f543313d);
        java.util.Iterator it = ((java.util.ArrayList) tVar.f543320a).iterator();
        while (it.hasNext()) {
            yf2.r rVar = (yf2.r) ((java.lang.ref.WeakReference) it.next()).get();
            if (rVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z60 z60Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z60) rVar;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onModeInfoListChanged: size=");
                sb6.append(linkedList != null ? linkedList.size() : 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStartLiveModeTabWidget", sb6.toString());
                java.util.List i17 = z60Var.i(linkedList);
                z60Var.f202077r = i17;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b60 b60Var = z60Var.f202073n;
                if (b60Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabAdapter");
                    throw null;
                }
                b60Var.f199374e = i17;
                b60Var.m8146xced61ae5();
                android.widget.LinearLayout linearLayout = z60Var.f202072m;
                if (linearLayout == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentContainer");
                    throw null;
                }
                linearLayout.removeAllViews();
                z60Var.f();
                z60Var.e();
                z60Var.q();
            }
        }
        return jz5.f0.f384359a;
    }
}
