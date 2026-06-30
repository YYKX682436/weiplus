package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a;

/* loaded from: classes15.dex */
public class y extends com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.i {

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View.OnTouchListener f272832i;

    public y(com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc, android.view.View.OnTouchListener onTouchListener) {
        super(c23001x9d3a0bdc.getContext(), c23001x9d3a0bdc, new android.os.Handler(android.os.Looper.getMainLooper()));
        this.f272832i = onTouchListener;
    }

    @Override // com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.i
    public void a(int i17) {
        js5.c cVar = this.f296744g;
        if (cVar != null) {
            android.text.style.CharacterStyle characterStyle = cVar.f383104g;
            if (characterStyle instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0) {
                ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0) characterStyle).mo2167x263a2556(false);
            }
        }
        super.a(i17);
    }

    @Override // com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.i, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        boolean onDown = super.onDown(motionEvent);
        js5.c cVar = this.f296744g;
        if (cVar == null) {
            return onDown;
        }
        android.text.style.CharacterStyle characterStyle = cVar.f383104g;
        if (characterStyle instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0) characterStyle).mo2167x263a2556(true);
        }
        return true;
    }

    @Override // com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.i, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        android.view.View view;
        if (this.f296744g != null && (view = this.f296745h) != null) {
            view.performLongClick();
        }
        a(1);
    }

    @Override // com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.i, android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        view.setTag(com.p314xaae8f345.mm.R.id.ohu, new int[]{(int) motionEvent.getRawX(), (int) motionEvent.getRawY()});
        boolean z17 = view instanceof com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc;
        android.view.View.OnTouchListener onTouchListener = this.f272832i;
        if (z17) {
            com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc = (com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) view;
            if (!c23001x9d3a0bdc.h() || c23001x9d3a0bdc.f296711e) {
                if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                    c23001x9d3a0bdc.m84165x334dfae1().setPressed(false);
                } else if (motionEvent.getAction() == 0) {
                    c23001x9d3a0bdc.m84165x334dfae1().setPressed(true);
                }
                c23001x9d3a0bdc.m84165x334dfae1().setTag(view.getTag());
                return onTouchListener.onTouch(c23001x9d3a0bdc.m84165x334dfae1(), motionEvent);
            }
        } else {
            onTouchListener.onTouch(view, motionEvent);
        }
        return super.onTouch(view, motionEvent);
    }
}
