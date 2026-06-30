package com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159;

/* loaded from: classes5.dex */
public final class b implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.f f146670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f146671e;

    public b(com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.f fVar, android.view.View view) {
        this.f146670d = fVar;
        this.f146671e = view;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/avatar/AnyProcessAvatarAttacher$AvatarBitmapDrawable$attachToView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int actionMasked = motionEvent.getActionMasked();
        com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.f fVar = this.f146670d;
        java.lang.String str = fVar.f146683a;
        java.util.Objects.toString(this.f146671e);
        if (actionMasked == 0) {
            fVar.f146686d = true;
            fVar.invalidateSelf();
        } else if (actionMasked == 1 || actionMasked == 3) {
            fVar.f146686d = false;
            fVar.invalidateSelf();
        }
        yj0.a.i(false, this, "com/tencent/mm/feature/avatar/AnyProcessAvatarAttacher$AvatarBitmapDrawable$attachToView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
