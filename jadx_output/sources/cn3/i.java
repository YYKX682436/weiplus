package cn3;

/* loaded from: classes11.dex */
public class i extends com.tencent.mm.sdk.event.n {
    public i() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        am.oi oiVar = ((com.tencent.mm.autogen.events.LbsVerifyMessageCreateFromVoiceEvent) iEvent).f54465g;
        c01.ea eaVar = oiVar.f7540b;
        com.tencent.mm.storage.f9 f9Var = oiVar.f7539a;
        if (eaVar.f37150i != null && eaVar.f37151j == 1) {
            gm0.j1.u().c().w(73729, 1);
            com.tencent.mm.storage.t8 t8Var = new com.tencent.mm.storage.t8();
            t8Var.field_content = f9Var.j();
            t8Var.field_createtime = com.tencent.mm.sdk.platformtools.t8.i1();
            t8Var.field_imgpath = "";
            t8Var.field_sayhicontent = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.h7c);
            t8Var.field_sayhiuser = f9Var.Q0();
            t8Var.field_scene = 18;
            t8Var.field_status = f9Var.P0() > 3 ? f9Var.P0() : 3;
            t8Var.field_svrid = f9Var.I0();
            t8Var.field_talker = f9Var.Q0();
            t8Var.field_type = 34;
            t8Var.field_isSend = 0;
            t8Var.field_sayhiencryptuser = f9Var.Q0();
            t8Var.field_ticket = eaVar.f37150i;
            gm0.j1.b().c();
            ((com.tencent.mm.storage.u8) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi()).insert(t8Var);
            com.tencent.mm.autogen.events.LbsSayHiEvent lbsSayHiEvent = new com.tencent.mm.autogen.events.LbsSayHiEvent();
            lbsSayHiEvent.f54464g.f7426a = f9Var.Q0();
            lbsSayHiEvent.e();
        }
        return false;
    }
}
