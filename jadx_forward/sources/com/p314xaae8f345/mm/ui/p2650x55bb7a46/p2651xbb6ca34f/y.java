package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f;

/* loaded from: classes12.dex */
public class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.z f279987d;

    public y(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.z zVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.a0 a0Var) {
        this.f279987d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.z zVar = this.f279987d;
        boolean z17 = !zVar.f279992h.isChecked();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.r4 r4Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p4.f282798a;
        int f17 = r4Var.f();
        android.widget.CheckBox checkBox = zVar.f279992h;
        if (f17 < 9) {
            checkBox.setChecked(z17);
        } else if (!z17) {
            checkBox.setChecked(z17);
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.a0 a0Var = zVar.f279995n;
        if (a0Var.f279926p != null) {
            int intValue = ((java.lang.Integer) view.getTag()).intValue();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.w x17 = a0Var.x(intValue);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.g3 g3Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.g3) a0Var.f279926p;
            g3Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[onCheck] isChecked :%s pos:%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(intValue));
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3 n3Var = g3Var.f283761a;
            if (!z17 || r4Var.f() < 9) {
                if (z17) {
                    r4Var.a(x17.f279980b);
                } else {
                    r4Var.e(x17.f279980b);
                }
                zb5.g gVar = n3Var.f283889d;
                int f18 = r4Var.f();
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21789x2eb4d316 viewOnClickListenerC21789x2eb4d316 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21789x2eb4d316) gVar;
                viewOnClickListenerC21789x2eb4d316.mo54450xbf7c1df6(viewOnClickListenerC21789x2eb4d316.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fjy, java.lang.Integer.valueOf(f18)));
                viewOnClickListenerC21789x2eb4d316.T6(f18);
            } else {
                android.content.Context context = n3Var.f283891f;
                dp.a.m125854x26a183b(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fjk, 9), 1).show();
                n3Var.f283894i.m8147xed6e4d18(intValue);
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
