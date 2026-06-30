package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes12.dex */
public final class k2 implements com.p314xaae8f345.mm.vfs.t6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.n2 f273276a;

    public k2(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.n2 n2Var) {
        this.f273276a = n2Var;
    }

    @Override // com.p314xaae8f345.mm.vfs.t6
    /* renamed from: accept */
    public final boolean mo40607xab27b508(com.p314xaae8f345.mm.vfs.r6 pathname) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pathname, "pathname");
        if (pathname.f294699d.f294812f.isEmpty() ? false : pathname.m82467xfb82e301().startsWith(".")) {
            return false;
        }
        return (this.f273276a.f273320r && pathname.y()) ? false : true;
    }
}
