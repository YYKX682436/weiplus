package ee5;

/* loaded from: classes9.dex */
public final class s1 extends ee5.t2 implements zd5.q, zd5.p {

    /* renamed from: r, reason: collision with root package name */
    public zd5.n f333575r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // zd5.q
    public void H3(zd5.k holder, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        ee5.u2 u2Var = (ee5.u2) holder;
        ae5.h hVar = (ae5.h) mo127525xfb80e389(i17);
        u2Var.f333601m.s(hVar.f85940k, com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834);
        java.lang.String str = hVar.f85939j;
        android.widget.TextView textView = u2Var.f333602n;
        textView.setText(str);
        zd5.n nVar = this.f333575r;
        holder.i(textView, nVar != null ? nVar.f553235g : null);
    }

    @Override // ee5.t2
    public android.text.SpannableString O6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.String str = ((ee5.e3) pf5.z.f435481a.a(activity).a(ee5.e3.class)).f333403f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemNoteUIC", "getEmptyResultString >> " + str);
        return o13.q.m(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.fgw), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f575306p05), str);
    }

    @Override // ee5.t2
    public zd5.n P6() {
        if (this.f333575r == null) {
            this.f333575r = new zd5.n(m158354x19263085(), this, this);
        }
        zd5.n nVar = this.f333575r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(nVar);
        return nVar;
    }

    @Override // ee5.t2
    public int Q6() {
        return 11;
    }

    @Override // zd5.p
    public void W2(android.view.View v17, int i17, ae5.g item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemNoteUIC", "onItemClick");
        U6();
        de5.a.e(de5.a.f310929a, 11, 0, 0, 6, null);
        ot0.q v18 = ot0.q.v(pt0.f0.f439742b1.n(item.f85938i, item.f85933d).j());
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5824x69fbb00a c5824x69fbb00a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5824x69fbb00a();
        c5824x69fbb00a.f136132g.f89439c = v17.getContext();
        am.sn snVar = c5824x69fbb00a.f136132g;
        snVar.f89437a = item.f85933d;
        snVar.f89442f = item.f85938i;
        snVar.f89440d = false;
        snVar.f89438b = v18 != null ? v18.f430196h0 : null;
        snVar.f89443g = 6;
        c5824x69fbb00a.e();
    }

    @Override // zd5.p
    public void a6(android.view.View v17, int i17, ae5.g item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemNoteUIC", "[onItemLongClick] position:%s", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.ui.p2740x696c9db.s6 s6Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.s6(v17.getContext());
        de5.a.f310929a.c(14, 11);
        s6Var.a(v17, new ee5.o1(this, v17), new ee5.p1(item, this), null);
    }

    @Override // zd5.q
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 c(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.efn, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new ee5.u2(inflate);
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
