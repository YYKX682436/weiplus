package f65;

@j95.b
/* loaded from: classes12.dex */
public final class u extends i95.w implements wf0.c2 {
    public void wi(java.lang.String str, wf0.e2 uploadType) {
        f65.y yVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uploadType, "uploadType");
        f65.y0 y0Var = f65.y0.f341552a;
        int ordinal = uploadType.ordinal();
        if (ordinal == 0) {
            yVar = f65.y.f341547e;
        } else if (ordinal == 1) {
            yVar = f65.y.f341548f;
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            yVar = f65.y.f341549g;
        }
        y0Var.j(str, yVar);
    }
}
