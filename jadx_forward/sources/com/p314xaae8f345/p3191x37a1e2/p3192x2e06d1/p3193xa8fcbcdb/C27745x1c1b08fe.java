package com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb;

/* renamed from: com.tencent.weui.base.preference.CheckBoxPreference */
/* loaded from: classes3.dex */
public class C27745x1c1b08fe extends android.preference.Preference {

    /* renamed from: d, reason: collision with root package name */
    public boolean f301633d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f301634e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f301635f;

    /* renamed from: g, reason: collision with root package name */
    public int f301636g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f301637h;

    /* renamed from: i, reason: collision with root package name */
    public int f301638i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f301639m;

    public C27745x1c1b08fe(android.content.Context context) {
        this(context, null);
    }

    public boolean h() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = this.f301634e;
        return viewOnClickListenerC22631x1cc07cc8 != null ? viewOnClickListenerC22631x1cc07cc8.f292896x : this.f301633d;
    }

    public void i(int i17) {
        this.f301638i = i17;
        android.widget.TextView textView = this.f301635f;
        if (textView != null) {
            textView.setVisibility(i17);
        }
    }

    public void j(boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = this.f301634e;
        if (viewOnClickListenerC22631x1cc07cc8 != null) {
            this.f301633d = z17;
            viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(z17);
        }
    }

    @Override // android.preference.Preference
    public void onBindView(android.view.View view) {
        super.onBindView(view);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) view.findViewById(com.p314xaae8f345.mm.R.id.btf);
        this.f301634e = viewOnClickListenerC22631x1cc07cc8;
        viewOnClickListenerC22631x1cc07cc8.m81396xb3e0a10a(new ex5.a(this));
        this.f301634e.m81392x52cfa5c6(this.f301633d);
        if (!isEnabled()) {
            this.f301634e.setEnabled(false);
            ((android.widget.TextView) view.findViewById(android.R.id.title)).setTextColor(view.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560253fb));
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.o_v);
        this.f301635f = textView;
        java.lang.String str = this.f301637h;
        int i17 = this.f301636g;
        this.f301636g = i17;
        this.f301637h = str;
        if (textView != null) {
            if (i17 > 0) {
                textView.setBackgroundResource(i17);
            }
            if (!android.text.TextUtils.isEmpty(this.f301637h)) {
                this.f301635f.setText(this.f301637h);
            }
        }
        i(this.f301638i);
    }

    @Override // android.preference.Preference
    public android.view.View onCreateView(android.view.ViewGroup viewGroup) {
        android.view.View onCreateView = super.onCreateView(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) onCreateView.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570830c13, viewGroup2);
        this.f301639m = onCreateView;
        return onCreateView;
    }

    public C27745x1c1b08fe(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C27745x1c1b08fe(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f301633d = false;
        this.f301636g = -1;
        this.f301637h = "";
        this.f301638i = 8;
        setLayoutResource(com.p314xaae8f345.mm.R.C30864xbddafb2a.byv);
    }
}
