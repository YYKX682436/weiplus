package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* renamed from: com.tencent.mm.ui.base.preference.IconSwitchKeyValuePreference */
/* loaded from: classes8.dex */
public class C21551x7269e8da extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 {
    public android.widget.TextView Y1;
    public int Z1;

    public C21551x7269e8da(android.content.Context context) {
        this(context, null);
    }

    public final void h0() {
        if (this.Y1 == null) {
            return;
        }
        android.content.Context context = this.f279303d;
        int d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 2.0f);
        this.Y1.setTextColor(com.p314xaae8f345.mm.ui.p2740x696c9db.gd.a(context));
        int i17 = this.Z1;
        if (i17 == 0) {
            this.Y1.setCompoundDrawablesWithIntrinsicBounds(com.p314xaae8f345.mm.R.raw.f81151x88e3ba46, 0, 0, 0);
            this.Y1.setCompoundDrawablePadding(d17);
        } else if (i17 == 1) {
            this.Y1.setCompoundDrawablesWithIntrinsicBounds(com.p314xaae8f345.mm.R.raw.f81149x5eb5c37f, 0, 0, 0);
            this.Y1.setCompoundDrawablePadding(d17);
        } else if (i17 != 2) {
            this.Y1.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else {
            this.Y1.setCompoundDrawablesWithIntrinsicBounds(com.p314xaae8f345.mm.R.raw.f81150xbf46c8af, 0, 0, 0);
            this.Y1.setCompoundDrawablePadding(d17);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        this.Y1 = (android.widget.TextView) view.findViewById(android.R.id.summary);
        h0();
    }

    public C21551x7269e8da(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C21551x7269e8da(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.Z1 = 0;
    }
}
