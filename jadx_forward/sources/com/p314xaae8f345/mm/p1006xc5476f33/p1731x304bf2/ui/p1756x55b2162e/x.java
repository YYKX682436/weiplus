package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* loaded from: classes8.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.a0 f222860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f222861e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.y f222862f;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.y yVar, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.a0 a0Var, int i17) {
        this.f222862f = yVar;
        this.f222860d = a0Var;
        this.f222861e = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/chat_tab/GameHotMsgView$GameHotMsgAdapter$HotMsgViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        u53.a0 a0Var = (u53.a0) i95.n0.c(u53.a0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.y yVar = this.f222862f;
        android.content.Context context = yVar.f222871m.f222877f.f222656f2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.a0 a0Var2 = this.f222860d;
        z53.i conversation = a0Var2.f222766e;
        ((z53.q) a0Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conversation, "conversation");
        ((d63.e) ((u53.b0) i95.n0.c(u53.b0.class))).wi();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_Self", conversation.f67668x5568d387);
        intent.putExtra("Chat_User", conversation.f67669xbed8694c);
        intent.putExtra("finish_direct", true);
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.d dVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.e.f149727a;
        dVar.d(null);
        j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
        ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).wi(conversation.f67670x114ef53e);
        ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).wi(conversation.f67668x5568d387);
        y53.m Di = ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Di(a0Var2.f222766e.f67668x5568d387);
        z53.i iVar = a0Var2.f222766e;
        y53.m mVar = iVar.F;
        if (mVar != null && Di != null) {
            int i17 = this.f222861e + 1;
            int i18 = yVar.f222871m.f222875d;
            java.lang.String str = iVar.f67669xbed8694c;
            long j17 = Di.f67426x9f600742;
            java.lang.String str2 = iVar.f67668x5568d387;
            long j18 = mVar.f67426x9f600742;
            java.lang.String str3 = iVar.f67670x114ef53e;
            long t07 = iVar.t0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16004xccb3de6b c16004xccb3de6b = yVar.f222871m.f222877f;
            long j19 = c16004xccb3de6b.f222657g2;
            if (j19 <= 0) {
                j19 = c16004xccb3de6b.f222658h2;
            }
            dVar.f(i17, 2L, i18, str, j17, str2, j18, str3, t07, (int) j19, null, java.lang.Integer.valueOf(a0Var2.f222766e.f67671xa35b5abb));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/chat_tab/GameHotMsgView$GameHotMsgAdapter$HotMsgViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
