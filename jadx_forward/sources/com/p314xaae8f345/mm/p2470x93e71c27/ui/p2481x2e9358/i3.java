package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class i3 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final int f271924d;

    /* renamed from: e, reason: collision with root package name */
    public float f271925e;

    /* renamed from: f, reason: collision with root package name */
    public float f271926f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f271927g;

    public i3(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f271927g = c19666xfd6e2f33;
        this.f271924d = android.view.ViewConfiguration.get(c19666xfd6e2f33.getContext()).getScaledTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.view.ViewGroup viewGroup;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$62", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f271927g;
        if (c19666xfd6e2f33.f271609u6) {
            c19666xfd6e2f33.f271609u6 = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.c cVar = c19666xfd6e2f33.f271571o6;
            if (cVar != null) {
                cVar.a(false, true);
            }
            c19666xfd6e2f33.f271597s6.d();
            c19666xfd6e2f33.f271494b4.setText(pg5.d.a(c19666xfd6e2f33.getContext(), (java.lang.CharSequence) ((java.util.HashMap) c19666xfd6e2f33.f271513e6).get(java.lang.Integer.valueOf(c19666xfd6e2f33.f271615v6))));
            com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.e eVar = c19666xfd6e2f33.N3;
            eVar.f256931v = 0;
            eVar.f256927r = java.lang.System.currentTimeMillis();
            c19666xfd6e2f33.f271559m6 = false;
        }
        c19666xfd6e2f33.N3.f256933x = 1;
        if (motionEvent.getActionMasked() == 0) {
            this.f271925e = motionEvent.getX();
            this.f271926f = motionEvent.getY();
        } else if (motionEvent.getActionMasked() == 1) {
            float abs = java.lang.Math.abs(motionEvent.getX() - this.f271925e);
            int i17 = this.f271924d;
            if (abs <= i17 && java.lang.Math.abs(motionEvent.getY() - this.f271926f) <= i17 && (viewGroup = c19666xfd6e2f33.f271589r4) != null && !c19666xfd6e2f33.f271607u4) {
                c19666xfd6e2f33.f271607u4 = true;
                if (c19666xfd6e2f33.f271543k2 || c19666xfd6e2f33.f271601t4) {
                    viewGroup.setVisibility(0);
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f c22698xdfbd289f = c19666xfd6e2f33.f271595s4;
                    if (c22698xdfbd289f != null) {
                        c22698xdfbd289f.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562768o1);
                    }
                }
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$62", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
