package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb;

/* renamed from: com.tencent.mm.pluginsdk.ui.preference.FinderRecentLikePreference */
/* loaded from: classes3.dex */
public final class C19706x749e0873 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public final java.lang.String L;
    public final java.util.List M;
    public r45.qw6 N;
    public android.view.View P;

    public C19706x749e0873(android.content.Context context) {
        this(context, null);
    }

    public void M() {
        java.util.List list = this.M;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((android.widget.ImageView) it.next()).setVisibility(8);
        }
        r45.qw6 qw6Var = this.N;
        if (qw6Var != null) {
            int size = qw6Var.m75941xfb821914(1).size();
            for (int i17 = 0; i17 < size && i17 < ((java.util.LinkedList) list).size(); i17++) {
                android.widget.ImageView imageView = (android.widget.ImageView) ((java.util.LinkedList) list).get(i17);
                imageView.setVisibility(0);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d8.f183625a.d(qw6Var.m75941xfb821914(1).get(i17), imageView);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        java.util.List list = this.M;
        ((java.util.LinkedList) list).clear();
        ((java.util.LinkedList) list).add((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h9p));
        ((java.util.LinkedList) list).add((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h9q));
        ((java.util.LinkedList) list).add((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h9r));
        ((java.util.LinkedList) list).add((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h9s));
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f564453rt);
        java.lang.String str = this.L;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            textView.setText(str);
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = i65.a.h(this.f279303d, com.p314xaae8f345.mm.R.C30860x5b28f31.f561319f7);
            textView.setLayoutParams(layoutParams);
        }
        M();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        if (this.P == null) {
            android.view.View u17 = super.u(viewGroup);
            android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f279303d.getSystemService("layout_inflater");
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
            viewGroup2.removeAllViews();
            layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bze, viewGroup2);
            this.P = u17;
        }
        return this.P;
    }

    public C19706x749e0873(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C19706x749e0873(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = "";
        this.M = new java.util.LinkedList();
        this.N = null;
        this.L = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572773cg3);
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
    }
}
