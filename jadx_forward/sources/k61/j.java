package k61;

/* loaded from: classes9.dex */
public class j implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k61.m f386033a;

    public j(k61.m mVar) {
        this.f386033a = mVar;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.LOGIC";
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        nm5.b bVar = (nm5.b) obj;
        k61.h hVar = this.f386033a.f386036a;
        int intValue = ((java.lang.Integer) bVar.a(0)).intValue();
        java.util.Map map = (java.util.Map) bVar.a(1);
        map.put("launchScene", java.lang.Integer.valueOf(hVar.f336757n.a("enter_scene", 1)));
        km5.u.a(((km5.q) km5.u.f(java.lang.Integer.valueOf(intValue), map)).n(hVar.f386030o.f360711b));
        return null;
    }
}
