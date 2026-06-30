package com.tencent.mm.media.proxy;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0007¨\u0006\t"}, d2 = {"Lcom/tencent/mm/media/proxy/MediaEditorProxy;", "Lk55/b;", "", "getAccPath", "getAccPathRemote", "Lk55/k;", "serverProxy", "<init>", "(Lk55/k;)V", "plugin-mediaeditor_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MediaEditorProxy extends k55.b {
    public MediaEditorProxy(k55.k kVar) {
        super(kVar);
    }

    public static final /* synthetic */ java.lang.String access$getTAG$cp() {
        return "MicroMsg.StoryCaptureProxy";
    }

    public static final void createInstance(k55.k kVar) {
        new com.tencent.mm.media.proxy.MediaEditorProxy(kVar);
    }

    public final java.lang.String getAccPath() {
        java.lang.String d17 = gm0.j1.u().d();
        kotlin.jvm.internal.o.f(d17, "getExternalAccountPath(...)");
        return d17;
    }

    @k55.m
    public final java.lang.String getAccPathRemote() {
        java.lang.String d17 = gm0.j1.u().d();
        kotlin.jvm.internal.o.f(d17, "getExternalAccountPath(...)");
        return d17;
    }
}
