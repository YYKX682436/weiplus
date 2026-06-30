package lw0;

/* loaded from: classes5.dex */
public class c extends qv0.f {
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe I;

    /* renamed from: J, reason: collision with root package name */
    public final java.util.ArrayList f403063J;
    public final lw0.b K;
    public lw0.a L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f403063J = new java.util.ArrayList();
        this.K = new lw0.b(this);
    }

    /* renamed from: setStyleDataList */
    private final void m146397x4e1e92f7(java.util.List<kw0.a> list) {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10948xe76107c2 L = L();
        if (L != null) {
            L.m47160x4e1e92f7(list);
        }
    }

    public final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10949xcd11d34d K() {
        java.lang.Object obj;
        mv0.d dVar = mv0.d.f413068d;
        java.util.Iterator it = this.f403063J.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((mv0.e) obj).f413072b == dVar) {
                break;
            }
        }
        mv0.e eVar = (mv0.e) obj;
        android.view.View view = eVar != null ? eVar.f413073c : null;
        return (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10949xcd11d34d) (view instanceof com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10949xcd11d34d ? view : null);
    }

    public final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10948xe76107c2 L() {
        java.lang.Object obj;
        mv0.d dVar = mv0.d.f413069e;
        java.util.Iterator it = this.f403063J.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((mv0.e) obj).f413072b == dVar) {
                break;
            }
        }
        mv0.e eVar = (mv0.e) obj;
        android.view.View view = eVar != null ? eVar.f413073c : null;
        return (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10948xe76107c2) (view instanceof com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10948xe76107c2 ? view : null);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q
    public ou0.z b() {
        return new ou0.v(false, 1, null);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dfy, bodyContainerLayout);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.q9c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.I = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) findViewById;
    }

    /* renamed from: getDestID$plugin_mj_template_release */
    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 m146398x95ce11a9() {
        return (com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78) com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6.k(this, "ket_dest_segment", null, 2, null);
    }

    /* renamed from: getEditPurpose$plugin_mj_template_release */
    public final mv0.c m146399x6dbe567e() {
        mv0.c cVar = (mv0.c) com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6.k(this, "ket_edit_purpose", null, 2, null);
        return cVar == null ? mv0.c.f413066e : cVar;
    }

    @Override // qv0.f
    /* renamed from: getToolbarTitle */
    public java.lang.String mo11426x7c1b2e13() {
        java.lang.String b17 = j65.q.b(getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.lmm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "safeGetString(...)");
        return b17;
    }

    /* renamed from: setSelectedCallback */
    public final void m146400x2dcea882(mw0.h callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10948xe76107c2 L = L();
        if (L == null) {
            return;
        }
        L.m47159x371e4796(callback);
    }

    /* renamed from: setWhenPickerView */
    public final void m146401xbf593c2f(android.view.View pickerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pickerView, "pickerView");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10949xcd11d34d K = K();
        if (K != null) {
            K.m47161xc7afc655(pickerView);
        }
    }

    /* renamed from: setWhenWhereUiState */
    public final void m146402x68b9052(kw0.e state) {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10948xe76107c2 L;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10948xe76107c2 L2;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10948xe76107c2 L3;
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
        if (z17) {
            kw0.g gVar = (kw0.g) kVar;
            kw0.a aVar = (kw0.a) kz5.n0.a0(list, gVar.f394338a);
            if (aVar != null && (L3 = L()) != null) {
                iw0.c cVar = L3.f150847e;
                cVar.getClass();
                cVar.x(gVar.f394338a, aVar);
            }
            if (!(kVar instanceof kw0.h) || (L2 = L()) == null) {
                return;
            }
            L2.a(i17);
            return;
        }
        if (!(kVar instanceof kw0.i)) {
            if (!(kVar instanceof kw0.j) || (L = L()) == null) {
                return;
            }
            L.a(i17);
            return;
        }
        m146397x4e1e92f7(list);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10948xe76107c2 L4 = L();
        if (L4 != null) {
            L4.a(i17);
        }
    }

    /* renamed from: setWhereText */
    public final void m146403x221fdc72(java.lang.String str) {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10949xcd11d34d K = K();
        if (K != null) {
            K.m47162x221fdc72(str);
        }
    }
}
