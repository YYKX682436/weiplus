package ab2;

/* loaded from: classes2.dex */
public abstract class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f84301u;

    /* renamed from: v, reason: collision with root package name */
    public final int f84302v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f84303w;

    /* renamed from: x, reason: collision with root package name */
    public final int f84304x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f84305y;

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.vj0 f84306z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(java.lang.String r15, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf r16, int r17, int r18, boolean r19, int r20, boolean r21, int r22, p3321xbce91901.jvm.p3324x21ffc6bd.i r23) {
        /*
            r14 = this;
            r9 = r14
            r10 = r15
            r0 = r22 & 16
            r1 = 0
            if (r0 == 0) goto L9
            r4 = r1
            goto Lb
        L9:
            r4 = r19
        Lb:
            r0 = r22 & 32
            if (r0 == 0) goto L11
            r11 = r1
            goto L13
        L11:
            r11 = r20
        L13:
            r0 = r22 & 64
            if (r0 == 0) goto L19
            r12 = r1
            goto L1b
        L19:
            r12 = r21
        L1b:
            java.lang.String r0 = "bizName"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r15, r0)
            java.lang.String r0 = "context"
            r13 = r16
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r13, r0)
            r5 = 0
            r6 = 0
            r7 = 48
            r8 = 0
            r0 = r14
            r1 = r16
            r2 = r17
            r3 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f84301u = r10
            r9.f84302v = r11
            r9.f84303w = r12
            r0 = 7
            r9.f84304x = r0
            boolean r0 = lk5.s.b(r16)
            r9.f84305y = r0
            com.tencent.mm.plugin.finder.profile.h r1 = new com.tencent.mm.plugin.finder.profile.h
            r2 = 0
            r3 = 0
            r4 = 1
            r17 = r1
            r18 = r16
            r19 = r2
            r20 = r3
            r21 = r0
            r22 = r4
            r17.<init>(r18, r19, r20, r21, r22)
            r9.f84306z = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ab2.g.<init>(java.lang.String, com.tencent.mm.ui.MMActivity, int, int, boolean, int, boolean, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public java.lang.CharSequence B(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void J(in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        try {
            int a07 = i17 - o().a0();
            if (a07 < 0 || a07 >= z().f188689e.m56393xfb854877()) {
                return;
            }
            so2.j5 j5Var = (so2.j5) z().f188689e.m56388xcaeb60d0().get(a07);
            if ((j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) && zl2.q4.f555466a.C((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var)) {
                android.view.View itemView = holder.f3639x46306858;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
                ym5.a1.h(itemView, new ab2.c(j5Var, this));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.f3639x46306858, "profile_live_room_card");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(holder.f3639x46306858, 40, 26236);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                r45.nw1 m59258xd0557130 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().m59258xd0557130();
                if (m59258xd0557130 != null) {
                    linkedHashMap.put("live_id", pm0.v.u(m59258xd0557130.m75942xfb822ef2(0)));
                }
                linkedHashMap.put("feed_id", pm0.v.u(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().getFeedObject().m76784x5db1b11()));
                java.lang.String m76836x6c03c64c = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().getFeedObject().m76836x6c03c64c();
                if (m76836x6c03c64c == null) {
                    m76836x6c03c64c = "";
                }
                linkedHashMap.put("finder_username", m76836x6c03c64c);
                ml2.q1 q1Var = ml2.q1.f409345e;
                linkedHashMap.put("comment_scene", "temp_5");
                linkedHashMap.put("session_buffer", "");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(holder.f3639x46306858, linkedHashMap);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(holder.f3639x46306858, new ab2.d(this, j5Var));
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void K(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17) {
        boolean z17;
        int a07;
        int i18;
        android.app.Activity m81193x1252e2cf;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z18 = false;
        if (currentTimeMillis - qd2.h.f443300a >= 500) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
            z17 = true;
        }
        qd2.h.f443300a = currentTimeMillis;
        if (!z17 && (a07 = i17 - ((in5.n0) adapter).a0()) >= 0 && a07 < z().f188689e.m56393xfb854877()) {
            so2.j5 j5Var = (so2.j5) z().f188689e.m56388xcaeb60d0().get(a07);
            if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                int intValue = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.F0().r()).intValue();
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f187707d;
                if (intValue == 1) {
                    com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 ? (com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) abstractActivityC21394xb3d2c0cf : null;
                    if (abstractActivityC22579xbed01a37 != null && (m81193x1252e2cf = abstractActivityC22579xbed01a37.m81193x1252e2cf()) != null && this.f84305y && (m81193x1252e2cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13929xfdbd586b)) {
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) m81193x1252e2cf;
                        pf5.z zVar = pf5.z.f435481a;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s4 s4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s4) zVar.a(activityC0065xcd7aa112).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s4.class);
                        if (s4Var != null) {
                            s4Var.O6();
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s4 s4Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s4) zVar.a(activityC0065xcd7aa112).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s4.class);
                        if (s4Var2 != null) {
                            s4Var2.R6(j5Var);
                            return;
                        }
                        return;
                    }
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick ");
                sb6.append(a07);
                sb6.append(" id:");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
                sb6.append(abstractC14490x69736cb5.getFeedObject().m59251x5db1b11());
                sb6.append(", pos:");
                sb6.append(a07);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderBizProfileContract", sb6.toString());
                boolean fk6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).fk();
                if (((java.lang.Number) ae2.in.f85221a.s().r()).intValue() == 1 && !fk6) {
                    z18 = true;
                }
                if (!zl2.q4.f555466a.C(abstractC14490x69736cb5) || z18) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("KEY_BIZ_USERNAME", this.f84301u);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56348xdbd6b4a2(z().f188689e, intent, a07, null, 4, null);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject = abstractC14490x69736cb5.getFeedObject().getFeedObject();
                    int i19 = ((c61.l7) i95.n0.c(c61.l7.class)).ek().I;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderBizProfileContract", "startPreloadVideo onGridItemClick feedId:" + pm0.v.u(feedObject.m76784x5db1b11()) + " return for disable");
                    yz5.p Ri = wa2.u.f525714d.Ri(m56022x4905e9fa(), abstractC14490x69736cb5.getFeedObject().m59251x5db1b11(), z().f188689e.m56388xcaeb60d0(), new ab2.f(this));
                    i18 = a07;
                    intent.putExtra("KEY_REQUEST_BACK_DATA", wa2.x.e(intent, view, 0L, false, true, Ri, 6, null));
                    if (((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Jk()) {
                        wd0.q1 q1Var = (wd0.q1) i95.n0.c(wd0.q1.class);
                        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = this.f187707d;
                        ab2.e eVar = new ab2.e(this, intent, j5Var);
                        ((vd0.j2) q1Var).getClass();
                        v24.o0.h(abstractActivityC21394xb3d2c0cf2, 34359738368L, null, eVar, 3);
                    } else {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Ri(abstractActivityC21394xb3d2c0cf, intent, 10010);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(abstractActivityC21394xb3d2c0cf).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                        if (nyVar != null) {
                            r45.qt2 V6 = nyVar.V6();
                            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.wj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17, V6, j5Var.mo2128x1ed62e84(), ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).w(), this.f187713m.m82555x4905e9fa(), 0, null, 0L, null, 240, null);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0.f206642a.b(V6, j5Var, 18);
                        }
                    }
                } else {
                    ((c61.d8) ((zy2.c8) i95.n0.c(zy2.c8.class))).Bi(new zy2.nc(abstractC14490x69736cb5.getFeedObject().m59299x6bf53a6c(), abstractC14490x69736cb5.getFeedObject().m59251x5db1b11(), abstractC14490x69736cb5.getFeedObject().m59276x6c285d75(), abstractC14490x69736cb5.getFeedObject().m59258xd0557130(), abstractC14490x69736cb5.g0(), abstractC14490x69736cb5.getFeedObject().m59273x80025a04(), (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f566460fz0), null, 128, null), abstractC14490x69736cb5.mo2128x1ed62e84(), view, ez2.a.f339389e, new ab2.b(this, abstractC14490x69736cb5, i17, view, android.os.SystemClock.elapsedRealtime()));
                    i18 = a07;
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5855x52ad0261 c5855x52ad0261 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5855x52ad0261();
                am.wo woVar = c5855x52ad0261.f136162g;
                woVar.getClass();
                woVar.f89839a = i18;
                woVar.f89840b = "";
                woVar.f89841c = this.f84302v;
                woVar.f89842d = this.f84303w;
                c5855x52ad0261.e();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void M() {
    }

    @Override // fs2.c
    /* renamed from: getActivity */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
        return this.f187707d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.vj0 q() {
        return this.f84306z;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void r(java.util.ArrayList data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        super.r(data);
        this.f187713m.m82690xd3a27e96(false);
        this.f187713m.m82565x6107557d(true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public java.lang.String s(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public android.view.View t() {
        android.view.View l17 = l(com.p314xaae8f345.mm.R.id.f565762dg3);
        if (l17 instanceof android.view.View) {
            return l17;
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public android.view.View w() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 x() {
        return this.f84306z.c();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager y(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return this.f84306z.d(context);
    }
}
