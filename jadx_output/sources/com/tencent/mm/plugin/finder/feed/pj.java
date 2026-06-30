package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class pj extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f108726a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xj f108727b;

    public pj(com.tencent.mm.plugin.finder.feed.xj xjVar) {
        this.f108727b = xjVar;
    }

    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        java.util.HashSet hashSet;
        com.tencent.mm.plugin.finder.feed.xj xjVar;
        java.lang.String str;
        fc2.q f76;
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(exposedHolders, "exposedHolders");
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.Iterator it = exposedHolders.iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            hashSet = this.f108726a;
            xjVar = this.f108727b;
            if (!hasNext) {
                break;
            }
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
            in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
            if (s0Var != null) {
                java.lang.Object obj = s0Var.f293125i;
                so2.u1 u1Var = obj instanceof so2.u1 ? (so2.u1) obj : null;
                if (u1Var != null) {
                    hashSet2.add(java.lang.Long.valueOf(u1Var.getItemId()));
                    if (!hashSet.contains(java.lang.Long.valueOf(u1Var.getItemId()))) {
                        androidx.recyclerview.widget.f2 f2Var = s0Var.f293122f;
                        in5.n0 n0Var = f2Var instanceof in5.n0 ? (in5.n0) f2Var : null;
                        int adapterPosition = s0Var.getAdapterPosition();
                        int a07 = n0Var != null ? adapterPosition - n0Var.a0() : adapterPosition - 1;
                        if (i17 < a07) {
                            i17 = a07;
                        }
                        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
                        com.tencent.mm.ui.MMActivity context = xjVar.f111072a;
                        kotlin.jvm.internal.o.g(context, "context");
                        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("feedid", pm0.v.u(xjVar.f111073b.f109084v));
                        jSONObject.put("feed_location_id", a07);
                        r45.ru2 flow_card_recommand_reason = u1Var.getFeedObject().getFeedObject().getFlow_card_recommand_reason();
                        if (flow_card_recommand_reason == null || (str = flow_card_recommand_reason.getString(0)) == null) {
                            str = "";
                        }
                        jSONObject.put("recommend_reason", str);
                        com.tencent.mm.plugin.finder.report.b6.d(b6Var, V6, "more_recommend_feed", 0, jSONObject, false, null, 48, null);
                        com.tencent.mm.ui.MMActivity context2 = xjVar.f111072a;
                        kotlin.jvm.internal.o.g(context2, "context");
                        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                        if (nyVar2 != null && (f76 = nyVar2.f7()) != null) {
                            fc2.s sVar = new fc2.s(1);
                            sVar.f260981e = u1Var;
                            f76.a(sVar);
                        }
                    }
                }
            }
        }
        ao2.a aVar = xjVar.f111073b.f109070e;
        if (aVar != null) {
            aVar.f("ViewIdRelatedFeed", i17);
        }
        hashSet.clear();
        hashSet.addAll(hashSet2);
    }
}
