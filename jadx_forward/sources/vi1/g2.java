package vi1;

/* loaded from: classes7.dex */
public final class g2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.i2 f518856d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(vi1.i2 i2Var) {
        super(1);
        this.f518856d = i2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 it = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        vi1.h0 h0Var = this.f518856d.f518864a;
        if (h0Var != null) {
            vi1.b2 b2Var = (vi1.b2) h0Var;
            b2Var.f518815f.add(it);
            java.util.ArrayList arrayList = b2Var.f518814e;
            arrayList.remove(it);
            vi1.i0 i0Var = b2Var.f518813d;
            if (i0Var != null) {
                ((vi1.i2) i0Var).a(b2Var.f518816g, arrayList);
            }
        }
        return jz5.f0.f384359a;
    }
}
