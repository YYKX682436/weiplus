package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59;

@java.lang.Deprecated
/* renamed from: com.google.android.gms.wearable.ChannelApi */
/* loaded from: classes13.dex */
public interface InterfaceC2454x3bb9e37 {

    /* renamed from: ACTION_CHANNEL_EVENT */
    public static final java.lang.String f7471x4bd19dd5 = "com.google.android.gms.wearable.CHANNEL_EVENT";

    @java.lang.Deprecated
    /* renamed from: com.google.android.gms.wearable.ChannelApi$ChannelListener */
    /* loaded from: classes13.dex */
    public interface ChannelListener {

        /* renamed from: CLOSE_REASON_DISCONNECTED */
        public static final int f7472x60fdf6f = 1;

        /* renamed from: CLOSE_REASON_LOCAL_CLOSE */
        public static final int f7473xcabf0c30 = 3;

        /* renamed from: CLOSE_REASON_NORMAL */
        public static final int f7474x4c8cf11b = 0;

        /* renamed from: CLOSE_REASON_REMOTE_CLOSE */
        public static final int f7475x9fe8b1d3 = 2;

        /* renamed from: onChannelClosed */
        void mo19675x6cf620b0(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3 interfaceC2453x8f4414e3, int i17, int i18);

        /* renamed from: onChannelOpened */
        void mo19676x81a407ad(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3 interfaceC2453x8f4414e3);

        /* renamed from: onInputClosed */
        void mo19677xee922e77(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3 interfaceC2453x8f4414e3, int i17, int i18);

        /* renamed from: onOutputClosed */
        void mo19678x51bded4c(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3 interfaceC2453x8f4414e3, int i17, int i18);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.wearable.ChannelApi$CloseReason */
    /* loaded from: classes6.dex */
    public @interface CloseReason {
    }

    @java.lang.Deprecated
    /* renamed from: com.google.android.gms.wearable.ChannelApi$OpenChannelResult */
    /* loaded from: classes13.dex */
    public interface OpenChannelResult extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d {
        /* renamed from: getChannel */
        com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2453x8f4414e3 mo19679x69d8b8cd();
    }

    /* renamed from: addListener */
    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> mo19672x162a7075(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.ChannelListener channelListener);

    /* renamed from: openChannel */
    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.OpenChannelResult> mo19673x20502759(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, java.lang.String str, java.lang.String str2);

    /* renamed from: removeListener */
    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12> mo19674xf1335d58(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c abstractC1748xd28d482c, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.InterfaceC2454x3bb9e37.ChannelListener channelListener);
}
