package qe;

/* loaded from: classes7.dex */
public final class c extends com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22915xb8eed8c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qe.f f443456a;

    public c(qe.f fVar) {
        this.f443456a = fVar;
    }

    @Override // com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22915xb8eed8c0
    /* renamed from: checkDomain */
    public boolean mo83258x13eebfec(java.lang.String url, int i17) {
        java.util.ArrayList arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        qe.f.a(this.f443456a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CronetHttpNativeInstallHelper", "checkDomain: url=%s type=%d", url, java.lang.Integer.valueOf(i17));
        uh1.a aVar = this.f443456a.f443476b;
        if (aVar == null) {
            qe.f.a(this.f443456a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CronetHttpNativeInstallHelper", "checkDomain: networkConfig is null, block url=%s", url);
            return false;
        }
        if (!aVar.f509273d) {
            return true;
        }
        if (i17 == 0) {
            arrayList = aVar.f509282p;
        } else if (i17 == 2) {
            arrayList = aVar.f509284r;
        } else {
            if (i17 != 3) {
                qe.f.a(this.f443456a);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CronetHttpNativeInstallHelper", "checkDomain: unknown type=%d url=%s", java.lang.Integer.valueOf(i17), url);
                return false;
            }
            arrayList = aVar.f509285s;
        }
        return uh1.j0.A(arrayList, url, false);
    }

    @Override // com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22915xb8eed8c0
    /* renamed from: checkIp */
    public int mo83259x2c3ecc4f(java.lang.String ip6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ip6, "ip");
        return uh1.j0.u(ip6);
    }

    @Override // com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22915xb8eed8c0
    /* renamed from: getCachePath */
    public java.lang.String mo83264xde6c6811() {
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i("wcf://networkfiles/", true);
        return i17 == null ? "" : i17;
    }

    @Override // com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22915xb8eed8c0
    /* renamed from: getPhysicalPath */
    public java.lang.String mo83265x90a0812(java.lang.String jsPath) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo50354x59eafec1;
        com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609;
        java.lang.String o17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsPath, "jsPath");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f443456a.f443475a;
        return (lVar == null || (mo50354x59eafec1 = lVar.mo50354x59eafec1()) == null || (mo49620x1d537609 = mo50354x59eafec1.mo49620x1d537609(jsPath)) == null || (o17 = mo49620x1d537609.o()) == null) ? "" : o17;
    }

    @Override // com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22915xb8eed8c0
    /* renamed from: saveFile */
    public vp5.c mo83266x84702499(java.lang.String src, java.lang.String dest) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(src, "src");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f443456a.f443475a;
        if (lVar == null) {
            return vp5.c.f520630n;
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.c2.D(lVar, new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(src)), dest, null).f380436a;
        return i17 == 0 ? vp5.c.f520624e : i17 == 1300013 ? vp5.c.f520625f : i17 == 1300002 ? vp5.c.f520626g : i17 == 1301003 ? vp5.c.f520627h : i17 == 1300202 ? vp5.c.f520628i : i17 == 1300036 ? vp5.c.f520629m : vp5.c.f520630n;
    }

    @Override // com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22915xb8eed8c0
    /* renamed from: saveFileToTempFs */
    public vp5.d mo83267xebc279d5(java.lang.String tempPath, java.lang.String ext) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo50354x59eafec1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tempPath, "tempPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ext, "ext");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f443456a.f443475a;
        if (lVar == null || (mo50354x59eafec1 = lVar.mo50354x59eafec1()) == null) {
            return new vp5.d(vp5.c.f520630n, "");
        }
        ik1.b0 b0Var = new ik1.b0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49619x6aa75256 = mo50354x59eafec1.mo49619x6aa75256(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(tempPath)), ext, true, b0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo49619x6aa75256, "createTempFileFrom(...)");
        int ordinal = mo49619x6aa75256.ordinal();
        if (ordinal != 0) {
            return ordinal != 4 ? ordinal != 6 ? ordinal != 9 ? ordinal != 15 ? ordinal != 17 ? new vp5.d(vp5.c.f520630n, "") : new vp5.d(vp5.c.f520629m, "") : new vp5.d(vp5.c.f520628i, "") : new vp5.d(vp5.c.f520627h, "") : new vp5.d(vp5.c.f520626g, "") : new vp5.d(vp5.c.f520625f, "");
        }
        java.lang.String str = (java.lang.String) b0Var.f373357a;
        return str != null ? new vp5.d(vp5.c.f520624e, str) : new vp5.d(vp5.c.f520630n, "");
    }
}
