package fk2;

/* loaded from: classes3.dex */
public final class s2 extends fk2.n2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(we2.a commentItemDependency) {
        super(commentItemDependency);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentItemDependency, "commentItemDependency");
    }

    @Override // we2.o
    public void d(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17) {
        java.lang.String string;
        android.text.SpannableString spannableString;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        boolean z17 = true;
        boolean z18 = false;
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(msg.a(), c01.z1.r()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(msg.a(), xy2.c.e(context));
        android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.c4d);
        drawable.setBounds(0, 0, ((java.lang.Number) ((jz5.n) this.f526775c).mo141623x754a37bb()).intValue(), ((java.lang.Number) ((jz5.n) this.f526776d).mo141623x754a37bb()).intValue());
        al5.w wVar = new al5.w(drawable, 1);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder("  ");
        spannableStringBuilder.setSpan(wVar, 0, 1, 33);
        if (z19) {
            string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dsx);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            z17 = false;
        } else {
            string = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526773a.w(), msg.a()) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dsj) : zl2.r4.D0(zl2.r4.f555483a, msg.a(), msg.k(), false, 4, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        }
        java.lang.String string2 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dsi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(string, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dsx))) {
            spannableString = new android.text.SpannableString(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dsw, string2));
        } else {
            z18 = z17;
            spannableString = new android.text.SpannableString(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dsv, string, string2));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = holder.f103460e;
        c22624x85d69039.setTag(com.p314xaae8f345.mm.R.id.f565945e65, spannableString);
        c22624x85d69039.setTag(com.p314xaae8f345.mm.R.id.e68, string2);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(c22624x85d69039, "finder_live_comment_red_packet");
        if (msg instanceof dk2.la) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(c22624x85d69039, 8, 25561);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(c22624x85d69039, new fk2.q2(msg));
        }
        if (z18) {
            str = string2;
            int L = r26.n0.L(spannableString, string, 0, false, 6, null);
            if (L >= 0 && string.length() + L <= spannableString.length()) {
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560755ta)), L, string.length() + L, 33);
            }
        } else {
            str = string2;
        }
        int L2 = r26.n0.L(spannableString, str, 0, false, 6, null);
        if (L2 >= 0 && str.length() + L2 <= spannableString.length()) {
            spannableString.setSpan(new fk2.r2(msg, this, context), L2, str.length() + L2, 33);
        }
        spannableStringBuilder.append((java.lang.CharSequence) spannableString);
        c22624x85d69039.b(spannableStringBuilder);
        c22624x85d69039.m84185x3abfd950(this.f526780h);
        holder.f103462g.setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a1k));
    }

    @Override // we2.o
    public dk2.zf e(r45.ch1 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return new dk2.la(msg);
    }

    @Override // we2.o
    public int n() {
        return 20019;
    }
}
