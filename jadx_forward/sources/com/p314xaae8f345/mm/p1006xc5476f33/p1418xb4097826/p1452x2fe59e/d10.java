package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class d10 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f188066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 f188067e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f188068f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d10(ym5.s3 s3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 r10Var, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        super(0);
        this.f188066d = s3Var;
        this.f188067e = r10Var;
        this.f188068f = abstractActivityC21394xb3d2c0cf;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00;
        ym5.s3 s3Var = this.f188066d;
        java.lang.Object obj = s3Var.f545053e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader.TopicResponse");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f9 f9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.f9) obj;
        int i17 = s3Var.f545050b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 r10Var = this.f188067e;
        if (i17 != -1) {
            if (s3Var.f545049a == 3) {
                java.lang.String str = r10Var.f190398i;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refresh incrementCount ");
                java.util.List m56409x97891cf7 = f9Var.m56409x97891cf7();
                sb6.append(m56409x97891cf7 != null ? java.lang.Integer.valueOf(m56409x97891cf7.size()) : null);
                sb6.append(", totalCount ");
                sb6.append(f9Var.f189395b);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                r10Var.f190404r = f9Var.f189395b;
                r10Var.f190405s = f9Var.f189399f;
                r10Var.f190406t = f9Var.getBgmInfo();
                r10Var.f190407u = f9Var.f189400g;
                r10Var.f190408v = f9Var.f189401h;
                r45.r03 r03Var = f9Var.f189394a;
                r10Var.getClass();
                long j17 = r10Var.f190400n;
                if (j17 == 0) {
                    if (r03Var != null) {
                        j17 = r03Var.m75942xfb822ef2(1);
                    }
                    r10Var.f190400n = j17;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var = r10Var.f188690f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(a1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract.TopicFeedViewCallback");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10 x10Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10) a1Var;
                r45.xn5 xn5Var = f9Var.f189396c;
                if (xn5Var != null && !xn5Var.m75941xfb821914(0).isEmpty()) {
                    so2.v vVar = x10Var.L;
                    vVar.getClass();
                    vVar.f492176d = xn5Var;
                    in5.n0.j0(x10Var.o(), vVar.hashCode(), false, 2, null);
                    in5.n0.S(x10Var.o(), vVar, false, 2, null);
                }
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f188068f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                if (nyVar != null) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("topic", r10Var.f190401o);
                        jSONObject.put("type", r10Var.f190399m);
                        jSONObject.put("count", r10Var.f190404r);
                    } catch (java.lang.Exception unused) {
                    }
                    java.lang.String jSONObject2 = jSONObject.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                    nyVar.f216924w = jSONObject2;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0 a76 = nyVar.a7(-1);
                    if (a76 != null) {
                        a76.P0(nyVar.V6());
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var2 = r10Var.f188690f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(a1Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract.TopicFeedViewCallback");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10 x10Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10) a1Var2;
                java.lang.String str2 = f9Var.f189397d;
                long j18 = r10Var.f190404r;
                int errCode = f9Var.getErrCode();
                java.lang.String errMsg = f9Var.getErrMsg();
                x10Var2.H = r03Var;
                long j19 = x10Var2.I;
                if (j19 == 0) {
                    if (r03Var != null) {
                        j19 = r03Var.m75942xfb822ef2(1);
                    }
                    x10Var2.I = j19;
                }
                int i18 = x10Var2.D;
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = x10Var2.f187707d;
                if (i18 == 4) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 r10Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10) x10Var2.z();
                    if ((2 & r10Var2.f190407u) == 1 || r10Var2.f190408v > 0) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(" musicInfo = null ,bgmInfo?.contact = ");
                        r45.o03 o03Var = r10Var2.f190406t;
                        sb7.append(o03Var != null ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) o03Var.m75936x14adae67(0) : null);
                        sb7.append(", totalCount = ");
                        sb7.append(r10Var2.f190404r);
                        java.lang.String sb8 = sb7.toString();
                        java.lang.String str3 = x10Var2.f192559w;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb8);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "Type_Follow , falg = " + ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10) x10Var2.z()).f190407u);
                        android.view.View findViewById = abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.oah);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "refreshHeaderContent", "(Ljava/lang/String;JLcom/tencent/mm/protocal/protobuf/FinderTopicInfo;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "refreshHeaderContent", "(Ljava/lang/String;JLcom/tencent/mm/protocal/protobuf/FinderTopicInfo;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.View findViewById2 = abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.m6e);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "refreshHeaderContent", "(Ljava/lang/String;JLcom/tencent/mm/protocal/protobuf/FinderTopicInfo;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "refreshHeaderContent", "(Ljava/lang/String;JLcom/tencent/mm/protocal/protobuf/FinderTopicInfo;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.View findViewById3 = abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.f565486cj5);
                        if (findViewById3 != null) {
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            arrayList3.add(8);
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "refreshHeaderContent", "(Ljava/lang/String;JLcom/tencent/mm/protocal/protobuf/FinderTopicInfo;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "refreshHeaderContent", "(Ljava/lang/String;JLcom/tencent/mm/protocal/protobuf/FinderTopicInfo;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        r45.o03 o03Var2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10) x10Var2.z()).f190406t;
                        if ((o03Var2 != null ? (r45.zi2) o03Var2.m75936x14adae67(1) : null) == null) {
                            ((android.widget.TextView) abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.cti)).setText(abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cmb));
                        } else {
                            ((android.widget.TextView) abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.cti)).setText(abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573475eq3));
                        }
                    } else {
                        android.view.View findViewById4 = abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.f565486cj5);
                        if (findViewById4 != null) {
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                            arrayList4.add(0);
                            java.util.Collections.reverse(arrayList4);
                            yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "refreshHeaderContent", "(Ljava/lang/String;JLcom/tencent/mm/protocal/protobuf/FinderTopicInfo;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "refreshHeaderContent", "(Ljava/lang/String;JLcom/tencent/mm/protocal/protobuf/FinderTopicInfo;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        android.view.View view = x10Var2.f192560x;
                        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ogu) : null;
                        r45.o03 o03Var3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10) x10Var2.z()).f190406t;
                        if ((o03Var3 != null ? (r45.zi2) o03Var3.m75936x14adae67(1) : null) == null) {
                            if (textView != null) {
                                textView.setText(abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cxj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.h(j18)));
                            }
                        } else if (textView != null) {
                            textView.setText(abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cxu, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.h(j18)));
                        }
                        if (j18 == 0) {
                            if (textView != null) {
                                textView.setVisibility(4);
                            }
                            android.view.View view2 = x10Var2.f192560x;
                            android.widget.TextView textView2 = view2 != null ? (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.dzx) : null;
                            if (textView2 != null) {
                                textView2.setVisibility(0);
                            }
                        }
                    }
                } else {
                    android.view.View view3 = x10Var2.f192560x;
                    android.widget.TextView textView3 = view3 != null ? (android.widget.TextView) view3.findViewById(com.p314xaae8f345.mm.R.id.ogu) : null;
                    if (textView3 != null) {
                        textView3.setText(abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f8n, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.h(j18)));
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a10 a10Var = x10Var2.f192558v;
                    if (a10Var != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14103x2367d69b) a10Var).e7(r03Var);
                    }
                }
                int i19 = x10Var2.D;
                if (i19 == 7 && x10Var2.f192556J <= 2) {
                    if (x10Var2.z() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10) x10Var2.z()).f190409w.f192753a = r03Var;
                    }
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5544x5bf4bb91 c5544x5bf4bb91 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5544x5bf4bb91();
                    int i27 = x10Var2.D;
                    am.od odVar = c5544x5bf4bb91.f135868g;
                    odVar.f89056a = i27;
                    odVar.f89057b = errCode;
                    odVar.f89058c = errMsg;
                    c5544x5bf4bb91.e();
                } else if (i19 == 15) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5544x5bf4bb91 c5544x5bf4bb912 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5544x5bf4bb91();
                    int i28 = x10Var2.D;
                    am.od odVar2 = c5544x5bf4bb912.f135868g;
                    odVar2.f89056a = i28;
                    odVar2.f89057b = errCode;
                    odVar2.f89058c = errMsg;
                    c5544x5bf4bb912.e();
                }
                int i29 = x10Var2.D;
                if (i29 == 5) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zm zmVar = x10Var2.f192561y;
                    if (zmVar != null) {
                        zmVar.a(r03Var);
                    }
                } else {
                    android.view.View view4 = x10Var2.f192560x;
                    if (view4 != null) {
                        if (i29 != 2) {
                            if (i29 == 4) {
                                view4.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v10(x10Var2, view4));
                            }
                        } else if (str2 != null) {
                            if (str2.length() > 0) {
                                ((android.widget.TextView) view4.findViewById(com.p314xaae8f345.mm.R.id.f568915oh1)).setText(str2);
                                android.view.View findViewById5 = view4.findViewById(com.p314xaae8f345.mm.R.id.f568914oh0);
                                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                                arrayList5.add(0);
                                java.util.Collections.reverse(arrayList5);
                                yj0.a.d(findViewById5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "refreshHeader", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                                yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "refreshHeader", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                byte[] byteArrayExtra = abstractActivityC21394xb3d2c0cf.getIntent().getByteArrayExtra("key_topic_poi_location");
                                if (byteArrayExtra != null) {
                                    r45.ze2 ze2Var = new r45.ze2();
                                    ze2Var.mo11468x92b714fd(byteArrayExtra);
                                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ze2Var.m75945x2fec8307(3)) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ze2Var.m75945x2fec8307(2))) {
                                        android.view.View findViewById6 = view4.findViewById(com.p314xaae8f345.mm.R.id.f568914oh0);
                                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                        arrayList6.add(0);
                                        java.util.Collections.reverse(arrayList6);
                                        yj0.a.d(findViewById6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "refreshHeader", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        findViewById6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                                        yj0.a.f(findViewById6, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "refreshHeader", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        view4.findViewById(com.p314xaae8f345.mm.R.id.f568914oh0).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.u10(view4, ze2Var));
                                    } else {
                                        android.view.View findViewById7 = view4.findViewById(com.p314xaae8f345.mm.R.id.f568914oh0);
                                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                                        arrayList7.add(8);
                                        java.util.Collections.reverse(arrayList7);
                                        yj0.a.d(findViewById7, arrayList7.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "refreshHeader", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        findViewById7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                                        yj0.a.f(findViewById7, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "refreshHeader", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    }
                                }
                            } else {
                                android.view.View findViewById8 = view4.findViewById(com.p314xaae8f345.mm.R.id.f568914oh0);
                                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                                arrayList8.add(8);
                                java.util.Collections.reverse(arrayList8);
                                yj0.a.d(findViewById8, arrayList8.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "refreshHeader", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                                yj0.a.f(findViewById8, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "refreshHeader", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                        }
                    }
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var3 = r10Var.f188690f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(a1Var3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract.TopicFeedViewCallback");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10 x10Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10) a1Var3;
                synchronized (x10Var3) {
                    if (x10Var3.B != null) {
                        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf o17 = x10Var3.o();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(x10Var3.B);
                        o17.i0(r5.hashCode(), true);
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var4 = r10Var.f188690f;
        if (a1Var4 != null && (c22801x87cbdc00 = a1Var4.f187713m) != null) {
            c22801x87cbdc00.Q(s3Var);
        }
        r10Var.C(s3Var);
        return jz5.f0.f384359a;
    }
}
