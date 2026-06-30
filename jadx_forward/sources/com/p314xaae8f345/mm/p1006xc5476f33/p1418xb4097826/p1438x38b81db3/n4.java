package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class n4 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public so2.y0 f185607a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185608b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.u4 f185609c;

    public n4(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.u4 u4Var) {
        this.f185608b = s0Var;
        this.f185609c = u4Var;
    }

    @Override // ym5.n0
    /* renamed from: getAdditionalCondition */
    public boolean mo55689xe831ad7e(android.view.View target) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        android.content.Context context = target.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ha haVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ha) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ha.class);
        int O6 = haVar != null ? haVar.O6() : -1;
        android.content.Context context2 = this.f185608b.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        pf5.z zVar2 = pf5.z.f435481a;
        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (O6 == -1 || O6 == 1) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u) a17).f206907f;
    }

    @Override // ym5.n0
    /* renamed from: getExposedId */
    public long mo55681x18a217a5(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        return ((so2.y0) this.f185608b.f374658i).mo2128x1ed62e84();
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        so2.y0 y0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        in5.s0 s0Var = this.f185608b;
        so2.y0 y0Var2 = (so2.y0) s0Var.f374658i;
        if (!y0Var2.f492236d.a1()) {
            if (!z17 || (y0Var = this.f185607a) == null) {
                return;
            }
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            android.content.Context context2 = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u) a17).U6(context2, y0Var, y0Var2.f492240h);
            this.f185607a = null;
            return;
        }
        if (!z17) {
            this.f185607a = null;
            android.content.Context context3 = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
            pf5.z zVar2 = pf5.z.f435481a;
            if (!(context3 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p093xedfae76a.c1 a18 = zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
            android.content.Context context4 = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u) a18).U6(context4, y0Var2, y0Var2.f492240h);
            return;
        }
        this.f185607a = y0Var2;
        this.f185609c.getClass();
        android.graphics.Rect rect = new android.graphics.Rect();
        s0Var.f3639x46306858.getLocalVisibleRect(rect);
        y0Var2.f492240h = rect.height() > s0Var.o().computeVerticalScrollOffset();
        android.content.Context context5 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context5, "getContext(...)");
        pf5.z zVar3 = pf5.z.f435481a;
        if (!(context5 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a19 = zVar3.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context5).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a19, "get(...)");
        android.content.Context context6 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context6, "getContext(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u) a19).S6(context6, y0Var2, y0Var2.f492240h);
    }
}
