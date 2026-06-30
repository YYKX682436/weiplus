package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes10.dex */
public final class d2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 f179460d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f179461e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 activityC13304x9b00dd62, android.view.View view) {
        super(0);
        this.f179460d = activityC13304x9b00dd62;
        this.f179461e = view;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.ViewGroup viewGroup = this.f179460d.f179294i;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        p012xc85e97e9.p112x993b6d55.C1179x214a9c c1179x214a9c = new p012xc85e97e9.p112x993b6d55.C1179x214a9c(1);
        c1179x214a9c.f93916f = 100L;
        u4.g1.a(viewGroup, c1179x214a9c);
        android.view.View view = this.f179461e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity$setupViews$3$4", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity$setupViews$3$4", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f384359a;
    }
}
