package cw1;

/* loaded from: classes12.dex */
public class j3 extends android.widget.BaseAdapter implements com.p314xaae8f345.mm.ui.p2708x5ccaae3b.t {

    /* renamed from: t, reason: collision with root package name */
    public static int f304554t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f304555u = {"application/msword", "application/pdf", "application/vnd.ms-excel", "application/vnd.ms-powerpoint", "application/vnd.openxmlformats-officedocument.presentationml.presentation", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "application/vnd.openxmlformats-officedocument.wordprocessingml.document"};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f304556v = {com.p314xaae8f345.mm.R.C30859x5a72f63.f81545if, com.p314xaae8f345.mm.R.C30859x5a72f63.f560363ig, com.p314xaae8f345.mm.R.C30859x5a72f63.f560367ij, com.p314xaae8f345.mm.R.C30859x5a72f63.f560364ih, com.p314xaae8f345.mm.R.C30859x5a72f63.f560364ih, com.p314xaae8f345.mm.R.C30859x5a72f63.f560367ij, com.p314xaae8f345.mm.R.C30859x5a72f63.f81545if};

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13115xef650a1b f304558e;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f304560g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f304561h;

    /* renamed from: i, reason: collision with root package name */
    public final long f304562i;

    /* renamed from: m, reason: collision with root package name */
    public final long f304563m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f304564n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f304565o = false;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2708x5ccaae3b.m f304566p = new cw1.C28108x5ed7638(this);

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.AdapterView.OnItemClickListener f304567q = new cw1.k3(this);

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f304568r = new cw1.l3(this);

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.AbsListView.OnScrollListener f304569s = new cw1.m3(this);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f304557d = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f304559f = new java.util.ArrayList();

