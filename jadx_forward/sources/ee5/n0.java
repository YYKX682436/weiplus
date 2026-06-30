package ee5;

/* loaded from: classes9.dex */
public final class n0 extends ee5.t2 implements zd5.q, zd5.p {

    /* renamed from: r, reason: collision with root package name */
    public zd5.n f333509r;

    /* renamed from: s, reason: collision with root package name */
    public final o11.g f333510s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        o11.f fVar = new o11.f();
        fVar.f423624o = com.p314xaae8f345.mm.R.raw.f78439x49c3a51a;
        int b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 50);
        int b18 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 50);
        fVar.f423619j = b17;
        fVar.f423620k = b18;
        fVar.f423610a = true;
        this.f333510s = fVar.a();
    }

    @Override // zd5.q
    public void H3(zd5.k holder, int i17, int i18) {
        ot0.a aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        ae5.a aVar2 = (ae5.a) mo127525xfb80e389(i17);
        ee5.a aVar3 = (ee5.a) holder;
        ot0.q qVar = aVar2.f85915k;
        if (qVar != null && (aVar = (ot0.a) qVar.y(ot0.a.class)) != null && aVar.f429899v == 1) {
            aVar3.f333323n.setVisibility(0);
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar2.f85917m);
        o11.g gVar = this.f333510s;
        android.widget.ImageView imageView = aVar3.f333322m;
        android.widget.TextView textView = aVar3.f333324o;
        if (K0) {
            textView.setVisibility(8);
            n11.a.b().h(aVar2.f85918n, imageView, gVar);
            return;
        }
        textView.setVisibility(0);
        textView.setText(aVar2.f85932c);
        holder.f553228h.setText(aVar2.f85917m);
        zd5.n nVar = this.f333509r;
        holder.i(textView, nVar != null ? nVar.f553235g : null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar2.f85919o)) {
            n11.a.b().h(aVar2.f85918n, imageView, gVar);
        } else {
            l01.d0.f396294a.n(new ee5.i0(holder, aVar2, this), aVar2.f85919o, null, ((ij1.j) ((k01.u0) i95.n0.c(k01.u0.class))).Bi(45, 45));
        }
    }

    @Override // ee5.t2
    public android.text.SpannableString O6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.String str = ((ee5.e3) pf5.z.f435481a.a(activity).a(ee5.e3.class)).f333403f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSMultiItemAppBrandUIC", "getEmptyResultString >> " + str);
        return o13.q.m(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.fgw), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.fgs), str);
    }

    @Override // ee5.t2
    public zd5.n P6() {
        if (this.f333509r == null) {
            this.f333509r = new zd5.n(m158354x19263085(), this, this);
        }
        zd5.n nVar = this.f333509r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(nVar);
        return nVar;
    }

    @Override // ee5.t2
    public int Q6() {
        return 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0206 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0181 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02f9  */
    @Override // zd5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void W2(android.view.View r22, int r23, ae5.g r24) {
        /*
            Method dump skipped, instructions count: 827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ee5.n0.W2(android.view.View, int, ae5.g):void");
    }

    @Override // zd5.p
    public void a6(android.view.View v17, int i17, ae5.g item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSMultiItemAppBrandUIC", "[onItemLongClick] position:%s", java.lang.Integer.valueOf(i17));
        de5.a.f310929a.c(14, 6);
        new com.p314xaae8f345.mm.ui.p2740x696c9db.s6(v17.getContext()).a(v17, new ee5.j0(this, v17), new ee5.k0(item, this), null);
    }

    @Override // zd5.q
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 c(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bct, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new ee5.a(inflate);
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
