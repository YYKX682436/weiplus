package ir;

/* loaded from: classes15.dex */
public final class j extends p012xc85e97e9.p103xe821e364.p104xd1075a44.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ir.o f375405a;

    public j(ir.o oVar) {
        this.f375405a = oVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean a(int i17, int i18) {
        ir.o oVar = this.f375405a;
        java.lang.Object obj = oVar.f375415c.f375425c.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        ir.y0 y0Var = (ir.y0) obj;
        java.lang.Object obj2 = oVar.f375416d.f375425c.get(i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
        return b(i17, i18) && y0Var.f375452a.b(((ir.y0) obj2).f375452a);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean b(int i17, int i18) {
        ir.o oVar = this.f375405a;
        java.lang.Object obj = oVar.f375415c.f375425c.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        java.lang.Object obj2 = oVar.f375416d.f375425c.get(i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
        ir.r rVar = ((ir.y0) obj).f375452a;
        int i19 = rVar.f375428a;
        ir.r rVar2 = ((ir.y0) obj2).f375452a;
        return i19 == rVar2.f375428a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(rVar, rVar2);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int d() {
        return this.f375405a.f375416d.f375425c.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int e() {
        return this.f375405a.f375415c.f375425c.size();
    }
}
