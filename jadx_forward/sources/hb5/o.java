package hb5;

/* loaded from: classes11.dex */
public class o extends com.p314xaae8f345.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f361774o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f361775p;

    /* renamed from: q, reason: collision with root package name */
    public final db5.c6 f361776q;

    /* renamed from: r, reason: collision with root package name */
    public o11.g f361777r;

    public o(android.content.Context context, com.p314xaae8f345.mm.ui.y9 y9Var, java.lang.String str) {
        super(context, new s01.h());
        this.f361776q = com.p314xaae8f345.mm.ui.p2642x2e06d1.C21514xd47fe41f.m79111x6b320260();
        this.f361777r = null;
        this.f294144h = y9Var;
        this.f361774o = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        this.f361775p = str;
        o11.f fVar = new o11.f();
        java.lang.String str2 = s01.r.f483457a;
        fVar.f423616g = qk.b.a(str);
        fVar.f423611b = true;
        fVar.f423628s = true;
        fVar.f423624o = com.p314xaae8f345.mm.R.raw.f78922x61de8d17;
        this.f361777r = fVar.a();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        s01.h hVar = (s01.h) obj;
        if (hVar == null) {
            hVar = new s01.h();
        }
        hVar.mo9015xbf5d97fd(cursor);
        return hVar;
    }

    @Override // com.p314xaae8f345.mm.ui.z9, l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        super.g(i17, a1Var, obj);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return 0;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        hb5.n nVar;
        s01.h hVar = (s01.h) getItem(i17);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f361774o;
        if (view == null) {
            nVar = new hb5.n();
            view2 = android.view.View.inflate(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30864xbddafb2a.a98, null);
            nVar.f361769a = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.a_4);
            nVar.f361770b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.k3s);
            view2.setTag(nVar);
        } else {
            view2 = view;
            nVar = (hb5.n) view.getTag();
        }
        n11.a.b().h(hVar.f69175x35be6339, nVar.f361769a, this.f361777r);
        nVar.f361770b.setText(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(abstractActivityC21394xb3d2c0cf, hVar.f69171x736d1fa8, (int) nVar.f361770b.getTextSize()));
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        c();
        s01.m Ui = r01.q3.Ui();
        Ui.getClass();
        s(Ui.f483433d.B("select * from BizChatInfo where brandUserName = '" + this.f361775p + "' and (bitFlag & 8) != 0  order by  case when length(BizChatInfo.chatNamePY) > 0 then upper(BizChatInfo.chatNamePY)  else upper(BizChatInfo.chatName) end asc,  upper(BizChatInfo.chatNamePY) asc,  upper(BizChatInfo.chatName) asc ", null));
        com.p314xaae8f345.mm.ui.y9 y9Var = this.f294144h;
        if (y9Var != null) {
            y9Var.b(null);
        }
        notifyDataSetChanged();
    }
}
