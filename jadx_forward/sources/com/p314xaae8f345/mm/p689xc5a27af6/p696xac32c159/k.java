package com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0004\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/tencent/mm/ipcinvoker/type/IPCString;", "kotlin.jvm.PlatformType", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "Lcom/tencent/mm/ipcinvoker/r;", "callback", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/ipcinvoker/type/IPCString;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class k<InputType, ResultType> implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.k f146699d = new com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.k();

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        java.lang.String str = c10756x2a5d7b2d != null ? c10756x2a5d7b2d.f149939d : null;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AnyProcessAvatarAttacher", "invoke#IPCAsyncInvokeTask, username is empty");
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(""));
            return;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.r rVar2 = com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.r.f146711a;
        com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.j jVar = new com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.j(rVar);
        if (((hn1.s) ((kv.b0) i95.n0.c(kv.b0.class))).bj(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AnyProcessAvatarAttacher", "getAvatarPathMainProcessAsync, " + str + " use new avatar loader");
            com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
            if (c20976x6ba6452a != null) {
                v65.i.b(c20976x6ba6452a, null, new com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.o(str, jVar, null), 1, null);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.h hVar = new com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.h(null, 1, null);
        com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.g a17 = rVar2.a(str, hVar);
        jVar.mo146xb9724478(hVar.f146694a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AnyProcessAvatarAttacher", "getAvatarPathMainProcessAsync, dispatchResult: " + a17);
        if (com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.g.f146691e == a17) {
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AnyProcessAvatarAttacher", "getAvatarPathMainProcessAsync, " + str + " is chat room, do not need to fetch hd avatar");
                return;
            }
            if (android.os.Looper.myLooper() == null) {
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.p(str));
                return;
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.p314xaae8f345.mm.p943x351df9c2.m0 m0Var = new com.p314xaae8f345.mm.p943x351df9c2.m0();
            m0Var.a(str, new com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.q(m0Var));
        }
    }
}
