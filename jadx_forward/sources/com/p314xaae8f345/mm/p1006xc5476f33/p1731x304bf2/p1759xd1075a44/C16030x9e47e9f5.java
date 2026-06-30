package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1759xd1075a44;

/* renamed from: com.tencent.mm.plugin.game.widget.AutoResizeTextView */
/* loaded from: classes15.dex */
public class C16030x9e47e9f5 extends android.widget.TextView implements s53.d {

    /* renamed from: d, reason: collision with root package name */
    public s53.e f223456d;

    public C16030x9e47e9f5(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, 0);
    }

    public final void a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        s53.e eVar = new s53.e(this);
        if (attributeSet != null) {
            int i18 = (int) eVar.f484706e;
            float f17 = eVar.f484708g;
            eVar.d(0, i18);
            if (eVar.f484708g != f17) {
                eVar.f484708g = f17;
                eVar.a();
            }
        }
        eVar.c(true);
        if (eVar.f484711j == null) {
            eVar.f484711j = new java.util.ArrayList();
        }
        eVar.f484711j.add(this);
        this.f223456d = eVar;
    }

    /* renamed from: getAutofitHelper */
    public s53.e m64834x2c404a9a() {
        return this.f223456d;
    }

    /* renamed from: getMaxTextSize */
    public float m64835x1725e71c() {
        return this.f223456d.f484707f;
    }

    /* renamed from: getMinTextSize */
    public float m64836xeec51a0a() {
        return this.f223456d.f484706e;
    }

    /* renamed from: getPrecision */
    public float m64837xad66a5c8() {
        return this.f223456d.f484708g;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        s53.e eVar = this.f223456d;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setLines(int i17) {
        super.setLines(i17);
        s53.e eVar = this.f223456d;
        if (eVar == null || eVar.f484705d == i17) {
            return;
        }
        eVar.f484705d = i17;
        eVar.a();
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i17) {
        super.setMaxLines(i17);
        s53.e eVar = this.f223456d;
        if (eVar == null || eVar.f484705d == i17) {
            return;
        }
        eVar.f484705d = i17;
        eVar.a();
    }

    /* renamed from: setMaxTextSize */
    public void m64838xad8b5a90(float f17) {
        s53.e eVar = this.f223456d;
        android.content.Context context = eVar.f484702a.getContext();
        android.content.res.Resources system = android.content.res.Resources.getSystem();
        if (context != null) {
            system = context.getResources();
        }
        float applyDimension = android.util.TypedValue.applyDimension(2, f17, system.getDisplayMetrics());
        if (applyDimension != eVar.f484707f) {
            eVar.f484707f = applyDimension;
            eVar.a();
        }
    }

    /* renamed from: setMinTextSize */
    public void m64839x852a8d7e(int i17) {
        this.f223456d.d(2, i17);
    }

    /* renamed from: setPrecision */
    public void m64840x9ba663c(float f17) {
        s53.e eVar = this.f223456d;
        if (eVar.f484708g != f17) {
            eVar.f484708g = f17;
            eVar.a();
        }
    }

    /* renamed from: setSizeToFit */
    public void m64841x78bf69d3(boolean z17) {
        this.f223456d.c(z17);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i17, float f17) {
        super.setTextSize(i17, f17);
        s53.e eVar = this.f223456d;
        if (eVar == null || eVar.f484710i) {
            return;
        }
        android.content.Context context = eVar.f484702a.getContext();
        android.content.res.Resources system = android.content.res.Resources.getSystem();
        if (context != null) {
            system = context.getResources();
        }
        float applyDimension = android.util.TypedValue.applyDimension(i17, f17, system.getDisplayMetrics());
        if (eVar.f484704c != applyDimension) {
            eVar.f484704c = applyDimension;
        }
    }

    public C16030x9e47e9f5(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context, attributeSet, i17);
    }
}
