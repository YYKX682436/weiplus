package oc;

/* loaded from: classes14.dex */
public final class f extends android.os.Handler {
    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i17 = message.what;
        oc.h hVar = oc.g.f425634a;
        if (i17 == 2) {
            mc.p.f407064a.b("TuringSdkHelper", "turing face timeout " + hVar.f425644j);
            hVar.f425641g = true;
            oc.h.b(hVar);
            return;
        }
        if (i17 != 3) {
            if (i17 != 4) {
                mc.p.f407064a.e("TuringSdkHelper", "error event");
                return;
            }
            mc.q qVar = mc.p.f407064a;
            qVar.b("TuringSdkHelper", "wait frame image check is time out");
            qVar.b("TuringSdkHelper", "remove compare check all listener");
            if (hVar.f425643i != null) {
                hVar.f425643i.removeMessages(4);
            }
        }
    }
}
