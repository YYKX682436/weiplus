package qp5;

/* loaded from: classes9.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f447367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f447368e;

    public d(com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f447367d = viewOnFocusChangeListenerC22907xe18534c2;
        this.f447368e = abstractActivityC21394xb3d2c0cf;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wallet_core/ui/formview/CommonHintViewConfig$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = this.f447367d;
        viewOnFocusChangeListenerC22907xe18534c2.getContext();
        int i17 = c01.z1.I() ? com.p314xaae8f345.mm.R.C30864xbddafb2a.d7v : com.p314xaae8f345.mm.R.C30864xbddafb2a.d68;
        viewOnFocusChangeListenerC22907xe18534c2.getContext();
        qp5.y.b(this.f447368e, i17, c01.z1.I() ? com.p314xaae8f345.mm.R.C30867xcad56011.khy : com.p314xaae8f345.mm.R.C30867xcad56011.khv);
        yj0.a.h(this, "com/tencent/mm/wallet_core/ui/formview/CommonHintViewConfig$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
