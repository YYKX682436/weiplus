package com.p314xaae8f345.mm.ui.p2747xd1075a44;

/* renamed from: com.tencent.mm.ui.widget.MMNumberCheckbox */
/* loaded from: classes10.dex */
public class C22625xc06c7fec extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0081x8bc951a6 {

    /* renamed from: e, reason: collision with root package name */
    public int f292859e;

    public C22625xc06c7fec(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: getNumber */
    public int m81373x276ffe3f() {
        return this.f292859e;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z17) {
        int i17;
        super.setChecked(z17);
        if (z17 && (i17 = this.f292859e) > 0 && !java.lang.String.valueOf(i17).contentEquals(getText())) {
            setText(java.lang.String.valueOf(this.f292859e));
        }
        if (z17) {
            return;
        }
        this.f292859e = 0;
        setText("");
    }

    /* renamed from: setCheckedNumber */
    public void m81374xdcc208e(int i17) {
        if (i17 <= 0 || i17 == this.f292859e) {
            return;
        }
        this.f292859e = i17;
        setText(java.lang.String.valueOf(i17));
        setChecked(true);
    }

    /* renamed from: setNumber */
    public void m81375x1aa5324b(int i17) {
        if (this.f292859e > 0) {
            this.f292859e = i17;
        }
    }

    public C22625xc06c7fec(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
