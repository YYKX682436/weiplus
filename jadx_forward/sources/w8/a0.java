package w8;

/* loaded from: classes15.dex */
public class a0 implements w8.w {

    /* renamed from: a, reason: collision with root package name */
    public final t9.o f525094a = new t9.o(new byte[4], 4);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w8.c0 f525095b;

    public a0(w8.c0 c0Var) {
        this.f525095b = c0Var;
    }

    @Override // w8.w
    public void a(t9.p pVar) {
        w8.c0 c0Var;
        if (pVar.m() != 0) {
            return;
        }
        pVar.x(7);
        int i17 = (pVar.f498075c - pVar.f498074b) / 4;
        int i18 = 0;
        while (true) {
            c0Var = this.f525095b;
            if (i18 >= i17) {
                break;
            }
            t9.o oVar = this.f525094a;
            pVar.b(oVar.f498069a, 0, 4);
            oVar.e(0);
            int d17 = oVar.d(16);
            oVar.f(3);
            if (d17 == 0) {
                oVar.f(13);
            } else {
                int d18 = oVar.d(13);
                c0Var.f525126f.put(d18, new w8.x(new w8.b0(c0Var, d18)));
                c0Var.f525129i++;
            }
            i18++;
        }
        if (c0Var.f525121a != 2) {
            c0Var.f525126f.remove(0);
        }
    }

    @Override // w8.w
    public void c(t9.a0 a0Var, q8.g gVar, w8.g0 g0Var) {
    }
}
