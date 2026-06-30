package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes8.dex */
public class g1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 f219596d;

    public g1(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 abstractActivityC15595x3a75f78) {
        this.f219596d = abstractActivityC15595x3a75f78;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 abstractActivityC15595x3a75f78 = this.f219596d;
        abstractActivityC15595x3a75f78.f219470y0.a();
        abstractActivityC15595x3a75f78.mo48674x36654fab();
        abstractActivityC15595x3a75f78.getClass();
        boolean z17 = !abstractActivityC15595x3a75f78.A1;
        yj0.a.i(z17, this, "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
