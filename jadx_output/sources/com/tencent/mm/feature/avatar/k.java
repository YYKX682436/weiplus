package com.tencent.mm.feature.avatar;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0004\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/tencent/mm/ipcinvoker/type/IPCString;", "kotlin.jvm.PlatformType", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Lcom/tencent/mm/ipcinvoker/r;", "callback", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/ipcinvoker/type/IPCString;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class k<InputType, ResultType> implements com.tencent.mm.ipcinvoker.j {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.feature.avatar.k f65166d = new com.tencent.mm.feature.avatar.k();

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        java.lang.String str = iPCString != null ? iPCString.f68406d : null;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AnyProcessAvatarAttacher", "invoke#IPCAsyncInvokeTask, username is empty");
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString(""));
            return;
        }
        com.tencent.mm.feature.avatar.r rVar2 = com.tencent.mm.feature.avatar.r.f65178a;
        com.tencent.mm.feature.avatar.j jVar = new com.tencent.mm.feature.avatar.j(rVar);
        if (((hn1.s) ((kv.b0) i95.n0.c(kv.b0.class))).bj(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AnyProcessAvatarAttacher", "getAvatarPathMainProcessAsync, " + str + " use new avatar loader");
            com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
            if (lifecycleScope != null) {
                v65.i.b(lifecycleScope, null, new com.tencent.mm.feature.avatar.o(str, jVar, null), 1, null);
                return;
            }
            return;
        }
        com.tencent.mm.feature.avatar.h hVar = new com.tencent.mm.feature.avatar.h(null, 1, null);
        com.tencent.mm.feature.avatar.g a17 = rVar2.a(str, hVar);
        jVar.invoke(hVar.f65161a);
        com.tencent.mars.xlog.Log.i("MicroMsg.AnyProcessAvatarAttacher", "getAvatarPathMainProcessAsync, dispatchResult: " + a17);
        if (com.tencent.mm.feature.avatar.g.f65158e == a17) {
            if (com.tencent.mm.storage.z3.R4(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AnyProcessAvatarAttacher", "getAvatarPathMainProcessAsync, " + str + " is chat room, do not need to fetch hd avatar");
                return;
            }
            if (android.os.Looper.myLooper() == null) {
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.feature.avatar.p(str));
                return;
            }
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.m0 m0Var = new com.tencent.mm.modelavatar.m0();
            m0Var.a(str, new com.tencent.mm.feature.avatar.q(m0Var));
        }
    }
}
