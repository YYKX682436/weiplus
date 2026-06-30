package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui;

/* renamed from: com.tencent.mm.plugin.location.ui.ShareHeader */
/* loaded from: classes5.dex */
public class C16289x539f232c extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f226191d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f226192e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21502xd5f766ad f226193f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21502xd5f766ad f226194g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f226195h;

    public C16289x539f232c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f226191d = context;
        a();
    }

    public final void a() {
        android.view.View inflate = android.view.View.inflate(this.f226191d, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570992cn2, this);
        this.f226192e = (android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.gy8);
        this.f226193f = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21502xd5f766ad) inflate.findViewById(com.p314xaae8f345.mm.R.id.ocq);
        this.f226194g = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21502xd5f766ad) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568876od2);
        this.f226195h = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.obc);
    }

    /* renamed from: getHeaderBar */
    public android.view.ViewGroup m65947xf2b66b90() {
        return this.f226192e;
    }

    /* renamed from: setOnLeftClickListener */
    public void m65948xe30c61b4(android.view.View.OnClickListener onClickListener) {
        this.f226193f.setOnClickListener(onClickListener);
    }

    /* renamed from: setOnRightClickListener */
    public void m65949x205c3d61(android.view.View.OnClickListener onClickListener) {
        this.f226194g.setOnClickListener(onClickListener);
    }

    /* renamed from: setTitle */
    public void m65950x53bfe316(java.lang.String str) {
        this.f226195h.setText(str);
    }

    /* renamed from: setTitleColor */
    public void m65951xb124d9ed(int i17) {
        this.f226195h.setTextColor(i17);
    }

    public C16289x539f232c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f226191d = context;
        a();
    }
}
