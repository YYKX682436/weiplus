package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* loaded from: classes11.dex */
public class f implements android.widget.RadioGroup.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21543x24f4657c f279332a;

    public f(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21543x24f4657c c21543x24f4657c) {
        this.f279332a = c21543x24f4657c;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.RadioGroup radioGroup, int i17) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21543x24f4657c c21543x24f4657c = this.f279332a;
        if (c21543x24f4657c.S != null) {
            if (i17 != -1) {
                c21543x24f4657c.N = "" + ((java.lang.Object) c21543x24f4657c.R[i17 - 1048576]);
            } else {
                c21543x24f4657c.N = null;
            }
            c21543x24f4657c.P = i17;
            c21543x24f4657c.S.a(c21543x24f4657c, c21543x24f4657c.N);
        }
    }
}
