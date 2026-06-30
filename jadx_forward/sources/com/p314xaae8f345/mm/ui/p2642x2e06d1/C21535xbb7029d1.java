package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.VoiceSearchEditText */
/* loaded from: classes8.dex */
public class C21535xbb7029d1 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.C22669xa5de5760 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f279257d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f279258e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View.OnClickListener f279259f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f279260g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f279261h;

    /* renamed from: i, reason: collision with root package name */
    public android.content.Context f279262i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f279263m;

    public C21535xbb7029d1(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f279257d = getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.b9v);
        this.f279258e = getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.ayf);
        this.f279260g = true;
        this.f279261h = false;
        this.f279263m = false;
        c(context);
    }

    public static void a(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21535xbb7029d1 c21535xbb7029d1) {
        if (c21535xbb7029d1.getText().toString().equals("") && c21535xbb7029d1.f279261h) {
            c21535xbb7029d1.f279260g = true;
            c21535xbb7029d1.setCompoundDrawables(null, c21535xbb7029d1.getCompoundDrawables()[1], c21535xbb7029d1.f279257d, c21535xbb7029d1.getCompoundDrawables()[3]);
            return;
        }
        if (c21535xbb7029d1.getText().toString().length() <= 0) {
            c21535xbb7029d1.f279260g = false;
            c21535xbb7029d1.setCompoundDrawables(null, c21535xbb7029d1.getCompoundDrawables()[1], null, c21535xbb7029d1.getCompoundDrawables()[3]);
        } else {
            c21535xbb7029d1.setCompoundDrawables(null, c21535xbb7029d1.getCompoundDrawables()[1], c21535xbb7029d1.f279258e, c21535xbb7029d1.getCompoundDrawables()[3]);
        }
    }

    public final void b() {
        this.f279260g = true;
        if (this.f279261h) {
            setCompoundDrawables(null, getCompoundDrawables()[1], this.f279257d, getCompoundDrawables()[3]);
        } else {
            if (getText().toString().length() <= 0) {
                setCompoundDrawables(null, getCompoundDrawables()[1], null, getCompoundDrawables()[3]);
                return;
            }
            setCompoundDrawables(null, getCompoundDrawables()[1], this.f279258e, getCompoundDrawables()[3]);
        }
    }

    public final void c(android.content.Context context) {
        this.f279262i = context;
        this.f279261h = false;
        android.graphics.drawable.Drawable drawable = this.f279257d;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        android.graphics.drawable.Drawable drawable2 = this.f279258e;
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        b();
        setOnTouchListener(new db5.p9(this));
        addTextChangedListener(new db5.q9(this));
        setOnFocusChangeListener(new db5.r9(this));
        if (context instanceof android.app.Activity) {
            android.view.View currentFocus = ((android.app.Activity) context).getCurrentFocus();
            if (currentFocus == null || currentFocus != this) {
                this.f279263m = false;
            } else {
                this.f279263m = true;
            }
        }
        requestFocus();
    }

    /* renamed from: setNeedIcon */
    public void m79299xaa269cb1(boolean z17) {
    }

    /* renamed from: setOnContentClearListener */
    public void m79300x70d9b9a9(db5.s9 s9Var) {
    }

    /* renamed from: setOnSearchClickListener */
    public void m79301x1ccefdf3(android.view.View.OnClickListener onClickListener) {
        this.f279259f = onClickListener;
        this.f279261h = true;
        b();
    }

    public C21535xbb7029d1(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f279257d = getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.b9v);
        this.f279258e = getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.ayf);
        this.f279260g = true;
        this.f279261h = false;
        this.f279263m = false;
        c(context);
    }
}
