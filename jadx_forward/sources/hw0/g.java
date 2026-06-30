package hw0;

/* loaded from: classes5.dex */
public final class g extends com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 {
    public final jz5.g A;
    public final jz5.g B;
    public hw0.a C;
    public final java.util.ArrayList D;
    public final hw0.d E;
    public jw0.a F;
    public final yz5.l G;
    public final yz5.l H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context) {
        super(context, null, 0, 6, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.A = jz5.h.b(new hw0.c(this));
        this.B = jz5.h.b(new hw0.e(this));
        this.D = new java.util.ArrayList();
        this.E = new hw0.d(this);
        this.G = new hw0.b(this);
        this.H = new hw0.f(this);
    }

    /* renamed from: getTabLayout */
    private final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10962x80d4584e m134214x52245469() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.A).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10962x80d4584e) mo141623x754a37bb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getViewPager */
    public final p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe m134215xa0cf1568() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.B).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) mo141623x754a37bb;
    }

    public final void C(java.util.List tabs, hw0.a tabChangeListener, jw0.a stickerCallback) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabs, "tabs");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabChangeListener, "tabChangeListener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stickerCallback, "stickerCallback");
        this.C = tabChangeListener;
        this.F = stickerCallback;
        java.util.ArrayList arrayList = this.D;
        arrayList.clear();
        arrayList.addAll(tabs);
        m134215xa0cf1568().m8315x6cab2c8d(new iw0.a(tabs));
        m134214x52245469().m47221xfd22d5dc(m134215xa0cf1568());
        m134214x52245469().m47211xed4b2ce4(this.E);
        kw0.c cVar = kw0.c.f394328d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((kw0.d) obj).f394332b == cVar) {
                    break;
                }
            }
        }
        kw0.d dVar = (kw0.d) obj;
        android.view.View view = dVar != null ? dVar.f394333c : null;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10946xf6acd180 c10946xf6acd180 = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10946xf6acd180) (view instanceof com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10946xf6acd180 ? view : null);
        if (c10946xf6acd180 != null) {
            c10946xf6acd180.m47151x53a3f106(this.G);
        }
    }

    public final void D(kw0.c initPage, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initPage, "initPage");
        java.util.Iterator it = this.D.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (((kw0.d) it.next()).f394332b == initPage) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        m134214x52245469().e(i17, z17);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q
    public ou0.z b() {
        return new ou0.v(false, 1, null);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570801dg4, bodyContainerLayout);
    }

    /* renamed from: getCurrentPage$plugin_mj_template_release */
    public final kw0.c m134216x4e91f60a() {
        kw0.c cVar;
        kw0.d dVar = (kw0.d) kz5.n0.a0(this.D, m134214x52245469().m47188xad582352());
        return (dVar == null || (cVar = dVar.f394332b) == null) ? kw0.c.f394329e : cVar;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public boolean n(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return true;
    }

    /* renamed from: setWhenWhereUiState */
    public final void m134217x68b9052(kw0.e state) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        java.util.List list = state.f394334a;
        if (list.isEmpty()) {
            return;
        }
        kw0.c cVar = kw0.c.f394329e;
        java.util.Iterator it = this.D.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((kw0.d) obj).f394332b == cVar) {
                    break;
                }
            }
        }
        kw0.d dVar = (kw0.d) obj;
        android.view.View view = dVar != null ? dVar.f394333c : null;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10950x224d45f2 c10950x224d45f2 = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10950x224d45f2) (view instanceof com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10950x224d45f2 ? view : null);
        if (c10950x224d45f2 == null) {
            return;
        }
        kw0.k kVar = state.f394336c;
        if (kVar instanceof kw0.i) {
            c10950x224d45f2.a(list, this.H);
            return;
        }
        if (kVar instanceof kw0.g) {
            kw0.g gVar = (kw0.g) kVar;
            kw0.a aVar = (kw0.a) kz5.n0.a0(list, gVar.f394338a);
            if (aVar != null) {
                c10950x224d45f2.b(gVar.f394338a, aVar);
            }
        }
    }
}
