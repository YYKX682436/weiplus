package cb1;

/* loaded from: classes7.dex */
public final class s implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f121833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f121834b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cb1.j0 f121835c;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, int i17, cb1.j0 j0Var) {
        this.f121833a = v5Var;
        this.f121834b = i17;
        this.f121835c = j0Var;
    }

    @Override // km5.e
    public final void a(java.lang.Object obj) {
        vi1.l2 l2Var = vi1.l2.f518934a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f121833a;
        java.lang.String mo48798x74292566 = v5Var.mo48798x74292566();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
        vi1.j2 a17 = l2Var.a(mo48798x74292566);
        if (a17 != null) {
            vi1.l1.f518932a.a().ud(a17);
        }
        java.lang.String mo48798x742925662 = v5Var.mo48798x74292566();
        if (mo48798x742925662 != null) {
            l2Var.d(mo48798x742925662);
        }
        boolean z17 = obj instanceof java.lang.String;
        cb1.j0 j0Var = this.f121835c;
        int i17 = this.f121834b;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetPhoneNumberNew", "getphonenumber fail:" + obj);
            v5Var.a(i17, j0Var.o("fail:" + obj));
            return;
        }
        if (!(obj instanceof java.lang.Exception)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetPhoneNumberNew", "getphonenumber fail");
            v5Var.a(i17, j0Var.o("fail"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetPhoneNumberNew", "getphonenumber fail:{" + obj + ".message}");
        v5Var.a(i17, j0Var.o("fail:{" + obj + ".message}"));
    }
}
