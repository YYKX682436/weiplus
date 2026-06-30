package tf3;

/* loaded from: classes12.dex */
public abstract class b extends lf3.n implements sf3.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f500479d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f500480e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a f500481f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f500479d = new java.util.LinkedHashMap();
        this.f500480e = new java.util.LinkedHashMap();
        this.f500481f = new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("ScopeImageStateManager", activity, 1);
    }

    @Override // sf3.f
    public sf3.k Q3(mf3.k mediaInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        sf3.k kVar = (sf3.k) ((java.util.LinkedHashMap) this.f500479d).get(mediaInfo.mo2110x5db1b11());
        return kVar == null ? sf3.k.f488933h : kVar;
    }

    public abstract void V6();

    public void W4(mf3.k mediaInfo, sf3.l listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f500480e.put(mediaInfo.mo2110x5db1b11(), new java.lang.ref.WeakReference(listener));
    }

    public final void W6(mf3.k kVar, sf3.k state, sf3.g param) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        java.lang.String mo2110x5db1b11 = kVar.mo2110x5db1b11();
        this.f500479d.put(mo2110x5db1b11, state);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.ScopeImageStateManager", "update stateMap: id: " + mo2110x5db1b11 + ", state: " + state.name());
        java.util.Map map = this.f500480e;
        if (!map.containsKey(mo2110x5db1b11)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.ScopeImageStateManager", "notify listener error, cannot find with id: " + mo2110x5db1b11 + " , state: " + state.name());
            return;
        }
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.LinkedHashMap) map).get(mo2110x5db1b11);
        sf3.l lVar = weakReference != null ? (sf3.l) weakReference.get() : null;
        if (lVar != null) {
            v65.i.c(this.f500481f, null, new tf3.a(mo2110x5db1b11, state, lVar, param, kVar, null), 1, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.ScopeImageStateManager", "notify listener error, weak ref is invalid: " + mo2110x5db1b11 + " , state: " + state.name());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        ((java.util.LinkedHashMap) this.f500480e).clear();
        V6();
    }
}
