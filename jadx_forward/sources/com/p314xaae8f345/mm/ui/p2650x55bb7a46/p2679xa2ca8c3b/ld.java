package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public abstract class ld {
    public static boolean a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        rt0.c cVar;
        if (c01.ia.D(f9Var)) {
            return true;
        }
        ot0.q v17 = ot0.q.v(f9Var.U1());
        return (v17 == null || (cVar = (rt0.c) v17.y(rt0.c.class)) == null || cVar.f480907b != 2) ? false : true;
    }

    public static boolean b(final yb5.d dVar, android.view.View view) {
        if (com.p314xaae8f345.mm.ui.tk.f291489c.a()) {
            return true;
        }
        if (view.getTag() instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) {
            final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
            if (erVar.c() != null) {
                android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f.class);
                intent.addFlags(67108864);
                intent.putExtra("Chat_Msg_Id", erVar.c().m124847x74d37ac6());
                intent.putExtra("Chat_User", erVar.c().Q0());
                ot0.q v17 = ot0.q.v(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym) ((sb5.l2) dVar.f542241c.a(sb5.l2.class))).q0(erVar.c(), false));
                if (v17 != null) {
                    intent.putExtra("key_chat_text", v17.f430187f);
                }
                intent.putExtra("key_chat_from", view.getContext().getClass().getName());
                intent.putExtra("is_group_chat", dVar.D());
                j45.l.q(dVar.f542242d, intent, 1010, new j45.g() { // from class: com.tencent.mm.ui.chatting.viewitems.ld$$b
                    @Override // j45.g
                    /* renamed from: onActivityResult */
                    public final void mo79431x9d4787cb(int i17, int i18, android.content.Intent intent2) {
                        if (i17 == 1010 && i18 == 101) {
                            java.lang.Object a17 = ok5.d.a(intent2, "kPartialQuoteContent");
                            if (a17 instanceof r15.g) {
                                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) yb5.d.this.f542241c.a(sb5.s0.class))).o0(erVar.c(), (r15.g) a17);
                            }
                        }
                    }
                });
                db5.f.j(view.getContext());
                return true;
            }
        }
        return false;
    }
}
