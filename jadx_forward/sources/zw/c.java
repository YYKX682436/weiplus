package zw;

/* loaded from: classes7.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f558024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f558025e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f558026f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f558027g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f558028h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, long j17, java.util.LinkedList linkedList, yz5.l lVar, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f558024d = u3Var;
        this.f558025e = j17;
        this.f558026f = linkedList;
        this.f558027g = lVar;
        this.f558028h = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zw.c(this.f558024d, this.f558025e, this.f558026f, this.f558027g, this.f558028h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        zw.c cVar = (zw.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        cVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        long j17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f558024d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterSelectPhotoHandler", "handleMultiMediaResult finished, total cost: " + (java.lang.System.currentTimeMillis() - this.f558025e) + "ms, processed " + this.f558026f.size() + " items");
        java.util.LinkedList linkedList = this.f558026f;
        zw.o oVar = zw.o.f558069a;
        int i17 = this.f558028h;
        if (i17 != 1) {
            if (i17 == 2) {
                j17 = 1;
            } else if (i17 == 3) {
                j17 = 2;
            }
            this.f558027g.mo146xb9724478(new com.p314xaae8f345.p2845xc516c4b6.biz.C23131x583ece12(linkedList, null, null, new java.lang.Long(j17), 6, null));
            return jz5.f0.f384359a;
        }
        j17 = 0;
        this.f558027g.mo146xb9724478(new com.p314xaae8f345.p2845xc516c4b6.biz.C23131x583ece12(linkedList, null, null, new java.lang.Long(j17), 6, null));
        return jz5.f0.f384359a;
    }
}
