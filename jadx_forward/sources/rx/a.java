package rx;

@j95.b
/* loaded from: classes12.dex */
public class a extends i95.w implements sx.a0, sx.y {
    public int Ai(java.lang.String str) {
        com.p314xaae8f345.mm.p947xba6de98f.s1.cj().getClass();
        return ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37737x974f0042(com.p314xaae8f345.mm.vfs.w6.i(str, false));
    }

    public java.lang.String Bi(java.lang.String str) {
        return com.p314xaae8f345.mm.p947xba6de98f.s1.cj().e(str);
    }

    public java.lang.String Di(java.lang.String str) {
        com.p314xaae8f345.mm.p947xba6de98f.s1.cj().getClass();
        return ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37739x3be5fcd6(com.p314xaae8f345.mm.vfs.w6.i(str, false));
    }

    public int Ni(java.lang.String str, long j17, long j18, int i17) {
        com.p314xaae8f345.mm.p947xba6de98f.s1.cj().getClass();
        return ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37765xff4560f6(str, j17, j18, i17);
    }

    public void Ri(sx.z zVar) {
        com.p314xaae8f345.mm.p947xba6de98f.l1 cj6 = com.p314xaae8f345.mm.p947xba6de98f.s1.cj();
        cj6.f152592w = zVar;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(cj6.hashCode());
        objArr[1] = java.lang.Integer.valueOf(zVar != null ? zVar.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportEngine", "setMMPlayerDownloaderCallback hash[%d] onlineVideoCallback[%d]", objArr);
    }

    public void Ui(dn.f fVar) {
        com.p314xaae8f345.mm.p947xba6de98f.l1 cj6 = com.p314xaae8f345.mm.p947xba6de98f.s1.cj();
        cj6.f152593x = fVar;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(cj6.hashCode());
        objArr[1] = java.lang.Integer.valueOf(fVar != null ? fVar.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportEngine", "mmPlayerPreloadCallback hash[%d] cdnTransCallback[%d]", objArr);
    }

    public void Vi(sx.z zVar) {
        com.p314xaae8f345.mm.p947xba6de98f.l1 cj6 = com.p314xaae8f345.mm.p947xba6de98f.s1.cj();
        cj6.f152590u = zVar;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(cj6.hashCode());
        objArr[1] = java.lang.Integer.valueOf(zVar != null ? zVar.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportEngine", "set tp player cdn callback hash[%d] onlineVideoCallback[%d]", objArr);
    }

    public void Zi(dn.f fVar) {
        com.p314xaae8f345.mm.p947xba6de98f.l1 cj6 = com.p314xaae8f345.mm.p947xba6de98f.s1.cj();
        cj6.f152577e = fVar;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(cj6.hashCode());
        objArr[1] = java.lang.Integer.valueOf(fVar != null ? fVar.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnTransportEngine", "set tp player cdn callback hash[%d] cdnTransCallback[%d]", objArr);
    }

    public int aj(java.lang.String str, dn.h hVar) {
        return com.p314xaae8f345.mm.p947xba6de98f.s1.cj().x(str, hVar);
    }

    public boolean bj() {
        int i17;
        com.p314xaae8f345.mm.p947xba6de98f.l1 cj6 = com.p314xaae8f345.mm.p947xba6de98f.s1.cj();
        synchronized (cj6.f152584o) {
            i17 = cj6.f152585p;
        }
        return i17 == 0;
    }

    public java.lang.String wi() {
        return com.p314xaae8f345.mm.p947xba6de98f.s1.cj().d();
    }
}
