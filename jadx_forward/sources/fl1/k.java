package fl1;

/* loaded from: classes7.dex */
public class k extends fl1.b {
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21467xa0ba12ff X;
    public android.widget.LinearLayout Y;

    public k(android.content.Context context, java.util.List list, java.lang.String str, java.lang.String str2, fl1.f fVar) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576326wf);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        str = str == null ? "" : str;
        java.util.ArrayList arrayList = list instanceof java.util.ArrayList ? (java.util.ArrayList) list : new java.util.ArrayList(list);
        if (arrayList == null || arrayList.size() <= 0) {
            throw new java.lang.IllegalArgumentException("scopeInfoList is empty or null");
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569540e9, (android.view.ViewGroup) null);
        setContentView(viewGroup);
        l01.d0.f396294a.a((android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.a17), str2, com.p314xaae8f345.mm.R.C30861xcebc809e.cbh, l01.q0.f396320d);
        ((android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.a1p)).setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ghf, str));
        this.X = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21467xa0ba12ff) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f564828a81);
        this.X.setAdapter((android.widget.ListAdapter) new fl1.i(arrayList));
        if (arrayList.size() > 5) {
            this.X.f278765d = arrayList.size();
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.a8b);
            this.Y = linearLayout;
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.height = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a4b);
            this.Y.setLayoutParams(layoutParams);
        }
        ((android.widget.Button) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.ioc)).setOnClickListener(new fl1.c(this, arrayList, fVar, this));
        ((android.widget.Button) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.ipb)).setOnClickListener(new fl1.d(this, arrayList, fVar, this));
        setCanceledOnTouchOutside(false);
        setOnCancelListener(new fl1.e(this, fVar));
    }
}
