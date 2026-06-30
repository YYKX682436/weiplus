package com.tencent.mm.plugin.fav.ui;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes12.dex */
public class PhotoTransControl$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ScanTranslationResultEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.nc f100447d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoTransControl$1(com.tencent.mm.plugin.fav.ui.nc ncVar, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f100447d = ncVar;
        this.__eventId = -1699517927;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.ScanTranslationResultEvent scanTranslationResultEvent) {
        com.tencent.mm.autogen.events.ScanTranslationResultEvent scanTranslationResultEvent2 = scanTranslationResultEvent;
        com.tencent.mars.xlog.Log.i("MicroMsg.PhotoTransControl", "scanTranslationResult %d, %s", java.lang.Integer.valueOf(scanTranslationResultEvent2.f54739g.f6400a), java.lang.Boolean.valueOf(scanTranslationResultEvent2.f54739g.f6402c));
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.fav.ui.hc(this, scanTranslationResultEvent2));
        return true;
    }
}
