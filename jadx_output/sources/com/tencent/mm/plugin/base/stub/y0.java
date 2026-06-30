package com.tencent.mm.plugin.base.stub;

/* loaded from: classes8.dex */
public class y0 implements lt.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.m f93819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f93820b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f93821c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.base.stub.WXEntryActivity f93822d;

    public y0(com.tencent.mm.plugin.base.stub.WXEntryActivity wXEntryActivity, com.tencent.mm.pluginsdk.model.app.m mVar, com.tencent.mm.modelbase.m1 m1Var, android.os.Bundle bundle) {
        this.f93822d = wXEntryActivity;
        this.f93819a = mVar;
        this.f93820b = m1Var;
        this.f93821c = bundle;
    }

    @Override // lt.h0
    public void a(com.tencent.mm.pluginsdk.model.app.m mVar) {
        if (mVar == null) {
            mVar = this.f93819a;
        }
        com.tencent.mm.plugin.base.stub.WXEntryActivity wXEntryActivity = this.f93822d;
        if (wXEntryActivity.f93701v.get() != null) {
            ((com.tencent.mm.plugin.base.stub.WXEntryActivity) wXEntryActivity.f93701v.get()).d7();
            ((com.tencent.mm.plugin.base.stub.WXEntryActivity) wXEntryActivity.f93701v.get()).c7(this.f93820b, mVar, this.f93821c);
        }
        wXEntryActivity.finish();
    }
}
