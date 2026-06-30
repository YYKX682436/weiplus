package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes.dex */
public final class s3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f147998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.v75 f147999e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148000f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148001g;

    public s3(android.content.Context context, int i17, int i18, r45.v75 v75Var, java.lang.String str, java.lang.String str2) {
        this.f147998d = context;
        this.f147999e = v75Var;
        this.f148000f = str;
        this.f148001g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(this.f147998d, 1, false);
        k0Var.f293405n = new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q3(1001, 1000);
        k0Var.f293414s = new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r3(1001, this.f147999e, this.f147998d, 1000, this.f148000f, this.f148001g);
        k0Var.v();
    }
}
