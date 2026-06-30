package vr;

/* loaded from: classes8.dex */
public final class o implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr.q f520951d;

    public o(vr.q qVar) {
        this.f520951d = qVar;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public final void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff call, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(call, "call");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(call.f71610xbfc5d0e1, "updateContentLength")) {
            result.mo65719xbc9fa82f();
            return;
        }
        java.lang.Object obj = call.f71609x86ac7956;
        java.util.Map map = obj instanceof java.util.Map ? (java.util.Map) obj : null;
        java.lang.Object obj2 = map != null ? map.get("currentLength") : null;
        java.lang.Number number = obj2 instanceof java.lang.Number ? (java.lang.Number) obj2 : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmoticonBoardNativeView", "updateContentLength viewId=" + this.f520951d.f520954e + " currentLength=" + (number != null ? number.intValue() : 0));
        result.mo65720x90b54003(null);
    }
}
