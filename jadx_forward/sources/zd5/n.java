package zd5;

/* loaded from: classes9.dex */
public final class n extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f553232d;

    /* renamed from: e, reason: collision with root package name */
    public final zd5.q f553233e;

    /* renamed from: f, reason: collision with root package name */
    public final zd5.p f553234f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f553235g;

    public n(android.content.Context context, zd5.q resultDetail, zd5.p itemClickListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultDetail, "resultDetail");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemClickListener, "itemClickListener");
        this.f553232d = context;
        this.f553233e = resultDetail;
        this.f553234f = itemClickListener;
        this.f553235g = "";
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f553233e.mo127524x7444f759();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return this.f553233e.mo127525xfb80e389(i17).f85931b;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 baseHolder, int i17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseHolder, "baseHolder");
        int mo863xcdaf1228 = mo863xcdaf1228(i17);
        zd5.q qVar = this.f553233e;
        ae5.g mo127525xfb80e389 = qVar.mo127525xfb80e389(i17);
        android.content.Context context = this.f553232d;
        if (mo863xcdaf1228 == 1) {
            if (i17 == mo1894x7e414b06() - 1) {
                ((zd5.h) baseHolder).f553220d.setVisibility(8);
                return;
            }
            if (com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().a(new java.util.Date(qVar.mo127525xfb80e389(i17 + 1).f85930a)) != com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().a(new java.util.Date(mo127525xfb80e389.f85930a))) {
                ((zd5.h) baseHolder).f553220d.setVisibility(8);
                return;
            }
            android.widget.TextView textView = ((zd5.h) baseHolder).f553220d;
            textView.setVisibility(0);
            textView.setText(com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().d(new java.util.Date(mo127525xfb80e389.f85930a), context));
            return;
        }
        zd5.k kVar = (zd5.k) baseHolder;
        kVar.f553224d.setTag(java.lang.Integer.valueOf(i17));
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(kVar.f553225e, mo127525xfb80e389.f85934e, null);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f553235g);
        java.lang.String str2 = mo127525xfb80e389.f85937h;
        java.lang.String str3 = mo127525xfb80e389.f85936g;
        if (K0) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    str2 = mo127525xfb80e389.f85935f;
                }
            }
            str2 = str3;
        } else {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                    if (r26.n0.B(str2, this.f553235g, false)) {
                        str = str3 + '(' + str2 + ')';
                    }
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo127525xfb80e389.f85935f)) {
                    java.lang.String str4 = mo127525xfb80e389.f85935f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
                    if (r26.n0.B(str4, this.f553235g, false)) {
                        str = str3 + '(' + mo127525xfb80e389.f85935f + ')';
                    }
                }
                str2 = str3;
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                str = mo127525xfb80e389.f85935f;
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo127525xfb80e389.f85935f)) {
                java.lang.String str5 = mo127525xfb80e389.f85935f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str5);
                if (r26.n0.B(str5, this.f553235g, false)) {
                    str = str2 + '(' + mo127525xfb80e389.f85935f + ')';
                }
            }
            str2 = str;
        }
        android.widget.TextView textView2 = kVar.f553226f;
        float textSize = textView2.getTextSize();
        ((ke0.e) xVar).getClass();
        textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str2, textSize));
        kVar.f553227g.setText(k35.m1.f(context, mo127525xfb80e389.f85930a, true, false));
        java.lang.String str6 = mo127525xfb80e389.f85932c;
        android.widget.TextView textView3 = kVar.f553228h;
        textView3.setText(str6);
        qVar.H3(kVar, i17, mo863xcdaf1228);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f553235g)) {
            return;
        }
        kVar.i(textView2, this.f553235g);
        kVar.i(textView3, this.f553235g);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bcs, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            return new zd5.h(inflate, this.f553232d);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 c17 = this.f553233e.c(parent, i17);
        c17.f3639x46306858.setOnLongClickListener(new zd5.l(this));
        c17.f3639x46306858.setOnClickListener(new zd5.m(this));
        return c17;
    }
}
