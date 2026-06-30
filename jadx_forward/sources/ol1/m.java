package ol1;

/* loaded from: classes7.dex */
public class m implements ol1.o {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f427667d;

    /* renamed from: e, reason: collision with root package name */
    public int f427668e;

    public m(android.content.Context context) {
        this.f427667d = new ol1.l(this, context);
    }

    @Override // ol1.o
    /* renamed from: getPanelView */
    public android.view.View mo133172xa7118813() {
        return this.f427667d;
    }

    @Override // ol1.o
    public boolean l() {
        return false;
    }

    @Override // ol1.o
    public boolean n(int i17) {
        if (i17 <= 0 || this.f427668e == i17) {
            return false;
        }
        this.f427668e = i17;
        return true;
    }

    @Override // ol1.o
    public void o() {
        android.view.View view = this.f427667d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/input/panel/IKeyboardPanel$DefaultPanelImpl", "showContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/input/panel/IKeyboardPanel$DefaultPanelImpl", "showContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ol1.o
    /* renamed from: onDestroy */
    public void mo133173xac79a11b() {
    }

    @Override // ol1.o
    /* renamed from: onPause */
    public void mo133174xb01dfb57() {
    }

    @Override // ol1.o
    /* renamed from: onResume */
    public void mo133175x57429eec() {
    }

    @Override // ol1.o
    public void p(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u4
    public boolean q() {
        return true;
    }

    @Override // ol1.o
    public void r(boolean z17) {
    }

    @Override // ol1.o
    public void s(boolean z17) {
        android.view.View view = this.f427667d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/input/panel/IKeyboardPanel$DefaultPanelImpl", "hideContentView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/input/panel/IKeyboardPanel$DefaultPanelImpl", "hideContentView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ol1.o
    /* renamed from: setOnEmoticonOperationListener */
    public void mo133178x23b81e74(ol1.t tVar) {
    }

    @Override // ol1.o
    /* renamed from: setOnTextOperationListener */
    public void mo133180x5e04422d(ol1.u uVar) {
    }

    @Override // ol1.o
    public boolean t() {
        return this.f427667d.isInLayout();
    }
}
