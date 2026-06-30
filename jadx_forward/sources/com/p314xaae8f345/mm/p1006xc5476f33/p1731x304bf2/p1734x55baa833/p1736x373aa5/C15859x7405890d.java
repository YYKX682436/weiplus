package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.GameChatListView */
/* loaded from: classes15.dex */
public class C15859x7405890d extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12809xaf47a071 implements com.p314xaae8f345.mm.p944x882e457a.u0, u33.l {
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de A2;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.j3 B2;
    public boolean C2;
    public boolean D2;
    public final java.util.Map E2;
    public java.util.List F2;
    public boolean G2;
    public final java.util.List H2;
    public java.lang.String I2;
    public long J2;
    public long K2;
    public boolean L2;
    public long M2;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d N2;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d O2;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d P2;

    /* renamed from: f2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i3 f220493f2;

    /* renamed from: g2, reason: collision with root package name */
    public android.content.Context f220494g2;

    /* renamed from: h2, reason: collision with root package name */
    public long f220495h2;

    /* renamed from: i2, reason: collision with root package name */
    public long f220496i2;

    /* renamed from: j2, reason: collision with root package name */
    public int f220497j2;

    /* renamed from: k2, reason: collision with root package name */
    public final java.util.Map f220498k2;

    /* renamed from: l2, reason: collision with root package name */
    public java.lang.String f220499l2;

    /* renamed from: m2, reason: collision with root package name */
    public int f220500m2;

    /* renamed from: n2, reason: collision with root package name */
    public java.util.List f220501n2;

    /* renamed from: o2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c f220502o2;

    /* renamed from: p2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15724x3096736f f220503p2;

    /* renamed from: q2, reason: collision with root package name */
    public java.lang.String f220504q2;

    /* renamed from: r2, reason: collision with root package name */
    public u33.h f220505r2;

    /* renamed from: s2, reason: collision with root package name */
    public boolean f220506s2;

    /* renamed from: t2, reason: collision with root package name */
    public long f220507t2;

    /* renamed from: u2, reason: collision with root package name */
    public long f220508u2;

    /* renamed from: v2, reason: collision with root package name */
    public android.view.View f220509v2;

    /* renamed from: w2, reason: collision with root package name */
    public android.widget.TextView f220510w2;

    /* renamed from: x2, reason: collision with root package name */
    public android.widget.ImageView f220511x2;

    /* renamed from: y2, reason: collision with root package name */
    public android.view.View f220512y2;

    /* renamed from: z2, reason: collision with root package name */
    public android.widget.TextView f220513z2;

