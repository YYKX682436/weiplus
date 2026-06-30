package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class ab extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f199283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f199284e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nb f199285f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(az2.f fVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nb nbVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f199283d = fVar;
        this.f199284e = str;
        this.f199285f = nbVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ab(this.f199283d, this.f199284e, this.f199285f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ab abVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ab) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        abVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f3Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        this.f199283d.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doRemoveInvitee success: target=");
        java.lang.String str = this.f199284e;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveCoLiveInvitorPreparePanel", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nb nbVar = this.f199285f;
        mm2.n0 n0Var = nbVar.H;
        r45.f50 f50Var = (n0Var == null || (f3Var = n0Var.f410798g) == null) ? null : (r45.f50) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.l2) f3Var).mo144003x754a37bb();
        if (f50Var != null && (linkedList = f50Var.f455549g) != null) {
            kz5.h0.B(linkedList, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.za(str));
        }
        nbVar.e0();
        android.content.Context context = nbVar.f199716e;
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
        e4Var.f293309c = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574995oo1);
        e4Var.b(com.p314xaae8f345.mm.R.raw.f80084xebd378da);
        e4Var.c();
        return jz5.f0.f384359a;
    }
}
