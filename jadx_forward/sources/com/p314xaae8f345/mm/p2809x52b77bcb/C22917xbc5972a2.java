package com.p314xaae8f345.mm.p2809x52b77bcb;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u00020\u0007H\u0004J\t\u0010\t\u001a\u00020\u0005H\u0082 J\u0011\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0082 J\u0019\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0082 J\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/weapp_core/FileDigestUtil;", "", "<init>", "()V", "nativePtr", "", "dispose", "", "finalize", "nativeInit", "nativeDispose", "JUpoCjCx7", "", com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "Jq1dTu4Ar", "getFileCrc32", "getFileMD5", "weapp_core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.tencent.mm.weapp_core.FileDigestUtil */
/* loaded from: classes7.dex */
public final class C22917xbc5972a2 {
    private long nativePtr;

    public C22917xbc5972a2() {
        long m83298xb90145c7 = m83298xb90145c7();
        this.nativePtr = m83298xb90145c7;
        if (!(m83298xb90145c7 != 0)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: JUpoCjCx7 */
    private final native java.lang.String m83295x3f913611(long nativePtr, java.lang.String path);

    /* renamed from: Jq1dTu4Ar */
    private final native java.lang.String m83296x85b88b8a(long nativePtr, java.lang.String path);

    /* renamed from: nativeDispose */
    private final native void m83297x2a9c7608(long nativePtr);

    /* renamed from: nativeInit */
    private final native long m83298xb90145c7();

    /* renamed from: dispose */
    public final void m83299x63a5261f() {
        long j17 = this.nativePtr;
        if (j17 != 0) {
            m83297x2a9c7608(j17);
            this.nativePtr = 0L;
        }
    }

    /* renamed from: finalize */
    public final void m83300xd764dc1e() {
        m83299x63a5261f();
    }

    /* renamed from: getFileCrc32 */
    public final java.lang.String m83301xaf6cfc61(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        return m83295x3f913611(this.nativePtr, path);
    }

    /* renamed from: getFileMD5 */
    public final java.lang.String m83302xad6ae4c(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        return m83296x85b88b8a(this.nativePtr, path);
    }
}
