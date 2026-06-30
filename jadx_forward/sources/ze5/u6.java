package ze5;

/* loaded from: classes9.dex */
public class u6 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.b6 {

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 f553758g;

    /* renamed from: h, reason: collision with root package name */
    public int f553759h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.m5 f553760i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f553761m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f553762n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f553763o;

    public u6(yb5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var, boolean z17) {
        super(dVar);
        this.f553759h = 0;
        this.f553760i = null;
        this.f553761m = false;
        this.f553763o = false;
        this.f553758g = a0Var;
        this.f553762n = z17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.b6
    public void a(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        if (((fo.e) ((le5.e) i95.n0.c(le5.e.class))).bj(dVar.g(), erVar.c().G, null)) {
            return;
        }
        ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).wi(erVar.c());
        b(erVar.c(), erVar.f285439b, erVar.f285442e, view);
        ot0.q w17 = ot0.q.w(2, f9Var.j());
        if (w17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w17.f430179d) && this.f553758g != null) {
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str = w17.f430179d;
            ((kt.c) i0Var).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m j17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(str, false, false);
            if (j17 != null) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.e(dVar, w17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.t(dVar, f9Var), j17, f9Var.I0(), dVar.x());
            }
        }
        te5.t.i(dVar, f9Var, 0);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(f9Var.Q0())) {
            return;
        }
        boolean z17 = this.f553762n;
        long I0 = f9Var.I0();
        java.lang.String Q0 = f9Var.Q0();
        el0.a aVar = el0.i.f335258f;
        if (aVar != null) {
            wl0.h hVar = (wl0.h) aVar;
            ((ku5.t0) ku5.t0.f394148d).r(new wl0.g(hVar, I0, z17, Q0), "KaraEvent");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0241  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r23, java.lang.String r24, java.lang.String r25, android.view.View r26) {
        /*
            Method dump skipped, instructions count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.u6.b(com.tencent.mm.storage.f9, java.lang.String, java.lang.String, android.view.View):void");
    }

    public final void c(long j17, long j18, java.lang.String str, int i17, java.lang.String str2, int[] iArr, int i18, int i19, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DesignerClickListener", "[ImageGalleryUI] doGetMsgImg");
        yb5.d dVar = this.f280025d;
        android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.class);
        intent.putExtra("img_gallery_msg_id", j17);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.c cVar = dVar.f542241c;
        intent.putExtra("show_search_chat_content_result", ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jk) ((sb5.u1) cVar.a(sb5.u1.class))).f280828f);
        intent.putExtra("img_gallery_msg_svr_id", j18);
        intent.putExtra("key_is_biz_chat", ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) cVar.a(sb5.f.class))).f280286r);
        intent.putExtra("key_biz_chat_id", ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) cVar.a(sb5.f.class))).w0());
        intent.putExtra("img_gallery_talker", str);
        intent.putExtra("img_gallery_chatroom_name", str2);
        intent.putExtra("img_gallery_left", iArr[0]);
        intent.putExtra("img_gallery_top", iArr[1]);
        intent.putExtra("img_gallery_width", i18);
        intent.putExtra("img_gallery_height", i19);
        intent.putExtra("img_gallery_enter_from_chatting_ui", true);
        intent.putExtra("msg_type", this.f553759h);
        if (this.f553759h == 1) {
            intent.putExtra("show_enter_grid", false);
        }
        if (z17) {
            intent.putExtra("img_preview_only", true);
        }
        intent.putExtra("img_gallery_enter_from_appbrand_service_chatting_ui", com.p314xaae8f345.mm.p2621x8fb0427b.z3.z3(str));
        java.lang.String x17 = dVar.x();
        android.os.Bundle bundle = new android.os.Bundle();
        if (dVar.D()) {
            bundle.putInt("stat_scene", 2);
        } else {
            bundle.putInt("stat_scene", c01.e2.G(x17) ? 7 : 1);
        }
        bundle.putString("stat_msg_id", "msg_" + java.lang.Long.toString(j18));
        bundle.putString("stat_chat_talker_username", x17);
        bundle.putString("stat_send_msg_user", str);
        intent.putExtra("_stat_obj", bundle);
        intent.putExtra("img_gallery_session_id", com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.k(j18, str, x17));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bm.a(intent, dVar.g());
        com.p314xaae8f345.mm.ui.p2731xc84c5534.C22471x941a9a3f c17 = com.p314xaae8f345.mm.ui.p2731xc84c5534.C22471x941a9a3f.c(dVar.g());
        c17.f291149h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r0(j18);
        c17.f291150i = com.p314xaae8f345.mm.ui.p2731xc84c5534.h0.Image;
        int i27 = bundle.getInt("stat_scene", 0);
        if (i27 == 1) {
            c17.f291146e = com.p314xaae8f345.mm.ui.p2731xc84c5534.j0.SingleChat;
            c17.b(com.p314xaae8f345.mm.ui.p2731xc84c5534.i0.EnterSingleChat);
        } else if (i27 == 2) {
            c17.f291146e = com.p314xaae8f345.mm.ui.p2731xc84c5534.j0.GroupChat;
            c17.b(com.p314xaae8f345.mm.ui.p2731xc84c5534.i0.EnterGroupChat);
        }
        c17.a(intent);
        yb5.d dVar2 = this.f280025d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(dVar2, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemImgMvvm$ImageClickListener", "doGetMsgImg", "(JJLjava/lang/String;ILjava/lang/String;[IIIZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        dVar2.a0((android.content.Intent) arrayList.get(0));
        yj0.a.f(dVar2, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemImgMvvm$ImageClickListener", "doGetMsgImg", "(JJLjava/lang/String;ILjava/lang/String;[IIIZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        dVar.f542250l.m78401x4d12b7e0(0, 0);
    }

    public void d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.view.View view) {
        int i17 = this.f553759h;
        if (i17 != 1) {
            if (i17 != 4) {
                return;
            }
            b(f9Var, f9Var.Q0(), "", view);
        } else {
            if (((fo.e) ((le5.e) i95.n0.c(le5.e.class))).bj(view.getContext(), f9Var.G, null)) {
                return;
            }
            ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).wi(f9Var);
            b(f9Var, f9Var.Q0(), "", view);
        }
    }

    public u6(yb5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.view.View view, boolean z17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.m5 m5Var) {
        super(dVar);
        this.f553760i = null;
        this.f553761m = false;
        this.f553763o = false;
        this.f553758g = a0Var;
        this.f553759h = i17;
        this.f553761m = z17;
        this.f553760i = m5Var;
        d(f9Var, view);
    }

    public u6(yb5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.view.View view, boolean z17, boolean z18, com.p314xaae8f345.mm.ui.p2650x55bb7a46.m5 m5Var) {
        super(dVar);
        this.f553760i = null;
        this.f553761m = false;
        this.f553763o = false;
        this.f553758g = a0Var;
        this.f553759h = i17;
        this.f553761m = z17;
        this.f553763o = z18;
        d(f9Var, view);
    }
}
