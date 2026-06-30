package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59;

@java.lang.Deprecated
/* renamed from: com.google.android.gms.wearable.MessageApi */
/* loaded from: classes13.dex */
public interface InterfaceC2467x120b0cb3 {

    /* renamed from: ACTION_MESSAGE_RECEIVED */
    public static final java.lang.String f7492x4190d622 = "com.google.android.gms.wearable.MESSAGE_RECEIVED";

    /* renamed from: FILTER_LITERAL */
    public static final int f7493x1bc1ac8 = 0;

    /* renamed from: FILTER_PREFIX */
    public static final int f7494x30a40d39 = 1;

    /* renamed from: UNKNOWN_REQUEST_ID */
    public static final int f7495xc8dfe420 = -1;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.wearable.MessageApi$FilterType */
    /* loaded from: classes6.dex */
    public @interface FilterType {
    }

    @java.lang.Deprecated
    /* renamed from: com.google.android.gms.wearable.MessageApi$MessageListener */
    /* loaded from: classes13.dex */
    public interface MessageListener {
        /* renamed from: onMessageReceived */
        void mo19802xaa57a729(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2469xbbb5c2f3 interfaceC2469xbbb5c2f3);
    }

    @java.lang.Deprecated
    /* renamed from: com.google.android.gms.wearable.MessageApi$SendMessageResult */
    /* loaded from: classes13.dex */
    public interface SendMessageResult extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d {
        /* renamed from: getRequestId */
        int mo19803x28ca0554();
    }

    /* renamed from: addListener */
    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> mo19798x162a7075(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2467x120b0cb3.MessageListener messageListener);

    /* renamed from: addListener */
    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> mo19799x162a7075(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2467x120b0cb3.MessageListener messageListener, android.net.Uri uri, int i17);

    /* renamed from: removeListener */
    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> mo19800xf1335d58(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2467x120b0cb3.MessageListener messageListener);

    /* renamed from: sendMessage */
    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2467x120b0cb3.SendMessageResult> mo19801x2936bf5f(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, java.lang.String str, java.lang.String str2, byte[] bArr);
}
