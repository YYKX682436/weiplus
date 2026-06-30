package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes15.dex */
public class k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.C19652xe1933193 f272418d;

    public k3(com.p314xaae8f345.mm.p2470x93e71c27.ui.C19652xe1933193 c19652xe1933193) {
        this.f272418d = c19652xe1933193;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/VoiceInputFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.C19652xe1933193.f271373x;
        final com.p314xaae8f345.mm.p2470x93e71c27.ui.C19652xe1933193 c19652xe1933193 = this.f272418d;
        if (c19652xe1933193.f271376p.getVisibility() == 0) {
            c19652xe1933193.j();
        }
        boolean z17 = c19652xe1933193.f271382v;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = c19652xe1933193.f271374n;
        if (z17) {
            c19652xe1933193.f271377q.requestFocus();
            c19652xe1933193.i();
            abstractActivityC21394xb3d2c0cf.mo26063x7b383410();
            c19652xe1933193.f271378r.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562768o1);
        } else {
            abstractActivityC21394xb3d2c0cf.mo48674x36654fab();
            c19652xe1933193.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.pluginsdk.ui.VoiceInputFooter$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.C19652xe1933193 c19652xe19331932 = com.p314xaae8f345.mm.p2470x93e71c27.ui.C19652xe1933193.this;
                    c19652xe19331932.f271382v = true;
                    c19652xe19331932.f271375o.i();
                    c19652xe19331932.f271375o.setVisibility(0);
                }
            }, 100L);
            c19652xe1933193.f271377q.requestFocus();
            c19652xe1933193.f271378r.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562769o2);
            c19652xe1933193.f271379s.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b9u);
        }
        c19652xe1933193.k(1);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/VoiceInputFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
