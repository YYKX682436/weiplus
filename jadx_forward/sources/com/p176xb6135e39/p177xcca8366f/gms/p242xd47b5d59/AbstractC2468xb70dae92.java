package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59;

/* renamed from: com.google.android.gms.wearable.MessageClient */
/* loaded from: classes13.dex */
public abstract class AbstractC2468xb70dae92 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2475xd855c179.WearableOptions> {

    /* renamed from: ACTION_MESSAGE_RECEIVED */
    public static final java.lang.String f7496x4190d622 = "com.google.android.gms.wearable.MESSAGE_RECEIVED";

    /* renamed from: FILTER_LITERAL */
    public static final int f7497x1bc1ac8 = 0;

    /* renamed from: FILTER_PREFIX */
    public static final int f7498x30a40d39 = 1;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.wearable.MessageClient$FilterType */
    /* loaded from: classes6.dex */
    public @interface FilterType {
    }

    /* renamed from: com.google.android.gms.wearable.MessageClient$OnMessageReceivedListener */
    /* loaded from: classes13.dex */
    public interface OnMessageReceivedListener extends com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2467x120b0cb3.MessageListener {
        @Override // com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2467x120b0cb3.MessageListener
        /* renamed from: onMessageReceived */
        void mo19802xaa57a729(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2469xbbb5c2f3 interfaceC2469xbbb5c2f3);
    }

    public AbstractC2468xb70dae92(android.app.Activity activity, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01.Settings settings) {
        super(activity, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44>) com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2475xd855c179.API, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44) null, settings);
    }

    /* renamed from: addListener */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo19804x162a7075(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2468xb70dae92.OnMessageReceivedListener onMessageReceivedListener);

    /* renamed from: addListener */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo19805x162a7075(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2468xb70dae92.OnMessageReceivedListener onMessageReceivedListener, android.net.Uri uri, int i17);

    /* renamed from: removeListener */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Boolean> mo19806xf1335d58(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2468xb70dae92.OnMessageReceivedListener onMessageReceivedListener);

    /* renamed from: sendMessage */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Integer> mo19807x2936bf5f(java.lang.String str, java.lang.String str2, byte[] bArr);

    public AbstractC2468xb70dae92(android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01.Settings settings) {
        super(context, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2475xd855c179.API, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44) null, settings);
    }
}
