package com.tencent.mm.feature.avatar;

/* loaded from: classes5.dex */
public final class b implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.avatar.f f65137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f65138e;

    public b(com.tencent.mm.feature.avatar.f fVar, android.view.View view) {
        this.f65137d = fVar;
        this.f65138e = view;
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
        com.tencent.mm.feature.avatar.f fVar = this.f65137d;
        java.lang.String str = fVar.f65150a;
        java.util.Objects.toString(this.f65138e);
        if (actionMasked == 0) {
            fVar.f65153d = true;
            fVar.invalidateSelf();
        } else if (actionMasked == 1 || actionMasked == 3) {
            fVar.f65153d = false;
            fVar.invalidateSelf();
        }
        yj0.a.i(false, this, "com/tencent/mm/feature/avatar/AnyProcessAvatarAttacher$AvatarBitmapDrawable$attachToView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
