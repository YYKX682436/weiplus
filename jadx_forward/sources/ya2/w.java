package ya2;

/* loaded from: classes3.dex */
public final class w implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f542101a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f542102b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f542103c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f542104d;

    public w(java.lang.String str, java.lang.String str2, android.content.Context context, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f542101a = str;
        this.f542102b = str2;
        this.f542103c = context;
        this.f542104d = h0Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.v71 v71Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0 && (v71Var = (r45.v71) fVar.f152151d) != null && (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) v71Var.m75936x14adae67(3)) != null) {
            ya2.h.f542017a.j(c19782x23db1cfa);
            r45.h32 h32Var = new r45.h32();
            h32Var.set(4, this.f542101a);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_CONTACT", this.f542102b);
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_INFO", h32Var.mo14344x5f01b1f6());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "getContext(...)");
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_IS_VISITOR", !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(xy2.c.e(r11), r2));
            android.content.Context context = this.f542103c;
            if (!(context instanceof android.app.Activity)) {
                context = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v1.f184144a.b();
            }
            jz2.x0 x0Var = jz2.x0.f384287a;
            intent.setClass(context, (java.lang.Class) ((jz5.n) jz2.x0.G).mo141623x754a37bb());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            android.content.Context context2 = context;
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/finder/api/FinderRouterApi", "enterFinderLiveNoticeQrCodeUI$realGoToNoticePage", "(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/finder/api/FinderRouterApi", "enterFinderLiveNoticeQrCodeUI$realGoToNoticePage", "(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f542104d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) h0Var.f391656d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        h0Var.f391656d = null;
        return jz5.f0.f384359a;
    }
}
