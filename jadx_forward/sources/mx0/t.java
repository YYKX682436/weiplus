package mx0;

/* loaded from: classes5.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f413860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413861e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.yy3 f413862f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f413863g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f413864h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.lang.String str, r45.yy3 yy3Var, long j17, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413861e = str;
        this.f413862f = yy3Var;
        this.f413863g = j17;
        this.f413864h = c4128x879fba0a;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.t(this.f413861e, this.f413862f, this.f413863g, this.f413864h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.t) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.LinkedList m75941xfb821914;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f413860d;
        java.lang.String str = this.f413861e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.util.List list = (java.util.List) mx0.u.f413894a.get(str);
            if (list != null) {
                return list;
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = mx0.u.f413894a;
            this.f413860d = 1;
            com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            r45.tv0 tv0Var = new r45.tv0();
            r45.yy3 yy3Var = this.f413862f;
            tv0Var.set(1, java.lang.Integer.valueOf(yy3Var.f473032d));
            long j17 = this.f413863g;
            tv0Var.set(2, java.lang.Long.valueOf(j17));
            lVar.f152197a = tv0Var;
            lVar.f152198b = new r45.uv0();
            lVar.f152200d = 19044;
            lVar.f152199c = "/cgi-bin/micromsg-bin/finderbgmgetlyric";
            lVar.f152201e = 0;
            lVar.f152202f = 0;
            iVar.p(lVar.a());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderBgmGetLyric", "type: " + yy3Var + " musicId: " + j17 + ' ');
            obj = rm0.h.b(iVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        kz5.p0 p0Var = null;
        if (fVar.b()) {
            r45.oo6 oo6Var = (r45.oo6) ((r45.uv0) fVar.f152151d).m75936x14adae67(1);
            if (oo6Var == null || (m75941xfb821914 = oo6Var.m75941xfb821914(0)) == null) {
                p0Var = kz5.p0.f395529d;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int size = m75941xfb821914.size();
                int i18 = 0;
                while (i18 < size) {
                    com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33967x6fa736dc = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33967x6fa736dc(((r45.h06) m75941xfb821914.get(i18)).m75942xfb822ef2(1));
                    int i19 = i18 + 1;
                    com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m33967x6fa736dc2 = i19 < m75941xfb821914.size() ? com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33967x6fa736dc(((r45.h06) m75941xfb821914.get(i19)).m75942xfb822ef2(1)) : this.f413864h;
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ((r45.h06) m75941xfb821914.get(i18)).m75934xbce7f2f(0);
                    java.lang.String i27 = m75934xbce7f2f != null ? m75934xbce7f2f.i() : null;
                    if (i27 == null) {
                        i27 = "";
                    }
                    arrayList.add(new com.p314xaae8f345.p457x3304c6.p477x633fb29.C4114xcb0ccc90(m33967x6fa736dc, m33967x6fa736dc2, i27, ""));
                    i18 = i19;
                }
                p0Var = arrayList;
            }
        }
        if (p0Var != null) {
            mx0.u.f413894a.put(str, p0Var);
        }
        return p0Var;
    }
}
