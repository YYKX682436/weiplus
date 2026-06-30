package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44;

/* loaded from: classes13.dex */
public class p implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.C18936x5d3e2c4b f258720d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.C18936x5d3e2c4b c18936x5d3e2c4b) {
        this.f258720d = c18936x5d3e2c4b;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voip/widget/VoipBigIconButton$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.C18936x5d3e2c4b c18936x5d3e2c4b = this.f258720d;
        if (action == 0) {
            c18936x5d3e2c4b.f258633d.setBackgroundDrawable(c18936x5d3e2c4b.f258636g);
            c18936x5d3e2c4b.f258633d.setImageDrawable(c18936x5d3e2c4b.f258638i);
            c18936x5d3e2c4b.f258634e.setTextColor(c18936x5d3e2c4b.f258639m.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        } else if (action == 1) {
            c18936x5d3e2c4b.f258633d.setBackgroundDrawable(c18936x5d3e2c4b.f258635f);
            c18936x5d3e2c4b.f258633d.setImageDrawable(c18936x5d3e2c4b.f258637h);
            c18936x5d3e2c4b.f258634e.setTextColor(c18936x5d3e2c4b.f258639m.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/voip/widget/VoipBigIconButton$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
