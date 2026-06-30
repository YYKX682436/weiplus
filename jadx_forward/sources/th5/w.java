package th5;

/* loaded from: classes12.dex */
public final class w extends pf3.g implements rf3.h {

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f501004v;

    /* renamed from: w, reason: collision with root package name */
    public lg3.a f501005w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(mf3.p apiCenter) {
        super(apiCenter, "MicroMsg.BizPhotoImageBottomBar");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
    }

    @Override // rf3.h
    public void D() {
        mf3.s sVar = this.f407643m;
        java.lang.Object obj = sVar != null ? sVar.f407650a : null;
        th5.o oVar = obj instanceof th5.o ? (th5.o) obj : null;
        android.view.View view = this.f501004v;
        if (view == null) {
            return;
        }
        Y(this, new th5.v(oVar, view));
        a0();
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void F() {
        super.F();
        D();
        mf3.s sVar = this.f407643m;
        java.lang.Object obj = sVar != null ? sVar.f407650a : null;
        th5.o oVar = obj instanceof th5.o ? (th5.o) obj : null;
        if (oVar != null) {
            android.view.View view = this.f501004v;
            boolean z17 = false;
            if (view != null && view.getVisibility() == 0) {
                z17 = true;
            }
            if (z17) {
                th5.v0.f501003a.a(oVar.f500877c, oVar.f500875a, oVar.f500876b, th5.a.f500866e, th5.e.f500899e);
            }
        }
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dzs, (android.view.ViewGroup) null, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return inflate;
    }

    @Override // rf3.h
    public void b() {
        android.view.View view = this.f501004v;
        if (view == null) {
            return;
        }
        Y(this, new th5.t(view));
        b0();
    }

    public final void g0() {
        mf3.s sVar = this.f407643m;
        java.lang.Object obj = sVar != null ? sVar.f407650a : null;
        th5.o oVar = obj instanceof th5.o ? (th5.o) obj : null;
        android.view.View view = this.f501004v;
        if (view == null) {
            return;
        }
        Y(this, new th5.u(oVar, view));
        a0();
    }

    @Override // rf3.h
    public void h() {
        D();
    }

    @Override // mf3.l
    /* renamed from: onResume */
    public void mo124474x57429eec() {
        D();
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void t(mf3.s bindContext) {
        lg3.a aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bindContext, "bindContext");
        super.t(bindContext);
        mf3.k kVar = bindContext.f407650a;
        th5.o oVar = kVar instanceof th5.o ? (th5.o) kVar : null;
        if (oVar == null) {
            return;
        }
        if (oVar.d()) {
            if (oVar.f500956h.length() == 0) {
                if (oVar.f500954f == mf3.w.f407662e) {
                    float f17 = oVar.f500957i;
                    if (f17 > 0.0f && f17 < 1.0f) {
                        lg3.a aVar2 = this.f501005w;
                        if (aVar2 != null) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar2).h(oVar, new vf3.f(vf3.e.f517913g, null, 0, f17, 6, null));
                        }
                        oVar.f500958j = new th5.s(this, oVar);
                    }
                }
                lg3.a aVar3 = this.f501005w;
                if (aVar3 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar3).h(oVar, new vf3.f(vf3.e.f517910d, null, 0, 0.0f, 14, null));
                }
                long j17 = oVar.f500876b;
                if (j17 > 0 && (aVar = this.f501005w) != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar).g(new vf3.b(0L, j17, 0L, 0L, 0L, false, 61, null));
                }
                oVar.f500958j = new th5.s(this, oVar);
            }
        }
        g0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pf3.g, mf3.e, mf3.l
    public void u(android.view.View parentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentView, "parentView");
        super.u(parentView);
        android.view.View findViewById = M().findViewById(com.p314xaae8f345.mm.R.id.smo);
        this.f501004v = findViewById;
        this.f501005w = findViewById instanceof lg3.a ? (lg3.a) findViewById : null;
        if (findViewById != 0) {
            pf3.d.W(this, findViewById, null, 1, null);
            pf3.d.U(this, findViewById, null, new th5.r(this), 1, null);
        }
    }
}
