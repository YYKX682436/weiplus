package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI34;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class OccupyFinderUI34 extends com.tencent.mm.plugin.finder.ui.MMFinderUI {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f109614t = 0;

    public final void c7(int i17, java.lang.String str) {
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_FINDER_AUTHOR_BIND_ID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(stringExtra);
        if (h17 == null) {
            com.tencent.mars.xlog.Log.i("FinderGameBind", "can not find app info");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mars.xlog.Log.i("FinderGameBind", "WXChannelBind backToApp: %s", stringExtra);
        com.tencent.mm.opensdk.modelbiz.WXChannelBind.Resp resp = new com.tencent.mm.opensdk.modelbiz.WXChannelBind.Resp();
        resp.errCode = i17;
        resp.openId = h17.field_openId;
        if (str == null) {
            str = "";
        }
        resp.errStr = str;
        byte[] bytes = "".getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        resp.authBuffer = bytes;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("WXOpenid", h17.field_openId);
            resp.extMsg = jSONObject.toString();
        } catch (org.json.JSONException unused) {
        }
        resp.openId = h17.field_openId;
        resp.toBundle(bundle);
        com.tencent.mm.opensdk.channel.MMessageActV2.Args args = new com.tencent.mm.opensdk.channel.MMessageActV2.Args();
        args.targetPkgName = h17.field_packageName;
        args.bundle = bundle;
        args.flags = 268435456;
        com.tencent.mm.pluginsdk.model.app.j1.g(bundle);
        com.tencent.mm.pluginsdk.model.app.j1.h(bundle);
        com.tencent.mm.opensdk.channel.MMessageActV2.send(com.tencent.mm.sdk.platformtools.x2.f193071a, args);
    }

    public final void d7(java.lang.String str, java.lang.String str2, com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo) {
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(xy2.c.e(context));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.mbr);
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.zo(this));
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.e_e);
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d i17 = g1Var.i();
        mn2.n nVar = new mn2.n(str2, null, 2, null);
        kotlin.jvm.internal.o.d(imageView);
        i17.c(nVar, imageView, g1Var.h(mn2.f1.f329960n));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.fuv);
        textView.setText(str);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        androidx.appcompat.app.AppCompatActivity context2 = getContext();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context2, str));
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.q8d);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.m1 m1Var = ya2.m1.f460511a;
        kotlin.jvm.internal.o.d(imageView2);
        boolean z17 = true;
        m1Var.c(imageView2, finderAuthInfo, 1);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.a8r);
        textView2.setText(finderAuthInfo != null ? finderAuthInfo.getAuthProfession() : null);
        java.lang.String authProfession = finderAuthInfo != null ? finderAuthInfo.getAuthProfession() : null;
        if (authProfession == null || authProfession.length() == 0) {
            textView2.setVisibility(8);
        }
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ehv);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.dfl);
        if (K0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
            findViewById3.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.ap(this));
            findViewById.setEnabled(false);
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
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
        if (!g92.b.f269769e.j4() && !pr2.a.f357949a.a()) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        findViewById.setEnabled(false);
        db5.t7.g(this, getResources().getString(com.tencent.mm.R.string.ln9));
        findViewById.postDelayed(new com.tencent.mm.plugin.finder.feed.ui.bp(this), 2000L);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dmf;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1000085) {
            if (i18 != 1) {
                if (i18 != 2) {
                    if (i18 == 4) {
                        db5.t7.m(getContext(), "账号已存在");
                        return;
                    } else if (i18 != 5) {
                        return;
                    }
                }
                db5.t7.m(getContext(), "未能成功创建视频号");
                return;
            }
            if (intent == null || (str = intent.getStringExtra("KEY_FINDER_AVATAR")) == null) {
                str = "";
            }
            if (intent == null || (str2 = intent.getStringExtra("KEY_FINDER_NICK_NAME")) == null) {
                str2 = "";
            }
            com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo = new com.tencent.mm.protocal.protobuf.FinderAuthInfo();
            byte[] byteArrayExtra = intent != null ? intent.getByteArrayExtra("KEY_FINDER_AUTHOR_INFO") : null;
            if (byteArrayExtra != null) {
                try {
                    finderAuthInfo.parseFrom(byteArrayExtra);
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
                d7(str2, str, finderAuthInfo);
            }
            finderAuthInfo = null;
            d7(str2, str, finderAuthInfo);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        c7(-2, "");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        getController().W0(this, getResources().getColor(com.tencent.mm.R.color.aaw));
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        findViewById(com.tencent.mm.R.id.f483758bz2).setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.xo(this));
        findViewById(com.tencent.mm.R.id.qjv).setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.yo(this));
        ya2.g gVar = ya2.h.f460484a;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ya2.b2 b17 = gVar.b(xy2.c.e(context));
        java.lang.String str = b17 != null ? b17.field_avatarUrl : null;
        if (str == null) {
            str = "";
        }
        java.lang.String w07 = b17 != null ? b17.w0() : "";
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo = b17 != null ? b17.field_authInfo : null;
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_FINDER_AUTHOR_BIND_ID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(stringExtra);
        java.lang.String str2 = h17 != null ? h17.field_appIconUrl : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = h17 != null ? h17.field_appName : null;
        java.lang.String str4 = str3 != null ? str3 : "";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appid: ");
        sb6.append(stringExtra);
        sb6.append(", openid: ");
        sb6.append(h17 != null ? h17.field_openId : null);
        sb6.append(", appUrl: ");
        sb6.append(str2);
        sb6.append(", appName: ");
        sb6.append(str4);
        com.tencent.mars.xlog.Log.i("FinderGameBind", sb6.toString());
        n11.a.b().g(str2, (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f_n));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f_p);
        textView.setText(str4);
        com.tencent.mm.ui.fk.a(textView);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f_o);
        kotlin.jvm.internal.o.d(textView2);
        com.tencent.mm.ui.fk.a(textView2);
        d7(w07, str, finderAuthInfo);
    }
}
