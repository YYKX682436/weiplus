package com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic;

/* loaded from: classes8.dex */
public final class q extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final db0.e f148898e;

    public q(db0.e eVar) {
        this.f148898e = eVar;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.elj;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.o item = (com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.o) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        db0.e eVar = this.f148898e;
        if (eVar != null) {
            eVar.a(item, i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21 c12474x8b872a21 = item.f148896d;
        java.lang.String str = c12474x8b872a21.f167788d.f167798g;
        if (str != null) {
            android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.h5n);
            n11.a b17 = n11.a.b();
            java.lang.Object mo141623x754a37bb = ((jz5.n) com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.v.f148909f).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            b17.h(str, imageView, (o11.g) mo141623x754a37bb);
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.obc);
        if (textView != null) {
            java.lang.String functionDesc = c12474x8b872a21.f167791g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(functionDesc, "functionDesc");
            textView.setText(r26.n0.u0(functionDesc).toString());
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f565583cu2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2 c12475x7cfc32b2 = c12474x8b872a21.f167788d;
        if (textView2 != null) {
            textView2.setText(c12475x7cfc32b2.f167800i);
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.vlt);
        int i19 = c12475x7cfc32b2.f167796e;
        if (i19 == 1) {
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            if (textView3 == null) {
                return;
            }
            textView3.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ob7));
            return;
        }
        if (i19 != 2) {
            if (textView3 == null) {
                return;
            }
            textView3.setVisibility(8);
        } else {
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            if (textView3 == null) {
                return;
            }
            textView3.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ob6));
        }
    }
}
