package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes.dex */
public final class k1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 f194713d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f194714e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var, yz5.p pVar) {
        super(1);
        this.f194713d = v3Var;
        this.f194714e = pVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.m02 m02Var;
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj2;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiLongFeedGen errCode:");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152148a) : null);
        sb6.append(", errType:");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152149b) : null);
        sb6.append(",errMsg:");
        sb6.append(fVar != null ? fVar.f152150c : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveAnchorAfterPlugin", sb6.toString());
        if (fVar == null || (m02Var = (r45.m02) fVar.f152151d) == null || (m75941xfb821914 = m02Var.m75941xfb821914(1)) == null) {
            return null;
        }
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((r45.ix0) obj2).m75939xb282bd08(0) == 0) {
                break;
            }
        }
        r45.ix0 ix0Var = (r45.ix0) obj2;
        if (ix0Var == null) {
            return null;
        }
        if (ix0Var.m75939xb282bd08(1) != 0) {
            java.lang.String m75945x2fec8307 = ix0Var.m75945x2fec8307(2);
            if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                android.content.Context context = this.f194713d.f446856d.getContext();
                int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                e4Var.f293309c = ix0Var.m75945x2fec8307(2);
                e4Var.c();
            }
        }
        yz5.p pVar = this.f194714e;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(ix0Var.m75939xb282bd08(1)), ix0Var.m75945x2fec8307(2));
        }
        return jz5.f0.f384359a;
    }
}
