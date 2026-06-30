package g13;

/* loaded from: classes10.dex */
public final class f extends g13.b {
    @Override // g13.b
    public int n() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bb_;
    }

    @Override // g13.b
    public void o(in5.s0 holder, i13.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        i13.o item = (i13.o) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        boolean z18 = k13.l1.I.a().f384746g;
        android.content.Context context = holder.f374654e;
        if (z18) {
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.odf);
            if (textView != null) {
                textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560680rb));
            }
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.gcj);
            if (textView2 != null) {
                textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.r_));
            }
        } else {
            android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.odf);
            if (textView3 != null) {
                textView3.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560679r9));
            }
            android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.gcj);
            if (textView4 != null) {
                textView4.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560678r8));
            }
        }
        android.widget.TextView textView5 = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.odf);
        int i19 = 0;
        java.lang.String str = item.f368838o;
        if (str == null || str.length() == 0) {
            textView5.setText(textView5.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fer, item.f368834h));
        } else {
            textView5.setText(str);
        }
        android.widget.TextView textView6 = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.gcj);
        java.lang.String str2 = item.f368840q;
        if (str2 == null || str2.length() == 0) {
            textView6.setVisibility(8);
        } else {
            textView6.setVisibility(0);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = textView6.getContext();
            float textSize = textView6.getTextSize();
            ((ke0.e) xVar).getClass();
            textView6.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context2, str2, textSize));
        }
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(holder.f3639x46306858, "finder_live_msg_notify");
        dy1.r ik6 = aVar.ik(holder.f3639x46306858, 40, 26236);
        android.view.View view = holder.f3639x46306858;
        jz5.l[] lVarArr = new jz5.l[12];
        lVarArr[0] = new jz5.l("feed_id", item.f368835i);
        lVarArr[1] = new jz5.l("live_id", item.f368836m);
        lVarArr[2] = new jz5.l("comment_scene", "temp_7");
        java.lang.String str3 = item.f368841r;
        if (str3 == null) {
            str3 = "";
        }
        lVarArr[3] = new jz5.l("finder_username", str3);
        lVarArr[4] = new jz5.l("session_buffer", "");
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        lVarArr[5] = new jz5.l("behaviour_session_id", Ri);
        ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).getClass();
        java.lang.String c17 = b52.b.c();
        if (c17 == null) {
            c17 = "";
        }
        lVarArr[6] = new jz5.l("finder_tab_context_id", c17);
        ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        lVarArr[7] = new jz5.l("finder_context_id", b17);
        lVarArr[8] = new jz5.l("live_enter_status", 1);
        lVarArr[9] = new jz5.l("share_username", "");
        lVarArr[10] = new jz5.l("share_username", "");
        java.lang.String str4 = item.f368842s;
        if (str4 != null) {
            if (str4.length() == 0) {
                i19 = 1;
            }
        }
        lVarArr[11] = new jz5.l("live_notice_type", java.lang.Integer.valueOf(i19));
        ((cy1.a) ik6).gk(view, kz5.c1.k(lVarArr));
    }

    @Override // g13.b
    public void p(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
