package ee5;

/* loaded from: classes9.dex */
public final class n1 extends ee5.t2 implements zd5.q, zd5.p {

    /* renamed from: r, reason: collision with root package name */
    public zd5.n f333511r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // zd5.q
    public void H3(zd5.k holder, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        ee5.o2 o2Var = (ee5.o2) holder;
        ae5.f fVar = (ae5.f) mo127525xfb80e389(i17);
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        android.graphics.Bitmap m07 = m11.b1.Di().m0(null, fVar.f85929l, i65.a.g(m158354x19263085()), false);
        android.widget.ImageView imageView = o2Var.f333522m;
        if (m07 == null || m07.isRecycled()) {
            android.graphics.Bitmap Di = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(fVar.f85927j, 1, i65.a.g(m158354x19263085()));
            if (Di == null || Di.isRecycled()) {
                imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78435x7b83bce4);
            } else {
                imageView.setImageBitmap(Di);
            }
        } else {
            imageView.setImageBitmap(m07);
        }
        java.lang.String str = fVar.f85928k;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        android.widget.TextView textView = o2Var.f333523n;
        textView.setText(str);
        zd5.n nVar = this.f333511r;
        holder.i(textView, nVar != null ? nVar.f553235g : null);
    }

    @Override // ee5.t2
    public android.text.SpannableString O6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.String str = ((ee5.e3) pf5.z.f435481a.a(activity).a(ee5.e3.class)).f333403f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemMusicUIC", "getEmptyResultString >> " + str);
        return o13.q.m(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.fgw), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.fgu), str);
    }

    @Override // ee5.t2
    public zd5.n P6() {
        if (this.f333511r == null) {
            this.f333511r = new zd5.n(m158354x19263085(), this, this);
        }
        zd5.n nVar = this.f333511r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(nVar);
        return nVar;
    }

    @Override // ee5.t2
    public int Q6() {
        return 4;
    }

    @Override // zd5.p
    public void W2(android.view.View v17, int i17, ae5.g item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemMusicUIC", "onItemClick");
        U6();
        de5.a.e(de5.a.f310929a, 4, 0, 0, 6, null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionMusic.k(v17.getContext(), null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemMusicUIC", "go to music " + item.f85933d);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(item.f85938i, item.f85933d);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.o6.f283598a.d(m158354x19263085(), n17, ot0.q.v(n17.j()));
        }
    }

    @Override // zd5.p
    public void a6(android.view.View v17, int i17, ae5.g item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemMusicUIC", "[onItemLongClick] position:%s", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.ui.p2740x696c9db.s6 s6Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.s6(v17.getContext());
        de5.a.f310929a.c(14, 4);
        s6Var.a(v17, new ee5.j1(this, v17), new ee5.k1(item, this), null);
    }

    @Override // zd5.q
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 c(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bct, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new ee5.o2(inflate);
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
