package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes.dex */
public final class vr extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et f196346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f196347e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar, float f17) {
        super(1);
        this.f196346d = etVar;
        this.f196347e = f17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (!(it instanceof android.view.ViewGroup) && it.getId() != this.f196346d.f193994y.getId() && it.getId() != com.p314xaae8f345.mm.R.id.uat) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(this.f196347e));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(it, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin$initVoicePanel$2$onVoiceStart$1", "invoke", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            it.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(it, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin$initVoicePanel$2$onVoiceStart$1", "invoke", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        return jz5.f0.f384359a;
    }
}
