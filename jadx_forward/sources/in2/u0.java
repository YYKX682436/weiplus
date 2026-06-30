package in2;

/* loaded from: classes10.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.v0 f374442d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(in2.v0 v0Var) {
        super(3);
        this.f374442d = v0Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.util.List songInfoList = (java.util.List) obj2;
        java.util.LinkedList unComplianceList = (java.util.LinkedList) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfoList, "songInfoList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unComplianceList, "unComplianceList");
        in2.v0 v0Var = this.f374442d;
        if (intValue == 0) {
            mm2.m6 m6Var = (mm2.m6) v0Var.H.a(mm2.m6.class);
            gk2.e eVar = v0Var.H;
            m6Var.f410774f.e(songInfoList, (java.lang.String) ((mm2.m6) eVar.a(mm2.m6.class)).f410776h.mo3195x754a37bb(), new in2.t0(v0Var));
            if (!unComplianceList.isEmpty()) {
                java.util.LinkedList linkedList = ((mm2.m6) eVar.a(mm2.m6.class)).f410780o;
                linkedList.clear();
                linkedList.addAll(unComplianceList);
                android.content.Context context = v0Var.f199716e;
                db5.t7.g(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oyx));
            }
            v0Var.S.f374413f.clear();
            v0Var.I.r7();
        } else {
            db5.t7.m(v0Var.f199716e, "网络错误，请稍后再试");
        }
        return jz5.f0.f384359a;
    }
}
