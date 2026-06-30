package rf4;

/* loaded from: classes4.dex */
public final class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18482x82fd8d8f f476614d;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18482x82fd8d8f c18482x82fd8d8f) {
        this.f476614d = c18482x82fd8d8f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/story/ui/view/StoryCommentView$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rf4.h2 h2Var = this.f476614d.H;
        boolean z17 = true;
        int i17 = h2Var.f476596d + 1;
        h2Var.f476596d = i17;
        if ((i17 != 1 || h2Var.f476595c != null) && i17 != 2 && i17 != 3) {
            z17 = false;
        }
        if (z17) {
            h2Var.a();
        }
        java.lang.Runnable runnable = h2Var.f476598f;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(runnable);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(runnable, h2Var.f476597e);
        yj0.a.h(this, "com/tencent/mm/plugin/story/ui/view/StoryCommentView$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
