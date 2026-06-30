package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class fm implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f103397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.gm f103398e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f103399f;

    public fm(android.widget.TextView textView, com.tencent.mm.plugin.finder.convert.gm gmVar, android.widget.TextView textView2) {
        this.f103397d = textView;
        this.f103398e = gmVar;
        this.f103399f = textView2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.widget.TextView textView = this.f103397d;
        textView.getViewTreeObserver().removeOnPreDrawListener(this);
        int[] iArr = new int[2];
        textView.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        this.f103399f.getLocationInWindow(iArr2);
        textView.setMaxWidth(iArr2[0] - iArr[0]);
        this.f103398e.getClass();
        com.tencent.mars.xlog.Log.i("FinderLivePurchaseListConvert", "adjustNickNameWidth maxWidth:" + textView.getMaxWidth() + ",nicknamePos:" + iArr[0] + '-' + iArr[1] + ", tipsPos:" + iArr2[0] + '-' + iArr2[1]);
        if (textView.getMaxWidth() <= 0) {
            textView.setMaxWidth(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479718db));
        }
        return true;
    }
}
