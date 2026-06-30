package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e;

/* loaded from: classes15.dex */
public class e implements android.widget.NumberPicker.OnValueChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22707x360c2c f293801a;

    public e(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22707x360c2c c22707x360c2c) {
        this.f293801a = c22707x360c2c;
    }

    @Override // android.widget.NumberPicker.OnValueChangeListener
    public void onValueChange(android.widget.NumberPicker numberPicker, int i17, int i18) {
        android.widget.NumberPicker numberPicker2;
        android.widget.NumberPicker numberPicker3;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22707x360c2c c22707x360c2c = this.f293801a;
        int i19 = c22707x360c2c.f293750f;
        if (i19 >= 0 && i19 <= 23) {
            int i27 = c22707x360c2c.f293751g;
            if ((i27 >= 0 && i27 <= 59) && (numberPicker3 = c22707x360c2c.f293748d) != null && c22707x360c2c.f293749e != null) {
                if (numberPicker3.getValue() == i19) {
                    c22707x360c2c.f293749e.setMinValue(i27);
                } else {
                    c22707x360c2c.f293749e.setMinValue(0);
                }
            }
        }
        int i28 = c22707x360c2c.f293752h;
        if (!(i28 >= 0 && i28 <= 23) || (numberPicker2 = c22707x360c2c.f293748d) == null || c22707x360c2c.f293749e == null) {
            return;
        }
        if (numberPicker2.getValue() == i28) {
            c22707x360c2c.f293749e.setMaxValue(c22707x360c2c.f293753i);
        } else {
            c22707x360c2c.f293749e.setMaxValue(59);
        }
    }
}
