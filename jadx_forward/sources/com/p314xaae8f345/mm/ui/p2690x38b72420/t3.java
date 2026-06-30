package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class t3 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f288723d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f288724e;

    public t3(android.content.Context context, java.lang.String str) {
        super(context);
        this.f288723d = context;
        this.f288724e = str;
        android.view.View inflate = android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570272a90, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.dgy);
        tf5.m.O6(inflate, 14);
        inflate.setOnClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.r3(this));
        findViewById.setOnTouchListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.s3(this));
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 q17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).q(str);
        if (q17 == null || ((int) q17.E2) <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EnterpriseBizViewItem", "contact is null, %s", str);
            return;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21522xf5a6e956 c21522xf5a6e956 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21522xf5a6e956) findViewById.findViewById(com.p314xaae8f345.mm.R.id.ajy);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) c21522xf5a6e956.m79176xc2a54588(), str, null);
        if (q17.f1() == 0) {
            c21522xf5a6e956.m79177x8a98093d(null);
        } else if (c01.n8.b() != null) {
            java.lang.String b17 = ((xf4.d) c01.n8.b()).b(q17.f1(), false);
            if (b17 != null) {
                c21522xf5a6e956.b(r01.y1.a(b17, 1.5f), db5.r8.SUBSCRIPT_DRAWABLE_DIRECTION_BOTTOM_RIGHT);
            } else {
                c21522xf5a6e956.m79177x8a98093d(null);
            }
        } else {
            c21522xf5a6e956.m79177x8a98093d(null);
        }
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dgz)).setText(q17.f2());
    }
}
