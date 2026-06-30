package qn2;

/* loaded from: classes3.dex */
public final class t implements ek2.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qn2.z f446684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f446685b;

    public t(qn2.z zVar, yz5.a aVar) {
        this.f446684a = zVar;
        this.f446685b = aVar;
    }

    @Override // ek2.z0
    public void a(int i17, int i18, java.lang.String str, r45.ht1 resp) {
        km2.z zVar;
        r45.cz1 cz1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        if (i17 == 0 && i18 == 0) {
            qn2.z zVar2 = this.f446684a;
            ((on2.z2) zVar2.P0(on2.z2.class)).g7((r45.cz1) resp.m75936x14adae67(1));
            ((on2.z2) zVar2.P0(on2.z2.class)).X6(resp);
            r45.cz1 cz1Var2 = (r45.cz1) resp.m75936x14adae67(1);
            java.lang.String str2 = null;
            if ((cz1Var2 != null ? cz1Var2.m75945x2fec8307(0) : null) != null) {
                r45.cz1 cz1Var3 = (r45.cz1) resp.m75936x14adae67(1);
                java.lang.String m75945x2fec8307 = cz1Var3 != null ? cz1Var3.m75945x2fec8307(0) : null;
                km2.z zVar3 = ((on2.z2) zVar2.P0(on2.z2.class)).f428625m;
                if (zVar3 != null && (cz1Var = zVar3.f390765d) != null) {
                    str2 = cz1Var.m75945x2fec8307(0);
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, str2) && (zVar = ((on2.z2) zVar2.P0(on2.z2.class)).f428625m) != null) {
                    zVar.f390765d = (r45.cz1) resp.m75936x14adae67(1);
                }
            }
        }
        this.f446685b.mo152xb9724478();
    }
}
