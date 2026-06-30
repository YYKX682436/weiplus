package com.p314xaae8f345.mm.p938xc0468b46;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010\u0003\u001a\u00020\u0002J)\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0086 J\t\u0010\n\u001a\u00020\u0004H\u0086 J\u0011\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086 J\u001e\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\b\u0010\u000e\u001a\u00020\rH\u0007J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\rH\u0007J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\b\u0010\u0014\u001a\u00020\u0011H\u0007J\b\u0010\u0015\u001a\u00020\u0011H\u0007J\b\u0010\u0017\u001a\u00020\u0016H\u0007J\b\u0010\u0018\u001a\u00020\u0011H\u0007J\b\u0010\u0019\u001a\u00020\u0011H\u0007R\u0016\u0010\u001a\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/tencent/mm/mnxnet/WeXNetJSBinding;", "", "Ljz5/f0;", "destroy", "", "runtime", "jsEngine", "jsContext", "uvLoop", "nativeBindTo", "nativeCreate", "nativeDestroy", "bindTo", "Lb01/a;", "getWeXNetCallback", "weXNetCallback", "setWeXNetCallback", "", com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "getLocalFilePath", "getWAAppInfo_appId", "getWAAppInfo_path", "", "getWAAppInfo_isGame", "getWAModelCache_path", "getWANpuLibs_path", "mWeXNetCallback", "Lb01/a;", "mRuntime", "J", "<init>", "()V", "mnxnet_universalRelease"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.tencent.mm.mnxnet.WeXNetJSBinding */
/* loaded from: classes7.dex */
public final class C11101x514cf849 {
    private long mRuntime = m47891x73c02ff3();
    private b01.a mWeXNetCallback;

    /* renamed from: access$getMWeXNetCallback$p */
    public static final /* synthetic */ b01.a m47879x87dc33b(com.p314xaae8f345.mm.p938xc0468b46.C11101x514cf849 c11101x514cf849) {
        b01.a aVar = c11101x514cf849.mWeXNetCallback;
        if (aVar != null) {
            return aVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mWeXNetCallback");
        throw null;
    }

    /* renamed from: bindTo */
    public final void m47881xad361398(long j17, long j18, long j19) {
        long j27 = this.mRuntime;
        if (j27 != 0) {
            m47890x7190a28f(j27, j17, j18, j19);
        }
    }

    /* renamed from: destroy */
    public final void m47882x5cd39ffa() {
        long j17 = this.mRuntime;
        if (j17 != 0) {
            m47892x23caefe3(j17);
            this.mRuntime = 0L;
        }
    }

    /* renamed from: getLocalFilePath */
    public final java.lang.String m47883x3bd21496(java.lang.String path) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var;
        java.lang.String o17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(path, "path");
        return (this.mWeXNetCallback == null || (c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o) m47889x92b3d84e()).f170260a.F()) == null || c0Var.mo50354x59eafec1() == null || c0Var.mo50354x59eafec1().mo49620x1d537609(path) == null || (o17 = c0Var.mo50354x59eafec1().mo49620x1d537609(path).o()) == null) ? "" : o17;
    }

    /* renamed from: getWAAppInfo_appId */
    public final java.lang.String m47884x6d48048c() {
        b01.a aVar = this.mWeXNetCallback;
        return aVar != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o) aVar).f170260a.N() : "";
    }

    /* renamed from: getWAAppInfo_isGame */
    public final boolean m47885x497750cc() {
        b01.a aVar = this.mWeXNetCallback;
        if (aVar == null) {
            return false;
        }
        if (aVar != null) {
            aVar.getClass();
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mWeXNetCallback");
        throw null;
    }

    /* renamed from: getWAAppInfo_path */
    public final java.lang.String m47886x351970b5() {
        b01.a aVar = this.mWeXNetCallback;
        if (aVar == null) {
            return "";
        }
        if (aVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.j jVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o) aVar).f170260a;
            return (jVar.S() == null || jVar.S().x0() == null) ? "" : jVar.S().x0().m52170xad58292c();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mWeXNetCallback");
        throw null;
    }

    /* renamed from: getWAModelCache_path */
    public final java.lang.String m47887x8ba94e0b() {
        j81.k kVar;
        if (this.mWeXNetCallback == null) {
            return "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o oVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o) m47889x92b3d84e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.j jVar = oVar.f170260a;
        if ((jVar.S() == null && jVar.S().x0() == null) || (kVar = (j81.k) i95.n0.c(j81.k.class)) == null) {
            return "";
        }
        java.lang.String Ai = ((k81.a) kVar).Ai(oVar.f170260a.N());
        com.p314xaae8f345.mm.p2818xd0d82df3.C22945x9a2e1613.m83543xebd0d968(Ai);
        return Ai;
    }

    /* renamed from: getWANpuLibs_path */
    public final java.lang.String m47888x472fee43() {
        if (this.mWeXNetCallback == null) {
            return "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.j jVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o) m47889x92b3d84e()).f170260a;
        if (jVar.S() == null && jVar.S().x0() == null) {
            return "";
        }
        new com.p314xaae8f345.mm.p2818xd0d82df3.a();
        return com.p314xaae8f345.mm.p2818xd0d82df3.v.f295912a.c();
    }

    /* renamed from: getWeXNetCallback */
    public final b01.a m47889x92b3d84e() {
        b01.a aVar = this.mWeXNetCallback;
        if (aVar != null) {
            return aVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mWeXNetCallback");
        throw null;
    }

    /* renamed from: nativeBindTo */
    public final native void m47890x7190a28f(long j17, long j18, long j19, long j27);

    /* renamed from: nativeCreate */
    public final native long m47891x73c02ff3();

    /* renamed from: nativeDestroy */
    public final native void m47892x23caefe3(long j17);

    /* renamed from: setWeXNetCallback */
    public final void m47893x5aaa405a(b01.a weXNetCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(weXNetCallback, "weXNetCallback");
        this.mWeXNetCallback = weXNetCallback;
    }
}
