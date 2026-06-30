package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1672xc20796d8;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/notice/HighLightGreenBgView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.notice.HighLightGreenBgView */
/* loaded from: classes2.dex */
public final class C15419x30b69859 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f214260d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f214261e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15419x30b69859(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f214261e = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.b0f, this).findViewById(com.p314xaae8f345.mm.R.id.agx);
    }

    public final void a() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f214260d;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        android.view.View view = this.f214261e;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/notice/HighLightGreenBgView", "resetFlashing", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/notice/HighLightGreenBgView", "resetFlashing", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
