package rr;

/* loaded from: classes4.dex */
public abstract class u {
    public static final void a(java.lang.String groupId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupId, "groupId");
        r45.gj0 h17 = gr.t.g().h();
        if (h17.f456826d.contains(groupId)) {
            return;
        }
        h17.f456826d.add(groupId);
        gr.t g17 = gr.t.g();
        g17.getClass();
        try {
            byte[] mo14344x5f01b1f6 = g17.h().mo14344x5f01b1f6();
            z85.x e17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().e();
            e17.getClass();
            e17.mo11260x413cb2b4(new z85.w("cache_type_user_data", mo14344x5f01b1f6));
        } catch (java.io.IOException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EmojiStorageCache", e18, "save user data error", new java.lang.Object[0]);
        }
    }
}
