package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class mv extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f216744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f216745e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pv f216746f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f216747g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f216748h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.g f216749i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f216750m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv(com.p314xaae8f345.mm.p944x882e457a.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pv pvVar, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f216745e = fVar;
        this.f216746f = pvVar;
        this.f216747g = str;
        this.f216748h = str2;
        this.f216749i = gVar;
        this.f216750m = c14994x9b99c079;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mv(this.f216745e, this.f216746f, this.f216747g, this.f216748h, this.f216749i, this.f216750m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mv) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.b23 b23Var;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f216744d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f216745e;
            r45.c23 c23Var = ((r45.s13) fVar.f152151d).f466931z;
            java.lang.Object obj3 = null;
            if (c23Var == null || (linkedList2 = c23Var.f452773d) == null) {
                b23Var = null;
            } else {
                java.util.Iterator it = linkedList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (((r45.b23) obj2).f451982d == 2) {
                        break;
                    }
                }
                b23Var = (r45.b23) obj2;
            }
            if (b23Var != null) {
                java.lang.String str = this.f216747g;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pv pvVar = this.f216746f;
                pvVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfilePreloadUIC", "requestUserPage:" + str + ", source:" + this.f216748h);
                bq.z1 z1Var = pvVar.f217165h;
                if (z1Var != null) {
                    z1Var.j();
                }
                i95.m c17 = i95.n0.c(cq.k.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                cq.k kVar = (cq.k) c17;
                r45.qt2 P6 = pvVar.P6(str);
                r45.y13 y13Var = new r45.y13();
                y13Var.set(1, 1);
                y13Var.set(0, this.f216749i);
                android.content.ComponentCallbacks2 m80379x76847179 = pvVar.m80379x76847179();
                pvVar.f217165h = cq.j1.n(kVar, str, 0L, null, 0, P6, 0, 0L, false, null, 0L, null, null, null, false, true, null, true, null, y13Var, m80379x76847179 instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) m80379x76847179 : null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ov(str), null, 5423086, null);
            }
            r45.c23 c23Var2 = ((r45.s13) fVar.f152151d).f466931z;
            if (c23Var2 != null && (linkedList = c23Var2.f452773d) != null) {
                java.util.Iterator it6 = linkedList.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it6.next();
                    if (((r45.b23) next).f451982d == 1) {
                        obj3 = next;
                        break;
                    }
                }
                obj3 = (r45.b23) obj3;
            }
            if (obj3 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pv pvVar2 = this.f216746f;
                java.lang.String str2 = this.f216747g;
                java.lang.String str3 = this.f216748h;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f216750m;
                com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f216749i;
                this.f216744d = 1;
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pv.O6(pvVar2, str2, str3, c14994x9b99c079, gVar, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
