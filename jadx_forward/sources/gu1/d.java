package gu1;

/* loaded from: classes15.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f357402a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f357403b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f357404c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f357405d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f357406e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f357407f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f357408g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f357409h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f357410i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.CheckBox f357411j;

    /* renamed from: k, reason: collision with root package name */
    public tt1.j f357412k;

    /* renamed from: n, reason: collision with root package name */
    public gu1.c f357415n;

    /* renamed from: l, reason: collision with root package name */
    public int f357413l = 1;

    /* renamed from: m, reason: collision with root package name */
    public boolean f357414m = false;

    /* renamed from: o, reason: collision with root package name */
    public float f357416o = 0.0f;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View.OnClickListener f357417p = new gu1.a(this);

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f357418q = new gu1.b(this);

    public d(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, android.view.View view) {
        this.f357403b = abstractActivityC21394xb3d2c0cf;
        this.f357402a = view;
    }

    public void a() {
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumeCodeController", "doUpdate()");
        if (!this.f357414m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumeCodeController", "doUpdate() not ready show!");
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f357412k.i0().C)) {
            str = this.f357412k.i0().C;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumeCodeController", "code:%s from sign_number", str);
        } else if (this.f357412k.N()) {
            str = xt1.t0.Ai().b();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumeCodeController", "code:%s from dynamic code", str);
        } else {
            str = this.f357412k.i0().f466722o;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardConsumeCodeController", "code:%s from dataInfo", str);
        }
        int i17 = this.f357412k.i0().f466723p;
        android.view.View.OnLongClickListener onLongClickListener = this.f357418q;
        android.view.View view = this.f357402a;
        if (i17 == 0) {
            if (this.f357406e == null) {
                this.f357406e = ((android.view.ViewStub) view.findViewById(com.p314xaae8f345.mm.R.id.f565100b94)).inflate();
            }
            android.widget.TextView textView = (android.widget.TextView) this.f357406e.findViewById(com.p314xaae8f345.mm.R.id.c0u);
            textView.setText(lu1.g0.a(4, str, true));
            textView.setOnLongClickListener(onLongClickListener);
            if (!this.f357412k.o()) {
                textView.setTextColor(lu1.a0.d(this.f357412k.s0().f470088p));
            }
            if (str.length() <= 12) {
                textView.setTextSize(1, 33.0f);
            } else if (str.length() > 12 && str.length() <= 16) {
                textView.setTextSize(1, 30.0f);
            } else if (str.length() > 16 && str.length() <= 20) {
                textView.setTextSize(1, 24.0f);
            } else if (str.length() > 20 && str.length() <= 40) {
                textView.setTextSize(1, 18.0f);
            } else if (str.length() > 40) {
                textView.setVisibility(8);
            }
            c(this.f357406e);
        } else if (i17 == 1) {
            if (this.f357405d == null) {
                this.f357405d = ((android.view.ViewStub) view.findViewById(com.p314xaae8f345.mm.R.id.b8w)).inflate();
            }
            android.view.View view2 = this.f357405d;
            android.widget.ImageView imageView = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.f565310c06);
            android.widget.TextView textView2 = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.c0u);
            if (!this.f357412k.o()) {
                textView2.setTextColor(lu1.a0.d(this.f357412k.s0().f470088p));
            }
            if (android.text.TextUtils.isEmpty(str) || str.length() > 40) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(lu1.g0.a(4, str, true));
                if (this.f357412k.b()) {
                    textView2.setVisibility(0);
                    textView2.setOnLongClickListener(onLongClickListener);
                } else {
                    textView2.setVisibility(8);
                }
            }
            if (this.f357413l != 1) {
                textView2.setVisibility(4);
            }
            try {
                lu1.a0.F(this.f357408g);
                if (android.text.TextUtils.isEmpty(str)) {
                    this.f357408g = null;
                    imageView.setImageBitmap(null);
                } else {
                    android.graphics.Bitmap Bi = ((jd0.w1) ((kd0.k2) i95.n0.c(kd0.k2.class))).Bi(this.f357403b, str, 5, 0);
                    this.f357408g = Bi;
                    b(imageView, Bi);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardConsumeCodeController", e17, "", new java.lang.Object[0]);
            }
            c(this.f357405d);
        } else if (i17 == 2) {
            if (this.f357404c == null) {
                this.f357404c = ((android.view.ViewStub) view.findViewById(com.p314xaae8f345.mm.R.id.f565097b91)).inflate();
            }
            android.view.View view3 = this.f357404c;
            android.widget.ImageView imageView2 = (android.widget.ImageView) view3.findViewById(com.p314xaae8f345.mm.R.id.c0m);
            android.widget.TextView textView3 = (android.widget.TextView) view3.findViewById(com.p314xaae8f345.mm.R.id.c0u);
            if (!this.f357412k.o()) {
                textView3.setTextColor(lu1.a0.d(this.f357412k.s0().f470088p));
            }
            if (str.length() <= 40) {
                textView3.setText(lu1.g0.a(4, str, true));
                if (this.f357412k.b()) {
                    textView3.setVisibility(0);
                    textView3.setOnLongClickListener(onLongClickListener);
                } else {
                    textView3.setVisibility(8);
                }
            } else {
                textView3.setVisibility(8);
            }
            if (this.f357413l != 1) {
                textView3.setVisibility(4);
            }
            try {
                lu1.a0.F(this.f357407f);
                if (android.text.TextUtils.isEmpty(str)) {
                    this.f357407f = null;
                    imageView2.setImageBitmap(null);
                } else {
                    android.graphics.Bitmap Bi2 = ((jd0.w1) ((kd0.k2) i95.n0.c(kd0.k2.class))).Bi(this.f357403b, str, 12, 3);
                    this.f357407f = Bi2;
                    b(imageView2, Bi2);
                }
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardConsumeCodeController", e18, "", new java.lang.Object[0]);
            }
            c(this.f357404c);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f357412k.s0().f470091q)) {
            this.f357409h.setVisibility(8);
            this.f357410i.setVisibility(8);
        } else if (this.f357412k.s0().Z != null) {
            this.f357410i.setText(this.f357412k.s0().f470091q);
            this.f357410i.setVisibility(0);
            this.f357409h.setVisibility(8);
            android.view.View view4 = this.f357404c;
            if (view4 != null) {
                android.widget.ImageView imageView3 = (android.widget.ImageView) view4.findViewById(com.p314xaae8f345.mm.R.id.c0m);
                android.view.ViewGroup.LayoutParams layoutParams = imageView3.getLayoutParams();
                layoutParams.height = i65.a.b(this.f357403b, 180);
                layoutParams.width = i65.a.b(this.f357403b, 180);
                imageView3.setLayoutParams(layoutParams);
            }
        } else {
            this.f357409h.setText(this.f357412k.s0().f470091q);
            this.f357409h.setVisibility(0);
        }
        if (!this.f357412k.i() || android.text.TextUtils.isEmpty(this.f357412k.a()) || this.f357412k.a().equals(c01.z1.r())) {
            this.f357411j.setChecked(false);
            this.f357411j.setVisibility(8);
            return;
        }
        this.f357411j.setVisibility(0);
        java.lang.String str2 = " " + this.f357403b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.arv, lu1.a0.p(this.f357412k.a()));
        android.widget.CheckBox checkBox = this.f357411j;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f357403b;
        int dimensionPixelOffset = abstractActivityC21394xb3d2c0cf.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561462j9);
        ((ke0.e) xVar).getClass();
        checkBox.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.h(abstractActivityC21394xb3d2c0cf, str2, dimensionPixelOffset, true));
    }

    public final void b(android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
        if (imageView == null || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        imageView.setImageBitmap(bitmap);
        if (this.f357413l != 1) {
            imageView.setAlpha(10);
        } else {
            imageView.setAlpha(255);
        }
    }

    public final void c(android.view.View view) {
        android.widget.Button button = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.c0l);
        if (this.f357413l == 1) {
            button.setVisibility(8);
        } else {
            button.setVisibility(0);
        }
        if (this.f357413l == -1) {
            button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.atz);
        }
    }
}
