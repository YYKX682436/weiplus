package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes15.dex */
public class j3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.C19652xe1933193 f272413d;

    public j3(com.p314xaae8f345.mm.p2470x93e71c27.ui.C19652xe1933193 c19652xe1933193) {
        this.f272413d = c19652xe1933193;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/VoiceInputFooter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        final com.p314xaae8f345.mm.p2470x93e71c27.ui.C19652xe1933193 c19652xe1933193 = this.f272413d;
        c19652xe1933193.f271377q.requestFocus();
        boolean z17 = c19652xe1933193.f271381u;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = c19652xe1933193.f271374n;
        if (z17) {
            c19652xe1933193.j();
            abstractActivityC21394xb3d2c0cf.mo26063x7b383410();
        } else {
            c19652xe1933193.f271381u = true;
            abstractActivityC21394xb3d2c0cf.mo48674x36654fab();
            if (c19652xe1933193.f271375o.getVisibility() == 0) {
                c19652xe1933193.i();
            }
            c19652xe1933193.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.pluginsdk.ui.VoiceInputFooter$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib ibVar = com.p314xaae8f345.mm.p2470x93e71c27.ui.C19652xe1933193.this.f271376p;
                    if (ibVar != null) {
                        ibVar.setVisibility(0);
                    }
                }
            }, 100L);
            c19652xe1933193.f271379s.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562769o2);
            c19652xe1933193.f271378r.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562768o1);
            c19652xe1933193.f271378r.setVisibility(8);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.n3 n3Var = c19652xe1933193.f271383w;
            if (n3Var != null) {
                ((com.p314xaae8f345.mm.p2470x93e71c27.ui.f4) n3Var).f272368a.f271405e.setVisibility(4);
            }
        }
        c19652xe1933193.k(2);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/VoiceInputFooter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
