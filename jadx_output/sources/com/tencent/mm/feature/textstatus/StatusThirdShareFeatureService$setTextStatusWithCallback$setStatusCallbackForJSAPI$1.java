package com.tencent.mm.feature.textstatus;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/feature/textstatus/StatusThirdShareFeatureService$setTextStatusWithCallback$setStatusCallbackForJSAPI$1", "Landroid/os/ResultReceiver;", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class StatusThirdShareFeatureService$setTextStatusWithCallback$setStatusCallbackForJSAPI$1 extends android.os.ResultReceiver {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bi4.l1 f67834d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusThirdShareFeatureService$setTextStatusWithCallback$setStatusCallbackForJSAPI$1(bi4.l1 l1Var) {
        super(null);
        this.f67834d = l1Var;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i17, android.os.Bundle bundle) {
        byte[] byteArray;
        super.onReceiveResult(i17, bundle);
        int i18 = i17 == -1 ? 0 : 2;
        bi4.l1 l1Var = this.f67834d;
        if (l1Var != null) {
            pj4.r0 r0Var = new pj4.r0();
            r0Var.f355272d = 2;
            pj4.w wVar = new pj4.w();
            if (bundle != null && (byteArray = bundle.getByteArray("select_status_info")) != null) {
                wVar.parseFrom(byteArray);
            }
            r0Var.f355273e = wVar;
            l1Var.onFinishAction(i18, "", r0Var);
        }
    }
}
