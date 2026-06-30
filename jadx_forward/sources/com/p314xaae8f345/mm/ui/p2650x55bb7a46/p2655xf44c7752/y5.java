package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes14.dex */
public class y5 extends wa5.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b f283110b;

    public y5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b) {
        this.f283110b = viewOnClickListenerC21748xb3d38e6b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wa5.a, android.app.SharedElementCallback
    public android.os.Parcelable onCaptureSharedElementSnapshot(android.view.View view, android.graphics.Matrix matrix, android.graphics.RectF rectF) {
        if (view instanceof ya5.a) {
            ((ya5.a) view).q();
        }
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @Override // wa5.a, android.app.SharedElementCallback
    public void onMapSharedElements(java.util.List list, java.util.Map map) {
        java.util.List<android.util.Pair> a17;
        if (list != null && map != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f283110b;
            android.view.View m79160xf8606e56 = viewOnClickListenerC21748xb3d38e6b.f282170n.m79160xf8606e56();
            wa5.d dVar = wa5.d.f525848a;
            map.clear();
            if (m79160xf8606e56 != null && (a17 = wa5.e.a(m79160xf8606e56)) != null) {
                for (android.util.Pair pair : a17) {
                    if (list.contains(pair.second)) {
                        java.lang.Object second = pair.second;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(second, "second");
                        java.lang.Object first = pair.first;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(first, "first");
                        map.put(second, first);
                    }
                }
            }
        }
        super.onMapSharedElements(list, map);
    }
}
