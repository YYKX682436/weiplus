package cd0;

/* loaded from: classes5.dex */
public final class w implements com.tencent.mm.ui.widget.dialog.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f40602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f40603b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f40604c;

    public w(long j17, com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        this.f40602a = j17;
        this.f40603b = f9Var;
        this.f40604c = str;
    }

    @Override // com.tencent.mm.ui.widget.dialog.d1
    public final void onShow() {
        com.tencent.mm.autogen.mmdata.rpt.MessageBatchRevokeStruct messageBatchRevokeStruct = new com.tencent.mm.autogen.mmdata.rpt.MessageBatchRevokeStruct();
        messageBatchRevokeStruct.f59178d = 1L;
        messageBatchRevokeStruct.f59183i = this.f40602a;
        messageBatchRevokeStruct.f59184j = (c01.id.c() - this.f40603b.getCreateTime()) / 1000;
        messageBatchRevokeStruct.p(this.f40604c);
        messageBatchRevokeStruct.k();
    }
}
