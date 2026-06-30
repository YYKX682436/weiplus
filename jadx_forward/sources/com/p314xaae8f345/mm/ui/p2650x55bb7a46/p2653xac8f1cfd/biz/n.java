package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz;

/* loaded from: classes8.dex */
public class n implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a f280340d;

    public n(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar) {
        this.f280340d = aVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        yb5.d dVar;
        r45.wk wkVar;
        r45.z6 z6Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "fetchAISubtitle rsp errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar = this.f280340d;
        if (aVar.f280279h != null && (dVar = aVar.f280113d) != null && dVar.f542250l != null && dVar.u() != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar2 = this.f280340d;
            if (aVar2.K && (wkVar = (r45.wk) oVar.f152244b.f152233a) != null && (z6Var = wkVar.f470759d) != null) {
                int i19 = z6Var.f473276d;
                final java.lang.String str2 = z6Var.f473277e;
                if (str2 == null) {
                    str2 = "";
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "aiIvrReply aiReplyOpen %d->%d, wording %s->%s", java.lang.Integer.valueOf(aVar2.f280279h.f66728x661cc147), java.lang.Integer.valueOf(i19), this.f280340d.f280279h.f66729x2205364b, str2);
                if (android.text.TextUtils.equals(str2, this.f280340d.f280279h.f66729x2205364b) && i19 == this.f280340d.f280279h.f66728x661cc147) {
                    return 0;
                }
                if (i19 != 1 || android.text.TextUtils.isEmpty(str2)) {
                    qk.o oVar2 = this.f280340d.f280279h;
                    if (oVar2.f66728x661cc147 == 1 && !android.text.TextUtils.isEmpty(oVar2.f66729x2205364b) && i19 == 0) {
                        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.biz.n$$b
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar3 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.n.this.f280340d;
                                if (aVar3.f280113d.f542250l.m78383x21a1233e("key_has_add_contact", false).booleanValue() || aVar3.f280113d.u().r2() || !aVar3.f280113d.u().k2() || com.p314xaae8f345.mm.p2621x8fb0427b.z3.r4(aVar3.f280113d.u().d1())) {
                                    aVar3.f280113d.f542250l.mo78691x3f86539a((java.lang.String) null);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "fetchAISubtitle, setMMSubTitle to null");
                                } else {
                                    aVar3.f280113d.f542250l.mo78690x3f86539a(com.p314xaae8f345.mm.R.C30867xcad56011.b17);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "fetchAISubtitle, setMMSubTitle to not_add");
                                }
                            }
                        });
                    }
                } else {
                    ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.biz.n$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.n.this.f280340d.f280113d.f542250l.mo78691x3f86539a(str2);
                        }
                    });
                }
                qk.o oVar3 = this.f280340d.f280279h;
                oVar3.f66728x661cc147 = i19;
                oVar3.f66729x2205364b = str2;
                r01.q3.cj().mo9952xce0038c9(this.f280340d.f280279h, new java.lang.String[0]);
            }
        }
        return 0;
    }
}
