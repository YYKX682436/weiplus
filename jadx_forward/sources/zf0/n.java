package zf0;

/* loaded from: classes12.dex */
public final class n extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f554010d;

    /* renamed from: e, reason: collision with root package name */
    public int f554011e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f554012f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ oi3.h f554013g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f554014h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f554015i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ vf0.j1 f554016m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ vf0.e f554017n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f554018o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f554019p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(zf0.v0 v0Var, oi3.h hVar, t21.v2 v2Var, java.lang.String str, vf0.j1 j1Var, vf0.e eVar, java.util.Map map, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f554012f = v0Var;
        this.f554013g = hVar;
        this.f554014h = v2Var;
        this.f554015i = str;
        this.f554016m = j1Var;
        this.f554017n = eVar;
        this.f554018o = map;
        this.f554019p = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zf0.n(this.f554012f, this.f554013g, this.f554014h, this.f554015i, this.f554016m, this.f554017n, this.f554018o, this.f554019p, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((zf0.n) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.Object f17;
        java.lang.String str3;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f554011e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.Integer d17 = this.f554012f.d(false);
            if (d17 != null) {
                this.f554016m.f517730a = d17.intValue();
                return f0Var;
            }
            tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
            oi3.h hVar = this.f554013g;
            bm5.f0 f0Var2 = bm5.f0.f104104s;
            java.lang.String sj6 = ((k90.b) u0Var).sj(hVar, f0Var2, this.f554014h.d(), true);
            if (!com.p314xaae8f345.mm.vfs.w6.j(this.f554015i)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoMsg.SendVideoTask", "cannot compress video,because importPath:" + this.f554015i + " not exist");
                this.f554016m.f517730a = -540002;
                return f0Var;
            }
            vf0.e eVar = this.f554017n;
            if (eVar.f517681c != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoMsg.SendVideoTask", "checkCompress error ,errorcode = " + this.f554017n.f517681c + ",errorMsg = " + this.f554017n.f517682d);
                vf0.j1 j1Var = this.f554016m;
                boolean z17 = this.f554017n.f517679a;
                j1Var.getClass();
                this.f554016m.f517730a = -540004;
                return f0Var;
            }
            if (!eVar.f517679a) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.SendVideoTask", this.f554012f.id() + " skip compressVideo, directly copy file (needCompress=false)");
                com.p314xaae8f345.mm.vfs.w6.c(this.f554015i, sj6);
                vf0.i3 i3Var = this.f554012f.f554096i.f517710d;
                if ((i3Var != null ? i3Var.f517729a : null) == vf0.j3.f517736e) {
                    ((pc0.u1) ((qc0.z0) i95.n0.c(qc0.z0.class))).Ai(this.f554015i);
                }
                this.f554016m.getClass();
                return f0Var;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.SendVideoTask", this.f554012f.id() + " start executeCompress (needCompress=true)");
            zf0.b1 b1Var = zf0.b1.f553918a;
            java.lang.String str4 = this.f554015i;
            boolean z18 = this.f554012f.f554096i.f517709c;
            com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = this.f554017n.f517680b;
            java.lang.String h17 = this.f554014h.h();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "getUser(...)");
            java.lang.String j17 = bm5.z.j(bm5.y.f104289i.e(this.f554013g, f0Var2, this.f554014h.d()));
            zf0.v0 v0Var = this.f554012f;
            zf0.l lVar = new zf0.l(v0Var, this.f554016m);
            java.util.Map map = this.f554018o;
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17683x770f5025 c17683x770f5025 = this.f554017n.f517683e;
            java.lang.String str5 = this.f554019p;
            zf0.m mVar = new zf0.m(v0Var);
            p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar = v0Var.f554101q;
            this.f554010d = sj6;
            this.f554011e = 1;
            str = "MicroMsg.VideoMsg.SendVideoTask";
            str2 = ",errorMsg = ";
            f17 = b1Var.f(str4, false, z18, sj6, c11120x15dce88d, h17, j17, lVar, map, c17683x770f5025, str5, mVar, dVar, this);
            if (f17 == aVar) {
                return aVar;
            }
            str3 = sj6;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.String str6 = (java.lang.String) this.f554010d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            str3 = str6;
            str = "MicroMsg.VideoMsg.SendVideoTask";
            str2 = ",errorMsg = ";
            f17 = obj;
        }
        vf0.f fVar = (vf0.f) f17;
        if (fVar.f517692d != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "compressVideo error ,errorcode = " + fVar.f517692d + str2 + fVar.f517693e);
            java.lang.Integer d18 = this.f554012f.d(false);
            if (d18 != null) {
                this.f554016m.f517730a = d18.intValue();
                return f0Var;
            }
            vf0.j1 j1Var2 = this.f554016m;
            j1Var2.f517730a = -540005;
            j1Var2.f517732c = fVar.f517692d;
            java.lang.String str7 = fVar.f517693e;
            if (str7 == null) {
                str7 = "";
            }
            j1Var2.getClass();
            j1Var2.f517733d = str7;
            return f0Var;
        }
        java.lang.String str8 = str;
        if (!com.p314xaae8f345.mm.vfs.w6.j(str3) || com.p314xaae8f345.mm.vfs.w6.k(str3) == 0) {
            this.f554016m.f517730a = -540003;
            return f0Var;
        }
        zf0.v0 v0Var2 = this.f554012f;
        v0Var2.f554098n = 40.0f;
        v0Var2.L(40.0f, qi3.g0.f445241g);
        if (this.f554012f.f554096i.f517721o.f517673a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str8, "deleteImportPath" + this.f554015i);
            com.p314xaae8f345.mm.vfs.w6.h(this.f554015i);
            t21.v2 v2Var = this.f554014h;
            v2Var.f496557v = str3;
            v2Var.U = 1048576;
        }
        vf0.m3.n(this.f554014h, str3);
        return f0Var;
    }
}
