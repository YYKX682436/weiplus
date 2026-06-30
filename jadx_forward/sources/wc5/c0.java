package wc5;

/* loaded from: classes10.dex */
public final class c0 extends wm3.a {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.List f526072h = kz5.c0.i("4", "27", "28", "152", "153", "156", "157", "159", "160");

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f526073d;

    /* renamed from: e, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f526074e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f526075f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f526076g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 baseActivity) {
        super(baseActivity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseActivity, "baseActivity");
        this.f526073d = baseActivity;
        this.f526076g = kz5.p0.f395529d;
    }

    public final uc5.r T6() {
        android.view.LayoutInflater.Factory factory = this.f526073d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(factory, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.history.base.MsgHistoryGalleryController");
        return (uc5.r) factory;
    }

    public final void U6(java.util.List list) {
        xm3.t0 b17 = xm3.u0.b(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) T6()).m7());
        if (b17 == null) {
            return;
        }
        java.util.List m82898xfb7e5820 = b17.m82898xfb7e5820();
        java.util.ArrayList arrayList = m82898xfb7e5820 instanceof java.util.ArrayList ? (java.util.ArrayList) m82898xfb7e5820 : null;
        if (arrayList == null) {
            return;
        }
        uc5.i0 i0Var = new uc5.i0(list);
        if (this.f526075f) {
            java.util.Iterator it = arrayList.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                } else if (((uc5.l0) it.next()) instanceof uc5.i0) {
                    break;
                } else {
                    i17++;
                }
            }
            if (i17 >= 0) {
                arrayList.set(i17, i0Var);
                b17.m8147xed6e4d18(i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryPersonRecommendUIC", "updatePersonRecommendRow: index=" + i17 + ", items=" + list.size());
                return;
            }
        }
        arrayList.add(0, i0Var);
        b17.m8149x8b456734(0);
        this.f526075f = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryPersonRecommendUIC", "insertPersonRecommendRow: items=" + list.size());
    }

    public final void V6(java.lang.String query, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        if (!z17 || r26.n0.N(query) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) T6()).B, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.q.f283315f)) {
            W6();
            this.f526076g = kz5.p0.f395529d;
        } else {
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f526074e;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            this.f526074e = v65.i.b(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) T6()).k7(), null, new wc5.b0(this, query, null), 1, null);
        }
    }

    public final void W6() {
        if (this.f526075f) {
            xm3.t0 b17 = xm3.u0.b(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) T6()).m7());
            if (b17 == null) {
                this.f526075f = false;
                return;
            }
            java.util.List m82898xfb7e5820 = b17.m82898xfb7e5820();
            java.util.ArrayList arrayList = m82898xfb7e5820 instanceof java.util.ArrayList ? (java.util.ArrayList) m82898xfb7e5820 : null;
            if (arrayList == null) {
                this.f526075f = false;
                return;
            }
            java.util.Iterator it = arrayList.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                } else if (((uc5.l0) it.next()) instanceof uc5.i0) {
                    break;
                } else {
                    i17++;
                }
            }
            if (i17 >= 0) {
                arrayList.remove(i17);
                b17.m8155x27702c4(i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryPersonRecommendUIC", "removePersonRecommendRow: index=" + i17);
            }
            this.f526075f = false;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onFinished */
    public void mo13982x7cf2e371() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f526074e;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f526074e = null;
        this.f526075f = false;
        this.f526076g = kz5.p0.f395529d;
        super.mo13982x7cf2e371();
    }
}
