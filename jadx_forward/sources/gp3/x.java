package gp3;

/* loaded from: classes3.dex */
public class x extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.view.View L;
    public android.view.View.OnClickListener M;
    public java.lang.String N;
    public android.view.View.OnClickListener P;
    public java.util.List Q;

    public x(android.content.Context context) {
        super(context);
        this.L = null;
        this.M = null;
        this.P = null;
        this.Q = new java.util.LinkedList();
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.bwn;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View p(android.view.View view, android.view.ViewGroup viewGroup) {
        if (this.L == null) {
            this.L = u(viewGroup);
        }
        t(this.L);
        return this.L;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        android.content.Context context;
        super.t(view);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.j_g);
        linearLayout.removeAllViews();
        if (this.Q == null) {
            return;
        }
        int size = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.N) || this.P == null) ? this.Q.size() - 1 : this.Q.size();
        if (size == 0) {
            size = -1;
        }
        int i17 = 0;
        int i18 = 0;
        while (true) {
            int size2 = this.Q.size();
            context = this.f279303d;
            if (i17 >= size2) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16773xeeea2670 c16773xeeea2670 = (com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16773xeeea2670) this.Q.get(i17);
            android.widget.TextView textView = new android.widget.TextView(context);
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            textView.setTextSize(0, i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
            textView.setIncludeFontPadding(false);
            textView.setText(c16773xeeea2670.f234310d);
            textView.setTag(c16773xeeea2670);
            textView.setGravity(17);
            textView.setOnClickListener(this.M);
            if (i18 == size) {
                textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560739su));
            }
            linearLayout.addView(textView, new android.widget.LinearLayout.LayoutParams(0, -2, 1.0f));
            if (i18 < size) {
                android.view.View view2 = new android.view.View(context);
                view2.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a4m));
                linearLayout.addView(view2, new android.widget.LinearLayout.LayoutParams(i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561172be), -1));
            }
            i18++;
            i17++;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.N) || this.P == null) {
            return;
        }
        android.widget.TextView textView2 = new android.widget.TextView(context);
        textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        textView2.setTextSize(0, i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
        textView2.setIncludeFontPadding(false);
        textView2.setText(this.N);
        textView2.setGravity(17);
        textView2.setOnClickListener(this.P);
        if (i18 == size) {
            textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560739su));
        }
        linearLayout.addView(textView2, new android.widget.LinearLayout.LayoutParams(0, -2, 1.0f));
    }
}
