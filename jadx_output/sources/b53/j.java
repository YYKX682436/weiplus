package b53;

/* loaded from: classes8.dex */
public class j extends b53.a {
    @Override // b53.a
    public void a(android.content.Context context, com.tencent.mm.plugin.webview.luggage.e0 e0Var, db5.g4 g4Var, r45.rk4 rk4Var) {
        java.lang.String b17 = e0Var.K.b();
        android.os.Bundle bundle = e0Var.f406657n;
        java.lang.String string = bundle.getString("shortcut_user_name");
        if (bundle.getBoolean("from_shortcut", false) || com.tencent.mm.sdk.platformtools.t8.K0(b17) || com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            return;
        }
        g4Var.f(rk4Var.f384967g, rk4Var.f384965e + "__" + rk4Var.f384966f);
    }

    @Override // b53.a
    public void b(android.content.Context context, com.tencent.mm.plugin.webview.luggage.e0 e0Var, r45.rk4 rk4Var) {
        java.lang.String string = e0Var.f406657n.getString("shortcut_user_name");
        java.lang.String b17 = e0Var.K.b();
        if (com.tencent.mm.sdk.platformtools.t8.K0(string) || com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
            return;
        }
        com.tencent.mm.plugin.game.luggage.ipc.AddShortcutTask addShortcutTask = new com.tencent.mm.plugin.game.luggage.ipc.AddShortcutTask();
        addShortcutTask.f139566f = string;
        addShortcutTask.f139567g = b17;
        addShortcutTask.f139569i = new b53.i(this, addShortcutTask, e0Var, context);
        addShortcutTask.d();
    }
}
