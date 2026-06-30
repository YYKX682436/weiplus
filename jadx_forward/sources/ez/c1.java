package ez;

/* loaded from: classes4.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f339247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f339248e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f339249f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ez.f1 f339250g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(long j17, int i17, ez.f1 f1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f339248e = j17;
        this.f339249f = i17;
        this.f339250g = f1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ez.c1(this.f339248e, this.f339249f, this.f339250g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ez.c1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f339247d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doCgi] syncKey = ");
            long j17 = this.f339248e;
            sb6.append(j17);
            sb6.append(", scene = ");
            int i18 = this.f339249f;
            sb6.append(i18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMTypingFeatureService", sb6.toString());
            r45.xq xqVar = new r45.xq();
            xqVar.f471860d = j17;
            xqVar.f471861e = i18;
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152200d = 17849;
            lVar.f152199c = "/cgi-bin/micromsg-bin/bypinfosynctypingcontactticket";
            lVar.f152197a = xqVar;
            lVar.f152198b = new r45.yq();
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
            iVar.p(a17);
            this.f339247d = 1;
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
        if (fVar.b()) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[doCgi] callback Success synckey_value = ");
            sb7.append(((r45.yq) fVar.f152151d).f472819e);
            sb7.append(" , synclistSiez = ");
            java.util.LinkedList linkedList = ((r45.yq) fVar.f152151d).f472820f;
            sb7.append(linkedList != null ? new java.lang.Integer(linkedList.size()) : null);
            sb7.append(", continue = ");
            sb7.append(((r45.yq) fVar.f152151d).f472818d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMTypingFeatureService", sb7.toString());
            java.util.LinkedList<r45.wq> linkedList2 = ((r45.yq) fVar.f152151d).f472820f;
            ez.f1 f1Var = this.f339250g;
            if (linkedList2 != null) {
                for (r45.wq wqVar : linkedList2) {
                    try {
                        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) f1Var.f339262d).mo141623x754a37bb()).H(wqVar.f470915d, wqVar.f470916e.g());
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(java.util.Arrays.toString(wqVar.f470916e.g()), "toString(...)");
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MMTypingFeatureService", th6, "mmkv  encode err", new java.lang.Object[0]);
                    }
                }
            }
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_BYP_INFO_KEY_LONG_SYNC, new java.lang.Long(((r45.yq) fVar.f152151d).f472819e));
            r45.yq yqVar = (r45.yq) fVar.f152151d;
            if (yqVar.f472818d != 0) {
                ez.f1.wi(f1Var, yqVar.f472819e, 4);
            }
        }
        return jz5.f0.f384359a;
    }
}
