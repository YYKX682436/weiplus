package b85;

/* loaded from: classes14.dex */
public final class i extends com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11 {

    /* renamed from: a, reason: collision with root package name */
    public static final b85.i f99885a = new b85.i();

    public static final fo3.r a(b85.i iVar, android.view.View view, com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.AbstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf abstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf) {
        iVar.getClass();
        java.util.Map<java.lang.Integer, yz5.l> map = abstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf.m42269x7c8fc85a().get(java.lang.Integer.valueOf(view.getId()));
        if (map == null) {
            return null;
        }
        android.view.View m42254x811f1304 = abstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf.m42254x811f1304(view, kz5.n0.S0(map.keySet()));
        yz5.l lVar = map.get(m42254x811f1304 != null ? java.lang.Integer.valueOf(m42254x811f1304.getId()) : null);
        if (lVar == null) {
            lVar = map.get(iVar.m42653x2ee31f5b(view));
        }
        if (lVar != null) {
            return (fo3.r) lVar.mo146xb9724478(view);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11
    /* renamed from: dealOnAction */
    public void mo9974x1a508981(android.view.View view, int i17, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (i17 != 16) {
            return;
        }
        m42652x1456a638(view, new b85.f(view));
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11
    /* renamed from: dealOnTouchEvent */
    public void mo9975x3525c066(android.view.View view, android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (kz5.z.F(new int[]{0, 1, 2}, event.getAction())) {
            m42652x1456a638(view, new b85.g(view, event));
        }
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11
    /* renamed from: getAuthority */
    public int mo9976x5761788d() {
        return 24;
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11
    /* renamed from: needDelegateTouch */
    public boolean mo9977x987187c4(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        return m42652x1456a638(view, new b85.h(view));
    }

    @Override // com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p610xc52405f1.AbstractC4922xc8fe6a11
    /* renamed from: onInterceptTouchEvent */
    public boolean mo9978x75f1c9e(android.view.View v17, android.view.MotionEvent motionEvent, java.lang.StackTraceElement[] stacks) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(motionEvent, "motionEvent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stacks, "stacks");
        int i17 = b85.e.f99880e0;
        b85.e eVar = (b85.e) i95.n0.c(b85.e.class);
        return eVar != null && eVar.mo9972xbc37534c(kz5.z.z0(stacks));
    }
}
