package com.tencent.mm.ipcinvoker.extension;

/* loaded from: classes7.dex */
public class f implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f68351d;

    public f(boolean z17, com.tencent.mm.ipcinvoker.r rVar) {
        this.f68351d = rVar;
        if (z17) {
            return;
        }
        java.util.Map map = com.tencent.mm.ipcinvoker.extension.l.f68354a;
        synchronized (map) {
            ((java.util.WeakHashMap) map).put(rVar, new java.lang.ref.WeakReference(this));
        }
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.extension.XIPCInvoker$WrapperParcelable xIPCInvoker$WrapperParcelable = (com.tencent.mm.ipcinvoker.extension.XIPCInvoker$WrapperParcelable) obj;
        com.tencent.mm.ipcinvoker.r rVar = this.f68351d;
        if (rVar != null) {
            if (xIPCInvoker$WrapperParcelable != null) {
                rVar.a(xIPCInvoker$WrapperParcelable.f68344e);
            } else {
                rk0.c.d("IPC.XIPCInvoker", "async invoke callback error, wrapper parcelable data is null!", new java.lang.Object[0]);
                rVar.a(null);
            }
        }
    }
}
