package vq;

/* loaded from: classes4.dex */
public final class h1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f520697d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f520697d = emojiDebugUI;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("version: " + jr.j.f382840c + '\n');
        sb6.append("type: " + jr.j.f382839b + '\n');
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("size: ");
        java.util.LinkedList linkedList = jr.j.f382841d;
        synchronized (linkedList) {
        }
        sb7.append(linkedList.size());
        sb7.append('\n');
        sb6.append(sb7.toString());
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("updateTime: ");
        int i17 = 0;
        gr.v.f356229a.a(false);
        sb8.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v(r3.b().getInt("word_list_update_time", 0)));
        sb8.append('\n');
        sb6.append(sb8.toString());
        synchronized (linkedList) {
        }
        sb6.append(kz5.n0.g0(linkedList, "\n", null, null, 0, null, null, 62, null));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this.f520697d);
        u1Var.g(sb6.toString());
        u1Var.a(true);
        u1Var.q(false);
        android.database.Cursor f17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().f276711p.f552345d.f("select * from EmojiSuggestCacheInfo", null, 2);
        java.lang.String str = z85.n.f552344g;
        if (f17 != null) {
            while (f17.moveToNext()) {
                jr.e eVar = new jr.e();
                eVar.mo9015xbf5d97fd(f17);
                r45.hl5 hl5Var = new r45.hl5();
                byte[] bArr = eVar.f69113xad49e234;
                if (bArr != null) {
                    try {
                        hl5Var.mo11468x92b714fd(bArr);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                    }
                }
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder("dump: ");
                sb9.append(i17);
                sb9.append(": ");
                sb9.append(eVar.f69114x225aa2b6);
                sb9.append(", ");
                sb9.append(eVar.f69115xa783a79b);
                sb9.append("; ");
                java.util.LinkedList Emoji = hl5Var.f457800d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Emoji, "Emoji");
                sb9.append(kz5.n0.g0(Emoji, null, null, null, 0, null, z85.m.f552342d, 31, null));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb9.toString());
                i17++;
            }
            f17.close();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "dump done: count " + i17);
        return jz5.f0.f384359a;
    }
}
