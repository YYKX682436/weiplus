package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.g1.class})
/* loaded from: classes12.dex */
public final class j1 extends i95.w {
    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int i17 = com.p314xaae8f345.mm.p679x5c28046.p683x361a9b.C10446x2405cf9e.f146463a;
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("com.tencent.mm.Emoji_Update");
        if (fp.h.a(33)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(new com.p314xaae8f345.mm.p679x5c28046.p683x361a9b.C10446x2405cf9e(), intentFilter);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(new com.p314xaae8f345.mm.p679x5c28046.p683x361a9b.C10446x2405cf9e(), intentFilter, 4);
        }
    }
}
