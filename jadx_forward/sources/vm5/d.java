package vm5;

/* loaded from: classes10.dex */
public final class d implements com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vm5.g f519680a;

    public d(vm5.g gVar) {
        this.f519680a = gVar;
    }

    @Override // com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerListener
    /* renamed from: onPositionChanged */
    public void mo98051x5c3ac16c(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57) {
        vm5.a aVar;
        vm5.g gVar = this.f519680a;
        vm5.a aVar2 = gVar.f519694e;
        if (aVar2 != null) {
            aVar2.a((c25736x76b98a57 != null ? c25736x76b98a57.m97232x31040141() : 0L) / 1000);
        }
        boolean z17 = false;
        if (c25736x76b98a57 != null && c25736x76b98a57.m97232x31040141() == gVar.f519690a.h().m97261xccb87a6a()) {
            z17 = true;
        }
        if (!z17 || (aVar = gVar.f519694e) == null) {
            return;
        }
        aVar.s();
    }

    @Override // com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerListener
    /* renamed from: onStatusChanged */
    public void mo98052xed0a9ac3(com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus playerStatus) {
        vm5.a aVar;
        xm5.b.c("VideoCompositionPlayer", "onStatusChanged:" + playerStatus, new java.lang.Object[0]);
        com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus playerStatus2 = com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus.PLAYING;
        vm5.g gVar = this.f519680a;
        if (playerStatus == playerStatus2) {
            vm5.a aVar2 = gVar.f519694e;
            if (aVar2 != null) {
                aVar2.s();
                return;
            }
            return;
        }
        if (playerStatus == com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus.STOPPED) {
            vm5.a aVar3 = gVar.f519694e;
            if (aVar3 != null) {
                aVar3.i();
                return;
            }
            return;
        }
        if (playerStatus == com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus.FINISHED) {
            vm5.a aVar4 = gVar.f519694e;
            if (aVar4 != null) {
                aVar4.g();
                return;
            }
            return;
        }
        if (playerStatus != com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25834xa44a6c8a.PlayerStatus.ERROR || (aVar = gVar.f519694e) == null) {
            return;
        }
        aVar.e();
    }
}
