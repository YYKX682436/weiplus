package vf3;

/* loaded from: classes12.dex */
public abstract class i extends lf3.n implements vf3.a {

    /* renamed from: d */
    public final java.util.Map f517932d;

    /* renamed from: e */
    public final java.util.Map f517933e;

    /* renamed from: f */
    public final com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a f517934f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f517932d = new java.util.LinkedHashMap();
        this.f517933e = new java.util.LinkedHashMap();
        this.f517934f = new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("ScopeLiveStateManager", activity, 1);
    }

    public static /* synthetic */ void Z6(vf3.i iVar, mf3.k kVar, vf3.e eVar, vf3.f fVar, gg3.c cVar, sf3.g gVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifyState");
        }
        iVar.Y6(kVar, eVar, (i17 & 2) != 0 ? new vf3.f(eVar, null, 0, 0.0f, 14, null) : fVar, (i17 & 4) != 0 ? null : cVar, (i17 & 8) != 0 ? null : gVar);
    }

    public abstract void V6();

    public final java.lang.String W6(mf3.k kVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kVar, "<this>");
        return kVar.mo2110x5db1b11() + '@' + kVar.mo147256x74bf41ce().name();
    }

    public vf3.f X6(mf3.k mediaInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        return (vf3.f) ((java.util.LinkedHashMap) this.f517933e).get(W6(mediaInfo));
    }

    public final void Y6(mf3.k kVar, vf3.e state, vf3.f info, gg3.c cVar, sf3.g gVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        if (cVar == null) {
            cVar = kVar.a();
        }
        gg3.c cVar2 = cVar;
        if (gVar == null) {
            gVar = kVar.e();
        }
        sf3.g gVar2 = gVar;
        if (cVar2 == null || gVar2 == null) {
            throw new java.lang.RuntimeException("live load param is null");
        }
        java.lang.String mo2110x5db1b11 = kVar.mo2110x5db1b11();
        info.f517922a = state;
        this.f517933e.put(W6(kVar), info);
        java.util.Map map = this.f517932d;
        if (!map.containsKey(mo2110x5db1b11)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.ScopeLiveStateManager", "notify listener error, cannot find with id: " + mo2110x5db1b11 + " , state: " + state.name());
            return;
        }
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.LinkedHashMap) map).get(mo2110x5db1b11);
        vf3.g gVar3 = weakReference != null ? (vf3.g) weakReference.get() : null;
        if (gVar3 != null) {
            v65.i.c(this.f517934f, null, new vf3.h(mo2110x5db1b11, state, gVar3, cVar2, gVar2, info, null), 1, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.ScopeLiveStateManager", "notify listener error, weak ref is invalid: " + mo2110x5db1b11 + " , state: " + state.name());
    }

    public final void a7(mf3.k mediaInfo, vf3.g listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f517932d.put(mediaInfo.mo2110x5db1b11(), new java.lang.ref.WeakReference(listener));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        ((java.util.LinkedHashMap) this.f517932d).clear();
        V6();
    }
}
