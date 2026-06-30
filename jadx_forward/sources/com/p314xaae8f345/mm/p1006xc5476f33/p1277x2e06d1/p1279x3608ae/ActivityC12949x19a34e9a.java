package com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae;

@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.base.stub.WXShortcutEntryActivity */
/* loaded from: classes8.dex */
public class ActivityC12949x19a34e9a extends com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409 {
    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409
    public void X6(com.p314xaae8f345.mm.p2470x93e71c27.ui.p pVar, android.content.Intent intent) {
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXShortcutEntryActivity", "intent is null");
            finish();
            return;
        }
        k34.h hVar = k34.h.INSTANCE;
        int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(intent, "type", 0);
        hVar.getClass();
        if (!(g17 == 1 || g17 == 3) || com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.GlobalAppbrand.k(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.h1(this))) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            k34.f fVar = (k34.f) hVar.f385428d.get(g17);
            if (fVar == null) {
                java.util.Iterator it = ((fs.e) ((fs.c) fs.g.f(k34.g.class)).all()).iterator();
                while (it.hasNext()) {
                    fs.q qVar = (fs.q) it.next();
                    if (qVar.mo210xb7045565(java.lang.Integer.valueOf(g17))) {
                        fVar = (k34.f) qVar.get();
                    }
                }
            }
            if (fVar != null) {
                fVar.b(mo55332x76847179, intent);
                fVar.c(mo55332x76847179, intent);
                fVar.f(mo55332x76847179, intent);
            }
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409
    public boolean Y6(android.content.Intent intent) {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
