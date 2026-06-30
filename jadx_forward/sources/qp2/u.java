package qp2;

/* loaded from: classes2.dex */
public final class u implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qp2.y f447336d;

    public u(qp2.y yVar) {
        this.f447336d = yVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        oa.i iVar;
        java.lang.Object obj2;
        java.lang.String s07;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 z9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = z9Var.f186862c;
        if (jbVar == null || (gVar = jbVar.f65874xb5f7102a.f470021f) == null) {
            return;
        }
        r45.xs2 xs2Var = new r45.xs2();
        byte[] bArr = gVar.f273689a;
        java.lang.String str = "";
        if (bArr != null) {
            try {
                xs2Var.mo11468x92b714fd(bArr);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
        }
        int m75939xb282bd08 = xs2Var.m75939xb282bd08(12);
        qp2.y yVar = this.f447336d;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff R6 = yVar.R6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(R6, "access$getTabLayout(...)");
        java.lang.Integer any = java.lang.Integer.valueOf(m75939xb282bd08);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(any, "any");
        int m20353x443e53f0 = R6.m20353x443e53f0();
        int i17 = 0;
        while (true) {
            if (i17 >= m20353x443e53f0) {
                iVar = null;
                break;
            }
            iVar = R6.k(i17);
            if ((iVar != null ? iVar.f425311a : null) instanceof qp2.i) {
                java.lang.Object obj3 = iVar.f425311a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.live.square.tab.NearbyLiveSquareTabLayoutUIC.NearbyTab");
                if (((qp2.i) obj3).f447319c == any.intValue()) {
                    break;
                }
            }
            i17++;
        }
        if (iVar == null || (obj2 = iVar.f425311a) == null) {
            return;
        }
        qp2.i iVar2 = (qp2.i) obj2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("registerRedDot tabId:");
        sb6.append(m75939xb282bd08);
        sb6.append(" isShow=");
        boolean z17 = z9Var.f186860a;
        sb6.append(java.lang.Boolean.valueOf(z17));
        sb6.append(" show_type=");
        r45.f03 f03Var = z9Var.f186861b;
        sb6.append(f03Var != null ? java.lang.Integer.valueOf(f03Var.f455420d) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareTabLayoutUIC", sb6.toString());
        boolean z18 = z17;
        android.widget.ImageView imageView = iVar2.f447321e;
        if (!z18) {
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(4);
            return;
        }
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 P6 = yVar.P6();
        if (P6 != null && (s07 = P6.s0()) != null) {
            str = s07;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ga gaVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ha.f187090a;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = yVar.m158358x197d1fc6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m158358x197d1fc6);
        gaVar.n(1, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(m158358x197d1fc6).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6(), 0, str);
    }
}
