package ow0;

/* loaded from: classes5.dex */
public final class g extends com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 {
    public final jz5.g A;
    public final jz5.g B;
    public boolean C;
    public ow0.b D;
    public int E;
    public final java.util.ArrayList F;
    public yz5.a G;
    public final ow0.e H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context) {
        super(context, null, 0, 6, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.A = jz5.h.b(new ow0.d(this));
        this.B = jz5.h.b(new ow0.f(this));
        this.F = new java.util.ArrayList();
        this.H = new ow0.e(this);
    }

    /* renamed from: getTabLayout */
    private final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10962x80d4584e m157265x52245469() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.A).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10962x80d4584e) mo141623x754a37bb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getViewPager */
    public final p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe m157266xa0cf1568() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.B).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) mo141623x754a37bb;
    }

    /* renamed from: setCaptionClickCallback */
    private final void m157267xe5f48929(rw0.a aVar) {
        java.lang.Object obj;
        sw0.f fVar = sw0.f.f494965g;
        java.util.Iterator it = this.F.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((sw0.n) obj).f494977b == fVar) {
                    break;
                }
            }
        }
        sw0.n nVar = (sw0.n) obj;
        android.view.View view = nVar != null ? nVar.f494978c : null;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10951xedb68d8b c10951xedb68d8b = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10951xedb68d8b) (view instanceof com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10951xedb68d8b ? view : null);
        if (c10951xedb68d8b != null) {
            c10951xedb68d8b.m47165xf2914389(aVar);
        }
    }

    /* renamed from: setContentDescClickCallback */
    private final void m157268x20872de5(rw0.b bVar) {
        java.lang.Object obj;
        sw0.f fVar = sw0.f.f494963e;
        java.util.Iterator it = this.F.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((sw0.n) obj).f494977b == fVar) {
                    break;
                }
            }
        }
        sw0.n nVar = (sw0.n) obj;
        android.view.View view = nVar != null ? nVar.f494978c : null;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10952x561633cd c10952x561633cd = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10952x561633cd) (view instanceof com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10952x561633cd ? view : null);
        if (c10952x561633cd != null) {
            c10952x561633cd.m47172x8da8fa9a(bVar);
        }
    }

    /* renamed from: setFancyTextClickCallback */
    private final void m157269x9f53cf9(rw0.c cVar) {
        java.lang.Object obj;
        sw0.f fVar = sw0.f.f494964f;
        java.util.Iterator it = this.F.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((sw0.n) obj).f494977b == fVar) {
                    break;
                }
            }
        }
        sw0.n nVar = (sw0.n) obj;
        android.view.View view = nVar != null ? nVar.f494978c : null;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10947x71306f3b c10947x71306f3b = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10947x71306f3b) (view instanceof com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10947x71306f3b ? view : null);
        if (c10947x71306f3b != null) {
            c10947x71306f3b.m47154x9f53cf9(cVar);
        }
    }

    /* renamed from: setTitleClickCallback */
    private final void m157270x3519c277(rw0.e eVar) {
        java.lang.Object obj;
        sw0.f fVar = sw0.f.f494962d;
        java.util.Iterator it = this.F.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((sw0.n) obj).f494977b == fVar) {
                    break;
                }
            }
        }
        sw0.n nVar = (sw0.n) obj;
        android.view.View view = nVar != null ? nVar.f494978c : null;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10953xe6406afb c10953xe6406afb = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10953xe6406afb) (view instanceof com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10953xe6406afb ? view : null);
        if (c10953xe6406afb != null) {
            c10953xe6406afb.m47174x3519c277(eVar);
        }
    }

    public final void C(sw0.f textPage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textPage, "textPage");
        if (m157271xfdaa7672() == textPage) {
            return;
        }
        java.util.Iterator it = this.F.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (((sw0.n) it.next()).f494977b == textPage) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        if (!(valueOf.intValue() != -1)) {
            valueOf = null;
        }
        if (valueOf != null) {
            m157265x52245469().m47204xdb7c715e(valueOf.intValue());
        }
    }

    public final void D(java.util.List tabs, ow0.b tabChangeListener, rw0.d textCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabs, "tabs");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabChangeListener, "tabChangeListener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textCallback, "textCallback");
        this.D = tabChangeListener;
        java.util.ArrayList arrayList = this.F;
        arrayList.clear();
        arrayList.addAll(tabs);
        m157266xa0cf1568().m8315x6cab2c8d(new pw0.k(tabs));
        m157265x52245469().m47221xfd22d5dc(m157266xa0cf1568());
        m157265x52245469().m47211xed4b2ce4(this.H);
        m157270x3519c277(textCallback);
        m157268x20872de5(textCallback);
        m157267xe5f48929(textCallback);
        m157269x9f53cf9(textCallback);
    }

    public final void E(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID, dx0.p thumbnailInfo) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbnailInfo, "thumbnailInfo");
        sw0.f fVar = sw0.f.f494963e;
        java.util.Iterator it = this.F.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((sw0.n) obj).f494977b == fVar) {
                    break;
                }
            }
        }
        sw0.n nVar = (sw0.n) obj;
        android.view.View view = nVar != null ? nVar.f494978c : null;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10952x561633cd c10952x561633cd = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10952x561633cd) (view instanceof com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10952x561633cd ? view : null);
        if (c10952x561633cd == null) {
            return;
        }
        c10952x561633cd.post(new vw0.s(c10952x561633cd, thumbnailInfo, segmentID));
    }

    public final int F(sw0.f page, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
        java.util.Iterator it = this.F.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (((sw0.n) it.next()).f494977b == page) {
                break;
            }
            i17++;
        }
        m157265x52245469().e(i17, z17);
        return i17;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q
    public ou0.z b() {
        ou0.z zVar;
        if (m157271xfdaa7672() != sw0.f.f494965g) {
            return new ou0.v(false, 1, null);
        }
        yz5.a aVar = this.G;
        return (aVar == null || (zVar = (ou0.z) aVar.mo152xb9724478()) == null) ? new ou0.v(false, 1, null) : zVar;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dga, bodyContainerLayout);
    }

    /* renamed from: getCurrentPage */
    public final sw0.f m157271xfdaa7672() {
        sw0.f fVar;
        sw0.n nVar = (sw0.n) kz5.n0.a0(this.F, m157265x52245469().m47188xad582352());
        return (nVar == null || (fVar = nVar.f494977b) == null) ? sw0.f.f494962d : fVar;
    }

    /* renamed from: getInitPage */
    public final sw0.f m157272x8bd87135() {
        sw0.f fVar;
        ow0.a aVar = (ow0.a) com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6.k(this, "KEY_PANEL_ARGS", null, 2, null);
        return (aVar == null || (fVar = aVar.f430811a) == null) ? m157271xfdaa7672() : fVar;
    }

    /* renamed from: getSelectedContentDescSegmentID$plugin_mj_template_release */
    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 m157273xa56be4e7() {
        java.lang.Object obj;
        sw0.f fVar = sw0.f.f494963e;
        java.util.Iterator it = this.F.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((sw0.n) obj).f494977b == fVar) {
                break;
            }
        }
        sw0.n nVar = (sw0.n) obj;
        android.view.View view = nVar != null ? nVar.f494978c : null;
        if (!(view instanceof com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10952x561633cd)) {
            view = null;
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10952x561633cd c10952x561633cd = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10952x561633cd) view;
        if (c10952x561633cd != null) {
            return c10952x561633cd.m47171xbdef231f();
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public boolean n(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void p() {
        ow0.a aVar = (ow0.a) com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6.k(this, "KEY_PANEL_ARGS", null, 2, null);
        this.C = aVar != null ? aVar.f430812b : false;
    }

    /* renamed from: setCaptionPageTimelineToolbarTypeGetter */
    public final void m157274xa89a6bec(yz5.a getter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getter, "getter");
        this.G = getter;
    }

    /* renamed from: setTitle */
    public final void m157275x53bfe316(java.lang.String title) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        sw0.f fVar = sw0.f.f494962d;
        java.util.Iterator it = this.F.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((sw0.n) obj).f494977b == fVar) {
                    break;
                }
            }
        }
        sw0.n nVar = (sw0.n) obj;
        android.view.View view = nVar != null ? nVar.f494978c : null;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10953xe6406afb c10953xe6406afb = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10953xe6406afb) (view instanceof com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10953xe6406afb ? view : null);
        if (c10953xe6406afb != null) {
            c10953xe6406afb.m47173x53bfe316(title);
        }
    }

    /* renamed from: setupFancyTextUIStateObserver$plugin_mj_template_release */
    public final void m157276x21f395e2(p012xc85e97e9.p093xedfae76a.g0 uiStateLiveData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiStateLiveData, "uiStateLiveData");
        uiStateLiveData.mo7806x9d92d11c(this, new ow0.c(this));
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void t() {
        this.C = false;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void x() {
        java.lang.Object obj;
        sw0.f m157272x8bd87135 = m157272x8bd87135();
        sw0.f fVar = sw0.f.f494965g;
        if (m157272x8bd87135 == fVar && this.C) {
            java.util.Iterator it = this.F.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((sw0.n) obj).f494977b == fVar) {
                        break;
                    }
                }
            }
            sw0.n nVar = (sw0.n) obj;
            android.view.View view = nVar != null ? nVar.f494978c : null;
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10951xedb68d8b c10951xedb68d8b = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10951xedb68d8b) (view instanceof com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10951xedb68d8b ? view : null);
            if (c10951xedb68d8b != null) {
                c10951xedb68d8b.f150854e.performClick();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void z() {
        sw0.f m157271xfdaa7672 = m157271xfdaa7672();
        sw0.n nVar = (sw0.n) kz5.n0.a0(this.F, this.E);
        if (m157271xfdaa7672 == (nVar != null ? nVar.f494977b : null)) {
            return;
        }
        m157265x52245469().e(this.E, false);
    }
}
