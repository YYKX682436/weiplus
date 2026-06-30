package ee5;

/* loaded from: classes9.dex */
public final class v1 extends ee5.t2 implements zd5.q, zd5.p {

    /* renamed from: r, reason: collision with root package name */
    public zd5.n f333605r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public static final java.lang.String W6(ee5.v1 v1Var, android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, ot0.q qVar, boolean z17, int i17) {
        java.lang.String Q0;
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        v1Var.getClass();
        if (qVar == null || f9Var == null || context == null) {
            return "";
        }
        if (i17 != 1) {
            if (i17 == 3) {
                if (v1Var.Y6()) {
                    java.lang.String string4 = v1Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b2k);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string4);
                    return string4;
                }
                if (!z17) {
                    string = v1Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b2m);
                } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.X1)) {
                    string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b2l);
                } else {
                    string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b2l) + '-' + qVar.X1;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                return string;
            }
            if (i17 == 4) {
                if (v1Var.Y6()) {
                    java.lang.String string5 = v1Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b37);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string5);
                    return string5;
                }
                if (!z17) {
                    string2 = v1Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b38);
                } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.X1)) {
                    string2 = v1Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b39);
                } else {
                    string2 = v1Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b39) + '-' + qVar.X1;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
                return string2;
            }
            if (i17 == 5) {
                if (v1Var.Y6()) {
                    java.lang.String string6 = v1Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b2r);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string6);
                    return string6;
                }
                if (!z17) {
                    string3 = v1Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b2q);
                } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.X1)) {
                    string3 = v1Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b2p);
                } else {
                    string3 = v1Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b2p) + '-' + qVar.X1;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string3);
                return string3;
            }
            if (i17 == 6) {
                java.lang.String string7 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b2n);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string7, "getString(...)");
                return string7;
            }
            if (i17 != 7) {
                java.lang.String description = qVar.f430191g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(description, "description");
                return description;
            }
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 f07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).f0(f9Var.Q0());
        if (f07 != null) {
            Q0 = f07.g2();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Q0);
        } else {
            Q0 = f9Var.Q0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Q0);
        }
        if (v1Var.Y6()) {
            java.lang.String string8 = v1Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572395b30);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string8);
            return string8;
        }
        java.lang.String string9 = z17 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.X1) ? f9Var.A0() != 1 ? v1Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572401b36) : v1Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572399b34, Q0) : qVar.X1 : v1Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b2m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string9);
        return string9;
    }

    public static final int X6(ee5.v1 v1Var, android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, ot0.q qVar, boolean z17, int i17) {
        v1Var.getClass();
        if (qVar != null && f9Var != null && context != null && i17 != 1) {
            if (i17 != 3) {
                if (i17 == 4) {
                    return com.p314xaae8f345.mm.R.raw.f78733x11282084;
                }
                if (i17 != 5) {
                    if (i17 == 6) {
                        return com.p314xaae8f345.mm.R.raw.f78729x69d6c8f6;
                    }
                }
            }
            return com.p314xaae8f345.mm.R.raw.f78732x48443101;
        }
        return com.p314xaae8f345.mm.R.raw.f78731xca768c4f;
    }

    @Override // zd5.q
    public void H3(zd5.k holder, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        ee5.v2 v2Var = (ee5.v2) holder;
        ae5.i iVar = (ae5.i) mo127525xfb80e389(i17);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar.f85942k);
        android.widget.TextView textView = v2Var.f333607n;
        if (K0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            java.lang.String str = iVar.f85942k;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
        }
        int b17 = i65.a.b(m158354x19263085(), 6);
        android.widget.ImageView imageView = v2Var.f333606m;
        imageView.setPadding(b17, b17, b17, b17);
        imageView.setImageResource(iVar.f85941j);
        imageView.setBackgroundColor(iVar.f85943l);
    }

    @Override // ee5.t2
    public android.text.SpannableString O6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.String str = ((ee5.e3) pf5.z.f435481a.a(activity).a(ee5.e3.class)).f333403f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemPayUIC", "getEmptyResultString >> " + str);
        return o13.q.m(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.fgw), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.fgv), str);
    }

    @Override // ee5.t2
    public zd5.n P6() {
        if (this.f333605r == null) {
            this.f333605r = new zd5.n(m158354x19263085(), this, this);
        }
        zd5.n nVar = this.f333605r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(nVar);
        return nVar;
    }

    @Override // ee5.t2
    public int Q6() {
        return 5;
    }

    @Override // zd5.p
    public void W2(android.view.View v17, int i17, ae5.g item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        U6();
        de5.a.e(de5.a.f310929a, 5, 0, 0, 6, null);
        S6(this.f333589o, item.f85933d);
    }

    public final boolean Y6() {
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f333589o) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(this.f333589o);
    }

    public boolean Z6(int i17) {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1("1001", 0) == i17 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1("1002", 0) == i17 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1("1005", 0) == i17 || 419430449 == i17;
    }

    @Override // zd5.p
    public void a6(android.view.View v17, int i17, ae5.g item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
    }

    @Override // zd5.q
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 c(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bct, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new ee5.v2(inflate);
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
