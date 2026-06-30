package lp;

/* loaded from: classes12.dex */
public class s implements q25.a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f401776a = 0;

    static {
        q25.b.b(new lp.s(), "//version");
    }

    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(java.lang.String.format("[ver  ] %s %08X\n", com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.b(context, o45.wf.f424562g, true), java.lang.Integer.valueOf(o45.wf.f424562g)));
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.a());
        sb6.append(java.lang.String.format("[cid  ] %d\n", java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b)));
        sb6.append(java.lang.String.format("[s.ver] %d\n", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(0))));
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(1));
        ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).getClass();
        com.p314xaae8f345.p3210x3857dc.f1 f1Var = com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.f301722m;
        sb6.append(java.lang.String.format("[l.ver] %d %s\n", valueOf, com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS));
        sb6.append(java.lang.String.format("[w.ver] %d\n", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(3))));
        sb6.append(java.lang.String.format("[b.ver] %d\n", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(2))));
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).getClass();
        sb6.append(java.lang.String.format("[ts.ver] %d\n", java.lang.Long.valueOf(bk4.i.a().o())));
        sb6.append(java.lang.String.format("[r.ver] %s\n", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g));
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setText(sb6);
        textView.setGravity(19);
        textView.setTextSize(1, 10.0f);
        textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        textView.setTypeface(android.graphics.Typeface.MONOSPACE);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        db5.e1.q(context, null, textView, null);
        return true;
    }
}
