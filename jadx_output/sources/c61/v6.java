package c61;

/* loaded from: classes.dex */
public final class v6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f39345d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(yz5.l lVar) {
        super(1);
        this.f39345d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.n42 n42Var;
        r45.qp1 qp1Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        this.f39345d.invoke(fVar);
        if (fVar != null && fVar.f70616b == -200279) {
            r45.n42 n42Var2 = (r45.n42) fVar.f70618d;
            if ((n42Var2 != null ? (r45.qp1) n42Var2.getCustom(3) : null) != null && (n42Var = (r45.n42) fVar.f70618d) != null && (qp1Var = (r45.qp1) n42Var.getCustom(3)) != null) {
                int integer = qp1Var.getInteger(0);
                if (integer == 1) {
                    java.lang.String string = qp1Var.getString(1);
                    java.lang.String str = string != null ? string : "";
                    com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ll());
                    u1Var.g(str);
                    u1Var.m(com.tencent.mm.R.string.l_e);
                    u1Var.a(true);
                    u1Var.l(hz2.b.f286310a);
                    u1Var.q(false);
                } else if (integer == 3) {
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    java.lang.String string2 = qp1Var.getString(1);
                    db5.t7.m(context, string2 != null ? string2 : "");
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
