package k85;

/* loaded from: classes15.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d85.g0 f386980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2611x1bbd4e96.ui.ActivityC21022xd1345258 f386981e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f386982f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(d85.g0 g0Var, com.p314xaae8f345.mm.p2611x1bbd4e96.ui.ActivityC21022xd1345258 activityC21022xd1345258, yz5.l lVar) {
        super(1);
        this.f386980d = g0Var;
        this.f386981e = activityC21022xd1345258;
        this.f386982f = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        jz5.f0 f0Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        yz5.l lVar = this.f386982f;
        if (booleanValue) {
            j85.h hVar = j85.h.f379791a;
            d85.g0 g0Var = this.f386980d;
            j85.h.b(hVar, 102L, java.lang.Long.valueOf(g0Var.f308726e), null, null, 12, null);
            com.p314xaae8f345.mm.p2611x1bbd4e96.ui.ActivityC21022xd1345258 activityC21022xd1345258 = this.f386981e;
            java.util.ArrayList arrayList = activityC21022xd1345258.f274729f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList);
            arrayList.remove(g0Var);
            java.util.ArrayList arrayList2 = activityC21022xd1345258.f274729f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList2);
            d85.g0 g0Var2 = (d85.g0) kz5.n0.Z(arrayList2);
            if (g0Var2 != null) {
                activityC21022xd1345258.T6(g0Var2, lVar);
                f0Var = f0Var2;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                lVar.mo146xb9724478(java.lang.Boolean.TRUE);
            }
        } else {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        }
        return f0Var2;
    }
}
