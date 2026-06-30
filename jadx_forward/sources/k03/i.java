package k03;

/* loaded from: classes8.dex */
public final class i implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k03.j f384654d;

    public i(k03.j jVar) {
        this.f384654d = jVar;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public final void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff call, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(call, "call");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(call.f71610xbfc5d0e1, "updateQuery")) {
            result.mo65719xbc9fa82f();
            return;
        }
        java.lang.Object obj = call.f71609x86ac7956;
        java.util.Map map = obj instanceof java.util.Map ? (java.util.Map) obj : null;
        java.lang.Object obj2 = map != null ? map.get("query") : null;
        java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (str == null) {
            str = "";
        }
        k03.j jVar = this.f384654d;
        jVar.f384655d = str;
        jVar.f384658g.setText(jVar.a(str));
        jVar.f384656e.m138438xd8c5c779("onSectionOrderChanged", java.util.Collections.singletonMap("isWebSearchTop", java.lang.Boolean.TRUE));
        result.mo65720x90b54003(null);
    }
}
