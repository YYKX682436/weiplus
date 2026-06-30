package dj2;

/* loaded from: classes10.dex */
public final class d extends dj2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
    }

    @Override // hn5.c
    public void f() {
        super.f();
        this.f314430d.J();
    }

    @Override // dj2.b, hn5.c
    public void g(int i17, android.view.View view) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.g(i17, view);
        if (view instanceof sj2.i) {
            sj2.i iVar = (sj2.i) view;
            xh2.a b17 = b(i17);
            boolean z17 = this.f314434h;
            int width = this.f314433g.width();
            int i19 = 2;
            java.util.LinkedList<xh2.a> linkedList = this.f314432f;
            if (width > 0 && this.f314433g.height() > 0) {
                for (xh2.a aVar : linkedList) {
                    if (aVar.f536054b.f536088g == 2) {
                        int width2 = this.f314433g.width();
                        xh2.i iVar2 = aVar.f536054b;
                        float f17 = width2;
                        float f18 = iVar2.f364142a * f17;
                        float f19 = iVar2.f364144c * f17;
                        float f27 = (f17 - f18) - f19;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicFocusRatioAdapter", "getRightOffestSize margin: " + f27 + " windowWidth:" + f19 + " left: " + f18);
                        i18 = (int) (f19 + f27);
                        break;
                    }
                }
            }
            i18 = 0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (this.f314433g.width() > 0 && this.f314433g.height() > 0) {
                int width3 = this.f314433g.width();
                int height = this.f314433g.height();
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    xh2.i iVar3 = ((xh2.a) it.next()).f536054b;
                    if (iVar3.f536088g == i19) {
                        float f28 = width3;
                        float f29 = iVar3.f364142a * f28;
                        float f37 = height;
                        float f38 = iVar3.f364143b * f37;
                        arrayList.add(new android.graphics.RectF(f29, f38, (iVar3.f364144c * f28) + f29, (iVar3.f364145d * f37) + f38));
                        i19 = 2;
                    }
                }
            }
            iVar.m145857x8d44edd2(b17);
            iVar.f489919J = z17;
            iVar.K = i18;
            iVar.m145856xcb723c19(b17.f536053a);
            iVar.L = arrayList;
            iVar.M = b17.f536054b.f536088g == 1;
            iVar.m145858xc368f725(pm2.a.f438388h);
            iVar.Y();
            iVar.b0(iVar.M);
        }
    }

    @Override // dj2.b
    public android.view.View h(xh2.a data, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        lj2.x0 x0Var = this.f314430d;
        lj2.v0 v0Var = this.f314429c;
        android.content.Context context = this.f314428b;
        return i17 != 1 ? i17 != 2 ? (i17 == 3 || i17 == 7) ? new sj2.f(context, v0Var, x0Var) : new android.view.View(context) : new sj2.l(context, v0Var, x0Var) : new sj2.h(context, v0Var, x0Var);
    }

    @Override // dj2.b
    public java.lang.String l() {
        return "MicFocusRatioAdapter";
    }
}
