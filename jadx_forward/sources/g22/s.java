package g22;

/* loaded from: classes15.dex */
public final class s implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.AbstractC13361x415b318 f349396d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.AbstractC13361x415b318 abstractC13361x415b318) {
        this.f349396d = abstractC13361x415b318;
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public final void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        if (android.text.TextUtils.isEmpty(str) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "delete_group_v3")) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.AbstractC13361x415b318 abstractC13361x415b318 = this.f349396d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(abstractC13361x415b318.f179945d, "IOnStorageChange event:" + str + ", refreshUI");
        java.lang.Object obj = w0Var.f398509d;
        java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.q.f179124c.c();
        if (str2 != null) {
            abstractC13361x415b318.t0(str2, -1);
        }
    }
}
