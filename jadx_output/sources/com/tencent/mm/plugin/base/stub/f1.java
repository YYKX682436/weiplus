package com.tencent.mm.plugin.base.stub;

/* loaded from: classes8.dex */
public class f1 implements lt.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.m f93746a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.base.stub.WXEntryActivity.EntryReceiver f93747b;

    public f1(com.tencent.mm.plugin.base.stub.WXEntryActivity.EntryReceiver entryReceiver, com.tencent.mm.pluginsdk.model.app.m mVar) {
        this.f93747b = entryReceiver;
        this.f93746a = mVar;
    }

    @Override // lt.h0
    public void a(com.tencent.mm.pluginsdk.model.app.m mVar) {
        if (mVar == null) {
            mVar = this.f93746a;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = com.tencent.mm.plugin.base.stub.WXEntryActivity.EntryReceiver.f93704f;
        this.f93747b.b(mVar);
    }
}
