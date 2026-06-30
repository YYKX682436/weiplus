package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameFeedTitleDescView */
/* loaded from: classes5.dex */
public class C15968xce00ec5e extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f222367d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f222368e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f222369f;

    public C15968xce00ec5e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a(java.lang.String str, java.lang.String str2, java.util.LinkedList linkedList) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            this.f222369f.setVisibility(8);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                this.f222367d.setVisibility(8);
            } else {
                this.f222367d.setText(str);
                this.f222367d.setVisibility(0);
            }
        } else {
            this.f222369f.setVisibility(0);
            while (this.f222369f.getChildCount() < linkedList.size() + 1) {
                android.widget.ImageView imageView = new android.widget.ImageView(getContext());
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561368gk), getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561368gk));
                layoutParams.setMargins(0, 0, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561362ge), 0);
                layoutParams.gravity = 16;
                imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
                this.f222369f.addView(imageView, 0, layoutParams);
            }
            int i17 = 0;
            while (i17 < linkedList.size()) {
                m53.m0 m0Var = (m53.m0) linkedList.get(i17);
                android.widget.ImageView imageView2 = (android.widget.ImageView) this.f222369f.getChildAt(i17);
                r53.y a17 = r53.y.a();
                java.lang.String str3 = m0Var.f405423d;
                a17.getClass();
                r53.v vVar = new r53.v();
                vVar.f474238c = true;
                a17.e(imageView2, str3, vVar.a(), null);
                imageView2.setVisibility(0);
                i17++;
            }
            while (i17 < this.f222369f.getChildCount() - 1) {
                int i18 = i17 + 1;
                android.view.View childAt = this.f222369f.getChildAt(i17);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameFeedTitleDescView", "setData", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(childAt, "com/tencent/mm/plugin/game/ui/GameFeedTitleDescView", "setData", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                i17 = i18;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                ((android.widget.TextView) this.f222369f.getChildAt(i17)).setText(str);
            }
            this.f222367d.setVisibility(8);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            this.f222368e.setVisibility(8);
        } else {
            this.f222368e.setText(str2);
            this.f222368e.setVisibility(0);
        }
        if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? (char) 0 : this.f222367d.getPaint().measureText(str) > ((float) ((r53.f.h(getContext()) - ((android.view.ViewGroup) getParent()).getPaddingLeft()) - ((android.view.ViewGroup) getParent()).getPaddingRight())) ? (char) 2 : (char) 1) > 1) {
            this.f222368e.setMaxLines(1);
        } else {
            this.f222368e.setMaxLines(2);
        }
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570680bg2, (android.view.ViewGroup) this, true);
        this.f222369f = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.ovb);
        this.f222367d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.obc);
        this.f222368e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
    }
}
