package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes13.dex */
public final class b3 implements p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4 f147715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147716b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147717c;

    public b3(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4 c4Var, java.lang.String str, java.lang.String str2) {
        this.f147715a = c4Var;
        this.f147716b = str;
        this.f147717c = str2;
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b
    public void a(java.lang.Object obj) {
        p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.C0059x32c0ac2c c0059x32c0ac2c = (p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.C0059x32c0ac2c) obj;
        android.content.Intent intent = c0059x32c0ac2c.f90576e;
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4 c4Var = this.f147715a;
        java.lang.String str = c4Var.f147740d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("downloadEmoticon: purchase ");
        int i17 = c0059x32c0ac2c.f90575d;
        sb6.append(i17);
        sb6.append(", data:");
        sb6.append(c0059x32c0ac2c.f90576e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (i17 != -1 || intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("key_err_code", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c4Var.f147740d, "downloadEmoticon: purchase " + intExtra + "; " + intent.getStringExtra("key_err_msg"));
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_response_product_ids");
        intent.getStringArrayListExtra("key_response_series_ids");
        java.lang.String str2 = this.f147717c;
        java.lang.String str3 = this.f147716b;
        if (intExtra != 0) {
            if (intExtra != 100000002) {
                return;
            }
            gm0.j1.n().f354821b.g(new z12.l(str3, "", str2, null));
            return;
        }
        if (stringArrayListExtra == null || !stringArrayListExtra.contains(str3)) {
            return;
        }
        gm0.j1.n().f354821b.g(new z12.l(str3, "", str2, null));
    }
}
