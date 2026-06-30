package com.tencent.mm.plugin.base.stub;

/* loaded from: classes8.dex */
public class d1 extends hm0.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f93727d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f93728e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.base.stub.WXEntryActivity.EntryReceiver f93729f;

    public d1(com.tencent.mm.plugin.base.stub.WXEntryActivity.EntryReceiver entryReceiver, android.content.Context context, android.content.Intent intent) {
        this.f93729f = entryReceiver;
        this.f93727d = context;
        this.f93728e = intent;
    }

    @Override // hm0.t
    public void b() {
        com.tencent.mm.plugin.base.stub.WXEntryActivity.EntryReceiver.a(this.f93729f, this.f93727d, this.f93728e);
    }
}
