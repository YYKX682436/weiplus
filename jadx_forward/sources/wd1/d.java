package wd1;

/* loaded from: classes7.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wd1.k f526334d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(wd1.k kVar) {
        super(0);
        this.f526334d = kVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("close runtime:");
        wd1.k kVar = this.f526334d;
        sb6.append(kVar.f526355d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnapshotWebViewService", sb6.toString());
        wl1.h hVar = kVar.f526357f;
        if (hVar != null) {
            hVar.b();
            kVar.f526357f = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.l lVar = kVar.f526356e;
        if (lVar != null) {
            if (lVar.getParent() != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.l lVar2 = kVar.f526356e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(lVar2);
                android.view.ViewParent parent = lVar2.getParent();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((android.view.ViewGroup) parent).removeView(kVar.f526356e);
            }
            kVar.f526356e = null;
        }
        return jz5.f0.f384359a;
    }
}
