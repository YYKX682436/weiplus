package com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "R", "Landroid/os/Parcelable;", com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, "Lcom/tencent/luggage/sdk/launching/OnWXAppResultXPCMessage;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class d<InputType, ResultType> implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.d f129142a = new com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.d();

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3937x1adcb01a c3937x1adcb01a = (com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3937x1adcb01a) obj;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0 c10757xa20383b0 = com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d;
        if (c3937x1adcb01a != null) {
            try {
                android.os.Parcelable parcelable = c3937x1adcb01a.f129135f;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnWXAppResultEventSender", "IPCSyncInvokeTask publish event, " + parcelable);
                com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3935xc34230ed c3935xc34230ed = new com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3935xc34230ed();
                c3935xc34230ed.f129128g = c3937x1adcb01a.f129133d;
                c3935xc34230ed.f129129h = c3937x1adcb01a.f129134e;
                c3935xc34230ed.f129130i = parcelable;
                c3935xc34230ed.e();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OnWXAppResultEventSender", "IPCSyncInvokeTask error, " + android.util.Log.getStackTraceString(e17));
            }
        }
        return c10757xa20383b0;
    }
}
