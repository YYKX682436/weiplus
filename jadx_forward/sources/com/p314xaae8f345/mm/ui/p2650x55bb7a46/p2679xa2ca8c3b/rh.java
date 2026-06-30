package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class rh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f286980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286981e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f286982f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xq f286983g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f286984h;

    public rh(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xq xqVar) {
        this.f286984h = c21908xb66fd105;
        this.f286980d = f9Var;
        this.f286981e = str;
        this.f286982f = map;
        this.f286983g = xqVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = this.f286984h;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.n6 B = c21908xb66fd105.B(c21908xb66fd105.f284708s);
        if (B != null) {
            B.onClick(view);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f286980d;
        java.lang.String Q0 = f9Var.Q0();
        java.lang.String str = this.f286981e;
        c21908xb66fd105.s1(2, Q0, str);
        tb5.a.f498558a.a(2, c21908xb66fd105.X, c21908xb66fd105.f284708s.x(), c21908xb66fd105.Y);
        yb5.d dVar = c21908xb66fd105.f284708s;
        java.util.Map map = this.f286982f;
        tb5.o0.c(dVar, f9Var, map, 2);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.h0(c21908xb66fd105, 8, str, 2, 0);
        c21908xb66fd105.o1(4, map, "");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.g0(c21908xb66fd105, 6, f9Var);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xq xqVar = this.f286983g;
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h0) ((sb5.g) c21908xb66fd105.f284708s.f542241c.a(sb5.g.class))).n0()) {
            try {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.dk a17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.dk.a(map);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.a aVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.a.f297578b;
                com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.y yVar = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.y();
                com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.x xVar = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.x();
                xVar.f300748g = com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.w.Click;
                xVar.f300747f = java.lang.System.currentTimeMillis();
                xVar.f300746e = f9Var.Q0();
                xVar.f300745d = aVar.b();
                xVar.f300749h = "102_1";
                xVar.f300750i = "template_message";
                java.lang.String valueOf = java.lang.String.valueOf(f9Var.I0());
                if (valueOf == null) {
                    valueOf = "";
                }
                xVar.f300751m = valueOf;
                xVar.f300753o = java.lang.String.valueOf(xqVar.mo79416xf806b362() + 1);
                cl0.g gVar = new cl0.g();
                java.lang.String str2 = a17.f285341f;
                if (str2 == null) {
                    str2 = "";
                }
                cl0.g h17 = gVar.h("content", str2);
                h17.p("send_timestamp", a17.f285338c);
                xVar.f300755q = h17.toString();
                yVar.f300787d = xVar;
                aVar.f(yVar);
            } catch (cl0.f e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemDyeingTemplate", "json error: %s" + e17);
            }
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.e0(c21908xb66fd105, (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag(), map);
        java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.mmreader.template_header.ecs_overall_jump_info");
        java.lang.String str4 = str3 != null ? str3 : "";
        if (!android.text.TextUtils.isEmpty(str4)) {
            c21908xb66fd105.b(str4, "ecs_overall_jump_info_template_msg");
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
