package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class y2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.z2 f231395a;

    public y2(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.z2 z2Var) {
        this.f231395a = z2Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "steve: accept success! tryTriggerAcceptSucc %d, %d, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Multitalk.ILinkService", "steve: accept failed errtype %d errcode %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = this.f231395a.f231402e.f231041a;
            i4Var.Y.b(i4Var.f231156f);
        }
    }
}
