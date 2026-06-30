package mm3;

/* loaded from: classes10.dex */
public final class n extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16708x2eab1ea0 f411186d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f411187e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f411188f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f411189g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f411190h;

    /* renamed from: i, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f411191i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f411192m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f411193n;

    /* renamed from: o, reason: collision with root package name */
    public int f411194o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f411195p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f411196q;

    /* renamed from: r, reason: collision with root package name */
    public final qm3.i f411197r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f411191i = p3325xe03a0797.p3326xc267989b.z0.i(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null));
        this.f411194o = -1;
        this.f411196q = new java.util.HashMap();
        this.f411197r = new qm3.i(new mm3.m(activity));
    }

    public static final void O6(mm3.n nVar) {
        nVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvPreviewTrackUIC", "exitSelectMode");
        android.view.ViewGroup viewGroup = nVar.f411187e;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectButtonsContainer");
            throw null;
        }
        viewGroup.setVisibility(8);
        android.widget.Button button = nVar.f411188f;
        if (button == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("completeButton");
            throw null;
        }
        button.setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16708x2eab1ea0 c16708x2eab1ea0 = nVar.f411186d;
        if (c16708x2eab1ea0 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tracksEditView");
            throw null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MvTracksEditView", "stopSelecting: " + c16708x2eab1ea0.getSelectedIndex());
        int selectedIndex = c16708x2eab1ea0.getSelectedIndex();
        sm3.o oVar = c16708x2eab1ea0.f233547g;
        if (selectedIndex >= 0) {
            int selectedIndex2 = c16708x2eab1ea0.getSelectedIndex();
            oVar.getClass();
            oVar.m8147xed6e4d18(selectedIndex2 + 1);
            c16708x2eab1ea0.m67414xa5ced1b5(-1);
        }
        oVar.f491431f = null;
        c16708x2eab1ea0.f233545e.setVisibility(0);
        c16708x2eab1ea0.f233560w.f491365q = true;
        c16708x2eab1ea0.f233544d.D0();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = nVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        pk4.c cVar = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h6) a17).f232719n;
        if (cVar != null) {
            gk4.r rVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.TextureViewSurfaceTextureListenerC18694xeac4a29) cVar).f256099f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f354135g, "clearPlayRange");
            rVar.f354150v = -1L;
            rVar.f354151w = -1L;
        }
        nVar.f411196q.clear();
    }

    public final void P6(long j17) {
        java.util.LinkedList linkedList = this.f411190h;
        if (linkedList == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("trackList");
            throw null;
        }
        e06.k m17 = e06.p.m(0, linkedList.size() - 1);
        java.util.LinkedList linkedList2 = this.f411190h;
        if (linkedList2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("trackList");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
        java.util.Iterator it = m17.iterator();
        while (it.hasNext()) {
            arrayList.add((r45.jf2) linkedList2.get(((kz5.x0) it).b()));
        }
        java.util.Iterator it6 = arrayList.iterator();
        long j18 = 0;
        while (it6.hasNext()) {
            ((r45.jf2) it6.next()).set(0, java.lang.Long.valueOf(j18));
            j18 += r7.m75939xb282bd08(1);
        }
        java.util.LinkedList linkedList3 = this.f411190h;
        if (linkedList3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("trackList");
            throw null;
        }
        r45.jf2 jf2Var = (r45.jf2) linkedList3.getLast();
        jf2Var.set(0, java.lang.Long.valueOf(j18));
        jf2Var.set(1, java.lang.Integer.valueOf((int) j17));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        qm3.i iVar = this.f411197r;
        iVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThumbCachedLoader", "release");
        java.util.Collection<qm3.a> values = iVar.f446318b.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        for (qm3.a aVar : values) {
            u26.x0.a(aVar.f446296e, null, 1, null);
            rm5.k kVar = aVar.f446292a;
            if (kVar != null) {
                kVar.mo122875x5cd39ffa();
            }
            aVar.f446292a = null;
        }
        p3325xe03a0797.p3326xc267989b.z0.e(iVar.f446319c, null, 1, null);
        p3325xe03a0797.p3326xc267989b.z0.e(this.f411191i, null, 1, null);
    }
}
