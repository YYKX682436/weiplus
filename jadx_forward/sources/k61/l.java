package k61;

/* loaded from: classes9.dex */
public class l implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k61.m f386035a;

    public l(k61.m mVar) {
        this.f386035a = mVar;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.LOGIC";
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.Map map = (java.util.Map) obj;
        k61.h hVar = this.f386035a.f386036a;
        map.put("launchScene", java.lang.Integer.valueOf(hVar.f336757n.a("enter_scene", 1)));
        km5.u.a(((km5.q) km5.u.e(map)).n(hVar.f386030o.f360712c));
        return null;
    }
}
