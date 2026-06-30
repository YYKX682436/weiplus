package com.tencent.mm.plugin.ai.data.business.trigger;

/* loaded from: classes12.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.KvReportEvent f74667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ai.data.business.trigger.FinderTrigger$1 f74668e;

    public f(com.tencent.mm.plugin.ai.data.business.trigger.FinderTrigger$1 finderTrigger$1, com.tencent.mm.autogen.events.KvReportEvent kvReportEvent) {
        this.f74668e = finderTrigger$1;
        this.f74667d = kvReportEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.tencent.mm.plugin.ai.data.business.trigger.g.c(this.f74668e.f74658d, this.f74667d.f54460g.f7034b);
        } catch (java.lang.Exception unused) {
        }
    }
}
