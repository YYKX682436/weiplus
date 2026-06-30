package rv0;

/* loaded from: classes5.dex */
public final class k5 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f481618d;

    /* renamed from: e, reason: collision with root package name */
    public final ex0.a0 f481619e;

    /* renamed from: f, reason: collision with root package name */
    public final bx0.h f481620f;

    /* renamed from: g, reason: collision with root package name */
    public final dx0.n f481621g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f481622h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f481623i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f481624m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f481625n;

    /* renamed from: o, reason: collision with root package name */
    public rv0.g5 f481626o;

    public k5(android.content.Context context, ex0.a0 timelineVM, bx0.h timelineCalc, dx0.n thumbnailProviderManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timelineVM, "timelineVM");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timelineCalc, "timelineCalc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbnailProviderManager, "thumbnailProviderManager");
        this.f481618d = context;
        this.f481619e = timelineVM;
        this.f481620f = timelineCalc;
        this.f481621g = thumbnailProviderManager;
        this.f481622h = jz5.h.b(new rv0.i5(this));
        this.f481623i = jz5.h.b(new rv0.j5(this));
        this.f481624m = jz5.h.b(new rv0.h5(this));
        this.f481625n = new java.util.ArrayList();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f481625n.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        rv0.f5 holder = (rv0.f5) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f481625n.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        yv0.p pVar = (yv0.p) obj;
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        android.view.ViewGroup.LayoutParams layoutParams = itemView.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        android.graphics.Rect rect = pVar.f547522e;
        layoutParams.width = rect.width();
        layoutParams.height = rect.height();
        itemView.setLayoutParams(layoutParams);
        holder.f481535e.getClass();
        ug.m mVar = pVar.f547519b;
        java.util.Objects.toString(mVar);
        java.util.Objects.toString(pVar.f547518a);
        if (mVar == ug.m.Transition) {
            return;
        }
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = pVar.f547518a;
        holder.f481536f = c3971x241f78;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p894x8438d441.C10944xceb8a619 c10944xceb8a619 = holder.f481535e;
        rv0.k5 k5Var = holder.f481537g;
        ex0.a0 a0Var = k5Var.f481619e;
        bx0.h hVar = k5Var.f481620f;
        dx0.n nVar = holder.f481534d;
        c10944xceb8a619.a(nVar, c3971x241f78, a0Var, hVar, nVar.b(), mVar == ug.m.ImageClip);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dfh, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new rv0.f5(this, inflate, this.f481621g);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewRecycled */
    public void mo8162x34789575(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        rv0.f5 holder = (rv0.f5) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.mo8162x34789575(holder);
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = holder.f481536f;
        if (c3971x241f78 != null) {
            holder.f481534d.a(c3971x241f78);
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p894x8438d441.C10944xceb8a619 c10944xceb8a619 = holder.f481535e;
        if (c10944xceb8a619.f150825h) {
            c10944xceb8a619.f150825h = false;
        }
    }

    public final void x(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a) {
        float intValue;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a2;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a ZeroTime;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34005x51e8b0a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        java.util.ArrayList arrayList = this.f481625n;
        arrayList.clear();
        bx0.h hVar = this.f481620f;
        hVar.a();
        ex0.a0 a0Var = this.f481619e;
        ex0.r K = a0Var.K(segmentID);
        if (K == null) {
            return;
        }
        ug.m mVar = ug.m.ImageClip;
        ug.m mVar2 = K.f338702c;
        jz5.g gVar = this.f481624m;
        if (mVar2 != mVar) {
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 m17 = K.m();
            if (m17 == null || (m34005x51e8b0a = m17.m34005x51e8b0a()) == null) {
                return;
            } else {
                intValue = ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() / ((float) m34005x51e8b0a.m33988x124aa384());
            }
        } else {
            intValue = ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() / ((float) K.j().m33988x124aa384());
        }
        p012xc85e97e9.p093xedfae76a.j0 j0Var = a0Var.f338646w;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.a((java.lang.Float) j0Var.mo3195x754a37bb(), intValue)) {
            j0Var.mo523x53d8522f(java.lang.Float.valueOf(intValue));
        }
        hVar.a();
        hVar.f117810d.b();
        ug.m mVar3 = K.f338702c;
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = K.f338701b;
        arrayList.add(new yv0.p(c3971x241f78, mVar3, hVar.b(c3971x241f78, false), true, true));
        m8146xced61ae5();
        rv0.g5 g5Var = this.f481626o;
        if (g5Var != null) {
            if (c4128x879fba0a == null) {
                c4128x879fba0a = K.k();
            }
            ex0.r K2 = a0Var.K(segmentID);
            if (K2 == null) {
                ZeroTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ZeroTime, "ZeroTime");
            } else if (K2.l().m34002x805f158c(c4128x879fba0a)) {
                com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 m18 = K2.m();
                if (m18 == null || (c4128x879fba0a2 = m18.m34009x8082fb99()) == null) {
                    c4128x879fba0a2 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
                }
                ZeroTime = c4128x879fba0a2.add(c4128x879fba0a.sub(K2.k()));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ZeroTime, "add(...)");
            } else {
                ZeroTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ZeroTime, "ZeroTime");
            }
            g5Var.a(ZeroTime, K.f338700a);
        }
    }
}
