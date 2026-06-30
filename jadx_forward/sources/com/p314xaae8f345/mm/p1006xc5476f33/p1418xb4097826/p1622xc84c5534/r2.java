package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public class r2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.util.HashMap f206865u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.HashMap f206866v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity, r45.qt2 contextObj) {
        super(activity, contextObj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        this.f206822p = false;
        this.f206865u = new java.util.HashMap();
        this.f206866v = new java.util.HashMap();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0, fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return event instanceof fc2.y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0, fc2.d
    public void G0(fc2.a event) {
        ?? r76;
        java.util.List<fc2.r> list;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0792;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (event instanceof fc2.y) {
            fc2.y yVar = (fc2.y) event;
            if (yVar.f342540e == yVar.f342542g && yVar.f342543h == yVar.f342541f) {
                return;
            }
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.HashSet hashSet2 = new java.util.HashSet();
            hashSet.addAll(this.f206866v.keySet());
            java.util.List<fc2.r> list2 = yVar.f342545j;
            if (list2 != null) {
                for (fc2.r rVar : list2) {
                    hashSet.add(java.lang.Long.valueOf(rVar.f342510a.mo2128x1ed62e84()));
                    hashSet2.add(java.lang.Long.valueOf(rVar.f342510a.mo2128x1ed62e84()));
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
                    long mo2128x1ed62e84 = rVar2.f342510a.mo2128x1ed62e84();
                    long j17 = event.f342468b;
                    so2.j5 j5Var = rVar2.f342510a;
                    if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(j5Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                        c14994x9b99c0792 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject();
                    } else {
                        c14994x9b99c0792 = null;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f5 f5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f5(mo2128x1ed62e84, j17, c14994x9b99c0792);
                    f5Var.f206561f = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().getProfileTabIndex() : rVar2.f342511b;
                    f5Var.f206562g = rVar2.f342512c;
                    S0(f5Var, true);
                }
            }
            java.util.Iterator it = this.f206866v.entrySet().iterator();
            while (true) {
                r76 = 0;
                if (!it.hasNext()) {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (!hashSet2.contains(entry.getKey())) {
                    S0((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f5) entry.getValue(), false);
                }
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            if (this.f206822p && (list = yVar.f342545j) != null) {
                for (fc2.r rVar3 : list) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f5 f5Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f5) this.f206866v.get(java.lang.Long.valueOf(rVar3.f342510a.mo2128x1ed62e84()));
                    so2.j5 j5Var2 = rVar3.f342510a;
                    if (f5Var2 != null) {
                        hashMap.put(java.lang.Long.valueOf(j5Var2.mo2128x1ed62e84()), f5Var2);
                    } else {
                        long mo2128x1ed62e842 = j5Var2.mo2128x1ed62e84();
                        long j18 = event.f342468b;
                        if (j5Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(j5Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                            c14994x9b99c079 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var2).getFeedObject();
                        } else {
                            c14994x9b99c079 = null;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f5 f5Var3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f5(mo2128x1ed62e842, j18, c14994x9b99c079);
                        boolean z17 = j5Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5;
                        int profileTabIndex = z17 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var2).getFeedObject().getProfileTabIndex() : rVar3.f342511b;
                        if (z17) {
                            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity = this.f206816g;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                            int i17 = (activity.getIntent().getIntExtra("key_click_avatar_type", r76) == 1 || activity.getIntent().getIntExtra("key_enter_profile_type", r76) == 11) ? 1 : activity.getIntent().getBooleanExtra("key_is_from_slide", r76) ? 2 : 3;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var2;
                            org.json.JSONObject e27 = abstractC14490x69736cb5.e2();
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p0 p0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14881xed239a47.f204946t;
                            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                            e27.put("tab_seat", p0Var.a(context, abstractC14490x69736cb5.getFeedObject().getProfileTabScene()));
                            e27.put("enter_profile_method", i17);
                            f5Var3.f206563h = e27;
                        }
                        f5Var3.f206561f = profileTabIndex;
                        f5Var3.f206562g = rVar3.f342512c;
                        hashMap.put(java.lang.Long.valueOf(j5Var2.mo2128x1ed62e84()), f5Var3);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0.f206812q.d(this.f206817h, f5Var3, f5Var3.f206563h, true);
                    }
                    r76 = 0;
                }
            }
            this.f206866v = hashMap;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0, fc2.d
    public void H0() {
        pm0.v.O("FinderReporterThread", new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q2(this, "onRelease"));
        super.H0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0
    public void O0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileAllFeedFlowReporter", "onInvisible visible=" + this.f206822p);
        if (this.f206822p) {
            this.f206822p = false;
            this.f206865u.putAll(this.f206866v);
            pm0.v.O("FinderReporterThread", new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q2(this, "onInvisible"));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0
    public void Q0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileAllFeedFlowReporter", "onVisible visible=" + this.f206822p);
        if (this.f206822p) {
            return;
        }
        this.f206822p = true;
    }

    public final r45.vd6 S0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f5 f5Var, boolean z17) {
        if (f5Var.f206564i == 0) {
            f5Var.f206564i = c01.id.c();
        }
        r45.vd6 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f5.f206555j.a(f5Var, z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0.f206812q.d(this.f206817h, f5Var, f5Var.f206563h, false);
        return a17;
    }
}
