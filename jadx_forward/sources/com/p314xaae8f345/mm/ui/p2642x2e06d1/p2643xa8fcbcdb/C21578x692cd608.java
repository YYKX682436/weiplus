package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* renamed from: com.tencent.mm.ui.base.preference.TextPreference */
/* loaded from: classes11.dex */
public class C21578x692cd608 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public int L;
    public java.lang.CharSequence M;
    public android.widget.TextView N;
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.t0 P;

    public C21578x692cd608(android.content.Context context) {
        this(context, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(android.R.id.title);
        this.N = textView;
        if (textView != null) {
            textView.setText(this.M);
            this.N.setGravity(this.L);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.t0 t0Var = this.P;
        if (t0Var != null) {
            android.widget.TextView textView2 = this.N;
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.l1 l1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.l1) t0Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0 e0Var = l1Var.f235054d;
            e0Var.f234953d.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21578x692cd608 c21578x692cd608 = l1Var.f235051a;
            android.widget.TextView textView3 = c21578x692cd608.N;
            if (textView3 != null) {
                c21578x692cd608.M = l1Var.f235052b;
                c21578x692cd608.L = 17;
                textView3.setGravity(17);
            }
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = e0Var.f234953d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("https://www.wechat.com/tpl/oversea/new/page/difference_of_users/index");
            ((ke0.e) xVar).sj(abstractActivityC21394xb3d2c0cf, arrayList, l1Var.f235052b, l1Var.f235053c, textView2);
        }
        view.setImportantForAccessibility(android.text.TextUtils.isEmpty(this.N.getText()) ? 4 : 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        return super.u(viewGroup);
    }

    public C21578x692cd608(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.c0d;
    }
}
