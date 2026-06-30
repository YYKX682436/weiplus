package com.tencent.mm.plugin.appbrand.widget.input.numberpad;

/* loaded from: classes7.dex */
public class BaseNumberKeyboardView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f91557d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f91558e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f91559f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f91560g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f91561h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f91562i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f91563m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f91564n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f91565o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Button f91566p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Button f91567q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.Button f91568r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageButton f91569s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.EditText f91570t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f91571u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f91572v;

    public BaseNumberKeyboardView(android.content.Context context) {
        super(context);
        this.f91557d = 0;
        b(context);
    }

    public void a() {
        this.f91572v = true;
        this.f91558e.setTextColor(getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
        this.f91558e.setBackgroundResource(com.tencent.mm.R.drawable.f480853e7);
        this.f91559f.setTextColor(getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
        this.f91559f.setBackgroundResource(com.tencent.mm.R.drawable.f480853e7);
        this.f91560g.setTextColor(getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
        this.f91560g.setBackgroundResource(com.tencent.mm.R.drawable.f480853e7);
        this.f91561h.setTextColor(getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
        this.f91561h.setBackgroundResource(com.tencent.mm.R.drawable.f480853e7);
        this.f91562i.setTextColor(getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
        this.f91562i.setBackgroundResource(com.tencent.mm.R.drawable.f480853e7);
        this.f91563m.setTextColor(getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
        this.f91563m.setBackgroundResource(com.tencent.mm.R.drawable.f480853e7);
        this.f91564n.setTextColor(getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
        this.f91564n.setBackgroundResource(com.tencent.mm.R.drawable.f480853e7);
        this.f91565o.setTextColor(getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
        this.f91565o.setBackgroundResource(com.tencent.mm.R.drawable.f480853e7);
        this.f91566p.setTextColor(getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
        this.f91566p.setBackgroundResource(com.tencent.mm.R.drawable.f480853e7);
        this.f91567q.setTextColor(getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
        this.f91567q.setBackgroundResource(com.tencent.mm.R.drawable.b5h);
        this.f91568r.setTextColor(getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
        this.f91568r.setBackgroundResource(com.tencent.mm.R.drawable.f480853e7);
        this.f91569s.setBackgroundResource(com.tencent.mm.R.drawable.b5h);
        this.f91571u.findViewById(com.tencent.mm.R.id.root_view).setBackgroundResource(com.tencent.mm.R.color.BW_BG_100);
        this.f91571u.findViewById(com.tencent.mm.R.id.divider1).setBackgroundResource(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1);
        this.f91571u.findViewById(com.tencent.mm.R.id.divider2).setBackgroundResource(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1);
        this.f91571u.findViewById(com.tencent.mm.R.id.divider3).setBackgroundResource(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1);
        this.f91571u.findViewById(com.tencent.mm.R.id.divider4).setBackgroundResource(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1);
        this.f91571u.findViewById(com.tencent.mm.R.id.divider5).setBackgroundResource(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1);
        this.f91571u.findViewById(com.tencent.mm.R.id.divider6).setBackgroundResource(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1);
        this.f91571u.findViewById(com.tencent.mm.R.id.divider7).setBackgroundResource(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1);
        this.f91571u.findViewById(com.tencent.mm.R.id.divider8).setBackgroundResource(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1);
        this.f91571u.findViewById(com.tencent.mm.R.id.divider9).setBackgroundResource(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1);
        this.f91571u.findViewById(com.tencent.mm.R.id.divider10).setBackgroundResource(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1);
        this.f91571u.findViewById(com.tencent.mm.R.id.divider11).setBackgroundResource(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1);
        this.f91571u.findViewById(com.tencent.mm.R.id.divider12).setBackgroundResource(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1);
        this.f91571u.findViewById(com.tencent.mm.R.id.f484107d10).setBackgroundResource(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1);
    }

    public final void b(android.content.Context context) {
        context.getApplicationContext();
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488145ie, (android.view.ViewGroup) this, true);
        this.f91571u = inflate;
        this.f91558e = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.tenpay_keyboard_1);
        this.f91559f = (android.widget.Button) this.f91571u.findViewById(com.tencent.mm.R.id.tenpay_keyboard_2);
        this.f91560g = (android.widget.Button) this.f91571u.findViewById(com.tencent.mm.R.id.tenpay_keyboard_3);
        this.f91561h = (android.widget.Button) this.f91571u.findViewById(com.tencent.mm.R.id.tenpay_keyboard_4);
        this.f91562i = (android.widget.Button) this.f91571u.findViewById(com.tencent.mm.R.id.tenpay_keyboard_5);
        this.f91563m = (android.widget.Button) this.f91571u.findViewById(com.tencent.mm.R.id.tenpay_keyboard_6);
        this.f91564n = (android.widget.Button) this.f91571u.findViewById(com.tencent.mm.R.id.tenpay_keyboard_7);
        this.f91565o = (android.widget.Button) this.f91571u.findViewById(com.tencent.mm.R.id.tenpay_keyboard_8);
        this.f91566p = (android.widget.Button) this.f91571u.findViewById(com.tencent.mm.R.id.tenpay_keyboard_9);
        this.f91567q = (android.widget.Button) this.f91571u.findViewById(com.tencent.mm.R.id.tenpay_keyboard_x);
        this.f91568r = (android.widget.Button) this.f91571u.findViewById(com.tencent.mm.R.id.tenpay_keyboard_0);
        this.f91569s = (android.widget.ImageButton) this.f91571u.findViewById(com.tencent.mm.R.id.tenpay_keyboard_d);
        nl1.a aVar = new nl1.a(this);
        this.f91558e.setContentDescription("1");
        this.f91559f.setContentDescription("2");
        this.f91560g.setContentDescription("3");
        this.f91561h.setContentDescription("4");
        this.f91562i.setContentDescription("5");
        this.f91563m.setContentDescription("6");
        this.f91564n.setContentDescription("7");
        this.f91565o.setContentDescription("8");
        this.f91566p.setContentDescription("9");
        this.f91568r.setContentDescription("0");
        this.f91567q.setContentDescription("字母X");
        this.f91569s.setContentDescription("删除");
        this.f91558e.setOnClickListener(aVar);
        this.f91559f.setOnClickListener(aVar);
        this.f91560g.setOnClickListener(aVar);
        this.f91561h.setOnClickListener(aVar);
        this.f91562i.setOnClickListener(aVar);
        this.f91563m.setOnClickListener(aVar);
        this.f91564n.setOnClickListener(aVar);
        this.f91565o.setOnClickListener(aVar);
        this.f91566p.setOnClickListener(aVar);
        this.f91567q.setOnClickListener(aVar);
        this.f91568r.setOnClickListener(aVar);
        this.f91569s.setOnClickListener(aVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setInputEditText(android.widget.EditText editText) {
        if (editText != null) {
            this.f91570t = editText;
            int imeOptions = editText.getImeOptions();
            java.lang.CharSequence imeActionLabel = this.f91570t.getImeActionLabel();
            if (!android.text.TextUtils.isEmpty(imeActionLabel)) {
                this.f91567q.setText(imeActionLabel);
            }
            if (imeOptions != 1) {
                return;
            }
            this.f91557d = 0;
            if (android.text.TextUtils.isEmpty(imeActionLabel)) {
                this.f91567q.setText("");
            }
        }
    }

    public void setSecureAccessibility(android.view.View.AccessibilityDelegate accessibilityDelegate) {
        this.f91568r.setAccessibilityDelegate(accessibilityDelegate);
        this.f91558e.setAccessibilityDelegate(accessibilityDelegate);
        this.f91559f.setAccessibilityDelegate(accessibilityDelegate);
        this.f91560g.setAccessibilityDelegate(accessibilityDelegate);
        this.f91561h.setAccessibilityDelegate(accessibilityDelegate);
        this.f91562i.setAccessibilityDelegate(accessibilityDelegate);
        this.f91563m.setAccessibilityDelegate(accessibilityDelegate);
        this.f91564n.setAccessibilityDelegate(accessibilityDelegate);
        this.f91565o.setAccessibilityDelegate(accessibilityDelegate);
        this.f91566p.setAccessibilityDelegate(accessibilityDelegate);
        this.f91567q.setAccessibilityDelegate(accessibilityDelegate);
        this.f91569s.setAccessibilityDelegate(accessibilityDelegate);
    }

    public void setXMode(int i17) {
        this.f91557d = i17;
        if (i17 == 0) {
            this.f91567q.setText("");
            if (this.f91572v) {
                this.f91567q.setBackgroundResource(com.tencent.mm.R.color.f478690e7);
                return;
            } else {
                this.f91567q.setBackgroundResource(com.tencent.mm.R.color.f478687e4);
                return;
            }
        }
        if (i17 == 1) {
            this.f91567q.setText("X");
            if (this.f91572v) {
                this.f91567q.setBackgroundResource(com.tencent.mm.R.drawable.b5h);
                return;
            } else {
                this.f91567q.setBackgroundResource(com.tencent.mm.R.drawable.b5g);
                return;
            }
        }
        if (i17 != 2) {
            this.f91557d = 0;
            return;
        }
        this.f91567q.setText(".");
        if (this.f91572v) {
            this.f91567q.setBackgroundResource(com.tencent.mm.R.drawable.b5h);
        } else {
            this.f91567q.setBackgroundResource(com.tencent.mm.R.drawable.b5g);
        }
    }

    public BaseNumberKeyboardView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f91557d = 0;
        b(context);
    }
}
