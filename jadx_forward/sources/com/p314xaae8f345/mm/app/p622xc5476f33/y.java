package com.p314xaae8f345.mm.app.p622xc5476f33;

/* loaded from: classes9.dex */
public class y implements o25.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f135242a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.DeeplinkUriSpanHandler f135243b;

    public y(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.DeeplinkUriSpanHandler deeplinkUriSpanHandler, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        this.f135243b = deeplinkUriSpanHandler;
        this.f135242a = u3Var;
    }

    @Override // o25.k0
    public void b(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, boolean z17) {
        r45.zp6 I;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f135242a;
        if (u3Var != null && u3Var.isShowing()) {
            u3Var.dismiss();
        }
        if (m1Var == null || i17 == 0 || i18 == 0 || !(m1Var instanceof com.p314xaae8f345.mm.p957x53236a1b.h1) || (I = ((com.p314xaae8f345.mm.p957x53236a1b.h1) m1Var).I()) == null) {
            return;
        }
        com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.DeeplinkUriSpanHandler deeplinkUriSpanHandler = this.f135243b;
        if (com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(I.f473818g)) {
            return;
        }
        android.content.Context context = com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv));
        sb6.append(" : ");
        java.lang.String str2 = I.f473818g;
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        db5.t7.m123883x26a183b(context, sb6.toString(), 0).show();
    }
}
