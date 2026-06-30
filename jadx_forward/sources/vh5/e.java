package vh5;

/* loaded from: classes3.dex */
public final class e extends lf3.n implements lf3.j, vh5.n {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f518736d;

    /* renamed from: e, reason: collision with root package name */
    public vh5.d f518737e;

    /* renamed from: f, reason: collision with root package name */
    public float f518738f;

    /* renamed from: g, reason: collision with root package name */
    public float f518739g;

    /* renamed from: h, reason: collision with root package name */
    public float f518740h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f518738f = 1.0f;
    }

    @Override // lf3.j
    public void E2(android.view.View contentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        vh5.d dVar = this.f518737e;
        if (dVar != null) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j5) dVar).f282595a.f282159k2 = contentView;
        }
        if (dVar != null) {
            float f17 = this.f518738f;
            float f18 = this.f518739g;
            float f19 = this.f518740h;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j5) dVar).f282595a;
            viewOnClickListenerC21748xb3d38e6b.f282217z3 = f17;
            viewOnClickListenerC21748xb3d38e6b.A3 = (int) f18;
            viewOnClickListenerC21748xb3d38e6b.B3 = (int) f19;
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.i5) viewOnClickListenerC21748xb3d38e6b.f282146g3).b();
        }
    }

    @Override // lf3.j
    public void N3(lf3.i iVar) {
    }

    @Override // lf3.j
    public void d3(float f17) {
        if (this.f518736d == null) {
            this.f518736d = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.ght);
        }
        android.view.View view = this.f518736d;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/media/chat/legacy/ChatPageAniComponent", "setBgAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/media/chat/legacy/ChatPageAniComponent", "setBgAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // lf3.j
    public void m6(android.view.View contentView, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.lang.System.currentTimeMillis();
    }

    @Override // lf3.o, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onViewCreated */
    public void mo47092x594b1124(android.view.View contentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        super.mo47092x594b1124(contentView);
    }
}
