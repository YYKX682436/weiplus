package com.p314xaae8f345.mm.ui.p2740x696c9db;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/ui/tools/ShareFileResultReceiver;", "Landroid/support/v4/os/ResultReceiver;", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.tools.ShareFileResultReceiver */
/* loaded from: classes5.dex */
public final class C22521x3d056be7 extends p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f291682g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22521x3d056be7(android.os.Handler handler, java.lang.String filePath) {
        super(handler);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        this.f291682g = filePath;
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c
    public void a(int i17, android.os.Bundle bundle) {
        if (i17 != -1) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.String str = this.f291682g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareImgUI", "resultCode: %s, delete file %s", valueOf, str);
            com.p314xaae8f345.mm.vfs.w6.h(str);
        }
    }
}
