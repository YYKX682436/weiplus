package u1;

/* loaded from: classes14.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u1.w f505133d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(u1.w wVar) {
        super(2);
        this.f505133d = wVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3;
        z0.s mod = (z0.s) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((jz5.f0) obj, "<anonymous parameter 0>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mod, "mod");
        o0.i iVar = this.f505133d.f505225p;
        int i17 = iVar.f423385f;
        if (i17 > 0) {
            int i18 = i17 - 1;
            java.lang.Object[] objArr = iVar.f423383d;
            do {
                obj3 = objArr[i18];
                u1.e1 e1Var = (u1.e1) obj3;
                if (e1Var.G == mod && !e1Var.H) {
                    break;
                }
                i18--;
            } while (i18 >= 0);
        }
        obj3 = null;
        u1.e1 e1Var2 = (u1.e1) obj3;
        if (e1Var2 != null) {
            e1Var2.H = true;
        }
        return jz5.f0.f384359a;
    }
}
