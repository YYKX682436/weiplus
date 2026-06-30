package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class td0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.de0 f195920d;

    public td0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.de0 de0Var) {
        this.f195920d = de0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message msg) {
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z27;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        int i17 = msg.what;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.de0 de0Var = this.f195920d;
        if (i17 == de0Var.f193812t) {
            java.lang.Object obj = msg.obj;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveMsg");
            r45.t12 t12Var = (r45.t12) obj;
            de0Var.getClass();
            r45.xn1 xn1Var = (r45.xn1) t12Var.m75936x14adae67(8);
            java.util.LinkedList<r45.yl1> m75941xfb821914 = xn1Var != null ? xn1Var.m75941xfb821914(11) : null;
            if (m75941xfb821914 != null) {
                for (r45.yl1 yl1Var : m75941xfb821914) {
                    if (yl1Var.m75939xb282bd08(0) == 5) {
                        z17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(yl1Var.m75945x2fec8307(4), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573002d60));
                        break;
                    }
                }
            }
            z17 = false;
            r45.xn1 xn1Var2 = (r45.xn1) t12Var.m75936x14adae67(8);
            java.util.LinkedList<r45.yl1> m75941xfb8219142 = xn1Var2 != null ? xn1Var2.m75941xfb821914(11) : null;
            if (m75941xfb8219142 != null) {
                for (r45.yl1 yl1Var2 : m75941xfb8219142) {
                    if (yl1Var2.m75939xb282bd08(0) == 5) {
                        z18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(yl1Var2.m75945x2fec8307(4), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dtf));
                        break;
                    }
                }
            }
            z18 = false;
            r45.xn1 xn1Var3 = (r45.xn1) t12Var.m75936x14adae67(8);
            java.util.LinkedList<r45.yl1> m75941xfb8219143 = xn1Var3 != null ? xn1Var3.m75941xfb821914(11) : null;
            if (m75941xfb8219143 != null) {
                for (r45.yl1 yl1Var3 : m75941xfb8219143) {
                    if (yl1Var3.m75939xb282bd08(0) == 20) {
                        z19 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(yl1Var3.m75945x2fec8307(4), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ouc));
                        break;
                    }
                }
            }
            z19 = false;
            r45.xn1 xn1Var4 = (r45.xn1) t12Var.m75936x14adae67(8);
            java.util.LinkedList<r45.yl1> m75941xfb8219144 = xn1Var4 != null ? xn1Var4.m75941xfb821914(11) : null;
            if (m75941xfb8219144 != null) {
                for (r45.yl1 yl1Var4 : m75941xfb8219144) {
                    if (yl1Var4.m75939xb282bd08(0) == -10001) {
                        z27 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(yl1Var4.m75945x2fec8307(4), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.npz));
                        break;
                    }
                }
            }
            z27 = false;
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zd0(de0Var, t12Var, z17, z18, z19, z27));
        } else if (i17 == de0Var.f193813u) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qd0(de0Var));
        } else if (i17 == de0Var.f193814v) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.rd0(de0Var));
        } else if (i17 == de0Var.f193815w) {
            java.lang.Object obj2 = msg.obj;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.protocal.protobuf.FinderLiveMsg>{ kotlin.collections.TypeAliasesKt.ArrayList<com.tencent.mm.protocal.protobuf.FinderLiveMsg> }");
            java.util.ArrayList arrayList = (java.util.ArrayList) obj2;
            if (!(!arrayList.isEmpty())) {
                arrayList = null;
            }
            r45.t12 t12Var2 = arrayList != null ? (r45.t12) kz5.n0.F0(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.sd0()).get(0) : null;
            if (t12Var2 != null) {
                android.os.Message mo50289x733c63a2 = de0Var.w1().mo50289x733c63a2(de0Var.f193812t);
                mo50289x733c63a2.obj = t12Var2;
                de0Var.w1().mo50308x2936bf5f(mo50289x733c63a2);
            }
        }
        return true;
    }
}
