package q12;

/* loaded from: classes5.dex */
public class y extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public y() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.vfs.z7 z7Var;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5257x89865775 c5257x89865775 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5257x89865775) abstractC20979x809547d1;
        am.t2 t2Var = c5257x89865775.f135588g;
        if (t2Var.f89499a == 37) {
            if (t2Var.f89500b == 5 && t2Var.f89501c == 2) {
                y12.j e17 = y12.j.e();
                e17.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiResUpdateMgr", "delete emoji egg!");
                try {
                    java.lang.String c17 = y12.j.c();
                    com.p314xaae8f345.mm.vfs.z7 a17 = c17 == null ? null : com.p314xaae8f345.mm.vfs.z7.a(c17);
                    if (a17 == null) {
                        z7Var = new com.p314xaae8f345.mm.vfs.z7(null, null, com.p314xaae8f345.mm.vfs.e8.l("egg", false, false), null, null);
                    } else {
                        z7Var = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, com.p314xaae8f345.mm.vfs.e8.l(a17.f294812f + "/egg", false, false), a17.f294813g, a17.f294814h);
                    }
                    com.p314xaae8f345.mm.vfs.w6.f(z7Var.m82499x9616526c());
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.emoji.EmojiResUpdateMgr", e18, "", new java.lang.Object[0]);
                }
                synchronized (e17) {
                    e17.f540407b = null;
                }
            }
            am.t2 t2Var2 = c5257x89865775.f135588g;
            if (t2Var2.f89501c == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiResUpdateOperationListener", "cache res type:%d subType:%d", java.lang.Integer.valueOf(t2Var2.f89499a), java.lang.Integer.valueOf(t2Var2.f89500b));
            }
        }
        return false;
    }
}
