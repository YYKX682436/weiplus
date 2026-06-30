package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class wl extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 {
    public final int A;
    public final r45.gk4 B;
    public android.view.View C;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.q D;
    public final int E;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f192529u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f192530v;

    /* renamed from: w, reason: collision with root package name */
    public final int f192531w;

    /* renamed from: x, reason: collision with root package name */
    public final int f192532x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f192533y;

    /* renamed from: z, reason: collision with root package name */
    public final int f192534z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wl(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf r14, int r15, int r16, boolean r17, java.lang.String r18, java.lang.String r19, int r20, int r21, java.lang.String r22, int r23, int r24, r45.gk4 r25, int r26, p3321xbce91901.jvm.p3324x21ffc6bd.i r27) {
        /*
            r13 = this;
            r9 = r13
            r10 = r18
            r11 = r19
            r12 = r22
            r0 = r26 & 8
            if (r0 == 0) goto Le
            r0 = 0
            r4 = r0
            goto L10
        Le:
            r4 = r17
        L10:
            java.lang.String r0 = "context"
            r1 = r14
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r14, r0)
            java.lang.String r0 = "finderAuthorUsername"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            java.lang.String r0 = "finderMemberTicket"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r11, r0)
            java.lang.String r0 = "memberTitle"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r0)
            r5 = 0
            r6 = 0
            r7 = 48
            r8 = 0
            r0 = r13
            r2 = r15
            r3 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f192529u = r10
            r9.f192530v = r11
            r0 = r20
            r9.f192531w = r0
            r0 = r21
            r9.f192532x = r0
            r9.f192533y = r12
            r0 = r23
            r9.f192534z = r0
            r0 = r24
            r9.A = r0
            r0 = r25
            r9.B = r0
            r0 = 10000002(0x989682, float:1.4012987E-38)
            r9.E = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.wl.<init>(com.tencent.mm.ui.MMActivity, int, int, boolean, java.lang.String, java.lang.String, int, int, java.lang.String, int, int, r45.gk4, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public java.lang.CharSequence B(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void J(in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.ViewGroup.LayoutParams layoutParams = holder.f3639x46306858.getLayoutParams();
        if (layoutParams == null || !(layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams)) {
            return;
        }
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) layoutParams).f93474i = holder.m8185xcdaf1228() == this.E;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public void K(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 < 0 || a07 >= z().f188689e.m56393xfb854877()) {
            return;
        }
        so2.j5 j5Var = (so2.j5) z().f188689e.m56388xcaeb60d0().get(a07);
        if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56348xdbd6b4a2(z().f188689e, intent, a07, null, 4, null);
            wa2.x.e(intent, view, 0L, false, false, wa2.u.Ui(wa2.u.f525714d, m56022x4905e9fa(), ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().m59251x5db1b11(), z().f188689e.m56388xcaeb60d0(), null, 8, null), 14, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            android.content.Context context = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            i0Var.Tj(context, intent, this.f192529u, this.f192530v, this.f192531w, this.f192532x, this.f192533y, java.lang.Integer.valueOf(this.f192534z), java.lang.Integer.valueOf(this.A), 0, 0);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f187707d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            long mo2128x1ed62e84 = j5Var.mo2128x1ed62e84();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
            java.lang.String w17 = abstractC14490x69736cb5.w();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa = this.f187713m.m82555x4905e9fa();
            java.lang.String jSONObject = abstractC14490x69736cb5.getUdfKv().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.wj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17, V6, mo2128x1ed62e84, w17, m82555x4905e9fa, 0, r26.i0.t(jSONObject, ",", ";", false), i17, null, 144, null);
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
    public void r(java.util.ArrayList data) {
        android.view.View m17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        super.r(data);
        r45.gk4 gk4Var = this.B;
        if (gk4Var != null) {
            this.D = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.b(this.f187707d, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.g(gk4Var), this.f192529u);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.q qVar = this.D;
        if ((qVar != null ? qVar.mo58632xfb86a31b() : null) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.q qVar2 = this.D;
            if (qVar2 != null && qVar2.mo58633x29831964()) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = m56022x4905e9fa().mo7946xf939df19();
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
                if (c22848x6ddd90cf == null || ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7()) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.q qVar3 = this.D;
                if (qVar3 != null && (m17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.q.m(qVar3, 0, 1, null)) != null) {
                    in5.n0.U(c22848x6ddd90cf, m17, this.E, false, 4, null);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.q qVar4 = this.D;
                if (qVar4 != null) {
                    qVar4.l();
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public java.lang.String s(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public android.view.View t() {
        android.view.View view = this.C;
        return view == null ? this.f187707d.findViewById(com.p314xaae8f345.mm.R.id.f565762dg3) : view;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public android.view.View w() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 x() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.jj0) this.f187717q).getClass();
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ij0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager y(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return this.f187717q.d(context);
    }
}
