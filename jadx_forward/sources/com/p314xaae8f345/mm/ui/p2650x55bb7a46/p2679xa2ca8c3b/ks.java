package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes16.dex */
public final class ks implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285904e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c00.u3 f285905f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f285906g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285907h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ms f285908i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285909m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285910n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f285911o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285912p;

    public ks(java.lang.String str, java.lang.String str2, c00.u3 u3Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str3, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ms msVar, java.lang.String str4, java.lang.String str5, java.util.Map map, java.lang.String str6) {
        this.f285903d = str;
        this.f285904e = str2;
        this.f285905f = u3Var;
        this.f285906g = f9Var;
        this.f285907h = str3;
        this.f285908i = msVar;
        this.f285909m = str4;
        this.f285910n = str5;
        this.f285911o = map;
        this.f285912p = str6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/EcsKfProductCardWholeController$inflateButtonItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("button click: word=");
        sb6.append(this.f285903d);
        sb6.append(", viewId=");
        java.lang.String str = this.f285904e;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKfProductCardWholeCtrl", sb6.toString());
        ((b00.a0) this.f285905f).aj("view_clk", this.f285906g, str);
        java.lang.String ecsJumpInfoBase64 = this.f285907h;
        boolean z17 = ecsJumpInfoBase64 == null || ecsJumpInfoBase64.length() == 0;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ms msVar = this.f285908i;
        if (z17) {
            java.lang.String url = this.f285910n;
            if (!(url == null || url.length() == 0)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(url, "$url");
                msVar.getClass();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                java.lang.String str2 = this.f285912p;
                sb7.append(str2);
                sb7.append(".weapp_username");
                java.lang.String sb8 = sb7.toString();
                java.util.Map map = this.f285911o;
                java.lang.String str3 = (java.lang.String) map.get(sb8);
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                java.lang.String str4 = "";
                if (str3 == null) {
                    str3 = "";
                }
                boolean z19 = str3.length() == 0;
                android.content.Context context = msVar.f286135a;
                if (z19) {
                    try {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("rawUrl", url);
                        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EcsKfProductCardWholeCtrl", e17, "jumpByUrl error", new java.lang.Object[0]);
                    }
                } else {
                    try {
                        java.lang.String str5 = (java.lang.String) map.get(str2 + ".weapp_path");
                        if (str5 != null) {
                            str4 = str5;
                        }
                        android.content.Intent intent2 = new android.content.Intent();
                        intent2.putExtra("rawUrl", "weixin://dl/business/?appid=" + str3 + "&path=" + str4);
                        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent2, null);
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EcsKfProductCardWholeCtrl", e18, "jumpByUrl weapp error", new java.lang.Object[0]);
                    }
                }
            }
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ecsJumpInfoBase64, "$ecsJumpInfoBase64");
            msVar.b(ecsJumpInfoBase64, this.f285909m);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/EcsKfProductCardWholeController$inflateButtonItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
