package cw1;

/* loaded from: classes12.dex */
public final class q4 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: s, reason: collision with root package name */
    public static final cw1.u3 f304796s = new cw1.u3(null);

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.Map f304797t;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13116xef072354 f304798d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f304799e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f304800f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.Map f304801g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.BitSet f304802h;

    /* renamed from: i, reason: collision with root package name */
    public long f304803i;

    /* renamed from: m, reason: collision with root package name */
    public int f304804m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f304805n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f304806o;

    /* renamed from: p, reason: collision with root package name */
    public final cw1.n4 f304807p;

    /* renamed from: q, reason: collision with root package name */
    public final cw1.h4 f304808q;

    /* renamed from: r, reason: collision with root package name */
    public final kn5.e f304809r;

    static {
        int[] iArr = ot1.h.Q;
        cw1.i4 i4Var = new cw1.i4(null, null, iArr, new long[]{0, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697}, 0, null, 0, false, false, false);
        jz5.l lVar = new jz5.l(i4Var, new cw1.e4(i4Var));
        cw1.i4 i4Var2 = new cw1.i4(null, null, iArr, new long[]{0, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697}, 0, null, 0, true, false, false);
        f304797t = kz5.c1.k(lVar, new jz5.l(i4Var2, new cw1.e4(i4Var2)));
    }

    public q4(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13116xef072354 activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f304798d = activity;
        kz5.p0 p0Var = kz5.p0.f395529d;
        this.f304799e = p0Var;
        this.f304800f = p0Var;
        this.f304801g = kz5.q0.f395534d;
        this.f304802h = new java.util.BitSet();
        this.f304806o = z65.c.a();
        this.f304807p = new cw1.n4();
        cw1.h4 h4Var = new cw1.h4(this);
        this.f304808q = h4Var;
        this.f304809r = kn5.e.E.a(activity, h4Var, new cw1.k4(this));
    }

    public static void E(cw1.q4 q4Var, android.widget.ImageView imageView, java.lang.String str, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        o11.g a17;
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        if ((i17 & 4) != 0) {
            z18 = false;
        }
        q4Var.getClass();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(imageView.getTag(), str)) {
            return;
        }
        n11.a b17 = n11.a.b();
        b17.a(null, imageView);
        if (str == null) {
            imageView.setImageDrawable(null);
            return;
        }
        o11.g gVar = cw1.r4.f304830b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13116xef072354 activityC13116xef072354 = q4Var.f304798d;
        if (gVar == null) {
            int measuredWidth = activityC13116xef072354.f177239n.getMeasuredWidth() / 4;
            o11.f fVar = new o11.f();
            fVar.f423618i = 1;
            fVar.f423613d = false;
            fVar.f423628s = true;
            fVar.f423619j = measuredWidth;
            fVar.f423620k = measuredWidth;
            cw1.r4.f304830b = fVar.a();
        }
        if (z18) {
            o11.f fVar2 = new o11.f();
            fVar2.f423618i = 5;
            fVar2.f423613d = false;
            fVar2.f423628s = true;
            fVar2.f423615f = tv.a.b(str);
            int measuredWidth2 = activityC13116xef072354.f177239n.getMeasuredWidth() / 4;
            fVar2.f423619j = measuredWidth2;
            fVar2.f423620k = measuredWidth2;
            a17 = fVar2.a();
        } else {
            a17 = cw1.r4.f304830b;
            if (a17 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imgOpts");
                throw null;
            }
        }
        b17.i(str, imageView, a17, z17 ? q4Var.f304807p : null);
        imageView.setTag(str);
    }

    public static final void x(cw1.q4 q4Var, cw1.b4 b4Var) {
        java.lang.String str;
        bw1.l lVar = (bw1.l) q4Var.f304799e.get(b4Var.f304346d);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("[type] ");
        int i17 = lVar.f106343b;
        if (i17 == 1) {
            str = "IMAGE";
        } else if (i17 == 3) {
            str = "VIDEO";
        } else if (i17 == 4) {
            str = "ATTACH";
        } else if (i17 == 5) {
            str = "RECORD";
        } else if (i17 != 6) {
            str = "??? (" + lVar.f106343b + ')';
        } else {
            str = "NOTE";
        }
        sb6.append(str);
        sb6.append("\n[size] ");
        sb6.append(lVar.f106342a);
        sb6.append(" (");
        sb6.append(fp.n0.a(lVar.f106342a));
        sb6.append(")\n[nonLinkSize] ");
        sb6.append(lVar.f106355n);
        sb6.append(" (");
        sb6.append(fp.n0.a(lVar.f106355n));
        sb6.append(")\n[maxLink] ");
        sb6.append(lVar.f106354m);
        sb6.append("\n[files] {\n");
        java.util.Iterator it = ((java.util.ArrayList) lVar.f106356o).iterator();
        while (it.hasNext()) {
            ot1.h hVar = (ot1.h) it.next();
            sb6.append(" * ");
            sb6.append(hVar);
            sb6.append('\n');
        }
        sb6.append("}\n");
        java.util.List list = lVar.f106358q;
        if (list != null) {
            sb6.append("[uuids] {\n");
            java.util.Iterator it6 = ((java.util.ArrayList) list).iterator();
            while (it6.hasNext()) {
                bw1.m mVar = (bw1.m) it6.next();
                sb6.append(" * ");
                sb6.append(mVar.f106359d);
                sb6.append(" x ");
                sb6.append(mVar.f106360e);
                sb6.append('\n');
            }
            sb6.append("}\n");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13116xef072354 activityC13116xef072354 = q4Var.f304798d;
        android.widget.TextView textView = new android.widget.TextView(activityC13116xef072354);
        textView.setText(sb6);
        textView.setGravity(8388627);
        textView.setTextSize(1, 10.0f);
        textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        textView.setTextColor(activityC13116xef072354.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        textView.setTypeface(android.graphics.Typeface.MONOSPACE);
        int dimensionPixelSize = activityC13116xef072354.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561457j3);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        db5.e1.q(activityC13116xef072354, null, textView, null);
    }

    public final jz5.l B(int i17) {
        return new jz5.l(java.lang.Integer.valueOf(((java.lang.Number) ((jz5.l) this.f304800f.get(i17)).f384366d).intValue() - i17), java.lang.Integer.valueOf(i17 < this.f304800f.size() + (-1) ? (((java.lang.Number) ((jz5.l) this.f304800f.get(i17 + 1)).f384366d).intValue() - i17) - 1 : this.f304799e.size()));
    }

    public final void I(java.lang.String str, int[] iArr, int[] iArr2, long[] timeRange, int i17, java.lang.Boolean bool, int i18, boolean z17, boolean z18, boolean z19, cw1.c4 c4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d c13100x4dbf8b6d) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timeRange, "timeRange");
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = this.f304805n;
        if (c26987xeef691ab != null) {
            c26987xeef691ab.m108007xae7a2e7a();
        }
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab2 = new com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab();
        this.f304805n = c26987xeef691ab2;
        ((ku5.t0) ku5.t0.f394148d).b(new cw1.p4(str, iArr, iArr2, timeRange, i17, bool, i18, z17, z18, z19, c26987xeef691ab2, c4Var, c13100x4dbf8b6d, this), "CleanChattingDetailNewAdapter");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f304799e.size() + this.f304800f.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        java.util.List list = this.f304800f;
        return kz5.c0.e(list, 0, list.size(), new cw1.l4(java.lang.Integer.valueOf(i17))) >= 0 ? 1 : 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        java.lang.String e17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.util.List list = this.f304800f;
        int e18 = kz5.c0.e(list, 0, list.size(), new cw1.m4(java.lang.Integer.valueOf(i17)));
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13116xef072354 activityC13116xef072354 = this.f304798d;
        if (e18 >= 0) {
            cw1.w3 w3Var = (cw1.w3) holder;
            w3Var.f304989d = e18;
            int intValue = ((java.lang.Number) ((jz5.l) this.f304800f.get(e18)).f384367e).intValue();
            java.lang.String string = activityC13116xef072354.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573682fe4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String format = java.lang.String.format("%04d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(intValue >> 8)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            java.lang.String t17 = r26.i0.t(string, "yyyy", format, false);
            java.lang.String format2 = java.lang.String.format("%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(intValue & 255)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
            w3Var.f304990e.setText(r26.i0.t(t17, "MM", format2, false));
            w3Var.f304991f.setChecked(z(e18));
            return;
        }
        cw1.b4 b4Var = (cw1.b4) holder;
        int i18 = (-e18) - 1;
        int i19 = i17 - i18;
        b4Var.f304346d = i19;
        b4Var.f304347e = i18 - 1;
        bw1.l lVar = (bw1.l) this.f304799e.get(i19);
        boolean z17 = this.f304802h.get(i19);
        android.widget.CheckBox checkBox = b4Var.f304353n;
        if (z17) {
            checkBox.setChecked(true);
            android.view.View view = b4Var.f304352m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            checkBox.setChecked(false);
            android.view.View view2 = b4Var.f304352m;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        b4Var.f304349g.setText(fp.n0.a(lVar.f106342a));
        android.widget.TextView textView = b4Var.f304351i;
        textView.setText("");
        android.widget.TextView textView2 = b4Var.f304350h;
        textView2.setText("");
        int i27 = lVar.f106343b;
        if (i27 == 1) {
            E(this, b4Var.f304348f, lVar.f106344c, true, false, 4, null);
            return;
        }
        if (i27 == 3) {
            int i28 = lVar.f106352k;
            if (i28 > 0) {
                textView2.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u(i28));
            }
            E(this, b4Var.f304348f, lVar.f106344c, false, lVar.f106349h == 486539313, 2, null);
            return;
        }
        com.p314xaae8f345.mm.ui.C21405x85fc1ce0 c21405x85fc1ce0 = b4Var.f304348f;
        if (i27 != 4) {
            if (i27 == 5 || i27 == 6) {
                textView.setText(i27 == 5 ? com.p314xaae8f345.mm.R.C30867xcad56011.f572438b84 : com.p314xaae8f345.mm.R.C30867xcad56011.f572437b83);
                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(lVar.f106346e)) {
                    java.lang.String str = lVar.f106346e;
                    ((sg3.a) v0Var).getClass();
                    e17 = c01.a2.f(str, str);
                } else {
                    java.lang.String str2 = lVar.f106346e;
                    ((sg3.a) v0Var).getClass();
                    e17 = c01.a2.e(str2);
                }
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                float textSize = textView2.getTextSize();
                ((ke0.e) xVar).getClass();
                textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(activityC13116xef072354, e17, textSize));
                E(this, b4Var.f304348f, null, false, false, 6, null);
                c21405x85fc1ce0.setImageDrawable(new android.graphics.drawable.ColorDrawable(activityC13116xef072354.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560365g7)));
                return;
            }
            return;
        }
        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572436b82);
        java.lang.String str3 = lVar.f106345d;
        if (str3 != null) {
            java.lang.String str4 = lVar.f106350i;
            if (str4 == null) {
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str3);
                java.lang.String str5 = a17.f294812f;
                if (str5 != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str5, false, false);
                    if (!str5.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                java.lang.String str6 = a17.f294812f;
                int lastIndexOf = str6.lastIndexOf("/");
                str4 = lastIndexOf < 0 ? str6 : str6.substring(lastIndexOf + 1);
            }
            textView2.setText(str4);
            java.lang.String n17 = com.p314xaae8f345.mm.vfs.w6.n(lVar.f106345d);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "getFileExt(...)");
            java.lang.String lowerCase = n17.toLowerCase(java.util.Locale.ROOT);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
            java.lang.Integer num = (java.lang.Integer) cw1.r4.f304829a.get(lowerCase);
            int intValue2 = num != null ? num.intValue() : com.p314xaae8f345.mm.R.C30859x5a72f63.f560366ii;
            E(this, b4Var.f304348f, null, false, false, 6, null);
            c21405x85fc1ce0.setImageDrawable(new android.graphics.drawable.ColorDrawable(activityC13116xef072354.getColor(intValue2)));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(parent.getContext());
        if (i17 == 0) {
            android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.alj, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            return new cw1.b4(this, inflate);
        }
        android.view.View inflate2 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570153yr, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
        return new cw1.w3(this, inflate2);
    }

    public final java.util.List y() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = this.f304799e.size();
        int i17 = -1;
        while (true) {
            i17 = this.f304802h.nextSetBit(i17 + 1);
            if (i17 < 0 || i17 >= size) {
                break;
            }
            arrayList.add((bw1.l) this.f304799e.get(i17));
        }
        return arrayList;
    }

    public final boolean z(int i17) {
        jz5.l B = B(i17);
        return this.f304802h.nextClearBit(((java.lang.Number) B.f384366d).intValue()) >= ((java.lang.Number) B.f384367e).intValue();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 h17, int i17, java.util.List payloads) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h17, "h");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        if (payloads.isEmpty()) {
            mo864xe5e2e48d(h17, i17);
            return;
        }
        if (h17 instanceof cw1.b4) {
            cw1.b4 b4Var = (cw1.b4) h17;
            boolean z17 = this.f304802h.get(b4Var.f304346d);
            android.widget.CheckBox checkBox = b4Var.f304353n;
            if (z17) {
                checkBox.setChecked(true);
                android.view.View view = b4Var.f304352m;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            checkBox.setChecked(false);
            android.view.View view2 = b4Var.f304352m;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (h17 instanceof cw1.w3) {
            cw1.w3 w3Var = (cw1.w3) h17;
            w3Var.f304991f.setChecked(z(w3Var.f304989d));
        }
    }
}
