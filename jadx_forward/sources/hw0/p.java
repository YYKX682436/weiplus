package hw0;

/* loaded from: classes5.dex */
public final class p extends ov0.t {

    /* renamed from: y1, reason: collision with root package name */
    public boolean f367010y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: setStyleDataList */
    private final void m134218x4e1e92f7(java.util.List<kw0.a> list) {
        android.view.View m157205x83e42eef = m157205x83e42eef();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10948xe76107c2 c10948xe76107c2 = m157205x83e42eef instanceof com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10948xe76107c2 ? (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10948xe76107c2) m157205x83e42eef : null;
        if (c10948xe76107c2 != null) {
            c10948xe76107c2.m47160x4e1e92f7(list);
        }
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.y
    public void E() {
        super.E();
        if (m134219x6dbe567e() != mv0.c.f413065d || this.f367010y1) {
            return;
        }
        java.util.Objects.toString(m157199xdb574fcd().getText());
        this.f367010y1 = true;
        m157199xdb574fcd().selectAll();
    }

    @Override // ov0.t
    public void L() {
        m157201xabe4ee33().setVisibility(8);
    }

    public final void S(int i17) {
        android.view.View m157205x83e42eef = m157205x83e42eef();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10948xe76107c2 c10948xe76107c2 = m157205x83e42eef instanceof com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10948xe76107c2 ? (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10948xe76107c2) m157205x83e42eef : null;
        if (c10948xe76107c2 != null) {
            c10948xe76107c2.a(i17);
        }
    }

    /* renamed from: getEditPurpose$plugin_mj_template_release */
    public final mv0.c m134219x6dbe567e() {
        mv0.c cVar = (mv0.c) com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6.k(this, "key_edit_purpose", null, 2, null);
        return cVar == null ? mv0.c.f413066e : cVar;
    }

    /* renamed from: setFancyTextUiState */
    public final void m134220x3b8cf669(kw0.e state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        java.util.List<kw0.a> list = state.f394334a;
        if (list.isEmpty()) {
            return;
        }
        kw0.k kVar = state.f394336c;
        if (kVar instanceof kw0.f) {
            return;
        }
        boolean z17 = kVar instanceof kw0.g;
        int i17 = state.f394335b;
        if (!z17) {
            if (kVar instanceof kw0.i) {
                m134218x4e1e92f7(list);
                S(i17);
                return;
            } else {
                if (kVar instanceof kw0.j) {
                    S(i17);
                    return;
                }
                return;
            }
        }
        kw0.g gVar = (kw0.g) kVar;
        kw0.a aVar = (kw0.a) kz5.n0.a0(list, gVar.f394338a);
        if (aVar != null) {
            android.view.View m157205x83e42eef = m157205x83e42eef();
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10948xe76107c2 c10948xe76107c2 = m157205x83e42eef instanceof com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10948xe76107c2 ? (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10948xe76107c2) m157205x83e42eef : null;
            if (c10948xe76107c2 != null) {
                iw0.c cVar = c10948xe76107c2.f150847e;
                cVar.getClass();
                cVar.x(gVar.f394338a, aVar);
            }
        }
        if (kVar instanceof kw0.h) {
            S(i17);
        }
    }

    /* renamed from: setSelectedCallback */
    public final void m134221x2dcea882(mw0.h stickerStyleCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stickerStyleCallback, "stickerStyleCallback");
        android.view.View m157205x83e42eef = m157205x83e42eef();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10948xe76107c2 c10948xe76107c2 = m157205x83e42eef instanceof com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10948xe76107c2 ? (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10948xe76107c2) m157205x83e42eef : null;
        if (c10948xe76107c2 == null) {
            return;
        }
        c10948xe76107c2.m47159x371e4796(stickerStyleCallback);
    }
}
