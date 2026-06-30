package mf3;

/* loaded from: classes12.dex */
public final class x implements mf3.n {

    /* renamed from: d, reason: collision with root package name */
    public final mf3.p f407664d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f407665e;

    public x(mf3.p apiCenter, java.util.List layers) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layers, "layers");
        this.f407664d = apiCenter;
        this.f407665e = layers;
    }

    @Override // mf3.l
    public void F() {
        java.util.Iterator it = this.f407665e.iterator();
        while (it.hasNext()) {
            ((mf3.n) it.next()).F();
        }
    }

    @Override // mf3.n
    public mf3.p G() {
        return this.f407664d;
    }

    @Override // mf3.l
    public void d(float f17) {
        java.util.Iterator it = this.f407665e.iterator();
        while (it.hasNext()) {
            ((mf3.n) it.next()).d(f17);
        }
    }

    @Override // mf3.l
    public void i() {
        java.util.Iterator it = this.f407665e.iterator();
        while (it.hasNext()) {
            ((mf3.n) it.next()).i();
        }
    }

    @Override // mf3.l
    public mg3.b l() {
        for (mf3.n nVar : this.f407665e) {
            if (nVar.l() != null) {
                return nVar.l();
            }
        }
        return null;
    }

    @Override // mf3.n
    public boolean n(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.util.Iterator it = this.f407665e.iterator();
        while (it.hasNext()) {
            if (((mf3.n) it.next()).n(event)) {
                return true;
            }
        }
        return false;
    }

    @Override // mf3.l
    /* renamed from: onPause */
    public void mo129547xb01dfb57() {
        java.util.Iterator it = this.f407665e.iterator();
        while (it.hasNext()) {
            ((mf3.n) it.next()).mo129547xb01dfb57();
        }
    }

    @Override // mf3.l
    /* renamed from: onResume */
    public void mo124474x57429eec() {
        java.util.Iterator it = this.f407665e.iterator();
        while (it.hasNext()) {
            ((mf3.n) it.next()).mo124474x57429eec();
        }
    }

    @Override // mf3.n
    public void p(java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        java.util.Iterator it = this.f407665e.iterator();
        while (it.hasNext()) {
            ((mf3.n) it.next()).p(value);
        }
    }

    @Override // mf3.l
    public void q(float f17) {
        java.util.Iterator it = this.f407665e.iterator();
        while (it.hasNext()) {
            ((mf3.n) it.next()).q(f17);
        }
    }

    @Override // mf3.l
    /* renamed from: recycle */
    public void mo129548x408b7293() {
        java.util.Iterator it = this.f407665e.iterator();
        while (it.hasNext()) {
            ((mf3.n) it.next()).mo129548x408b7293();
        }
    }

    @Override // mf3.l
    public void t(mf3.s bindContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bindContext, "bindContext");
        java.util.Iterator it = this.f407665e.iterator();
        while (it.hasNext()) {
            ((mf3.n) it.next()).t(bindContext);
        }
    }

    @Override // mf3.l
    public void u(android.view.View parentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentView, "parentView");
        java.util.Iterator it = this.f407665e.iterator();
        while (it.hasNext()) {
            ((mf3.n) it.next()).u(parentView);
        }
    }
}
