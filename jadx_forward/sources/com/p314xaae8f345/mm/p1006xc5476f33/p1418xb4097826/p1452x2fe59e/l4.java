package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class l4 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f188807d;

    public l4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var) {
        this.f188807d = a7Var;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        int intValue;
        int intValue2;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82798x4905e9fa;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var = this.f188807d;
        a7Var.getClass();
        if (intent == null || i18 != 0) {
            yw2.a0 a0Var = a7Var.f187749o;
            if (a0Var != null) {
                a0Var.t();
                return;
            }
            return;
        }
        long j17 = 0;
        long longExtra = intent.getLongExtra("lastSentCommentIdKey", 0L);
        long longExtra2 = intent.getLongExtra("lastSentCommentRootIdKey", 0L);
        long longExtra3 = intent.getLongExtra("lastViewedCommentIdKey", 0L);
        a7Var.f187746l1 = longExtra3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.y yVar = a7Var.f187743g;
        if (longExtra3 != 0) {
            if (longExtra3 != 0) {
                yw2.a0 a0Var2 = a7Var.f187749o;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = (a0Var2 == null || (m82798x4905e9fa = a0Var2.k().m82798x4905e9fa()) == null) ? null : m82798x4905e9fa.getLayoutManager();
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
                java.lang.Integer valueOf = c1162x665295de != null ? java.lang.Integer.valueOf(c1162x665295de.w()) : null;
                java.lang.Integer valueOf2 = c1162x665295de != null ? java.lang.Integer.valueOf(c1162x665295de.y()) : null;
                if (valueOf != null && valueOf2 != null && valueOf.intValue() <= valueOf2.intValue() && kz5.c0.g(yVar.f190002d).m(valueOf.intValue())) {
                    java.util.ArrayList arrayList = yVar.f190002d;
                    if (kz5.c0.g(arrayList).m(valueOf2.intValue()) && (intValue = valueOf.intValue()) <= (intValue2 = valueOf2.intValue())) {
                        while (true) {
                            so2.y0 y0Var = (so2.y0) kz5.n0.a0(arrayList, intValue);
                            if (!(y0Var != null && y0Var.mo2128x1ed62e84() == longExtra3)) {
                                if (intValue == intValue2) {
                                    break;
                                } else {
                                    intValue++;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
                yw2.a0 a0Var3 = a7Var.f187749o;
                if (a0Var3 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.u6 u6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.u6(a7Var, longExtra3, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x6 x6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x6(a7Var, longExtra3);
                    if (a0Var3.D == null) {
                        android.view.ViewParent parent = a0Var3.s().getParent();
                        p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a = parent instanceof p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a ? (p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a) parent : null;
                        if (c1081xa22a3e5a == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.TimelineDrawerBuilder", "父布局不是CoordinatorLayout，无法插入定位标！！");
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15304x8ca13bae c15304x8ca13bae = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15304x8ca13bae(a0Var3.l());
                            c1081xa22a3e5a.addView(c15304x8ca13bae);
                            android.view.ViewGroup.LayoutParams layoutParams = c15304x8ca13bae.getLayoutParams();
                            p012xc85e97e9.p073xee01125a.p074xd1075a44.c cVar = layoutParams instanceof p012xc85e97e9.p073xee01125a.p074xd1075a44.c ? (p012xc85e97e9.p073xee01125a.p074xd1075a44.c) layoutParams : null;
                            if (cVar != null) {
                                cVar.f92541c = 85;
                            }
                            com.p314xaae8f345.mm.ui.kk.d(c15304x8ca13bae, (int) a0Var3.l().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
                            java.lang.String string = a0Var3.l().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nk7);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                            c15304x8ca13bae.m62123x53bfe316(string);
                            c15304x8ca13bae.setOnClickListener(new yw2.x(a0Var3, x6Var));
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15304x8ca13bae.c(c15304x8ca13bae, null, 1, null);
                            p3325xe03a0797.p3326xc267989b.y0 a17 = v65.m.a(c1081xa22a3e5a);
                            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                            p3325xe03a0797.p3326xc267989b.l.d(a17, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new yw2.y(u6Var, a0Var3, c15304x8ca13bae, null), 2, null);
                            a0Var3.D = c15304x8ca13bae;
                        }
                    }
                }
            }
            if (longExtra != j17 || longExtra2 == j17) {
            }
            int e17 = yVar.e(longExtra);
            if (e17 == -1) {
                a7Var.w0(longExtra);
                return;
            } else if (yVar.e(longExtra2) == -1) {
                a7Var.w0(longExtra);
                return;
            } else {
                a7Var.A0(e17);
                return;
            }
        }
        yw2.a0 a0Var4 = a7Var.f187749o;
        if (a0Var4 != null) {
            a0Var4.t();
        }
        j17 = 0;
        if (longExtra != j17) {
        }
    }
}
