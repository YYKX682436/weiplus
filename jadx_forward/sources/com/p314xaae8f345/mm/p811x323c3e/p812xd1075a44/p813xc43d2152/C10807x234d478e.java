package com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152;

/* renamed from: com.tencent.mm.kiss.widget.textview.PLTextView */
/* loaded from: classes4.dex */
public class C10807x234d478e extends com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10808xd74620 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f150013e;

    public C10807x234d478e(android.content.Context context) {
        super(context);
        this.f150013e = true;
    }

    @Override // com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10808xd74620
    public void c() {
    }

    @Override // com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10808xd74620
    public void d() {
    }

    public void g(java.lang.CharSequence charSequence) {
    }

    public void h(java.lang.CharSequence charSequence) {
        f(charSequence, false);
    }

    @Override // com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10808xd74620, android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (m46321x2a87da53() != null) {
            m46321x2a87da53().f410134a = false;
        }
    }

    @Override // com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10808xd74620, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10808xd74620, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
    }

    /* renamed from: setIsNeedLayoutCache */
    public void m46317xb2b3936(boolean z17) {
        this.f150013e = z17;
    }

    @Override // com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10808xd74620
    /* renamed from: setText */
    public void mo46318x765074af(java.lang.CharSequence charSequence) {
        setContentDescription(charSequence);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(charSequence)) {
            return;
        }
        if (!this.f150013e) {
            h(charSequence);
            return;
        }
        if (m46321x2a87da53() != null && m46321x2a87da53().f410134a) {
            mm0.c.f410108b.c(m46319x1456a638(), m46321x2a87da53());
        }
        mm0.g b17 = mm0.c.f410108b.b(m46319x1456a638(), charSequence);
        if (b17 == null) {
            h(charSequence);
        } else {
            g(charSequence);
            m46348x7dcbdcb9(b17);
        }
    }

    public C10807x234d478e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f150013e = true;
    }

    public C10807x234d478e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f150013e = true;
    }
}
