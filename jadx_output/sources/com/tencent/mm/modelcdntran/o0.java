package com.tencent.mm.modelcdntran;

/* loaded from: classes9.dex */
public final class o0 {
    public o0(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(java.lang.String mediaId, java.lang.ref.WeakReference listenerRef) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(listenerRef, "listenerRef");
        com.tencent.mars.xlog.Log.i("MicroMsg.Cdn.CdnFSCJavaHelper", "cancelDownloadTask taskInfo field_mediaId:".concat(mediaId));
        com.tencent.mm.modelcdntran.z aj6 = com.tencent.mm.modelcdntran.s1.aj();
        kotlinx.coroutines.flow.n2 U6 = aj6 != null ? aj6.U6(mediaId) : null;
        if (U6 == null) {
            return null;
        }
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            v65.i.b(lifecycleScope, null, new com.tencent.mm.modelcdntran.b0(U6, listenerRef, null), 1, null);
        }
        return mediaId;
    }
}
