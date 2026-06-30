package ra3;

/* loaded from: classes.dex */
public class d implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        java.lang.String i17 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().i(c10756x2a5d7b2d.f149939d, true, false);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i17) || !com.p314xaae8f345.mm.vfs.w6.j(i17)) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            i17 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().i(c10756x2a5d7b2d.f149939d, false, false);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i17) || !com.p314xaae8f345.mm.vfs.w6.j(i17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCSyncInvokeTask_GetAvatarPath", "getAvatarFullPath file not exist", i17);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i17)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
                sb6.append(gm0.j1.u().h());
                sb6.append("avatar/");
                java.lang.String g17 = kk.k.g(c10756x2a5d7b2d.f149939d.getBytes());
                sb6.append(g17.substring(0, 2));
                sb6.append('/');
                sb6.append(g17.substring(2, 4));
                sb6.append("/user_");
                sb6.append(g17);
                sb6.append(".png");
                i17 = sb6.toString();
                com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.vfs.w6.r(i17));
            }
            kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
            java.lang.String str = c10756x2a5d7b2d.f149939d;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) c0Var).getClass();
            android.graphics.Bitmap b17 = com.p314xaae8f345.mm.p943x351df9c2.g.b(str, true, -1, null);
            if (b17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCSyncInvokeTask_GetAvatarPath", "getHeadImage null", c10756x2a5d7b2d.f149939d);
            } else {
                try {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(b17, 100, android.graphics.Bitmap.CompressFormat.JPEG, i17, true)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCSyncInvokeTask_GetAvatarPath", "save headImage failed");
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCSyncInvokeTask_GetAvatarPath", "save headImage failed", e17);
                }
            }
        }
        java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(i17, false);
        new android.os.Bundle().putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, i18);
        return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(i18);
    }
}
