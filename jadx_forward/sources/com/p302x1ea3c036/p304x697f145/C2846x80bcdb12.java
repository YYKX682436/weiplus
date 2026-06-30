package com.p302x1ea3c036.p304x697f145;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0082 J\u0011\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 J\u0019\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0082 J\t\u0010\n\u001a\u00020\u0002H\u0082 J\u0019\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0082 J\u0019\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0082 ¨\u0006\u0010"}, d2 = {"Lcom/luggage/trace/PerfettoTrace;", "Lpb/b;", "Ljz5/f0;", "nativeStartTrace", "", com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, "nativeStopTrace", "category", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "nativeTraceBegin", "nativeTraceEnd", "nativeTraceInstant", "", "isolatePtr", "contextPtr", "nativeInitTraceBinding", "trace_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: com.luggage.trace.PerfettoTrace */
/* loaded from: classes7.dex */
public final class C2846x80bcdb12 implements pb.b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f127349a;

    /* renamed from: nativeInitTraceBinding */
    private final native void m21132xb2474e7(long j17, long j18);

    /* renamed from: nativeStartTrace */
    private final native void m21133x879be57a();

    /* renamed from: nativeStopTrace */
    private final native void m21134x46f0a40c(java.lang.String str);

    /* renamed from: nativeTraceBegin */
    private final native void m21135x1f42d5db(java.lang.String str, java.lang.String str2);

    /* renamed from: nativeTraceEnd */
    private final native void m21136x63a98a8d();

    /* renamed from: nativeTraceInstant */
    private final native void m21137xdc39fe93(java.lang.String str, java.lang.String str2);

    @Override // pb.b
    public void a(long j17, long j18, double d17) {
    }

    @Override // pb.b
    public void b(java.lang.String data, double d17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
    }

    @Override // pb.b
    public void c(java.lang.String category, java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(category, "category");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        if (this.f127349a) {
            m21135x1f42d5db(category, name);
        }
    }

    @Override // pb.b
    public void d(long j17, long j18) {
        m21132xb2474e7(j17, j18);
    }

    @Override // pb.b
    public void e(java.lang.String filePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        this.f127349a = false;
        m21134x46f0a40c(filePath);
    }

    @Override // pb.b
    public void f(java.lang.String category, java.lang.String name, double d17, double d18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(category, "category");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
    }

    @Override // pb.b
    public void g() {
        if (this.f127349a) {
            m21136x63a98a8d();
        }
    }

    @Override // pb.b
    public com.p302x1ea3c036.p304x697f145.C2847x6dfc0dd7 h() {
        return null;
    }

    @Override // pb.b
    public void i() {
        this.f127349a = true;
        m21133x879be57a();
    }

    @Override // pb.b
    /* renamed from: init */
    public void mo21138x316510() {
        pb.h.f434649a.mo53133x32c4e6("luggage_trace");
    }

    @Override // pb.b
    /* renamed from: isTracing, reason: from getter */
    public boolean getF127349a() {
        return this.f127349a;
    }

    @Override // pb.b
    public void j(int i17) {
    }

    @Override // pb.b
    public int k(java.lang.String category, java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(category, "category");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        return -1;
    }

    @Override // pb.b
    /* renamed from: release */
    public void mo21140x41012807() {
    }
}
