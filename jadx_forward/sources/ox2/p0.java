package ox2;

/* loaded from: classes2.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f431235a = new int[2];

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, in5.s0 s0Var) {
        if (!b(qeVar)) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e c15408x626e05e = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e) s0Var.p(com.p314xaae8f345.mm.R.id.tfm);
        if (c15408x626e05e != null) {
            return c15408x626e05e;
        }
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedFullConvert+InteractionEasterEgg", "getEasterEggCenter: inflate");
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(s0Var.f374654e).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e5r, (android.view.ViewGroup) null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e c15408x626e05e2 = inflate instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e) inflate : null;
            if (c15408x626e05e2 != null) {
                try {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.jdk);
                    if (viewGroup != null) {
                        viewGroup.addView(c15408x626e05e2);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedFullConvert+InteractionEasterEgg", "getEasterEggCenter: addView");
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    c15408x626e05e = c15408x626e05e2;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderFeedFullConvert+InteractionEasterEgg", "getEasterEggCenter: " + th);
                    return c15408x626e05e;
                }
            }
            return c15408x626e05e2;
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public static final boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qeVar, "<this>");
        return (qeVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.df) || (qeVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bh);
    }

    public static final boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, in5.s0 holder) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e c15408x626e05e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qeVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        return b(qeVar) && (c15408x626e05e = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e) holder.p(com.p314xaae8f345.mm.R.id.tfm)) != null && c15408x626e05e.getEmojiDownloadComplete();
    }

    public static final void d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item) {
        r45.t11 t11Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qeVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (b(qeVar)) {
            r45.dm2 m76806xdef68064 = item.getFeedObject().getFeedObject().m76806xdef68064();
            r45.ri0 ri0Var = (m76806xdef68064 == null || (t11Var = (r45.t11) m76806xdef68064.m75936x14adae67(60)) == null) ? null : (r45.ri0) t11Var.m75936x14adae67(1);
            if (ri0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedFullConvert+InteractionEasterEgg", item.mo2128x1ed62e84() + " 没有可用的彩蛋");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedFullConvert+InteractionEasterEgg", item.mo2128x1ed62e84() + " 有可用的彩蛋");
            }
            java.lang.Object tag = holder.f3639x46306858.getTag(com.p314xaae8f345.mm.R.id.tbw);
            java.lang.Runnable runnable = tag instanceof java.lang.Runnable ? (java.lang.Runnable) tag : null;
            if (runnable != null) {
                holder.f3639x46306858.removeCallbacks(runnable);
            }
            holder.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.tbw, null);
            ox2.o0 o0Var = new ox2.o0(holder, item.mo2128x1ed62e84(), qeVar, item, ri0Var);
            holder.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.tbw, o0Var);
            android.view.View view = holder.f3639x46306858;
            cq.k1.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            view.postDelayed(o0Var, ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209448rb).mo141623x754a37bb()).r()).intValue());
        }
    }
}
