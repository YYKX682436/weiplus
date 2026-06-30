package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.p2454x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/wenote/ui/nativenote/view/MediaGroupItemCoverView;", "Landroid/widget/LinearLayout;", "", "visibility", "Ljz5/f0;", "setVisibility", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.view.MediaGroupItemCoverView */
/* loaded from: classes.dex */
public final class C19530x8dd60bce extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f269817d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19530x8dd60bce(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f269817d = new java.util.LinkedList();
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        if (i17 == 8) {
            for (android.view.View view : this.f269817d) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wenote/ui/nativenote/view/MediaGroupItemCoverView", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/wenote/ui/nativenote/view/MediaGroupItemCoverView", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }
}
