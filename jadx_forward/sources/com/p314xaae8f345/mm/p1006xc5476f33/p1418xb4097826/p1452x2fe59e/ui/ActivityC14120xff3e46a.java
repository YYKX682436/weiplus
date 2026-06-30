package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI34;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI34 */
/* loaded from: classes8.dex */
public final class ActivityC14120xff3e46a extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f191147t = 0;

    public final void c7(int i17, java.lang.String str) {
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_FINDER_AUTHOR_BIND_ID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(stringExtra);
        if (h17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGameBind", "can not find app info");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGameBind", "WXChannelBind backToApp: %s", stringExtra);
        com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11244x2750923f.Resp resp = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11244x2750923f.Resp();
        resp.f32867xa7c470f2 = i17;
        resp.f32869xc3c3c505 = h17.f67384x996f3ea;
        if (str == null) {
            str = "";
        }
        resp.f32868xb2d5068c = str;
        byte[] bytes = "".getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        resp.f32936x59eb8008 = bytes;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("WXOpenid", h17.f67384x996f3ea);
            resp.f32937xb32a65a0 = jSONObject.toString();
        } catch (org.json.JSONException unused) {
        }
        resp.f32869xc3c3c505 = h17.f67384x996f3ea;
        resp.mo48431x792022dd(bundle);
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args args = new com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args();
        args.f32706x6a744ba6 = h17.f67386xa1e9e82c;
        args.f32701xaddf3082 = bundle;
        args.f32703x5cfee87 = 268435456;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.g(bundle);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.h(bundle);
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.m48400x35cf88(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, args);
    }

    public final void d7(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xy2.c.e(mo55332x76847179));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.mbr);
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.zo(this));
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.e_e);
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d i17 = g1Var.i();
        mn2.n nVar = new mn2.n(str2, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        i17.c(nVar, imageView, g1Var.h(mn2.f1.f411493n));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.fuv);
        textView.setText(str);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(mo55332x768471792, str));
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.q8d);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.m1 m1Var = ya2.m1.f542044a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView2);
        boolean z17 = true;
        m1Var.c(imageView2, c19780xceb4c4dc, 1);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.a8r);
        textView2.setText(c19780xceb4c4dc != null ? c19780xceb4c4dc.m76029xad9975ba() : null);
        java.lang.String m76029xad9975ba = c19780xceb4c4dc != null ? c19780xceb4c4dc.m76029xad9975ba() : null;
        if (m76029xad9975ba == null || m76029xad9975ba.length() == 0) {
            textView2.setVisibility(8);
        }
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.ehv);
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.dfl);
        if (K0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI34", "refreshInfoLayout", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/protocal/protobuf/FinderAuthInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI34", "refreshInfoLayout", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/protocal/protobuf/FinderAuthInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI34", "refreshInfoLayout", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/protocal/protobuf/FinderAuthInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI34", "refreshInfoLayout", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/protocal/protobuf/FinderAuthInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ap(this));
            findViewById.setEnabled(false);
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI34", "refreshInfoLayout", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/protocal/protobuf/FinderAuthInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI34", "refreshInfoLayout", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/protocal/protobuf/FinderAuthInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI34", "refreshInfoLayout", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/protocal/protobuf/FinderAuthInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI34", "refreshInfoLayout", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/protocal/protobuf/FinderAuthInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setEnabled(true);
        }
        if (!g92.b.f351302e.j4() && !pr2.a.f439482a.a()) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        findViewById.setEnabled(false);
        db5.t7.g(this, getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ln9));
        findViewById.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.bp(this), 2000L);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dmf;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1000085) {
            if (i18 != 1) {
                if (i18 != 2) {
                    if (i18 == 4) {
                        db5.t7.m(mo55332x76847179(), "账号已存在");
                        return;
                    } else if (i18 != 5) {
                        return;
                    }
                }
                db5.t7.m(mo55332x76847179(), "未能成功创建视频号");
                return;
            }
            if (intent == null || (str = intent.getStringExtra("KEY_FINDER_AVATAR")) == null) {
                str = "";
            }
            if (intent == null || (str2 = intent.getStringExtra("KEY_FINDER_NICK_NAME")) == null) {
                str2 = "";
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc();
            byte[] byteArrayExtra = intent != null ? intent.getByteArrayExtra("KEY_FINDER_AUTHOR_INFO") : null;
            if (byteArrayExtra != null) {
                try {
                    c19780xceb4c4dc.mo11468x92b714fd(byteArrayExtra);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                }
                d7(str2, str, c19780xceb4c4dc);
            }
            c19780xceb4c4dc = null;
            d7(str2, str, c19780xceb4c4dc);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        c7(-2, "");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78514x143f1b92().W0(this, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.o();
        }
        findViewById(com.p314xaae8f345.mm.R.id.f565291bz2).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.xo(this));
        findViewById(com.p314xaae8f345.mm.R.id.qjv).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.yo(this));
        ya2.g gVar = ya2.h.f542017a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        ya2.b2 b17 = gVar.b(xy2.c.e(mo55332x76847179));
        java.lang.String str = b17 != null ? b17.f69301x81118c51 : null;
        if (str == null) {
            str = "";
        }
        java.lang.String w07 = b17 != null ? b17.w0() : "";
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc = b17 != null ? b17.f69300x731cac1b : null;
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_FINDER_AUTHOR_BIND_ID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(stringExtra);
        java.lang.String str2 = h17 != null ? h17.f67369x5e556d3a : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = h17 != null ? h17.f67372x453d1e07 : null;
        java.lang.String str4 = str3 != null ? str3 : "";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appid: ");
        sb6.append(stringExtra);
        sb6.append(", openid: ");
        sb6.append(h17 != null ? h17.f67384x996f3ea : null);
        sb6.append(", appUrl: ");
        sb6.append(str2);
        sb6.append(", appName: ");
        sb6.append(str4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGameBind", sb6.toString());
        n11.a.b().g(str2, (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f_n));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f_p);
        textView.setText(str4);
        com.p314xaae8f345.mm.ui.fk.a(textView);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f_o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
        com.p314xaae8f345.mm.ui.fk.a(textView2);
        d7(w07, str, c19780xceb4c4dc);
    }
}
