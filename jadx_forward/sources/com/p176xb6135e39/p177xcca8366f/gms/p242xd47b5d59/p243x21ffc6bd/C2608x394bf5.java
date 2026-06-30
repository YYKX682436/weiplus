package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzez */
/* loaded from: classes13.dex */
public final class C2608x394bf5 extends com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2468xb70dae92 {

    /* renamed from: zzei */
    private final com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2467x120b0cb3 f7714x394be4;

    public C2608x394bf5(android.app.Activity activity, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01.Settings settings) {
        super(activity, settings);
        this.f7714x394be4 = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2603x394bf0();
    }

    private final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> zza(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2468xb70dae92.OnMessageReceivedListener onMessageReceivedListener, android.content.IntentFilter[] intentFilterArr) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1781xefedf3a0 m17928xe0f82b9c = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1782xdd080d3.m17928xe0f82b9c(onMessageReceivedListener, m17760x23b2dd47(), "MessageListener");
        return m17748xa3689bc0(new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2611x394bfd(onMessageReceivedListener, intentFilterArr, m17928xe0f82b9c), new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2612x394bfe(onMessageReceivedListener, m17928xe0f82b9c.m17922x2985fbd5()));
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2468xb70dae92
    /* renamed from: addListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo19804x162a7075(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2468xb70dae92.OnMessageReceivedListener onMessageReceivedListener) {
        return zza(onMessageReceivedListener, new android.content.IntentFilter[]{com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2644x394c23.zzc("com.google.android.gms.wearable.MESSAGE_RECEIVED")});
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2468xb70dae92
    /* renamed from: removeListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Boolean> mo19806xf1335d58(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2468xb70dae92.OnMessageReceivedListener onMessageReceivedListener) {
        return m17750x3ea49d87(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1782xdd080d3.m17928xe0f82b9c(onMessageReceivedListener, m17760x23b2dd47(), "MessageListener").m17922x2985fbd5());
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2468xb70dae92
    /* renamed from: sendMessage */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Integer> mo19807x2936bf5f(java.lang.String str, java.lang.String str2, byte[] bArr) {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1922x695faa96.m18195xcc3602a0(this.f7714x394be4.mo19801x2936bf5f(m17741xb77111ba(), str, str2, bArr), com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2609x394bfb.f7717x394b96);
    }

    public C2608x394bf5(android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01.Settings settings) {
        super(context, settings);
        this.f7714x394be4 = new com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2603x394bf0();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2468xb70dae92
    /* renamed from: addListener */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo19805x162a7075(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2468xb70dae92.OnMessageReceivedListener onMessageReceivedListener, android.net.Uri uri, int i17) {
        m3.h.d(uri, "uri must not be null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(i17 == 0 || i17 == 1, "invalid filter type");
        return zza(onMessageReceivedListener, new android.content.IntentFilter[]{com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2644x394c23.zza("com.google.android.gms.wearable.MESSAGE_RECEIVED", uri, i17)});
    }
}
