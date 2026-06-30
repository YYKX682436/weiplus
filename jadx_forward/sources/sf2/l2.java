package sf2;

/* loaded from: classes10.dex */
public final class l2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f488729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f488730e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f488729d = hVar;
        this.f488730e = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sf2.l2(this.f488729d, interfaceC29045xdcb5ca57, this.f488730e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        sf2.l2 l2Var = (sf2.l2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        l2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        java.util.LinkedList<r45.yx1> linkedList;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.gx1 gx1Var = (r45.gx1) ((xg2.i) this.f488729d).f535926b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveKtvGetSongListRequest success, songToSing ");
        r45.zx1 zx1Var = gx1Var.f457126d;
        if (zx1Var == null || (linkedList = zx1Var.f473985d) == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (r45.yx1 yx1Var : linkedList) {
                arrayList.add(yx1Var.f472991d + ": " + yx1Var.f472999o.f452676d.f451884e + ", status " + yx1Var.f472997m);
            }
        }
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongController", sb6.toString());
        this.f488730e.f391656d = gx1Var;
        return jz5.f0.f384359a;
    }
}
