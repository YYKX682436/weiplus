package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class dq extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f199669d;

    /* renamed from: e, reason: collision with root package name */
    public int f199670e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nq f199671f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.z53 f199672g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nq nqVar, r45.z53 z53Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f199671f = nqVar;
        this.f199672g = z53Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dq(this.f199671f, this.f199672g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dq) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object a17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nq nqVar;
        java.util.LinkedList m75941xfb821914;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f199670e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nq nqVar2 = this.f199671f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f199669d = nqVar2;
            this.f199670e = 1;
            nqVar2.getClass();
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiFinderLiveGetUserGameConfig name=");
            r45.z53 z53Var = this.f199672g;
            sb6.append(z53Var.m75945x2fec8307(1));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(nqVar2.H, sb6.toString());
            java.lang.String m75945x2fec8307 = z53Var.m75945x2fec8307(0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            ke2.y yVar = new ke2.y(m75945x2fec8307, 0, false, null, false, null, 60, null);
            android.content.Context context = nqVar2.f199716e;
            yVar.t(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 0L);
            pq5.g l17 = yVar.l();
            l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context);
            l17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.kq(nqVar2, nVar, z53Var));
            a17 = nVar.a();
            if (a17 == aVar) {
                return aVar;
            }
            nqVar = nqVar2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nqVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nq) this.f199669d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            a17 = obj;
        }
        r45.n73 n73Var = (r45.n73) a17;
        un0.h hVar = un0.s.f510951b;
        if (hVar != null) {
            nqVar.getClass();
            yz5.l lVar = hVar.f510898n;
            if (lVar != null) {
                lVar.mo146xb9724478("FinderLivePostGameChoosePanel-notifyGameSelected");
            }
        }
        java.lang.String str = nqVar.H;
        if (n73Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "#notifyGameSelected gameInfo is null. return");
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("#notifyGameSelected name=");
            r45.z53 z53Var2 = (r45.z53) n73Var.m75936x14adae67(1);
            sb7.append(z53Var2 != null ? z53Var2.m75945x2fec8307(1) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("#notifyGameSelected support_live_type=");
            r45.z53 z53Var3 = (r45.z53) n73Var.m75936x14adae67(1);
            sb8.append((z53Var3 == null || (m75941xfb821914 = z53Var3.m75941xfb821914(19)) == null) ? null : kz5.n0.g0(m75941xfb821914, ",", null, null, 0, null, null, 62, null));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb8.toString());
            r45.z53 z53Var4 = (r45.z53) n73Var.m75936x14adae67(1);
            java.lang.String m75945x2fec83072 = z53Var4 != null ? z53Var4.m75945x2fec8307(0) : null;
            cl0.g gVar = new cl0.g();
            gVar.o("type", 13);
            gVar.h("game_id", m75945x2fec83072);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.c1 c1Var = ml2.c1.f408858e;
            zy2.zb.j5(zbVar, 47L, gVar.toString(), null, 4, null);
            r45.q12 q12Var = new r45.q12();
            q12Var.set(0, 3);
            dk2.ef efVar = dk2.ef.f314905a;
            mm2.g1 g1Var = (mm2.g1) efVar.i(mm2.g1.class);
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = g1Var != null ? g1Var.f410601f : null;
            if (j2Var != null) {
                ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).k(q12Var);
            }
            mm2.o2 o2Var = (mm2.o2) efVar.i(mm2.o2.class);
            if (o2Var != null) {
                o2Var.N6(n73Var);
            }
            mm2.g1 g1Var2 = (mm2.g1) efVar.i(mm2.g1.class);
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var2 = g1Var2 != null ? g1Var2.f410604i : null;
            if (j2Var2 != null) {
                ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var2).k(n73Var);
            }
            mm2.s1 s1Var = (mm2.s1) efVar.i(mm2.s1.class);
            if (s1Var != null) {
                s1Var.S6(q12Var);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(nqVar2, false, 1, null);
        return jz5.f0.f384359a;
    }
}
