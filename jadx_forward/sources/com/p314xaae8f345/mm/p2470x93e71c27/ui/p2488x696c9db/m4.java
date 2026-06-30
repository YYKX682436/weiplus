package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes12.dex */
public class m4 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.n4 f273306a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.n4 n4Var, xu5.b bVar, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r4 r4Var) {
        super(bVar);
        this.f273306a = n4Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        java.lang.Object obj = message.obj;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.n4 n4Var = this.f273306a;
        if (obj == null) {
            n4Var.getClass();
            return;
        }
        java.util.LinkedList linkedList = n4Var.f273324b;
        if (linkedList.size() < n4Var.f273323a) {
            linkedList.add(obj);
        }
    }
}
