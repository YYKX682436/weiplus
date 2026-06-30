package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p1955x625ef5e;

/* renamed from: com.tencent.mm.plugin.profile.logic.OpenIMKefuTalentPreference */
/* loaded from: classes3.dex */
public final class C16829x64afe2de extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public java.lang.String L;
    public final java.util.List M;
    public final java.util.List N;
    public android.view.View P;
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf Q;
    public r45.gk6 R;
    public android.view.View S;

    public C16829x64afe2de(android.content.Context context) {
        this(context, null);
        this.Q = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
    }

    public void M() {
        java.util.List list = this.M;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((android.widget.ImageView) it.next()).setVisibility(8);
        }
        java.util.List list2 = this.N;
        java.util.Iterator it6 = list2.iterator();
        while (it6.hasNext()) {
            ((android.widget.ImageView) it6.next()).setVisibility(8);
        }
        r45.gk6 gk6Var = this.R;
        for (int i17 = 0; i17 < gk6Var.m75941xfb821914(2).size() && i17 < ((java.util.LinkedList) list).size(); i17++) {
            android.widget.ImageView imageView = (android.widget.ImageView) ((java.util.LinkedList) list).get(i17);
            imageView.setVisibility(0);
            android.widget.ImageView imageView2 = (android.widget.ImageView) ((java.util.LinkedList) list2).get(i17);
            int m75939xb282bd08 = ((r45.ow6) gk6Var.m75941xfb821914(2).get(i17)).m75939xb282bd08(1);
            int i18 = m75939xb282bd08 == 1 ? com.p314xaae8f345.mm.R.raw.f80860xdd905cfe : m75939xb282bd08 == 2 ? com.p314xaae8f345.mm.R.raw.f80866x348b34 : (m75939xb282bd08 == 4 || m75939xb282bd08 == 5) ? com.p314xaae8f345.mm.R.raw.f79031x7a9612b8 : m75939xb282bd08 == 6 ? com.p314xaae8f345.mm.R.raw.f78564x58d9bd6 : 0;
            if (i18 != 0) {
                imageView2.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(imageView2.getContext(), i18, imageView2.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77918x9e227f16)));
                imageView2.setVisibility(0);
            } else {
                imageView2.setVisibility(8);
            }
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            java.lang.String url = ((r45.ow6) gk6Var.m75941xfb821914(2).get(i17)).m75945x2fec8307(2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
            mn2.g1 g1Var = mn2.g1.f411508a;
            g1Var.e().c(new mn2.q3(url, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), imageView, g1Var.h(mn2.f1.B));
        }
        android.view.View view = this.P;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/logic/OpenIMKefuTalentPreference", "updateAlbum", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/logic/OpenIMKefuTalentPreference", "updateAlbum", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf;
        super.t(view);
        java.util.LinkedList linkedList = (java.util.LinkedList) this.M;
        linkedList.clear();
        linkedList.add((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h9p));
        linkedList.add((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h9q));
        linkedList.add((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h9r));
        linkedList.add((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h9s));
        java.util.LinkedList linkedList2 = (java.util.LinkedList) this.N;
        linkedList2.clear();
        linkedList2.add((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.r_g));
        linkedList2.add((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.r_h));
        linkedList2.add((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.r_i));
        linkedList2.add((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.r_j));
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f564453rt);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.L)) {
            textView.setText(this.L);
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = i65.a.h(this.f279303d, com.p314xaae8f345.mm.R.C30860x5b28f31.f561319f7);
            textView.setLayoutParams(layoutParams);
        }
        this.P = view.findViewById(com.p314xaae8f345.mm.R.id.f564423qy);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.fuv);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.m38);
        int i17 = 0;
        while (true) {
            int size = linkedList.size();
            abstractActivityC21394xb3d2c0cf = this.Q;
            if (i17 >= size) {
                break;
            }
            ((android.widget.ImageView) linkedList.get(i17)).getLayoutParams().height = i65.a.b(abstractActivityC21394xb3d2c0cf, 48);
            i17++;
        }
        for (int i18 = 0; i18 < linkedList2.size(); i18++) {
            ((android.widget.ImageView) linkedList2.get(i18)).getLayoutParams().height = i65.a.b(abstractActivityC21394xb3d2c0cf, 12);
        }
        textView2.setText(this.R.m75945x2fec8307(0));
        textView2.setVisibility(0);
        M();
        android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams3 = layoutParams2 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams2 : null;
        android.view.ViewGroup.LayoutParams layoutParams4 = view.findViewById(com.p314xaae8f345.mm.R.id.k3k).getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams5 = layoutParams4 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams4 : null;
        android.view.ViewGroup.LayoutParams layoutParams6 = textView.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams7 = layoutParams6 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams6 : null;
        if (!this.R.m75941xfb821914(2).isEmpty()) {
            if (layoutParams3 != null) {
                layoutParams3.topMargin = i65.a.b(abstractActivityC21394xb3d2c0cf, 19);
                return;
            }
            return;
        }
        if (layoutParams3 != null) {
            layoutParams3.gravity = 16;
        }
        if (layoutParams5 != null) {
            layoutParams5.gravity = 16;
        }
        if (layoutParams7 != null) {
            layoutParams7.topMargin = 0;
            layoutParams7.gravity = 16;
        }
        android.view.View view2 = this.P;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/profile/logic/OpenIMKefuTalentPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/profile/logic/OpenIMKefuTalentPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        if (this.S == null) {
            android.view.View u17 = super.u(viewGroup);
            android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f279303d.getSystemService("layout_inflater");
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
            viewGroup2.removeAllViews();
            layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bze, viewGroup2);
            this.S = u17;
        }
        return this.S;
    }

    public C16829x64afe2de(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.Q = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
    }

    public C16829x64afe2de(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = "";
        this.M = new java.util.LinkedList();
        this.N = new java.util.LinkedList();
        this.R = null;
        this.Q = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        this.L = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cfj);
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
    }
}
