package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class ci implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f285265a;

    public ci(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105) {
        this.f285265a = c21908xb66fd105;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        final km5.b b17 = km5.u.b();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = this.f285265a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = c21908xb66fd105.f284709t;
        if (u3Var != null && u3Var.isShowing()) {
            c21908xb66fd105.f284709t.dismiss();
        }
        c21908xb66fd105.f284709t = db5.e1.Q(c21908xb66fd105.f284708s.g(), c21908xb66fd105.f284708s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), c21908xb66fd105.f284708s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.mm.ui.chatting.viewitems.ci$$a
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(android.content.DialogInterface dialogInterface) {
                km5.b.this.a(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.b(0, "cancel by user"));
            }
        });
        c21908xb66fd105.W = true;
        return null;
    }
}
