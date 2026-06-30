package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public final class x0 implements i22.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiDesignerPackInfoUI f98552a;

    public x0(com.tencent.mm.plugin.emoji.ui.EmojiDesignerPackInfoUI emojiDesignerPackInfoUI) {
        this.f98552a = emojiDesignerPackInfoUI;
    }

    @Override // i22.o0
    public void a(i22.m holder, int i17, i22.n0 n0Var) {
        boolean z17;
        j12.i iVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        if (n0Var == null || !((z17 = n0Var instanceof i22.m0))) {
            return;
        }
        i22.m0 m0Var = z17 ? (i22.m0) n0Var : null;
        if (m0Var == null || (iVar = m0Var.f288004a) == null) {
            return;
        }
        bw5.ra raVar = iVar.f297168c;
        java.lang.String str = raVar.f32456d;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        d22.d0 d0Var = new d22.d0(str, null, iVar);
        d0Var.f364198g = 106;
        d0Var.f364155a = 69;
        d0Var.f364200i = true;
        com.tencent.mm.plugin.emoji.ui.EmojiDesignerPackInfoUI emojiDesignerPackInfoUI = this.f98552a;
        java.lang.String stringExtra = emojiDesignerPackInfoUI.getIntent().getStringExtra("to_talker_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        d0Var.f364199h = stringExtra;
        com.tencent.mm.sdk.platformtools.c2.c(emojiDesignerPackInfoUI.getIntent(), "from_appbrand_ui", false);
        nr.d dVar = nr.d.f339041a;
        com.tencent.mm.autogen.mmdata.rpt.EmoticonBoardReddotNotificationStruct emoticonBoardReddotNotificationStruct = nr.d.f339042b;
        emoticonBoardReddotNotificationStruct.p(raVar.f32456d);
        dVar.a(4);
        emoticonBoardReddotNotificationStruct.p("");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12740, 4, "", "", "", 69, 69);
        d22.u.f225876a.a(emojiDesignerPackInfoUI.getContext(), d0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i22.p0
    public void b(i22.m holder, int i17, i22.n0 n0Var) {
        boolean z17;
        j12.i iVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        if (n0Var != null && ((z17 = n0Var instanceof i22.m0)) && (holder instanceof i12.x)) {
            i22.m0 m0Var = z17 ? (i22.m0) n0Var : null;
            if (m0Var == null || (iVar = m0Var.f288004a) == null) {
                return;
            }
            nr.d dVar = nr.d.f339041a;
            com.tencent.mm.autogen.mmdata.rpt.EmoticonBoardReddotNotificationStruct emoticonBoardReddotNotificationStruct = nr.d.f339042b;
            emoticonBoardReddotNotificationStruct.p(iVar.f297168c.f32456d);
            dVar.a(3);
            emoticonBoardReddotNotificationStruct.p("");
            com.tencent.mm.plugin.emoji.ui.EmojiDesignerPackInfoUI emojiDesignerPackInfoUI = this.f98552a;
            i22.b0 b0Var = emojiDesignerPackInfoUI.f97746f;
            if (b0Var != null) {
                b0Var.f287935d = (i22.q0) holder;
            }
            if (b0Var != null) {
                b0Var.f287940i = new g22.u0(emojiDesignerPackInfoUI.mo133getLifecycle(), emojiDesignerPackInfoUI.f97746f);
            }
            i22.b0 b0Var2 = emojiDesignerPackInfoUI.f97746f;
            if (b0Var2 != null) {
                b0Var2.b();
            }
        }
    }
}
