package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzaj */
/* loaded from: classes13.dex */
public final class C2488x394b69 implements com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37 {
    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37
    /* renamed from: addListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> mo19672x162a7075(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.ChannelListener channelListener) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(abstractC1748xd28d482c, "client is null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(channelListener, "listener is null");
        return com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.zzb.zza(abstractC1748xd28d482c, new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2490x394b6b(new android.content.IntentFilter[]{com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2644x394c23.zzc("com.google.android.gms.wearable.CHANNEL_EVENT")}), channelListener);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37
    /* renamed from: openChannel */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.OpenChannelResult> mo19673x20502759(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, java.lang.String str, java.lang.String str2) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(abstractC1748xd28d482c, "client is null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(str, "nodeId is null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(str2, "path is null");
        return abstractC1748xd28d482c.mo17776xa0f98e08(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2489x394b6a(this, abstractC1748xd28d482c, str, str2));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37
    /* renamed from: removeListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> mo19674xf1335d58(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.ChannelListener channelListener) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(abstractC1748xd28d482c, "client is null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(channelListener, "listener is null");
        return abstractC1748xd28d482c.mo17776xa0f98e08(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2492x394b6d(abstractC1748xd28d482c, channelListener, null));
    }
}
