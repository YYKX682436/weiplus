package ce0;

@j95.b
/* loaded from: classes11.dex */
public class e extends i95.w implements de0.j, xg3.t0 {
    public void Ai(com.tencent.mm.storage.f9 f9Var) {
        java.util.HashSet hashSet = com.tencent.mm.modelsimple.g1.f71326g;
        if (f9Var == null) {
            return;
        }
        if (!((c01.z1.i() & 72057594037927936L) == 72057594037927936L)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneStatusNotify", "[MicroMsg.MultiTerminalSyncMgr]sendSyncMultiTerminalFileDownloadMask !pcEnable");
            return;
        }
        if (j62.e.g().i("clicfg_disable_file_download_mask", 0, true, true) == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneStatusNotify", "[MicroMsg.MultiTerminalSyncMgr]sendSyncMultiTerminalFileDownloadMask exptDisable");
            return;
        }
        java.util.HashSet hashSet2 = com.tencent.mm.modelsimple.g1.f71327h;
        if (hashSet2.contains(java.lang.Long.valueOf(f9Var.getMsgId()))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneStatusNotify", "[MicroMsg.MultiTerminalSyncMgr]sendSyncMultiTerminalFileDownloadMask: has send cmd: msgSvrId:%d, msgLocalId:%d", java.lang.Long.valueOf(f9Var.I0()), java.lang.Long.valueOf(f9Var.getMsgId()));
            return;
        }
        hashSet2.add(java.lang.Long.valueOf(f9Var.getMsgId()));
        if (gm0.j1.b().m()) {
            v15.b bVar = new v15.b();
            v15.a aVar = new v15.a();
            aVar.l(f9Var.Q0());
            aVar.k(f9Var.I0());
            aVar.j(java.lang.Long.valueOf(f9Var.getCreateTime() / 1000));
            bVar.j().add(aVar);
            java.lang.String str = "<![CDATA[" + bVar.toXml() + "]]>";
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneStatusNotify", "[MicroMsg.MultiTerminalSyncMgr]sendSyncMultiTerminalFileDownloadMask: msgID:%d, %s", java.lang.Long.valueOf(f9Var.getMsgId()), str);
            gm0.j1.n().f273288b.g(new com.tencent.mm.modelsimple.g1(c01.z1.r(), 11, "FileDownloadedMark", str));
        }
    }

    public de0.i wi(int i17) {
        return new com.tencent.mm.modelsimple.m1(i17, 0, 0, "");
    }
}
