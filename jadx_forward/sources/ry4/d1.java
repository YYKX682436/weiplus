package ry4;

/* loaded from: classes.dex */
public final class d1 extends wm3.a {

    /* renamed from: o, reason: collision with root package name */
    public static int f483140o = 100;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f483141d;

    /* renamed from: e, reason: collision with root package name */
    public ry4.g f483142e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f483143f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f483144g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.g1 f483145h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f483146i;

    /* renamed from: m, reason: collision with root package name */
    public rl5.r f483147m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f483148n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f483141d = "";
        this.f483143f = new java.util.ArrayList();
        this.f483144g = kz5.p0.f395529d;
    }

    public final void T6() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f483146i;
        if (c22849x81a93d25 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null) {
            P6.mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f575431pk1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = P6();
        if (P62 != null) {
            P62.mo54448x9c8c0d33(new ry4.p0(this));
        }
        android.view.View findViewById = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.v4v);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "exitEditMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "exitEditMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById2 = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.v4u);
        if (findViewById2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "exitEditMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "exitEditMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.util.List list = this.f483143f;
        boolean z17 = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(list, this.f483144g);
        ry4.g gVar = this.f483142e;
        if (gVar != null) {
            gVar.f483162m = false;
            gVar.f483163n.clear();
            int childCount = c22849x81a93d25.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = c22849x81a93d25.getChildAt(i17);
                if (childAt != null) {
                    childAt.setTag(com.p314xaae8f345.mm.R.id.v59, "PAYLOAD_EXIT_EDIT");
                }
            }
            int size = gVar.f483156d.size();
            for (int i18 = 0; i18 < size; i18++) {
                gVar.m8148xed6e4d18(i18, "PAYLOAD_EXIT_EDIT");
            }
        }
        if (z17) {
            try {
                java.util.Map k17 = kz5.c1.k(new jz5.l("weclawbot_username", this.f483141d), new jz5.l("clawbot_shortcut_count", java.lang.Integer.valueOf(((java.util.ArrayList) list).size())));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("clawbot_shortcut_sort_succ", k17, 37790);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShortcutCommandListUIC", "reportSortSucc: params=%s", k17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShortcutCommandListUIC", e17, "reportSortSucc failed", new java.lang.Object[0]);
            }
            X6(kz5.n0.S0(list));
        }
    }

    public final void U6() {
        java.lang.String fj6 = ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).fj(this.f483141d);
        java.util.List list = this.f483143f;
        ((java.util.ArrayList) list).clear();
        ((java.util.ArrayList) list).addAll(V6(fj6));
        Z6();
        ry4.g gVar = this.f483142e;
        if (gVar != null) {
            gVar.m8146xced61ae5();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShortcutCommandListUIC", "loadData: loaded %d commands for %s", java.lang.Integer.valueOf(((java.util.ArrayList) list).size()), this.f483141d);
    }

    public final java.util.List V6(java.lang.String str) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        kz5.p0 p0Var = kz5.p0.f395529d;
        if (K0) {
            return p0Var;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
                if (optJSONObject != null) {
                    java.lang.String optString = optJSONObject.optString("content", "");
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                        int optInt = optJSONObject.optInt(dm.i4.f66865x76d1ec5a, 0);
                        java.lang.String optString2 = optJSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                        arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8(optInt, optString2, optString));
                    }
                }
            }
            return arrayList;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShortcutCommandListUIC", e17, "parse shortcut list failed", new java.lang.Object[0]);
            return p0Var;
        }
    }

    public final void W6(int i17, java.util.List list) {
        try {
            java.util.Map k17 = kz5.c1.k(new jz5.l("weclawbot_username", this.f483141d), new jz5.l("clawbot_delete_shortcut_count", java.lang.Integer.valueOf(i17)), new jz5.l("clawbot_shortcut_count", java.lang.Integer.valueOf(((java.util.ArrayList) this.f483143f).size())), new jz5.l("clawbot_shortcut_index_list", kz5.n0.g0(list, "#", null, null, 0, null, null, 62, null)));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("clawbot_shortcut_delete_end", k17, 37790);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShortcutCommandListUIC", "reportDeleteEnd: params=%s", k17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShortcutCommandListUIC", e17, "reportDeleteEnd failed", new java.lang.Object[0]);
        }
    }

    public final void X6(java.util.List list) {
        vh0.f1 ij6 = ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).ij(this.f483141d);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8 c19510x90fb7cb8 = (com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8) it.next();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(dm.i4.f66865x76d1ec5a, c19510x90fb7cb8.f269612d);
            jSONObject.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, c19510x90fb7cb8.f269613e);
            jSONObject.put("content", c19510x90fb7cb8.f269614f);
            jSONArray.put(jSONObject);
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONArray2, "toString(...)");
        xh0.e eVar = (xh0.e) ij6;
        eVar.b(jSONArray2);
        eVar.a();
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            v65.i.b(c20976x6ba6452a, null, new ry4.b1(list, this, null), 1, null);
        }
    }

    public final void Y6(int i17) {
        android.widget.TextView textView = (android.widget.TextView) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f568449v53);
        android.widget.TextView textView2 = (android.widget.TextView) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.v4w);
        if (i17 > 0) {
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (textView != null) {
                textView.setText(m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.pjw, java.lang.Integer.valueOf(i17)));
            }
        } else if (textView != null) {
            textView.setVisibility(4);
        }
        if (textView2 != null) {
            textView2.setEnabled(i17 > 0);
        }
        if (textView2 == null) {
            return;
        }
        textView2.setAlpha(i17 > 0 ? 1.0f : 0.3f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [int] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v20 */
    public final void Z6() {
        java.util.List list;
        android.widget.TextView textView;
        ?? r132;
        java.lang.Integer num;
        java.lang.Integer num2;
        boolean z17;
        java.util.List list2;
        android.widget.TextView textView2;
        java.lang.Integer num3;
        java.lang.Integer num4;
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f568447v51);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f483146i;
        android.view.View findViewById = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.v4x);
        android.widget.TextView textView3 = (android.widget.TextView) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.v4y);
        android.view.View findViewById2 = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.v4t);
        android.view.View findViewById3 = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.v4s);
        java.util.List list3 = this.f483143f;
        if (((java.util.ArrayList) list3).isEmpty()) {
            if (mo144222x4ff8c0f0 == null) {
                num3 = 8;
                list = list3;
                textView = textView3;
                r132 = 0;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                textView = textView3;
                list = list3;
                r132 = 0;
                num3 = 8;
                yj0.a.d(mo144222x4ff8c0f0, arrayList.toArray(), "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "updateEmptyState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "updateEmptyState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (c22849x81a93d25 != null) {
                c22849x81a93d25.setVisibility(8);
            }
            if (findViewById2 == null) {
                num4 = num3;
            } else {
                ?? arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                num4 = num3;
                arrayList2.add(num4);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "updateEmptyState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(r132)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "updateEmptyState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (findViewById3 != null) {
                ?? arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(num4);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "updateEmptyState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(r132)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "updateEmptyState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ?? r47 = mo144222x4ff8c0f0 != null ? (android.widget.TextView) mo144222x4ff8c0f0.findViewById(com.p314xaae8f345.mm.R.id.v4z) : null;
            android.widget.TextView textView4 = mo144222x4ff8c0f0 != null ? (android.widget.TextView) mo144222x4ff8c0f0.findViewById(com.p314xaae8f345.mm.R.id.v50) : null;
            if (this.f483148n) {
                if (r47 != null) {
                    r47.setVisibility(8);
                }
                if (textView4 != null) {
                    textView4.setText(com.p314xaae8f345.mm.R.C30867xcad56011.pjz);
                }
            } else {
                if (r47 != null) {
                    r47.setVisibility(r132);
                }
                if (textView4 != null) {
                    textView4.setText(com.p314xaae8f345.mm.R.C30867xcad56011.pjy);
                }
                if (r47 != null) {
                    r47.setOnClickListener(new ry4.c1(this));
                }
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
            if (abstractActivityC21394xb3d2c0cf != null) {
                abstractActivityC21394xb3d2c0cf.mo78530x8b45058f();
            }
        } else {
            list = list3;
            textView = textView3;
            r132 = 0;
            if (mo144222x4ff8c0f0 == null) {
                num = 0;
            } else {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                num = 0;
                yj0.a.d(mo144222x4ff8c0f0, arrayList4.toArray(), "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "updateEmptyState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "updateEmptyState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (c22849x81a93d25 != null) {
                c22849x81a93d25.setVisibility(0);
            }
            if (!this.f483148n) {
                if (findViewById2 == null) {
                    num2 = num;
                } else {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                    num2 = num;
                    arrayList5.add(num2);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(findViewById2, arrayList5.toArray(), "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "updateEmptyState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "updateEmptyState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (findViewById3 != null) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                    arrayList6.add(num2);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(findViewById3, arrayList6.toArray(), "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "updateEmptyState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "updateEmptyState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        if (findViewById != null) {
            findViewById.setEnabled(!list.isEmpty());
        }
        if (findViewById == null) {
            z17 = r132;
            textView2 = textView;
            list2 = list;
        } else {
            float f17 = list.isEmpty() ^ true ? 1.0f : 0.3f;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
            arrayList7.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList7);
            z17 = r132;
            list2 = list;
            textView2 = textView;
            yj0.a.d(findViewById, arrayList7.toArray(), "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "updateEmptyState", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById.setAlpha(((java.lang.Float) arrayList7.get(z17 ? 1 : 0)).floatValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "updateEmptyState", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        boolean z18 = ((java.util.ArrayList) list2).size() < f483140o ? z17 : true;
        if (textView2 != null) {
            textView2.setEnabled(!z18);
        }
        if (textView2 == null) {
            return;
        }
        textView2.setAlpha(z18 ? 0.3f : 1.0f);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.eqb;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        ry4.g gVar = this.f483142e;
        if (!(gVar != null && gVar.f483162m)) {
            return false;
        }
        T6();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        android.widget.TextView textView;
        ry4.g gVar;
        super.mo739xfd763ae1(bundle);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("extra_username");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f483141d = stringExtra;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            m158354x19263085().finish();
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(this.f483141d, true);
        this.f483148n = n17 == null || !n17.r2();
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null) {
            P6.mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f575431pk1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = P6();
        if (P62 != null) {
            P62.mo54448x9c8c0d33(new ry4.q0(this));
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f568448v52);
        if (c22849x81a93d25 != null) {
            this.f483146i = c22849x81a93d25;
            this.f483142e = new ry4.g(this.f483143f, this.f483148n, new ry4.v0(this), new ry4.w0(this), new ry4.x0(this));
            p012xc85e97e9.p103xe821e364.p104xd1075a44.g1 g1Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.g1(new ry4.y0(this));
            this.f483145h = g1Var;
            g1Var.d(this.f483146i);
            ry4.g gVar2 = this.f483142e;
            if (gVar2 != null) {
                gVar2.f483161i = this.f483145h;
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.f483146i;
            if (c22849x81a93d252 != null) {
                c22849x81a93d252.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(m158354x19263085()));
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d253 = this.f483146i;
            if (c22849x81a93d253 != null) {
                c22849x81a93d253.mo7960x6cab2c8d(this.f483142e);
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d254 = this.f483146i;
            if (c22849x81a93d254 != null) {
                c22849x81a93d254.setNestedScrollingEnabled(false);
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d255 = this.f483146i;
            if (c22849x81a93d255 != null && (gVar = this.f483142e) != null) {
                if (gVar.f483164o == 0) {
                    gVar.f483164o = c22849x81a93d255.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
                }
                c22849x81a93d255.m7964x8d4ad49c(new ry4.j0(gVar.f483164o));
            }
            this.f483147m = new rl5.r(m158354x19263085());
        }
        if (this.f483148n) {
            android.view.View findViewById = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.v4s);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "setupBottomButtons", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "setupBottomButtons", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.v4t);
            if (findViewById2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "setupBottomButtons", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUIC", "setupBottomButtons", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.widget.TextView textView2 = (android.widget.TextView) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.v4y);
            if (textView2 != null && (textView = (android.widget.TextView) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.v4x)) != null) {
                textView2.setOnClickListener(new ry4.r0(this));
                textView.setOnClickListener(new ry4.s0(this));
                android.widget.TextView textView3 = (android.widget.TextView) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.v4w);
                if (textView3 != null) {
                    textView3.setOnClickListener(new ry4.t0(this));
                }
            }
        }
        android.view.View findViewById3 = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.v4s);
        if (findViewById3 != null) {
            android.view.View findViewById4 = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.v4t);
            com.p314xaae8f345.mm.ui.a4.e(findViewById3, true, false, 2, null);
            if (findViewById4 != null) {
                com.p314xaae8f345.mm.ui.a4.e(findViewById4, true, false, 2, null);
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d256 = this.f483146i;
            if (c22849x81a93d256 != null) {
                com.p314xaae8f345.mm.ui.a4.e(c22849x81a93d256, true, false, 2, null);
            }
        }
        f483140o = ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).cj().optInt("maxCommandCount", 100);
        U6();
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.ak(m158354x19263085(), iy1.c.ClawBotShortcutListPage);
        aVar.Ai(m158354x19263085(), new ry4.u0(this));
        aVar.ik(m158354x19263085(), 4, 37790);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        ry4.g gVar = this.f483142e;
        boolean z17 = false;
        if (gVar != null && gVar.f483162m) {
            z17 = true;
        }
        if (!z17) {
            U6();
            return;
        }
        java.util.List V6 = V6(((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).fj(this.f483141d));
        java.util.List list = this.f483143f;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(V6, list)) {
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        arrayList.clear();
        arrayList.addAll(V6);
        ry4.g gVar2 = this.f483142e;
        if (gVar2 != null) {
            gVar2.m8146xced61ae5();
        }
        Z6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShortcutCommandListUIC", "refreshDataQuietly: refreshed %d commands for %s", java.lang.Integer.valueOf(arrayList.size()), this.f483141d);
    }
}
