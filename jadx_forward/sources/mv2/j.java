package mv2;

/* loaded from: classes10.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 f413112d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.BitmapFactory.Options f413113e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413114f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mv2.l f413115g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.g f413116h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f413117i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.r f413118m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var, android.graphics.BitmapFactory.Options options, java.lang.String str, mv2.l lVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17, yz5.r rVar) {
        super(3);
        this.f413112d = yj0Var;
        this.f413113e = options;
        this.f413114f = str;
        this.f413115g = lVar;
        this.f413116h = gVar;
        this.f413117i = i17;
        this.f413118m = rVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.util.LinkedList m75941xfb821914;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String action = (java.lang.String) obj2;
        dn.h hVar = (dn.h) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var = this.f413112d;
        java.lang.String str = this.f413114f;
        mv2.l lVar = this.f413115g;
        android.graphics.BitmapFactory.Options options = this.f413113e;
        if (booleanValue) {
            yj0Var.f68965x29d3a50c = 1;
            r45.e60 v07 = yj0Var.v0();
            r45.j60 j60Var = (v07 == null || (m75941xfb821914 = v07.m75941xfb821914(1)) == null) ? null : (r45.j60) kz5.n0.Z(m75941xfb821914);
            if (j60Var != null) {
                j60Var.set(0, hVar != null ? hVar.f69524x419c440e : null);
                j60Var.set(7, hVar != null ? hVar.f69560x7b284d5e : null);
                j60Var.set(5, java.lang.Integer.valueOf(hVar != null ? (int) hVar.f69523x17c343e7 : 0));
            }
            mv2.l lVar2 = mv2.l.f413130d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("uploadImage success: outWidth ");
            sb6.append(options.outWidth);
            sb6.append(" outWidth ");
            sb6.append(options.outWidth);
            sb6.append(" width ");
            sb6.append(j60Var != null ? java.lang.Integer.valueOf(j60Var.m75939xb282bd08(2)) : null);
            sb6.append(" height ");
            sb6.append(j60Var != null ? java.lang.Integer.valueOf(j60Var.m75939xb282bd08(3)) : null);
            sb6.append(" thumb_url ");
            sb6.append(j60Var != null ? j60Var.m75945x2fec8307(7) : null);
            sb6.append(" url ");
            sb6.append(j60Var != null ? j60Var.m75945x2fec8307(0) : null);
            sb6.append(" imagePath ");
            sb6.append(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderActionManager", sb6.toString());
            mv2.i iVar = new mv2.i(yj0Var, this.f413116h, this.f413117i, this.f413118m);
            ((c61.l7) i95.n0.c(c61.l7.class)).Ij().L0(yj0Var.f68961xf609be94, yj0Var, false);
            ((c61.l7) i95.n0.c(c61.l7.class)).Ij().D0(yj0Var.f68959xf9a02e3e, yj0Var.t0(), yj0Var.f68961xf609be94, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wj0.X, yj0Var);
            lVar.d(iVar);
        } else {
            mv2.l lVar3 = mv2.l.f413130d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderActionManager", "uploadImage failed: outWidth " + options.outWidth + " outWidth " + options.outWidth + " imagePath " + str);
            lVar.c(yj0Var, action);
        }
        lVar.f413132b.remove(java.lang.Long.valueOf(yj0Var.f68961xf609be94));
        return jz5.f0.f384359a;
    }
}