    public j3(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13115xef650a1b activityC13115xef650a1b, java.lang.String str, int[] iArr, long j17, long j18) {
        this.f304558e = activityC13115xef650a1b;
        this.f304560g = str;
        this.f304561h = iArr;
        this.f304562i = j17;
        this.f304563m = j18;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public bw1.l getItem(int i17) {
        return (bw1.l) this.f304559f.get(i17);
    }

    public final void c() {
        java.util.HashSet hashSet = this.f304557d;
        int size = hashSet.size();
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13115xef650a1b activityC13115xef650a1b = this.f304558e;
        activityC13115xef650a1b.getClass();
        activityC13115xef650a1b.f177261g.setEnabled(size > 0);
        boolean isEmpty = hashSet.isEmpty();
        java.util.ArrayList arrayList = this.f304559f;
        activityC13115xef650a1b.f177259e.setText(!isEmpty && hashSet.size() == arrayList.size() ? com.p314xaae8f345.mm.R.C30867xcad56011.aq8 : com.p314xaae8f345.mm.R.C30867xcad56011.f571527hu);
        java.util.Iterator it = hashSet.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            j17 += ((bw1.l) arrayList.get(((java.lang.Integer) it.next()).intValue())).f106342a;
        }
        if (j17 > 0) {
            activityC13115xef650a1b.f177260f.setText(activityC13115xef650a1b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bom, fp.n0.a(j17)));
        } else {
            activityC13115xef650a1b.f177260f.setText("");
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f304559f.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(final int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        cw1.p3 p3Var;
        android.view.View view2;
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13115xef650a1b activityC13115xef650a1b = this.f304558e;
        if (view == null) {
            view2 = activityC13115xef650a1b.getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570152j8, viewGroup, false);
            p3Var = new cw1.p3();
            p3Var.f304749a = (com.p314xaae8f345.mm.ui.C21405x85fc1ce0) view2.findViewById(com.p314xaae8f345.mm.R.id.chd);
            p3Var.f304752d = (android.widget.CheckBox) view2.findViewById(com.p314xaae8f345.mm.R.id.mie);
            p3Var.f304753e = view2.findViewById(com.p314xaae8f345.mm.R.id.mig);
            p3Var.f304754f = view2.findViewById(com.p314xaae8f345.mm.R.id.mkj);
            p3Var.f304755g = view2.findViewById(com.p314xaae8f345.mm.R.id.f568104lp1);
            p3Var.f304750b = view2.findViewById(com.p314xaae8f345.mm.R.id.oro);
            p3Var.f304751c = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.ors);
            p3Var.f304756h = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.oru);
            p3Var.f304757i = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.k3s);
            p3Var.f304758j = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f564455rw);
            view2.setTag(p3Var);
        } else {
            p3Var = (cw1.p3) view.getTag();
            view2 = view;
        }
        bw1.l item = getItem(i17);
        boolean z17 = (p3Var.f304749a.getTag() == null || java.lang.String.valueOf(p3Var.f304749a.getTag()).equals(item.f106345d)) ? false : true;
        p3Var.f304749a.setTag(item.f106345d);
        n11.a.b().a(null, p3Var.f304749a);
        p3Var.f304753e.setOnClickListener(new android.view.View.OnClickListener() { // from class: cw1.j3$$c
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view3) {
                cw1.j3 j3Var = cw1.j3.this;
                j3Var.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int i18 = i17;
                arrayList.add(java.lang.Integer.valueOf(i18));
                arrayList.add(view3);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", j3Var, array);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanChattingDetailAdapter", "select position=%d", java.lang.Integer.valueOf(i18));
                java.util.HashSet hashSet = j3Var.f304557d;
                if (!hashSet.remove(java.lang.Integer.valueOf(i18))) {
                    hashSet.add(java.lang.Integer.valueOf(i18));
                }
                j3Var.c();
                j3Var.notifyDataSetChanged();
                yj0.a.h(j3Var, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        if (this.f304557d.contains(java.lang.Integer.valueOf(i17))) {
            p3Var.f304752d.setChecked(true);
            android.view.View view3 = p3Var.f304754f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            p3Var.f304752d.setChecked(false);
            android.view.View view4 = p3Var.f304754f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        p3Var.f304749a.setVisibility(0);
        p3Var.f304758j.setVisibility(8);
        if (item.f106343b == 3) {
            android.view.View view5 = p3Var.f304750b;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = p3Var.f304751c;
            int i18 = item.f106352k;
            textView.setText(i18 >= 0 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u(i18) : "");
        } else {
            android.view.View view6 = p3Var.f304750b;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int i19 = item.f106343b;
        if (i19 == 4) {
            p3Var.f304756h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572436b82);
            p3Var.f304756h.setVisibility(0);
            java.lang.String str = item.f106345d;
            if (str != null) {
                android.widget.TextView textView2 = p3Var.f304757i;
                java.lang.String str2 = item.f106350i;
                if (str2 == null) {
                    com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
                    java.lang.String str3 = a17.f294812f;
                    if (str3 != null) {
                        java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
                        if (!str3.equals(l17)) {
                            a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                        }
                    }
                    java.lang.String str4 = a17.f294812f;
                    int lastIndexOf = str4.lastIndexOf("/");
                    if (lastIndexOf >= 0) {
                        str4 = str4.substring(lastIndexOf + 1);
                    }
                    str2 = str4;
                }
                textView2.setText(str2);
                p3Var.f304757i.setVisibility(0);
                java.lang.String mimeTypeFromExtension = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(com.p314xaae8f345.mm.vfs.w6.n(item.f106345d));
                int binarySearch = mimeTypeFromExtension == null ? -1 : java.util.Arrays.binarySearch(f304555u, mimeTypeFromExtension);
                p3Var.f304749a.setImageDrawable(new android.graphics.drawable.ColorDrawable(activityC13115xef650a1b.getResources().getColor(binarySearch >= 0 ? f304556v[binarySearch] : com.p314xaae8f345.mm.R.C30859x5a72f63.f560366ii)));
            }
            android.view.View view7 = p3Var.f304755g;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view7, arrayList5.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (i19 == 5 || i19 == 6) {
            p3Var.f304756h.setText(i19 == 5 ? com.p314xaae8f345.mm.R.C30867xcad56011.f572438b84 : com.p314xaae8f345.mm.R.C30867xcad56011.f572437b83);
            android.widget.TextView textView3 = p3Var.f304757i;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = p3Var.f304757i.getContext();
            java.lang.String str5 = item.f106350i;
            float textSize = p3Var.f304757i.getTextSize();
            ((ke0.e) xVar).getClass();
            textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str5, textSize));
            p3Var.f304756h.setVisibility(0);
            p3Var.f304757i.setVisibility(0);
            android.view.View view8 = p3Var.f304755g;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view8, arrayList6.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            o11.f fVar = new o11.f();
            fVar.f423618i = 1;
            fVar.f423613d = false;
            int i27 = f304554t;
            fVar.f423620k = i27;
            fVar.f423619j = i27;
            fVar.f423615f = item.f106345d;
            if (p3Var.f304749a.getDrawable() == null || z17) {
                fVar.f423628s = false;
                n11.a.b().h(item.f106345d, p3Var.f304749a, fVar.a());
            }
        } else {
            if (f304554t == 0) {
                f304554t = view2.getMeasuredWidth();
            }
            o11.f fVar2 = new o11.f();
            fVar2.f423618i = 1;
            fVar2.f423613d = false;
            int i28 = f304554t;
            fVar2.f423620k = i28;
            fVar2.f423619j = i28;
            if (item.f106343b == 1) {
                fVar2.f423615f = item.f106345d;
                o11.g a18 = fVar2.a();
                if (p3Var.f304749a.getDrawable() == null || z17) {
                    fVar2.f423628s = false;
                    n11.a.b().h(item.f106345d, p3Var.f304749a, a18);
                }
            } else if (item.f106349h == 486539313) {
                fVar2.f423615f = tv.a.b(item.f106344c);
                fVar2.f423618i = 5;
                n11.a.b().h(item.f106344c, p3Var.f304749a, fVar2.a());
            } else {
                fVar2.f423615f = item.f106344c;
                o11.g a19 = fVar2.a();
                if (p3Var.f304749a.getDrawable() == null || z17) {
                    fVar2.f423628s = false;
                    n11.a.b().h(item.f106344c, p3Var.f304749a, a19);
                }
            }
            p3Var.f304756h.setVisibility(8);
            p3Var.f304757i.setVisibility(8);
            android.view.View view9 = p3Var.f304755g;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view9, arrayList7.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.System.currentTimeMillis();
        return view2;
    }
}
