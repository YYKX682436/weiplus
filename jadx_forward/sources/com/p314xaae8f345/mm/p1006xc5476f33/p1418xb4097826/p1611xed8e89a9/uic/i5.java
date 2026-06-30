package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class i5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14889x51ce1ce f205316d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14889x51ce1ce c14889x51ce1ce) {
        super(1);
        this.f205316d = c14889x51ce1ce;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13888xeed42a34 m58666xf0438b47;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f m58673x96811f7a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f m58673x96811f7a2;
        android.view.View view;
        float m58685x13f4d26;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13888xeed42a34 m58666xf0438b472;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f m58673x96811f7a3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13888xeed42a34 m58666xf0438b473;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f m58673x96811f7a4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13888xeed42a34 m58666xf0438b474;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa) obj, "<anonymous parameter 0>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[fetchEndCallback] totalSize=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14889x51ce1ce c14889x51ce1ce = this.f205316d;
        m58666xf0438b47 = c14889x51ce1ce.m58666xf0438b47();
        sb6.append(m58666xf0438b47.m56393xfb854877());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ProfileFeedUIC", sb6.toString());
        m58673x96811f7a = c14889x51ce1ce.m58673x96811f7a();
        m58673x96811f7a.E(true);
        m58673x96811f7a2 = c14889x51ce1ce.m58673x96811f7a();
        on5.c m82923x19404fcc = m58673x96811f7a2.m82923x19404fcc();
        if (m82923x19404fcc != null && (view = m82923x19404fcc.getView()) != null) {
            android.content.Context context = view.getContext();
            m58685x13f4d26 = c14889x51ce1ce.m58685x13f4d26();
            int a17 = ym5.x.a(context, m58685x13f4d26);
            if (c14889x51ce1ce.m58720x17be6422()) {
                m58666xf0438b473 = c14889x51ce1ce.m58666xf0438b47();
                if (m58666xf0438b473.m56393xfb854877() > 0) {
                    m58673x96811f7a4 = c14889x51ce1ce.m58673x96811f7a();
                    m58673x96811f7a4.C(ym5.x.a(view.getContext(), 120.0f) + a17);
                    android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.hpy);
                    if (findViewById != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$onCreate$15", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$onCreate$15", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.View findViewById2 = findViewById.findViewById(com.p314xaae8f345.mm.R.id.oas);
                        if (findViewById2 != null) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            arrayList2.add(0);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$onCreate$15", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$onCreate$15", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).f206750p) {
                                m58666xf0438b474 = c14889x51ce1ce.m58666xf0438b47();
                                if (m58666xf0438b474.m56393xfb854877() > 0) {
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).f206751q = true;
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).f206750p = true;
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                                    android.content.Context context2 = findViewById2.getContext();
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                                    o3Var.Lk(context2, false, true);
                                }
                            }
                            findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.h5(c14889x51ce1ce));
                        }
                    }
                }
            }
            m58666xf0438b472 = c14889x51ce1ce.m58666xf0438b47();
            if (m58666xf0438b472.m56393xfb854877() <= 0) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$onCreate$15", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$onCreate$15", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                m58673x96811f7a3 = c14889x51ce1ce.m58673x96811f7a();
                m58673x96811f7a3.C(ym5.x.a(view.getContext(), 120.0f) + a17);
            }
        }
        return jz5.f0.f384359a;
    }
}
