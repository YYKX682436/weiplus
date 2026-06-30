package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* loaded from: classes11.dex */
public class h0 extends android.widget.BaseAdapter implements com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.o0 f279338d;

    /* renamed from: n, reason: collision with root package name */
    public final android.content.SharedPreferences f279345n;

    /* renamed from: o, reason: collision with root package name */
    public final android.content.Context f279346o;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.ListView f279352u;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.q0 f279355x;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f279339e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f279340f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f279341g = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f279342h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f279343i = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f279344m = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f279347p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f279348q = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: r, reason: collision with root package name */
    public int[] f279349r = new int[0];

    /* renamed from: s, reason: collision with root package name */
    public boolean f279350s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f279351t = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f279353v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f279354w = true;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f279356y = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.e0(this, android.os.Looper.getMainLooper());

    /* renamed from: z, reason: collision with root package name */
    public long f279357z = 0;
    public long A = 0;

    public h0(android.content.Context context, android.widget.ListView listView, android.content.SharedPreferences sharedPreferences) {
        this.f279338d = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.o0(context);
        this.f279346o = context;
        this.f279352u = listView;
        this.f279345n = sharedPreferences;
    }

    public static java.lang.String k(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb.f279313q;
        if (str != null && str.length() > 0) {
            return c21560x1fce98fb.f279313q;
        }
        return "_anonymous_pref@" + c21560x1fce98fb.hashCode();
    }

    public static java.lang.String l(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        return c21560x1fce98fb.getClass().getName() + "L" + c21560x1fce98fb.k() + p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3049xa147da5f + c21560x1fce98fb.H;
    }

    public static boolean p(int i17) {
        return i17 == com.p314xaae8f345.mm.R.C30864xbddafb2a.byv || i17 == com.p314xaae8f345.mm.R.C30864xbddafb2a.f570828c11 || i17 == com.p314xaae8f345.mm.R.C30864xbddafb2a.f570830c13 || i17 == com.p314xaae8f345.mm.R.C30864xbddafb2a.b3d;
    }

    public static void s(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb, android.content.SharedPreferences sharedPreferences) {
        if (c21560x1fce98fb instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb;
            if (c21541x1c1b08fe.f279318v) {
                c21541x1c1b08fe.O(sharedPreferences.getBoolean(c21560x1fce98fb.f279313q, ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb).N()));
            }
        }
        if (c21560x1fce98fb instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21544x57e6e063) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21544x57e6e063 c21544x57e6e063 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21544x57e6e063) c21560x1fce98fb;
            if (c21544x57e6e063.f279318v) {
                java.lang.String string = sharedPreferences.getString(c21560x1fce98fb.f279313q, null);
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.i iVar = c21544x57e6e063.L;
                iVar.f279362h = string;
            }
        }
        if (c21560x1fce98fb instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21545xcb424ea5) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21545xcb424ea5 c21545xcb424ea5 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21545xcb424ea5) c21560x1fce98fb;
            if (c21545xcb424ea5.f279318v) {
                java.lang.String string2 = sharedPreferences.getString(c21560x1fce98fb.f279313q, null);
                c21545xcb424ea5.P = string2;
                c21545xcb424ea5.H(string2);
            }
        }
    }

    public void a(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.g0 g0Var) {
        java.util.List list = this.f279347p;
        if (((java.util.LinkedList) list).contains(g0Var)) {
            return;
        }
        ((java.util.LinkedList) list).add(g0Var);
    }

    public void c(android.widget.AbsListView.OnScrollListener onScrollListener) {
        if (onScrollListener == null) {
            return;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f279348q;
        if (copyOnWriteArrayList.size() == 0) {
            this.f279352u.setOnScrollListener(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.f0(this));
        }
        if (copyOnWriteArrayList.contains(onScrollListener)) {
            return;
        }
        copyOnWriteArrayList.add(onScrollListener);
    }

    public void d(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb, int i17) {
        f(c21560x1fce98fb, i17);
        if (this.f279350s) {
            return;
        }
        notifyDataSetChanged();
    }

    public final void f(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb, int i17) {
        java.lang.String k17 = k(c21560x1fce98fb);
        this.f279340f.put(k17, c21560x1fce98fb);
        java.util.LinkedList linkedList = this.f279339e;
        if (i17 == -1) {
            i17 = linkedList.size();
        }
        linkedList.add(i17, k17);
        java.util.HashMap hashMap = this.f279343i;
        if (!hashMap.containsKey(l(c21560x1fce98fb)) && this.f279350s) {
            hashMap.put(l(c21560x1fce98fb), java.lang.Integer.valueOf(hashMap.size()));
        }
        java.lang.String str = c21560x1fce98fb.f279319w;
        if (str != null) {
            this.f279344m.put(str + "|" + c21560x1fce98fb.f279313q, c21560x1fce98fb.f279313q);
        }
    }

    public void g(int i17) {
        this.f279350s = true;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.o0 o0Var = this.f279338d;
        o0Var.getClass();
        android.content.res.XmlResourceParser xml = o0Var.f279383a.getResources().getXml(i17);
        try {
            o0Var.c(xml, this, true);
            xml.close();
            this.f279350s = false;
            android.widget.ListView listView = this.f279352u;
            if (listView == null) {
                notifyDataSetChanged();
            } else {
                listView.setAdapter((android.widget.ListAdapter) this);
                notifyDataSetChanged();
            }
        } catch (java.lang.Throwable th6) {
            xml.close();
            throw th6;
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f279342h.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f279340f.get(this.f279342h.get(i17));
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        java.util.LinkedList linkedList = this.f279342h;
        if (i17 > linkedList.size() - 1) {
            return -1;
        }
        java.lang.Integer num = (java.lang.Integer) this.f279343i.get(l((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) this.f279340f.get(linkedList.get(i17))));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        android.view.ViewGroup viewGroup2;
        java.util.LinkedList linkedList = this.f279342h;
        if (i17 > linkedList.size()) {
            return view;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) this.f279340f.get(linkedList.get(i17));
        if (c21560x1fce98fb instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) {
            c21560x1fce98fb.D(this.f279355x);
        }
        if (this.f279343i.containsKey(l(c21560x1fce98fb))) {
            view2 = view;
            viewGroup2 = viewGroup;
        } else {
            viewGroup2 = viewGroup;
            view2 = null;
        }
        android.view.View p17 = c21560x1fce98fb.p(view2, viewGroup2);
        p17.setTag(com.p314xaae8f345.mm.R.id.pgt, linkedList.get(i17));
        int i18 = this.f279349r[i17];
        android.view.View findViewById = p17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        android.view.View findViewById2 = p17.findViewById(com.p314xaae8f345.mm.R.id.ofy);
        if (findViewById != null) {
            android.view.View findViewById3 = findViewById.findViewById(com.p314xaae8f345.mm.R.id.cg7);
            if (findViewById3 == null) {
                findViewById3 = findViewById.findViewById(com.p314xaae8f345.mm.R.id.oct);
            }
            findViewById.getPaddingLeft();
            findViewById.getPaddingRight();
            findViewById.getPaddingTop();
            findViewById.getPaddingBottom();
            int paddingLeft = p17.getPaddingLeft();
            int paddingRight = p17.getPaddingRight();
            int paddingTop = p17.getPaddingTop();
            int paddingBottom = p17.getPaddingBottom();
            int i19 = i18 & 2;
            android.content.Context context = this.f279346o;
            if (i19 != 0) {
                int paddingLeft2 = findViewById.getPaddingLeft();
                if (this.f279354w) {
                    findViewById.setBackground(com.p314xaae8f345.mm.ui.zk.d(context, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559855gp));
                }
                findViewById.setPadding(paddingLeft2, 0, 0, 0);
                if (findViewById3 != null && findViewById3.getBackground() != null) {
                    findViewById3.setBackground(null);
                }
            } else if (findViewById3 != null) {
                int paddingTop2 = findViewById3.getPaddingTop();
                int paddingBottom2 = findViewById3.getPaddingBottom();
                findViewById3.setBackground(com.p314xaae8f345.mm.ui.zk.d(context, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559855gp));
                findViewById3.setPadding(0, paddingTop2, 0, paddingBottom2);
                if (findViewById.getBackground() != null) {
                    findViewById.setBackground(null);
                }
            }
            p17.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.azm);
            p17.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
        if (findViewById2 != null) {
            if ((i18 & 1) == 0 || !this.f279353v) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/ui/base/preference/MMPreferenceAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/ui/base/preference/MMPreferenceAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/ui/base/preference/MMPreferenceAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/ui/base/preference/MMPreferenceAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        java.util.Iterator it = this.f279347p.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.g0) it.next()).a(p17, c21560x1fce98fb);
        }
        return p17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        if (!this.f279351t) {
            this.f279351t = true;
        }
        return java.lang.Math.max(1, this.f279343i.size());
    }

    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h(java.lang.String str) {
        return (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) this.f279340f.get(str);
    }

    public java.util.List j() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f279340f.values());
        java.util.Collections.sort(arrayList, new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.d0(this));
        return arrayList;
    }

    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe m(java.lang.String str, boolean z17) {
        java.util.HashSet hashSet = this.f279341g;
        if (z17) {
            if (hashSet.contains(str)) {
                return null;
            }
            hashSet.add(str);
        } else if (!hashSet.remove(str)) {
            return null;
        }
        notifyDataSetChanged();
        return null;
    }

    public int n(java.lang.String str) {
        return this.f279339e.indexOf(str);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        if (com.p314xaae8f345.mm.ui.bk.y()) {
            if (j62.e.g().i("clicfg_hwmagic_mmpreference_notify_switch", 1, true, true) == 1) {
                hashCode();
                java.lang.System.currentTimeMillis();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                long j17 = this.A;
                if (j17 == 0 || currentTimeMillis - j17 <= 5000 || currentTimeMillis - this.f279357z >= 1000) {
                    r();
                    this.f279357z = currentTimeMillis;
                    return;
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f279356y;
                boolean mo50285x8fc9be06 = n3Var.mo50285x8fc9be06(1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPreferenceAdapter", "ignore notifyDataSetChanged(%s %s), had:%s", java.lang.Long.valueOf(this.f279357z), java.lang.Long.valueOf(currentTimeMillis), java.lang.Boolean.valueOf(mo50285x8fc9be06));
                if (mo50285x8fc9be06) {
                    return;
                }
                n3Var.mo50307xb9e94560(1, 1000L);
                return;
            }
        }
        r();
    }

    public int o(java.lang.String str) {
        java.util.LinkedList linkedList = this.f279342h;
        if (linkedList == null) {
            return -1;
        }
        return linkedList.indexOf(str);
    }

    public boolean q(java.lang.String str) {
        return !this.f279341g.contains(str);
    }

    public final void r() {
        java.util.HashMap hashMap;
        java.util.LinkedList linkedList = this.f279342h;
        linkedList.clear();
        java.util.Iterator it = this.f279339e.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = this.f279340f;
            if (!hasNext) {
                break;
            }
            java.lang.String str = (java.lang.String) it.next();
            if (!this.f279341g.contains(str)) {
                if (hashMap.get(str) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMPreferenceAdapter", "not found pref by key " + str);
                } else {
                    linkedList.add(str);
                }
            }
        }
        if (!linkedList.isEmpty()) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) hashMap.get(linkedList.get(0))).k();
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i17 = 0; i17 < linkedList.size(); i17++) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) hashMap.get(linkedList.get(i17));
            if ((c21560x1fce98fb instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21561x79ac8f19) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21560x1fce98fb.f279313q) && i17 != 0) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) hashMap.get(linkedList.get(i17 - 1));
                if (c21560x1fce98fb2 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21561x79ac8f19) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21560x1fce98fb2.f279313q) && (c21560x1fce98fb2.o() == null || c21560x1fce98fb2.o().toString().trim().length() <= 0)) {
                        hashSet.add(k(c21560x1fce98fb2));
                    } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21560x1fce98fb.f279313q) && (c21560x1fce98fb.o() == null || c21560x1fce98fb.o().toString().trim().length() <= 0)) {
                        hashSet.add(k(c21560x1fce98fb));
                    }
                }
            }
        }
        linkedList.removeAll(hashSet);
        int[] iArr = new int[linkedList.size()];
        this.f279349r = iArr;
        if (iArr.length <= 0) {
            super.notifyDataSetChanged();
            return;
        }
        int length = iArr.length;
        android.content.SharedPreferences sharedPreferences = this.f279345n;
        if (length == 1) {
            int k17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) hashMap.get(linkedList.get(0))).k();
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb3 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) hashMap.get(linkedList.get(0));
            if (!p(k17)) {
                this.f279349r[0] = 4;
            } else if (c21560x1fce98fb3 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) {
                int[] iArr2 = this.f279349r;
                int i18 = iArr2[0] | 8;
                iArr2[0] = i18;
                iArr2[0] = i18 | 1;
            } else {
                this.f279349r[0] = 3;
            }
            s((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) hashMap.get(linkedList.get(0)), sharedPreferences);
            super.notifyDataSetChanged();
            return;
        }
        for (int i19 = 0; i19 < linkedList.size(); i19++) {
            s((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) hashMap.get(linkedList.get(i19)), sharedPreferences);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb4 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) hashMap.get(linkedList.get(i19));
            int k18 = c21560x1fce98fb4.k();
            if (p(k18)) {
                if (c21560x1fce98fb4 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) {
                    int[] iArr3 = this.f279349r;
                    iArr3[i19] = iArr3[i19] | 8;
                }
                if (i19 == 0) {
                    int[] iArr4 = this.f279349r;
                    int i27 = iArr4[i19] | 1;
                    iArr4[i19] = i27;
                    iArr4[i19] = i27 | 16;
                } else {
                    if (i19 == linkedList.size() - 1) {
                        int[] iArr5 = this.f279349r;
                        iArr5[i19] = iArr5[i19] | 2;
                    }
                    int k19 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) hashMap.get(linkedList.get(i19 - 1))).k();
                    if ((k19 != com.p314xaae8f345.mm.R.C30864xbddafb2a.byv && k19 != com.p314xaae8f345.mm.R.C30864xbddafb2a.b3d && k19 != com.p314xaae8f345.mm.R.C30864xbddafb2a.a2l) || k19 == com.p314xaae8f345.mm.R.C30864xbddafb2a.f570828c11 || k19 == com.p314xaae8f345.mm.R.C30864xbddafb2a.f570830c13) {
                        int[] iArr6 = this.f279349r;
                        iArr6[i19] = iArr6[i19] | 1;
                    }
                }
            } else if (k18 != com.p314xaae8f345.mm.R.C30864xbddafb2a.c0d) {
                int[] iArr7 = this.f279349r;
                int i28 = iArr7[i19] | 4;
                iArr7[i19] = i28;
                if (i19 == 0) {
                    iArr7[i19] = i28 | 16;
                } else {
                    int i29 = i19 - 1;
                    int k27 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) hashMap.get(linkedList.get(i29))).k();
                    if (p(k27) || k27 == com.p314xaae8f345.mm.R.C30864xbddafb2a.c0d) {
                        int[] iArr8 = this.f279349r;
                        iArr8[i29] = iArr8[i29] | 2;
                    }
                }
            } else if (i19 == 0) {
                int[] iArr9 = this.f279349r;
                int i37 = iArr9[i19] | 4;
                iArr9[i19] = i37;
                iArr9[i19] = i37 | 16;
            } else {
                int i38 = i19 - 1;
                int k28 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) hashMap.get(linkedList.get(i38))).k();
                if (k28 == com.p314xaae8f345.mm.R.C30864xbddafb2a.byv || k28 == com.p314xaae8f345.mm.R.C30864xbddafb2a.f570828c11 || k28 == com.p314xaae8f345.mm.R.C30864xbddafb2a.f570830c13) {
                    int[] iArr10 = this.f279349r;
                    iArr10[i38] = iArr10[i38] | 2;
                }
            }
        }
        super.notifyDataSetChanged();
    }

    public void t() {
        this.f279342h.clear();
        this.f279340f.clear();
        this.f279339e.clear();
        this.f279341g.clear();
        notifyDataSetChanged();
    }

    public void u(android.widget.AbsListView.OnScrollListener onScrollListener) {
        if (onScrollListener == null) {
            return;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f279348q;
        copyOnWriteArrayList.remove(onScrollListener);
        if (copyOnWriteArrayList.size() == 0) {
            this.f279352u.setOnScrollListener(null);
        }
    }

    public boolean v(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        if (c21560x1fce98fb == null) {
            return false;
        }
        java.lang.String k17 = k(c21560x1fce98fb);
        this.f279339e.remove(k17);
        this.f279340f.remove(k17);
        this.f279341g.remove(c21560x1fce98fb.f279313q);
        notifyDataSetChanged();
        return true;
    }

    public boolean w(java.lang.String str) {
        return v(h(str));
    }
}
