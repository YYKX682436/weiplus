package sd;

/* loaded from: classes8.dex */
public class g extends sd.l0 {

    /* renamed from: f, reason: collision with root package name */
    public final sd.h f488134f;

    /* renamed from: g, reason: collision with root package name */
    public od.l f488135g;

    public g(android.content.Context context, java.lang.Class cls) {
        sd.h hVar = (sd.h) new d56.b(cls, cls).d(context).f308165b;
        this.f488134f = hVar;
        h("var self = this;", null);
        h("let require = process.mainModule.require;", null);
        this.f488135g = new od.l(hVar);
        h(ik1.f.e("LuggageBridge.js"), null);
        hVar.mo130333xb7489a6c();
    }

    @Override // sd.l0
    public void a() {
        this.f488134f.mo130332x5cd39ffa();
    }

    @Override // sd.l0
    public od.l d() {
        return this.f488135g;
    }

    @Override // sd.l0
    public java.lang.String e() {
        return this.f488134f.mo32054x11fd7f44();
    }

    public void h(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f488134f.mo32260x738236e6(str, valueCallback);
    }
}
