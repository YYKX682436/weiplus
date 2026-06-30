package com.tencent.mm.plugin.announcement;

/* loaded from: classes12.dex */
public class e implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74691a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.announcement.ChatroomNoticeUI f74692b;

    public e(com.tencent.mm.plugin.announcement.ChatroomNoticeUI chatroomNoticeUI, int i17) {
        this.f74692b = chatroomNoticeUI;
        this.f74691a = i17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.announcement.ChatroomNoticeUI chatroomNoticeUI = this.f74692b;
        if (chatroomNoticeUI.f74678x0) {
            chatroomNoticeUI.X = db5.e1.Q(chatroomNoticeUI.getContext(), chatroomNoticeUI.getString(com.tencent.mm.R.string.f490573yv), chatroomNoticeUI.getString(com.tencent.mm.R.string.i67), true, true, new com.tencent.mm.plugin.announcement.d(this));
            chatroomNoticeUI.f96500g.d(chatroomNoticeUI);
            java.lang.String o17 = nx1.d.q().o();
            kk.j jVar = com.tencent.mm.plugin.component.editor.u1.f96637a;
            java.lang.String k17 = com.tencent.mm.plugin.component.editor.u1.k(java.util.regex.Pattern.compile("<object[^>]*>", 2).matcher(o17).replaceAll("#WNNoteNode#<ThisisNoteNodeObj>#WNNoteNode#"));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(k17) && k17.length() != 0) {
                k17 = java.util.regex.Pattern.compile("\\s*|\t|\r|\n").matcher(k17).replaceAll("");
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(k17)) {
                chatroomNoticeUI.b7("", "", true);
            } else {
                chatroomNoticeUI.E = new com.tencent.mm.plugin.component.editor.f1(chatroomNoticeUI);
                if (chatroomNoticeUI.A.size() <= 0) {
                    chatroomNoticeUI.E.run();
                    chatroomNoticeUI.E = null;
                }
            }
            vg3.h4 h4Var = (vg3.h4) i95.n0.c(vg3.h4.class);
            java.lang.String str2 = chatroomNoticeUI.K;
            int i17 = this.f74691a;
            ((hn.h0) h4Var).getClass();
            gm0.j1.i();
            long j17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true).M1;
            if (j17 != 0) {
                com.tencent.mm.storage.f9 Li = pt0.f0.Li(str2, j17);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(Li.X1())) {
                    kn.k0.b(str2, 1, i17, 2, Li.X1(), "roomannouncement@app.origin");
                }
            }
            chatroomNoticeUI.r7(this.f74691a != 6 ? 8 : 6);
        }
    }
}
