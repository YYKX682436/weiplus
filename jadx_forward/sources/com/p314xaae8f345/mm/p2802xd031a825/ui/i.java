package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes9.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22900x495c6e16 f295722d;

    public i(com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22900x495c6e16 viewOnFocusChangeListenerC22900x495c6e16) {
        this.f295722d = viewOnFocusChangeListenerC22900x495c6e16;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        int i18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wallet_core/ui/EditHintView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22900x495c6e16 viewOnFocusChangeListenerC22900x495c6e16 = this.f295722d;
        if (viewOnFocusChangeListenerC22900x495c6e16.f295607h.getVisibility() == 0) {
            if (!viewOnFocusChangeListenerC22900x495c6e16.f295619w || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(viewOnFocusChangeListenerC22900x495c6e16.m83062xfb85ada3())) {
                int i19 = viewOnFocusChangeListenerC22900x495c6e16.f295615s;
                if (i19 != 1) {
                    if (i19 == 3) {
                        viewOnFocusChangeListenerC22900x495c6e16.getContext();
                        i17 = c01.z1.I() ? com.p314xaae8f345.mm.R.C30864xbddafb2a.d7v : com.p314xaae8f345.mm.R.C30864xbddafb2a.d68;
                        viewOnFocusChangeListenerC22900x495c6e16.getContext();
                        i18 = c01.z1.I() ? com.p314xaae8f345.mm.R.C30867xcad56011.khy : com.p314xaae8f345.mm.R.C30867xcad56011.khv;
                    } else if (i19 == 4) {
                        viewOnFocusChangeListenerC22900x495c6e16.getContext();
                        i17 = c01.z1.I() ? com.p314xaae8f345.mm.R.C30864xbddafb2a.a3i : com.p314xaae8f345.mm.R.C30864xbddafb2a.a3h;
                        i18 = com.p314xaae8f345.mm.R.C30867xcad56011.f572565bn0;
                    } else if (i19 == 9) {
                        i17 = com.p314xaae8f345.mm.R.C30864xbddafb2a.d7w;
                        i18 = com.p314xaae8f345.mm.R.C30867xcad56011.kix;
                    } else if (i19 != 10) {
                        i17 = -1;
                        i18 = -1;
                    } else {
                        i17 = com.p314xaae8f345.mm.R.C30864xbddafb2a.d77;
                        i18 = com.p314xaae8f345.mm.R.C30867xcad56011.kio;
                    }
                    if (i17 != -1) {
                        if (viewOnFocusChangeListenerC22900x495c6e16.D == null) {
                            android.content.Context context = viewOnFocusChangeListenerC22900x495c6e16.getContext();
                            viewOnFocusChangeListenerC22900x495c6e16.D = db5.e1.w(context, viewOnFocusChangeListenerC22900x495c6e16.getResources().getString(i18), viewOnFocusChangeListenerC22900x495c6e16.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kmf), ((android.view.LayoutInflater) context.getSystemService("layout_inflater")).inflate(i17, (android.view.ViewGroup) null), new com.p314xaae8f345.mm.p2802xd031a825.ui.j(viewOnFocusChangeListenerC22900x495c6e16));
                        }
                        viewOnFocusChangeListenerC22900x495c6e16.D.show();
                    }
                }
            } else {
                viewOnFocusChangeListenerC22900x495c6e16.f295606g.m121590x49eb759d();
            }
        }
        yj0.a.h(this, "com/tencent/mm/wallet_core/ui/EditHintView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
