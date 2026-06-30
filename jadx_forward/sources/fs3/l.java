package fs3;

/* loaded from: classes15.dex */
public class l extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.ActivityC16925x87b5f55d f347843a;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.ActivityC16925x87b5f55d activityC16925x87b5f55d) {
        this.f347843a = activityC16925x87b5f55d;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        int i17 = message.what;
        com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.ActivityC16925x87b5f55d activityC16925x87b5f55d = this.f347843a;
        if (i17 != 10001) {
            if (i17 != 10002) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.ActivityC16925x87b5f55d.T6(activityC16925x87b5f55d, 1);
        } else {
            fs3.y yVar = activityC16925x87b5f55d.A;
            if (yVar != null) {
                yVar.a(activityC16925x87b5f55d.f236303x);
            }
        }
    }
}
