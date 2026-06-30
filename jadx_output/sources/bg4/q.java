package bg4;

/* loaded from: classes13.dex */
public class q extends com.tencent.mm.sdk.event.n {
    public q() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        zf4.q c17;
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(((com.tencent.mm.autogen.events.ResendVoiceRemindMsgEvent) iEvent).f54708g.f8399a.Q0(), (int) r7.getMsgId());
        if (Li.getMsgId() != 0 && Li.z0() != null && !com.tencent.mm.sdk.platformtools.t8.K0(Li.z0()) && (c17 = zf4.r.c(Li.z0())) != null && !com.tencent.mm.sdk.platformtools.t8.K0(c17.field_filename)) {
            c17.field_status = 3;
            c17.field_offset = 0;
            c17.field_createtime = java.lang.System.currentTimeMillis() / 1000;
            c17.field_lastmodifytime = java.lang.System.currentTimeMillis() / 1000;
            c17.U = 16840;
            zf4.r.f(c17);
            if (c17.field_msglocalid == 0 || com.tencent.mm.sdk.platformtools.t8.K0(c17.field_user)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VoiceRemindLogic", " failed msg id:" + c17.field_msglocalid + " user:" + c17.field_user);
            } else {
                Li.r1(1);
                ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(Li.getMsgId(), Li, true);
                zf4.l.Ai().c();
            }
        }
        return false;
    }
}
