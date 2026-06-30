package cm1;

/* loaded from: classes14.dex */
public final class e implements com.tencent.mm.app.t2 {
    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WMPFVoip.WMPFVoipCallInManager", "willEnterWxaVoipCallingOnAppForeground[" + cm1.t.f43319d + "] currentDataEnterWxaVoipCalling=[" + cm1.t.f43318c + ']');
        if (cm1.t.f43319d) {
            cm1.t tVar = cm1.t.f43316a;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            tVar.b(context, false);
            if (((uf0.e) i95.n0.c(uf0.e.class)) != null) {
                ((com.tencent.mm.booter.notification.x) mo3.f.f330406a).f(41);
            }
        }
    }
}
