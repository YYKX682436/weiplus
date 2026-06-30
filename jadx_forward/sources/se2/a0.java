package se2;

/* loaded from: classes3.dex */
public final class a0 implements lm2.o {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb f488365a;

    /* renamed from: b, reason: collision with root package name */
    public long f488366b;

    public a0(android.content.Context context, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb plugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        this.f488365a = plugin;
    }

    public final void a(boolean z17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb tbVar = this.f488365a;
        if (tbVar.u1() > 0) {
            if (z17) {
                tbVar.t1().post(new se2.x(this));
            } else if (j17 > 0) {
                ((se2.e0) ((jz5.n) tbVar.f195911z).mo141623x754a37bb()).b(j17);
            }
        }
    }

    public final p012xc85e97e9.p093xedfae76a.c1 b(java.lang.Class bu6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bu6, "bu");
        return this.f488365a.S0().a(bu6);
    }

    public final void c(java.lang.Boolean bool) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb tbVar = this.f488365a;
        d(tbVar.u1() - 1, bool);
        this.f488366b = tbVar.u1();
        ((mm2.e0) b(mm2.e0.class)).V6(0);
    }

    public final void d(int i17, java.lang.Boolean bool) {
        int i18 = i17;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb tbVar = this.f488365a;
        if (b17) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 t17 = tbVar.t1();
            int u17 = tbVar.u1() - 1;
            if (i18 > u17) {
                i18 = u17;
            }
            if (i18 < 0) {
                i18 = 0;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(t17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/comment/BoxCommentListPresenter", "commentScrollToPos", "(ILjava/lang/Boolean;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            t17.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(t17, "com/tencent/mm/plugin/finder/live/comment/BoxCommentListPresenter", "commentScrollToPos", "(ILjava/lang/Boolean;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            return;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 t18 = tbVar.t1();
        int u18 = tbVar.u1() - 1;
        if (i18 > u18) {
            i18 = u18;
        }
        if (i18 < 0) {
            i18 = 0;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(t18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/comment/BoxCommentListPresenter", "commentScrollToPos", "(ILjava/lang/Boolean;)V", "Undefined", "scrollToPosition", "(I)V");
        t18.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(t18, "com/tencent/mm/plugin/finder/live/comment/BoxCommentListPresenter", "commentScrollToPos", "(ILjava/lang/Boolean;)V", "Undefined", "scrollToPosition", "(I)V");
    }

    public void e(lm2.t notifyMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notifyMsg, "notifyMsg");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyRemove commentListVisible:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb tbVar = this.f488365a;
        sb6.append(tbVar.f195904s);
        sb6.append(" size:");
        sb6.append(tbVar.u1());
        sb6.append(' ');
        sb6.append(notifyMsg);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BoxCommentListPresenter", sb6.toString());
        tbVar.x1("notifyRemoveInfo", notifyMsg);
        if (tbVar.f195904s) {
            boolean g17 = g();
            if (!g17) {
                h(notifyMsg, true);
            }
            long u17 = tbVar.u1() - this.f488366b;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = tbVar.f195908w;
            if (c22848x6ddd90cf != null) {
                c22848x6ddd90cf.m8154xdb81fc7f(notifyMsg.f400982a, notifyMsg.f400983b);
            }
            a(g17, u17);
        }
    }

    public void f(lm2.t notifyMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notifyMsg, "notifyMsg");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("boxCommentLikeTrack notifyUpdate commentListVisible:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb tbVar = this.f488365a;
        sb6.append(tbVar.f195904s);
        sb6.append(" notifyUpdate size:");
        sb6.append(tbVar.u1());
        sb6.append(' ');
        sb6.append(notifyMsg);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BoxCommentListPresenter", sb6.toString());
        tbVar.x1("notifyUpdateInfo", notifyMsg);
        if (tbVar.f195904s) {
            zl2.r4.f555483a.M2("BoxCommentListPresenter", "boxCommentLikeTrack notifyUpdate size:" + tbVar.u1() + ' ' + notifyMsg);
            boolean g17 = g();
            long u17 = ((long) tbVar.u1()) - this.f488366b;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = tbVar.f195908w;
            if (c22848x6ddd90cf != null) {
                c22848x6ddd90cf.m8152xc67946d3(notifyMsg.f400982a, notifyMsg.f400983b, notifyMsg.f400984c);
            }
            a(g17, u17);
        }
    }

    public final boolean g() {
        return ((mm2.e0) b(mm2.e0.class)).f410506p && !com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.oc.f214314a.b();
    }

    public final void h(lm2.t tVar, boolean z17) {
        java.util.List m82898xfb7e5820;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb tbVar = this.f488365a;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = tbVar.f195908w;
        if (c22848x6ddd90cf == null || (m82898xfb7e5820 = c22848x6ddd90cf.m82898xfb7e5820()) == null) {
            return;
        }
        try {
            int i17 = tVar.f400982a;
            int i18 = tVar.f400983b + i17;
            if (z17) {
                int i19 = ((mm2.e0) b(mm2.e0.class)).f410508r;
                if (i17 <= i19 && i19 < i18) {
                    ((mm2.e0) b(mm2.e0.class)).V6(0);
                }
            } else if (((mm2.e0) b(mm2.e0.class)).f410508r <= 0) {
                int u17 = tbVar.u1();
                if (i18 > u17) {
                    i18 = u17;
                }
                for (int i27 = tVar.f400982a; i27 < i18; i27++) {
                    if (zl2.r4.f555483a.y((lm2.c) m82898xfb7e5820.get(i27))) {
                        ((mm2.e0) b(mm2.e0.class)).V6(i27);
                        break;
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "updateAtMeMsg");
        }
    }
}
