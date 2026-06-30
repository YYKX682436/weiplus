package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class fm implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f184930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gm f184931e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f184932f;

    public fm(android.widget.TextView textView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gm gmVar, android.widget.TextView textView2) {
        this.f184930d = textView;
        this.f184931e = gmVar;
        this.f184932f = textView2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.widget.TextView textView = this.f184930d;
        textView.getViewTreeObserver().removeOnPreDrawListener(this);
        int[] iArr = new int[2];
        textView.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        this.f184932f.getLocationInWindow(iArr2);
        textView.setMaxWidth(iArr2[0] - iArr[0]);
        this.f184931e.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePurchaseListConvert", "adjustNickNameWidth maxWidth:" + textView.getMaxWidth() + ",nicknamePos:" + iArr[0] + '-' + iArr[1] + ", tipsPos:" + iArr2[0] + '-' + iArr2[1]);
        if (textView.getMaxWidth() <= 0) {
            textView.setMaxWidth(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db));
        }
        return true;
    }
}
