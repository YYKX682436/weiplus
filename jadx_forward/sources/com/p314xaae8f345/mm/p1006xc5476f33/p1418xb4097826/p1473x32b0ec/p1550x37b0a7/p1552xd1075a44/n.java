package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44;

/* loaded from: classes10.dex */
public final class n extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public r45.b04 f202275e;

    public n(r45.b04 b04Var) {
        this.f202275e = b04Var;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e_s;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        ln2.c item = (ln2.c) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.tjn);
        r45.b04 b04Var = item.f401410d;
        if (textView != null) {
            android.content.Context context = holder.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            int i19 = b04Var.f451927d;
            if (i19 == 1) {
                str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oqu);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
            } else if (i19 == 2) {
                str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oqt);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
            } else if (i19 == 3) {
                str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oqv);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("InteractionWishDataHelper", "getInteractionTypeText: unknown interactionType=" + i19 + ", using defaultString=\"\"");
                str = "";
            }
            textView.setText(str);
        }
        ((android.widget.LinearLayout) holder.p(com.p314xaae8f345.mm.R.id.tjo)).setVisibility(b04Var == this.f202275e ? 0 : 8);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
