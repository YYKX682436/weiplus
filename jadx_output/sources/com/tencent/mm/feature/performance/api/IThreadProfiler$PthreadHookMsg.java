package com.tencent.mm.feature.performance.api;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0003\u0010\u0011\u0012B\u0007¢\u0006\u0004\b\r\u0010\u000eR*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\u0013"}, d2 = {"com/tencent/mm/feature/performance/api/IThreadProfiler$PthreadHookMsg", "", "", "Lcom/tencent/mm/feature/performance/api/IThreadProfiler$PthreadHookMsg$PthreadMsg;", "notExited", "Ljava/util/List;", "getNotExited", "()Ljava/util/List;", "setNotExited", "(Ljava/util/List;)V", "notReleased", "getNotReleased", "setNotReleased", "<init>", "()V", "Companion", "ob0/m3", "PthreadMsg", "ThreadMsg", "plugin-report_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes6.dex */
public final class IThreadProfiler$PthreadHookMsg {
    public static final ob0.m3 Companion = new ob0.m3(null);

    @fb.b("PthreadHook_not_exited")
    private java.util.List<com.tencent.mm.feature.performance.api.IThreadProfiler$PthreadHookMsg.PthreadMsg> notExited;

    @fb.b("PthreadHook_not_released")
    private java.util.List<com.tencent.mm.feature.performance.api.IThreadProfiler$PthreadHookMsg.PthreadMsg> notReleased;

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR&\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/feature/performance/api/IThreadProfiler$PthreadHookMsg$PthreadMsg;", "", "()V", "count", "", "getCount", "()Ljava/lang/String;", "setCount", "(Ljava/lang/String;)V", "hash", "getHash", "setHash", "java", "getJava", "setJava", "native", "getNative", "setNative", "threads", "", "Lcom/tencent/mm/feature/performance/api/IThreadProfiler$PthreadHookMsg$ThreadMsg;", "getThreads", "()Ljava/util/List;", "setThreads", "(Ljava/util/List;)V", "plugin-report_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class PthreadMsg {

        @fb.b("count")
        private java.lang.String count;

        @fb.b("hash")
        private java.lang.String hash;

        @fb.b("java")
        private java.lang.String java;

        @fb.b("native")
        private java.lang.String native;

        @fb.b("threads")
        private java.util.List<com.tencent.mm.feature.performance.api.IThreadProfiler$PthreadHookMsg.ThreadMsg> threads;

        public final java.lang.String getCount() {
            return this.count;
        }

        public final java.lang.String getHash() {
            return this.hash;
        }

        public final java.lang.String getJava() {
            return this.java;
        }

        public final java.lang.String getNative() {
            return this.native;
        }

        public final java.util.List<com.tencent.mm.feature.performance.api.IThreadProfiler$PthreadHookMsg.ThreadMsg> getThreads() {
            return this.threads;
        }

        public final void setCount(java.lang.String str) {
            this.count = str;
        }

        public final void setHash(java.lang.String str) {
            this.hash = str;
        }

        public final void setJava(java.lang.String str) {
            this.java = str;
        }

        public final void setNative(java.lang.String str) {
            this.native = str;
        }

        public final void setThreads(java.util.List<com.tencent.mm.feature.performance.api.IThreadProfiler$PthreadHookMsg.ThreadMsg> list) {
            this.threads = list;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/feature/performance/api/IThreadProfiler$PthreadHookMsg$ThreadMsg;", "", "()V", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "tid", "getTid", "setTid", "plugin-report_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class ThreadMsg {

        @fb.b(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME)
        private java.lang.String name;

        @fb.b("tid")
        private java.lang.String tid;

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String getTid() {
            return this.tid;
        }

        public final void setName(java.lang.String str) {
            this.name = str;
        }

        public final void setTid(java.lang.String str) {
            this.tid = str;
        }
    }

    public final java.util.List<com.tencent.mm.feature.performance.api.IThreadProfiler$PthreadHookMsg.PthreadMsg> getNotExited() {
        return this.notExited;
    }

    public final java.util.List<com.tencent.mm.feature.performance.api.IThreadProfiler$PthreadHookMsg.PthreadMsg> getNotReleased() {
        return this.notReleased;
    }

    public final void setNotExited(java.util.List<com.tencent.mm.feature.performance.api.IThreadProfiler$PthreadHookMsg.PthreadMsg> list) {
        this.notExited = list;
    }

    public final void setNotReleased(java.util.List<com.tencent.mm.feature.performance.api.IThreadProfiler$PthreadHookMsg.PthreadMsg> list) {
        this.notReleased = list;
    }
}
