package xi2;

/* loaded from: classes13.dex */
public final class k implements xi2.g {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.ImageView f536261a;

    /* renamed from: b, reason: collision with root package name */
    public final xi2.f f536262b;

    /* renamed from: c, reason: collision with root package name */
    public u3.u f536263c;

    /* renamed from: d, reason: collision with root package name */
    public u3.u f536264d;

    public k(android.widget.ImageView battleStartView, xi2.f animateCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(battleStartView, "battleStartView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animateCallback, "animateCallback");
        this.f536261a = battleStartView;
        this.f536262b = animateCallback;
        battleStartView.setVisibility(8);
    }

    @Override // xi2.g
    public android.view.View a() {
        return this.f536261a;
    }

    @Override // xi2.g
    public void b(p3325xe03a0797.p3326xc267989b.y0 scope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        android.widget.ImageView imageView = this.f536261a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(imageView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/start/MultiNewBattlePagStartView", "doSpringAnimation", "(Landroid/view/View;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        imageView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(imageView, "com/tencent/mm/plugin/finder/live/mic/pk/start/MultiNewBattlePagStartView", "doSpringAnimation", "(Landroid/view/View;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        imageView.setScaleX(0.0f);
        imageView.setScaleY(0.0f);
        u3.u uVar = new u3.u(imageView, u3.s.f505752n, 1.0f);
        uVar.f505769t.b(300.0f);
        uVar.f505769t.a(0.5f);
        uVar.f505759b = 0.0f;
        uVar.f505760c = true;
        uVar.a(new xi2.j(scope, this));
        this.f536263c = uVar;
        u3.u uVar2 = new u3.u(imageView, u3.s.f505753o, 1.0f);
        uVar2.f505769t.b(300.0f);
        uVar2.f505769t.a(0.5f);
        uVar2.f505759b = 0.0f;
        uVar2.f505760c = true;
        this.f536264d = uVar2;
        u3.u uVar3 = this.f536263c;
        if (uVar3 != null) {
            uVar3.e();
        }
        u3.u uVar4 = this.f536264d;
        if (uVar4 != null) {
            uVar4.e();
        }
        this.f536262b.mo10405xd7e2f2fd();
    }

    @Override // xi2.g
    /* renamed from: getVisibility */
    public int mo140755x61f71b08() {
        return this.f536261a.getVisibility();
    }

    @Override // xi2.g
    /* renamed from: reset */
    public void mo140756x6761d4f() {
        u3.u uVar = this.f536263c;
        if (uVar != null) {
            uVar.b();
        }
        u3.u uVar2 = this.f536264d;
        if (uVar2 != null) {
            uVar2.b();
        }
        mo140757x901b6914(8);
    }

    @Override // xi2.g
    /* renamed from: setVisibility */
    public void mo140757x901b6914(int i17) {
        this.f536261a.setVisibility(i17);
    }
}
