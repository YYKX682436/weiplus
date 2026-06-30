package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes9.dex */
public final class o0 {
    public o0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(java.lang.String mediaId, java.lang.ref.WeakReference listenerRef) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenerRef, "listenerRef");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Cdn.CdnFSCJavaHelper", "cancelDownloadTask taskInfo field_mediaId:".concat(mediaId));
        com.p314xaae8f345.mm.p947xba6de98f.z aj6 = com.p314xaae8f345.mm.p947xba6de98f.s1.aj();
        p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 U6 = aj6 != null ? aj6.U6(mediaId) : null;
        if (U6 == null) {
            return null;
        }
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            v65.i.b(c20976x6ba6452a, null, new com.p314xaae8f345.mm.p947xba6de98f.b0(U6, listenerRef, null), 1, null);
        }
        return mediaId;
    }
}
