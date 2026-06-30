package ir;

/* loaded from: classes15.dex */
public final class i extends p012xc85e97e9.p103xe821e364.p104xd1075a44.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ir.o f375398a;

    public i(ir.o oVar) {
        this.f375398a = oVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean a(int i17, int i18) {
        ir.o oVar = this.f375398a;
        java.lang.Object obj = oVar.f375415c.f375424b.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        java.lang.Object obj2 = oVar.f375416d.f375424b.get(i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
        return ((ir.r) obj).b((ir.r) obj2);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean b(int i17, int i18) {
        ir.o oVar = this.f375398a;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(oVar.f375415c.f375424b.get(i17), oVar.f375416d.f375424b.get(i18));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int d() {
        return this.f375398a.f375416d.f375424b.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int e() {
        return this.f375398a.f375415c.f375424b.size();
    }
}
