package mi5;

/* loaded from: classes9.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec5.a f408368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f408369e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f408370f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f408371g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mi5.h f408372h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f408373i;

    public g(ec5.a aVar, android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, mi5.h hVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f408368d = aVar;
        this.f408369e = context;
        this.f408370f = f9Var;
        this.f408371g = str;
        this.f408372h = hVar;
        this.f408373i = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/msgviewfactory/view/ChattingFileView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ec5.a aVar = this.f408368d;
        long m75942xfb822ef2 = aVar.m75942xfb822ef2(aVar.f125235d + 0);
        android.content.Context context = this.f408369e;
        if (m75942xfb822ef2 > 0) {
            sc5.g gVar = sc5.g.f488105a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
            gVar.f(context, this.f408370f, new sc5.h(uuid));
        } else if (com.p314xaae8f345.mm.vfs.w6.j(aVar.m127285x5000ed37())) {
            java.lang.String str = this.f408371g;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                ((ht.s) ((jt.a0) i95.n0.c(jt.a0.class))).getClass();
                if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.t3.l(str)) {
                    ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).Bi(aVar.m127285x5000ed37(), str, 16);
                } else {
                    aVar.m127285x5000ed37();
                    mi5.h hVar = this.f408372h;
                    hVar.getClass();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F0(str)) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
                        java.lang.String m127285x5000ed37 = aVar.m127285x5000ed37();
                        java.lang.String g17 = ez.v0.f339310a.g((v05.b) this.f408373i.f391656d);
                        hVar.getClass();
                        re5.f0.a(m127285x5000ed37);
                        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2717x62f6fe4.ActivityC22445xcae55707.class);
                        pf5.j0.a(intent, re5.g0.class);
                        intent.putExtra("KEY_PATH", m127285x5000ed37);
                        intent.putExtra("KEY_VIDEO_FILE_NAME", g17);
                        intent.putExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39699xc6812768, true);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/ui/msgviewfactory/view/ChattingFileView", "openByVideoPlayer", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(context, "com/tencent/mm/ui/msgviewfactory/view/ChattingFileView", "openByVideoPlayer", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingFileView", "unsupport ext: " + str);
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ChattingFileView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
