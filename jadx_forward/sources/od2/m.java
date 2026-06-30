package od2;

/* loaded from: classes11.dex */
public class m extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ od2.o f426158b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(od2.o oVar) {
        super(oVar);
        this.f426158b = oVar;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        od2.n nVar = (od2.n) eVar;
        od2.o oVar = (od2.o) gVar;
        u50.y yVar = (u50.y) i95.n0.c(u50.y.class);
        android.view.View view = nVar.f426159a;
        od2.o oVar2 = this.f426158b;
        boolean z17 = oVar2.f505294d;
        ((s50.r0) yVar).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.j(view, z17);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(nVar.f426160b, oVar.f426169u, null);
        u50.y yVar2 = (u50.y) i95.n0.c(u50.y.class);
        java.lang.CharSequence charSequence = oVar.f426170v;
        android.widget.TextView textView = nVar.f426161c;
        ((s50.r0) yVar2).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(charSequence, textView);
        u50.y yVar3 = (u50.y) i95.n0.c(u50.y.class);
        java.lang.CharSequence charSequence2 = oVar.f426171w;
        android.widget.TextView textView2 = nVar.f426162d;
        ((s50.r0) yVar3).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(charSequence2, textView2);
        u50.y yVar4 = (u50.y) i95.n0.c(u50.y.class);
        java.lang.String str = oVar.f426172x;
        android.widget.TextView textView3 = nVar.f426163e;
        ((s50.r0) yVar4).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(str, textView3);
        android.widget.ImageView imageView = nVar.f426164f;
        if (imageView == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSFinderFollowerDataItem", "viewHolder.verifyIV = null.");
            return;
        }
        ya2.b2 b2Var = oVar2.f426165q;
        if (b2Var == null || b2Var.f69300x731cac1b == null) {
            imageView.setVisibility(8);
            return;
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.m1.f542044a.c(nVar.f426164f, oVar2.f426165q.f69300x731cac1b, 1);
        nVar.f426164f.setVisibility(0);
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bc8, viewGroup, false);
        od2.n nVar = this.f426158b.f426173y;
        nVar.f426160b = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        nVar.f426161c = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
        nVar.f426162d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cut);
        nVar.f426163e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.hhi);
        nVar.f426159a = inflate.findViewById(com.p314xaae8f345.mm.R.id.d0v);
        nVar.f426164f = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f569072ox3);
        inflate.setTag(nVar);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        od2.o oVar = (od2.o) gVar;
        java.lang.String str = oVar.f426169u;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            a(this.f426158b.i(), oVar.f426167s);
            android.content.Intent intent = new android.content.Intent();
            boolean equals = str.equals(((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(context));
            intent.putExtra("finder_username", str);
            ya2.e1 e1Var = ya2.e1.f542005a;
            if (equals) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                e1Var.x(context, intent, 30, 20);
            } else {
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(30, 20, 32, intent);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                e1Var.w(context, intent);
            }
        }
        ya2.b2 b2Var = oVar.f426165q;
        java.lang.String str2 = b2Var != null ? b2Var.f69301x81118c51 : "";
        o13.a0 a0Var = (o13.a0) i95.n0.c(o13.a0.class);
        java.lang.String str3 = oVar.f426169u;
        java.lang.String charSequence = oVar.f426170v.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(z13.f.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.s3) a0Var).wi(str3, charSequence, str2, 31, ((z13.f) a17).d7());
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.s3) ((o13.a0) i95.n0.c(o13.a0.class))).Ai(oVar);
        return true;
    }
}
