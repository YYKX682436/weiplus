package df3;

/* loaded from: classes8.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1852x498cab9f.ActivityC16469x1c9bb97e f313564d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1852x498cab9f.ActivityC16469x1c9bb97e activityC16469x1c9bb97e) {
        this.f313564d = activityC16469x1c9bb97e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        kw5.b a17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/wemagic/WeMagicSclCommonStarterDemoUI$initDynamicCardEnv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1852x498cab9f.ActivityC16469x1c9bb97e activityC16469x1c9bb97e = this.f313564d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC16469x1c9bb97e.f229726d, "start");
        android.widget.FrameLayout frameLayout = activityC16469x1c9bb97e.f229727e;
        if (frameLayout != null) {
            df3.h hVar = activityC16469x1c9bb97e.f229728f;
            if (hVar == null) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16469x1c9bb97e.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
                hVar = new df3.h(mo55332x76847179, frameLayout);
                activityC16469x1c9bb97e.f229728f = hVar;
            }
            kw5.b bVar = hVar.f313556d;
            if (bVar == null) {
                sw5.a aVar = hVar.f313555c;
                df3.g gVar = new df3.g(hVar);
                synchronized (aVar) {
                    a17 = kw5.b.f394747b.a(((ow5.a) gVar.mo152xb9724478()).f430963b, "");
                    aVar.a(a17, gVar);
                }
                hVar.f313556d = a17;
                bVar = a17;
            }
            sw5.a aVar2 = hVar.f313555c;
            aVar2.getClass();
            java.lang.Runnable runnable = (java.lang.Runnable) ((java.util.LinkedHashMap) aVar2.f495025d).get(bVar);
            if (runnable != null) {
                aVar2.f495024c.removeCallbacks(runnable);
            }
            final qw5.b a18 = aVar2.a(bVar, null);
            if (a18 != null && a18.f448764b == 0) {
                new java.lang.ref.WeakReference(null);
                com.p314xaae8f345.p3178x498cab9f.p3179xf7e5dd3b.p3181xc5476f33.scl.p3182xe480f708.f.f301596a = new qw5.C30004x2d183f();
                ow5.a aVar3 = a18.f448763a;
                java.util.Set W0 = kz5.n0.W0(aVar3.f430964c);
                boolean z17 = aVar3.f430969h;
                if (z17) {
                    kz5.h0.w(W0, new java.lang.Class[]{pw5.a.class, pw5.b.class, pw5.c.class, pw5.e.class});
                }
                cx5.a aVar4 = new cx5.a(a18, W0);
                java.lang.Class cls = aVar3.f430967f;
                if (cls != null) {
                    try {
                        java.lang.Object newInstance = java.lang.Class.forName(cls.getName()).getDeclaredConstructor(android.content.Context.class, com.p314xaae8f345.p3178x498cab9f.p3188x60b7c31.p3189x2e06d1.AbstractC27738x9ba4b491.class, java.util.Set.class).newInstance(aVar3.f430962a, a18, aVar3.f430966e);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(newInstance, "null cannot be cast to non-null type com.tencent.wemagic.common.api.IMBJsAdaptor");
                        aVar4.f301632b = (com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.api.InterfaceC27730x99f590fe) newInstance;
                    } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException | java.lang.Exception unused) {
                    }
                }
                aVar4.a().size();
                com.p314xaae8f345.p3178x498cab9f.p3179xf7e5dd3b.p3181xc5476f33.scl.p3182xe480f708.b bVar2 = com.p314xaae8f345.p3178x498cab9f.p3179xf7e5dd3b.p3181xc5476f33.scl.p3182xe480f708.b.f301575b;
                com.p314xaae8f345.p3178x498cab9f.p3179xf7e5dd3b.p3181xc5476f33.scl.p3182xe480f708.c cVar = new com.p314xaae8f345.p3178x498cab9f.p3179xf7e5dd3b.p3181xc5476f33.scl.p3182xe480f708.c();
                cVar.f301577d = aVar3.f430963b;
                boolean[] zArr = cVar.f301587q;
                zArr[1] = true;
                cVar.f301579f = new java.util.LinkedList(aVar4.a());
                zArr[3] = true;
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.addAll(aVar3.f430965d);
                cVar.f301582i = linkedList;
                zArr[6] = true;
                cVar.f301585o = z17;
                zArr[9] = true;
                java.util.HashMap hashMap = qw5.c.f448772a;
                java.lang.String str = cVar.f301587q[1] ? cVar.f301577d : "";
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getBizName(...)");
                java.lang.String str2 = (java.lang.String) qw5.c.f448772a.get(str);
                if (str2 != null) {
                    boolean z18 = cVar.f301587q[1];
                    cVar.f301583m = str2;
                    zArr[7] = true;
                }
                cVar.f301580g = aVar3.f430970i;
                zArr[4] = true;
                cVar.f301586p = aVar3.f430971j != null;
                zArr[10] = true;
                long a19 = bVar2.a(cVar);
                a18.f448764b = a19;
                zw5.a aVar5 = yw5.a.f548533a;
                aVar5.getClass();
                aVar5.f558472a.put(java.lang.Long.valueOf(a19), new java.lang.ref.WeakReference(aVar4));
                xw5.d dVar = new xw5.d();
                yz5.a aVar6 = new yz5.a() { // from class: qw5.b$$b
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
                        yz5.a aVar7;
                        qw5.b this$0 = qw5.b.this;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
                        vw5.d dVar2 = this$0.f448763a.f430971j;
                        if (dVar2 == null || (aVar7 = dVar2.f522750a) == null) {
                            return null;
                        }
                        return (android.widget.FrameLayout) aVar7.mo152xb9724478();
                    }
                };
                if (dVar.f539281c == null || dVar.f539282d == null) {
                    dVar.f539281c = aVar6;
                    if (dVar.f539286h) {
                        dVar.a();
                    }
                } else {
                    java.lang.Object[] copyOf = java.util.Arrays.copyOf(new java.lang.Object[0], 0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(copyOf.length == 0 ? "init, but container has been provided" : java.lang.String.format("init, but container has been provided", java.util.Arrays.copyOf(copyOf, copyOf.length)));
                }
                yw5.a.f548534b.put(java.lang.Long.valueOf(a18.f448764b), dVar);
                a18.f448766d = dVar;
                bVar2.b(a18.f448764b);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/wemagic/WeMagicSclCommonStarterDemoUI$initDynamicCardEnv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
