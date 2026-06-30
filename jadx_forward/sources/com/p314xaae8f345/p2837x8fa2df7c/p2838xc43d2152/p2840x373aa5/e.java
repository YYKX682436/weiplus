package com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5;

/* loaded from: classes15.dex */
public class e implements android.text.SpanWatcher {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f296733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc f296734e;

    public e(com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc, com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.b bVar) {
        this.f296734e = c23001x9d3a0bdc;
    }

    public final void a(android.text.Spannable spannable) {
        ks5.c cVar;
        com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc = this.f296734e;
        if (c23001x9d3a0bdc.f296711e) {
            c23001x9d3a0bdc.postInvalidate();
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f296733d;
        if (weakReference == null || (cVar = (ks5.c) weakReference.get()) == null || cVar.f393338a != spannable) {
            return;
        }
        cVar.u(spannable, cVar.f393341d, cVar.F);
        c23001x9d3a0bdc.postInvalidate();
    }

    @Override // android.text.SpanWatcher
    public void onSpanAdded(android.text.Spannable spannable, java.lang.Object obj, int i17, int i18) {
        a(spannable);
    }

    @Override // android.text.SpanWatcher
    public void onSpanChanged(android.text.Spannable spannable, java.lang.Object obj, int i17, int i18, int i19, int i27) {
        a(spannable);
    }

    @Override // android.text.SpanWatcher
    public void onSpanRemoved(android.text.Spannable spannable, java.lang.Object obj, int i17, int i18) {
        a(spannable);
    }
}
