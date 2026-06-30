package mh2;

/* loaded from: classes10.dex */
public final class q implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.C14229xb3dcfb39 f407972d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.C14229xb3dcfb39 c14229xb3dcfb39) {
        this.f407972d = c14229xb3dcfb39;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        r45.ay1 ay1Var;
        java.util.List list = (java.util.List) obj;
        java.lang.String str = null;
        r45.yx1 yx1Var = list != null ? (r45.yx1) kz5.n0.Z(list) : null;
        if (yx1Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Song state updated: ");
            r45.by1 by1Var = yx1Var.f472999o;
            if (by1Var != null && (ay1Var = by1Var.f452676d) != null) {
                str = ay1Var.f451884e;
            }
            sb6.append(str);
            sb6.append(", pause=");
            sb6.append(yx1Var.f472998n);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVInteractiveWidget", sb6.toString());
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.C14229xb3dcfb39.f193195p;
            this.f407972d.b(yx1Var);
        }
        return jz5.f0.f384359a;
    }
}
