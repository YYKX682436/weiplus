package jf2;

/* loaded from: classes3.dex */
public final class f0 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jf2.k0 f380903d;

    public f0(jf2.k0 k0Var) {
        this.f380903d = k0Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.util.LinkedList m75941xfb821914;
        r45.a84 a84Var = (r45.a84) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("coAuthorInfo updated: contactCount=");
        sb6.append((a84Var == null || (m75941xfb821914 = a84Var.m75941xfb821914(1)) == null) ? null : new java.lang.Integer(m75941xfb821914.size()));
        sb6.append(", refresh fold state");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVisitorBottomEntranceController", sb6.toString());
        this.f380903d.a7("coAuthorInfoChange", true);
        return jz5.f0.f384359a;
    }
}