    public C15859x7405890d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f220497j2 = 1;
        this.f220498k2 = new java.util.HashMap();
        this.f220506s2 = true;
        this.f220507t2 = 0L;
        this.f220508u2 = 0L;
        this.C2 = true;
        this.D2 = true;
        this.E2 = new java.util.concurrent.ConcurrentHashMap();
        this.F2 = new java.util.concurrent.CopyOnWriteArrayList();
        this.G2 = true;
        this.H2 = new java.util.LinkedList();
        this.J2 = -1L;
        this.K2 = 0L;
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.N2 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5766xc8f5ea30>(a0Var) { // from class: com.tencent.mm.plugin.game.chatroom.view.GameChatListView.1
            {
                this.f39173x3fe91575 = -175316448;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5766xc8f5ea30 c5766xc8f5ea30) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5766xc8f5ea30 c5766xc8f5ea302 = c5766xc8f5ea30;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d.this;
                if (!(c15859x7405890d.f220500m2 == 0)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d.n1(c15859x7405890d, c5766xc8f5ea302.f136083g.f89734a);
                }
                return false;
            }
        };
        this.O2 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5228x861e4ec9>(a0Var) { // from class: com.tencent.mm.plugin.game.chatroom.view.GameChatListView.2
            {
                this.f39173x3fe91575 = 2055016665;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5228x861e4ec9 c5228x861e4ec9) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5228x861e4ec9 c5228x861e4ec92 = c5228x861e4ec9;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i3 i3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d.this.f220493f2;
                if (i3Var == null) {
                    return false;
                }
                long j17 = c5228x861e4ec92.f135561g.f89393a;
                java.util.Iterator it = i3Var.f220699e.iterator();
                int i17 = -1;
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67) it.next();
                    if (c15731x94356d67.seq == j17) {
                        i17 = i3Var.f220699e.indexOf(c15731x94356d67);
                        it.remove();
                    }
                }
                if (i17 == -1) {
                    return false;
                }
                i3Var.m8155x27702c4(i17);
                return false;
            }
        };
        this.P2 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6163x3f788fd5>(a0Var) { // from class: com.tencent.mm.plugin.game.chatroom.view.GameChatListView.3
            {
                this.f39173x3fe91575 = -688779323;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6163x3f788fd5 c6163x3f788fd5) {
                java.lang.Object obj;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6163x3f788fd5 c6163x3f788fd52 = c6163x3f788fd5;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d.this;
                if (c15859x7405890d.f220493f2 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c6163x3f788fd52.f136423g.f89760a)) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i3 i3Var = c15859x7405890d.f220493f2;
                java.lang.String userName = c6163x3f788fd52.f136423g.f89760a;
                java.util.Set boundViewHolders = i3Var.f220703i;
                java.util.HashMap hashMap = c43.e1.f119953a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boundViewHolders, "boundViewHolders");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
                java.util.Iterator it = ((java.util.HashSet) boundViewHolders).iterator();
                if (it.hasNext()) {
                    java.lang.Object next = it.next();
                    if (it.hasNext()) {
                        c43.x xVar = (c43.x) next;
                        long j17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(xVar.f120028m.f36570xfd4da1cb, userName) ? xVar.f120028m.seq : 0L;
                        do {
                            java.lang.Object next2 = it.next();
                            c43.x xVar2 = (c43.x) next2;
                            long j18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(xVar2.f120028m.f36570xfd4da1cb, userName) ? xVar2.f120028m.seq : 0L;
                            if (j17 < j18) {
                                next = next2;
                                j17 = j18;
                            }
                        } while (it.hasNext());
                    }
                    obj = next;
                } else {
                    obj = null;
                }
                c43.x xVar3 = (c43.x) obj;
                if (xVar3 == null) {
                    return false;
                }
                xVar3.o(c43.e1.b(xVar3.S, xVar3.f120028m.f36570xfd4da1cb));
                return false;
            }
        };
        q1(context);
    }

    public static void m1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d) {
        c15859x7405890d.getClass();
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.x2 x2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.x2(c15859x7405890d);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(x2Var, 1000L, false);
    }

    public static void n1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d, int i17) {
        synchronized (c15859x7405890d) {
            android.view.View view = c15859x7405890d.f220509v2;
            if (view != null && view.getTag() == null) {
                if (i17 > 0) {
                    if (c15859x7405890d.f220509v2.getVisibility() == 8) {
                        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a.g(14L, 1L, c15859x7405890d.f220496i2, c15859x7405890d.f220495h2, 0L, "", 0L, c15859x7405890d.f220500m2);
                    }
                    android.view.View view2 = c15859x7405890d.f220509v2;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView", "refreshNewMsgTips", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView", "refreshNewMsgTips", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (c15859x7405890d.f220500m2 == 0) {
                        c15859x7405890d.f220511x2.setImageResource(com.p314xaae8f345.mm.R.raw.f79429xf9d8585b);
                    } else {
                        c15859x7405890d.f220511x2.setImageResource(com.p314xaae8f345.mm.R.raw.f79868x8752620f);
                    }
                    if (i17 >= 1000) {
                        c15859x7405890d.f220510w2.setText(c15859x7405890d.f220494g2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fnw));
                    } else {
                        c15859x7405890d.f220510w2.setText(c15859x7405890d.f220494g2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.foh, java.lang.Integer.valueOf(i17)));
                    }
                } else {
                    android.view.View view3 = c15859x7405890d.f220509v2;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView", "refreshNewMsgTips", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView", "refreshNewMsgTips", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setNoticeTag */
    public void m64429xcced5360(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.k3 k3Var) {
        if (k3Var == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.GameChatListView", "setNoticeTag, Seq:%d, text:%s", java.lang.Long.valueOf(k3Var.f220735a.seq), k3Var.f220735a.f36793xd74dee34);
        android.view.View view = this.f220512y2;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            boolean z17 = false;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView", "setNoticeTag", "(Lcom/tencent/mm/plugin/game/chatroom/view/GameChatListView$NoticeMsgWrapper;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView", "setNoticeTag", "(Lcom/tencent/mm/plugin/game/chatroom/view/GameChatListView$NoticeMsgWrapper;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f220513z2.setText(k3Var.f220735a.f36793xd74dee34);
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a.g(2L, 1L, this.f220496i2, this.f220495h2, k3Var.f220735a.seq, "", 0L, this.f220500m2);
            this.f220512y2.setTag(java.lang.Long.valueOf(k3Var.f220735a.seq));
            ((java.util.concurrent.ConcurrentHashMap) this.E2).clear();
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i3 i3Var = this.f220493f2;
            long j17 = k3Var.f220735a.seq;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) i3Var.f220709r.getLayoutManager();
            int w17 = c1162x665295de.w();
            int y17 = c1162x665295de.y();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.GameChatListView", "notifyAtEvent, atSeq:%d, firstVisibleItem:%d, lastVisibleItem:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(w17), java.lang.Integer.valueOf(y17));
            while (true) {
                if (w17 <= y17) {
                    if (w17 >= 0 && w17 < i3Var.f220699e.size() && ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67) i3Var.f220699e.get(w17)).seq == j17) {
                        i3Var.m8147xed6e4d18(w17);
                        z17 = true;
                        break;
                    }
                    w17++;
                } else {
                    break;
                }
            }
            if (z17) {
                return;
            }
            long j18 = k3Var.f220735a.seq - 2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.GameChatListView", "pre fetch at page, seq:%d", java.lang.Long.valueOf(j18));
            gm0.j1.d().g(new v33.e(this.f220499l2, j18, 0L, 6, k3Var.f220735a.seq, this.f220500m2));
        }
    }

    @Override // u33.l
    public void I(java.util.Map map) {
        if (map != null) {
            java.util.Map map2 = this.f220498k2;
            ((java.util.HashMap) map2).clear();
            ((java.util.HashMap) map2).putAll(map);
            this.f220493f2.N();
        }
    }

    @Override // u33.l
    public void c0(int i17) {
    }

    /* renamed from: getFirstPageData */
    public void m64430x5e5629f3() {
        int i17 = this.f220500m2;
        if (i17 == 0) {
            return;
        }
        gm0.j1.d().g(new v33.e(this.f220499l2, 0L, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697, 3, 0L, i17));
    }

    public final void o1(java.util.List list, int i17, java.util.List list2) {
        if (list == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i3.y(this.f220493f2, list, i17, 0L, list2);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        gm0.j1.d().a(4562, this);
        gm0.j1.d().a(4565, this);
        this.N2.mo48813x58998cd();
        this.O2.mo48813x58998cd();
        this.P2.mo48813x58998cd();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        java.util.Collection<? extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67> linkedList;
        super.onDetachedFromWindow();
        gm0.j1.d().q(4562, this);
        gm0.j1.d().q(4565, this);
        this.N2.mo48814x2efc64();
        this.O2.mo48814x2efc64();
        this.P2.mo48814x2efc64();
        java.util.List list = this.f220493f2.f220699e;
        if (this.f220505r2 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f220499l2)) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            linkedList = new java.util.LinkedList<>();
        } else {
            linkedList = list.subList(list.size() > 20 ? list.size() - 20 : 0, list.size());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15787x624e3a12 c15787x624e3a12 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15787x624e3a12();
        c15787x624e3a12.f36755x11465d28.addAll(linkedList);
        c15787x624e3a12.f36756xd4d2eca8 = ((y33.e) this.f220505r2).f66967xdde069b;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5580x225208dc c5580x225208dc = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5580x225208dc();
        am.we weVar = c5580x225208dc.f135902g;
        weVar.f89811a = 2;
        weVar.f89812b = "cache_game_chat_msg#" + this.f220499l2 + this.I2;
        try {
            weVar.f89813c = c15787x624e3a12.mo14344x5f01b1f6();
        } catch (java.io.IOException unused) {
        }
        c5580x225208dc.e();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        if (mo808xfb85f7b0 != 4562) {
            if (mo808xfb85f7b0 == 4565 && i17 == 0 && i18 == 0) {
                v33.r rVar = (v33.r) m1Var;
                java.lang.Object mo141623x754a37bb = rVar.f514677g.mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = ((com.p314xaae8f345.mm.p944x882e457a.o) mo141623x754a37bb).f152244b.f152233a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.PublishChatroomMsgResponse");
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i3 i3Var = this.f220493f2;
                long j17 = rVar.f514675e;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15828x8e93965d c15828x8e93965d = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15803xe9573740) fVar).f36824xce4135be;
                i3Var.getClass();
                ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.g3(i3Var, j17, c15828x8e93965d));
                java.util.Iterator it = ((java.util.HashSet) i3Var.f220703i).iterator();
                while (it.hasNext()) {
                    c43.x xVar = (c43.x) it.next();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 = xVar.f120028m;
                    if (c15731x94356d67 != null && c15731x94356d67.seq == j17) {
                        xVar.l(c15828x8e93965d, j17, true);
                    }
                }
                return;
            }
            return;
        }
        v33.e eVar = (v33.e) m1Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.GameChatListView", "GetGameChatRoomMsg callback, localChannelId:%d, requestChannelId:%d", java.lang.Integer.valueOf(this.f220500m2), java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15763xb94b7237) eVar.f514639e.f152243a.f152217a).f36694x8cea31d7));
        int i19 = this.f220500m2;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = eVar.f514639e;
        if (i19 != ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15763xb94b7237) oVar.f152243a.f152217a).f36694x8cea31d7) {
            return;
        }
        int i27 = eVar.f514640f;
        if (i27 == 1) {
            this.C2 = true;
        } else if (i27 == 2) {
            this.D2 = true;
        }
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15764x734a8999 c15764x734a8999 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15764x734a8999) oVar.f152244b.f152233a;
            if (i27 == 6) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(c15764x734a8999.f36698xfd2b63c6)) {
                    return;
                }
                ((java.util.concurrent.ConcurrentHashMap) this.E2).put(java.lang.Long.valueOf(eVar.f514641g), c15764x734a8999.f36698xfd2b63c6);
                return;
            }
            if (i27 != 4) {
                o1(c15764x734a8999.f36698xfd2b63c6, i27, null);
                return;
            }
            java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67> linkedList = c15764x734a8999.f36698xfd2b63c6;
            long j18 = eVar.f514641g;
            if (linkedList == null) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i3.y(this.f220493f2, linkedList, i27, j18, null);
        }
    }

    public synchronized void p1(java.util.List list, java.util.List list2, long j17, java.util.List list3) {
        if (this.G2) {
            this.C2 = true;
            this.D2 = true;
            this.f220506s2 = true;
            this.f220507t2 = 0L;
            this.K2 = 0L;
            this.f220508u2 = j17;
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("noticeMsgList:[");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list2)) {
                java.util.Iterator it = list2.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15795xe89e2969 c15795xe89e2969 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15795xe89e2969) it.next();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.k3 k3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.k3(null);
                    k3Var.f220735a = c15795xe89e2969;
                    ((java.util.LinkedList) this.H2).add(k3Var);
                    stringBuffer.append("(seq:" + c15795xe89e2969.seq + ", text:" + c15795xe89e2969.f36793xd74dee34 + ", highlight:" + c15795xe89e2969.f36792xd7658cb4 + ") ");
                }
            }
            stringBuffer.append("]");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.GameChatListView", "lastReceiveSeq:%d, %s", java.lang.Long.valueOf(this.f220508u2), stringBuffer.toString());
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5657x508065b c5657x508065b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5657x508065b();
            c5657x508065b.f135983g.f90098a = true;
            c5657x508065b.e();
        }
        this.f220493f2.L(list3, this.F2);
        for (java.util.Map.Entry entry : ((java.util.concurrent.ConcurrentHashMap) this.E2).entrySet()) {
            long longValue = ((java.lang.Long) entry.getKey()).longValue();
            java.util.List list4 = (java.util.List) entry.getValue();
            this.f220493f2.L(list3, list4);
            ((java.util.concurrent.ConcurrentHashMap) this.E2).put(java.lang.Long.valueOf(longValue), list4);
        }
        o1(list, 3, list3);
    }

    public final void q1(android.content.Context context) {
        this.f220494g2 = context;
        android.app.Activity activity = (android.app.Activity) context;
        this.f220495h2 = activity.getIntent().getLongExtra("game_report_sourceid", 0L);
        this.f220496i2 = activity.getIntent().getLongExtra("game_report_ssid", 0L);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context);
        this.A2 = c1162x665295de;
        mo7967x900dcbe1(c1162x665295de);
        m7964x8d4ad49c(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i3 i3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i3(this);
        this.f220493f2 = i3Var;
        i3Var.mo8164xbbdced85(true);
        mo7960x6cab2c8d(this.f220493f2);
        i(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.y2(this));
        this.B2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.r2(this);
    }

    public void r1(long j17, boolean z17) {
        if (j17 < 0) {
            this.f220509v2.setTag(null);
            this.f220509v2.performClick();
            return;
        }
        if (z17) {
            this.J2 = j17;
        }
        java.util.List list = (java.util.List) ((java.util.concurrent.ConcurrentHashMap) this.E2).get(java.lang.Long.valueOf(j17));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.GameChatListView", "locatePosition, request msg, seq:%d", java.lang.Long.valueOf(j17));
            gm0.j1.d().g(new v33.e(this.f220499l2, j17 - 2, 0L, 4, j17, this.f220500m2));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.GameChatListView", "locatePosition, use prefetch msg, seq:%d", java.lang.Long.valueOf(j17));
            if (list == null) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i3.y(this.f220493f2, list, 4, j17, null);
        }
    }

    public void s1() {
        int w17 = this.A2.w();
        int y17 = this.A2.y();
        int mo1894x7e414b06 = this.f220493f2.mo1894x7e414b06() - 1;
        if (mo1894x7e414b06 < w17 || mo1894x7e414b06 > y17) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = this.A2;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(mo1894x7e414b06));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView", "scrollToBottom", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c1162x665295de.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(c1162x665295de, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView", "scrollToBottom", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        post(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.w2(this, mo1894x7e414b06));
    }

    /* renamed from: setChatRoomInfo */
    public void m64431xc62e2123(java.lang.String str) {
        this.f220499l2 = str;
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a.d(1304L, this.f220496i2, this.f220495h2);
    }

    /* renamed from: setChatRoomJumpInfo */
    public void m64432xb8727ff1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15724x3096736f c15724x3096736f) {
        this.f220503p2 = c15724x3096736f;
    }

    /* renamed from: setHostContact */
    public void m64433x21b25396(u33.h hVar) {
        this.f220505r2 = hVar;
    }

    /* renamed from: setJumpFirstSeq */
    public void m64434x97990b5f(long j17) {
        this.M2 = j17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i3 i3Var = this.f220493f2;
        if (i3Var != null) {
            java.util.Iterator it = ((java.util.HashSet) i3Var.f220703i).iterator();
            while (it.hasNext()) {
                ((c43.x) it.next()).Y = i3Var.f220709r.M2;
            }
        }
    }

    /* renamed from: setPreloadInfo */
    public void m64435x49fad495(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c) {
        this.f220502o2 = c15780xf49d6a1c;
    }

    /* renamed from: setPremadeCardInfo */
    public void m64436xb9ff1174(java.lang.String str) {
        this.f220504q2 = str;
        this.f220493f2.N();
    }

    public void t1(int i17, java.util.List list) {
        java.lang.String str;
        this.f220500m2 = i17;
        if (i17 == 0) {
            str = "";
        } else {
            str = "#" + this.f220500m2;
        }
        this.I2 = str;
        this.f220501n2 = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r2 != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void u1(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5745x9ed8c837 r12) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d.u1(com.tencent.mm.autogen.events.NewUserNoticeEvent):void");
    }

    public C15859x7405890d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f220497j2 = 1;
        this.f220498k2 = new java.util.HashMap();
        this.f220506s2 = true;
        this.f220507t2 = 0L;
        this.f220508u2 = 0L;
        this.C2 = true;
        this.D2 = true;
        this.E2 = new java.util.concurrent.ConcurrentHashMap();
        this.F2 = new java.util.concurrent.CopyOnWriteArrayList();
        this.G2 = true;
        this.H2 = new java.util.LinkedList();
        this.J2 = -1L;
        this.K2 = 0L;
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.N2 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5766xc8f5ea30>(a0Var) { // from class: com.tencent.mm.plugin.game.chatroom.view.GameChatListView.1
            {
                this.f39173x3fe91575 = -175316448;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5766xc8f5ea30 c5766xc8f5ea30) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5766xc8f5ea30 c5766xc8f5ea302 = c5766xc8f5ea30;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d.this;
                if (!(c15859x7405890d.f220500m2 == 0)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d.n1(c15859x7405890d, c5766xc8f5ea302.f136083g.f89734a);
                }
                return false;
            }
        };
        this.O2 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5228x861e4ec9>(a0Var) { // from class: com.tencent.mm.plugin.game.chatroom.view.GameChatListView.2
            {
                this.f39173x3fe91575 = 2055016665;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5228x861e4ec9 c5228x861e4ec9) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5228x861e4ec9 c5228x861e4ec92 = c5228x861e4ec9;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i3 i3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d.this.f220493f2;
                if (i3Var == null) {
                    return false;
                }
                long j17 = c5228x861e4ec92.f135561g.f89393a;
                java.util.Iterator it = i3Var.f220699e.iterator();
                int i172 = -1;
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67) it.next();
                    if (c15731x94356d67.seq == j17) {
                        i172 = i3Var.f220699e.indexOf(c15731x94356d67);
                        it.remove();
                    }
                }
                if (i172 == -1) {
                    return false;
                }
                i3Var.m8155x27702c4(i172);
                return false;
            }
        };
        this.P2 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6163x3f788fd5>(a0Var) { // from class: com.tencent.mm.plugin.game.chatroom.view.GameChatListView.3
            {
                this.f39173x3fe91575 = -688779323;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6163x3f788fd5 c6163x3f788fd5) {
                java.lang.Object obj;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6163x3f788fd5 c6163x3f788fd52 = c6163x3f788fd5;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d.this;
                if (c15859x7405890d.f220493f2 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c6163x3f788fd52.f136423g.f89760a)) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i3 i3Var = c15859x7405890d.f220493f2;
                java.lang.String userName = c6163x3f788fd52.f136423g.f89760a;
                java.util.Set boundViewHolders = i3Var.f220703i;
                java.util.HashMap hashMap = c43.e1.f119953a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boundViewHolders, "boundViewHolders");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
                java.util.Iterator it = ((java.util.HashSet) boundViewHolders).iterator();
                if (it.hasNext()) {
                    java.lang.Object next = it.next();
                    if (it.hasNext()) {
                        c43.x xVar = (c43.x) next;
                        long j17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(xVar.f120028m.f36570xfd4da1cb, userName) ? xVar.f120028m.seq : 0L;
                        do {
                            java.lang.Object next2 = it.next();
                            c43.x xVar2 = (c43.x) next2;
                            long j18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(xVar2.f120028m.f36570xfd4da1cb, userName) ? xVar2.f120028m.seq : 0L;
                            if (j17 < j18) {
                                next = next2;
                                j17 = j18;
                            }
                        } while (it.hasNext());
                    }
                    obj = next;
                } else {
                    obj = null;
                }
                c43.x xVar3 = (c43.x) obj;
                if (xVar3 == null) {
                    return false;
                }
                xVar3.o(c43.e1.b(xVar3.S, xVar3.f120028m.f36570xfd4da1cb));
                return false;
            }
        };
        q1(context);
    }
}
