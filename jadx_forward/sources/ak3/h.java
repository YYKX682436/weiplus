package ak3;

/* loaded from: classes8.dex */
public final class h implements al5.g3 {

    /* renamed from: d, reason: collision with root package name */
    public float f87113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ak3.i f87114e;

    public h(ak3.i iVar) {
        this.f87114e = iVar;
    }

    @Override // al5.g3
    public void R(int i17, int i18, int i19, int i27, float f17) {
        ak3.a aVar = this.f87114e.f87119h;
        if (aVar == null || aVar == null) {
            return;
        }
        aVar.f(f17);
    }

    @Override // al5.g3
    public boolean a(android.view.MotionEvent ev6) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78735x28280f95;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        ak3.i iVar = this.f87114e;
        ak3.a aVar = iVar.f87119h;
        if (aVar != null) {
            aVar.a(ev6);
        }
        if (iVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.i) {
            if (ev6.getAction() == 0) {
                this.f87113d = ev6.getX();
                android.app.Activity mo2157x19263085 = iVar.mo2157x19263085();
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = mo2157x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo2157x19263085 : null;
                if (abstractActivityC21394xb3d2c0cf != null && (m78735x28280f95 = abstractActivityC21394xb3d2c0cf.m78735x28280f95()) != null) {
                    ii5.c cVar = m78735x28280f95.f292965m;
                    cVar.f373178p = cVar.f373179q;
                    cVar.f373180r = false;
                }
            } else {
                int x17 = (int) (this.f87113d - ev6.getX(0));
                if (iVar.a() != null) {
                    android.view.ViewGroup a17 = iVar.a();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
                    if (iVar.n(x17, a17, ev6.getX(), ev6.getY())) {
                        return false;
                    }
                }
                iVar.l();
            }
        }
        return false;
    }

    @Override // al5.g3
    public int b(boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78735x28280f95;
        ak3.i iVar = this.f87114e;
        if (!iVar.p() || iVar.q()) {
            android.app.Activity mo2157x19263085 = iVar.mo2157x19263085();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = mo2157x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo2157x19263085 : null;
            if (abstractActivityC21394xb3d2c0cf != null && (m78735x28280f95 = abstractActivityC21394xb3d2c0cf.m78735x28280f95()) != null) {
                ii5.c cVar = m78735x28280f95.f292965m;
                cVar.f373178p = cVar.f373179q;
                cVar.f373180r = false;
            }
        } else {
            iVar.l();
        }
        ak3.a aVar = iVar.f87119h;
        if (aVar != null) {
            return aVar.h(z17);
        }
        return 1;
    }

    @Override // al5.g3
    public void c(int i17, int i18) {
        ak3.a aVar = this.f87114e.f87119h;
        if (aVar != null) {
            aVar.c(i17, i18);
        }
    }

    @Override // al5.g3
    public boolean d(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        ak3.a aVar = this.f87114e.f87119h;
        if (aVar == null || aVar == null) {
            return false;
        }
        return aVar.d(ev6);
    }

    @Override // al5.g3
    public boolean d0() {
        ak3.a aVar = this.f87114e.f87119h;
        if (aVar == null || aVar == null) {
            return false;
        }
        return aVar.g();
    }

    @Override // al5.g3
    public int e() {
        ak3.a aVar = this.f87114e.f87119h;
        if (aVar != null) {
            return aVar.e();
        }
        return 0;
    }

    @Override // al5.g3
    /* renamed from: enableSwipeBack */
    public boolean mo2163xd71108fe() {
        ak3.a aVar = this.f87114e.f87119h;
        if (aVar != null) {
            return aVar.mo2155xd71108fe();
        }
        return false;
    }
}
