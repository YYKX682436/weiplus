package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class i3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 f233405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f233406e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f233407f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 c16693xf5eb90b6, long j17, boolean z17) {
        super(0);
        this.f233405d = c16693xf5eb90b6;
        this.f233406e = j17;
        this.f233407f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        long j17;
        int i17;
        boolean z17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 u2Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 u2Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 c16693xf5eb90b6 = this.f233405d;
        if (!((java.util.ArrayList) c16693xf5eb90b6.f233226s).isEmpty()) {
            java.util.ArrayList arrayList = (java.util.ArrayList) c16693xf5eb90b6.f233226s;
            int size = arrayList.size();
            int i18 = 0;
            while (true) {
                j17 = this.f233406e;
                if (i18 > size) {
                    i17 = 0;
                    break;
                }
                i17 = (i18 + size) / 2;
                if (j17 >= ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.v2) arrayList.get(i17)).f233500d) {
                    i18 = i17 + 1;
                    if (i18 >= arrayList.size() || j17 < ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.v2) arrayList.get(i18)).f233500d) {
                        break;
                    }
                } else {
                    size = i17 - 1;
                }
            }
            if (i17 >= 0) {
                if (j17 < 1000 || i17 < 5) {
                    c16693xf5eb90b6.f233229v = false;
                    z17 = true;
                } else {
                    z17 = false;
                }
                int i19 = c16693xf5eb90b6.f233228u;
                boolean z18 = this.f233407f;
                if (i17 != i19) {
                    c16693xf5eb90b6.c(i19, i17);
                    if (c16693xf5eb90b6.f233233z) {
                        c16693xf5eb90b6.h(i17);
                        c16693xf5eb90b6.f233233z = false;
                    } else if (z18) {
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = c16693xf5eb90b6.f233216f;
                        boolean z19 = (c1162x665295de != null ? c1162x665295de.mo7935xa188593e(c16693xf5eb90b6.f233228u) : null) != null;
                        boolean z27 = c16693xf5eb90b6.f233229v;
                        if (!z27 || z19) {
                            p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 o1Var = c16693xf5eb90b6.E;
                            if (o1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.r2) {
                                if (o1Var != null && o1Var.f93586e) {
                                    if (o1Var != null) {
                                        o1Var.f93582a = i17;
                                    }
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicMvCommentView", "1");
                                }
                            }
                            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 lyricRv = c16693xf5eb90b6.getLyricRv();
                            if (lyricRv != null) {
                                lyricRv.f1();
                            }
                            if (z17) {
                                android.content.Context context = c16693xf5eb90b6.getContext();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                                u2Var = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.r2(c16693xf5eb90b6, context);
                            } else {
                                android.content.Context context2 = c16693xf5eb90b6.getContext();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                                u2Var = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.u2(c16693xf5eb90b6, context2);
                            }
                            u2Var.f93582a = i17;
                            c16693xf5eb90b6.E = u2Var;
                            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de2 = c16693xf5eb90b6.f233216f;
                            if (c1162x665295de2 != null) {
                                c1162x665295de2.m8099x6305639d(u2Var);
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicMvCommentView", "2 fastScroll:%b", java.lang.Boolean.valueOf(z17));
                        } else if (!z27 && !z19 && !c16693xf5eb90b6.f233231x) {
                            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 lyricRv2 = c16693xf5eb90b6.getLyricRv();
                            if (lyricRv2 != null) {
                                lyricRv2.f1();
                            }
                            if (z17) {
                                android.content.Context context3 = c16693xf5eb90b6.getContext();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
                                u2Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.r2(c16693xf5eb90b6, context3);
                            } else {
                                android.content.Context context4 = c16693xf5eb90b6.getContext();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
                                u2Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.u2(c16693xf5eb90b6, context4);
                            }
                            u2Var2.f93582a = i17;
                            c16693xf5eb90b6.E = u2Var2;
                            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de3 = c16693xf5eb90b6.f233216f;
                            if (c1162x665295de3 != null) {
                                c1162x665295de3.m8099x6305639d(u2Var2);
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicMvCommentView", "3 fastScroll:%b", java.lang.Boolean.valueOf(z17));
                        }
                    }
                }
                if (!z18) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de4 = c16693xf5eb90b6.f233216f;
                    if ((c1162x665295de4 != null ? c1162x665295de4.mo7935xa188593e(i17) : null) != null) {
                        android.content.Context context5 = c16693xf5eb90b6.getContext();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context5, "getContext(...)");
                        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.s2 s2Var = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.s2(c16693xf5eb90b6, context5);
                        s2Var.f93582a = i17;
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de5 = c16693xf5eb90b6.f233216f;
                        if (c1162x665295de5 != null) {
                            c1162x665295de5.m8099x6305639d(s2Var);
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicMvCommentView", "4");
                    } else {
                        int[] iArr = new int[2];
                        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 lyricRv3 = c16693xf5eb90b6.getLyricRv();
                        if (lyricRv3 != null) {
                            lyricRv3.getLocationInWindow(iArr);
                        }
                        int height = ((int) (c16693xf5eb90b6.getHeight() * com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6.L)) - iArr[1];
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de6 = c16693xf5eb90b6.f233216f;
                        if (c1162x665295de6 != null) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            arrayList2.add(java.lang.Integer.valueOf(height));
                            arrayList2.add(java.lang.Integer.valueOf(i17));
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(c1162x665295de6, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$setCurrentTime$1", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                            c1162x665295de6.P(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue());
                            yj0.a.f(c1162x665295de6, "com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$setCurrentTime$1", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicMvCommentView", "5");
                    }
                }
                c16693xf5eb90b6.f233228u = i17;
            }
        }
        return jz5.f0.f384359a;
    }
}
