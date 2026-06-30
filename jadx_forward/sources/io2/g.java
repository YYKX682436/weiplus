package io2;

/* loaded from: classes2.dex */
public final class g implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io2.i f375008d;

    public g(io2.i iVar) {
        this.f375008d = iVar;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        java.lang.String str;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa<T> m56388xcaeb60d0 = this.f375008d.f375010d.m56388xcaeb60d0();
        if (i17 >= 0 && i17 < m56388xcaeb60d0.size()) {
            java.lang.Object obj = m56388xcaeb60d0.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderMemberCardData");
            so2.j3 j3Var = (so2.j3) obj;
            android.content.Intent intent = new android.content.Intent();
            j3Var.f491974d.f472571h = null;
            j3Var.f491975e = null;
            adapter.m8147xed6e4d18(i17);
            intent.putExtra("key_member_inlet_source", 8);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            android.content.Context context = holder.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            r45.yf2 yf2Var = j3Var.f491974d;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = yf2Var.f472567d;
            if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76197x6c03c64c()) == null) {
                str = "";
            }
            i0Var.Nk(context, intent, str, 0, 0);
            cl0.g gVar = new cl0.g();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = yf2Var.f472567d;
            gVar.h("finderusername", c19782x23db1cfa2 != null ? c19782x23db1cfa2.m76197x6c03c64c() : null);
            gVar.h("tabtype", "会员专区");
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
            java.lang.String gVar2 = gVar.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.Mj(o3Var, context, 16L, 1L, false, 0, 0, r26.i0.t(gVar2, ",", ";", false), 56, null);
        }
    }
}
