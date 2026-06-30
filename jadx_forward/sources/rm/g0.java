package rm;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrm/g0;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/mm/brandService/SyncPhotoRequest;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "biz-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class g0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.i<com.p314xaae8f345.mm.p646xf2865d2e.C10321x9368f258, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0> {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r callback) {
        com.p314xaae8f345.mm.p646xf2865d2e.C10321x9368f258 request = (com.p314xaae8f345.mm.p646xf2865d2e.C10321x9368f258) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (request.f145161d) {
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.l0.f299291c.n(rm.f0.f478904a);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SyncPhotoSwitchTask", "disable sync photo, invalid");
        }
        callback.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0());
    }
}
