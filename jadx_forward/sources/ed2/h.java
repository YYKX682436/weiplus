package ed2;

/* loaded from: classes2.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ed2.a f332799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ed2.i f332800e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ed2.a aVar, ed2.i iVar) {
        super(0);
        this.f332799d = aVar;
        this.f332800e = iVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Boolean bool;
        boolean z17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[showTargetWithResult] show ");
        ed2.a aVar = this.f332799d;
        sb6.append(aVar);
        sb6.append(", current: ");
        ed2.i iVar = this.f332800e;
        sb6.append(iVar.f332802e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedBubbleTipsManager", sb6.toString());
        ed2.d dVar = (ed2.d) iVar.f332801d.get(aVar);
        if (dVar != null) {
            ed2.c cVar = (ed2.c) dVar;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rm rmVar = cVar.f332791b;
            if (((ed2.m) ((jz5.n) rmVar.f332814c).mo141623x754a37bb()).O6(rmVar.f332813b)) {
                ed2.i iVar2 = cVar.f332793d;
                in5.s0 s0Var = iVar2.f332803f;
                if (s0Var != null) {
                    android.view.View p17 = s0Var.p(cVar.f332790a);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
                    rmVar.c(p17);
                    rmVar.setOnDismissListener(new ed2.b(iVar2, cVar));
                }
                z17 = true;
            } else {
                z17 = false;
            }
            bool = java.lang.Boolean.valueOf(z17);
        } else {
            bool = null;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.FALSE)) {
            iVar.f332802e = aVar;
        }
        return jz5.f0.f384359a;
    }
}
