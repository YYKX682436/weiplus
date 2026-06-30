package xs2;

/* loaded from: classes.dex */
public final class t0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.z12 f537914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f537915e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f537916f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f537917g;

    public t0(r45.z12 z12Var, yz5.l lVar, gk2.e eVar, android.content.Context context) {
        this.f537914d = z12Var;
        this.f537915e = lVar;
        this.f537916f = eVar;
        this.f537917g = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        r45.z12 z12Var = this.f537914d;
        if (itemId != 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select msg:");
            r45.t12 t12Var = (r45.t12) z12Var.m75936x14adae67(0);
            sb6.append(t12Var != null ? t12Var.m75945x2fec8307(0) : null);
            sb6.append('-');
            r45.t12 t12Var2 = (r45.t12) z12Var.m75936x14adae67(0);
            sb6.append(t12Var2 != null ? t12Var2.m75945x2fec8307(2) : null);
            sb6.append(",but do nothing!");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ReplayBulletPopupHelper", sb6.toString());
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("complain msg:");
        r45.t12 t12Var3 = (r45.t12) z12Var.m75936x14adae67(0);
        sb7.append(t12Var3 != null ? t12Var3.m75945x2fec8307(0) : null);
        sb7.append('-');
        r45.t12 t12Var4 = (r45.t12) z12Var.m75936x14adae67(0);
        sb7.append(t12Var4 != null ? t12Var4.m75945x2fec8307(2) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ReplayBulletPopupHelper", sb7.toString());
        r45.un1 un1Var = new r45.un1();
        un1Var.set(1, db2.t4.f309704a.a(10297));
        gk2.e eVar = this.f537916f;
        un1Var.set(2, java.lang.Long.valueOf(((ct2.j) eVar.a(ct2.j.class)).Q6()));
        un1Var.set(3, java.lang.Long.valueOf(((ct2.j) eVar.a(ct2.j.class)).O6()));
        un1Var.set(4, z12Var.m75945x2fec8307(1));
        r45.t12 t12Var5 = (r45.t12) z12Var.m75936x14adae67(0);
        un1Var.set(5, java.lang.Long.valueOf(t12Var5 != null ? t12Var5.m75942xfb822ef2(5) : 0L));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 10297;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivecomplainreplaymsg";
        lVar.f152197a = un1Var;
        lVar.f152198b = new r45.vn1();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
        wi6.p(a17);
        az2.j jVar = (az2.j) wi6;
        az2.j.u(jVar, this.f537917g, null, 0L, 6, null);
        pq5.g l17 = jVar.l();
        if (l17 != null) {
            android.content.Context context = this.f537917g;
            l17.K(new xs2.s0(context));
            if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                l17.f((im5.b) context);
            }
        }
        this.f537915e.mo146xb9724478(java.lang.Integer.valueOf(menuItem.getItemId()));
    }
}
