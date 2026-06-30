package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class vl extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f217787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.zl f217788e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f217789f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.zl zlVar, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f217787d = z17;
        this.f217788e = zlVar;
        this.f217789f = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.vl(this.f217787d, this.f217788e, this.f217789f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.vl vlVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.vl) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        vlVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean z17 = this.f217787d;
        java.util.List list = this.f217789f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.zl zlVar = this.f217788e;
        if (z17) {
            java.util.ArrayList feeds = zlVar.f218224f.f203829a;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = zlVar.f218233r;
            if (c22848x6ddd90cf == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            boolean z18 = !list.isEmpty();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feeds, "feeds");
            so2.j5 j5Var = (so2.j5) kz5.n0.k0(feeds);
            if (j5Var != null && (j5Var instanceof qr2.f)) {
                kz5.h0.E(feeds);
                if (z18) {
                    c22848x6ddd90cf.m8155x27702c4(feeds.size());
                }
            }
            int size = zlVar.f218224f.f203829a.size();
            zlVar.f218224f.f203829a.addAll(list);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = zlVar.f218233r;
            if (c22848x6ddd90cf2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            c22848x6ddd90cf2.m8153xd399a4d9(size, list.size());
        } else {
            java.util.ArrayList feeds2 = zlVar.f218224f.f203829a;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf3 = zlVar.f218233r;
            if (c22848x6ddd90cf3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            boolean z19 = !list.isEmpty();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feeds2, "feeds");
            so2.j5 j5Var2 = (so2.j5) kz5.n0.Z(feeds2);
            if (j5Var2 != null && (j5Var2 instanceof qr2.i)) {
                kz5.h0.C(feeds2);
                if (z19) {
                    c22848x6ddd90cf3.m8155x27702c4(0);
                }
            }
            zlVar.f218224f.f203829a.addAll(0, list);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf4 = zlVar.f218233r;
            if (c22848x6ddd90cf4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            c22848x6ddd90cf4.m8153xd399a4d9(0, list.size());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.zl.P6(zlVar, z17);
        return jz5.f0.f384359a;
    }
}
