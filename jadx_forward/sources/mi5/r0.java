package mi5;

/* loaded from: classes9.dex */
public final class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi5.s0 f408441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f408442e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l15.c f408443f;

    public r0(mi5.s0 s0Var, android.content.Context context, l15.c cVar) {
        this.f408441d = s0Var;
        this.f408442e = context;
        this.f408443f = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String j17;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String l17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/msgviewfactory/view/ChattingUrlView$onUpdateViewModel$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f408442e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
        this.f408441d.getClass();
        v05.b k17 = this.f408443f.k();
        if (k17 != null) {
            int i17 = k17.f449898d;
            int m75939xb282bd08 = k17.m75939xb282bd08(i17 + 6);
            str = "";
            int i18 = k17.f513848e;
            if (m75939xb282bd08 == 15) {
                r05.e eVar = (r05.e) k17.m75936x14adae67(i18 + 19);
                if (eVar != null && (j17 = eVar.j()) != null) {
                    str = j17;
                }
                if (android.text.TextUtils.isEmpty(str)) {
                    str = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).P(k17.m75945x2fec8307(i17 + 9));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getProductIdByUrl(...)");
                }
                if (android.text.TextUtils.isEmpty(str)) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("rawUrl", k17.m75945x2fec8307(i17 + 9));
                    intent.putExtra("showShare", false);
                    j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
                } else {
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    qk.c0 c0Var = new qk.c0(str);
                    c0Var.f445688a = 22;
                    c0Var.f445731g = 122;
                    com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6 p6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6.class);
                    if (p6Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ForwardChattingItemClickHelper", "emoticon liteapp service not found");
                    } else {
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4) p6Var).wi(context, c0Var);
                    }
                }
            } else if (m75939xb282bd08 == 25) {
                int i19 = i18 + 20;
                r05.b bVar = (r05.b) k17.m75936x14adae67(i19);
                int l18 = bVar != null ? bVar.l() : 0;
                r05.b bVar2 = (r05.b) k17.m75936x14adae67(i19);
                if (bVar2 == null || (str2 = bVar2.j()) == null) {
                    str2 = "";
                }
                r05.b bVar3 = (r05.b) k17.m75936x14adae67(i19);
                if (bVar3 == null || (str3 = bVar3.k()) == null) {
                    str3 = "";
                }
                if (l18 != 0) {
                    qk.v vVar = new qk.v();
                    java.lang.String m75945x2fec8307 = k17.m75945x2fec8307(i17 + 9);
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    vVar.f445573t = m75945x2fec8307 != null ? m75945x2fec8307 : "";
                    vVar.f445560g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1(java.lang.Integer.valueOf(l18));
                    vVar.f445563j = str2;
                    vVar.f445569p = str3;
                    vVar.f445688a = 22;
                    vVar.f445568o = true;
                    vVar.f445689b = true;
                    vVar.f445576w = true;
                    com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.q6 q6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.q6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.q6.class);
                    if (q6Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ForwardChattingItemClickHelper", "emoticon page service not found");
                    } else {
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h4) q6Var).wi(context, vVar);
                    }
                }
            } else if (m75939xb282bd08 != 97) {
                java.lang.String m75945x2fec83072 = k17.m75945x2fec8307(i17 + 9);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec83072)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ForwardChattingItemClickHelper", "open Url but url is Empty: " + k17.m126747x696739c());
                } else {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("rawUrl", m75945x2fec83072);
                    intent2.putExtra("showShare", false);
                    j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent2, null);
                }
            } else {
                java.lang.String m75945x2fec83073 = k17.m75945x2fec8307(i17 + 2);
                if (m75945x2fec83073 == null) {
                    m75945x2fec83073 = "";
                }
                java.lang.String m75945x2fec83074 = k17.m75945x2fec8307(i17 + 3);
                if (m75945x2fec83074 == null) {
                    m75945x2fec83074 = "";
                }
                int i27 = i18 + 21;
                r05.d dVar = (r05.d) k17.m75936x14adae67(i27);
                if (dVar == null || (str4 = dVar.m161247x9f7ace00()) == null) {
                    str4 = "";
                }
                r05.d dVar2 = (r05.d) k17.m75936x14adae67(i27);
                if (dVar2 != null && (l17 = dVar2.l()) != null) {
                    str = l17;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardChattingItemClickHelper", "setKey is null.");
                } else {
                    r45.vd0 vd0Var = new r45.vd0();
                    vd0Var.f469667d = str;
                    vd0Var.f469669f = m75945x2fec83073;
                    vd0Var.f469670g = m75945x2fec83074;
                    vd0Var.f469668e = str4;
                    qk.a0 a0Var = new qk.a0(vd0Var);
                    com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6 p6Var2 = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6.class);
                    if (p6Var2 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ForwardChattingItemClickHelper", "unable to get emoticon liteapp feature service");
                    } else {
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4) p6Var2).wi(context, a0Var);
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ChattingUrlView$onUpdateViewModel$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
