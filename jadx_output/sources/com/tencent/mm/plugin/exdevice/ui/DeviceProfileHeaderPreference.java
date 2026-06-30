package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes15.dex */
public class DeviceProfileHeaderPreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.widget.ImageView L;
    public android.widget.TextView M;
    public android.widget.TextView N;
    public android.widget.TextView P;
    public android.view.View Q;
    public android.widget.TextView R;
    public final boolean[] S;
    public final android.view.View.OnClickListener[] T;
    public java.lang.String U;
    public java.lang.String V;
    public java.lang.CharSequence W;
    public java.lang.String X;

    public DeviceProfileHeaderPreference(android.content.Context context) {
        super(context);
        this.S = new boolean[6];
        this.T = new android.view.View.OnClickListener[6];
    }

    public final void M(android.view.View view, int i17) {
        int i18 = this.S[i17] ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/exdevice/ui/DeviceProfileHeaderPreference", "attachToView", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/exdevice/ui/DeviceProfileHeaderPreference", "attachToView", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setOnClickListener(this.T[i17]);
    }

    public void N(java.lang.String str) {
        this.X = str;
        if (this.L != null) {
            o11.f fVar = new o11.f();
            android.graphics.Bitmap c07 = com.tencent.mm.sdk.platformtools.x.c0(com.tencent.mm.R.drawable.f481413bi1);
            if (c07 != null && !c07.isRecycled() && (c07 = com.tencent.mm.sdk.platformtools.x.s0(c07, true, c07.getWidth() * 0.5f)) != null && !c07.isRecycled()) {
                fVar.f342092p = new android.graphics.drawable.BitmapDrawable(c07);
            }
            if (c07 == null || c07.isRecycled()) {
                fVar.f342091o = com.tencent.mm.R.drawable.f481413bi1;
            }
            fVar.f342096t = true;
            n11.a.b().h(this.X, this.L, fVar.a());
        }
    }

    public void O(int i17, android.view.View.OnClickListener onClickListener) {
        android.view.View view;
        if (i17 == 0) {
            view = this.L;
        } else if (i17 == 1) {
            view = this.N;
        } else if (i17 == 2) {
            view = this.M;
        } else if (i17 == 3) {
            view = this.P;
        } else if (i17 == 4) {
            view = this.Q;
        } else if (i17 != 5) {
            return;
        } else {
            view = this.R;
        }
        this.T[i17] = onClickListener;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public void Q(int i17, boolean z17) {
        android.view.View view;
        if (i17 == 0) {
            view = this.L;
        } else if (i17 == 1) {
            view = this.N;
        } else if (i17 == 2) {
            view = this.M;
        } else if (i17 == 3) {
            view = this.P;
        } else if (i17 == 4) {
            view = this.Q;
        } else if (i17 != 5) {
            return;
        } else {
            view = this.R;
        }
        this.S[i17] = !z17;
        if (view != null) {
            int i18 = z17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/exdevice/ui/DeviceProfileHeaderPreference", "setViewVisible", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/exdevice/ui/DeviceProfileHeaderPreference", "setViewVisible", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        this.L = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.a9n);
        this.M = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.k3h);
        this.N = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.d5u);
        this.P = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cwt);
        this.Q = view.findViewById(com.tencent.mm.R.id.d5v);
        this.R = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cws);
        M(this.L, 0);
        M(this.M, 2);
        M(this.N, 1);
        M(this.P, 3);
        M(this.Q, 4);
        M(this.R, 5);
        this.M.setText(this.W);
        this.P.setText(this.V);
        this.R.setText(this.U);
        N(this.X);
        super.t(view);
    }

    public DeviceProfileHeaderPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.S = new boolean[6];
        this.T = new android.view.View.OnClickListener[6];
    }

    public DeviceProfileHeaderPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.S = new boolean[6];
        this.T = new android.view.View.OnClickListener[6];
    }
}
