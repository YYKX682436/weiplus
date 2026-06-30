package com.tencent.kinda.framework.kindalite;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\b\u0005\u0006\u0007\b\t\n\u000b\fB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u0082\u0001\b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/LiteEvent;", "", "()V", "toString", "", "JsPaySucceeded", "JsPaying", "JsRunning", "LiteAppDestroyed", "StartCancelled", "StartFailed", "StartRequested", "StopRequested", "Lcom/tencent/kinda/framework/kindalite/LiteEvent$JsPaySucceeded;", "Lcom/tencent/kinda/framework/kindalite/LiteEvent$JsPaying;", "Lcom/tencent/kinda/framework/kindalite/LiteEvent$JsRunning;", "Lcom/tencent/kinda/framework/kindalite/LiteEvent$LiteAppDestroyed;", "Lcom/tencent/kinda/framework/kindalite/LiteEvent$StartCancelled;", "Lcom/tencent/kinda/framework/kindalite/LiteEvent$StartFailed;", "Lcom/tencent/kinda/framework/kindalite/LiteEvent$StartRequested;", "Lcom/tencent/kinda/framework/kindalite/LiteEvent$StopRequested;", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class LiteEvent {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/LiteEvent$JsPaySucceeded;", "Lcom/tencent/kinda/framework/kindalite/LiteEvent;", "()V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class JsPaySucceeded extends com.tencent.kinda.framework.kindalite.LiteEvent {
        public static final com.tencent.kinda.framework.kindalite.LiteEvent.JsPaySucceeded INSTANCE = new com.tencent.kinda.framework.kindalite.LiteEvent.JsPaySucceeded();

        private JsPaySucceeded() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/LiteEvent$JsPaying;", "Lcom/tencent/kinda/framework/kindalite/LiteEvent;", "()V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class JsPaying extends com.tencent.kinda.framework.kindalite.LiteEvent {
        public static final com.tencent.kinda.framework.kindalite.LiteEvent.JsPaying INSTANCE = new com.tencent.kinda.framework.kindalite.LiteEvent.JsPaying();

        private JsPaying() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/LiteEvent$JsRunning;", "Lcom/tencent/kinda/framework/kindalite/LiteEvent;", "()V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class JsRunning extends com.tencent.kinda.framework.kindalite.LiteEvent {
        public static final com.tencent.kinda.framework.kindalite.LiteEvent.JsRunning INSTANCE = new com.tencent.kinda.framework.kindalite.LiteEvent.JsRunning();

        private JsRunning() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/LiteEvent$LiteAppDestroyed;", "Lcom/tencent/kinda/framework/kindalite/LiteEvent;", "()V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class LiteAppDestroyed extends com.tencent.kinda.framework.kindalite.LiteEvent {
        public static final com.tencent.kinda.framework.kindalite.LiteEvent.LiteAppDestroyed INSTANCE = new com.tencent.kinda.framework.kindalite.LiteEvent.LiteAppDestroyed();

        private LiteAppDestroyed() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/LiteEvent$StartCancelled;", "Lcom/tencent/kinda/framework/kindalite/LiteEvent;", "()V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class StartCancelled extends com.tencent.kinda.framework.kindalite.LiteEvent {
        public static final com.tencent.kinda.framework.kindalite.LiteEvent.StartCancelled INSTANCE = new com.tencent.kinda.framework.kindalite.LiteEvent.StartCancelled();

        private StartCancelled() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/LiteEvent$StartFailed;", "Lcom/tencent/kinda/framework/kindalite/LiteEvent;", "()V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class StartFailed extends com.tencent.kinda.framework.kindalite.LiteEvent {
        public static final com.tencent.kinda.framework.kindalite.LiteEvent.StartFailed INSTANCE = new com.tencent.kinda.framework.kindalite.LiteEvent.StartFailed();

        private StartFailed() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/LiteEvent$StartRequested;", "Lcom/tencent/kinda/framework/kindalite/LiteEvent;", "url", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Lcom/tencent/kinda/gen/ITransmitKvData;", "(Ljava/lang/String;Lcom/tencent/kinda/gen/ITransmitKvData;)V", "getData", "()Lcom/tencent/kinda/gen/ITransmitKvData;", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final /* data */ class StartRequested extends com.tencent.kinda.framework.kindalite.LiteEvent {
        private final com.tencent.kinda.gen.ITransmitKvData data;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartRequested(java.lang.String url, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
            super(null);
            kotlin.jvm.internal.o.g(url, "url");
            this.url = url;
            this.data = iTransmitKvData;
        }

        public static /* synthetic */ com.tencent.kinda.framework.kindalite.LiteEvent.StartRequested copy$default(com.tencent.kinda.framework.kindalite.LiteEvent.StartRequested startRequested, java.lang.String str, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData, int i17, java.lang.Object obj) {
            if ((i17 & 1) != 0) {
                str = startRequested.url;
            }
            if ((i17 & 2) != 0) {
                iTransmitKvData = startRequested.data;
            }
            return startRequested.copy(str, iTransmitKvData);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        /* renamed from: component2, reason: from getter */
        public final com.tencent.kinda.gen.ITransmitKvData getData() {
            return this.data;
        }

        public final com.tencent.kinda.framework.kindalite.LiteEvent.StartRequested copy(java.lang.String url, com.tencent.kinda.gen.ITransmitKvData data) {
            kotlin.jvm.internal.o.g(url, "url");
            return new com.tencent.kinda.framework.kindalite.LiteEvent.StartRequested(url, data);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.tencent.kinda.framework.kindalite.LiteEvent.StartRequested)) {
                return false;
            }
            com.tencent.kinda.framework.kindalite.LiteEvent.StartRequested startRequested = (com.tencent.kinda.framework.kindalite.LiteEvent.StartRequested) other;
            return kotlin.jvm.internal.o.b(this.url, startRequested.url) && kotlin.jvm.internal.o.b(this.data, startRequested.data);
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

        @Override // com.tencent.kinda.framework.kindalite.LiteEvent
        public java.lang.String toString() {
            return "StartRequested(url=" + this.url + ", data=" + this.data + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/LiteEvent$StopRequested;", "Lcom/tencent/kinda/framework/kindalite/LiteEvent;", "()V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class StopRequested extends com.tencent.kinda.framework.kindalite.LiteEvent {
        public static final com.tencent.kinda.framework.kindalite.LiteEvent.StopRequested INSTANCE = new com.tencent.kinda.framework.kindalite.LiteEvent.StopRequested();

        private StopRequested() {
            super(null);
        }
    }

    private LiteEvent() {
    }

    public /* synthetic */ LiteEvent(kotlin.jvm.internal.i iVar) {
        this();
    }

    public java.lang.String toString() {
        if (this instanceof com.tencent.kinda.framework.kindalite.LiteEvent.StartRequested) {
            return "StartRequested(url=" + ((com.tencent.kinda.framework.kindalite.LiteEvent.StartRequested) this).getUrl() + ')';
        }
        if (kotlin.jvm.internal.o.b(this, com.tencent.kinda.framework.kindalite.LiteEvent.StopRequested.INSTANCE)) {
            return "StopRequested";
        }
        if (kotlin.jvm.internal.o.b(this, com.tencent.kinda.framework.kindalite.LiteEvent.LiteAppDestroyed.INSTANCE)) {
            return "LiteAppDestroyed";
        }
        if (kotlin.jvm.internal.o.b(this, com.tencent.kinda.framework.kindalite.LiteEvent.JsRunning.INSTANCE)) {
            return "JsRunning";
        }
        if (kotlin.jvm.internal.o.b(this, com.tencent.kinda.framework.kindalite.LiteEvent.JsPaying.INSTANCE)) {
            return "JsPaying";
        }
        if (kotlin.jvm.internal.o.b(this, com.tencent.kinda.framework.kindalite.LiteEvent.JsPaySucceeded.INSTANCE)) {
            return "JsPaySucceeded";
        }
        if (kotlin.jvm.internal.o.b(this, com.tencent.kinda.framework.kindalite.LiteEvent.StartFailed.INSTANCE)) {
            return "StartFailed";
        }
        if (kotlin.jvm.internal.o.b(this, com.tencent.kinda.framework.kindalite.LiteEvent.StartCancelled.INSTANCE)) {
            return "StartCancelled";
        }
        throw new jz5.j();
    }
}
