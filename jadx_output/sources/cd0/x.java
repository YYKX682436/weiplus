package cd0;

/* loaded from: classes5.dex */
public final class x implements com.tencent.mm.ui.widget.dialog.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f40605a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f40606b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f40607c;

    public x(long j17, com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        this.f40605a = j17;
        this.f40606b = f9Var;
        this.f40607c = str;
    }

    @Override // com.tencent.mm.ui.widget.dialog.b1
    public final void a() {
        com.tencent.mm.autogen.mmdata.rpt.MessageBatchRevokeStruct messageBatchRevokeStruct = new com.tencent.mm.autogen.mmdata.rpt.MessageBatchRevokeStruct();
        messageBatchRevokeStruct.f59178d = 4L;
        messageBatchRevokeStruct.f59183i = this.f40605a;
        messageBatchRevokeStruct.f59184j = (c01.id.c() - this.f40606b.getCreateTime()) / 1000;
        messageBatchRevokeStruct.p(this.f40607c);
        messageBatchRevokeStruct.k();
    }
}
