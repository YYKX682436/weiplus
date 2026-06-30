package qt2;

/* loaded from: classes2.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt2.u f448143d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(qt2.u uVar) {
        super(0);
        this.f448143d = uVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        final qt2.u uVar = this.f448143d;
        return new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5441x35e2cf6a>(uVar.m158354x19263085()) { // from class: com.tencent.mm.plugin.finder.share.FinderShareGuideManageUIC$videoFinishListener$2$1
            {
                this.f39173x3fe91575 = -1291074182;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5441x35e2cf6a c5441x35e2cf6a) {
                in5.s0 O6;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5441x35e2cf6a event = c5441x35e2cf6a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                qt2.u uVar2 = qt2.u.this;
                if (!uVar2.f448153p && (O6 = uVar2.O6()) != null) {
                    java.lang.Object obj = O6.f374658i;
                    so2.u1 u1Var = obj instanceof so2.u1 ? (so2.u1) obj : null;
                    if (u1Var != null && u1Var.getFeedObject().m59331xcb21161d()) {
                        long m59233x87980ca = u1Var.getFeedObject().m59233x87980ca();
                        am.fa faVar = event.f135782g;
                        if ((m59233x87980ca == faVar.f88191a || (faVar.f88192b && u1Var.getFeedObject().m59260x51f8f5b0() == faVar.f88191a)) && (faVar.f88195e || faVar.f88194d)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderShareGuideManageUIC", "share video is completed: isVideoComplete:" + faVar.f88194d + " isEnd:" + faVar.f88195e);
                            uVar2.f448153p = true;
                            uVar2.R6("videoFinish");
                        }
                    }
                }
                return true;
            }
        };
    }
}
