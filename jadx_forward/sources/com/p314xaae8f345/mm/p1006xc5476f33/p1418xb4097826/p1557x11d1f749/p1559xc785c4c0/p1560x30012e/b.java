package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e;

/* loaded from: classes2.dex */
public final class b extends dw2.o {

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.f f202435v;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.f contract) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contract, "contract");
        this.f202435v = contract;
    }

    @Override // dw2.o
    public void e(java.util.Set otherCareType, boolean z17, java.lang.String invokeSource) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p0 p0Var;
        jz5.f0 f0Var2;
        jz5.f0 f0Var3;
        java.util.LinkedList<r45.mb4> m59135x7efe73ec;
        r45.mb4 mb4Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(otherCareType, "otherCareType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeSource, "invokeSource");
        ((xn2.x) this.f202435v).getClass();
        if (!(!vn2.u0.f519920a.g() || kd2.p1.N.a().F0() == 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f325669a, "checkSelectedInternal(megaVideo) but disable select.");
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f325671c;
        if (c1163xf1deaba4 != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
            if (!(layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f325669a, "checkSelectedInternal(megaVideo) return for layoutManager must be LinearLayoutManager.");
                return;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
            int t17 = c1162x665295de.t();
            int x17 = c1162x665295de.x();
            if (t17 < 0 || x17 < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f325669a, "checkSelectedInternal(megaVideo) firstCompleteVisiblePosition=" + t17 + ",lastCompleteVisiblePosition=" + x17 + '.');
                super.e(otherCareType, z17, invokeSource);
                return;
            }
            jz5.f0 f0Var4 = jz5.f0.f384359a;
            if (t17 <= x17) {
                int i17 = t17;
                while (true) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 q07 = c1163xf1deaba4.q0(i17, false);
                    in5.s0 s0Var = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
                    if (s0Var != null) {
                        java.lang.Object obj = s0Var.f374658i;
                        zn2.a aVar = obj instanceof zn2.a ? (zn2.a) obj : null;
                        if (aVar != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 o17 = o(aVar);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p0 p0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p0(false, 0L, null, null, null, 0, 0, null, null, 511, null);
                            p0Var2.f183976f = 4;
                            p0Var2.f183977g = i17;
                            p0Var2.f183978h = s0Var;
                            p0Var2.f183972b = aVar.mo2128x1ed62e84();
                            p0Var2.f183973c = aVar.w();
                            p0Var2.f183975e = o17;
                            p0Var2.f183979i = aVar;
                            android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.f566402fs3);
                            java.util.LinkedList<r45.mb4> m59135x7efe73ec2 = o17 != null ? o17.m59135x7efe73ec() : null;
                            if (p17 == null || m59135x7efe73ec2 == null) {
                                f0Var3 = null;
                            } else {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15229x2dc379 abstractC15229x2dc379 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15229x2dc379) p17;
                                if (abstractC15229x2dc379.getFocusPosition() >= 0 && abstractC15229x2dc379.getFocusPosition() < m59135x7efe73ec2.size()) {
                                    r45.mb4 mb4Var2 = (r45.mb4) kz5.n0.a0(m59135x7efe73ec2, abstractC15229x2dc379.getFocusPosition());
                                    java.lang.String m75945x2fec8307 = mb4Var2 != null ? mb4Var2.m75945x2fec8307(9) : null;
                                    if (m75945x2fec8307 == null) {
                                        m75945x2fec8307 = "";
                                    }
                                    p0Var2.f183974d = m75945x2fec8307;
                                }
                                f0Var3 = f0Var4;
                            }
                            if (f0Var3 == null) {
                                java.lang.String m75945x2fec83072 = (o17 == null || (m59135x7efe73ec = o17.m59135x7efe73ec()) == null || (mb4Var = (r45.mb4) kz5.n0.a0(m59135x7efe73ec, 0)) == null) ? null : mb4Var.m75945x2fec8307(9);
                                p0Var2.f183974d = m75945x2fec83072 != null ? m75945x2fec83072 : "";
                            }
                            p0Var = p0Var2;
                        }
                    }
                    if (i17 == x17) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            p0Var = null;
            if (p0Var != null) {
                kz2.c cVar = this.f325678j;
                cVar.a("begin(megaVideo)");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f325669a, "checkSelectedInternal(megaVideo) forceCheckSame:" + z17 + " [" + t17 + '~' + x17 + "] centerFeed=" + p0Var + " from invoke:" + invokeSource);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p0.a(p0Var, false, 0L, null, null, null, 0, 0, null, null, 511, null));
                cVar.c("findSelectedFeed end");
                p0Var.f183980j.addAll(linkedList);
                if (m(p0Var, "checkPublishFocusView(megaVideo)")) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f325671c;
                    if (c1163xf1deaba42 != null) {
                        n(c1163xf1deaba42, p0Var.f183972b);
                    }
                    android.content.Context context = c1163xf1deaba4.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    pf5.z zVar = pf5.z.f435481a;
                    if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    fc2.o Z6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).Z6(this.f325672d);
                    if (Z6 != null) {
                        fc2.v vVar = new fc2.v(1);
                        vVar.f342531e = p0Var.f183977g;
                        vVar.f342532f = p0Var.f183972b;
                        c1163xf1deaba4.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.a(Z6, vVar));
                    }
                }
                g(p0Var);
                if (z17 && m(p0Var, "checkSame") && this.f325675g.f183972b == p0Var.f183972b) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f325669a, "checkSelectedInternal(megaVideo) return for selected same feed:" + this.f325675g);
                    return;
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7946xf939df19, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerAdapter<*>");
                java.util.List m82898xfb7e5820 = ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19).m82898xfb7e5820();
                i(m82898xfb7e5820, this.f325675g);
                h(m82898xfb7e5820, p0Var);
                cVar.b("end(megaVideo)");
                f0Var2 = f0Var4;
            } else {
                f0Var2 = null;
            }
            if (f0Var2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f325669a, "checkSelectedInternal(megaVideo) fail,otherCareType=" + otherCareType + " forceCheckSame:" + z17 + " [" + t17 + '~' + x17 + "] from invoke:" + invokeSource);
                super.e(otherCareType, z17, invokeSource);
                return;
            }
            f0Var = f0Var4;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f325669a, "checkSelectedInternal(megaVideo) return for recyclerView:" + this.f325671c);
        }
    }
}
