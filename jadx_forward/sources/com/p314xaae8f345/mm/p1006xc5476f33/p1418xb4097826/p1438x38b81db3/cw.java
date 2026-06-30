package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class cw implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ew f184632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.dw f184633e;

    public cw(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ew ewVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.dw dwVar) {
        this.f184632d = ewVar;
        this.f184633e = dwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ew ewVar = this.f184632d;
        android.view.View view = ewVar.f184840v;
        if (view != null) {
            boolean n17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ew.n(ewVar, view);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.dw dwVar = this.f184633e;
            boolean z17 = dwVar.f184737d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.fv fvVar = ewVar.f184841w;
            if (!z17 && n17) {
                dwVar.f184737d = true;
                fvVar.f184958c = java.lang.System.currentTimeMillis();
                return;
            }
            if (!z17 || n17) {
                return;
            }
            dwVar.f184737d = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys ysVar = fvVar.f184956a;
            if (ysVar != null) {
                long currentTimeMillis = java.lang.System.currentTimeMillis() - fvVar.f184958c;
                int indexOf = ewVar.f184826e.C.m56388xcaeb60d0().indexOf(ysVar);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x4 x4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x4.f206968a;
                java.lang.String m75945x2fec8307 = ysVar.f192725d.m75945x2fec8307(1);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                java.lang.String str = m75945x2fec8307;
                r45.qt2 qt2Var = ewVar.f184829h;
                if (qt2Var != null) {
                    x4Var.a(str, ysVar, indexOf, currentTimeMillis, qt2Var);
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contextObj");
                    throw null;
                }
            }
        }
    }
}
