package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1466xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/widget/FinderLiveMentionEllipsizeTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lcd2/c;", "finderMention", "Ljz5/f0;", "setMention", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.widget.FinderLiveMentionEllipsizeTextView */
/* loaded from: classes4.dex */
public final class C14138xeea20ec7 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14138xeea20ec7(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375, android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
    }

    /* renamed from: setMention */
    public final void m56662xe9e3a728(cd2.c cVar) {
        if (cVar != null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = getContext();
            java.lang.String c17 = cVar.c();
            if (c17 == null) {
                c17 = "";
            }
            ((ke0.e) xVar).getClass();
            setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, c17));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14138xeea20ec7(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
