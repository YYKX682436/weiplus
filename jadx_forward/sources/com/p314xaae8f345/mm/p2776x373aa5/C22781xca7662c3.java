package com.p314xaae8f345.mm.p2776x373aa5;

/* renamed from: com.tencent.mm.view.CheckBoxLicenseView */
/* loaded from: classes.dex */
public class C22781xca7662c3 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.CompoundButton.OnCheckedChangeListener f294830d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View.OnClickListener f294831e;

    public C22781xca7662c3(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    /* renamed from: setCheckStateChangeListener */
    public void m82518x39051bcf(android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f294830d = onCheckedChangeListener;
        ((android.widget.CheckBox) findViewById(com.p314xaae8f345.mm.R.id.o2l)).setOnCheckedChangeListener(onCheckedChangeListener);
    }

    /* renamed from: setLicenseClickListener */
    public void m82519xfb972f1d(android.view.View.OnClickListener onClickListener) {
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.o2o);
        this.f294831e = onClickListener;
        textView.setOnClickListener(onClickListener);
    }

    /* renamed from: setTermText */
    public void m82520x3020863b(java.lang.CharSequence charSequence) {
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.o2o)).setText(charSequence);
    }

    /* renamed from: setTermTip */
    public void m82521x5c6425cd(java.lang.CharSequence charSequence) {
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.o2n)).setText(charSequence);
    }

    public C22781xca7662c3(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.view.View inflate = android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570200zw, this);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.o2k);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) inflate.findViewById(com.p314xaae8f345.mm.R.id.o2l);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.o2o);
        findViewById.setOnClickListener(new ym5.v(this, checkBox));
        android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f294830d;
        if (onCheckedChangeListener != null) {
            checkBox.setOnCheckedChangeListener(onCheckedChangeListener);
        }
        android.view.View.OnClickListener onClickListener = this.f294831e;
        if (onClickListener != null) {
            textView.setOnClickListener(onClickListener);
        }
    }
}
