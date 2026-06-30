package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes12.dex */
public final class gy extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f200013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14411xc4c352f7 f200014e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f200015f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14411xc4c352f7 c14411xc4c352f7, r45.xn1 xn1Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f200013d = hVar;
        this.f200014e = c14411xc4c352f7;
        this.f200015f = xn1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gy(this.f200013d, interfaceC29045xdcb5ca57, this.f200014e, this.f200015f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gy gyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gy) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        gyVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.LinkedList m75941xfb821914;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.t41 t41Var = (r45.t41) ((xg2.i) this.f200013d).f535926b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14411xc4c352f7 c14411xc4c352f7 = this.f200014e;
        java.lang.String str = c14411xc4c352f7.f199226d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showDetailWidget success nick: ");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) this.f200015f.m75936x14adae67(0);
        sb6.append(c19782x23db1cfa != null ? c19782x23db1cfa.m76184x8010e5e4() : null);
        sb6.append(" audience_live_info: ");
        r45.mu0 mu0Var = (r45.mu0) t41Var.m75936x14adae67(1);
        sb6.append(mu0Var != null ? mu0Var.mo12245xcc313de3() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        r45.mu0 mu0Var2 = (r45.mu0) t41Var.m75936x14adae67(1);
        if (mu0Var2 != null && (m75941xfb821914 = mu0Var2.m75941xfb821914(0)) != null) {
            if (m75941xfb821914.size() > 0) {
                c14411xc4c352f7.getClass();
                if (m75941xfb821914.size() > 0) {
                    android.view.View view = c14411xc4c352f7.f199228f;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorActiveDetailWidget", "showItemWidget", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorActiveDetailWidget", "showItemWidget", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    c14411xc4c352f7.f199229g.setVisibility(0);
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.k kVar = c14411xc4c352f7.f199230h.f93733d;
                    int i17 = kVar.f93639f + 1;
                    kVar.f93639f = i17;
                    java.util.List list = kVar.f93637d;
                    if (m75941xfb821914 != list) {
                        if (list == null) {
                            kVar.f93637d = m75941xfb821914;
                            kVar.f93638e = java.util.Collections.unmodifiableList(m75941xfb821914);
                            kVar.f93634a.b(0, m75941xfb821914.size());
                        } else {
                            kVar.f93635b.f93550a.execute(new p012xc85e97e9.p103xe821e364.p104xd1075a44.i(kVar, list, m75941xfb821914, i17));
                        }
                    }
                } else {
                    c14411xc4c352f7.setVisibility(8);
                }
            } else {
                c14411xc4c352f7.setVisibility(8);
            }
        }
        return jz5.f0.f384359a;
    }
}
