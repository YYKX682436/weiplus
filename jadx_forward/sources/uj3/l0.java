package uj3;

/* loaded from: classes14.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f509849a;

    /* renamed from: b, reason: collision with root package name */
    public final uj3.b f509850b;

    /* renamed from: c, reason: collision with root package name */
    public final uj3.k f509851c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f509852d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe f509853e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f509854f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe f509855g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe f509856h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Toast f509857i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f509858j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f509859k;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f509860l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f509861m;

    public l0(android.content.Context context, uj3.b statusManager, uj3.k kVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusManager, "statusManager");
        this.f509849a = context;
        this.f509850b = statusManager;
        this.f509851c = kVar;
        this.f509858j = kVar != null ? kVar.f509834a.contains(3) : false;
        this.f509859k = kVar != null ? kVar.f509834a.contains(1) : false;
        if (kVar != null) {
            kVar.f509834a.contains(2);
        }
    }

    public final void a() {
        boolean z17 = this.f509859k;
        android.content.Context context = this.f509849a;
        uj3.b bVar = this.f509850b;
        if (z17) {
            android.view.View view = this.f509852d;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = view != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.bz_) : null;
            this.f509854f = c22699x3dcdb352;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79678x41464de0, -1));
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f509854f;
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.m82040x7541828(-1);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f509854f;
            if (c22699x3dcdb3523 != null) {
                c22699x3dcdb3523.setOnClickListener(new uj3.c0(this));
            }
            android.view.View view2 = this.f509852d;
            this.f509853e = view2 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe) view2.findViewById(com.p314xaae8f345.mm.R.id.d2e) : null;
            if (bVar.c()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe c16591xa5634bbe = this.f509853e;
                if (c16591xa5634bbe != null) {
                    c16591xa5634bbe.setVisibility(8);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = this.f509854f;
                if (c22699x3dcdb3524 != null) {
                    c22699x3dcdb3524.setVisibility(0);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe c16591xa5634bbe2 = this.f509853e;
                if (c16591xa5634bbe2 != null) {
                    c16591xa5634bbe2.setVisibility(0);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe c16591xa5634bbe3 = this.f509853e;
            if (c16591xa5634bbe3 != null) {
                c16591xa5634bbe3.m67103xdd7d58e5(bVar.c());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe c16591xa5634bbe4 = this.f509853e;
            if (c16591xa5634bbe4 != null) {
                c16591xa5634bbe4.setOnClickListener(new uj3.d0(this));
            }
        }
        android.view.View view3 = this.f509852d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe c16591xa5634bbe5 = view3 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe) view3.findViewById(com.p314xaae8f345.mm.R.id.jj7) : null;
        this.f509855g = c16591xa5634bbe5;
        if (c16591xa5634bbe5 != null) {
            c16591xa5634bbe5.m67103xdd7d58e5(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231695e);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe c16591xa5634bbe6 = this.f509855g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16591xa5634bbe6);
        if (c16591xa5634bbe6.isChceked) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe c16591xa5634bbe7 = this.f509855g;
            if (c16591xa5634bbe7 != null) {
                c16591xa5634bbe7.setContentDescription(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f574123h24));
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe c16591xa5634bbe8 = this.f509855g;
            if (c16591xa5634bbe8 != null) {
                c16591xa5634bbe8.setContentDescription(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f574124h25));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe c16591xa5634bbe9 = this.f509855g;
        if (c16591xa5634bbe9 != null) {
            c16591xa5634bbe9.setVisibility(bVar.c() ? 4 : 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe c16591xa5634bbe10 = this.f509855g;
        if (c16591xa5634bbe10 != null) {
            c16591xa5634bbe10.setOnClickListener(new uj3.f0(this));
        }
        android.view.View view4 = this.f509852d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe c16591xa5634bbe11 = view4 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe) view4.findViewById(com.p314xaae8f345.mm.R.id.nel) : null;
        this.f509856h = c16591xa5634bbe11;
        if (c16591xa5634bbe11 != null) {
            c16591xa5634bbe11.m67103xdd7d58e5(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231696f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe c16591xa5634bbe12 = this.f509856h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16591xa5634bbe12);
        if (c16591xa5634bbe12.isChceked) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe c16591xa5634bbe13 = this.f509856h;
            if (c16591xa5634bbe13 != null) {
                c16591xa5634bbe13.setContentDescription(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.h28));
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe c16591xa5634bbe14 = this.f509856h;
            if (c16591xa5634bbe14 != null) {
                c16591xa5634bbe14.setContentDescription(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.h29));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe c16591xa5634bbe15 = this.f509856h;
        if (c16591xa5634bbe15 != null) {
            c16591xa5634bbe15.setOnClickListener(new uj3.h0(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe c16591xa5634bbe16 = this.f509856h;
        if (c16591xa5634bbe16 != null) {
            c16591xa5634bbe16.setVisibility(bVar.c() ? 4 : 0);
        }
        if (this.f509858j) {
            android.view.View view5 = this.f509852d;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3525 = view5 != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view5.findViewById(com.p314xaae8f345.mm.R.id.jrb) : null;
            this.f509860l = c22699x3dcdb3525;
            if (c22699x3dcdb3525 != null) {
                c22699x3dcdb3525.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79813xc8512e6d, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw)));
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3526 = this.f509860l;
            if (c22699x3dcdb3526 != null) {
                c22699x3dcdb3526.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3527 = this.f509860l;
            if (c22699x3dcdb3527 != null) {
                c22699x3dcdb3527.setVisibility(bVar.c() ? 4 : 0);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3528 = this.f509860l;
            if (c22699x3dcdb3528 != null) {
                c22699x3dcdb3528.setOnClickListener(new uj3.i0(this));
            }
        }
    }

    public final void b(android.content.Context context, java.lang.String str) {
        android.widget.Toast toast = this.f509857i;
        if (toast != null) {
            toast.cancel();
        }
        this.f509857i = android.widget.Toast.makeText(context, "", 0);
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.c3w, null);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f568890oe3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((android.widget.TextView) findViewById).setText(str);
        android.widget.Toast toast2 = this.f509857i;
        if (toast2 != null) {
            toast2.setGravity(17, 0, 0);
        }
        android.widget.Toast toast3 = this.f509857i;
        if (toast3 != null) {
            toast3.setView(inflate);
        }
        android.widget.Toast toast4 = this.f509857i;
        if (toast4 != null) {
            toast4.show();
        }
    }
}
