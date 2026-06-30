package wv0;

/* loaded from: classes5.dex */
public final class q extends qv0.f {
    public yz5.a I;

    /* renamed from: J, reason: collision with root package name */
    public yz5.l f531461J;
    public yz5.p K;
    public yz5.l L;
    public yz5.l M;
    public final jz5.g N;
    public final jz5.g P;
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.g1 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.N = jz5.h.b(new wv0.p(this));
        this.P = jz5.h.b(new wv0.o(this));
        this.Q = new p012xc85e97e9.p103xe821e364.p104xd1075a44.g1(new rv0.e7(12, 0, new wv0.l(this), wv0.m.f531457d));
    }

    public static final void L(wv0.q qVar, int i17, int i18) {
        sv0.j m174519xdf919e9b = qVar.m174519xdf919e9b();
        java.util.ArrayList arrayList = m174519xdf919e9b.f357503d;
        vv0.n nVar = (vv0.n) kz5.n0.a0(arrayList, i17);
        if (nVar != null) {
            arrayList.remove(nVar);
            try {
                arrayList.add(i18, nVar);
            } catch (java.lang.IndexOutOfBoundsException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SortSegmentsPanel", java.lang.String.valueOf(e17.getStackTrace()));
            }
        }
        m174519xdf919e9b.m8150x87567217(i17, i18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getSortAdapter */
    public final sv0.j m174519xdf919e9b() {
        return (sv0.j) ((jz5.n) this.P).mo141623x754a37bb();
    }

    /* renamed from: getSortRv */
    private final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m174520x2fa63378() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.N).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo141623x754a37bb;
    }

    @Override // qv0.f
    public boolean D() {
        return false;
    }

    public final void M(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        java.util.Iterator it = m174519xdf919e9b().f357503d.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((vv0.n) it.next()).f521931a, segmentID)) {
                break;
            } else {
                i17++;
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        if (!(valueOf.intValue() != -1)) {
            valueOf = null;
        }
        if (valueOf != null) {
            m174519xdf919e9b().z(valueOf.intValue(), null);
        }
    }

    public final void N(java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        m174519xdf919e9b().y(list);
    }

    public final void O(dx0.g coverThumbnailProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverThumbnailProvider, "coverThumbnailProvider");
        int i17 = 0;
        for (java.lang.Object obj : m174519xdf919e9b().f357503d) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            vv0.n nVar = (vv0.n) obj;
            if (nVar.f521932b == null) {
                m174519xdf919e9b().x(i17, vv0.n.a(nVar, null, coverThumbnailProvider.d(nVar.f521931a), 0, false, false, 29, null));
            }
            i17 = i18;
        }
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570799dg2, bodyContainerLayout);
    }

    /* renamed from: getOnAttached */
    public final yz5.a m174521xb3775899() {
        return this.I;
    }

    /* renamed from: getOnItemGrabbed */
    public final yz5.l m174522xcaca950d() {
        return this.L;
    }

    /* renamed from: getOnItemReleased */
    public final yz5.l m174523x68734de5() {
        return this.M;
    }

    /* renamed from: getOnSegmentClicked */
    public final yz5.l m174524xa3bfa8a9() {
        return this.f531461J;
    }

    /* renamed from: getOnSegmentSwitch */
    public final yz5.p m174525xdf208672() {
        return this.K;
    }

    @Override // qv0.f
    /* renamed from: getToolbarTitle */
    public java.lang.String mo11426x7c1b2e13() {
        java.lang.String string = j65.q.a(getContext()).getString(com.p314xaae8f345.mm.R.C30867xcad56011.lla);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void p() {
        yz5.a aVar = this.I;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    /* renamed from: setOnAttached */
    public final void m174526xe19ba6a5(yz5.a aVar) {
        this.I = aVar;
    }

    /* renamed from: setOnItemGrabbed */
    public final void m174527x5da0fb81(yz5.l lVar) {
        this.L = lVar;
    }

    /* renamed from: setOnItemReleased */
    public final void m174528x3069b5f1(yz5.l lVar) {
        this.M = lVar;
    }

    /* renamed from: setOnSegmentClicked */
    public final void m174529x47bc3db5(yz5.l lVar) {
        this.f531461J = lVar;
    }

    /* renamed from: setOnSegmentSwitch */
    public final void m174530x15f71fe6(yz5.p pVar) {
        this.K = pVar;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void u(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q panel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        android.content.res.Resources a17 = j65.q.a(getContext());
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m174520x2fa63378 = m174520x2fa63378();
        m174520x2fa63378.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(m174520x2fa63378.getContext(), 0, false));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d990 = m174520x2fa63378.m7949x5701d990();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.o3 o3Var = m7949x5701d990 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.o3 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.o3) m7949x5701d990 : null;
        if (o3Var != null) {
            o3Var.f93715g = false;
        }
        m174520x2fa63378.N(new lv0.c(a17.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), a17.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz), a17.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz), 0, 0, lv0.f.f403022f, 24, null));
        m174520x2fa63378.mo7960x6cab2c8d(m174519xdf919e9b());
        this.Q.d(m174520x2fa63378());
    }
}
