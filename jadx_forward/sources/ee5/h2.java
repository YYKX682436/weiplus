package ee5;

/* loaded from: classes9.dex */
public final class h2 extends ee5.t2 implements zd5.q, zd5.p {

    /* renamed from: r, reason: collision with root package name */
    public zd5.n f333452r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // zd5.q
    public void H3(zd5.k holder, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        ee5.g3 g3Var = (ee5.g3) holder;
        ae5.l lVar = (ae5.l) mo127525xfb80e389(i17);
        int i19 = lVar.f85931b;
        mn2.g1 g1Var = mn2.g1.f411508a;
        android.widget.ImageView imageView = g3Var.f333424m;
        if (i19 == 111) {
            vo0.d g17 = g1Var.g();
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            g17.c(ya2.l.f542035a.e(lVar.f85960k, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), imageView, g1Var.h(mn2.f1.f411495p));
        } else {
            vo0.d f17 = g1Var.f();
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            f17.c(ya2.l.f542035a.e(lVar.f85960k, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), imageView, g1Var.h(mn2.f1.f411495p));
        }
        java.lang.String str = lVar.f85959j;
        android.widget.TextView textView = g3Var.f333425n;
        textView.setText(str);
        zd5.n nVar = this.f333452r;
        holder.i(textView, nVar != null ? nVar.f553235g : null);
    }

    @Override // ee5.t2
    public android.text.SpannableString O6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.String str = ((ee5.e3) pf5.z.f435481a.a(activity).a(ee5.e3.class)).f333403f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemShopProductUIC", "getEmptyResultString >> " + str);
        return o13.q.m(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.fgw), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.o49), str);
    }

    @Override // ee5.t2
    public zd5.n P6() {
        if (this.f333452r == null) {
            this.f333452r = new zd5.n(m158354x19263085(), this, this);
        }
        zd5.n nVar = this.f333452r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(nVar);
        return nVar;
    }

    @Override // ee5.t2
    public int Q6() {
        return 12;
    }

    @Override // zd5.p
    public void W2(android.view.View v17, int i17, ae5.g item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemShopProductUIC", "onItemClick");
        U6();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(item.f85938i, item.f85933d);
        de5.a.e(de5.a.f310929a, 12, 0, 0, 6, null);
        int i18 = item.f85931b;
        if (i18 == 82) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemShopProductUIC", "click product item");
            java.lang.Object context = v17.getContext();
            p3325xe03a0797.p3326xc267989b.l.d(new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("MicroMsg.FTSMultiItemShopProductUIC", context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null, 0, 4, null), null, null, new ee5.c2(v17, item, n17, null), 3, null);
        } else {
            if (i18 != 111) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTSMultiItemShopProductUIC", "unknown item clicked");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemShopProductUIC", "click SHOP item");
            java.lang.Object context2 = v17.getContext();
            p3325xe03a0797.p3326xc267989b.l.d(new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("MicroMsg.FTSMultiItemShopProductUIC", context2 instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context2 : null, 0, 4, null), null, null, new ee5.b2(v17, item, n17, null), 3, null);
        }
    }

    @Override // zd5.p
    public void a6(android.view.View v17, int i17, ae5.g item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemShopProductUIC", "[onItemLongClick] position:%s", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(item.f85938i, item.f85933d);
        de5.a.f310929a.c(14, 12);
        new com.p314xaae8f345.mm.ui.p2740x696c9db.s6(v17.getContext()).a(v17, new ee5.d2(this, v17), new ee5.e2(n17, this), null);
    }

    @Override // zd5.q
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 c(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bct, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new ee5.g3(inflate);
    }

    @Override // zd5.q
    /* renamed from: getCount */
    public int mo127524x7444f759() {
        return this.f333587m.size();
    }

    @Override // zd5.q
    /* renamed from: getItem */
    public ae5.g mo127525xfb80e389(int i17) {
        java.lang.Object obj = this.f333587m.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        return (ae5.g) obj;
    }
}
