package cj5;

/* loaded from: classes.dex */
public class s extends zm3.b {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f123763d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f123764e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f123763d = jz5.h.b(new cj5.r(this));
        this.f123764e = jz5.h.b(new cj5.q(activity));
    }

    public static final void U6(cj5.s sVar, wi5.n0 n0Var) {
        sVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiSelectContactMvvmListUIC", "handleSelectionFromOtherPage selectUserSet:" + n0Var.f527852o);
        boolean W6 = sVar.W6();
        java.util.LinkedList linkedList = n0Var.f527852o;
        if (W6) {
            sVar.X6().c().f();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                sVar.X6().c().d((java.lang.String) it.next());
            }
            return;
        }
        sVar.X6().b().f();
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            sVar.X6().b().d((java.lang.String) it6.next());
        }
    }

    public static final void V6(cj5.s sVar, wi5.n0 n0Var) {
        sVar.getClass();
        if (n0Var.f527852o.size() <= 0 || sVar.W6()) {
            return;
        }
        sVar.Y6(com.p314xaae8f345.mm.ui.zk.e(sVar.m158354x19263085(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561267dr));
    }

    public final boolean W6() {
        return ((java.lang.Boolean) ((jz5.n) this.f123764e).mo141623x754a37bb()).booleanValue();
    }

    public final em.l2 X6() {
        return (em.l2) ((jz5.n) this.f123763d).mo141623x754a37bb();
    }

    public final void Y6(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6;
        j75.f m67437x4bd5310;
        if (W6() || (P6 = P6()) == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.B3(new wi5.t(i17));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(m158354x19263085(), new cj5.p(this));
    }
}
