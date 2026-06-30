package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class z8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f202084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f202085e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e9 f202086f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e9 e9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f202085e = z2Var;
        this.f202086f = e9Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z8(this.f202085e, this.f202086f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.td2 td2Var;
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f202084d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e9 e9Var = this.f202086f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y8 y8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.y8(e9Var, null);
            this.f202084d = 1;
            obj = p3325xe03a0797.p3326xc267989b.l.g(p0Var, y8Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        jz5.l lVar = (jz5.l) obj;
        this.f202085e.B();
        boolean booleanValue = ((java.lang.Boolean) lVar.f384366d).booleanValue();
        boolean z17 = false;
        java.lang.Object obj2 = lVar.f384367e;
        if (booleanValue) {
            db5.t7.h(e9Var.f199770a, (java.lang.String) obj2);
            mm2.g0 g0Var = (mm2.g0) e9Var.f199771b.a(mm2.g0.class);
            r45.hf5 previewInfo = e9Var.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewInfo, "previewInfo");
            if (previewInfo.m75939xb282bd08(0) == 1) {
                r45.td2 td2Var2 = g0Var.f410599m;
                if (td2Var2 != null) {
                    td2Var2.set(1, java.lang.Integer.valueOf(previewInfo.m75939xb282bd08(1)));
                }
            } else if (previewInfo.m75939xb282bd08(0) == 2) {
                int m75939xb282bd08 = previewInfo.m75939xb282bd08(2);
                int N6 = g0Var.N6(2);
                if (1 <= N6 && N6 < m75939xb282bd08) {
                    z17 = true;
                }
                if (z17 && (td2Var = g0Var.f410599m) != null) {
                    td2Var.set(3, java.lang.Integer.valueOf(td2Var.m75939xb282bd08(3) + (m75939xb282bd08 - N6)));
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateTrialInfoForModify to:");
            r45.td2 td2Var3 = g0Var.f410599m;
            if (td2Var3 == null) {
                str = "FinderLiveUrlOption:NULL!";
            } else {
                str = "FinderLiveUrlOption:[" + td2Var3.m75939xb282bd08(1) + ',' + td2Var3.m75939xb282bd08(3) + ']';
            }
            sb6.append(str);
            sb6.append('!');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveChargeSlice", sb6.toString());
        } else {
            android.content.Context context = e9Var.f199770a;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 2, 0);
            z2Var.y(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
            z2Var.F = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.w8(z2Var);
            z2Var.x(1);
            z2Var.i(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570417aq4);
            ((android.widget.TextView) z2Var.f293591g.findViewById(com.p314xaae8f345.mm.R.id.o3b)).setText((java.lang.String) obj2);
            z2Var.C();
        }
        return jz5.f0.f384359a;
    }
}
