package s82;

/* loaded from: classes9.dex */
public class x0 extends s82.c {
    public static boolean l(android.content.Context context, r45.qp0 qp0Var, r45.gp0 gp0Var, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavVideoListItem", "handleMpVideoItem %s/%s", qp0Var.f465702n, qp0Var.f465701m);
        ot0.m1 m1Var = new ot0.m1();
        m1Var.f454881p = qp0Var.f465702n;
        m1Var.f454882q = qp0Var.f465703o;
        m1Var.f454872d = qp0Var.f465707s;
        m1Var.f454873e = qp0Var.f465708t;
        m1Var.f454874f = qp0Var.f465701m;
        m1Var.f454875g = gp0Var.f456937d;
        m1Var.f454876h = qp0Var.f465706r;
        m1Var.f454878m = qp0Var.f465697f;
        m1Var.f454879n = qp0Var.f465698g;
        m1Var.f454877i = qp0Var.f465700i;
        m1Var.f454880o = gp0Var.A;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavVideoListItem", "[ImageGalleryUI] showImgGallery");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("show_search_chat_content_result", false);
        intent.putExtra("img_gallery_msg_id", 0);
        intent.putExtra("img_gallery_talker", qp0Var.f465702n);
        intent.putExtra("img_gallery_chatroom_name", false);
        r45.rp0 rp0Var = qp0Var.f465705q;
        if (rp0Var != null) {
            intent.putExtra("img_gallery_width", rp0Var.f466605f).putExtra("img_gallery_height", qp0Var.f465705q.f466606g).putExtra("img_gallery_left", qp0Var.f465705q.f466603d).putExtra("img_gallery_top", qp0Var.f465705q.f466604e);
        }
        intent.putExtra("img_gallery_is_mp_video_without_msg", true);
        intent.putExtra("img_gallery_mp_video_click_from", 0);
        intent.putExtra("img_gallery_path", gp0Var.T);
        intent.putExtra("show_enter_grid", false);
        intent.putExtra("KOpenArticleSceneFromScene", 24);
        intent.putExtra("img_preview_only", z17);
        try {
            intent.putExtra("img_gallery_mp_share_video_info", m1Var.mo14344x5f01b1f6());
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavVideoListItem", "handleMpVideoItem toByteArray ex %s", e17.getMessage());
        }
        j45.l.u(context, "com.tencent.mm.ui.chatting.gallery.ImageGalleryUI", intent, null);
        ((android.app.Activity) context).overridePendingTransition(0, 0);
        return true;
    }

    @Override // s82.c
    public android.view.View e(android.view.View view, android.view.ViewGroup viewGroup, o72.r2 r2Var) {
        android.view.View view2;
        s82.w0 w0Var;
        b(viewGroup);
        android.content.Context context = viewGroup.getContext();
        if (view == null) {
            w0Var = new s82.w0();
            view2 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.abj, null);
            a(view2, w0Var, r2Var);
            w0Var.f486383q = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.duu);
            w0Var.f486384r = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.dx7);
        } else {
            view2 = view;
            w0Var = (s82.w0) view.getTag();
        }
        w0Var.f486384r.setVisibility(0);
        java.util.LinkedList linkedList = r2Var.f67640x5ab01132.f452497f;
        if (linkedList.size() <= 0 || ((r45.gp0) linkedList.getFirst()).f456981y <= 0) {
            w0Var.f486384r.setText("");
        } else {
            w0Var.f486384r.setText(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.w6.b(context, ((r45.gp0) linkedList.getFirst()).f456981y));
        }
        g(w0Var, r2Var);
        s82.c.j(w0Var.f486383q, r2Var);
        r45.gp0 J2 = o72.x1.J(r2Var);
        k(w0Var.f486383q);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra raVar = this.f486272c;
        android.widget.ImageView imageView = w0Var.f486383q;
        int i17 = this.f486270a;
        raVar.c(imageView, J2, r2Var, com.p314xaae8f345.mm.R.raw.f78433xb28fb9bc, i17, i17);
        return view2;
    }

    @Override // s82.c
    public void f(android.view.View view, r45.dq0 dq0Var) {
        r45.hp0 hp0Var;
        s82.w0 w0Var = (s82.w0) view.getTag();
        android.content.Context context = view.getContext();
        r45.gp0 J2 = o72.x1.J(w0Var.f486307a);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.duu);
        if (J2 != null && (hp0Var = J2.J1) != null && hp0Var.f457903x != null) {
            int[] iArr = new int[2];
            if (findViewById != null) {
                int width = findViewById.getWidth();
                int height = findViewById.getHeight();
                findViewById.getLocationInWindow(iArr);
                r45.qp0 qp0Var = J2.J1.f457903x;
                r45.rp0 rp0Var = new r45.rp0();
                qp0Var.f465705q = rp0Var;
                rp0Var.f466603d = iArr[0];
                rp0Var.f466604e = iArr[1];
                rp0Var.f466605f = width;
                rp0Var.f466606g = height;
            }
        }
        ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(context, w0Var.f486307a, dq0Var);
    }
}
