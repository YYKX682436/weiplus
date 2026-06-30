package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2758x5f8b9e37;

/* renamed from: com.tencent.mm.ui.widget.edittext.PasterEditText */
/* loaded from: classes15.dex */
public class C22695xac2d47d6 extends android.widget.EditText {

    /* renamed from: d, reason: collision with root package name */
    public boolean f293609d;

    /* renamed from: e, reason: collision with root package name */
    public int f293610e;

    /* renamed from: f, reason: collision with root package name */
    public int f293611f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.CharSequence f293612g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.CharSequence f293613h;

    /* renamed from: i, reason: collision with root package name */
    public int f293614i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f293615m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f293616n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f293617o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f293618p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f293619q;

    public C22695xac2d47d6(android.content.Context context) {
        super(context);
        this.f293609d = false;
        this.f293610e = 0;
        this.f293611f = 0;
        this.f293612g = "";
        this.f293613h = "";
        this.f293614i = 0;
        this.f293615m = false;
        this.f293616n = "";
        this.f293617o = new java.util.ArrayList();
        this.f293618p = new java.util.LinkedList();
        this.f293619q = java.util.Collections.synchronizedList(new java.util.LinkedList());
        r();
    }

    private void r() {
        super.addTextChangedListener(new nl5.t(this));
        if (android.os.Build.VERSION.SDK_INT < 35 || !com.p314xaae8f345.mm.ui.b4.b(getContext())) {
            return;
        }
        setLocalePreferredLineHeightForMinimumUsed(false);
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(android.text.TextWatcher textWatcher) {
        this.f293618p.add(textWatcher);
    }

    public android.view.ViewParent g() {
        return getParent();
    }

    /* renamed from: getPasterContent */
    public java.lang.CharSequence m81965xf23b5f84() {
        return this.f293613h;
    }

    /* renamed from: getPasterLen */
    public int mo70737xc8d30aa0() {
        return this.f293614i;
    }

    /* renamed from: getSimilarPasteChange */
    public boolean m81966x8e20872e() {
        return this.f293615m;
    }

    /* renamed from: getSimilarPasteSeqStr */
    public java.lang.String m81967xa94aacd0() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 = 0; i17 < 3; i17++) {
            java.util.List list = this.f293617o;
            if (i17 >= list.size()) {
                break;
            }
            if (i17 != 0) {
                sb6.append(",");
            }
            sb6.append(list.get(i17));
        }
        return sb6.toString();
    }

    public void h() {
        requestLayout();
    }

    public int i() {
        return getWidth();
    }

    public boolean k() {
        return requestFocus();
    }

    @Override // android.widget.TextView
    public boolean onPrivateIMECommand(java.lang.String str, android.os.Bundle bundle) {
        return super.onPrivateIMECommand(str, bundle);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i17) {
        if (i17 != 16908322) {
            return i17 == 16908321 ? super.onTextContextMenuItem(i17) : super.onTextContextMenuItem(i17);
        }
        this.f293609d = true;
        return super.onTextContextMenuItem(i17);
    }

    public android.content.Context p() {
        return getContext();
    }

    public void q() {
        this.f293615m = false;
        this.f293617o.clear();
        this.f293616n = "";
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(android.text.TextWatcher textWatcher) {
        this.f293618p.remove(textWatcher);
    }

    public C22695xac2d47d6(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f293609d = false;
        this.f293610e = 0;
        this.f293611f = 0;
        this.f293612g = "";
        this.f293613h = "";
        this.f293614i = 0;
        this.f293615m = false;
        this.f293616n = "";
        this.f293617o = new java.util.ArrayList();
        this.f293618p = new java.util.LinkedList();
        this.f293619q = java.util.Collections.synchronizedList(new java.util.LinkedList());
        r();
    }

    public C22695xac2d47d6(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f293609d = false;
        this.f293610e = 0;
        this.f293611f = 0;
        this.f293612g = "";
        this.f293613h = "";
        this.f293614i = 0;
        this.f293615m = false;
        this.f293616n = "";
        this.f293617o = new java.util.ArrayList();
        this.f293618p = new java.util.LinkedList();
        this.f293619q = java.util.Collections.synchronizedList(new java.util.LinkedList());
        r();
    }
}
