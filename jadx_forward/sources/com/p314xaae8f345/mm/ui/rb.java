package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class rb extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f291139d;

    public rb(android.app.Activity activity) {
        this.f291139d = activity;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/MMAppMgr$8", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.b1(this.f291139d, com.p314xaae8f345.mm.sdk.p2603x2137b148.p9.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gbc, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(this.f291139d), com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.e(), "setting", 0, 0)));
        yj0.a.h(this, "com/tencent/mm/ui/MMAppMgr$8", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setColor(this.f291139d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
    }
}
