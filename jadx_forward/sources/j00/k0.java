package j00;

/* loaded from: classes5.dex */
public final class k0 implements p11.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378342a;

    public k0(java.lang.String str) {
        this.f378342a = str;
    }

    @Override // p11.d
    public final void a(boolean z17, java.lang.Object[] objArr) {
        java.lang.String str = this.f378342a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "downloadEcsGiftImage success:" + str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "downloadEcsGiftImage failed:" + str);
        }
    }
}
