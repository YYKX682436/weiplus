package com.tencent.mm.feature.avatar;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "kotlin.jvm.PlatformType", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class i<InputType, ResultType> implements com.tencent.mm.ipcinvoker.k0 {
    static {
        new com.tencent.mm.feature.avatar.i();
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        java.lang.String str = iPCString != null ? iPCString.f68406d : null;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AnyProcessAvatarAttacher", "invoke#IPCSyncInvokeTask, username is empty");
            return new com.tencent.mm.ipcinvoker.type.IPCString("");
        }
        com.tencent.mm.feature.avatar.r rVar = com.tencent.mm.feature.avatar.r.f65178a;
        com.tencent.mm.feature.avatar.h hVar = new com.tencent.mm.feature.avatar.h(null, 1, null);
        com.tencent.mm.feature.avatar.g a17 = rVar.a(str, hVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.AnyProcessAvatarAttacher", "getAvatarPathMainProcess, dispatchResult: " + a17);
        if (com.tencent.mm.feature.avatar.g.f65158e == a17) {
            if (com.tencent.mm.storage.z3.R4(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AnyProcessAvatarAttacher", "getAvatarPathMainProcess, " + str + " is chat room, do not need to fetch hd avatar");
            } else if (android.os.Looper.myLooper() != null) {
                ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.tencent.mm.modelavatar.m0 m0Var = new com.tencent.mm.modelavatar.m0();
                m0Var.a(str, new com.tencent.mm.feature.avatar.n(m0Var));
            } else {
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.feature.avatar.m(str));
            }
        }
        return new com.tencent.mm.ipcinvoker.type.IPCString(hVar.f65161a);
    }
}
