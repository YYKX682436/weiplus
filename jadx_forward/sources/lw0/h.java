package lw0;

/* loaded from: classes5.dex */
public final class h implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lw0.l f403070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lw0.c f403071e;

    public h(lw0.l lVar, lw0.c cVar) {
        this.f403070d = lVar;
        this.f403071e = cVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        boolean l76;
        kw0.e eVar = (kw0.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        lw0.l lVar = this.f403070d;
        lVar.getClass();
        kw0.k kVar = eVar.f394336c;
        if ((kVar instanceof kw0.h) || (kVar instanceof kw0.j)) {
            l76 = lVar.l7(eVar);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StickerStyleReplacePanel", "onWhenWhereReplaced: updateState " + kVar);
            l76 = true;
        }
        if (l76) {
            lVar.v7(this.f403071e, eVar);
        }
    }
}
