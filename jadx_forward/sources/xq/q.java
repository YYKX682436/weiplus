package xq;

/* loaded from: classes15.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public android.widget.FrameLayout f537542a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f537543b = new int[2];

    /* renamed from: c, reason: collision with root package name */
    public final xq.n f537544c = new xq.n();

    /* renamed from: d, reason: collision with root package name */
    public final xq.f f537545d = new xq.o(this);

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f537546e;

    /* renamed from: f, reason: collision with root package name */
    public xq.p f537547f;

    public final boolean a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        java.lang.String b17 = xq.s.f537548a.b(msgInfo);
        boolean z17 = true;
        if (b17 == null || b17.length() == 0) {
            return false;
        }
        java.lang.String d17 = msgInfo.S2() ? n22.m.d(b17) : n22.m.o(b17);
        if (d17 != null && d17.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            c(msgInfo, 0, java.lang.String.valueOf(msgInfo.m124847x74d37ac6()), b17, d17);
        }
        return false;
    }

    public final int b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, int i17) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        java.util.List c17 = xq.s.f537548a.c(msgInfo);
        if (c17.isEmpty()) {
            return 0;
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) c17;
        int size = linkedList.size();
        while (i17 < size) {
            java.lang.String str = (java.lang.String) linkedList.get(i17);
            java.lang.String d17 = n22.m.d(str);
            if (!(d17 == null || d17.length() == 0)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(msgInfo.m124847x74d37ac6());
                sb6.append('_');
                sb6.append(i17);
                java.lang.String key = sb6.toString();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiDynamicController", "checkMatchPatMsg: " + key);
                xq.n nVar = this.f537544c;
                nVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
                java.util.Iterator it = nVar.f537540a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((xq.m) obj).f537522a, key)) {
                        break;
                    }
                }
                if (((xq.m) obj) == null) {
                    c(msgInfo, i17, key, str, d17);
                }
            }
            i17++;
        }
        return linkedList.size();
    }

    public final xq.m c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, java.lang.String str, java.lang.String str2, java.lang.String emojiKey) {
        java.lang.Object obj;
        xq.f fVar;
        f9Var.getClass();
        xq.n nVar = this.f537544c;
        nVar.getClass();
        xq.m mVar = new xq.m();
        java.util.ArrayList arrayList = nVar.f537540a;
        arrayList.add(mVar);
        mVar.f537524c = f9Var.m124847x74d37ac6();
        java.lang.String Q0 = f9Var.Q0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
        mVar.f537523b = Q0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        mVar.f537522a = str;
        mVar.f537525d = f9Var.mo78013xfb85f7b0();
        mVar.f537526e = this.f537542a;
        mVar.f537539r = this.f537545d;
        boolean z17 = false;
        if (f9Var.A0() == 1) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6308x3120e0ce c6308x3120e0ce = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6308x3120e0ce();
            mVar.f537538q = c6308x3120e0ce;
            c6308x3120e0ce.f136658h = nr.a.f420562a ? 1 : 0;
            nr.a.f420562a = false;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6308x3120e0ce c6308x3120e0ce2 = mVar.f537538q;
        if (c6308x3120e0ce2 != null) {
            c6308x3120e0ce2.f136659i = c6308x3120e0ce2.b("ChatId", this.f537546e, true);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6308x3120e0ce c6308x3120e0ce3 = mVar.f537538q;
        if (c6308x3120e0ce3 != null) {
            c6308x3120e0ce3.f136654d = c6308x3120e0ce3.b("Content", str2, true);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiKey, "emojiKey");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiDynamicController", "setPlayingKey: ".concat(emojiKey));
        java.util.Iterator it = xq.s.f537552e.f537510c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((xq.c) obj).f537504b, emojiKey)) {
                break;
            }
        }
        xq.c cVar = (xq.c) obj;
        if (cVar != null) {
            java.lang.String filePath = rr.s.f480682a.b() + cVar.f537505c;
            if (com.p314xaae8f345.mm.vfs.w6.j(filePath)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
                mVar.f537532k = cVar;
                if (cVar.f537506d != null && (fVar = mVar.f537539r) != null) {
                    java.lang.String msgTalker = mVar.f537523b;
                    java.lang.String animKey = mVar.f537522a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgTalker, "msgTalker");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animKey, "animKey");
                    xq.p pVar = ((xq.o) fVar).f537541a.f537547f;
                    if (pVar != null) {
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ta taVar = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ma) pVar).f281028a;
                        java.lang.String str3 = taVar.f281506e;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onScreenEffect: msg:");
                        xq.d dVar = cVar.f537506d;
                        sb6.append(dVar != null ? java.lang.Integer.valueOf(dVar.f537507b) : null);
                        sb6.append(", ");
                        xq.d dVar2 = cVar.f537506d;
                        sb6.append(dVar2 != null ? java.lang.Integer.valueOf(dVar2.f537508c) : null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb6.toString());
                        if (!taVar.f281507f) {
                            taVar.m0().m143477xed060d07();
                        }
                    }
                }
                try {
                    mVar.f537530i = new com.p314xaae8f345.mm.p1006xc5476f33.gif.u(com.p314xaae8f345.mm.vfs.w6.N(filePath, 0, -1));
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6308x3120e0ce c6308x3120e0ce4 = mVar.f537538q;
                    if (c6308x3120e0ce4 != null) {
                        c6308x3120e0ce4.f136656f = 1;
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EmojiAnimViewHolder", e17, "create anim", new java.lang.Object[0]);
                    if (e17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(711, 21);
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6308x3120e0ce c6308x3120e0ce5 = mVar.f537538q;
                        if (c6308x3120e0ce5 != null) {
                            c6308x3120e0ce5.f136656f = 2;
                        }
                        if (c6308x3120e0ce5 != null) {
                            c6308x3120e0ce5.f136657g = 1;
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.gif.u uVar = mVar.f537530i;
                int i18 = uVar != null ? uVar.f223740x : 1;
                if (uVar != null) {
                    uVar.Q = i18;
                }
                if (uVar != null) {
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.xa) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.u6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.u6.class))).wi(uVar.S, 0L);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.gif.u uVar2 = mVar.f537530i;
                if (uVar2 != null) {
                    uVar2.f223723d = false;
                }
                z17 = true;
            } else {
                xq.s.f537548a.a();
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiDynamicController", "setPlayingKey: no config");
        }
        if (z17) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6308x3120e0ce c6308x3120e0ce6 = mVar.f537538q;
            if (c6308x3120e0ce6 != null) {
                c6308x3120e0ce6.f136655e = 1;
            }
        } else {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6308x3120e0ce c6308x3120e0ce7 = mVar.f537538q;
            if (c6308x3120e0ce7 != null) {
                c6308x3120e0ce7.f136655e = 2;
            }
            if (c6308x3120e0ce7 != null) {
                c6308x3120e0ce7.k();
            }
            arrayList.remove(mVar);
        }
        return mVar;
    }

    public final void d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStop: ");
        xq.n nVar = this.f537544c;
        sb6.append(nVar.f537540a.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiDynamicController", sb6.toString());
        java.util.ArrayList arrayList = nVar.f537540a;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            xq.m mVar = (xq.m) it.next();
            mVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiAnimViewHolder", "stop: ");
            mVar.b();
        }
        arrayList.clear();
    }

    public final void e(xq.b viewProvider) {
        boolean a17;
        android.widget.FrameLayout frameLayout;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewProvider, "viewProvider");
        xq.n nVar = this.f537544c;
        int size = nVar.f537540a.size();
        int[] rootLocation = this.f537543b;
        if (size > 0 && (frameLayout = this.f537542a) != null) {
            frameLayout.getLocationInWindow(rootLocation);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = nVar.f537540a;
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            xq.m mVar = (xq.m) it.next();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sa saVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sa) viewProvider;
            android.view.View b17 = saVar.b(mVar.f537524c);
            if (b17 != null) {
                a17 = mVar.a(saVar.a(b17, mVar.f537522a));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootLocation, "rootLocation");
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = mVar.f537528g;
                if ((c22624x85d69039 != null ? c22624x85d69039.mo84153x22f21e20() : null) != null) {
                    android.graphics.RectF a18 = xq.a.f537502a.a(c22624x85d69039);
                    int[] iArr = new int[2];
                    c22624x85d69039.getLocationInWindow(iArr);
                    int i17 = iArr[0] - rootLocation[0];
                    int i18 = iArr[1] - rootLocation[1];
                    boolean isEmpty = a18.isEmpty();
                    android.graphics.RectF rectF = mVar.f537531j;
                    if (isEmpty) {
                        c22624x85d69039.post(new xq.i(c22624x85d69039, mVar, i17, i18));
                        a18.set(rectF);
                    } else {
                        rectF.set(a18);
                    }
                    mVar.d(a18.centerX() + i17 + c22624x85d69039.getPaddingLeft(), a18.centerY() + i18 + c22624x85d69039.getPaddingTop(), (int) a18.width());
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiAnimViewHolder", "updateView: no layout");
                }
            } else {
                a17 = mVar.a(null);
            }
            if (a17) {
                arrayList.add(mVar);
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            xq.m holder = (xq.m) it6.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
            arrayList2.remove(holder);
        }
    }
}
