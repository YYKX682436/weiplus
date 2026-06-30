package xc2;

/* loaded from: classes2.dex */
public abstract class j implements xc2.z2 {

    /* renamed from: a, reason: collision with root package name */
    public in5.s0 f534694a;

    /* renamed from: b, reason: collision with root package name */
    public xc2.p0 f534695b;

    /* renamed from: c, reason: collision with root package name */
    public int f534696c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f534697d = jz5.h.b(new xc2.i(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f534698e = jz5.h.b(xc2.g.f534670d);

    /* renamed from: f, reason: collision with root package name */
    public boolean f534699f;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4, r6.f534767a.m76501xf2fd2296()) == false) goto L31;
     */
    @Override // xc2.z2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(xc2.p0 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "infoEx"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            java.lang.String r0 = "onDataUpdate"
            java.lang.String r1 = "BaseJumperEventHandler"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            xc2.p0 r0 = r5.f534695b
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L18
            boolean r4 = r0.f534795x
            if (r4 != r2) goto L18
            r4 = r2
            goto L19
        L18:
            r4 = r3
        L19:
            if (r4 == 0) goto L4f
            r4 = 0
            if (r0 == 0) goto L27
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r0.f534767a
            if (r0 == 0) goto L27
            java.lang.String r0 = r0.m76501xf2fd2296()
            goto L28
        L27:
            r0 = r4
        L28:
            if (r0 == 0) goto L33
            int r0 = r0.length()
            if (r0 != 0) goto L31
            goto L33
        L31:
            r0 = r3
            goto L34
        L33:
            r0 = r2
        L34:
            if (r0 != 0) goto L4f
            xc2.p0 r0 = r5.f534695b
            if (r0 == 0) goto L42
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r0.f534767a
            if (r0 == 0) goto L42
            java.lang.String r4 = r0.m76501xf2fd2296()
        L42:
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r6.f534767a
            java.lang.String r0 = r0.m76501xf2fd2296()
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4, r0)
            if (r0 != 0) goto L4f
            goto L50
        L4f:
            r2 = r3
        L50:
            r5.f534695b = r6
            if (r2 == 0) goto L62
            boolean r6 = r5.u()
            if (r6 == 0) goto L62
            r5.l()
            java.lang.String r6 = "onDataUpdate， doPreload again"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r6)
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xc2.j.a(xc2.p0):void");
    }

    @Override // xc2.z2
    public void b(in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    @Override // xc2.z2
    public void c(java.lang.String activityName, xc2.p0 infoEx, android.view.View jumpView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityName, "activityName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
    }

    @Override // xc2.z2
    public void d(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
    }

    @Override // xc2.z2
    public void e(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
    }

    @Override // xc2.z2
    public void f(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        if (infoEx.f534767a.m76500x926ea36a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = infoEx.f534777f;
            if (abstractC14490x69736cb5 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseJumperEventHandler", "onJumpViewFocus: feedId is null, update native ad extra Info failed");
                return;
            }
            long mo2128x1ed62e84 = abstractC14490x69736cb5.mo2128x1ed62e84();
            sc2.q8 q8Var = infoEx.f534766J;
            boolean z17 = (q8Var == null || q8Var.f487710a) ? false : true;
            android.content.Context context = holder.f374654e;
            if (z17) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                sc2.a8 a8Var = (sc2.a8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(sc2.a8.class);
                if (a8Var != null) {
                    r45.i16 m17 = m(jumpView, infoEx);
                    sc2.x6 x6Var = (sc2.x6) a8Var.f487753s.c(java.lang.Long.valueOf(mo2128x1ed62e84), sc2.p7.f487684d);
                    if (x6Var != null) {
                        x6Var.f487901b = m17;
                    }
                }
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar2 = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            sc2.a8 a8Var2 = (sc2.a8) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(sc2.a8.class);
            if (a8Var2 != null) {
                a8Var2.l7(mo2128x1ed62e84, android.os.SystemClock.uptimeMillis());
            }
        }
    }

    @Override // xc2.z2
    public void g(android.view.View jumpView, xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        if (infoEx.f534767a.m76500x926ea36a()) {
            in5.s0 s0Var = this.f534694a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = infoEx.f534777f;
            java.lang.Long l17 = null;
            java.lang.Long valueOf = abstractC14490x69736cb5 != null ? java.lang.Long.valueOf(abstractC14490x69736cb5.mo2128x1ed62e84()) : null;
            if (s0Var != null && valueOf != null) {
                long longValue = valueOf.longValue();
                android.content.Context context = s0Var.f374654e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                sc2.a8 a8Var = (sc2.a8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(sc2.a8.class);
                if (a8Var != null) {
                    a8Var.l7(longValue, 0L);
                }
                l17 = java.lang.Long.valueOf(longValue);
            }
            if (l17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseJumperEventHandler", "onPause: feedId or holder is null, update native ad extra Info failed");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r6 == null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ea  */
    @Override // xc2.z2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(boolean r17, in5.s0 r18, android.view.View r19, xc2.p0 r20) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc2.j.h(boolean, in5.s0, android.view.View, xc2.p0):void");
    }

    @Override // xc2.z2
    public void i(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        if (infoEx.f534767a.m76500x926ea36a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = infoEx.f534777f;
            if (abstractC14490x69736cb5 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseJumperEventHandler", "onJumpViewUnFocus: feedId is null, update native ad extra Info failed");
                return;
            }
            long mo2128x1ed62e84 = abstractC14490x69736cb5.mo2128x1ed62e84();
            android.content.Context context = holder.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            sc2.a8 a8Var = (sc2.a8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(sc2.a8.class);
            if (a8Var != null) {
                a8Var.l7(mo2128x1ed62e84, 0L);
            }
        }
    }

    @Override // xc2.z2
    public void j(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, ec2.f event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
    }

    public void k() {
    }

    public void l() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622;
        r45.k74 m76504xa819f0c7;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28623;
        xc2.p0 p0Var = this.f534695b;
        boolean z17 = true;
        if ((p0Var == null || (c19786x6a1e28623 = p0Var.f534767a) == null || c19786x6a1e28623.m76503x92bc3c07() != 6) ? false : true) {
            xc2.p0 p0Var2 = this.f534695b;
            java.lang.String m75945x2fec8307 = (p0Var2 == null || (c19786x6a1e28622 = p0Var2.f534767a) == null || (m76504xa819f0c7 = c19786x6a1e28622.m76504xa819f0c7()) == null) ? null : m76504xa819f0c7.m75945x2fec8307(0);
            if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
                z17 = false;
            }
            if (z17) {
                return;
            }
            xc2.p0 p0Var3 = this.f534695b;
            r45.k74 m76504xa819f0c72 = (p0Var3 == null || (c19786x6a1e2862 = p0Var3.f534767a) == null) ? null : c19786x6a1e2862.m76504xa819f0c7();
            if (m76504xa819f0c72 != null) {
                i95.m c17 = i95.n0.c(c61.yb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                c61.yb ybVar = (c61.yb) c17;
                in5.s0 s0Var = this.f534694a;
                ((c61.p2) ybVar).Qj(s0Var != null ? s0Var.f374654e : null, m76504xa819f0c72);
            }
        }
    }

    public final r45.i16 m(android.view.View view, xc2.p0 p0Var) {
        r45.i16 i16Var = new r45.i16();
        i16Var.set(0, java.lang.Integer.valueOf(view.getMeasuredWidth()));
        int i17 = 1;
        i16Var.set(1, java.lang.Integer.valueOf(view.getMeasuredHeight()));
        r45.f5 f5Var = new r45.f5();
        int i18 = com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d;
        f5Var.set(0, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d));
        f5Var.set(1, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295045e));
        f5Var.set(2, java.lang.Integer.valueOf(f5Var.m75939xb282bd08(0)));
        f5Var.set(3, java.lang.Integer.valueOf(f5Var.m75939xb282bd08(1)));
        f5Var.set(4, 1);
        f5Var.set(5, 1);
        f5Var.set(6, 0);
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        sc2.a8 a8Var = (sc2.a8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(sc2.a8.class);
        f5Var.set(7, java.lang.Long.valueOf(a8Var != null ? a8Var.f487299y : 0L));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e8 e8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e8.f183664a;
        f5Var.set(8, java.lang.Integer.valueOf(e8Var.c(null)));
        f5Var.set(9, java.lang.Integer.valueOf(e8Var.a()));
        i16Var.set(2, f5Var);
        r45.om0 om0Var = new r45.om0();
        om0Var.set(0, ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).k9());
        ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).Bi();
        om0Var.set(1, "");
        om0Var.set(3, ((ee0.g) ((fe0.m3) i95.n0.c(fe0.m3.class))).wi());
        i16Var.set(3, om0Var);
        r45.qy qyVar = new r45.qy();
        java.lang.String str = p0Var.f534780i;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37641x4a9d0f2f, str)) {
            i17 = 2;
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("TWO_FLOW", str)) {
            i17 = 4;
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("single_comment", str)) {
            i17 = 5;
        }
        qyVar.set(0, java.lang.Integer.valueOf(i17));
        i16Var.set(4, qyVar);
        return i16Var;
    }

    public org.json.JSONObject n(xc2.p0 infoEx) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f;
        cw2.da videoView;
        java.lang.String m76517xcb1f2fa3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 info = infoEx.f534767a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        int i17 = 0;
        int i18 = 1;
        if (!(info.m76480xe2ee1ca3() == 8 || info.m76516x2a6227ad() > 0) || (m76517xcb1f2fa3 = info.m76517xcb1f2fa3()) == null) {
            if (info.m76480xe2ee1ca3() == 124) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    in5.s0 s0Var = this.f534694a;
                    if (s0Var != null && (c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var.p(com.p314xaae8f345.mm.R.id.e_k)) != null && (videoView = c15196x85976f5f.getVideoView()) != null) {
                        i17 = (int) ((((float) videoView.mo56685x3d7f3f1d()) * 100) / ((float) videoView.mo56695x7723e6ff()));
                    }
                    jSONObject.put("playpercent", i17);
                    return jSONObject;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseJumperEventHandler", "getCustomKv: e=" + th6);
                }
            }
            return null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m76517xcb1f2fa3)) {
            return null;
        }
        byte[] decode = android.util.Base64.decode(m76517xcb1f2fa3, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode, "decode(...)");
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(new java.lang.String(decode, r26.c.f450398a));
            int optInt = jSONObject2.optInt("bubble_statu");
            int optInt2 = jSONObject2.optInt("bubble_connection_type");
            java.lang.String optString = jSONObject2.optString("coverid");
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("bubble_statu", optInt);
            jSONObject3.put("bubble_connection_type", optInt2);
            jSONObject3.put("coverid", optString);
            if (this.f534696c != 5) {
                i18 = 2;
            }
            jSONObject3.put("bubble_type", i18);
            return jSONObject3;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public java.lang.String o() {
        return "feed_jumpicon";
    }

    public int p() {
        return 0;
    }

    public void q(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        r45.i16 i16Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        boolean m76500x926ea36a = infoEx.f534767a.m76500x926ea36a();
        xc2.n nVar = xc2.n.f534745a;
        android.content.Context context = holder.f374654e;
        if (m76500x926ea36a) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = infoEx.f534777f;
            if (abstractC14490x69736cb5 != null) {
                long mo2128x1ed62e84 = abstractC14490x69736cb5.mo2128x1ed62e84();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                sc2.a8 a8Var = (sc2.a8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(sc2.a8.class);
                i16Var = a8Var != null ? a8Var.V6(mo2128x1ed62e84) : null;
            } else {
                i16Var = null;
            }
            if (i16Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseJumperEventHandler", "get AdExtraInfoByFeedId null onClick");
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            xc2.n.b(nVar, context, jumpView, infoEx, p(), o(), null, n(infoEx), i16Var, 32, null);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            xc2.n.b(nVar, context, jumpView, infoEx, p(), o(), null, n(infoEx), null, 160, null);
        }
        infoEx.f534774d0 = null;
    }

    public void r(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 info = infoEx.f534767a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        boolean z17 = info.m76480xe2ee1ca3() == 8 || info.m76516x2a6227ad() > 0;
        android.content.Context context = holder.f374654e;
        if (z17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            java.lang.Integer valueOf = nyVar != null ? java.lang.Integer.valueOf(nyVar.f216913n) : null;
            infoEx.f534786o = "commentScene=" + valueOf + "&isFromComment=" + (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(infoEx.f534780i, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37641x4a9d0f2f) ? 1 : 0) + "&finderJumpId=" + info.m76501xf2fd2296();
            java.lang.String m76501xf2fd2296 = info.m76501xf2fd2296();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = infoEx.f534777f;
            if (m76501xf2fd2296 != null && abstractC14490x69736cb5 != null) {
                sd2.a.f488212a.put(m76501xf2fd2296, abstractC14490x69736cb5);
            }
        }
        java.lang.Object obj = holder.f374658i;
        if (obj instanceof so2.y0) {
            so2.y0 y0Var = (so2.y0) obj;
            if (y0Var.f492236d.a1()) {
                int i17 = infoEx.f534790s == 32 ? 154 : 138;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u) a17).Q6(holder, y0Var, false, i17);
                return;
            }
            if (y0Var.f492236d.i1()) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                pf5.z zVar2 = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                p012xc85e97e9.p093xedfae76a.c1 a18 = zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x) a18).P6(pm0.v.u(y0Var.f492236d.f68959xf9a02e3e), 3);
            }
        }
    }

    public final void s() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622;
        if (!u()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseJumperEventHandler", "not preload, shouldPreload()=" + u());
            return;
        }
        boolean t17 = t();
        jz5.g gVar = this.f534697d;
        jz5.g gVar2 = this.f534698e;
        int i17 = 0;
        if (t17) {
            ((android.os.Handler) ((jz5.n) gVar2).mo141623x754a37bb()).post((java.lang.Runnable) ((jz5.n) gVar).mo141623x754a37bb());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("post preloadRunnable by play progress, delayPreloadTime=");
            xc2.p0 p0Var = this.f534695b;
            if (p0Var != null && (c19786x6a1e28622 = p0Var.f534767a) != null) {
                i17 = c19786x6a1e28622.m76483x88dada75();
            }
            sb6.append(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseJumperEventHandler", sb6.toString());
            return;
        }
        xc2.p0 p0Var2 = this.f534695b;
        if (p0Var2 != null && (c19786x6a1e2862 = p0Var2.f534767a) != null) {
            i17 = c19786x6a1e2862.m76483x88dada75();
        }
        long j17 = i17 * 1000;
        ((android.os.Handler) ((jz5.n) gVar2).mo141623x754a37bb()).postDelayed((java.lang.Runnable) ((jz5.n) gVar).mo141623x754a37bb(), j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseJumperEventHandler", "post preloadRunnable by expose time delayPreloadTime=" + j17 + "ms");
    }

    public final boolean t() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209189d8).mo141623x754a37bb()).r()).booleanValue();
    }

    public boolean u() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        xc2.p0 p0Var = this.f534695b;
        if (p0Var == null || (c19786x6a1e2862 = p0Var.f534767a) == null) {
            return false;
        }
        return c19786x6a1e2862.m76508x32cb39d6();
    }
}
