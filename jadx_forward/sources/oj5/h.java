package oj5;

/* loaded from: classes14.dex */
public final class h extends p012xc85e97e9.p103xe821e364.p104xd1075a44.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oj5.o f427385a;

    public h(oj5.o oVar) {
        this.f427385a = oVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void b() {
        oj5.o oVar = this.f427385a;
        oj5.o.a(oVar);
        java.util.Collection values = oVar.f427398d.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            oVar.f427398d.a((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next(), "onChanged");
        }
        oVar.f427398d.clear();
        oj5.o.b(this.f427385a, true, "onChanged", 0L, 4, null);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void c(int i17, int i18) {
        oj5.o oVar = this.f427385a;
        oj5.o.a(oVar);
        int i19 = i17 + i18;
        for (int i27 = i17; i27 < i19; i27++) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) oVar.f427398d.remove(java.lang.Integer.valueOf(i27));
            oVar.f427398d.a(k3Var, "onItemRangeChanged(" + i17 + '-' + i18 + ')');
        }
        oj5.o.b(this.f427385a, true, "onItemRangeChanged(" + i17 + '-' + i18 + ')', 0L, 4, null);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void e(int i17, int i18) {
        oj5.o oVar = this.f427385a;
        oj5.o.a(oVar);
        java.util.Collection values = oVar.f427398d.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            oVar.f427398d.a((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next(), "onItemRangeInserted");
        }
        oVar.f427398d.clear();
        oj5.o.b(this.f427385a, true, "onItemRangeInserted(" + i17 + '-' + i18 + ')', 0L, 4, null);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void f(int i17, int i18, int i19) {
        oj5.o oVar = this.f427385a;
        oj5.o.a(oVar);
        java.util.Collection values = oVar.f427398d.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            oVar.f427398d.a((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next(), "onItemRangeMoved");
        }
        oVar.f427398d.clear();
        oj5.o.b(this.f427385a, true, "onItemRangeMoved(" + i17 + '-' + i18 + '-' + i19 + ')', 0L, 4, null);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void g(int i17, int i18) {
        oj5.o oVar = this.f427385a;
        oj5.o.a(oVar);
        java.util.Collection values = oVar.f427398d.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            oVar.f427398d.a((p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next(), "onItemRangeRemoved");
        }
        oVar.f427398d.clear();
        oj5.o.b(this.f427385a, true, "onItemRangeRemoved(" + i17 + '-' + i18 + ')', 0L, 4, null);
    }
}
