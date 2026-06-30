package ce0;

@j95.b
/* loaded from: classes11.dex */
public class e extends i95.w implements de0.j, xg3.t0 {
    public void Ai(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.util.HashSet hashSet = com.p314xaae8f345.mm.p957x53236a1b.g1.f152859g;
        if (f9Var == null) {
            return;
        }
        if (!((c01.z1.i() & 72057594037927936L) == 72057594037927936L)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneStatusNotify", "[MicroMsg.MultiTerminalSyncMgr]sendSyncMultiTerminalFileDownloadMask !pcEnable");
            return;
        }
        if (j62.e.g().i("clicfg_disable_file_download_mask", 0, true, true) == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneStatusNotify", "[MicroMsg.MultiTerminalSyncMgr]sendSyncMultiTerminalFileDownloadMask exptDisable");
            return;
        }
        java.util.HashSet hashSet2 = com.p314xaae8f345.mm.p957x53236a1b.g1.f152860h;
        if (hashSet2.contains(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneStatusNotify", "[MicroMsg.MultiTerminalSyncMgr]sendSyncMultiTerminalFileDownloadMask: has send cmd: msgSvrId:%d, msgLocalId:%d", java.lang.Long.valueOf(f9Var.I0()), java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
            return;
        }
        hashSet2.add(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        if (gm0.j1.b().m()) {
            v15.b bVar = new v15.b();
            v15.a aVar = new v15.a();
            aVar.l(f9Var.Q0());
            aVar.k(f9Var.I0());
            aVar.j(java.lang.Long.valueOf(f9Var.mo78012x3fdd41df() / 1000));
            bVar.j().add(aVar);
            java.lang.String str = "<![CDATA[" + bVar.m126747x696739c() + "]]>";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneStatusNotify", "[MicroMsg.MultiTerminalSyncMgr]sendSyncMultiTerminalFileDownloadMask: msgID:%d, %s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), str);
            gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p957x53236a1b.g1(c01.z1.r(), 11, "FileDownloadedMark", str));
        }
    }

    public de0.i wi(int i17) {
        return new com.p314xaae8f345.mm.p957x53236a1b.m1(i17, 0, 0, "");
    }
}
