package hb5;

/* loaded from: classes11.dex */
public class c1 extends com.p314xaae8f345.mm.ui.p2690x38b72420.a5 implements l75.z0 {

    /* renamed from: n, reason: collision with root package name */
    public android.database.Cursor f361689n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f361690o;

    public c1(com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 abstractActivityC22312xbd689c47, java.util.List list, boolean z17, java.lang.String str) {
        super(abstractActivityC22312xbd689c47, list, z17, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecentConversationAdapter", "create!");
        this.f361690o = str;
        s();
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        s();
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f361689n.getCount() + 1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.l4 l4Var = this.f288609d;
        if (i17 == 0) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0 n0Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.n0(i17);
            n0Var.f288436y = l4Var.mo8774x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574496ig5);
            return n0Var;
        }
        if (i17 <= 0 || !this.f361689n.moveToPosition((i17 + 0) - 1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecentConversationAdapter", "create Data Item Error position=%d", java.lang.Integer.valueOf(i17));
            return null;
        }
        hb5.i iVar = new hb5.i(i17);
        s01.b bVar = new s01.b();
        bVar.mo9015xbf5d97fd(this.f361689n);
        if (iVar.D != -1) {
            return iVar;
        }
        iVar.D = bVar.f69064xa6206081;
        s01.h z07 = r01.q3.Ui().z0(bVar.f69064xa6206081);
        if (z07.y0()) {
            iVar.f288351y = z07.f69171x736d1fa8;
            iVar.C = z07.f69175x35be6339;
            iVar.f288352z = z07.f69170x75756b18;
        } else {
            s01.a0 y07 = r01.q3.Vi().y0(z07.f69169xf75e5c37);
            if (y07 != null) {
                iVar.f288351y = y07.f65841xdde069b;
                iVar.C = y07.f65837x35be6339;
                iVar.f288352z = y07.f65836x75756b18;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(iVar.f288351y)) {
            iVar.f288351y = l4Var.mo8774x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4y);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar.f288352z)) {
            return iVar;
        }
        iVar.f288352z = bVar.f69065x75756b18;
        return iVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public void k() {
        h();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecentConversationAdapter", "finish!");
        android.database.Cursor cursor = this.f361689n;
        if (cursor != null) {
            cursor.close();
            this.f361689n = null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.a5
    public void s() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecentConversationAdapter", "resetData");
        android.database.Cursor cursor = this.f361689n;
        if (cursor != null) {
            cursor.close();
            this.f361689n = null;
        }
        this.f361689n = r01.q3.aj().L0(this.f361690o);
    }
}
