package bw5;

/* loaded from: classes11.dex */
public enum a90 implements com.tencent.mm.protobuf.h {
    kMMListenMembershipSchemeGetRequestTypeDefault(0),
    kMMListenMembershipSchemeGetRequestTypeAutoPlayer(1),
    kMMListenMembershipSchemeGetRequestTypeDiscoverTopToast(2),
    kMMListenMembershipSchemeGetRequestTypeMembershipPage(3),
    kMMListenMembershipSchemeGetRequestTypeUserPageDiscover(4),
    kMMListenMembershipSchemeGetRequestTypeVipLimitFreeAuto(5),
    kMMListenMembershipSchemeGetRequestTypeTryWording(6),
    kMMListenMembershipSchemeGetRequestTypeVipLimitFreeAutoAD(7),
    kMMListenMembershipSchemeGetRequestTypeUserPageDiscoverTopToast(8),
    kMMListenMembershipSchemeGetRequestTypeVipLimitFreeAutoBindQQMusic(9),
    kMMListenMembershipSchemeGetRequestTypeUserPageDiscoverGoBindQQMusic(10),
    kMMListenMembershipSchemeGetRequestTypeBindQQMusicRecharge(11),
    kMMListenMembershipSchemeGetRequestTypeVipLimitFreeAutoQQMusicGreenVip(12),
    kMMListenMembershipSchemeGetRequestTypeVipLimitFreeIcon(13);


    /* renamed from: d, reason: collision with root package name */
    public final int f25106d;

    a90(int i17) {
        this.f25106d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f25106d;
    }
}
