package b53;

/* loaded from: classes8.dex */
public class j extends b53.a {
    @Override // b53.a
    public void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var, db5.g4 g4Var, r45.rk4 rk4Var) {
        java.lang.String b17 = e0Var.K.b();
        android.os.Bundle bundle = e0Var.f488190n;
        java.lang.String string = bundle.getString("shortcut_user_name");
        if (bundle.getBoolean("from_shortcut", false) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            return;
        }
        g4Var.f(rk4Var.f466500g, rk4Var.f466498e + "__" + rk4Var.f466499f);
    }

    @Override // b53.a
    public void b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var, r45.rk4 rk4Var) {
        java.lang.String string = e0Var.f488190n.getString("shortcut_user_name");
        java.lang.String b17 = e0Var.K.b();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ipc.C15883x799c8e0c c15883x799c8e0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ipc.C15883x799c8e0c();
        c15883x799c8e0c.f221099f = string;
        c15883x799c8e0c.f221100g = b17;
        c15883x799c8e0c.f221102i = new b53.i(this, c15883x799c8e0c, e0Var, context);
        c15883x799c8e0c.d();
    }
}
