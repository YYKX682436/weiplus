package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class j0 {
    public j0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a(android.content.Context context, so2.y0 commentItem, java.lang.String feedUsername, boolean z17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentItem, "commentItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedUsername, "feedUsername");
        if (z17) {
            if ((((xy2.c.e(context).length() > 0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(xy2.c.e(context), str)) || commentItem.f492236d.c1(context)) && !commentItem.f492236d.j1()) {
                return true;
            }
        } else if ((commentItem.f492236d.c1(context) || hc2.l.g(feedUsername)) && !commentItem.f492236d.j1()) {
            return true;
        }
        return false;
    }
}
