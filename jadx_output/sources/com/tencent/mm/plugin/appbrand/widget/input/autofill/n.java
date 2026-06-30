package com.tencent.mm.plugin.appbrand.widget.input.autofill;

/* loaded from: classes15.dex */
public class n implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ListView f91346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.autofill.o f91347e;

    public n(com.tencent.mm.plugin.appbrand.widget.input.autofill.o oVar, android.widget.ListView listView, int i17) {
        this.f91347e = oVar;
        this.f91346d = listView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.plugin.appbrand.widget.input.autofill.v vVar;
        com.tencent.mm.plugin.appbrand.widget.input.t4 t4Var;
        android.view.View inputPanel;
        int i17;
        this.f91346d.getViewTreeObserver().removeOnPreDrawListener(this);
        com.tencent.mm.plugin.appbrand.widget.input.autofill.o oVar = this.f91347e;
        com.tencent.mm.plugin.appbrand.widget.input.autofill.s sVar = oVar.f91349b;
        if (sVar.b() && (vVar = sVar.f91292d) != null && vVar.getAdapter() != null && sVar.f91292d.getAdapter().getCount() > 0 && (inputPanel = (t4Var = oVar.f91348a).getInputPanel()) != null) {
            int b17 = i65.a.b(t4Var.getContext(), 8);
            int height = sVar.f91292d.getChildAt(0).getHeight();
            int count = sVar.f91292d.getAdapter().getCount() * height;
            int i18 = b17 * 2;
            int i19 = count + i18;
            int i27 = (height * 3) + i18;
            if (i19 > i27) {
                i17 = i27 - i18;
                i19 = i27;
            } else {
                i17 = count;
            }
            sVar.f91293e = i19;
            int[] iArr = new int[2];
            com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var = (com.tencent.mm.plugin.appbrand.widget.input.e4) t4Var;
            e4Var.getView().getLocationInWindow(iArr);
            int height2 = iArr[1] + e4Var.getView().getHeight();
            inputPanel.getLocationInWindow(iArr);
            oVar.a(height2, iArr[1], height, i17, b17);
            sVar.c();
            oVar.f91352e = sVar.f91296h ? sVar.f91295g : 0;
        }
        return true;
    }
}
