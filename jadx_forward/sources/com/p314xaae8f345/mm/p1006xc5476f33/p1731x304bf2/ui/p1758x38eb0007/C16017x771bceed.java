package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007;

/* renamed from: com.tencent.mm.plugin.game.ui.message.TabItemView */
/* loaded from: classes8.dex */
public class C16017x771bceed extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f223040d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f223041e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f223042f;

    public C16017x771bceed(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.d2.f220973c);
        java.lang.String string = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bh8, (android.view.ViewGroup) this, true);
        this.f223041e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nv7);
        this.f223042f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nv6);
        this.f223041e.setText(string);
        if (i65.a.D(getContext())) {
            this.f223041e.setTextSize(0, i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561334fm) * i65.a.m(getContext()));
            this.f223042f.setTextSize(0, i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561366gi) * i65.a.m(getContext()));
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z17) {
        if (!z17) {
            this.f223041e.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560406jj));
            return;
        }
        this.f223041e.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        this.f223042f.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.i1 Ai = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai();
        int i17 = this.f223040d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 j17 = Ai.j();
        if (j17 != null && j17.f68480x991217c == i17) {
            Ai.e();
        }
    }

    /* renamed from: setShowType */
    public void m64815x6260b659(int i17) {
        this.f223040d = i17;
    }

    /* renamed from: setUnreadCount */
    public void m64816x30659cde(int i17) {
        if (i17 <= 0) {
            this.f223042f.setVisibility(8);
            return;
        }
        this.f223042f.setVisibility(0);
        if (i17 < 100) {
            this.f223042f.setText(java.lang.String.valueOf(i17));
        } else {
            this.f223042f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.foi);
        }
    }

    public C16017x771bceed(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context, attributeSet);
    }
}
