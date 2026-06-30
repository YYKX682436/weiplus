package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes3.dex */
public class k5 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18586x3f849c5f f254586d;

    public k5(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18586x3f849c5f activityC18586x3f849c5f) {
        this.f254586d = activityC18586x3f849c5f;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder$7", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        pf5.u uVar = pf5.u.f435469a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.w2 w2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.w2) uVar.c(this.f254586d.mo55332x76847179()).a(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.w2.class);
        w2Var.getClass();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = w2Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        new ay2.q(activity).show();
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder$7", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setColor(this.f254586d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c));
        textPaint.setUnderlineText(false);
    }
}
