package com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "kotlin.jvm.PlatformType", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class i<InputType, ResultType> implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    static {
        new com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.i();
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        java.lang.String str = c10756x2a5d7b2d != null ? c10756x2a5d7b2d.f149939d : null;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AnyProcessAvatarAttacher", "invoke#IPCSyncInvokeTask, username is empty");
            return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d("");
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.r rVar = com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.r.f146711a;
        com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.h hVar = new com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.h(null, 1, null);
        com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.g a17 = rVar.a(str, hVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AnyProcessAvatarAttacher", "getAvatarPathMainProcess, dispatchResult: " + a17);
        if (com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.g.f146691e == a17) {
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AnyProcessAvatarAttacher", "getAvatarPathMainProcess, " + str + " is chat room, do not need to fetch hd avatar");
            } else if (android.os.Looper.myLooper() != null) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.p314xaae8f345.mm.p943x351df9c2.m0 m0Var = new com.p314xaae8f345.mm.p943x351df9c2.m0();
                m0Var.a(str, new com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.n(m0Var));
            } else {
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.m(str));
            }
        }
        return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(hVar.f146694a);
    }
}
