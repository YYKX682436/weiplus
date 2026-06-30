package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b;

/* loaded from: classes2.dex */
public final class u implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f203754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.d0 f203755e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f203756f;

    public u(java.util.ArrayList arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.d0 d0Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f203754d = arrayList;
        this.f203755e = d0Var;
        this.f203756f = c1163xf1deaba4;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.d0 d0Var;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        int a07 = ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) adapter).a0();
        if (i17 < a07) {
            return;
        }
        int i18 = i17 - a07;
        java.util.ArrayList arrayList = this.f203754d;
        java.lang.Object obj = arrayList.get(i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        so2.j5 j5Var = (so2.j5) obj;
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(iyVar, context, intent, 0L, null, 0, 0, false, 0, null, 508, null);
        so2.j5 j5Var2 = (so2.j5) kz5.n0.a0(arrayList, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.d0 d0Var2 = this.f203755e;
        d0Var2.f203713i = i18;
        boolean z18 = j5Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = z18 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var2 : null;
        if (abstractC14490x69736cb5 != null) {
            java.util.ArrayList arrayList2 = this.f203754d;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f203756f;
            if (abstractC14490x69736cb5.getFeedObject().m59311x25315bf4()) {
                cp2.u1 u1Var = d0Var2.f203714m;
                java.lang.String m75945x2fec8307 = d0Var2.a().m75945x2fec8307(1);
                java.lang.String str = m75945x2fec8307 == null ? "" : m75945x2fec8307;
                java.lang.String m75945x2fec83072 = d0Var2.a().m75945x2fec8307(2);
                z17 = z18;
                cp2.u1.d(u1Var, j5Var, i17, i18, view, arrayList2, str, m75945x2fec83072 == null ? "" : m75945x2fec83072, c1163xf1deaba4, 0L, 256, null);
                d0Var = d0Var2;
            } else {
                z17 = z18;
                intent.putExtra("feed_object_id", abstractC14490x69736cb5.mo2128x1ed62e84());
                intent.putExtra("feed_object_nonceId", abstractC14490x69736cb5.getFeedObject().m59276x6c285d75());
                intent.putExtra("tab_type", 10);
                intent.putExtra("key_reuqest_scene", 17);
                intent.putExtra("key_comment_scene", 16);
                intent.putExtra("key_from_comment_scene", 15);
                wa2.u uVar = wa2.u.f525714d;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m58532x4905e9fa = d0Var2.m58532x4905e9fa();
                long mo2128x1ed62e84 = abstractC14490x69736cb5.mo2128x1ed62e84();
                d0Var = d0Var2;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.a aVar = d0Var.f203710f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter");
                wa2.x.e(intent, view, 0L, false, false, wa2.u.Ui(uVar, m58532x4905e9fa, mo2128x1ed62e84, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.C14577x913488ec) aVar).getFeedLoader().m56388xcaeb60d0(), null, 8, null), 14, null);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).tk(d0Var.f203708d, intent, ac1.g.f19x366c91de, false);
            }
        } else {
            z17 = z18;
            d0Var = d0Var2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 fragment = d0Var.f203709e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(fragment).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar != null) {
            r45.qt2 V6 = nyVar.V6();
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
            long mo2128x1ed62e842 = j5Var.mo2128x1ed62e84();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = z17 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var2 : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.wj(o3Var, V6, mo2128x1ed62e842, abstractC14490x69736cb52 != null ? abstractC14490x69736cb52.w() : null, d0Var.g().m82555x4905e9fa(), 0, null, 0L, null, 240, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0.f206642a.b(V6, j5Var, 18);
        }
    }
}
