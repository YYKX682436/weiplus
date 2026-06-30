package yk3;

/* loaded from: classes8.dex */
public final class i extends yk3.b implements o75.a, zk3.h {

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1902x6580a04.C16613x1a051ad9 f544360o;

    /* renamed from: p, reason: collision with root package name */
    public final uh4.i0 f544361p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.multitask.ui.panel.MinusScreenPanel$multiTaskEventListener$1] */
    public i(final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, android.os.Bundle bundle) {
        super(activity, bundle);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f544360o = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5715x746b0d06>(a0Var) { // from class: com.tencent.mm.plugin.multitask.ui.panel.MinusScreenPanel$multiTaskEventListener$1
            {
                this.f39173x3fe91575 = -1085760746;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5715x746b0d06 c5715x746b0d06) {
                pk3.h a17;
                android.view.View m80380x71e92c1d;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5715x746b0d06 event = c5715x746b0d06;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("receive multitask event, type: ");
                am.ak akVar = event.f136036g;
                sb6.append(akVar != null ? java.lang.Integer.valueOf(akVar.f87694c) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTask.MinusScreenPanel", sb6.toString());
                am.ak akVar2 = event.f136036g;
                if (akVar2 != null) {
                    yk3.i iVar = yk3.i.this;
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = activity;
                    int i17 = akVar2.f87694c;
                    boolean z17 = true;
                    if (i17 == 0) {
                        pk3.h hVar = iVar.f544340i;
                        if ((hVar != null ? hVar.i0() : null) != pk3.a.f437970g && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(akVar2.f87692a, "MultiTaskForSnapshotMinusScreen")) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
                            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31 c16620x3de5dd31 = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) pf5.z.f435481a.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.class);
                            if (c16620x3de5dd31.Y6()) {
                                c16620x3de5dd31.n7();
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c();
                        c16601x7ed0e40c.f66793x2262335f = akVar2.f87693b;
                        java.lang.String str = akVar2.f87692a;
                        c16601x7ed0e40c.f66791xc8a07680 = str;
                        java.util.HashMap hashMap = iVar.f544342n;
                        if (hashMap.containsKey(str)) {
                            pk3.h hVar2 = (pk3.h) hashMap.get(c16601x7ed0e40c.f66791xc8a07680);
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((hVar2 == null || (m80380x71e92c1d = hVar2.m80380x71e92c1d()) == null) ? null : m80380x71e92c1d.getParent(), iVar.f544338g)) {
                                pm0.v.X(new yk3.a(hVar2));
                            }
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hVar2, iVar.f544340i) && iVar.f544340i != null) {
                                iVar.e();
                                iVar.f544340i = null;
                            } else if (hVar2 != null) {
                                hVar2.S6();
                            }
                        } else {
                            z17 = false;
                        }
                        if (z17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTask.MinusScreenPanel", "HideMultiTaskEvent, hideUIComponent, id:%s", c16601x7ed0e40c.f66791xc8a07680);
                        }
                    } else if (i17 == 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTask.MinusScreenPanel", "showHome");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
                        p012xc85e97e9.p093xedfae76a.c1 a18 = pf5.z.f435481a.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.k7((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) a18, false, false, true, true, false, false, false, false, 240, null);
                    } else if (i17 == 4) {
                        pk3.h a19 = iVar.a(0, "MultiTaskForMinusScreen");
                        if (a19 != null) {
                            zk3.g0 g0Var = (zk3.g0) a19;
                            g0Var.f554984f = false;
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0.class))).Zi(new zk3.e0(g0Var));
                        }
                    } else if (i17 == 5 && (a17 = iVar.a(0, "MultiTaskForMinusScreen")) != null) {
                        java.lang.String id6 = akVar2.f87692a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(id6, "id");
                        pm0.v.X(new zk3.l((zk3.g0) a17, id6, akVar2.f87693b, null));
                    }
                }
                return false;
            }
        };
        this.f544361p = new yk3.h(activity);
    }

    public void h(android.view.View view, android.view.View view2, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c taskInfo, boolean z17) {
        int i18;
        jz5.l lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskInfo, "taskInfo");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f544335d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.class)).Q6(taskInfo.f66793x2262335f)) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(activity);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTask.MinusScreenPanel", "onGridItemClick, is TeenMode!");
            return;
        }
        r45.fr4 fr4Var = new r45.fr4();
        pk3.h c17 = c(taskInfo);
        fr4Var.set(2, java.lang.Boolean.valueOf((c17 != null ? c17.Mb(taskInfo, ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.class)).V6()) : z17) && z17));
        android.view.View findViewById = view2 != null ? view2.findViewById(com.p314xaae8f345.mm.R.id.jvd) : null;
        if (findViewById == null) {
            lVar = new jz5.l("", 0);
        } else {
            int[] iArr = new int[2];
            findViewById.getLocationOnScreen(iArr);
            android.graphics.Rect rect = new android.graphics.Rect();
            findViewById.getLocalVisibleRect(rect);
            int i19 = iArr[0];
            int i27 = iArr[1];
            int width = findViewById.getWidth();
            int height = findViewById.getHeight() + i27;
            int height2 = height - rect.height();
            if (rect.top == 0) {
                int height3 = rect.height() + i27;
                if (height > height3) {
                    height = height3;
                    i18 = 4;
                } else {
                    height = height3;
                    i18 = 2;
                }
            } else {
                i18 = 1;
                i27 = height2;
            }
            int i28 = rect.left;
            android.graphics.Rect rect2 = new android.graphics.Rect(i19 + i28, i27, i19 + width + i28, height);
            java.lang.String format = java.lang.String.format("%d,%d,%d,%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(rect2.left), java.lang.Integer.valueOf(rect2.top), java.lang.Integer.valueOf(rect2.right), java.lang.Integer.valueOf(rect2.bottom)}, 4));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            lVar = new jz5.l(format, java.lang.Integer.valueOf(i18));
        }
        fr4Var.set(1, (java.lang.String) lVar.f384366d);
        java.lang.Number number = (java.lang.Number) lVar.f384367e;
        fr4Var.set(5, java.lang.Boolean.valueOf((number.intValue() & 1) == 1));
        fr4Var.set(6, java.lang.Boolean.valueOf((number.intValue() & 4) == 1));
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.u0 u0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.u0.f232039a;
        java.lang.String field_id = taskInfo.f66791xc8a07680;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_id, "field_id");
        fr4Var.set(0, u0Var.b(field_id));
        fr4Var.set(3, u0Var.b("Home"));
        fr4Var.set(4, al3.g.f87391a.a(view));
        fr4Var.set(7, java.lang.Integer.valueOf(i17));
        if (fr4Var.m75933x41a8a7f2(2)) {
            pk3.h b17 = b(1048576, "MultiTaskForSnapshotMinusScreen");
            if (b17 != null) {
                ((zk3.w0) b17).P6(view2, taskInfo, fr4Var, new yk3.e(this, taskInfo, fr4Var, view2));
                return;
            }
            return;
        }
        pk3.h c18 = c(taskInfo);
        if (c18 != null) {
            fr4Var.set(8, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            c18.P6(view2, taskInfo, fr4Var, ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.class)).V6());
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.class)).U6(taskInfo);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTask.MinusScreenPanel", "needEnterAnim false, onGridItemClick, id:%s", taskInfo.f66791xc8a07680);
        }
    }

    @Override // e75.a
    /* renamed from: onChanged */
    public void mo2231x7bb163d5(java.lang.Object obj) {
        o75.c event = (o75.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(this.f544341m);
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((pk3.h) it.next()).p9(event);
        }
    }

    @Override // pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f544337f, "onDestroy");
        lk3.b aj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.class)).aj();
        if (aj6 != null) {
            aj6.P6().mo127128xb5bdeb7a(this);
        }
        ((uh4.c0) i95.n0.c(uh4.c0.class)).tc(this.f544361p);
        mo48814x2efc64();
        pk3.h a17 = a(0, "MultiTaskForMinusScreen");
        if (a17 != null) {
            ((zk3.g0) a17).mo451xac79a11b();
        }
    }
}
