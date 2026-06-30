package df2;

/* loaded from: classes3.dex */
public final class gb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.zb f311742d;

    public gb(df2.zb zbVar) {
        this.f311742d = zbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        df2.v0 v0Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa0;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m77226x96bac258;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622;
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveAnchorAiAssistantBannerController$onViewMount$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.zb zbVar = this.f311742d;
        r45.ff1 ff1Var = zbVar.f313477r;
        if ((ff1Var != null && ff1Var.m75939xb282bd08(7) == 4) == false) {
            zbVar.u7();
            df2.zb.w7(zbVar, false, null, 2, null);
        }
        r45.ff1 ff1Var2 = zbVar.f313477r;
        if ((ff1Var2 != null && ff1Var2.m75939xb282bd08(7) == 4) == true) {
            r45.ff1 ff1Var3 = zbVar.f313477r;
            if (ff1Var3 != null) {
                ff1Var3.set(2, ff1Var3.m75945x2fec8307(8));
            }
            r45.ff1 ff1Var4 = zbVar.f313477r;
            if (ff1Var4 != null) {
                ff1Var4.set(4, "");
            }
            zbVar.y7();
            r45.n72 n72Var = r45.n72.kActionType_AiassistantFeedBack;
            r45.ff1 ff1Var5 = zbVar.f313477r;
            if (ff1Var5 == null || (str2 = ff1Var5.m75945x2fec8307(0)) == null) {
                str2 = "";
            }
            zbVar.s7(n72Var, 0, str2);
        } else {
            r45.ff1 ff1Var6 = zbVar.f313477r;
            if ((ff1Var6 != null && ff1Var6.m75939xb282bd08(7) == 2) == true) {
                r45.ff1 ff1Var7 = zbVar.f313477r;
                if (ff1Var7 != null && (c19786x6a1e28622 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) ff1Var7.m75936x14adae67(3)) != null) {
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    android.content.Context O6 = zbVar.O6();
                    xc2.y2 y2Var = xc2.y2.f534876a;
                    xc2.p0 p0Var = new xc2.p0(c19786x6a1e28622);
                    p0Var.f534785n = 0;
                    xc2.y2.i(y2Var, O6, p0Var, 0, null, 8, null);
                }
            } else {
                r45.ff1 ff1Var8 = zbVar.f313477r;
                if ((ff1Var8 != null && ff1Var8.m75939xb282bd08(7) == 3) != false) {
                    r45.u84 u84Var = new r45.u84();
                    r45.ff1 ff1Var9 = zbVar.f313477r;
                    byte[] g17 = (ff1Var9 == null || (c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) ff1Var9.m75936x14adae67(3)) == null || (m76506x42318aa0 = c19786x6a1e2862.m76506x42318aa0()) == null || (m77226x96bac258 = m76506x42318aa0.m77226x96bac258()) == null) ? null : m77226x96bac258.g();
                    if (g17 != null) {
                        try {
                            u84Var.mo11468x92b714fd(g17);
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                        }
                    }
                    int m75939xb282bd08 = u84Var.m75939xb282bd08(0);
                    if (m75939xb282bd08 == 1) {
                        android.os.Bundle bundle = new android.os.Bundle();
                        r45.ff1 ff1Var10 = zbVar.f313477r;
                        bundle.putString("PARAM_FINDER_LIVE_AI_ASSISTANT_ID", ff1Var10 != null ? ff1Var10.m75945x2fec8307(0) : null);
                        zbVar.X6(qo0.b.f446915m2, bundle);
                        r45.d22 d22Var = new r45.d22();
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = u84Var.m75934xbce7f2f(1);
                        byte[] g18 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
                        if (g18 != null) {
                            try {
                                d22Var.mo11468x92b714fd(g18);
                            } catch (java.lang.Exception e18) {
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e18);
                            }
                        }
                        if (((mm2.c1) zbVar.m56788xbba4bfc0(mm2.c1.class)).Z6().b(dk2.q.e(d22Var)).f384366d == null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(zbVar, null, null, new df2.za(zbVar, d22Var, null), 3, null);
                        }
                    } else if (m75939xb282bd08 == 2) {
                        android.os.Bundle bundle2 = new android.os.Bundle();
                        bundle2.putByteArray("PARAM_LIVE_AI_ASSISTANT_INFO", u84Var.mo14344x5f01b1f6());
                        r45.ff1 ff1Var11 = zbVar.f313477r;
                        bundle2.putString("PARAM_FINDER_LIVE_AI_ASSISTANT_ID", ff1Var11 != null ? ff1Var11.m75945x2fec8307(0) : null);
                        zbVar.X6(qo0.b.K4, bundle2);
                    } else if (m75939xb282bd08 == 3) {
                        android.os.Bundle bundle3 = new android.os.Bundle();
                        bundle3.putInt("PARAM_FINDER_LIVE_SHOW_APPLY_LIST_INDEX", 1);
                        r45.ff1 ff1Var12 = zbVar.f313477r;
                        bundle3.putString("PARAM_FINDER_LIVE_AI_ASSISTANT_ID", ff1Var12 != null ? ff1Var12.m75945x2fec8307(0) : null);
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f2 = u84Var.m75934xbce7f2f(2);
                        bundle3.putByteArray("PARAM_FINDER_LIVE_AI_ASSISTANT_JUMP_INFO_BUFFER", m75934xbce7f2f2 != null ? m75934xbce7f2f2.g() : null);
                        zbVar.X6(qo0.b.G3, bundle3);
                    } else if (m75939xb282bd08 == 4 && (v0Var = (df2.v0) zbVar.m56789x25fe639c(df2.v0.class)) != null) {
                        r45.ff1 ff1Var13 = zbVar.f313477r;
                        v0Var.f7(ff1Var13 != null ? ff1Var13.m75945x2fec8307(0) : null);
                    }
                }
            }
        }
        zbVar.q7(4);
        r45.n72 n72Var2 = r45.n72.kActionType_AiassistantClicked;
        int m75939xb282bd082 = ff1Var != null ? ff1Var.m75939xb282bd08(7) : 0;
        if (ff1Var == null || (str = ff1Var.m75945x2fec8307(2)) == null) {
            str = "";
        }
        zbVar.s7(n72Var2, m75939xb282bd082, str);
        zbVar.s7(r45.n72.kActionType_AiassistantClose, 4, "");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveAnchorAiAssistantBannerController$onViewMount$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
