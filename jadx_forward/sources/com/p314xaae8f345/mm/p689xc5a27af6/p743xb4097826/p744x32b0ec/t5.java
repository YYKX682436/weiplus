package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes3.dex */
public final class t5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f148471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f148472e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z5 f148473f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f148474g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148475h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f148476i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(l81.b1 b1Var, com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z5 z5Var, android.content.Context context, java.lang.String str, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f148472e = b1Var;
        this.f148473f = z5Var;
        this.f148474g = context;
        this.f148475h = str;
        this.f148476i = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.t5(this.f148472e, this.f148473f, this.f148474g, this.f148475h, this.f148476i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.t5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object wi6;
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f148471d;
        android.content.Context context = this.f148474g;
        com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z5 z5Var = this.f148473f;
        l81.b1 b1Var = this.f148472e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
            b1Var.f398549c = zl2.q4.f555466a.x();
            com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z5 z5Var2 = this.f148473f;
            android.content.Context context2 = this.f148474g;
            java.lang.String str3 = this.f148475h;
            long j17 = this.f148476i;
            this.f148471d = 1;
            wi6 = com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z5.wi(z5Var2, context2, str3, j17, this);
            if (wi6 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                z5Var.Ai(b1Var);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(context, b1Var);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            wi6 = obj;
        }
        jz5.l lVar = (jz5.l) wi6;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) lVar.f384366d;
        r45.ea1 ea1Var = (r45.ea1) lVar.f384367e;
        java.lang.String u17 = pm0.v.u(c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : 0L);
        if (c19792x256d2725 == null || (str = c19792x256d2725.m76803x6c285d75()) == null) {
            str = "";
        }
        l81.p0 p0Var = b1Var.f398561i;
        dk2.ah ahVar = p0Var instanceof dk2.ah ? (dk2.ah) p0Var : null;
        java.lang.String str4 = ahVar != null ? ahVar.f314758u : null;
        z5Var.getClass();
        int m75939xb282bd08 = ea1Var != null ? ea1Var.m75939xb282bd08(3) : 0;
        int m75939xb282bd082 = ea1Var != null ? ea1Var.m75939xb282bd08(2) : 0;
        boolean z17 = m75939xb282bd08 == 1 && m75939xb282bd082 == 1;
        java.lang.String str5 = z5Var.f148590d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str5, "isLiving = " + m75939xb282bd08 + ", isInLivingRoom = " + m75939xb282bd082);
        if (z17) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("feedId", u17);
            jSONObject.put("nonceId", str);
            jSONObject.put("lastGMsgId", str4 == null ? "" : str4);
            str2 = jSONObject.toString();
        } else {
            str2 = "";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str5, "fillTraceInfoToTongue lastGMsgId:" + str4);
        if (z17) {
            ((vd2.i5) i95.n0.c(vd2.i5.class)).getClass();
            b1Var.V = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ck.class;
            b1Var.W = str2;
        }
        r45.y23 y23Var = ea1Var != null ? (r45.y23) ea1Var.m75936x14adae67(1) : null;
        if (y23Var != null) {
            xy2.b bVar = xy2.b.f539688b;
            l81.p0 p0Var2 = b1Var.f398561i;
            pm0.z.b(bVar, "setDragBarIfNeeded", p0Var2 != null && (p0Var2 instanceof dk2.ah), pm0.w.f438339g, null, false, false, new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.w5(b1Var), 56, null);
            l81.p0 p0Var3 = b1Var.f398561i;
            dk2.ah ahVar2 = p0Var3 != null ? p0Var3 instanceof dk2.ah ? (dk2.ah) p0Var3 : null : new dk2.ah();
            r45.ce0 ce0Var = (r45.ce0) y23Var.m75936x14adae67(8);
            boolean z18 = ce0Var != null && ce0Var.m75939xb282bd08(6) == 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str5, "open with dragbar = " + z18);
            if (ahVar2 != null) {
                ahVar2.f314751n = z18;
            }
            b1Var.f398561i = ahVar2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c12 = b1Var.G;
            if (c11816x5915d2c12 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.l e17 = c11816x5915d2c12.e();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c13 = b1Var.G;
                e17.f159065l = c11816x5915d2c13.f158897n;
                e17.C = c11816x5915d2c13.d() && z18;
                r45.ce0 ce0Var2 = (r45.ce0) y23Var.m75936x14adae67(8);
                e17.H = !(ce0Var2 != null && ce0Var2.m75939xb282bd08(5) == 1);
                c11816x5915d2c1 = e17.a();
            } else {
                c11816x5915d2c1 = null;
            }
            b1Var.G = c11816x5915d2c1;
        }
        if (zl2.r4.f555483a.D1(ea1Var != null ? (r45.y23) ea1Var.m75936x14adae67(1) : null)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.l e18 = b1Var.G.e();
            e18.f159067n = true;
            e18.f159064k = k91.t2.f387300e;
            e18.C = true;
            e18.f159074u = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.ShareActionConfig(true, "");
            b1Var.G = e18.a();
            b1Var.Z = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573016m81);
        }
        r45.y23 y23Var2 = ea1Var != null ? (r45.y23) ea1Var.m75936x14adae67(1) : null;
        this.f148471d = 2;
        if (z5Var.aj(context, y23Var2, this) == aVar) {
            return aVar;
        }
        z5Var.Ai(b1Var);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(context, b1Var);
        return jz5.f0.f384359a;
    }
}
