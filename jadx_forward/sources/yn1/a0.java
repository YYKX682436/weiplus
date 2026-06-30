package yn1;

/* loaded from: classes11.dex */
public final class a0 extends s35.b implements yn1.m {

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f545129m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f545130n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f545131o;

    /* renamed from: p, reason: collision with root package name */
    public yn1.x f545132p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1256xcd3633ce.C12840x44d27193 f545133q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.backup.migration.MigrationBanner$entryEventListener$1, com.tencent.mm.sdk.event.IListener] */
    public a0(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        yn1.x xVar = yn1.x.f545442d;
        this.f545132p = xVar;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        ?? r17 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5707xef9cc162>(a0Var) { // from class: com.tencent.mm.plugin.backup.migration.MigrationBanner$entryEventListener$1
            {
                this.f39173x3fe91575 = 762628434;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5707xef9cc162 c5707xef9cc162) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5707xef9cc162 event = c5707xef9cc162;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                boolean z17 = ((yn1.s) ((mv.v) i95.n0.c(mv.v.class))).f545352g;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[entryEventListener] showType=");
                yn1.a0 a0Var2 = yn1.a0.this;
                sb6.append(a0Var2.f545132p);
                sb6.append(", shouldShowBanner=");
                sb6.append(z17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationBanner", sb6.toString());
                if (z17) {
                    if (a0Var2.f545132p == yn1.x.f545444f) {
                        return false;
                    }
                    a0Var2.f545132p = yn1.x.f545443e;
                    a0Var2.i();
                    return false;
                }
                if (a0Var2.f545132p == yn1.x.f545443e) {
                    a0Var2.f545132p = yn1.x.f545442d;
                }
                if (a0Var2.f545132p == yn1.x.f545444f || !a0Var2.f484377i) {
                    return false;
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = a0Var2.f545131o;
                if (c22699x3dcdb352 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("closeIcon");
                    throw null;
                }
                c22699x3dcdb352.setVisibility(4);
                a0Var2.d();
                return false;
            }
        };
        this.f545133q = r17;
        yn1.z0.f545466a.q(this);
        if (((yn1.s) ((mv.v) i95.n0.c(mv.v.class))).f545352g) {
            this.f545132p = yn1.x.f545443e;
        } else {
            this.f545132p = xVar;
        }
        r17.mo48813x58998cd();
    }

    @Override // yn1.m
    public void E2() {
        this.f545132p = yn1.x.f545444f;
        i();
    }

    @Override // s35.b
    public void a() {
        yn1.z0.f545466a.u(this);
        mo48814x2efc64();
    }

    @Override // s35.b
    public int b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569707jk;
    }

    @Override // s35.b
    public int c() {
        return 3;
    }

    @Override // s35.b
    public void h(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationBanner", "[onInitializeView] innerView=" + view);
        if (view == null) {
            return;
        }
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.ac7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f545129m = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.ac6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f545130n = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById2;
        android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.f78246x851a1260);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f545131o = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById3;
        view.setOnClickListener(new yn1.y(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f545131o;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setOnClickListener(yn1.z.f545465d);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("closeIcon");
            throw null;
        }
    }

    @Override // s35.b
    public boolean i() {
        jz5.l lVar;
        java.lang.String string;
        int ordinal = this.f545132p.ordinal();
        if (ordinal == 0) {
            d();
            return false;
        }
        int i17 = com.p314xaae8f345.mm.R.raw.f80196xacdf6fde;
        boolean z17 = true;
        if (ordinal == 1) {
            f();
            k(0);
            android.widget.TextView textView = this.f545129m;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
                throw null;
            }
            textView.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f574070o95));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f545130n;
            if (c22699x3dcdb352 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bannerIcon");
                throw null;
            }
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80196xacdf6fde);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f545131o;
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.setVisibility(0);
                return true;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("closeIcon");
            throw null;
        }
        if (ordinal != 2) {
            throw new jz5.j();
        }
        yn1.z0 z0Var = yn1.z0.f545466a;
        boolean n17 = z0Var.n();
        bw5.l0 l0Var = bw5.l0.AFFMIG_PC;
        if (!n17 || (z0Var.h() != l0Var && (z0Var.l() || z0Var.i() == bw5.bj0.NOTIFY_CODE_NONE))) {
            z17 = false;
        }
        if (!z17) {
            d();
            return false;
        }
        bw5.bj0 i18 = z0Var.i();
        boolean l17 = z0Var.l();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        switch (i18.ordinal()) {
            case 0:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MM.Mig.MigrationBanner", "hidden banner because status=" + i18);
                lVar = new jz5.l(java.lang.Boolean.FALSE, "");
                break;
            case 1:
            case 7:
            case 10:
            case 11:
            case 15:
                lVar = new jz5.l(java.lang.Boolean.TRUE, context.getString(l17 ? com.p314xaae8f345.mm.R.C30867xcad56011.o98 : com.p314xaae8f345.mm.R.C30867xcad56011.o9g));
                break;
            case 2:
            case 8:
            case 18:
                bw5.o0 o0Var = yn1.z0.f545472g;
                if (o0Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("progressModel");
                    throw null;
                }
                float f17 = o0Var.f112397f;
                if (o0Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("progressModel");
                    throw null;
                }
                long j17 = o0Var.f112398g;
                if (f17 > 0.0f && j17 > 0) {
                    java.lang.String S1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.S1(f17);
                    if (j17 > 3600) {
                        long j18 = j17 / 3600;
                        if (j18 > 999) {
                            j18 = 999;
                        }
                        string = context.getString(l17 ? com.p314xaae8f345.mm.R.C30867xcad56011.o99 : com.p314xaae8f345.mm.R.C30867xcad56011.o9h, java.lang.Long.valueOf(j18), S1);
                    } else {
                        long j19 = j17 / 60;
                        if (j19 < 1) {
                            j19 = 1;
                        }
                        string = context.getString(l17 ? com.p314xaae8f345.mm.R.C30867xcad56011.o9_ : com.p314xaae8f345.mm.R.C30867xcad56011.o9i, java.lang.Long.valueOf(j19), S1);
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                    lVar = new jz5.l(java.lang.Boolean.TRUE, string);
                    break;
                } else {
                    lVar = new jz5.l(java.lang.Boolean.TRUE, context.getString(l17 ? com.p314xaae8f345.mm.R.C30867xcad56011.o9a : com.p314xaae8f345.mm.R.C30867xcad56011.o9j));
                    break;
                }
                break;
            case 3:
            case 6:
                lVar = new jz5.l(java.lang.Boolean.TRUE, context.getString(l17 ? com.p314xaae8f345.mm.R.C30867xcad56011.o97 : com.p314xaae8f345.mm.R.C30867xcad56011.o9f));
                break;
            case 4:
                lVar = new jz5.l(java.lang.Boolean.TRUE, context.getString(l17 ? com.p314xaae8f345.mm.R.C30867xcad56011.o96 : com.p314xaae8f345.mm.R.C30867xcad56011.o9d));
                break;
            case 5:
                lVar = new jz5.l(java.lang.Boolean.TRUE, context.getString(l17 ? com.p314xaae8f345.mm.R.C30867xcad56011.o9b : com.p314xaae8f345.mm.R.C30867xcad56011.o9k));
                break;
            case 9:
                java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o9e);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                lVar = new jz5.l(java.lang.Boolean.TRUE, string2);
                break;
            default:
                throw new jz5.j();
        }
        boolean booleanValue = ((java.lang.Boolean) lVar.f384366d).booleanValue();
        java.lang.String str = (java.lang.String) lVar.f384367e;
        if (booleanValue) {
            f();
            k(0);
            android.widget.TextView textView2 = this.f545129m;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
                throw null;
            }
            textView2.setText(str);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f545130n;
            if (c22699x3dcdb3523 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bannerIcon");
                throw null;
            }
            if (z0Var.h() == l0Var) {
                i17 = z0Var.l() ? com.p314xaae8f345.mm.R.raw.f80173xdad5ec9a : com.p314xaae8f345.mm.R.raw.f80174x3dc251e1;
            }
            c22699x3dcdb3523.setImageResource(i17);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = this.f545131o;
            if (c22699x3dcdb3524 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("closeIcon");
                throw null;
            }
            c22699x3dcdb3524.setVisibility(4);
        } else {
            d();
        }
        return booleanValue;
    }
}
