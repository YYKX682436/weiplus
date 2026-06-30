package bp4;

/* loaded from: classes10.dex */
public final class q2 implements ml5.i {

    /* renamed from: a, reason: collision with root package name */
    public float f104887a = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bp4.w2 f104888b;

    public q2(bp4.w2 w2Var) {
        this.f104888b = w2Var;
    }

    @Override // ml5.i
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.y yVar;
        android.graphics.Matrix matrix;
        bp4.w2 w2Var = this.f104888b;
        java.lang.String str = w2Var.f104936e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onChangeStart: audioSeekable:");
        bp4.c0 c0Var = w2Var.f104944p;
        sb6.append(c0Var != null ? c0Var.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        ((bp4.y) w2Var.f104935d).a().mo58788x65825f6();
        bp4.c0 c0Var2 = w2Var.f104944p;
        if (c0Var2 != null) {
            c0Var2.mo10983x65825f6();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = w2Var.f104938g;
        this.f104887a = (i1Var == null || (yVar = i1Var.f257157i) == null || (matrix = yVar.f257317a) == null) ? 1.0f : com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.q0.a(matrix);
        pm0.v.C(w2Var.f104945q);
        ((bp4.y) w2Var.f104935d).f104960a.f104744g.e();
    }

    @Override // ml5.i
    public void b() {
        bp4.w2 w2Var = this.f104888b;
        java.lang.String str = w2Var.f104936e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onChangeEnd: audioSeekable:");
        bp4.c0 c0Var = w2Var.f104944p;
        sb6.append(c0Var != null ? c0Var.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        bp4.y yVar = (bp4.y) w2Var.f104935d;
        yVar.getClass();
        ju3.d0.k(yVar.f104961b, ju3.c0.f383446x1, null, 2, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = w2Var.f104938g;
        if (i1Var != null) {
            boolean z17 = this.f104887a == com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.q0.a(i1Var.f257157i.f257317a);
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16992x127e9e90.EditItem editItem = i1Var.f257159k;
            if (z17) {
                editItem.f37763xebe5543b++;
            } else {
                editItem.f37768x712595e5++;
            }
        }
        pm0.v.U(3000L, w2Var.f104945q);
    }

    @Override // ml5.h
    /* renamed from: onChange */
    public void mo10990x3dcbea6f() {
        bp4.w2 w2Var = this.f104888b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w2Var.f104936e, "onChange: " + ((bp4.y) w2Var.f104935d).f104960a.f104743f.getContentRect());
        if (((bp4.y) w2Var.f104935d).f104960a.f104743f.getContentRect().isEmpty()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = w2Var.f104938g;
        if (i1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.y yVar = i1Var.f257157i;
            yVar.f257320d.set(((bp4.y) w2Var.f104935d).f104960a.f104743f.getContentRect());
            rm5.j jVar = i1Var.f257160l;
            jVar.f479045n.set(((bp4.y) w2Var.f104935d).f104960a.f104743f.getContentRect());
            android.graphics.Rect rect = yVar.f257320d;
            android.graphics.RectF rectF = w2Var.f104940i;
            rect.offset(-((int) rectF.left), -((int) rectF.top));
            jVar.f479045n.offset(-((int) rectF.left), -((int) rectF.top));
            yVar.f257318b.set(yVar.f257320d);
        }
        if (((bp4.y) w2Var.f104935d).a().m82510xc00617a4()) {
            return;
        }
        ((bp4.y) w2Var.f104935d).a().e();
    }
}
