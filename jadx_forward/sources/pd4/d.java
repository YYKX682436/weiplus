package pd4;

/* loaded from: classes3.dex */
public abstract class d {
    public static final void a(android.view.ViewStub viewStub, android.view.View view, android.view.ViewGroup.LayoutParams param) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replaceView", "com.tencent.mm.plugin.sns.ui.item.improve.view.ViewStubExtensionKt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewStub, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewStub.getParent();
        if (viewGroup == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceView", "com.tencent.mm.plugin.sns.ui.item.improve.view.ViewStubExtensionKt");
            return;
        }
        int indexOfChild = viewGroup.indexOfChild(viewStub);
        viewGroup.removeViewAt(indexOfChild);
        viewGroup.addView(view, indexOfChild, param);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceView", "com.tencent.mm.plugin.sns.ui.item.improve.view.ViewStubExtensionKt");
    }
}
