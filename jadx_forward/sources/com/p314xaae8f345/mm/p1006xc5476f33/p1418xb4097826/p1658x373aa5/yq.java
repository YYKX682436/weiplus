package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes.dex */
public final class yq extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f214948d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq(android.view.View view) {
        super(4);
        this.f214948d = view;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        ((java.lang.Number) obj).intValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        r45.tp2 resp = (r45.tp2) obj4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        if (intValue != 0) {
            r45.zm6 zm6Var = (r45.zm6) resp.m75936x14adae67(7);
            boolean z17 = true;
            if (zm6Var != null && zm6Var.m75933x41a8a7f2(1)) {
                r45.zm6 zm6Var2 = (r45.zm6) resp.m75936x14adae67(7);
                java.lang.String m75945x2fec8307 = zm6Var2 != null ? zm6Var2.m75945x2fec8307(0) : null;
                if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    android.content.Context context = this.f214948d.getContext();
                    r45.zm6 zm6Var3 = (r45.zm6) resp.m75936x14adae67(7);
                    db5.t7.m123883x26a183b(context, zm6Var3 != null ? zm6Var3.m75945x2fec8307(0) : null, 0).show();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveCommentPopupWindowItemClick", "tickle failed ,errCode " + intValue);
                }
            }
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveCommentPopupWindowItemClick", "tickle failed ,errCode " + intValue);
        }
        return jz5.f0.f384359a;
    }
}
