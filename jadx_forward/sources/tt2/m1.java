package tt2;

/* loaded from: classes3.dex */
public final class m1 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.xv2 f503494a;

    public m1(r45.xv2 xv2Var) {
        this.f503494a = xv2Var;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.b4 b4Var = ml2.b4.f408797s;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("commerceAction", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.v1.f33869x366c91de);
            r45.xv2 xv2Var = this.f503494a;
            jSONObject.put("cate_id", xv2Var.m75942xfb822ef2(2));
            jSONObject.put("tab_name", xv2Var.m75945x2fec8307(0));
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(xv2Var.m75945x2fec8307(0), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ewi))) {
                jSONObject.put("tab_type", 3);
            } else {
                jSONObject.put("tab_type", xv2Var.m75942xfb822ef2(2) != 0 ? 1 : 2);
            }
            ml2.r0.hj(r0Var, b4Var, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        }
    }
}
