package te2;

/* loaded from: classes10.dex */
public final class g3 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ te2.i3 f499565a;

    public g3(te2.i3 i3Var) {
        this.f499565a = i3Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        te2.w3 w3Var = this.f499565a.f499638f;
        if (w3Var == null) {
            return null;
        }
        java.lang.String f17 = ((te2.c4) w3Var).f();
        if (f17 == null) {
            f17 = "";
        }
        int i17 = 1;
        jz5.l[] lVarArr = new jz5.l[1];
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f17, "")) {
            ml2.e5 e5Var = ml2.e5.f408922e;
        } else {
            ml2.e5 e5Var2 = ml2.e5.f408922e;
            i17 = 2;
        }
        lVarArr[0] = new jz5.l("cur_red_packet_source", java.lang.Integer.valueOf(i17));
        return kz5.c1.l(lVarArr);
    }
}
