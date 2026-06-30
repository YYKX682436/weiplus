package com.p314xaae8f345.mm.p689xc5a27af6.p765xa4f4bf5f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/feature/textstatus/StatusThirdShareFeatureService$setTextStatusWithCallback$setStatusCallbackForJSAPI$1", "Landroid/os/ResultReceiver;", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService$setTextStatusWithCallback$setStatusCallbackForJSAPI$1 */
/* loaded from: classes11.dex */
public final class ResultReceiverC10692xf58669db extends android.os.ResultReceiver {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bi4.l1 f149367d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResultReceiverC10692xf58669db(bi4.l1 l1Var) {
        super(null);
        this.f149367d = l1Var;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i17, android.os.Bundle bundle) {
        byte[] byteArray;
        super.onReceiveResult(i17, bundle);
        int i18 = i17 == -1 ? 0 : 2;
        bi4.l1 l1Var = this.f149367d;
        if (l1Var != null) {
            pj4.r0 r0Var = new pj4.r0();
            r0Var.f436805d = 2;
            pj4.w wVar = new pj4.w();
            if (bundle != null && (byteArray = bundle.getByteArray("select_status_info")) != null) {
                wVar.mo11468x92b714fd(byteArray);
            }
            r0Var.f436806e = wVar;
            l1Var.mo10624xfbbb8828(i18, "", r0Var);
        }
    }
}
