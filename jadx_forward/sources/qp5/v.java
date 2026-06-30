package qp5;

/* loaded from: classes9.dex */
public class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public int f447386d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f447387e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f447388f;

    public v(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2) {
        this.f447387e = abstractActivityC21394xb3d2c0cf;
        this.f447388f = viewOnFocusChangeListenerC22907xe18534c2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wallet_core/ui/formview/FormViewUtil$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f447387e;
        abstractActivityC21394xb3d2c0cf.mo48674x36654fab();
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) {
            ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) abstractActivityC21394xb3d2c0cf).mo48632xd46dd964();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o oVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o(abstractActivityC21394xb3d2c0cf);
        oVar.g(true, true, false);
        oVar.f293840n = new qp5.u(this, oVar);
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        oVar.d(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
        oVar.h();
        yj0.a.h(this, "com/tencent/mm/wallet_core/ui/formview/FormViewUtil$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
