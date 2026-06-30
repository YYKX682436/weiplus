package xs2;

/* loaded from: classes3.dex */
public final class i0 extends xs2.e {

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f537870h;

    /* renamed from: i, reason: collision with root package name */
    public final xs2.f0 f537871i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f537872j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f537873k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f537874l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(android.view.View bulletView, gk2.e buContext, xs2.f0 danmakuConfig) {
        super(bulletView, buContext, danmakuConfig);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bulletView, "bulletView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(danmakuConfig, "danmakuConfig");
        this.f537870h = bulletView;
        this.f537871i = danmakuConfig;
        this.f537872j = "LiveDanmakuManager";
        this.f537873k = jz5.h.b(xs2.g0.f537863d);
        this.f537874l = jz5.h.b(xs2.h0.f537867d);
    }

    @Override // xs2.o
    public void c(java.util.List list, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        synchronized (list) {
            ((java.util.LinkedList) ((jz5.n) this.f537873k).mo141623x754a37bb()).clear();
            ((java.util.LinkedList) ((jz5.n) this.f537874l).mo141623x754a37bb()).clear();
            for (java.lang.Object obj : list) {
                if (obj instanceof mm2.a2) {
                    ((java.util.LinkedList) ((jz5.n) this.f537874l).mo141623x754a37bb()).add(obj);
                } else {
                    ((java.util.LinkedList) ((jz5.n) this.f537873k).mo141623x754a37bb()).add(obj);
                }
            }
            if (!((java.util.LinkedList) ((jz5.n) this.f537873k).mo141623x754a37bb()).isEmpty()) {
                java.util.LinkedList linkedList = (java.util.LinkedList) ((jz5.n) this.f537873k).mo141623x754a37bb();
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    wp.a f57 = i().f5(0, it.next());
                    f57.f529881s = false;
                    xp.a aVar = this.f537871i.f537861c;
                    f57.f529878p = aVar != null ? aVar.f537342g : 3000;
                    f57.f529868f = android.os.SystemClock.uptimeMillis();
                    arrayList.add(f57);
                }
                vp.x i17 = i();
                xp.a aVar2 = this.f537871i.f537861c;
                i17.f520385d.k1(arrayList, aVar2 != null ? aVar2.f537351p : false, aVar2 != null ? aVar2.f537352q : false);
            }
            if (!((java.util.LinkedList) ((jz5.n) this.f537874l).mo141623x754a37bb()).isEmpty()) {
                java.util.LinkedList<mm2.a2> linkedList2 = (java.util.LinkedList) ((jz5.n) this.f537874l).mo141623x754a37bb();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
                for (mm2.a2 a2Var : linkedList2) {
                    wp.a f58 = i().f5(0, a2Var.f410276a);
                    f58.f529881s = a2Var.f410277b;
                    xp.a aVar3 = this.f537871i.f537861c;
                    f58.f529878p = aVar3 != null ? aVar3.f537342g : 3000;
                    f58.f529868f = android.os.SystemClock.uptimeMillis();
                    arrayList2.add(f58);
                }
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    i().f520385d.k0((wp.a) it6.next(), false);
                }
            }
        }
    }

    @Override // xs2.e, xs2.o
    public void d(java.util.List list) {
        super.d(list);
        i().n(0L);
    }

    @Override // xs2.e
    public long h() {
        return android.os.SystemClock.uptimeMillis();
    }

    @Override // xs2.e
    public java.lang.String j() {
        return this.f537872j;
    }

    @Override // xs2.e
    public void m(long j17) {
    }

    @Override // xs2.e, xs2.o
    /* renamed from: onDetach */
    public void mo175869x3f5eee52() {
        super.mo175869x3f5eee52();
    }
}
