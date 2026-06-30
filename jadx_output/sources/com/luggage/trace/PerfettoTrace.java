package com.luggage.trace;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0082 J\u0011\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 J\u0019\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0082 J\t\u0010\n\u001a\u00020\u0002H\u0082 J\u0019\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0082 J\u0019\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0082 ¨\u0006\u0010"}, d2 = {"Lcom/luggage/trace/PerfettoTrace;", "Lpb/b;", "Ljz5/f0;", "nativeStartTrace", "", com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "nativeStopTrace", "category", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "nativeTraceBegin", "nativeTraceEnd", "nativeTraceInstant", "", "isolatePtr", "contextPtr", "nativeInitTraceBinding", "trace_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PerfettoTrace implements pb.b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f45816a;

    private final native void nativeInitTraceBinding(long j17, long j18);

    private final native void nativeStartTrace();

    private final native void nativeStopTrace(java.lang.String str);

    private final native void nativeTraceBegin(java.lang.String str, java.lang.String str2);

    private final native void nativeTraceEnd();

    private final native void nativeTraceInstant(java.lang.String str, java.lang.String str2);

    @Override // pb.b
    public void a(long j17, long j18, double d17) {
    }

    @Override // pb.b
    public void b(java.lang.String data, double d17) {
        kotlin.jvm.internal.o.g(data, "data");
    }

    @Override // pb.b
    public void c(java.lang.String category, java.lang.String name) {
        kotlin.jvm.internal.o.g(category, "category");
        kotlin.jvm.internal.o.g(name, "name");
        if (this.f45816a) {
            nativeTraceBegin(category, name);
        }
    }

    @Override // pb.b
    public void d(long j17, long j18) {
        nativeInitTraceBinding(j17, j18);
    }

    @Override // pb.b
    public void e(java.lang.String filePath) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        this.f45816a = false;
        nativeStopTrace(filePath);
    }

    @Override // pb.b
    public void f(java.lang.String category, java.lang.String name, double d17, double d18) {
        kotlin.jvm.internal.o.g(category, "category");
        kotlin.jvm.internal.o.g(name, "name");
    }

    @Override // pb.b
    public void g() {
        if (this.f45816a) {
            nativeTraceEnd();
        }
    }

    @Override // pb.b
    public com.luggage.trace.ProfileInfo h() {
        return null;
    }

    @Override // pb.b
    public void i() {
        this.f45816a = true;
        nativeStartTrace();
    }

    @Override // pb.b
    public void init() {
        pb.h.f353116a.load("luggage_trace");
    }

    @Override // pb.b
    /* renamed from: isTracing, reason: from getter */
    public boolean getF45816a() {
        return this.f45816a;
    }

    @Override // pb.b
    public void j(int i17) {
    }

    @Override // pb.b
    public int k(java.lang.String category, java.lang.String name) {
        kotlin.jvm.internal.o.g(category, "category");
        kotlin.jvm.internal.o.g(name, "name");
        return -1;
    }

    @Override // pb.b
    public void release() {
    }
}
