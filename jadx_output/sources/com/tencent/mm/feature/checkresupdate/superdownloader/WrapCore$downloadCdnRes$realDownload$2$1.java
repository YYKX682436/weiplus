package com.tencent.mm.feature.checkresupdate.superdownloader;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/tencent/mm/feature/checkresupdate/superdownloader/WrapCore$downloadCdnRes$realDownload$2$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/CheckResUpdateCacheFileEvent;", "plugin-comm_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class WrapCore$downloadCdnRes$realDownload$2$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f65575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f65576e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f65577f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f65578g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapCore$downloadCdnRes$realDownload$2$1(int i17, int i18, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, com.tencent.mm.app.a0 a0Var) {
        super(a0Var);
        this.f65575d = i17;
        this.f65576e = i18;
        this.f65577f = h0Var;
        this.f65578g = h0Var2;
        this.__eventId = 905296653;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent) {
        com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent event = checkResUpdateCacheFileEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.r2 r2Var = event.f54053g;
        int i17 = r2Var.f7759a;
        int i18 = this.f65575d;
        if (i17 == i18) {
            kotlin.jvm.internal.h0 h0Var = this.f65578g;
            com.tencent.mm.sdk.event.IListener iListener = (com.tencent.mm.sdk.event.IListener) h0Var.f310123d;
            if (iListener != null) {
                iListener.dead();
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#downloadCdnRes resType:");
            sb6.append(i18);
            sb6.append(" subType:");
            int i19 = this.f65576e;
            sb6.append(i19);
            sb6.append(" resEventListener-dead");
            com.tencent.mars.xlog.Log.i("Download.SuperDownloaderWrapCore", sb6.toString());
            h0Var.f310123d = null;
            int i27 = r2Var.f7760b;
            java.lang.String str = r2Var.f7761c;
            com.tencent.mars.xlog.Log.i("Download.SuperDownloaderWrapCore", "#downloadCdnRes-realDownload callback resType:" + i18 + " subType:" + i19 + " subtype" + i27 + ' ' + str + ' ' + r2Var.f7763e);
            boolean z17 = str == null || str.length() == 0;
            kotlin.jvm.internal.h0 h0Var2 = this.f65577f;
            if (z17) {
                kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) h0Var2.f310123d;
                if (continuation != null) {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    continuation.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Boolean.FALSE, "")));
                }
                h0Var2.f310123d = null;
            } else {
                kotlin.coroutines.Continuation continuation2 = (kotlin.coroutines.Continuation) h0Var2.f310123d;
                if (continuation2 != null) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                    kotlin.jvm.internal.o.d(str);
                    continuation2.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(bool, str)));
                }
                h0Var2.f310123d = null;
            }
        }
        return false;
    }
}
