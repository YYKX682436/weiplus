package ee5;

/* loaded from: classes9.dex */
public final class a2 extends ee5.t2 implements zd5.q, zd5.p {

    /* renamed from: r, reason: collision with root package name */
    public zd5.n f333347r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // zd5.q
    public void H3(zd5.k holder, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        ee5.f3 f3Var = (ee5.f3) holder;
        ae5.k kVar = (ae5.k) mo127525xfb80e389(i17);
        boolean z17 = kVar.f85956j;
        android.widget.ImageView imageView = f3Var.f333412m;
        if (z17) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kVar.f85958l)) {
                imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bgo);
            } else {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(imageView, kVar.f85958l);
            }
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kVar.f85958l)) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, kVar.f85958l, null);
        }
        int i19 = kVar.f85957k;
        android.widget.TextView textView = f3Var.f333413n;
        textView.setText(i19);
        zd5.n nVar = this.f333347r;
        holder.i(textView, nVar != null ? nVar.f553235g : null);
    }

    @Override // ee5.t2
    public android.text.SpannableString O6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.String str = ((ee5.e3) pf5.z.f435481a.a(activity).a(ee5.e3.class)).f333403f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemShareCardUIC", "getEmptyResultString >> " + str);
        return o13.q.m(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.fgw), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f575307p06), str);
    }

    @Override // ee5.t2
    public zd5.n P6() {
        if (this.f333347r == null) {
            this.f333347r = new zd5.n(m158354x19263085(), this, this);
        }
        zd5.n nVar = this.f333347r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(nVar);
        return nVar;
    }

    @Override // ee5.t2
    public int Q6() {
        return 9;
    }

    @Override // zd5.p
    public void W2(android.view.View v17, int i17, ae5.g item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemShareCardUIC", "onItemClick");
        U6();
        de5.a.e(de5.a.f310929a, 9, 0, 0, 6, null);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(item.f85938i, item.f85933d);
        android.content.Context context = v17.getContext();
        java.lang.String V1 = n17.V1();
        if (V1 == null) {
            V1 = n17.y0();
        }
        java.lang.String str = V1;
        java.lang.String j17 = n17.j();
        if (j17 == null) {
            j17 = "";
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wg.a(context, str, j17, com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(n17.Q0()), n17.A0() == 0, n17);
    }

    @Override // zd5.p
    public void a6(android.view.View v17, int i17, ae5.g item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemShareCardUIC", "[onItemLongClick] position:%s", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.ui.p2740x696c9db.s6 s6Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.s6(v17.getContext());
        de5.a.f310929a.c(14, 9);
        s6Var.a(v17, new ee5.w1(this, v17), new ee5.x1(item, this), null);
    }

    @Override // zd5.q
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 c(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bct, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new ee5.f3(inflate);
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
