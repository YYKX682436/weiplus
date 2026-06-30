package com.p314xaae8f345.mm.p2809x52b77bcb;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u00020\u0007H\u0004J\t\u0010\t\u001a\u00020\u0005H\u0082 J\u0011\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 J)\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0082 J\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/weapp_core/BSPatchUtil;", "", "<init>", "()V", "nativePtr", "", "dispose", "", "finalize", "nativeInit", "nativeDispose", "JylAyjKr0", "", "oldFile", "", "patchFile", "newFile", "bspatch", "Lcom/tencent/mm/weapp_core/BSPatchResult;", "weapp_core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.tencent.mm.weapp_core.BSPatchUtil */
/* loaded from: classes7.dex */
public final class C22912xef9f0319 {
    private long nativePtr;

    public C22912xef9f0319() {
        long m83223xb90145c7 = m83223xb90145c7();
        this.nativePtr = m83223xb90145c7;
        if (!(m83223xb90145c7 != 0)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: JylAyjKr0 */
    private final native byte[] m83221xbc1cbe54(long nativePtr, java.lang.String oldFile, java.lang.String patchFile, java.lang.String newFile);

    /* renamed from: nativeDispose */
    private final native void m83222x2a9c7608(long nativePtr);

    /* renamed from: nativeInit */
    private final native long m83223xb90145c7();

    /* renamed from: bspatch */
    public final vp5.b m83224xab81e97(java.lang.String oldFile, java.lang.String patchFile, java.lang.String newFile) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldFile, "oldFile");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(patchFile, "patchFile");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newFile, "newFile");
        byte[] bytes = m83221xbc1cbe54(this.nativePtr, oldFile, patchFile, newFile);
        vp5.b.f520620e.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bytes, "bytes");
        f56.h hVar = f56.i.f341344c;
        hVar.getClass();
        int c17 = new f56.n(new org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.a(bytes), hVar).c();
        java.util.Iterator it = ((kz5.h) vp5.b.f520622g).iterator();
        while (it.hasNext()) {
            vp5.b bVar = (vp5.b) it.next();
            if (bVar.f520623d == c17) {
                return bVar;
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* renamed from: dispose */
    public final void m83225x63a5261f() {
        long j17 = this.nativePtr;
        if (j17 != 0) {
            m83222x2a9c7608(j17);
            this.nativePtr = 0L;
        }
    }

    /* renamed from: finalize */
    public final void m83226xd764dc1e() {
        m83225x63a5261f();
    }
}
