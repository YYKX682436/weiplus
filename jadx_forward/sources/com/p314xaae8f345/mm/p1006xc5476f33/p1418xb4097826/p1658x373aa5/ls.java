package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class ls implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.js {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f214148a;

    public ls(android.view.View.OnClickListener onClickListener) {
        this.f214148a = onClickListener;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.js
    public boolean a(android.view.View view, android.view.MotionEvent motionEvent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.view.View.OnClickListener onClickListener = this.f214148a;
        if (onClickListener == null) {
            return false;
        }
        onClickListener.onClick(view);
        return false;
    }
}
