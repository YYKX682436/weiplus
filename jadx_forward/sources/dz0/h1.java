package dz0;

/* loaded from: classes5.dex */
public final class h1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b f326401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f326402e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f326401d = c11015x5b190a3b;
        this.f326402e = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dz0.h1(this.f326401d, this.f326402e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        dz0.h1 h1Var = (dz0.h1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        h1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        ig.n f17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        az0.n7 n7Var = this.f326401d.f151316d;
        if (n7Var != null && (f17 = n7Var.f()) != null) {
            bz0.j jVar = bz0.j.f118283a;
            java.util.List<com.p314xaae8f345.p457x3304c6.p477x633fb29.C4121xb12fb285> list = this.f326402e;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (com.p314xaae8f345.p457x3304c6.p477x633fb29.C4121xb12fb285 c4121xb12fb285 : list) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("tid", c4121xb12fb285.m33907x3bfa570b());
                if (f17.mo135777x3d7883fe().contains(c4121xb12fb285.m33907x3bfa570b())) {
                    jSONObject.put("src", 1);
                } else {
                    jSONObject.put("src", 2);
                }
                arrayList.add(jSONObject);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.MaasReport25621", "markRecommendListJson: size=" + arrayList.size());
            java.util.ArrayList arrayList2 = (java.util.ArrayList) bz0.j.f118289g;
            arrayList2.addAll(bz0.j.f118288f);
            arrayList2.addAll(arrayList);
        }
        return jz5.f0.f384359a;
    }
}
