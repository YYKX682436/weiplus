package com.p314xaae8f345.mm.p2809x52b77bcb;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u00020\u0007H\u0004J\t\u0010\t\u001a\u00020\u0005H\u0082 J\u0011\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0082 J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/weapp_core/CoreUrlParser;", "", "<init>", "()V", "nativePtr", "", "dispose", "", "finalize", "nativeInit", "nativeDispose", "Jr1SuXNwt", "", com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "appendHtmlSuffixForEnterPathIfNeed", "weapp_core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.tencent.mm.weapp_core.CoreUrlParser */
/* loaded from: classes7.dex */
public final class C22914xcd52a16f {
    private long nativePtr;

    public C22914xcd52a16f() {
        long m83243xb90145c7 = m83243xb90145c7();
        this.nativePtr = m83243xb90145c7;
        if (!(m83243xb90145c7 != 0)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: Jr1SuXNwt */
    private final native java.lang.String m83241xd25b96de(long nativePtr, java.lang.String path);

    /* renamed from: nativeDispose */
    private final native void m83242x2a9c7608(long nativePtr);

    /* renamed from: nativeInit */
    private final native long m83243xb90145c7();

    /* renamed from: appendHtmlSuffixForEnterPathIfNeed */
    public final java.lang.String m83244xd2dc3cfd(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        return m83241xd25b96de(this.nativePtr, path);
    }

    /* renamed from: dispose */
    public final void m83245x63a5261f() {
        long j17 = this.nativePtr;
        if (j17 != 0) {
            m83242x2a9c7608(j17);
            this.nativePtr = 0L;
        }
    }

    /* renamed from: finalize */
    public final void m83246xd764dc1e() {
        m83245x63a5261f();
    }
}
