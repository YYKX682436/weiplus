package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes2.dex */
public final class k90 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f208592d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k90(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        super(2);
        this.f208592d = c14994x9b99c079;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        android.content.Context context;
        java.lang.String str2;
        int i17;
        int i18;
        android.content.Context context2;
        java.lang.String str3;
        java.lang.String topic = (java.lang.String) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.q0 clickExtra = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.q0) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topic, "topic");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickExtra, "clickExtra");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f208592d;
        clickExtra.f184008d = c14994x9b99c079.getTopicClickExtra().f184008d;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        clickExtra.f184009e = bool;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209539wc;
        ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).l();
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue();
        mu2.b bVar = mu2.b.f412927a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        if (intValue == 1) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c14994x9b99c079.getFeedObject().m76802x2dd01666();
            if (!(m76802x2dd01666 != null && m76802x2dd01666.m76964x7f025288() == 2)) {
                ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
                ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
                android.content.Intent a17 = su4.r2.a();
                a17.putExtra("ftsbizscene", 1013);
                a17.putExtra("ftsType", 14);
                java.util.Map b17 = su4.r2.b(1013, false, 14);
                ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
                long g17 = o13.n.g(1013);
                java.util.HashMap hashMap = (java.util.HashMap) b17;
                hashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, java.lang.String.valueOf(g17));
                hashMap.put("subSessionId", java.lang.String.valueOf(g17));
                hashMap.put("query", tg0.r2.a(1013) ? topic : fp.s0.a(topic));
                a17.putExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, java.lang.String.valueOf(g17));
                a17.putExtra("subSessionId", java.lang.String.valueOf(g17));
                java.lang.ref.WeakReference weakReference = clickExtra.f184008d;
                android.content.Context context3 = weakReference != null ? (android.content.Context) weakReference.get() : null;
                if (context3 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommonService", "jumpSearch try foreground context");
                    context3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Ui();
                }
                android.content.Context context4 = context3;
                if (context4 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommonService", "jumpSearch try no context");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e17 = iyVar.e(context4);
                    if (e17 != null) {
                        if (context4 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0 r0Var = e17.T;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k4 k4Var = r0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k4 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k4) r0Var : null;
                            if (k4Var != null) {
                                k4Var.U0();
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l1 l1Var = e17.f216927x1;
                            if (!(l1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k4)) {
                                l1Var = null;
                            }
                            if (l1Var != null) {
                                l1Var.U0();
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k4 k4Var2 = e17.f216926x0;
                            if (k4Var2 != null) {
                                k4Var2.U0();
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l1 l1Var2 = e17.B1;
                            if (!(l1Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k4)) {
                                l1Var2 = null;
                            }
                            if (l1Var2 != null) {
                                l1Var2.U0();
                            }
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0 a76 = e17.a7(-1);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k4 k4Var3 = a76 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k4 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k4) a76 : null;
                            if (k4Var3 != null) {
                                k4Var3.U0();
                            }
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s3 s3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s3.f206878a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e18 = iyVar.e(context4);
                    if (e18 == null || (str3 = e18.V6().m75945x2fec8307(1)) == null) {
                        str3 = "";
                    }
                    org.json.JSONObject c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s3.c(s3Var, str3, null, 2, null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommonService", "jumpTopicSearch:searchReportInfo:" + c17);
                    java.lang.String str4 = su4.r2.e(b17, 0) + "&thirdExtParam=" + c17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommonService", "searchEntranceLayout url:" + str4);
                    a17.putExtra("rawUrl", str4);
                    a17.putExtra("ftsQuery", topic);
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(clickExtra.f184009e, bool)) {
                        bVar.a(context4, "link_topic_tag", 1, clickExtra.f184005a, 0L, topic);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e19 = iyVar.e(context4);
                    a17.putExtra("key_context_id", e19 != null ? e19.f216915p : null);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e27 = iyVar.e(context4);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s0.f206873b = e27 != null ? e27.f216915p : null;
                    j45.l.z(context4, a17, null);
                }
                return jz5.f0.f384359a;
            }
        }
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        java.lang.Long valueOf = java.lang.Long.valueOf(c14994x9b99c079.f66939xc8a07680);
        java.lang.String m59229xb5af1dd5 = c14994x9b99c079.m59229xb5af1dd5();
        ((c61.p2) ybVar).getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_topic_type", 1);
        intent.putExtra("key_topic_title", topic);
        intent.putExtra("key_ref_object_id", valueOf);
        intent.putExtra("key_ref_object_dup_flag", m59229xb5af1dd5);
        intent.putExtra("key_entrance_type", 2);
        intent.putExtra("key_ref_feed_id", valueOf);
        intent.putExtra("key_ref_feed_dup_flag", m59229xb5af1dd5);
        java.lang.ref.WeakReference weakReference2 = clickExtra.f184008d;
        if (weakReference2 == null || (context2 = (android.content.Context) weakReference2.get()) == null) {
            str = null;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e28 = iyVar.e(context2);
            r45.qt2 V6 = e28 != null ? e28.V6() : null;
            intent.putExtra("key_ref_comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(5)) : null);
            str = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(iyVar, context2, intent, 0L, null, 0, 0, false, 0, null, 508, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        android.content.Context context5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context5, "getContext(...)");
        i0Var.hl(context5, intent);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onclick topic:");
        sb6.append(topic);
        sb6.append(" refObjectId:");
        sb6.append(valueOf != null ? pm0.v.u(valueOf.longValue()) : str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommonService", sb6.toString());
        java.lang.ref.WeakReference weakReference3 = clickExtra.f184008d;
        if (weakReference3 != null && (context = (android.content.Context) weakReference3.get()) != null) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(clickExtra.f184009e, bool)) {
                str2 = str;
                i17 = 1;
                i18 = 0;
                bVar.a(context, "link_topic_tag", 1, clickExtra.f184005a, 0L, topic);
            } else {
                str2 = str;
                i17 = 1;
                i18 = 0;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : str2;
            if (nyVar != 0) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).cj(clickExtra.f184005a, topic, clickExtra.f184007c, 0L, nyVar.f216913n);
                ec2.d e29 = zy2.ra.e2(nyVar, i18, i17, str2);
                if (e29 != null) {
                    e29.a(new ec2.a(18, clickExtra.f184005a, clickExtra.f184006b));
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
