package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905;

/* loaded from: classes10.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.C22721xaf9ba7f3 f294005a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f294006b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.h f294007c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f294008d = new android.os.Handler();

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View.OnClickListener f294009e = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.c(this);

    public i(android.app.Activity activity, int i17) {
        android.view.View findViewById = activity.findViewById(android.R.id.content);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) activity.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById;
        layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.coa, viewGroup);
        a(viewGroup, layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cob, viewGroup, false), i17, activity);
    }

    public final void a(android.view.ViewGroup viewGroup, android.view.View view, int i17, android.content.Context context) {
        if (viewGroup == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.C22721xaf9ba7f3 c22721xaf9ba7f3 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.C22721xaf9ba7f3) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.n19);
        this.f294005a = c22721xaf9ba7f3;
        if (c22721xaf9ba7f3 == null) {
            this.f294005a = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.C22721xaf9ba7f3(viewGroup);
        }
        this.f294006b = view;
        if (i17 == 36) {
            this.f294005a.setOnTouchListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.e(this));
        }
        ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.n18)).setOnClickListener(this.f294009e);
        boolean f17 = com.p314xaae8f345.mm.ui.bl.f(context);
        int c17 = com.p314xaae8f345.mm.ui.bl.c(context);
        com.p314xaae8f345.mm.ui.yk.c("MicroMsg.SnackBar", "snackbar:isNavBarVisibility : %B,navBarHeightd:%d", java.lang.Boolean.valueOf(f17), java.lang.Integer.valueOf(c17));
        int i18 = ((android.app.Activity) context).getWindow().getAttributes().flags;
        boolean z17 = i18 == (((-134217729) & i18) | 134217728);
        com.p314xaae8f345.mm.ui.yk.c("MicroMsg.SnackBar", "snackbar:isNavBarTranslucent : %B", java.lang.Boolean.valueOf(z17));
        if (z17 && f17) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.n17);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
            marginLayoutParams.bottomMargin = c17;
            linearLayout.setLayoutParams(marginLayoutParams);
        }
    }

    public i(android.content.Context context, android.view.View view, int i17) {
        if (view == null && (context instanceof android.app.Activity)) {
            view = ((android.app.Activity) context).findViewById(android.R.id.content);
        }
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.coa, viewGroup);
        a(viewGroup, layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cob, viewGroup, false), i17, context);
    }
}
