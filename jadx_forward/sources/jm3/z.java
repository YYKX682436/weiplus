package jm3;

/* loaded from: classes10.dex */
public final class z implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c3 f381902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a f381903e;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c3 c3Var, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a activityC16653xffd2636a) {
        this.f381902d = c3Var;
        this.f381903e = activityC16653xffd2636a;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.util.HashSet hashSet = (java.util.HashSet) obj;
        boolean z17 = false;
        if (!(hashSet instanceof java.util.Collection) || !hashSet.isEmpty()) {
            java.util.Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((gm3.c) it.next()).f355077e != 0) {
                    z17 = true;
                    break;
                }
            }
        }
        if (this.f381902d.P6()) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a.f232401u;
            this.f381903e.c7(z17);
        }
        return jz5.f0.f384359a;
    }
}
