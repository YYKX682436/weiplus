package pa3;

/* loaded from: classes8.dex */
public class j extends gp1.e0 {
    @Override // gp1.x
    public void G0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        if (c12886x91aa2b6d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiteAppFloatBallHelper", "ballInfo is null");
            return;
        }
        android.os.Bundle bundle = c12886x91aa2b6d.G;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65445x856bf801(bundle.getString("appId"), bundle.getString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f), bundle.getString("query"), 2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppFloatBallHelper", "float ball remove, so release keepalive");
    }

    @Override // gp1.e0, gp1.x
    public void V(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
    }

    @Override // gp1.x
    public void r0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        if (c12886x91aa2b6d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiteAppFloatBallHelper", "ballInfo is null");
            return;
        }
        android.os.Bundle bundle = c12886x91aa2b6d.G;
        q80.d0 d0Var = new q80.d0();
        d0Var.f442182a = bundle.getString("appId");
        d0Var.f442183b = bundle.getString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f);
        java.lang.String string = bundle.getString("query");
        d0Var.f442184c = string != null ? new org.json.JSONObject(string).toString() : null;
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f80 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80();
        c3708xc1f46f80.f14311x683188c = com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.FLOAT;
        c3708xc1f46f80.f14312x721f2ec7 = bundle.getString("appId");
        java.lang.String string2 = bundle.getString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
        c3708xc1f46f80.f14309xf0df6fda = string2 != null ? new org.json.JSONObject(string2) : null;
        d0Var.f442207z = c3708xc1f46f80;
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putBoolean("key_enter_from_float_ball", true);
        bundle2.putBoolean("key_enter_with_animation", true);
        bundle2.putInt("key_enter_group_type", c12886x91aa2b6d.f174581f);
        d0Var.f442188g = bundle2;
        d0Var.f442197p = com.p314xaae8f345.mm.R.C30854x2dc211.f559261p;
        d0Var.f442198q = com.p314xaae8f345.mm.R.C30854x2dc211.f559261p;
        d0Var.A = 180;
        d0Var.C = 2;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, d0Var, new pa3.f());
    }
}
