package or1;

/* loaded from: classes9.dex */
public class f1 extends com.p314xaae8f345.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public bb5.e f429023o;

    /* renamed from: p, reason: collision with root package name */
    public bb5.g f429024p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12981xe277674e f429025q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12981xe277674e activityC12981xe277674e, android.content.Context context) {
        super(context, new r45.co());
        this.f429025q = activityC12981xe277674e;
        this.f429023o = null;
        this.f429024p = new bb5.g(15, new or1.b1(this));
        q();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        r45.co coVar = (r45.co) obj;
        if (coVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EnterpriseBizListAdapter", "item == null");
            coVar = new r45.co();
        }
        if (cursor != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
            z3Var.mo9015xbf5d97fd(cursor);
            qk.o oVar = new qk.o();
            oVar.mo9015xbf5d97fd(cursor);
            coVar.f453209d = z3Var.d1();
            coVar.f453210e = z3Var;
            coVar.f453211f = oVar;
        }
        return coVar;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        or1.e1 e1Var;
        if (this.f429023o == null) {
            this.f429023o = new or1.d1(this);
        }
        bb5.g gVar = this.f429024p;
        if (gVar != null) {
            gVar.b(i17, this.f429023o);
        }
        if (view == null) {
            e1Var = new or1.e1(this);
            view2 = android.view.View.inflate(this.f294141e, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570273a91, null);
            e1Var.f429015a = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.k5l);
            e1Var.f429016b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.k5r);
            view2.setTag(e1Var);
        } else {
            view2 = view;
            e1Var = (or1.e1) view.getTag();
        }
        r45.co coVar = (r45.co) getItem(i17);
        if (coVar == null) {
            e1Var.a();
            return view2;
        }
        e1Var.a();
        int paddingBottom = view2.getPaddingBottom();
        int paddingTop = view2.getPaddingTop();
        int paddingRight = view2.getPaddingRight();
        int paddingLeft = view2.getPaddingLeft();
        view2.setBackgroundDrawable(i65.a.i(this.f294141e, com.p314xaae8f345.mm.R.C30861xcebc809e.f562839q2));
        view2.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        java.lang.String f27 = coVar.f453210e.f2();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (f27 == null) {
            f27 = "";
        }
        android.widget.TextView textView = e1Var.f429016b;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = this.f294141e;
        float textSize = e1Var.f429016b.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, f27, textSize));
        e1Var.f429016b.setVisibility(0);
        e1Var.f429015a.setVisibility(0);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(coVar.f453210e.d1())) {
            e1Var.f429015a.setImageDrawable(null);
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(e1Var.f429015a, coVar.f453210e.d1(), null);
        }
        return view2;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.p314xaae8f345.mm.ui.z9, l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnterpriseBizListAdapter", "onNotifyChange");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new or1.c1(this));
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        android.database.Cursor k17;
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EnterpriseBizListAdapter", "accHasReady");
            return;
        }
        c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12981xe277674e activityC12981xe277674e = this.f429025q;
        int i17 = activityC12981xe277674e.f175557f;
        if (i17 != 1) {
            k17 = null;
            if (i17 == 2) {
                r01.x cj6 = r01.q3.cj();
                java.lang.String str = activityC12981xe277674e.f175558g;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                cj6.K1(sb6);
                cj6.W0(sb6);
                cj6.L0(sb6, str);
                cj6.J0(sb6, false);
                cj6.z0(sb6, false);
                sb6.append(" order by ");
                sb6.append("rcontact.type & 2048 desc, rcontact.showHead asc,  case when length(rcontact.conRemarkPYFull) > 0 then upper(rcontact.conRemarkPYFull)  else upper(rcontact.quanPin) end asc,  case when length(rcontact.conRemark) > 0 then upper(rcontact.conRemark)  else upper(rcontact.quanPin) end asc,  upper(rcontact.quanPin) asc,  upper(rcontact.nickname) asc,  upper(rcontact.username) asc ");
                java.lang.String sb7 = sb6.toString();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizInfoStorage", "getEnterpriseDisableChild sql %s", sb7);
                k17 = gm0.j1.u().f354686f.B(sb7, null);
            } else if (i17 == 3) {
                k17 = r01.q3.cj().k1(activityC12981xe277674e.f175558g, 128);
            } else if (i17 != 4) {
                k17 = r01.q3.cj().o1(activityC12981xe277674e.f175558g, true);
            } else {
                qk.o b17 = r01.z.b(activityC12981xe277674e.f175558g);
                if (b17 != null && b17.f66739xdfb76cc2 != null) {
                    k17 = r01.q3.cj().f1(b17.f66739xdfb76cc2);
                }
            }
        } else {
            k17 = r01.q3.cj().k1(activityC12981xe277674e.f175558g, 25);
        }
        s(k17);
    }
}
