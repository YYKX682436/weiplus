package df2;

/* loaded from: classes3.dex */
public final class yg extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f313399d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.bh f313400e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jz5.l f313401f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg(df2.bh bhVar, jz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f313400e = bhVar;
        this.f313401f = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.yg(this.f313400e, this.f313401f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.yg) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f313399d;
        p3325xe03a0797.p3326xc267989b.a1 a1Var = p3325xe03a0797.p3326xc267989b.a1.UNDISPATCHED;
        df2.bh bhVar = this.f313400e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if2.d0 d0Var = bhVar.f311344t;
            if (d0Var != null) {
                d0Var.d(0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30 e30Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30) bhVar.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30.class);
            if (e30Var != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(e30Var.I);
                ((mm2.c1) e30Var.P0(mm2.c1.class)).J1++;
                e30Var.f446856d.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r20(e30Var, ((mm2.c1) e30Var.f199745q.P0(mm2.c1.class)).J1));
                e30Var.w1(false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e30Var.f199746r, "[ken_stopPostLike]");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(e30Var, null, a1Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.a30(e30Var, null), 1, null);
                e30Var.v1(true);
                pm0.v.V(e30Var.H - 10, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q20(e30Var));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow) bhVar.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow.class);
            android.graphics.Bitmap G1 = owVar2 != null ? owVar2.G1() : null;
            if (G1 != null && (owVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow) bhVar.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow.class)) != null) {
                jz5.l lVar = this.f313401f;
                int intValue = ((java.lang.Number) lVar.f384366d).intValue();
                int intValue2 = ((java.lang.Number) lVar.f384367e).intValue();
                this.f313399d = 1;
                if (owVar.y1(G1, intValue, intValue2, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.String str = bhVar.f311337m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("anim end, channel.isEmpty = ");
        u26.w wVar = bhVar.f311339o;
        sb6.append(wVar.mo167477x7aab3243());
        sb6.append(",animRoot.childCount = ");
        android.widget.FrameLayout frameLayout = bhVar.f311338n;
        sb6.append(frameLayout != null ? new java.lang.Integer(frameLayout.getChildCount()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (wVar.mo167477x7aab3243()) {
            android.widget.FrameLayout frameLayout2 = bhVar.f311338n;
            if (frameLayout2 != null && frameLayout2.getChildCount() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(bhVar.f311337m, "root gone");
                if2.d0 d0Var2 = bhVar.f311344t;
                if (d0Var2 != null) {
                    d0Var2.d(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30 e30Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30) bhVar.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30.class);
                if (e30Var2 != null) {
                    e30Var2.w1(false);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e30Var2.f199746r, "[ken_stopPostLike]");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(e30Var2, null, a1Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.a30(e30Var2, null), 1, null);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
