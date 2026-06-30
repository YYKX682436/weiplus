package zn0;

/* loaded from: classes3.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f555866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser f555867e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zn0.i f555868f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.util.LinkedList linkedList, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser tRTCMixUser, zn0.i iVar) {
        super(1);
        this.f555866d = linkedList;
        this.f555867e = tRTCMixUser;
        this.f555868f = iVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        if (intValue >= 0) {
            java.util.LinkedList linkedList = this.f555866d;
            if (intValue < linkedList.size()) {
                int i17 = ((com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser) linkedList.get(intValue)).f297232x;
                com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser tRTCMixUser = this.f555867e;
                tRTCMixUser.f297232x = i17;
                tRTCMixUser.f297233y = ((com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser) linkedList.get(intValue)).f297233y;
                tRTCMixUser.f57071x6be2dc6 = ((com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser) linkedList.get(intValue)).f57071x6be2dc6;
                tRTCMixUser.f57062xb7389127 = ((com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser) linkedList.get(intValue)).f57062xb7389127;
                ((com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser) linkedList.get(intValue)).f57070xce2b2e46 = this.f555868f.f555887d;
                ((com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCMixUser) linkedList.get(intValue)).f57072xd4bdd2f4 = intValue + 1;
            }
        }
        return jz5.f0.f384359a;
    }
}
