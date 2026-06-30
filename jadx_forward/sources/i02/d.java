package i02;

/* loaded from: classes8.dex */
public class d implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i02.h f368040d;

    public d(i02.h hVar) {
        this.f368040d = hVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        boolean z17;
        i02.h hVar = this.f368040d;
        java.util.HashSet hashSet = hVar.f368054h;
        if (hashSet == null || hashSet.size() == 0) {
            android.content.Context context = hVar.f368050d;
            com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26659xeeb04200.m104843x9cf0d20b(context).m104847x68aabbb6("WechatDownloadClient");
            com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18 c26657x9422ab18 = hVar.f368049c;
            if (c26657x9422ab18 != null) {
                c26657x9422ab18.m104837xdeac007d(hVar.f368060n);
            }
            hVar.f368049c = null;
            com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26659xeeb04200.m104842xe742a1ec(context);
            try {
                context.stopService(new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.ServiceC26677x332af908.class));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileDownloaderImplTMAssistant", "Error occurred when stopping TMAssistant Service: " + e17.toString());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "TMAssistantSDK Client released");
            z17 = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderImplTMAssistant", "Still have tasks running");
            z17 = false;
        }
        if (!z17) {
            hVar.f368059m.c(240000L, 240000L);
        }
        return true;
    }
}
