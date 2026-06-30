package df3;

/* loaded from: classes8.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1852x498cab9f.ActivityC16469x1c9bb97e f313565d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1852x498cab9f.ActivityC16469x1c9bb97e activityC16469x1c9bb97e) {
        this.f313565d = activityC16469x1c9bb97e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        df3.h hVar;
        kw5.b bVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/wemagic/WeMagicSclCommonStarterDemoUI$initDynamicCardEnv$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1852x498cab9f.ActivityC16469x1c9bb97e activityC16469x1c9bb97e = this.f313565d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC16469x1c9bb97e.f229726d, "bindView");
        final android.widget.FrameLayout frameLayout = activityC16469x1c9bb97e.f229727e;
        if (frameLayout != null && (hVar = activityC16469x1c9bb97e.f229728f) != null && (bVar = hVar.f313556d) != null) {
            com.p314xaae8f345.p3178x498cab9f.p3179xf7e5dd3b.p3181xc5476f33.scl.p3182xe480f708.e eVar = new com.p314xaae8f345.p3178x498cab9f.p3179xf7e5dd3b.p3181xc5476f33.scl.p3182xe480f708.e();
            eVar.f301593d = "frames";
            boolean[] zArr = eVar.f301595f;
            zArr[1] = true;
            sw5.a aVar = hVar.f313555c;
            aVar.getClass();
            final yz5.l lVar = null;
            final qw5.b a17 = aVar.a(bVar, null);
            if (a17 != null) {
                ow5.a aVar2 = a17.f448763a;
                java.lang.String bizName = aVar2.f430963b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
                java.lang.String str = zArr[1] ? eVar.f301593d : "";
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getPath(...)");
                java.lang.String str2 = zArr[2] ? eVar.f301594e : "";
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getQuery(...)");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(bizName);
                sb6.append('_');
                if (!(str2.length() == 0)) {
                    str = str + '_' + str2;
                }
                sb6.append(str);
                java.lang.String frameSetRootId = sb6.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetRootId, "frameSetRootId");
                java.lang.String viewId = frameSetRootId.concat("-mock_123");
                nw5.b bVar2 = lw5.a.f403195a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
                nw5.b bVar3 = lw5.a.f403195a;
                bVar3.getClass();
                java.util.HashMap hashMap = (java.util.HashMap) bVar3.f422564a;
                if (((mw5.a) hashMap.get(viewId)) == null) {
                    hashMap.put(viewId, new nw5.a(a17.f448764b, aVar2.f430962a, new yz5.l() { // from class: qw5.b$$c
                        @Override // yz5.l
                        /* renamed from: invoke */
                        public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                            tw5.a view2 = (tw5.a) obj;
                            qw5.b this$0 = qw5.b.this;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
                            android.view.ViewGroup containerView = frameLayout;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "$containerView");
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view2, "view");
                            view2.setId(android.view.View.generateViewId());
                            containerView.addView(view2);
                            return jz5.f0.f384359a;
                        }
                    }, new yz5.l() { // from class: qw5.b$$d
                        @Override // yz5.l
                        /* renamed from: invoke */
                        public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                            tw5.a view2 = (tw5.a) obj;
                            qw5.b this$0 = qw5.b.this;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view2, "view");
                            yz5.l lVar2 = lVar;
                            if (lVar2 != null) {
                                lVar2.mo146xb9724478(view2);
                            }
                            return jz5.f0.f384359a;
                        }
                    }));
                    com.p314xaae8f345.p3178x498cab9f.p3179xf7e5dd3b.p3181xc5476f33.scl.p3182xe480f708.d dVar = new com.p314xaae8f345.p3178x498cab9f.p3179xf7e5dd3b.p3181xc5476f33.scl.p3182xe480f708.d();
                    dVar.f301588d = "mock_123";
                    boolean[] zArr2 = dVar.f301592h;
                    zArr2[1] = true;
                    dVar.f301589e = "{\n        \"type\": 1,\n        \"data\": \"{\\\"iconUrl\\\":\\\"https://dldir1v6.qq.com/weixin/checkresupdate/shopicon_51fca260daa5429ca68962e278c6eef5.png\\\",\\\"pagIconUrl\\\":\\\"\\\",\\\"iconType\\\":0,\\\"recommendReason\\\":\\\"商品\\\",\\\"wording\\\":\\\"古琴零基础入门年课\\\"}\"\n    }";
                    zArr2[2] = true;
                    com.p314xaae8f345.p3178x498cab9f.p3179xf7e5dd3b.p3181xc5476f33.scl.p3182xe480f708.b.f301575b.c(a17.f448764b, eVar, dVar);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/wemagic/WeMagicSclCommonStarterDemoUI$initDynamicCardEnv$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
