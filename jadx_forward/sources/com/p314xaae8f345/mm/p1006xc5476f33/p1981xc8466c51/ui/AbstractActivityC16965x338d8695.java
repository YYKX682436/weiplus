package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgBaseUI */
/* loaded from: classes12.dex */
public abstract class AbstractActivityC16965x338d8695 extends com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43 {

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.h0 f236800n;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f236804r;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ListView f236799m = null;

    /* renamed from: o, reason: collision with root package name */
    public long f236801o = -1;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f236802p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f236803q = "";

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f236805s = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5430x5ea11529>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.record.ui.RecordMsgBaseUI.1
        {
            this.f39173x3fe91575 = -1051078375;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5430x5ea11529 c5430x5ea11529) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5430x5ea11529 c5430x5ea115292 = c5430x5ea11529;
            com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695 abstractActivityC16965x338d8695 = com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.AbstractActivityC16965x338d8695.this;
            int firstVisiblePosition = abstractActivityC16965x338d8695.f236799m.getFirstVisiblePosition();
            int lastVisiblePosition = abstractActivityC16965x338d8695.f236799m.getLastVisiblePosition();
            int max = java.lang.Math.max(firstVisiblePosition, 0);
            int max2 = java.lang.Math.max(lastVisiblePosition, 0);
            if (max < 0 || max2 >= abstractActivityC16965x338d8695.f236799m.getAdapter().getCount()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgBaseUI", "invalid position %d-%d, cnt:%d", java.lang.Integer.valueOf(max), java.lang.Integer.valueOf(max2), java.lang.Integer.valueOf(abstractActivityC16965x338d8695.f236799m.getAdapter().getCount()));
                return false;
            }
            while (max <= max2) {
                r45.gp0 gp0Var = (r45.gp0) abstractActivityC16965x338d8695.f236799m.getAdapter().getItem(max);
                if (gp0Var != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(gp0Var.T, c5430x5ea115292.f135774g.f89901a)) {
                    android.view.View childAt = abstractActivityC16965x338d8695.f236799m.getChildAt(max);
                    if (childAt == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordMsgBaseUI", "[getPhotoInfo] getChildAt(%d)", java.lang.Integer.valueOf(max));
                    } else {
                        android.view.View findViewById = childAt.findViewById(com.p314xaae8f345.mm.R.id.lp8);
                        if (findViewById != null) {
                            int[] iArr = new int[2];
                            findViewById.getLocationInWindow(iArr);
                            int i17 = iArr[0];
                            am.y9 y9Var = c5430x5ea115292.f135775h;
                            y9Var.f89977a = i17;
                            y9Var.f89978b = iArr[1];
                            y9Var.f89979c = findViewById.getWidth();
                            y9Var.f89980d = findViewById.getHeight();
                        }
                    }
                }
                max++;
            }
            return true;
        }
    };

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f236806t = null;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f236807u = null;

    public final java.lang.String Z6(java.lang.String str) {
        try {
            return (java.lang.String) android.text.format.DateFormat.format(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcl), new java.text.SimpleDateFormat("yyyy-MM-dd").parse(str).getTime());
        } catch (java.text.ParseException unused) {
            return str;
        }
    }

    public abstract com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.h0 a7();

    public abstract java.lang.String b7();

    public abstract java.lang.String c7();

    public abstract java.lang.String d7();

    public void e7() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        this.f236800n = a7();
        this.f236801o = getIntent().getLongExtra("message_id", -1L);
        this.f236802p = getIntent().getStringExtra("record_app_id");
        this.f236803q = getIntent().getStringExtra("message_talker");
        this.f236799m = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.lpg);
        g7();
        java.lang.String c76 = c7();
        java.lang.String b76 = b7();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c76) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b76)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgBaseUI", "subtitle time error!");
        } else {
            java.lang.String str4 = c76.split(" ")[0];
            java.lang.String str5 = b76.split(" ")[0];
            if (!c76.split("-")[0].equals(b76.split("-")[0])) {
                this.f236800n.f236936i = true;
            } else if (str4.equals(str5)) {
                this.f236800n.f236937m = false;
            } else {
                this.f236800n.f236937m = true;
            }
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar = null;
        if (this.f236806t == null) {
            android.view.View inflate = android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.cd6, null);
            this.f236806t = inflate;
            this.f236799m.addHeaderView(inflate, null, false);
        }
        android.widget.TextView textView = (android.widget.TextView) this.f236806t.findViewById(com.p314xaae8f345.mm.R.id.odd);
        java.lang.String c77 = c7();
        java.lang.String b77 = b7();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c77) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b77)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgBaseUI", "subtitle time error!");
        } else {
            java.lang.String Z6 = Z6(c77.split(" ")[0]);
            java.lang.String Z62 = Z6(b77.split(" ")[0]);
            if (!Z6.equals(Z62)) {
                Z6 = Z6 + " " + getString(com.p314xaae8f345.mm.R.C30867xcad56011.jyc) + " " + Z62;
            }
            textView.setText(Z6);
        }
        if (this.f236807u == null) {
            android.view.View inflate2 = android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570920cd5, null);
            this.f236807u = inflate2;
            this.f236799m.addFooterView(inflate2, null, false);
        }
        android.view.View view = this.f236807u;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f236802p)) {
            ot0.q v17 = ot0.q.v(pt0.f0.Li(this.f236803q, this.f236801o).U1());
            if (v17 != null) {
                this.f236802p = v17.f430179d;
                lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                java.lang.String str6 = this.f236802p;
                int i17 = v17.G;
                ((kt.c) i0Var).getClass();
                mVar = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.i(str6, i17);
                str = (mVar == null || (str3 = mVar.f67372x453d1e07) == null || str3.trim().length() <= 0) ? v17.H : mVar.f67372x453d1e07;
            } else {
                str = null;
            }
        } else {
            lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str7 = this.f236802p;
            ((kt.c) i0Var2).getClass();
            mVar = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str7);
            str = (mVar == null || (str2 = mVar.f67372x453d1e07) == null || str2.trim().length() <= 0) ? "" : mVar.f67372x453d1e07;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f236802p) && mVar != null) {
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.kjr);
            this.f236804r = findViewById;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/record/ui/RecordMsgBaseUI", "showSourceLayoutIfNeed", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/record/ui/RecordMsgBaseUI", "showSourceLayoutIfNeed", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a49);
            android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.a4_);
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            int textSize = (int) (textView2.getTextSize() * 1.5d);
            layoutParams.height = textSize;
            layoutParams.width = textSize;
            imageView.setLayoutParams(layoutParams);
            textView2.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hfo, ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Vi(mo55332x76847179(), mVar, str)));
            android.graphics.Bitmap Di = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(this.f236802p, 1, i65.a.g(mo55332x76847179()));
            if (Di == null || Di.isRecycled()) {
                android.content.res.Resources resources = getResources();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.bku));
                arrayList2.add(resources);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj, arrayList2.toArray(), "com/tencent/mm/plugin/record/ui/RecordMsgBaseUI", "initWatermarkIcon", "(Landroid/widget/ImageView;Ljava/lang/String;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue());
                yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/record/ui/RecordMsgBaseUI", "initWatermarkIcon", "(Landroid/widget/ImageView;Ljava/lang/String;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
                android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(decodeResource);
                int dimension = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja);
                bitmapDrawable.setBounds(0, 0, dimension, dimension);
                imageView.setImageDrawable(bitmapDrawable);
            } else {
                android.graphics.drawable.BitmapDrawable bitmapDrawable2 = new android.graphics.drawable.BitmapDrawable(Di);
                int dimension2 = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja);
                bitmapDrawable2.setBounds(0, 0, dimension2, dimension2);
                imageView.setImageDrawable(bitmapDrawable2);
            }
        }
        this.f236799m.setAdapter((android.widget.ListAdapter) this.f236800n);
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.h0 h0Var = this.f236800n;
        h0Var.f236939o = this.f236799m;
        int i18 = this.f182133g.f425009a;
        android.util.SparseArray sparseArray = h0Var.f236935h;
        sparseArray.put(0, new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.y(h0Var.f236933f));
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.m mVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.m(h0Var.f236942r, h0Var.f236939o);
        mVar2.f237076g = h0Var.f236931d;
        sparseArray.put(1, h0Var.j(mVar2));
        sparseArray.put(2, new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.z());
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.q qVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.q(h0Var.f236942r, h0Var.f236934g);
        qVar.f237089e = h0Var.f236945u;
        qVar.f237090f = h0Var.f236946v;
        qVar.f237091g = h0Var.f236931d;
        qVar.f237092h = h0Var.f236932e;
        qVar.f237093i = h0Var.c();
        sparseArray.put(3, qVar);
        sparseArray.put(4, new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.s(h0Var.f236942r));
        sparseArray.put(5, new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.a());
        this.f236800n.f236944t = getIntent().getIntExtra("preChatTYPE", 0);
        this.f236799m.setOnScrollListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.i0(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.j0(this));
        h7();
        this.f236799m.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.k0(this), 100L);
    }

    public abstract void f7(int i17, int i18, android.content.Intent intent);

    public void g7() {
        java.lang.String d76 = d7();
        java.lang.String string = mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572694c63);
        if (d76 != null && d76.endsWith(string) && d76.lastIndexOf(string) >= 1) {
            d76 = d76.substring(0, d76.lastIndexOf(string) - 1);
        }
        mo56583xbf7c1df6(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(mo55332x76847179(), d76, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561101k)));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cd8;
    }

    public abstract void h7();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13589x120fb59a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        f7(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13589x120fb59a, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        super.onCreate(bundle);
        e7();
        this.f236805s.mo48813x58998cd();
        o25.n1.c(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f236805s.mo48814x2efc64();
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.h0 h0Var = this.f236800n;
        if (h0Var != null) {
            h0Var.a();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.h0 h0Var = this.f236800n;
        if (h0Var != null) {
            int i17 = 0;
            while (true) {
                android.util.SparseArray sparseArray = h0Var.f236935h;
                if (i17 >= sparseArray.size()) {
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.g0 g0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.g0) sparseArray.valueAt(i17);
                if (g0Var != null) {
                    g0Var.mo67873x65825f6();
                }
                i17++;
            }
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6182x843a430c c6182x843a430c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6182x843a430c();
        c6182x843a430c.f136440g.f88911a = 1;
        c6182x843a430c.e();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6182x843a430c c6182x843a430c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6182x843a430c();
        android.widget.ListView listView = this.f236799m;
        if (listView != null) {
            am.mz mzVar = c6182x843a430c.f136440g;
            mzVar.f88911a = 0;
            mzVar.f88912b = listView.getFirstVisiblePosition();
            mzVar.f88913c = this.f236799m.getLastVisiblePosition();
            mzVar.f88914d = this.f236799m.getHeaderViewsCount();
            c6182x843a430c.e();
        }
    }
}
