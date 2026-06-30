package cw1;

/* loaded from: classes12.dex */
public final class o0 extends ql5.d {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d f304719d;

    /* renamed from: e, reason: collision with root package name */
    public long[] f304720e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f304721f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f304722g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f304723h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[][] f304724i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List[] f304725j;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f304719d = activity;
        java.lang.Integer[][] numArr = cw1.t2.f304866a;
        this.f304720e = new long[12];
        this.f304721f = new boolean[12];
        this.f304722g = new boolean[12];
        int i17 = 0;
        for (boolean z17 : cw1.t2.f304867b) {
            if (z17) {
                i17++;
            }
        }
        this.f304723h = new java.util.ArrayList(i17 + 12);
        java.lang.Integer[][] numArr2 = cw1.t2.f304866a;
        this.f304724i = new boolean[12];
        this.f304725j = new java.util.List[12];
        h(new long[21]);
    }

    @Override // ql5.d
    public android.view.View b(int i17, int i18, boolean z17, android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            view = this.f304719d.getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570145yl, viewGroup, false);
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.bxf);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.odf);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
            android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.mzv);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
            view.setTag(new cw1.l0((android.widget.CheckBox) findViewById, (android.widget.TextView) findViewById2, (android.widget.TextView) findViewById3));
        }
        java.lang.Object tag = view.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheAdapter.ChildViewHolder");
        cw1.l0 l0Var = (cw1.l0) tag;
        java.lang.Object obj = this.f304723h.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        int intValue = ((java.lang.Number) obj).intValue();
        java.util.List list = this.f304725j[intValue];
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
        boolean[] zArr = this.f304724i[intValue];
        l0Var.f304628a.setChecked(zArr != null ? zArr[i18] : false);
        l0Var.f304629b.setText(((cw1.j) list.get(i18)).f304543b);
        l0Var.f304630c.setText(fp.n0.a(((cw1.j) list.get(i18)).f304544c));
        return view;
    }

    @Override // ql5.d
    public int c(int i17) {
        java.util.List list;
        java.lang.Object obj = this.f304723h.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        int intValue = ((java.lang.Number) obj).intValue();
        if (intValue >= 0 && (list = this.f304725j[intValue]) != null) {
            return list.size();
        }
        return 0;
    }

    public final void d(boolean z17) {
        kz5.v.v(this.f304721f, z17, 0, 0, 6, null);
        for (boolean[] zArr : this.f304724i) {
            if (zArr != null) {
                kz5.v.v(zArr, z17, 0, 0, 6, null);
            }
        }
        notifyDataSetChanged();
    }

    public final java.util.List e(int i17, boolean z17) {
        java.util.List list;
        boolean[] zArr = this.f304724i[i17];
        kz5.p0 p0Var = kz5.p0.f395529d;
        if (zArr == null || (list = this.f304725j[i17]) == null) {
            return p0Var;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int length = zArr.length;
        for (int i18 = 0; i18 < length; i18++) {
            if (zArr[i18] == z17) {
                java.lang.Object obj = list.get(i18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.clean.ui.fileindexui.ChildData<T of com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheAdapter.getCheckedChildren>");
                arrayList.add((cw1.j) obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r8[r7] == true) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long f() {
        /*
            r10 = this;
            long[] r0 = r10.f304720e
            int r0 = r0.length
            r1 = 0
            r3 = 0
            r4 = r3
        L7:
            if (r4 >= r0) goto L41
            boolean[] r5 = r10.f304721f
            boolean r5 = r5[r4]
            if (r5 == 0) goto L15
            long[] r5 = r10.f304720e
            r6 = r5[r4]
            long r1 = r1 + r6
            goto L3e
        L15:
            java.util.List[] r5 = r10.f304725j
            r5 = r5[r4]
            if (r5 != 0) goto L1c
            goto L3e
        L1c:
            int r6 = r5.size()
            r7 = r3
        L21:
            if (r7 >= r6) goto L3e
            boolean[][] r8 = r10.f304724i
            r8 = r8[r4]
            if (r8 == 0) goto L2f
            boolean r8 = r8[r7]
            r9 = 1
            if (r8 != r9) goto L2f
            goto L30
        L2f:
            r9 = r3
        L30:
            if (r9 == 0) goto L3b
            java.lang.Object r8 = r5.get(r7)
            cw1.j r8 = (cw1.j) r8
            long r8 = r8.f304544c
            long r1 = r1 + r8
        L3b:
            int r7 = r7 + 1
            goto L21
        L3e:
            int r4 = r4 + 1
            goto L7
        L41:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cw1.o0.f():long");
    }

    public final void g(int i17, java.util.List data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f304725j[i17] = data;
        boolean z17 = this.f304721f[i17];
        int size = data.size();
        boolean[] zArr = new boolean[size];
        for (int i18 = 0; i18 < size; i18++) {
            zArr[i18] = z17;
        }
        this.f304724i[i17] = zArr;
        boolean[] zArr2 = this.f304722g;
        if (zArr2[i17]) {
            java.util.Iterator it = this.f304723h.iterator();
            int i19 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i19 = -1;
                    break;
                } else if (((java.lang.Number) it.next()).intValue() == i17) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i19 >= 0) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22700x2b5d269a c22700x2b5d269a = this.f304719d.f177222d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22700x2b5d269a);
                c22700x2b5d269a.d(i19);
            }
            zArr2[i17] = false;
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.ExpandableListAdapter
    public java.lang.Object getChild(int i17, int i18) {
        java.lang.Object obj = this.f304723h.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        java.util.List list = this.f304725j[((java.lang.Number) obj).intValue()];
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
        return list.get(i18);
    }

    @Override // android.widget.ExpandableListAdapter
    public long getChildId(int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(">>> getChildId: ");
        sb6.append(i17);
        sb6.append(", ");
        sb6.append(i18);
        sb6.append(", ");
        java.util.ArrayList arrayList = this.f304723h;
        sb6.append(arrayList);
        sb6.append(", ");
        java.util.List[] listArr = this.f304725j;
        sb6.append(listArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCacheUI", sb6.toString());
        java.lang.Object obj = arrayList.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        java.util.List list = listArr[((java.lang.Number) obj).intValue()];
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
        return ((cw1.j) list.get(i18)).f304542a;
    }

    @Override // android.widget.ExpandableListAdapter
    public java.lang.Object getGroup(int i17) {
        java.lang.Object obj = this.f304723h.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        int intValue = ((java.lang.Number) obj).intValue();
        if (intValue < 0) {
            return null;
        }
        return java.lang.Long.valueOf(this.f304720e[intValue]);
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        return this.f304723h.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public long getGroupId(int i17) {
        return ((java.lang.Number) this.f304723h.get(i17)).intValue();
    }

    @Override // android.widget.ExpandableListAdapter
    public android.view.View getGroupView(int i17, boolean z17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d activityC13111x890e232d;
        android.view.View view2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d activityC13111x890e232d2 = this.f304719d;
        if (view == null) {
            view2 = activityC13111x890e232d2.getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570146ym, viewGroup, false);
            android.view.View findViewById = view2.findViewById(com.p314xaae8f345.mm.R.id.bxj);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            android.view.View findViewById2 = view2.findViewById(com.p314xaae8f345.mm.R.id.bxi);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
            android.view.View findViewById3 = view2.findViewById(com.p314xaae8f345.mm.R.id.bxf);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
            android.view.View findViewById4 = view2.findViewById(com.p314xaae8f345.mm.R.id.odf);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
            android.view.View findViewById5 = view2.findViewById(com.p314xaae8f345.mm.R.id.cut);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
            android.view.View findViewById6 = view2.findViewById(com.p314xaae8f345.mm.R.id.mzv);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
            android.view.View findViewById7 = view2.findViewById(com.p314xaae8f345.mm.R.id.dka);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
            android.view.View findViewById8 = view2.findViewById(com.p314xaae8f345.mm.R.id.dk9);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
            android.view.View findViewById9 = view2.findViewById(com.p314xaae8f345.mm.R.id.dk_);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
            activityC13111x890e232d = activityC13111x890e232d2;
            view2.setTag(new cw1.m0(findViewById, findViewById2, (android.widget.CheckBox) findViewById3, (android.widget.TextView) findViewById4, (android.widget.TextView) findViewById5, (android.widget.TextView) findViewById6, (android.widget.TextView) findViewById7, (android.widget.ImageView) findViewById8, findViewById9));
        } else {
            activityC13111x890e232d = activityC13111x890e232d2;
            view2 = view;
        }
        java.lang.Object tag = view2.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheAdapter.GroupViewHolder");
        cw1.m0 m0Var = (cw1.m0) tag;
        java.util.ArrayList arrayList = this.f304723h;
        java.lang.Object obj = arrayList.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        int intValue = ((java.lang.Number) obj).intValue();
        if (intValue < 0) {
            android.view.View view3 = m0Var.f304661b;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = m0Var.f304660a;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ImageView imageView = m0Var.f304667h;
            imageView.setVisibility(0);
            android.view.View view5 = m0Var.f304668i;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int i18 = i17 - 1;
            java.lang.Object obj2 = arrayList.get(i18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
            int intValue2 = ((java.lang.Number) obj2).intValue();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22700x2b5d269a c22700x2b5d269a = activityC13111x890e232d.f177222d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22700x2b5d269a);
            boolean isGroupExpanded = c22700x2b5d269a.isGroupExpanded(i18);
            android.widget.TextView textView = m0Var.f304666g;
            if (isGroupExpanded) {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.b7u);
                imageView.setRotation(270.0f);
            } else {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.b7v);
                imageView.setRotation(90.0f);
                if (this.f304722g[intValue2]) {
                    imageView.setVisibility(8);
                    android.view.View view6 = m0Var.f304668i;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(0);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d activityC13111x890e232d3 = activityC13111x890e232d;
            android.view.View view7 = m0Var.f304660a;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view7, arrayList6.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view8 = m0Var.f304661b;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view8, arrayList7.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m0Var.f304662c.setChecked(this.f304721f[intValue]);
            m0Var.f304663d.setText(activityC13111x890e232d3.getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559508e)[intValue]);
            m0Var.f304665f.setText(fp.n0.a(this.f304720e[intValue]));
            java.lang.String str = activityC13111x890e232d3.getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559509b5)[intValue];
            android.widget.TextView textView2 = m0Var.f304664e;
            if (str != null) {
                if (!(str.length() == 0)) {
                    textView2.setVisibility(0);
                    textView2.setText(str);
                }
            }
            textView2.setVisibility(8);
        }
        return view2;
    }

    public final void h(long[] tagsResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagsResult, "tagsResult");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCacheUI", "setGroupData: " + tagsResult);
        java.lang.Integer[][] numArr = cw1.t2.f304866a;
        long[] jArr = new long[12];
        int i17 = 0;
        while (true) {
            long j17 = 0;
            if (i17 >= 12) {
                break;
            }
            for (java.lang.Integer num : cw1.t2.f304866a[i17]) {
                j17 += tagsResult[num.intValue()];
            }
            jArr[i17] = j17;
            i17++;
        }
        this.f304720e = jArr;
        java.util.ArrayList arrayList = new java.util.ArrayList(jArr.length);
        int length = jArr.length;
        int i18 = 0;
        int i19 = 0;
        while (i18 < length) {
            arrayList.add(new jz5.l(java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(jArr[i18])));
            i18++;
            i19++;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(this.f304720e.length);
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((java.lang.Number) ((jz5.l) next).f384367e).longValue() > 0) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.size() > 1) {
            kz5.g0.t(arrayList2, new cw1.n0());
        }
        java.util.ArrayList arrayList3 = this.f304723h;
        arrayList3.clear();
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            int intValue = ((java.lang.Number) ((jz5.l) it6.next()).f384366d).intValue();
            arrayList3.add(java.lang.Integer.valueOf(intValue));
            if (cw1.t2.f304867b[intValue]) {
                arrayList3.add(-1);
            }
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int i17, int i18) {
        return true;
    }
}
