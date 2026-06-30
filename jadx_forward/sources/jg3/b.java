package jg3;

/* loaded from: classes12.dex */
public abstract class b extends lf3.n implements gg3.b {

    /* renamed from: d */
    public final java.util.Map f381186d;

    /* renamed from: e */
    public final com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a f381187e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f381186d = new java.util.LinkedHashMap();
        this.f381187e = new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("ScopeVideoStateManager", activity, 1);
    }

    public static /* synthetic */ void X6(jg3.b bVar, mf3.k kVar, gg3.d dVar, gg3.c cVar, gg3.e eVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifyState");
        }
        if ((i17 & 4) != 0) {
            eVar = new gg3.e(null, 0, 0.0f, 7, null);
        }
        bVar.W6(kVar, dVar, cVar, eVar);
    }

    public abstract void V6();

    public final void W6(mf3.k kVar, gg3.d state, gg3.c param, gg3.e info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.lang.String mo2110x5db1b11 = kVar.mo2110x5db1b11();
        java.util.Map map = this.f381186d;
        if (!map.containsKey(mo2110x5db1b11)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.ScopeVideoStateManager", "notify listener error, cannot find with id: " + mo2110x5db1b11 + " , state: " + state.name());
            return;
        }
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.LinkedHashMap) map).get(mo2110x5db1b11);
        gg3.f fVar = weakReference != null ? (gg3.f) weakReference.get() : null;
        if (fVar != null) {
            v65.i.c(this.f381187e, null, new jg3.a(mo2110x5db1b11, state, fVar, param, info, null), 1, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.ScopeVideoStateManager", "notify listener error, weak ref is invalid: " + mo2110x5db1b11 + " , state: " + state.name());
    }

    public void a5(mf3.k mediaInfo, gg3.f listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f381186d.put(mediaInfo.mo2110x5db1b11(), new java.lang.ref.WeakReference(listener));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        ((java.util.LinkedHashMap) this.f381186d).clear();
        V6();
    }
}
