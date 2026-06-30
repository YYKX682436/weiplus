package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class d10 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f106533d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.r10 f106534e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f106535f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d10(ym5.s3 s3Var, com.tencent.mm.plugin.finder.feed.r10 r10Var, com.tencent.mm.ui.MMActivity mMActivity) {
        super(0);
        this.f106533d = s3Var;
        this.f106534e = r10Var;
        this.f106535f = mMActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        ym5.s3 s3Var = this.f106533d;
        java.lang.Object obj = s3Var.f463520e;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader.TopicResponse");
        com.tencent.mm.plugin.finder.feed.model.f9 f9Var = (com.tencent.mm.plugin.finder.feed.model.f9) obj;
        int i17 = s3Var.f463517b;
        com.tencent.mm.plugin.finder.feed.r10 r10Var = this.f106534e;
        if (i17 != -1) {
            if (s3Var.f463516a == 3) {
                java.lang.String str = r10Var.f108865i;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refresh incrementCount ");
                java.util.List incrementList = f9Var.getIncrementList();
                sb6.append(incrementList != null ? java.lang.Integer.valueOf(incrementList.size()) : null);
                sb6.append(", totalCount ");
                sb6.append(f9Var.f107862b);
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
                r10Var.f108871r = f9Var.f107862b;
                r10Var.f108872s = f9Var.f107866f;
                r10Var.f108873t = f9Var.getBgmInfo();
                r10Var.f108874u = f9Var.f107867g;
                r10Var.f108875v = f9Var.f107868h;
                r45.r03 r03Var = f9Var.f107861a;
                r10Var.getClass();
                long j17 = r10Var.f108867n;
                if (j17 == 0) {
                    if (r03Var != null) {
                        j17 = r03Var.getLong(1);
                    }
                    r10Var.f108867n = j17;
                }
                com.tencent.mm.plugin.finder.feed.a1 a1Var = r10Var.f107157f;
                kotlin.jvm.internal.o.e(a1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract.TopicFeedViewCallback");
                com.tencent.mm.plugin.finder.feed.x10 x10Var = (com.tencent.mm.plugin.finder.feed.x10) a1Var;
                r45.xn5 xn5Var = f9Var.f107863c;
                if (xn5Var != null && !xn5Var.getList(0).isEmpty()) {
                    so2.v vVar = x10Var.L;
                    vVar.getClass();
                    vVar.f410643d = xn5Var;
                    in5.n0.j0(x10Var.o(), vVar.hashCode(), false, 2, null);
                    in5.n0.S(x10Var.o(), vVar, false, 2, null);
                }
                com.tencent.mm.ui.MMActivity context = this.f106535f;
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                if (nyVar != null) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("topic", r10Var.f108868o);
                        jSONObject.put("type", r10Var.f108866m);
                        jSONObject.put("count", r10Var.f108871r);
                    } catch (java.lang.Exception unused) {
                    }
                    java.lang.String jSONObject2 = jSONObject.toString();
                    kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                    nyVar.f135391w = jSONObject2;
                    com.tencent.mm.plugin.finder.report.r0 a76 = nyVar.a7(-1);
                    if (a76 != null) {
                        a76.P0(nyVar.V6());
                    }
                }
                com.tencent.mm.plugin.finder.feed.a1 a1Var2 = r10Var.f107157f;
                kotlin.jvm.internal.o.e(a1Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract.TopicFeedViewCallback");
                com.tencent.mm.plugin.finder.feed.x10 x10Var2 = (com.tencent.mm.plugin.finder.feed.x10) a1Var2;
                java.lang.String str2 = f9Var.f107864d;
                long j18 = r10Var.f108871r;
                int errCode = f9Var.getErrCode();
                java.lang.String errMsg = f9Var.getErrMsg();
                x10Var2.H = r03Var;
                long j19 = x10Var2.I;
                if (j19 == 0) {
                    if (r03Var != null) {
                        j19 = r03Var.getLong(1);
                    }
                    x10Var2.I = j19;
                }
                int i18 = x10Var2.D;
                com.tencent.mm.ui.MMActivity mMActivity = x10Var2.f106174d;
                if (i18 == 4) {
                    com.tencent.mm.plugin.finder.feed.r10 r10Var2 = (com.tencent.mm.plugin.finder.feed.r10) x10Var2.z();
                    if ((2 & r10Var2.f108874u) == 1 || r10Var2.f108875v > 0) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(" musicInfo = null ,bgmInfo?.contact = ");
                        r45.o03 o03Var = r10Var2.f108873t;
                        sb7.append(o03Var != null ? (com.tencent.mm.protocal.protobuf.FinderContact) o03Var.getCustom(0) : null);
                        sb7.append(", totalCount = ");
                        sb7.append(r10Var2.f108871r);
                        java.lang.String sb8 = sb7.toString();
                        java.lang.String str3 = x10Var2.f111026w;
                        com.tencent.mars.xlog.Log.i(str3, sb8);
                        com.tencent.mars.xlog.Log.i(str3, "Type_Follow , falg = " + ((com.tencent.mm.plugin.finder.feed.r10) x10Var2.z()).f108874u);
                        android.view.View findViewById = mMActivity.findViewById(com.tencent.mm.R.id.oah);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "refreshHeaderContent", "(Ljava/lang/String;JLcom/tencent/mm/protocal/protobuf/FinderTopicInfo;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "refreshHeaderContent", "(Ljava/lang/String;JLcom/tencent/mm/protocal/protobuf/FinderTopicInfo;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.View findViewById2 = mMActivity.findViewById(com.tencent.mm.R.id.m6e);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "refreshHeaderContent", "(Ljava/lang/String;JLcom/tencent/mm/protocal/protobuf/FinderTopicInfo;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "refreshHeaderContent", "(Ljava/lang/String;JLcom/tencent/mm/protocal/protobuf/FinderTopicInfo;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.View findViewById3 = mMActivity.findViewById(com.tencent.mm.R.id.f483953cj5);
                        if (findViewById3 != null) {
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            arrayList3.add(8);
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "refreshHeaderContent", "(Ljava/lang/String;JLcom/tencent/mm/protocal/protobuf/FinderTopicInfo;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "refreshHeaderContent", "(Ljava/lang/String;JLcom/tencent/mm/protocal/protobuf/FinderTopicInfo;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        r45.o03 o03Var2 = ((com.tencent.mm.plugin.finder.feed.r10) x10Var2.z()).f108873t;
                        if ((o03Var2 != null ? (r45.zi2) o03Var2.getCustom(1) : null) == null) {
                            ((android.widget.TextView) mMActivity.findViewById(com.tencent.mm.R.id.cti)).setText(mMActivity.getResources().getString(com.tencent.mm.R.string.cmb));
                        } else {
                            ((android.widget.TextView) mMActivity.findViewById(com.tencent.mm.R.id.cti)).setText(mMActivity.getResources().getString(com.tencent.mm.R.string.f491942eq3));
                        }
                    } else {
                        android.view.View findViewById4 = mMActivity.findViewById(com.tencent.mm.R.id.f483953cj5);
                        if (findViewById4 != null) {
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                            arrayList4.add(0);
                            java.util.Collections.reverse(arrayList4);
                            yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "refreshHeaderContent", "(Ljava/lang/String;JLcom/tencent/mm/protocal/protobuf/FinderTopicInfo;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "refreshHeaderContent", "(Ljava/lang/String;JLcom/tencent/mm/protocal/protobuf/FinderTopicInfo;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        android.view.View view = x10Var2.f111027x;
                        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ogu) : null;
                        r45.o03 o03Var3 = ((com.tencent.mm.plugin.finder.feed.r10) x10Var2.z()).f108873t;
                        if ((o03Var3 != null ? (r45.zi2) o03Var3.getCustom(1) : null) == null) {
                            if (textView != null) {
                                textView.setText(mMActivity.getResources().getString(com.tencent.mm.R.string.cxj, com.tencent.mm.plugin.finder.assist.w2.h(j18)));
                            }
                        } else if (textView != null) {
                            textView.setText(mMActivity.getResources().getString(com.tencent.mm.R.string.cxu, com.tencent.mm.plugin.finder.assist.w2.h(j18)));
                        }
                        if (j18 == 0) {
                            if (textView != null) {
                                textView.setVisibility(4);
                            }
                            android.view.View view2 = x10Var2.f111027x;
                            android.widget.TextView textView2 = view2 != null ? (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.dzx) : null;
                            if (textView2 != null) {
                                textView2.setVisibility(0);
                            }
                        }
                    }
                } else {
                    android.view.View view3 = x10Var2.f111027x;
                    android.widget.TextView textView3 = view3 != null ? (android.widget.TextView) view3.findViewById(com.tencent.mm.R.id.ogu) : null;
                    if (textView3 != null) {
                        textView3.setText(mMActivity.getResources().getString(com.tencent.mm.R.string.f8n, com.tencent.mm.plugin.finder.assist.w2.h(j18)));
                    }
                    com.tencent.mm.plugin.finder.feed.a10 a10Var = x10Var2.f111025v;
                    if (a10Var != null) {
                        ((com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI) a10Var).e7(r03Var);
                    }
                }
                int i19 = x10Var2.D;
                if (i19 == 7 && x10Var2.f111023J <= 2) {
                    if (x10Var2.z() instanceof com.tencent.mm.plugin.finder.feed.r10) {
                        ((com.tencent.mm.plugin.finder.feed.r10) x10Var2.z()).f108876w.f111220a = r03Var;
                    }
                    com.tencent.mm.autogen.events.FinderTopicEvent finderTopicEvent = new com.tencent.mm.autogen.events.FinderTopicEvent();
                    int i27 = x10Var2.D;
                    am.od odVar = finderTopicEvent.f54335g;
                    odVar.f7523a = i27;
                    odVar.f7524b = errCode;
                    odVar.f7525c = errMsg;
                    finderTopicEvent.e();
                } else if (i19 == 15) {
                    com.tencent.mm.autogen.events.FinderTopicEvent finderTopicEvent2 = new com.tencent.mm.autogen.events.FinderTopicEvent();
                    int i28 = x10Var2.D;
                    am.od odVar2 = finderTopicEvent2.f54335g;
                    odVar2.f7523a = i28;
                    odVar2.f7524b = errCode;
                    odVar2.f7525c = errMsg;
                    finderTopicEvent2.e();
                }
                int i29 = x10Var2.D;
                if (i29 == 5) {
                    com.tencent.mm.plugin.finder.feed.zm zmVar = x10Var2.f111028y;
                    if (zmVar != null) {
                        zmVar.a(r03Var);
                    }
                } else {
                    android.view.View view4 = x10Var2.f111027x;
                    if (view4 != null) {
                        if (i29 != 2) {
                            if (i29 == 4) {
                                view4.post(new com.tencent.mm.plugin.finder.feed.v10(x10Var2, view4));
                            }
                        } else if (str2 != null) {
                            if (str2.length() > 0) {
                                ((android.widget.TextView) view4.findViewById(com.tencent.mm.R.id.f487382oh1)).setText(str2);
                                android.view.View findViewById5 = view4.findViewById(com.tencent.mm.R.id.f487381oh0);
                                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                                arrayList5.add(0);
                                java.util.Collections.reverse(arrayList5);
                                yj0.a.d(findViewById5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "refreshHeader", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                                yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "refreshHeader", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                byte[] byteArrayExtra = mMActivity.getIntent().getByteArrayExtra("key_topic_poi_location");
                                if (byteArrayExtra != null) {
                                    r45.ze2 ze2Var = new r45.ze2();
                                    ze2Var.parseFrom(byteArrayExtra);
                                    if (!com.tencent.mm.sdk.platformtools.t8.K0(ze2Var.getString(3)) || com.tencent.mm.sdk.platformtools.t8.K0(ze2Var.getString(2))) {
                                        android.view.View findViewById6 = view4.findViewById(com.tencent.mm.R.id.f487381oh0);
                                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                        arrayList6.add(0);
                                        java.util.Collections.reverse(arrayList6);
                                        yj0.a.d(findViewById6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "refreshHeader", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        findViewById6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                                        yj0.a.f(findViewById6, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "refreshHeader", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        view4.findViewById(com.tencent.mm.R.id.f487381oh0).setOnClickListener(new com.tencent.mm.plugin.finder.feed.u10(view4, ze2Var));
                                    } else {
                                        android.view.View findViewById7 = view4.findViewById(com.tencent.mm.R.id.f487381oh0);
                                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                                        arrayList7.add(8);
                                        java.util.Collections.reverse(arrayList7);
                                        yj0.a.d(findViewById7, arrayList7.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "refreshHeader", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        findViewById7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                                        yj0.a.f(findViewById7, "com/tencent/mm/plugin/finder/feed/FinderTopicFeedUIContract$TopicFeedViewCallback", "refreshHeader", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    }
                                }
                            } else {
                                android.view.View findViewById8 = view4.findViewById(com.tencent.mm.R.id.f487381oh0);
                                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
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
                com.tencent.mm.plugin.finder.feed.a1 a1Var3 = r10Var.f107157f;
                kotlin.jvm.internal.o.e(a1Var3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract.TopicFeedViewCallback");
                com.tencent.mm.plugin.finder.feed.x10 x10Var3 = (com.tencent.mm.plugin.finder.feed.x10) a1Var3;
                synchronized (x10Var3) {
                    if (x10Var3.B != null) {
                        com.tencent.mm.view.recyclerview.WxRecyclerAdapter o17 = x10Var3.o();
                        kotlin.jvm.internal.o.d(x10Var3.B);
                        o17.i0(r5.hashCode(), true);
                    }
                }
            }
        }
        com.tencent.mm.plugin.finder.feed.a1 a1Var4 = r10Var.f107157f;
        if (a1Var4 != null && (refreshLoadMoreLayout = a1Var4.f106180m) != null) {
            refreshLoadMoreLayout.Q(s3Var);
        }
        r10Var.C(s3Var);
        return jz5.f0.f302826a;
    }
}
