package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public class d5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.util.HashMap f206530u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.HashMap f206531v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity, r45.qt2 contextObj) {
        super(activity, contextObj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        this.f206530u = new java.util.HashMap();
        this.f206531v = new java.util.HashMap();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0, fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return event instanceof fc2.y;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0, fc2.d
    public void G0(fc2.a event) {
        java.util.List<fc2.r> list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (event instanceof fc2.y) {
            fc2.y yVar = (fc2.y) event;
            if (yVar.f342540e == yVar.f342542g && yVar.f342543h == yVar.f342541f) {
                return;
            }
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.HashSet hashSet2 = new java.util.HashSet();
            hashSet.addAll(this.f206531v.keySet());
            java.util.List<fc2.r> list2 = yVar.f342545j;
            if (list2 != null) {
                for (fc2.r rVar : list2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTwoFeedFlowReporter", "visibleItemToInvisible visibleFeedList commentScene:" + this.f206817h.m75939xb282bd08(5) + " feedId:" + pm0.v.u(rVar.f342510a.mo2128x1ed62e84()));
                    so2.j5 j5Var = rVar.f342510a;
                    hashSet.add(java.lang.Long.valueOf(j5Var.mo2128x1ed62e84()));
                    hashSet2.add(java.lang.Long.valueOf(j5Var.mo2128x1ed62e84()));
                }
            }
            java.util.List list3 = yVar.f342544i;
            if (list3 != null) {
                java.util.ArrayList<fc2.r> arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list3) {
                    if (!hashSet.contains(java.lang.Long.valueOf(((fc2.r) obj).f342510a.mo2128x1ed62e84()))) {
                        arrayList.add(obj);
                    }
                }
                for (fc2.r rVar2 : arrayList) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f5 S0 = S0(yVar, rVar2);
                    S0.f206561f = rVar2.f342511b;
                    S0.f206562g = rVar2.f342512c;
                    V0(S0, true);
                }
            }
            for (java.util.Map.Entry entry : this.f206531v.entrySet()) {
                if (!hashSet2.contains(entry.getKey())) {
                    V0((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f5) entry.getValue(), false);
                }
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            if (this.f206822p && (list = yVar.f342545j) != null) {
                for (fc2.r rVar3 : list) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f5 f5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f5) this.f206531v.get(java.lang.Long.valueOf(rVar3.f342510a.mo2128x1ed62e84()));
                    so2.j5 j5Var2 = rVar3.f342510a;
                    if (f5Var != null) {
                        hashMap.put(java.lang.Long.valueOf(j5Var2.mo2128x1ed62e84()), f5Var);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f5 S02 = S0(yVar, rVar3);
                        if (j5Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var2;
                            if (abstractC14490x69736cb5.getUdfKv().length() > 0) {
                                S02.f206563h = abstractC14490x69736cb5.getUdfKv();
                            }
                        }
                        S02.f206561f = rVar3.f342511b;
                        S02.f206562g = rVar3.f342512c;
                        hashMap.put(java.lang.Long.valueOf(j5Var2.mo2128x1ed62e84()), S02);
                        if (S02.f206558c != null || S02.f206560e != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0.f206812q.d(this.f206817h, S02, T0(S02), true);
                        }
                    }
                }
            }
            this.f206531v = hashMap;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0, fc2.d
    public void H0() {
        U0("onRelease");
        super.H0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0
    public void O0() {
        this.f206822p = false;
        this.f206530u.putAll(this.f206531v);
        U0("onInvisible");
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f5 S0(fc2.y event, fc2.r data) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        so2.j5 j5Var = data.f342510a;
        long mo2128x1ed62e84 = j5Var.mo2128x1ed62e84();
        long j17 = event.f342468b;
        if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(j5Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
            c14994x9b99c079 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject();
        } else {
            c14994x9b99c079 = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f5 f5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f5(mo2128x1ed62e84, j17, c14994x9b99c079);
        if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d5) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(j5Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderNativeDramaRecommendFeed");
            f5Var.f206560e = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d5) j5Var;
        }
        return f5Var;
    }

    public org.json.JSONObject T0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f5 record) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(record, "record");
        return record.f206563h;
    }

    public void U0(java.lang.String invokeSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeSource, "invokeSource");
        pm0.v.O("FinderReporterThread", new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.c5(this, invokeSource));
    }

    public final r45.vd6 V0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f5 f5Var, boolean z17) {
        if (f5Var.f206564i == 0) {
            f5Var.f206564i = c01.id.c();
        }
        r45.vd6 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f5.f206555j.a(f5Var, z17);
        if (f5Var.f206558c != null || f5Var.f206560e != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0.f206812q.d(this.f206817h, f5Var, T0(f5Var), false);
        }
        return a17;
    }
}
