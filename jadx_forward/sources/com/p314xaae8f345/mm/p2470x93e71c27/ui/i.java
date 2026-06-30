package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes4.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e f272398d;

    public i(com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e abstractC19633xb84f839e) {
        this.f272398d = abstractC19633xb84f839e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/AbstractVideoView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e abstractC19633xb84f839e = this.f272398d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(abstractC19633xb84f839e.f271272e, "%s seek bar play button on click ", abstractC19633xb84f839e.N());
        if (abstractC19633xb84f839e.f271281q != null) {
            if (abstractC19633xb84f839e.mo61531xc00617a4()) {
                abstractC19633xb84f839e.mo48231x65825f6();
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(abstractC19633xb84f839e.f271281q.getF256131m())) {
                abstractC19633xb84f839e.mo48238x68ac462();
            } else {
                abstractC19633xb84f839e.mo48232x348b34();
            }
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/AbstractVideoView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
