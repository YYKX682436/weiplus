package com.tencent.kinda.framework.kindalite;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0006\u0005\u0006\u0007\b\t\nB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u0082\u0001\u0006\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/LiteEffect;", "", "()V", "toString", "", "InvokeOnLiteAppPaySucceed", "InvokeOnLiteAppPaying", "InvokeOnLiteAppRunning", "InvokeOnLiteAppStopped", "PublishStop", "StartLiteApp", "Lcom/tencent/kinda/framework/kindalite/LiteEffect$InvokeOnLiteAppPaySucceed;", "Lcom/tencent/kinda/framework/kindalite/LiteEffect$InvokeOnLiteAppPaying;", "Lcom/tencent/kinda/framework/kindalite/LiteEffect$InvokeOnLiteAppRunning;", "Lcom/tencent/kinda/framework/kindalite/LiteEffect$InvokeOnLiteAppStopped;", "Lcom/tencent/kinda/framework/kindalite/LiteEffect$PublishStop;", "Lcom/tencent/kinda/framework/kindalite/LiteEffect$StartLiteApp;", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class LiteEffect {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/LiteEffect$InvokeOnLiteAppPaySucceed;", "Lcom/tencent/kinda/framework/kindalite/LiteEffect;", "()V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class InvokeOnLiteAppPaySucceed extends com.tencent.kinda.framework.kindalite.LiteEffect {
        public static final com.tencent.kinda.framework.kindalite.LiteEffect.InvokeOnLiteAppPaySucceed INSTANCE = new com.tencent.kinda.framework.kindalite.LiteEffect.InvokeOnLiteAppPaySucceed();

        private InvokeOnLiteAppPaySucceed() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/LiteEffect$InvokeOnLiteAppPaying;", "Lcom/tencent/kinda/framework/kindalite/LiteEffect;", "()V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class InvokeOnLiteAppPaying extends com.tencent.kinda.framework.kindalite.LiteEffect {
        public static final com.tencent.kinda.framework.kindalite.LiteEffect.InvokeOnLiteAppPaying INSTANCE = new com.tencent.kinda.framework.kindalite.LiteEffect.InvokeOnLiteAppPaying();

        private InvokeOnLiteAppPaying() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/LiteEffect$InvokeOnLiteAppRunning;", "Lcom/tencent/kinda/framework/kindalite/LiteEffect;", "()V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class InvokeOnLiteAppRunning extends com.tencent.kinda.framework.kindalite.LiteEffect {
        public static final com.tencent.kinda.framework.kindalite.LiteEffect.InvokeOnLiteAppRunning INSTANCE = new com.tencent.kinda.framework.kindalite.LiteEffect.InvokeOnLiteAppRunning();

        private InvokeOnLiteAppRunning() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/LiteEffect$InvokeOnLiteAppStopped;", "Lcom/tencent/kinda/framework/kindalite/LiteEffect;", "()V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class InvokeOnLiteAppStopped extends com.tencent.kinda.framework.kindalite.LiteEffect {
        public static final com.tencent.kinda.framework.kindalite.LiteEffect.InvokeOnLiteAppStopped INSTANCE = new com.tencent.kinda.framework.kindalite.LiteEffect.InvokeOnLiteAppStopped();

        private InvokeOnLiteAppStopped() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/LiteEffect$PublishStop;", "Lcom/tencent/kinda/framework/kindalite/LiteEffect;", "()V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class PublishStop extends com.tencent.kinda.framework.kindalite.LiteEffect {
        public static final com.tencent.kinda.framework.kindalite.LiteEffect.PublishStop INSTANCE = new com.tencent.kinda.framework.kindalite.LiteEffect.PublishStop();

        private PublishStop() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/LiteEffect$StartLiteApp;", "Lcom/tencent/kinda/framework/kindalite/LiteEffect;", "url", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Lcom/tencent/kinda/gen/ITransmitKvData;", "(Ljava/lang/String;Lcom/tencent/kinda/gen/ITransmitKvData;)V", "getData", "()Lcom/tencent/kinda/gen/ITransmitKvData;", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final /* data */ class StartLiteApp extends com.tencent.kinda.framework.kindalite.LiteEffect {
        private final com.tencent.kinda.gen.ITransmitKvData data;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartLiteApp(java.lang.String url, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
            super(null);
            kotlin.jvm.internal.o.g(url, "url");
            this.url = url;
            this.data = iTransmitKvData;
        }

        public static /* synthetic */ com.tencent.kinda.framework.kindalite.LiteEffect.StartLiteApp copy$default(com.tencent.kinda.framework.kindalite.LiteEffect.StartLiteApp startLiteApp, java.lang.String str, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData, int i17, java.lang.Object obj) {
            if ((i17 & 1) != 0) {
                str = startLiteApp.url;
            }
            if ((i17 & 2) != 0) {
                iTransmitKvData = startLiteApp.data;
            }
            return startLiteApp.copy(str, iTransmitKvData);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        /* renamed from: component2, reason: from getter */
        public final com.tencent.kinda.gen.ITransmitKvData getData() {
            return this.data;
        }

        public final com.tencent.kinda.framework.kindalite.LiteEffect.StartLiteApp copy(java.lang.String url, com.tencent.kinda.gen.ITransmitKvData data) {
            kotlin.jvm.internal.o.g(url, "url");
            return new com.tencent.kinda.framework.kindalite.LiteEffect.StartLiteApp(url, data);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.tencent.kinda.framework.kindalite.LiteEffect.StartLiteApp)) {
                return false;
            }
            com.tencent.kinda.framework.kindalite.LiteEffect.StartLiteApp startLiteApp = (com.tencent.kinda.framework.kindalite.LiteEffect.StartLiteApp) other;
            return kotlin.jvm.internal.o.b(this.url, startLiteApp.url) && kotlin.jvm.internal.o.b(this.data, startLiteApp.data);
        }

        public final com.tencent.kinda.gen.ITransmitKvData getData() {
            return this.data;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int hashCode = this.url.hashCode() * 31;
            com.tencent.kinda.gen.ITransmitKvData iTransmitKvData = this.data;
            return hashCode + (iTransmitKvData == null ? 0 : iTransmitKvData.hashCode());
        }

        @Override // com.tencent.kinda.framework.kindalite.LiteEffect
        public java.lang.String toString() {
            return "StartLiteApp(url=" + this.url + ", data=" + this.data + ')';
        }
    }

    private LiteEffect() {
    }

    public /* synthetic */ LiteEffect(kotlin.jvm.internal.i iVar) {
        this();
    }

    public java.lang.String toString() {
        if (this instanceof com.tencent.kinda.framework.kindalite.LiteEffect.StartLiteApp) {
            return "StartLiteApp(url=" + ((com.tencent.kinda.framework.kindalite.LiteEffect.StartLiteApp) this).getUrl() + ')';
        }
        if (kotlin.jvm.internal.o.b(this, com.tencent.kinda.framework.kindalite.LiteEffect.PublishStop.INSTANCE)) {
            return "PublishStop";
        }
        if (kotlin.jvm.internal.o.b(this, com.tencent.kinda.framework.kindalite.LiteEffect.InvokeOnLiteAppStopped.INSTANCE)) {
            return "InvokeOnLiteAppStopped";
        }
        if (kotlin.jvm.internal.o.b(this, com.tencent.kinda.framework.kindalite.LiteEffect.InvokeOnLiteAppRunning.INSTANCE)) {
            return "InvokeOnLiteAppRunning";
        }
        if (kotlin.jvm.internal.o.b(this, com.tencent.kinda.framework.kindalite.LiteEffect.InvokeOnLiteAppPaying.INSTANCE)) {
            return "InvokeOnLiteAppPaying";
        }
        if (kotlin.jvm.internal.o.b(this, com.tencent.kinda.framework.kindalite.LiteEffect.InvokeOnLiteAppPaySucceed.INSTANCE)) {
            return "InvokeOnLiteAppPaySucceed";
        }
        throw new jz5.j();
    }
}
