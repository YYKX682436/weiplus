package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public final class h5 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 {
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569983tn);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.f5 f5Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.f5();
        f5Var.a(xgVar);
        xgVar.setTag(f5Var);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean N() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View v17, yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 holder, yb5.d ui6, rd5.d msgData, java.lang.String str) {
        ot0.q v17;
        ux3.a aVar;
        java.lang.Object bVar;
        android.text.style.ForegroundColorSpan foregroundColorSpan;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgRingtone", "fill item %d, msgId %d", java.lang.Integer.valueOf(holder.mo79416xf806b362()), java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
            java.lang.String j17 = f9Var.j();
            if (j17 == null || (v17 = ot0.q.v(j17)) == null || (aVar = (ux3.a) v17.y(ux3.a.class)) == null) {
                return;
            }
            vx3.i iVar = aVar.f513407b;
            android.app.Activity g17 = ui6.g();
            java.lang.String str2 = iVar.f522824h;
            java.lang.String string = g17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575009kd3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String str3 = string + ' ' + str2;
            android.text.Spannable newSpannable = android.text.Spannable.Factory.getInstance().newSpannable(str3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(newSpannable, "newSpannable(...)");
            int length = string.length();
            if ((f9Var.F & 16384) != 0) {
                bVar = new android.text.style.StyleSpan(0);
                foregroundColorSpan = new android.text.style.ForegroundColorSpan(i65.a.d(g17, com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
            } else {
                bVar = new gb5.b();
                foregroundColorSpan = new android.text.style.ForegroundColorSpan(i65.a.d(g17, com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
            }
            newSpannable.setSpan(foregroundColorSpan, 0, length, 17);
            newSpannable.setSpan(bVar, 0, str3.length(), 17);
            newSpannable.setSpan(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g5(ui6.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo), ui6.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560843vq), g17, str, iVar), string.length() + 1, str3.length(), 18);
            android.widget.TextView textView = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.f5) holder).f285475b;
            if (textView != null) {
                textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            }
            android.widget.TextView textView2 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.f5) holder).f285475b;
            if (textView2 != null) {
                textView2.setClickable(true);
            }
            android.widget.TextView textView3 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.f5) holder).f285475b;
            if (textView3 != null) {
                textView3.setText(newSpannable, android.widget.TextView.BufferType.SPANNABLE);
            }
            mx3.b0 b0Var = mx3.b0.f414061a;
            java.lang.String str4 = str == null ? "" : str;
            java.lang.String r07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r0(iVar.f522831o);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r07, "getUnsignedLongString(...)");
            b0Var.e(f9Var, str4, r07);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgRingtone", "error happened parse msg info");
        }
    }
}
