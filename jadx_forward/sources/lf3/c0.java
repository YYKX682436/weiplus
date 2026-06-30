package lf3;

/* loaded from: classes12.dex */
public class c0 extends lf3.o implements qf3.a, kg3.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 f399843d;

    /* renamed from: e, reason: collision with root package name */
    public final mf3.t f399844e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16502x5827459 f399845f;

    /* renamed from: g, reason: collision with root package name */
    public final kg3.s f399846g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f399844e = new mf3.t();
        this.f399846g = new kg3.s(this);
    }

    @Override // kg3.f
    public void D1(int i17) {
        mf3.l V6;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 c22956x1a4bbf4 = this.f399843d;
        android.view.View childAt = c22956x1a4bbf4 != null ? c22956x1a4bbf4.getChildAt(0) : null;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = childAt instanceof com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 ? (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4) childAt : null;
        if (c22949xf1deaba4 != null) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 H = c22949xf1deaba4.H(i17);
            android.view.View view = H != null ? H.f296236d : null;
            if (view == null || (V6 = V6(i17)) == null) {
                return;
            }
            V6.q(kg3.s.f389256o.a(view));
        }
    }

    @Override // kg3.f
    public void M1(int i17) {
        mf3.l V6 = V6(i17);
        if (V6 != null) {
            V6.i();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16502x5827459 c16502x5827459 = this.f399845f;
        if (c16502x5827459 != null) {
            java.util.Iterator it = ((java.util.ArrayList) c16502x5827459.f230132g.f407780a).iterator();
            while (it.hasNext()) {
                ((ng3.e) it.next()).e();
            }
        }
    }

    @Override // qf3.a
    public void T3(int i17) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g1 m83599xfd37656d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.PreviewComponent", "onAnchor position:" + i17);
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 c22956x1a4bbf4 = this.f399843d;
        android.view.View childAt = c22956x1a4bbf4 != null ? c22956x1a4bbf4.getChildAt(0) : null;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = childAt instanceof com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 ? (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4) childAt : null;
        if (c22949xf1deaba4 == null || (m83599xfd37656d = c22949xf1deaba4.m83599xfd37656d()) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m83599xfd37656d, arrayList.toArray(), "com/tencent/mm/plugin/media/PreviewComponent", "onAnchor", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        m83599xfd37656d.y(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m83599xfd37656d, "com/tencent/mm/plugin/media/PreviewComponent", "onAnchor", "(I)V", "Undefined", "scrollToPosition", "(I)V");
    }

    @Override // lf3.o
    public int T6() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ejm;
    }

    public final mf3.l V6(int i17) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 c22956x1a4bbf4 = this.f399843d;
        if (c22956x1a4bbf4 == null) {
            return null;
        }
        android.view.View childAt = c22956x1a4bbf4.getChildAt(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.xcompat.recyclerview.widget.RecyclerView");
        java.lang.Object H = ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4) childAt).H(i17);
        if (H == null) {
            return null;
        }
        mf3.l lVar = H instanceof mf3.l ? (mf3.l) H : null;
        if (lVar == null) {
            return null;
        }
        return lVar;
    }

    public void W6(mf3.i newData, java.util.List appendData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newData, "newData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appendData, "appendData");
        mf3.t tVar = this.f399844e;
        tVar.getClass();
        tVar.f407653c = newData;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        boolean isEmpty = appendData.isEmpty();
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.v0 v0Var = tVar.f296177a;
        if (isEmpty) {
            v0Var.a();
        } else {
            v0Var.b(((mf3.f) newData).d() - appendData.size(), appendData.size());
        }
    }

    public void X6(mf3.i newData, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newData, "newData");
        mf3.t tVar = this.f399844e;
        tVar.getClass();
        tVar.f407653c = newData;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        tVar.f296177a.a();
    }

    public void Y6(java.lang.String enterId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterId, "enterId");
        mf3.t tVar = this.f399844e;
        tVar.getClass();
        tVar.f407654d = enterId;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.PreviewComponent", "onEnter enterId:".concat(enterId));
    }

    public void Z6(com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16502x5827459 gestureInterceptorView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gestureInterceptorView, "gestureInterceptorView");
        gestureInterceptorView.a();
    }

    @Override // qf3.a
    public void h1(mf3.i newData, java.util.List insertData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newData, "newData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(insertData, "insertData");
        mf3.t tVar = this.f399844e;
        tVar.getClass();
        tVar.f407653c = newData;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        boolean isEmpty = insertData.isEmpty();
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.v0 v0Var = tVar.f296177a;
        if (isEmpty) {
            v0Var.a();
        } else {
            v0Var.b(0, insertData.size());
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        mf3.l V6;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 c22956x1a4bbf4 = this.f399843d;
        if (c22956x1a4bbf4 == null || (V6 = V6(c22956x1a4bbf4.m83649xfda78ef6())) == null) {
            return;
        }
        V6.mo129548x408b7293();
    }

    @Override // kg3.f
    /* renamed from: onPageSelected */
    public void mo143395x510f45c9(int i17) {
        mf3.l V6;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 c22956x1a4bbf4 = this.f399843d;
        if (c22956x1a4bbf4 == null || (V6 = V6(c22956x1a4bbf4.m83649xfda78ef6())) == null) {
            return;
        }
        V6.F();
        mg3.b l17 = V6.l();
        mg3.e o17 = V6.o();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.PreviewComponent", "onPageSelected gesture: " + c22956x1a4bbf4.m83649xfda78ef6() + ' ' + l17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16502x5827459 c16502x5827459 = this.f399845f;
        if (c16502x5827459 != null) {
            lf3.z zVar = new lf3.z(o17, this);
            c16502x5827459.f230129d = l17;
            c16502x5827459.f230130e = zVar;
            mg3.m mVar = c16502x5827459.f230132g;
            mVar.f407782c = l17;
            mVar.f407783d = zVar;
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        mf3.l V6;
        super.mo2281xb01dfb57();
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 c22956x1a4bbf4 = this.f399843d;
        if (c22956x1a4bbf4 == null || (V6 = V6(c22956x1a4bbf4.m83649xfda78ef6())) == null) {
            return;
        }
        V6.mo129547xb01dfb57();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        mf3.l V6;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 c22956x1a4bbf4 = this.f399843d;
        if (c22956x1a4bbf4 == null || (V6 = V6(c22956x1a4bbf4.m83649xfda78ef6())) == null) {
            return;
        }
        V6.mo124474x57429eec();
    }

    @Override // lf3.o, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onViewCreated */
    public void mo47092x594b1124(android.view.View contentView) {
        android.view.ViewTreeObserver viewTreeObserver;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 c22956x1a4bbf4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        super.mo47092x594b1124(contentView);
        this.f399843d = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4) contentView.findViewById(com.p314xaae8f345.mm.R.id.tzq);
        qf3.b bVar = (qf3.b) U6(qf3.b.class);
        android.content.Intent intent = m158354x19263085().getIntent();
        if (intent != null && bVar != null) {
            bVar.X0(intent, this);
        }
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 c22956x1a4bbf42 = this.f399843d;
        if (c22956x1a4bbf42 != null) {
            mf3.t tVar = this.f399844e;
            tVar.getClass();
            c22956x1a4bbf42.m83657x40341e13(1);
            c22956x1a4bbf42.setVerticalFadingEdgeEnabled(false);
            c22956x1a4bbf42.setHorizontalFadingEdgeEnabled(false);
            c22956x1a4bbf42.m83655x6cab2c8d(tVar);
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 c22956x1a4bbf43 = this.f399843d;
            if (c22956x1a4bbf43 != null) {
                c22956x1a4bbf43.m83656x940d026a(0);
            }
            if ((!(this instanceof re5.l0)) && (c22956x1a4bbf4 = this.f399843d) != null) {
                android.view.View childAt = c22956x1a4bbf4.getChildAt(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.xcompat.recyclerview.widget.RecyclerView");
                com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4) childAt;
                c22949xf1deaba4.m83610xfb66ab3a(new mf3.v());
                c22949xf1deaba4.setOverScrollMode(0);
            }
        }
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 c22956x1a4bbf44 = this.f399843d;
        if (c22956x1a4bbf44 != null && (viewTreeObserver = c22956x1a4bbf44.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(new lf3.a0(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16502x5827459 c16502x5827459 = (com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1860xfb865d49.C16502x5827459) contentView.findViewById(com.p314xaae8f345.mm.R.id.vpu);
        if (c16502x5827459 != null) {
            Z6(c16502x5827459);
        } else {
            c16502x5827459 = null;
        }
        this.f399845f = c16502x5827459;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2824xd1075a44.C22956x1a4bbf4 c22956x1a4bbf45 = this.f399843d;
        if (c22956x1a4bbf45 != null) {
            ((java.util.ArrayList) c22956x1a4bbf45.f296267f.f296289a).add(new lf3.b0(this));
        }
    }
}
