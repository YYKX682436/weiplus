package hj2;

/* loaded from: classes10.dex */
public abstract class a extends gi2.c {
    @Override // gi2.c
    public void b(java.util.ArrayList viewList, gi2.d adapter, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1507xaf968b71.C14233xcca2a527 c14233xcca2a527) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 parent = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950) c14233xcca2a527;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewList, "viewList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        java.lang.Object obj = viewList.get(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        android.view.View view = (android.view.View) obj;
        f(view, adapter, 0);
        h(parent, view, viewList.size());
        i(view, parent, viewList, adapter);
    }

    public final void g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 parent, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.ViewParent parent2 = parent.getBottomLinkSpace().getParent();
        android.view.ViewGroup viewGroup = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
        if (viewGroup != null) {
            viewGroup.removeView(parent.getBottomLinkSpace());
        }
        android.view.View bottomLinkSpace = parent.getBottomLinkSpace();
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-1, 1);
        layoutParams.f92428i = i17;
        layoutParams.f92418d = 0;
        layoutParams.setMargins(0, i18, 0, 0);
        parent.addView(bottomLinkSpace, layoutParams);
    }

    public abstract void h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950, android.view.View view, int i17);

    public abstract void i(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950, java.util.ArrayList arrayList, gi2.d dVar);
}
