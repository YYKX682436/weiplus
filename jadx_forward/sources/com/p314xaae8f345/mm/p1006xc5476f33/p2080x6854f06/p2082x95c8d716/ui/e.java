package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui;

/* loaded from: classes11.dex */
public class e extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 {

    /* renamed from: J, reason: collision with root package name */
    public static final java.lang.String f243603J = lp0.b.D() + "card";
    public boolean A;
    public int B;
    public f34.d C;
    public am.fu D;
    public java.lang.String E;
    public android.content.res.Resources F;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.c G;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.d H;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d I;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f243604d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f243605e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f243606f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f243607g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f243608h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f243609i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f243610m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f243611n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ProgressBar f243612o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f243613p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f243614q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f243615r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f243616s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f243617t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f243618u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f243619v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f243620w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f243621x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f243622y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f243623z;

    public e(android.content.Context context, int i17) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576325we);
        this.f243623z = false;
        this.A = false;
        this.B = 0;
        this.E = "";
        this.G = com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.c.PRE_ACCEPT;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.I = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6010x590df515>(a0Var) { // from class: com.tencent.mm.plugin.shake.shakecard.ui.ShakeCardDialog$1
            {
                this.f39173x3fe91575 = 1298970405;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6010x590df515 c6010x590df515) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.e eVar = com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.e.this;
                eVar.dismiss();
                com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.d dVar = eVar.H;
                if (dVar != null) {
                    dVar.a();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardDialog", "gift event come, do close ShakeCardDialog");
                return false;
            }
        };
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.a aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.a(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardDialog", "init shake card dialog");
        this.F = context.getResources();
        setCanceledOnTouchOutside(true);
        getWindow().setSoftInputMode(2);
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.cmf, null);
        this.f243604d = inflate;
        this.f243605e = inflate.findViewById(com.p314xaae8f345.mm.R.id.mqk);
        this.f243607g = (android.widget.TextView) this.f243604d.findViewById(com.p314xaae8f345.mm.R.id.bco);
        this.f243608h = (android.widget.TextView) this.f243604d.findViewById(com.p314xaae8f345.mm.R.id.bc7);
        this.f243609i = (android.widget.TextView) this.f243604d.findViewById(com.p314xaae8f345.mm.R.id.b9e);
        this.f243606f = (android.widget.ImageView) this.f243604d.findViewById(com.p314xaae8f345.mm.R.id.b8u);
        this.f243610m = (android.widget.Button) this.f243604d.findViewById(com.p314xaae8f345.mm.R.id.b76);
        this.f243611n = (android.widget.TextView) this.f243604d.findViewById(com.p314xaae8f345.mm.R.id.b7b);
        this.f243612o = (android.widget.ProgressBar) this.f243604d.findViewById(com.p314xaae8f345.mm.R.id.bbk);
        this.f243606f.setOnClickListener(aVar);
        this.f243610m.setOnClickListener(aVar);
        this.f243613p = this.f243604d.findViewById(com.p314xaae8f345.mm.R.id.f565094b84);
        this.f243614q = this.f243604d.findViewById(com.p314xaae8f345.mm.R.id.pm9);
        this.f243615r = this.f243604d.findViewById(com.p314xaae8f345.mm.R.id.bcs);
        this.f243616s = (android.widget.ImageView) this.f243604d.findViewById(com.p314xaae8f345.mm.R.id.bas);
        this.f243617t = (android.widget.TextView) this.f243604d.findViewById(com.p314xaae8f345.mm.R.id.bcg);
        this.f243618u = (android.widget.TextView) this.f243604d.findViewById(com.p314xaae8f345.mm.R.id.b8b);
        this.f243619v = (android.widget.TextView) this.f243604d.findViewById(com.p314xaae8f345.mm.R.id.bcd);
        this.f243620w = this.f243604d.findViewById(com.p314xaae8f345.mm.R.id.bbq);
        this.f243621x = (android.widget.ImageView) this.f243604d.findViewById(com.p314xaae8f345.mm.R.id.m1v);
        this.f243622y = (android.widget.TextView) this.f243604d.findViewById(com.p314xaae8f345.mm.R.id.m1u);
        this.B = g34.a.c();
    }

    public static void c(com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.e eVar) {
        eVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardDialog", "doNetSceneAccept()");
        if (android.text.TextUtils.isEmpty(eVar.C.f340862b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShakeCardDialog", "card_tp_id is empty befor doNetSceneAccept");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6009xfdc53276 c6009xfdc53276 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6009xfdc53276();
        c6009xfdc53276.f136304h = null;
        f34.d dVar = eVar.C;
        java.lang.String str = dVar.f340862b;
        am.eu euVar = c6009xfdc53276.f136303g;
        euVar.f88141a = str;
        euVar.f88142b = dVar.f340863c;
        euVar.f88143c = 15;
        c6009xfdc53276.f273897d = new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.b(eVar, c6009xfdc53276);
        c6009xfdc53276.b(android.os.Looper.getMainLooper());
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.d dVar = this.H;
            if (dVar != null) {
                dVar.a();
            }
            if (this.G != com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.c.ACCEPTED_SUCCES && !this.A) {
                this.A = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardDialog", "ShakeCardDialog card is not cancel accepte");
                com.p314xaae8f345.mm.p944x882e457a.r1 e17 = c01.d9.e();
                f34.d dVar2 = this.C;
                e17.g(new f34.a(dVar2.f340862b, dVar2.f340863c));
            }
            this.I.mo48814x2efc64();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardDialog", "dismiss ShakeCardDialog");
            super.dismiss();
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShakeCardDialog", "dismiss exception, e = " + e18.getMessage());
        }
    }

    public final void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.c cVar = this.G;
        if (cVar == com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.c.PRE_ACCEPT || cVar == com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.c.ACCEPTED_FAIL) {
            if (android.text.TextUtils.isEmpty(this.C.f340872l)) {
                this.f243610m.setText(com.p314xaae8f345.mm.R.C30867xcad56011.arj);
                return;
            } else {
                this.f243610m.setText(this.C.f340872l);
                return;
            }
        }
        if (cVar == com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.c.ACCEPTING) {
            this.f243610m.setText("");
        } else if (cVar == com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.c.ACCEPTED_SUCCES) {
            this.f243610m.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574644j24);
        }
    }

    public final void f() {
        float dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.a9s);
        android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RoundRectShape(new float[]{dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, 0.0f, 0.0f, 0.0f, 0.0f}, null, null));
        android.graphics.Paint paint = shapeDrawable.getPaint();
        java.lang.String str = this.C.f340867g;
        int rgb = android.graphics.Color.rgb(66, 66, 66);
        if (str == null || str.length() < 7 || !str.startsWith("#")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShakeCardUtil", "string format error");
        } else {
            try {
                java.lang.String upperCase = str.substring(1).toUpperCase();
                rgb = android.graphics.Color.argb(255, java.lang.Integer.parseInt(upperCase.substring(0, 2), 16), java.lang.Integer.parseInt(upperCase.substring(2, 4), 16), java.lang.Integer.parseInt(upperCase.substring(4, 6), 16));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShakeCardUtil", e17.toString());
            }
        }
        paint.setColor(rgb);
        this.f243615r.setBackgroundDrawable(shapeDrawable);
        e();
        if (!android.text.TextUtils.isEmpty(this.C.f340870j)) {
            this.f243607g.setText(this.C.f340870j);
        }
        if (!android.text.TextUtils.isEmpty(this.C.f340875o)) {
            this.f243608h.setText(this.C.f340875o);
            this.f243608h.setVisibility(0);
        }
        if (!android.text.TextUtils.isEmpty(this.C.f340871k)) {
            this.f243609i.setText(this.C.f340871k);
            this.f243609i.setVisibility(0);
        }
        if (!android.text.TextUtils.isEmpty(this.C.f340866f)) {
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a9r);
            android.widget.ImageView imageView = this.f243616s;
            java.lang.String str2 = this.C.f340866f;
            if (imageView != null && !android.text.TextUtils.isEmpty(str2)) {
                if (android.text.TextUtils.isEmpty(str2)) {
                    imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f81029x22fde45d);
                } else {
                    o11.f fVar = new o11.f();
                    fVar.f423616g = lp0.b.D();
                    fVar.f423615f = java.lang.String.format("%s/%s", f243603J, kk.k.g(str2.getBytes()));
                    fVar.f423611b = true;
                    fVar.f423629t = true;
                    fVar.f423610a = true;
                    fVar.f423620k = dimensionPixelSize;
                    fVar.f423619j = dimensionPixelSize;
                    fVar.f423624o = com.p314xaae8f345.mm.R.raw.f81029x22fde45d;
                    n11.a.b().h(str2, imageView, fVar.a());
                }
            }
        }
        if (!android.text.TextUtils.isEmpty(this.C.f340864d)) {
            this.f243617t.setText(this.C.f340864d);
        }
        if (!android.text.TextUtils.isEmpty(this.C.f340865e)) {
            this.f243618u.setText(this.C.f340865e);
        }
        if (this.C.f340874n > 0) {
            android.widget.TextView textView = this.f243619v;
            android.content.Context context = getContext();
            java.lang.Object[] objArr = new java.lang.Object[1];
            long j17 = this.C.f340874n * 1000;
            new java.util.GregorianCalendar().setTimeInMillis(j17);
            if (g34.a.f349709a == null) {
                g34.a.f349709a = new java.text.SimpleDateFormat("yyyy.MM.dd");
            }
            objArr[0] = g34.a.f349709a.format(new java.util.Date(j17));
            textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572346aw5, objArr));
        }
        if (this.G == com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.c.ACCEPTED_FAIL) {
            this.f243611n.setVisibility(0);
        } else {
            this.f243611n.setVisibility(8);
        }
    }

    public final void h() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.c cVar = this.G;
        if (cVar == com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.c.ACCEPTED_SUCCES) {
            android.view.View view = this.f243613p;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/shake/shakecard/ui/ShakeCardDialog", "updateLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/shake/shakecard/ui/ShakeCardDialog", "updateLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f243620w;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/shake/shakecard/ui/ShakeCardDialog", "updateLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/shake/shakecard/ui/ShakeCardDialog", "updateLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (cVar == com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.c.PRE_ACCEPT || cVar == com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.c.ACCEPTING || cVar == com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.c.ACCEPTED_FAIL) {
            android.view.View view3 = this.f243613p;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/shake/shakecard/ui/ShakeCardDialog", "updateLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/shake/shakecard/ui/ShakeCardDialog", "updateLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f243620w;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/shake/shakecard/ui/ShakeCardDialog", "updateLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/shake/shakecard/ui/ShakeCardDialog", "updateLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f243604d);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardDialog", "back key in shake card dialog");
            dismiss();
            com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2082x95c8d716.ui.d dVar = this.H;
            if (dVar != null) {
                dVar.a();
            }
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z17) {
        super.setCancelable(z17);
        setCanceledOnTouchOutside(z17);
    }
}
