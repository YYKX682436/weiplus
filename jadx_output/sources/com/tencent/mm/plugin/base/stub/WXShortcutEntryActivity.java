package com.tencent.mm.plugin.base.stub;

@ul5.d(0)
/* loaded from: classes8.dex */
public class WXShortcutEntryActivity extends com.tencent.mm.pluginsdk.ui.AutoLoginActivity {
    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity
    public void X6(com.tencent.mm.pluginsdk.ui.p pVar, android.content.Intent intent) {
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXShortcutEntryActivity", "intent is null");
            finish();
            return;
        }
        k34.h hVar = k34.h.INSTANCE;
        int g17 = com.tencent.mm.sdk.platformtools.c2.g(intent, "type", 0);
        hVar.getClass();
        if (!(g17 == 1 || g17 == 3) || com.tencent.mm.sdk.platformtools.f9.GlobalAppbrand.k(this, new com.tencent.mm.plugin.base.stub.h1(this))) {
            androidx.appcompat.app.AppCompatActivity context = getContext();
            k34.f fVar = (k34.f) hVar.f303895d.get(g17);
            if (fVar == null) {
                java.util.Iterator it = ((fs.e) ((fs.c) fs.g.f(k34.g.class)).all()).iterator();
                while (it.hasNext()) {
                    fs.q qVar = (fs.q) it.next();
                    if (qVar.hasKey(java.lang.Integer.valueOf(g17))) {
                        fVar = (k34.f) qVar.get();
                    }
                }
            }
            if (fVar != null) {
                fVar.b(context, intent);
                fVar.c(context, intent);
                fVar.f(context, intent);
            }
            finish();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity
    public boolean Y6(android.content.Intent intent) {
        return true;
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
