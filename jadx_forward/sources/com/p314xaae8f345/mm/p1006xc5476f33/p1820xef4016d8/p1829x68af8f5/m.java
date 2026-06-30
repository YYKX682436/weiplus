package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* loaded from: classes9.dex */
public class m implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public float f227423d;

    /* renamed from: e, reason: collision with root package name */
    public float f227424e;

    /* renamed from: f, reason: collision with root package name */
    public long f227425f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f227426g = false;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.w f227427h;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.w wVar) {
        this.f227427h = wVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$2$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int actionMasked = motionEvent.getActionMasked();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.w wVar = this.f227427h;
        if (actionMasked == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c = wVar.f227456d;
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c.f227306f2;
            c16344xea85a40c.g();
        }
        if (wVar.f227456d.N1) {
            if (motionEvent.getActionMasked() == 0) {
                android.graphics.Rect rect = new android.graphics.Rect();
                wVar.f227456d.K.getGlobalVisibleRect(rect);
                if (rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    this.f227423d = motionEvent.getRawX();
                    this.f227424e = motionEvent.getRawY();
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    this.f227425f = android.os.SystemClock.elapsedRealtime();
                    this.f227426g = true;
                } else {
                    this.f227426g = false;
                }
            } else if (motionEvent.getActionMasked() == 1 && this.f227426g) {
                long j17 = this.f227425f;
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (android.os.SystemClock.elapsedRealtime() - j17 < 500) {
                    android.graphics.Rect rect2 = new android.graphics.Rect();
                    wVar.f227456d.K.getGlobalVisibleRect(rect2);
                    int rawX = (int) motionEvent.getRawX();
                    int rawY = (int) motionEvent.getRawY();
                    if (java.lang.Math.abs(rawX - this.f227423d) <= 20.0f && java.lang.Math.abs(rawY - this.f227424e) <= 20.0f && rect2.contains(rawX, rawY)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeAppBarLayout", "click collapse view");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c2 = wVar.f227456d;
                        c16344xea85a40c2.V1 = true;
                        c16344xea85a40c2.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.l(this), 30L);
                    }
                }
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$2$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
