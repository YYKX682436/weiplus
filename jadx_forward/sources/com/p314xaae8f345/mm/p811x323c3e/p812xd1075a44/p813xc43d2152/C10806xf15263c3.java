package com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152;

/* renamed from: com.tencent.mm.kiss.widget.textview.PLSysTextView */
/* loaded from: classes4.dex */
public class C10806xf15263c3 extends com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10809x1fa3433f {
    public C10806xf15263c3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10809x1fa3433f
    public void e() {
    }

    @Override // com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10809x1fa3433f
    public void g() {
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (m46351x2a87da53() != null) {
            m46351x2a87da53().f410134a = false;
        }
    }

    @Override // com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10809x1fa3433f, android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10809x1fa3433f, p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375, android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
    }

    @Override // com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10809x1fa3433f, android.widget.TextView
    public void setText(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(charSequence)) {
            return;
        }
        if (m46351x2a87da53() != null && m46351x2a87da53().f410134a) {
            mm0.c.f410108b.c(m46350x1456a638(), m46351x2a87da53());
        }
        mm0.g b17 = mm0.c.f410108b.b(m46350x1456a638(), charSequence);
        if (b17 != null) {
            m46355x7dcbdcb9(b17);
        } else {
            h(charSequence, false);
        }
    }

    public C10806xf15263c3(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
