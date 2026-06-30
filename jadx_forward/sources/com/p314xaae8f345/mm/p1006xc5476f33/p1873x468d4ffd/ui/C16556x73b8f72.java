package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.VideoSeekBarEditorView */
/* loaded from: classes10.dex */
public class C16556x73b8f72 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4 f230792d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f230793e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f230794f;

    public C16556x73b8f72(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public final void a(android.content.Context context) {
        this.f230792d = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4) findViewById(com.p314xaae8f345.mm.R.id.p0o);
        this.f230793e = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.d6s);
        this.f230794f = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.d6w);
    }

    public void b() {
        this.f230792d.g();
        android.view.ViewParent parent = this.f230792d.getParent();
        if (parent instanceof android.widget.LinearLayout) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) parent;
            int indexOfChild = linearLayout.indexOfChild(this.f230792d);
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f230792d.getLayoutParams();
            linearLayout.removeView(this.f230792d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4 c16538x58704dc4 = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4(getContext());
            this.f230792d = c16538x58704dc4;
            linearLayout.addView(c16538x58704dc4, indexOfChild, layoutParams);
        }
    }

    /* renamed from: setCancelButtonClickListener */
    public void m66977x7379a92e(android.view.View.OnClickListener onClickListener) {
        this.f230793e.setOnClickListener(onClickListener);
    }

    /* renamed from: setFinishButtonClickListener */
    public void m66978x190f7a75(android.view.View.OnClickListener onClickListener) {
        this.f230794f.setOnClickListener(onClickListener);
    }

    /* renamed from: setTextColor */
    public void m66979x1c5c5ff4(java.lang.String str) {
        if (str != null) {
            this.f230794f.setTextColor(android.graphics.Color.parseColor(str));
        }
    }

    public C16556x73b8f72(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context);
    }
}
