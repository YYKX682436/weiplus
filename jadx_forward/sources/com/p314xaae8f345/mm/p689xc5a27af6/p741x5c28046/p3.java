package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes.dex */
public final class p3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4 f147965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147966e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f147967f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f147968g;

    public p3(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4 c4Var, java.lang.String str, int i17, android.content.Context context) {
        this.f147965d = c4Var;
        this.f147966e = str;
        this.f147967f = i17;
        this.f147968g = context;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        int i18 = this.f147967f;
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4 c4Var = this.f147965d;
        java.lang.String str = this.f147966e;
        if (itemId != 0) {
            if (itemId != 1) {
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 Ai = c4Var.Ai(str, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12789, 3, Ai.mo42933xb5885648(), 2, Ai.f68657xb76d85ab, Ai.f68663x861009b5, "", java.lang.Integer.valueOf(i18), "", "", Ai.f68641x3342accf);
            ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().r(this.f147968g, Ai, 1000043, -1, true, false, null, null, null);
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 Ai2 = c4Var.Ai(str, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12789, 1, Ai2.mo42933xb5885648(), 2, Ai2.f68657xb76d85ab, Ai2.f68663x861009b5, "", java.lang.Integer.valueOf(i18), "", "", Ai2.f68641x3342accf);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Retr_File_Name", str);
        intent.putExtra("Retr_Msg_Type", 5);
        int i19 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.H1;
        intent.setClass(this.f147968g, com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
        android.content.Context context = this.f147968g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/emoji/EmoticonJsApiService$showBottomSheet$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/emoji/EmoticonJsApiService$showBottomSheet$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
