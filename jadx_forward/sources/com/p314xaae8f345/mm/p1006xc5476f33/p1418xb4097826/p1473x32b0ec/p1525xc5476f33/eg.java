package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class eg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ we2.p f193942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f193943e;

    public eg(we2.p pVar, dk2.zf zfVar) {
        this.f193942d = pVar;
        this.f193943e = zfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$updateBottomMsg$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l e17 = this.f193942d.e(this.f193943e);
        if (e17 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$updateBottomMsg$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
