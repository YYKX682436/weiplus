package f93;

/* loaded from: classes11.dex */
public class k3 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384 f341904a;

    public k3(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384 viewOnCreateContextMenuListenerC16171x51fc9384) {
        this.f341904a = viewOnCreateContextMenuListenerC16171x51fc9384;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        int i17 = message.what;
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384 viewOnCreateContextMenuListenerC16171x51fc9384 = this.f341904a;
        switch (i17) {
            case com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.f50820x1cfb1f28 /* 5001 */:
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384.f224804p1;
                viewOnCreateContextMenuListenerC16171x51fc9384.f7(false);
                return;
            case 5002:
                viewOnCreateContextMenuListenerC16171x51fc9384.U6(viewOnCreateContextMenuListenerC16171x51fc9384.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq));
                return;
            case 5003:
                viewOnCreateContextMenuListenerC16171x51fc9384.m65194xce38d9a();
                return;
            default:
                return;
        }
    }
}
