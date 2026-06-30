package vo4;

/* loaded from: classes10.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vo4.i f520161d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vo4.t f520162e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(vo4.i iVar, vo4.t tVar) {
        super(0);
        this.f520161d = iVar;
        this.f520162e = tVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        vo4.i iVar = this.f520161d;
        int i17 = iVar.f520178p;
        vo4.r rVar = iVar.f520167e;
        int i18 = iVar.f520179q;
        int i19 = iVar.f520164b;
        int i27 = iVar.f520163a;
        if (i17 <= 0 || i18 <= 0) {
            rVar.b(i27, i19);
        } else {
            rVar.b(i17, i18);
        }
        iVar.f520168f = new os0.b(0, 0, iVar.f520163a, iVar.f520164b, 1, 4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogDirector", iVar.hashCode() + " setVLogSurface, updateDrawViewSize:[" + i27 + ", " + i19 + ']');
        os0.b bVar = iVar.f520168f;
        if (bVar != null) {
            bVar.u(i27, i19);
        }
        int i28 = iVar.f520178p;
        if (i28 <= 0 || i18 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogDirector", iVar.hashCode() + " setVLogSurface, update texture and draw size:[" + i27 + ", " + i19 + ']');
            os0.b bVar2 = iVar.f520168f;
            if (bVar2 != null) {
                bVar2.w(i27, i19);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogDirector", iVar.hashCode() + " setVLogSurface, update texture size from texture:[" + i28 + ", " + i18 + ']');
            os0.b bVar3 = iVar.f520168f;
            if (bVar3 != null) {
                bVar3.w(i28, i18);
            }
        }
        os0.b bVar4 = iVar.f520168f;
        if (bVar4 != null) {
            bVar4.Z = 3553;
        }
        if (bVar4 != null) {
            is0.c cVar = this.f520162e.f520222c;
            bVar4.D = cVar != null ? cVar.f375928e : -1;
        }
        android.graphics.Rect rect = iVar.f520180r;
        if (rect != null && bVar4 != null) {
            bVar4.f429541q = rect;
        }
        if (bVar4 != null) {
            bVar4.f429542r = new vo4.g(iVar);
        }
        return jz5.f0.f384359a;
    }
}
