package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p1955x625ef5e;

/* renamed from: com.tencent.mm.plugin.profile.logic.OpenIMPreference */
/* loaded from: classes9.dex */
public class C16830x9f0fd089 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21554xcdf33ced {

    /* renamed from: p1, reason: collision with root package name */
    public final java.lang.String f235056p1;

    /* renamed from: x1, reason: collision with root package name */
    public j41.e0 f235057x1;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f235058y1;

    public C16830x9f0fd089(android.content.Context context) {
        super(context);
        this.f235056p1 = "MicroMsg.OpenIMPreference";
        this.f235057x1 = null;
        this.f235058y1 = false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21554xcdf33ced, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        j41.e0 e0Var = this.f235057x1;
        if (e0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f235056p1, "onBindView detail null");
            return;
        }
        android.widget.TextView textView = this.L;
        if (textView != null) {
            int i17 = e0Var.f379155d;
            if (i17 == 2 || i17 == 3) {
                textView.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColorStateList(com.p314xaae8f345.mm.R.C30859x5a72f63.a0x));
            }
        }
        if (this.Y == null || android.text.TextUtils.isEmpty(this.f235057x1.f379152a)) {
            return;
        }
        this.Y.setVisibility(0);
        n11.a.b().g(this.f235057x1.f379152a, this.Y);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.Y.getLayoutParams();
        int i18 = this.f235057x1.f379157f;
        layoutParams.width = i18 > 0 ? com.p314xaae8f345.mm.ui.zk.a(this.f279303d, i18) : com.p314xaae8f345.mm.ui.zk.a(this.f279303d, 16);
        int i19 = this.f235057x1.f379158g;
        layoutParams.height = i19 > 0 ? com.p314xaae8f345.mm.ui.zk.a(this.f279303d, i19) : com.p314xaae8f345.mm.ui.zk.a(this.f279303d, 16);
        this.Y.setLayoutParams(layoutParams);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21554xcdf33ced, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        this.Q = true;
        if (!this.f235058y1) {
            return super.u(viewGroup);
        }
        android.view.View u17 = super.u(viewGroup);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f279303d.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bzl, viewGroup2);
        return u17;
    }

    public C16830x9f0fd089(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f235056p1 = "MicroMsg.OpenIMPreference";
        this.f235057x1 = null;
        this.f235058y1 = false;
    }

    public C16830x9f0fd089(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f235056p1 = "MicroMsg.OpenIMPreference";
        this.f235057x1 = null;
        this.f235058y1 = false;
    }
}
