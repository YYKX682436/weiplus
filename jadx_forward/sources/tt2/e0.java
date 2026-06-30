package tt2;

/* loaded from: classes3.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f503407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f503408e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f503409f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f503410g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f503411h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ byte[] f503412i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(ut2.s3 s3Var, so2.j5 j5Var, tt2.e1 e1Var, int i17, byte[] bArr, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f503408e = s3Var;
        this.f503409f = j5Var;
        this.f503410g = e1Var;
        this.f503411h = i17;
        this.f503412i = bArr;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new tt2.e0(this.f503408e, this.f503409f, this.f503410g, this.f503411h, this.f503412i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((tt2.e0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.nw1 nw1Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f503407d;
        ut2.s3 holder = this.f503408e;
        so2.j5 j5Var = this.f503409f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            s40.a1 a1Var = (s40.a1) i95.n0.c(s40.a1.class);
            android.content.Context context = holder.f3639x46306858.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            r45.y23 y23Var = ((cm2.m0) j5Var).f124901v;
            this.f503407d = 1;
            if (((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z5) a1Var).aj(context, y23Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        cc2.e eVar = cc2.e.f122012a;
        tt2.e1 e1Var = this.f503410g;
        boolean z17 = e1Var.f503414i;
        cm2.m0 data = (cm2.m0) j5Var;
        int i18 = e1Var.f503416n;
        gk2.e eVar2 = gk2.e.f354004n;
        boolean z18 = eVar2 != null ? ((mm2.c1) eVar2.a(mm2.c1.class)).T : false;
        byte[] clickId = this.f503412i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(clickId, "$clickId");
        java.lang.String str = new java.lang.String(clickId, r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        gk2.e liveData = e1Var.f503415m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        if (z17) {
            if (zl2.r4.f555483a.w1()) {
                p52.h.f433562n = str;
            }
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f409116i;
            y4Var.Y = true;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            ml2.t2[] t2VarArr = ml2.t2.f409547d;
            jSONObject.put("type", 3);
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            jSONObject.put("sessionid", y4Var.f409839n);
            jSONObject.put("shopwindowid", "");
            jSONObject.put("productid", data.f124902w);
            gk2.e eVar3 = gk2.e.f354004n;
            if (eVar3 != null && ((mm2.c1) eVar3.a(mm2.c1.class)).T7()) {
                i95.m c17 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c17;
                ml2.c1 c1Var = ml2.c1.f408858e;
                zy2.zb.j5(zbVar, 6L, jSONObject.toString(), null, 4, null);
            } else {
                gk2.e eVar4 = gk2.e.f354004n;
                if (eVar4 != null && ((mm2.c1) eVar4.a(mm2.c1.class)).a8()) {
                    gk2.e eVar5 = gk2.e.f354004n;
                    jSONObject.put("appid", eVar5 != null ? ((mm2.f6) eVar5.a(mm2.f6.class)).A : null);
                    gk2.e eVar6 = gk2.e.f354004n;
                    long m75942xfb822ef2 = (eVar6 == null || (nw1Var = ((mm2.e1) eVar6.a(mm2.e1.class)).f410521r) == null) ? -1L : nw1Var.m75942xfb822ef2(0);
                    if (m75942xfb822ef2 < 0) {
                        jSONObject.put("liveid", "");
                    } else {
                        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                        jSONObject.put("liveid", b52.b.q(m75942xfb822ef2));
                    }
                    jSONObject.put("clickid", p52.h.f433562n);
                    p52.h.f433562n = "";
                    i95.m c18 = i95.n0.c(ml2.j0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                    zy2.zb.y6((zy2.zb) c18, ml2.z4.f409899o, jSONObject.toString(), null, 4, null);
                }
            }
        } else if (z18) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).sj(2, 2, this.f503411h);
        } else {
            eVar.b(ml2.f4.f408968i, data, 0, cc2.d.f122011a.a(liveData, "live_list_buy", str), holder, i18, kz5.q0.f395534d);
        }
        yz5.l lVar = e1Var.f503428z;
        if (lVar != null) {
            lVar.mo146xb9724478(new java.lang.Long(data.f124902w));
        }
        return jz5.f0.f384359a;
    }
}
