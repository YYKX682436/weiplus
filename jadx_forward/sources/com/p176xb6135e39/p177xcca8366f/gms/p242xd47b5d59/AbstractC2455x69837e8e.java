package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59;

/* renamed from: com.google.android.gms.wearable.ChannelClient */
/* loaded from: classes13.dex */
public abstract class AbstractC2455x69837e8e extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2475xd855c179.WearableOptions> {

    /* renamed from: ACTION_CHANNEL_EVENT */
    public static final java.lang.String f7476x4bd19dd5 = "com.google.android.gms.wearable.CHANNEL_EVENT";

    /* renamed from: com.google.android.gms.wearable.ChannelClient$Channel */
    /* loaded from: classes6.dex */
    public interface Channel extends android.os.Parcelable {
        /* renamed from: getNodeId */
        java.lang.String mo19663x271761b3();

        /* renamed from: getPath */
        java.lang.String mo19665xfb83cc9b();
    }

    /* renamed from: com.google.android.gms.wearable.ChannelClient$ChannelCallback */
    /* loaded from: classes13.dex */
    public static abstract class ChannelCallback {

        /* renamed from: CLOSE_REASON_DISCONNECTED */
        public static final int f7477x60fdf6f = 1;

        /* renamed from: CLOSE_REASON_LOCAL_CLOSE */
        public static final int f7478xcabf0c30 = 3;

        /* renamed from: CLOSE_REASON_NORMAL */
        public static final int f7479x4c8cf11b = 0;

        /* renamed from: CLOSE_REASON_REMOTE_CLOSE */
        public static final int f7480x9fe8b1d3 = 2;

        /* renamed from: onChannelClosed */
        public void mo19692x6cf620b0(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel channel, int i17, int i18) {
        }

        /* renamed from: onChannelOpened */
        public void mo19693x81a407ad(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel channel) {
        }

        /* renamed from: onInputClosed */
        public void mo19694xee922e77(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel channel, int i17, int i18) {
        }

        /* renamed from: onOutputClosed */
        public void mo19695x51bded4c(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel channel, int i17, int i18) {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.wearable.ChannelClient$CloseReason */
    /* loaded from: classes6.dex */
    public @interface CloseReason {
    }

    public AbstractC2455x69837e8e(android.app.Activity activity, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01.Settings settings) {
        super(activity, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44>) com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2475xd855c179.API, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44) null, settings);
    }

    /* renamed from: close */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo19680x5a5ddf8(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel channel);

    /* renamed from: close */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo19681x5a5ddf8(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel channel, int i17);

    /* renamed from: getInputStream */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.io.InputStream> mo19682xc7995ab4(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel channel);

    /* renamed from: getOutputStream */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.io.OutputStream> mo19683x592d6257(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel channel);

    /* renamed from: openChannel */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel> mo19684x20502759(java.lang.String str, java.lang.String str2);

    /* renamed from: receiveFile */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo19685x8299b2ff(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel channel, android.net.Uri uri, boolean z17);

    /* renamed from: registerChannelCallback */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo19686xc1975d45(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel channel, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.ChannelCallback channelCallback);

    /* renamed from: registerChannelCallback */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo19687xc1975d45(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.ChannelCallback channelCallback);

    /* renamed from: sendFile */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo19688x4a543524(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel channel, android.net.Uri uri);

    /* renamed from: sendFile */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Void> mo19689x4a543524(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel channel, android.net.Uri uri, long j17, long j18);

    /* renamed from: unregisterChannelCallback */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Boolean> mo19690x7455f28c(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.Channel channel, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.ChannelCallback channelCallback);

    /* renamed from: unregisterChannelCallback */
    public abstract com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.Boolean> mo19691x7455f28c(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.AbstractC2455x69837e8e.ChannelCallback channelCallback);

    public AbstractC2455x69837e8e(android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1746xcf54ed01.Settings settings) {
        super(context, com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2475xd855c179.API, (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api.InterfaceC1734x98b0cf44) null, settings);
    }
}
