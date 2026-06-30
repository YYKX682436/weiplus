package on2;

/* loaded from: classes3.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ on2.j1 f428359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.dz1 f428360e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(on2.j1 j1Var, r45.dz1 dz1Var) {
        super(0);
        this.f428359d = j1Var;
        this.f428360e = dz1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        on2.j1 j1Var = this.f428359d;
        java.util.Iterator it = j1Var.f428478d.iterator();
        boolean z17 = false;
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (((r45.dz1) it.next()).m75939xb282bd08(0) == this.f428360e.m75939xb282bd08(0)) {
                break;
            }
            i17++;
        }
        if (i17 >= 0 && i17 < j1Var.mo1894x7e414b06()) {
            z17 = true;
        }
        if (z17) {
            j1Var.m8148xed6e4d18(i17, 1);
        }
        return jz5.f0.f384359a;
    }
}
