package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class mm extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.um f188923d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mm(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.um umVar) {
        super(0);
        this.f188923d = umVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56022x4905e9fa;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56022x4905e9fa2;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56022x4905e9fa3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.um umVar = this.f188923d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var = umVar.f188690f;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = (a1Var == null || (m56022x4905e9fa3 = a1Var.m56022x4905e9fa()) == null) ? null : m56022x4905e9fa3.getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1 = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) layoutManager : null;
        ey2.o0 o0Var = umVar.f192358n;
        if (o0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var2 = umVar.f188690f;
            java.lang.Object mo7946xf939df19 = (a1Var2 == null || (m56022x4905e9fa2 = a1Var2.m56022x4905e9fa()) == null) ? null : m56022x4905e9fa2.mo7946xf939df19();
            in5.n0 n0Var = mo7946xf939df19 instanceof in5.n0 ? (in5.n0) mo7946xf939df19 : null;
            int a07 = (n0Var != null ? n0Var.a0() : 0) + o0Var.f338978e;
            int i17 = o0Var.f338979f;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("TimelineInit initdone canTimelineRefresh tabType=");
            int i18 = umVar.f192356i;
            sb6.append(i18);
            sb6.append(" lastPos:");
            sb6.append(a07);
            sb6.append(" fromTopPixel:");
            sb6.append(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNativeDramaGridUIContract.Presenter", sb6.toString());
            if (a07 > 0) {
                if (c1164x587b7ff1 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(a07));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(c1164x587b7ff1, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderNativeDramaGridUIContract$Presenter$1$call$1", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
                    c1164x587b7ff1.mo2420xc593c771(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(c1164x587b7ff1, "com/tencent/mm/plugin/finder/feed/FinderNativeDramaGridUIContract$Presenter$1$call$1", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var3 = umVar.f188690f;
                if (a1Var3 != null && (m56022x4905e9fa = a1Var3.m56022x4905e9fa()) != null) {
                    m56022x4905e9fa.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.lm(c1164x587b7ff1, a07, i17));
                }
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = umVar.f192360p;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(i18);
            sb7.append('_');
            sb7.append(umVar.f188689e.m56393xfb854877());
            ym5.s3 s3Var = (ym5.s3) concurrentHashMap.get(sb7.toString());
            if (s3Var != null && !s3Var.f545054f) {
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rm(umVar, s3Var, false));
            }
        }
        return jz5.f0.f384359a;
    }
}
