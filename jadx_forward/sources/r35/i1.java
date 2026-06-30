package r35;

/* loaded from: classes9.dex */
public class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f450667a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 f450668b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f450669c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f450670d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.content.DialogInterface.OnDismissListener f450671e;

    public i1(android.content.Context context) {
        this.f450667a = context;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(context);
        this.f450668b = i0Var;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
        aVar.A = false;
        aVar.B = false;
        aVar.f293258o = new r35.h1(this);
    }

    public r35.i1 a(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 a17 = this.f450668b.a();
        this.f450669c = a17;
        android.content.DialogInterface.OnDismissListener onDismissListener = this.f450671e;
        if (onDismissListener != null) {
            a17.setOnDismissListener(onDismissListener);
        }
        r35.j1.d(this.f450667a, this.f450669c, this.f450670d, null, jVar, jVar);
        return this;
    }

    public r35.i1 b(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i iVar) {
        this.f450668b.f293354b.f293257n = iVar;
        return this;
    }

    public r35.i1 c(android.view.View view) {
        this.f450668b.f293354b.L = view;
        return this;
    }

    public r35.i1 d(android.graphics.Bitmap bitmap, int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = this.f450668b.f293354b;
        aVar.f293260q = bitmap;
        aVar.D = true;
        aVar.T = i17;
        aVar.C = false;
        aVar.H = new r35.x0(bitmap);
        return this;
    }

    public r35.i1 e(java.lang.String str) {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this.f450667a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bxv, (android.view.ViewGroup) null);
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9 abstractC10447x8c9cf7d9 = (com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9) inflate.findViewById(com.p314xaae8f345.mm.R.id.czc);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = this.f450668b;
        if (abstractC10447x8c9cf7d9 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMConfirmDialog", "Error , emoji imageView is null !!");
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMConfirmDialog", "Error , emoji msg path is null !!");
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 N = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(str);
            if (str.indexOf(47) == -1) {
                s25.a wi6 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi();
                h12.b0.a();
                ((y12.h) wi6).getClass();
                str = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.p(n22.m.g(), "", str);
            }
            if (N != null) {
                abstractC10447x8c9cf7d9.m43712xc040f7d2(N);
            } else {
                abstractC10447x8c9cf7d9.m64938x75cc54fa(str);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
            aVar.L = inflate;
            aVar.R = 1;
        }
        i0Var.f293354b.C = false;
        return this;
    }

    public r35.i1 f(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4, java.lang.String str) {
        android.content.Context context = this.f450667a;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bxv, (android.view.ViewGroup) null);
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10450x95592a7d c10450x95592a7d = (com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10450x95592a7d) inflate.findViewById(com.p314xaae8f345.mm.R.id.czc);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.dbk);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = this.f450668b;
        if (c10450x95592a7d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMConfirmDialog", "Error , emoji imageView is null !!");
        } else if (c21053xdbf1e5f4 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMConfirmDialog", "Error , emoji msg path is null !!");
        } else {
            if (!android.text.TextUtils.isEmpty(str)) {
                textView.setVisibility(0);
                textView.setText(java.lang.String.format(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.j5d), str));
            }
            c10450x95592a7d.m43712xc040f7d2(c21053xdbf1e5f4);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
            aVar.L = inflate;
            aVar.R = 1;
        }
        i0Var.f293354b.C = false;
        return this;
    }

    public r35.i1 g(java.lang.Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = this.f450668b;
        i0Var.f293354b.f293249f = booleanValue;
        if (bool.booleanValue()) {
            i0Var.f293354b.f293247d = this.f450667a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572471bb0);
        }
        return this;
    }

    public r35.i1 h(boolean z17) {
        this.f450668b.f293354b.C = z17;
        return this;
    }

    public r35.i1 i(java.lang.String str) {
        android.content.Context context = this.f450667a;
        i65.a.b(context, (int) (i65.a.q(context) * 14.0f));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f450668b.f293354b.f293263t = ((h12.b) ((k12.r) i95.n0.c(k12.r.class))).Ai(context, str.toString());
        }
        return this;
    }

    public r35.i1 j(int i17) {
        this.f450670d = this.f450667a.getResources().getString(i17);
        return this;
    }

    public void k() {
        this.f450669c.show();
    }

    public r35.i1 l(java.lang.Object obj) {
        android.content.Context context = this.f450667a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = this.f450668b;
        r35.j1.g(context, i0Var, obj);
        i0Var.f293354b.C = true;
        return this;
    }
}
