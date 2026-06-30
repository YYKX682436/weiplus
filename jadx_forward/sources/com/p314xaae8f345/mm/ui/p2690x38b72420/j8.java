package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes.dex */
public class j8 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f288501d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f288502e;

    public j8(android.content.Context context, java.lang.String str) {
        super(context);
        this.f288501d = context;
        this.f288502e = str;
        android.view.View inflate = android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.c8s, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.dgy);
        tf5.m.O6(inflate, 7);
        inflate.setOnClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.h8(this));
        findViewById.setOnTouchListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.i8(this));
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21522xf5a6e956 c21522xf5a6e956 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21522xf5a6e956) findViewById.findViewById(com.p314xaae8f345.mm.R.id.ajy);
        ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Ri(str, "openim_acct_type_icon", j41.a0.TYPE_URL);
        if (str.equals("cloudim")) {
            ((android.widget.ImageView) c21522xf5a6e956.m79176xc2a54588()).setImageResource(com.p314xaae8f345.mm.R.raw.f78580x755f843a);
        }
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dgz)).setText(((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Ri(str, "openim_acct_type_title", j41.a0.TYPE_WORDING));
    }
}
