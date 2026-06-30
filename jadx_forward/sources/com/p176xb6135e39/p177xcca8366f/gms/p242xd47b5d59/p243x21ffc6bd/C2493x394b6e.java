package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzao */
/* loaded from: classes13.dex */
public final class C2493x394b6e extends com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e {

    /* renamed from: zzcg */
    private final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2488x394b69 f7560x394ba4;

    public C2493x394b6e(android.app.Activity activity, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01.Settings settings) {
        super(activity, settings);
        this.f7560x394ba4 = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2488x394b69();
    }

    public static /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2503x394b78 zzb(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3 interfaceC2453x8f4414e3) {
        return zza(interfaceC2453x8f4414e3);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e
    /* renamed from: close */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo19680x5a5ddf8(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel channel) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1922x695faa96.m18196x8941d8d4(zza(channel).mo19660x5a5ddf8(m17741xb77111ba()));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e
    /* renamed from: getInputStream */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.io.InputStream> mo19682xc7995ab4(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel channel) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1922x695faa96.m18195xcc3602a0(zza(channel).mo19662xc7995ab4(m17741xb77111ba()), com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2495x394b70.f7562x394b96);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e
    /* renamed from: getOutputStream */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.io.OutputStream> mo19683x592d6257(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel channel) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1922x695faa96.m18195xcc3602a0(zza(channel).mo19664x592d6257(m17741xb77111ba()), com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2496x394b71.f7563x394b96);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e
    /* renamed from: openChannel */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel> mo19684x20502759(java.lang.String str, java.lang.String str2) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1922x695faa96.m18195xcc3602a0(this.f7560x394ba4.mo19673x20502759(m17741xb77111ba(), str, str2), com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2494x394b6f.f7561x394b96);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e
    /* renamed from: receiveFile */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo19685x8299b2ff(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel channel, android.net.Uri uri, boolean z17) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1922x695faa96.m18196x8941d8d4(zza(channel).mo19666x8299b2ff(m17741xb77111ba(), uri, z17));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e
    /* renamed from: registerChannelCallback */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo19686xc1975d45(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel channel, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.ChannelCallback channelCallback) {
        java.lang.String zzc = ((com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2503x394b78) channel).zzc();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(channelCallback, "listener is null");
        android.os.Looper m17760x23b2dd47 = m17760x23b2dd47();
        java.lang.String valueOf = java.lang.String.valueOf(zzc);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0 m17928xe0f82b9c = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1782xdd080d3.m17928xe0f82b9c(channelCallback, m17760x23b2dd47, valueOf.length() != 0 ? "ChannelListener:".concat(valueOf) : new java.lang.String("ChannelListener:"));
        android.content.IntentFilter[] intentFilterArr = {com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2644x394c23.zzc("com.google.android.gms.wearable.CHANNEL_EVENT")};
        com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2497x394b72 c2497x394b72 = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2497x394b72(channelCallback);
        return m17748xa3689bc0(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2498x394b73(c2497x394b72, zzc, intentFilterArr, m17928xe0f82b9c, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1782xdd080d3.m17928xe0f82b9c(c2497x394b72, m17760x23b2dd47(), "ChannelListener")), new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2499x394b74(c2497x394b72, zzc, m17928xe0f82b9c.m17922x2985fbd5()));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e
    /* renamed from: sendFile */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo19688x4a543524(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel channel, android.net.Uri uri) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1922x695faa96.m18196x8941d8d4(zza(channel).mo19668x4a543524(m17741xb77111ba(), uri));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e
    /* renamed from: unregisterChannelCallback */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Boolean> mo19690x7455f28c(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel channel, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.ChannelCallback channelCallback) {
        java.lang.String zzc = zza(channel).zzc();
        android.os.Looper m17760x23b2dd47 = m17760x23b2dd47();
        java.lang.String valueOf = java.lang.String.valueOf(zzc);
        return m17750x3ea49d87(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1782xdd080d3.m17928xe0f82b9c(channelCallback, m17760x23b2dd47, valueOf.length() != 0 ? "ChannelListener:".concat(valueOf) : new java.lang.String("ChannelListener:")).m17922x2985fbd5());
    }

    public C2493x394b6e(android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01.Settings settings) {
        super(context, settings);
        this.f7560x394ba4 = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2488x394b69();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2503x394b78 zza(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3 interfaceC2453x8f4414e3) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(interfaceC2453x8f4414e3, "channel must not be null");
        return (com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2503x394b78) interfaceC2453x8f4414e3;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e
    /* renamed from: close */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo19681x5a5ddf8(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel channel, int i17) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1922x695faa96.m18196x8941d8d4(zza(channel).mo19661x5a5ddf8(m17741xb77111ba(), i17));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e
    /* renamed from: registerChannelCallback */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo19687xc1975d45(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.ChannelCallback channelCallback) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(channelCallback, "listener is null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0 m17928xe0f82b9c = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1782xdd080d3.m17928xe0f82b9c(channelCallback, m17760x23b2dd47(), "ChannelListener");
        android.content.IntentFilter[] intentFilterArr = {com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2644x394c23.zzc("com.google.android.gms.wearable.CHANNEL_EVENT")};
        com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2497x394b72 c2497x394b72 = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2497x394b72(channelCallback);
        return m17748xa3689bc0(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2498x394b73(c2497x394b72, null, intentFilterArr, m17928xe0f82b9c, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1782xdd080d3.m17928xe0f82b9c(c2497x394b72, m17760x23b2dd47(), "ChannelListener")), new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2499x394b74(c2497x394b72, null, m17928xe0f82b9c.m17922x2985fbd5()));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e
    /* renamed from: sendFile */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo19689x4a543524(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel channel, android.net.Uri uri, long j17, long j18) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1922x695faa96.m18196x8941d8d4(zza(channel).mo19669x4a543524(m17741xb77111ba(), uri, j17, j18));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e
    /* renamed from: unregisterChannelCallback */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Boolean> mo19691x7455f28c(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.ChannelCallback channelCallback) {
        return m17750x3ea49d87(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1782xdd080d3.m17928xe0f82b9c(channelCallback, m17760x23b2dd47(), "ChannelListener").m17922x2985fbd5());
    }

    private static com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2503x394b78 zza(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel channel) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(channel, "channel must not be null");
        return (com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2503x394b78) channel;
    }
}
