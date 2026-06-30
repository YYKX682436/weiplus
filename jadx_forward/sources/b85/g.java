package b85;

/* loaded from: classes14.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f99882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f99883e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.view.View view, android.view.MotionEvent motionEvent) {
        super(1);
        this.f99882d = view;
        this.f99883e = motionEvent;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        fo3.r a17;
        com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.AbstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf it = (com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.AbstractViewTreeObserverOnGlobalLayoutListenerC4836x37397ddf) obj;
        android.view.View view = this.f99882d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        try {
            a17 = b85.i.a(b85.i.f99885a, view, it);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Acc.NASC", th6, "throw in view(%s)", com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4968x823b57dd.f21368x4fbc8495.m42859xfb82e301(view.getId()));
        }
        if (a17 == null) {
            return java.lang.Boolean.FALSE;
        }
        fo3.p pVar = a17.f346477a;
        if (!fo3.p.f346457f.a(pVar)) {
            return java.lang.Boolean.FALSE;
        }
        java.lang.String h17 = pVar.h();
        java.lang.String str = "<" + pVar + '>';
        int action = this.f99883e.getAction();
        fo3.s sVar = fo3.s.INSTANCE;
        if (action == 0) {
            a17.f346479c = 0;
            sVar.Z7(h17, str);
        } else if (action == 1) {
            sVar.qi(h17, this.f99883e, false, "", a17.f346479c);
            sVar.Qa(h17);
            w04.l.INSTANCE.eg(540999731, h17, a17);
        } else if (action == 2) {
            a17.f346479c++;
        }
        return java.lang.Boolean.FALSE;
    }
}
