package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public final class y8 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 {
    public y8(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.y8 a(android.view.View convertView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convertView, "convertView");
        super.mo80050xaf65a0fc(convertView);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.b9.f285003b = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) convertView.findViewById(com.p314xaae8f345.mm.R.id.bkl);
        android.view.View findViewById = convertView.findViewById(com.p314xaae8f345.mm.R.id.bkf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type android.widget.CheckBox");
        this.f39492x5b9aa3a3 = (android.widget.CheckBox) findViewById;
        this.f39496x10665fb1 = convertView.findViewById(com.p314xaae8f345.mm.R.id.bpa);
        return this;
    }

    public final void b(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.y8 holder, yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, java.lang.String str, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 chattingItem, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingItem, "chattingItem");
        ot0.q v17 = ot0.q.v(msg.U1());
        if (v17 == null || v17.f430199i != 91) {
            return;
        }
        byte[] bytes = "wx91d27dbf599dff74".getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.String encodeToString = android.util.Base64.encodeToString(bytes, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encodeToString, "encodeToString(...)");
        java.lang.String str2 = "[暂不支持此消息格式，请在 <a data-miniprogram-appid = \"" + r26.n0.Z(encodeToString, "\n") + "\" data-miniprogram-path = \" \" href = \"www.qq.com\">hello world</a>中查看]";
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.b9.f285003b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22624x85d69039);
        android.content.Context context = c22624x85d69039.getContext();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690392 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.b9.f285003b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22624x85d690392);
        int m84164x40077844 = (int) c22624x85d690392.m84164x40077844();
        ((ke0.e) xVar).getClass();
        android.text.SpannableString u17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.u(context, str2, m84164x40077844, 1, null, null, true);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690393 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.b9.f285003b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22624x85d690393);
        c22624x85d690393.b(u17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690394 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.b9.f285003b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22624x85d690394);
        c22624x85d690394.setClickable(true);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0
    /* renamed from: getMainContainerView */
    public android.view.View mo79945xb0f558d7() {
        return com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.b9.f285003b;
    }
}
