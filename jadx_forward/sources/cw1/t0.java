package cw1;

/* loaded from: classes12.dex */
public final class t0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f304857d = kz5.p0.f395529d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String[] f304858e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f304859f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db f304860g;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db activityC13108x43db50db) {
        this.f304860g = activityC13108x43db50db;
        java.lang.String[] stringArray = activityC13108x43db50db.getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559510b6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringArray, "getStringArray(...)");
        this.f304858e = stringArray;
        this.f304859f = cw1.p0.f304744d;
        mo8164xbbdced85(true);
    }

    public final void B() {
        java.lang.Integer[][] numArr = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db.f177187x;
        java.util.ArrayList arrayList = new java.util.ArrayList(16);
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db activityC13108x43db50db = this.f304860g;
        int i17 = 0;
        int i18 = 0;
        while (i17 < 12) {
            int i19 = i18 + 1;
            long j17 = 0;
            for (java.lang.Integer num : numArr[i17]) {
                j17 += activityC13108x43db50db.f177193h[num.intValue()];
            }
            if (j17 > 0) {
                arrayList.add(new cw1.v0(i18, j17, false, 4, null));
            }
            i17++;
            i18 = i19;
        }
        if (arrayList.size() > 1) {
            kz5.g0.t(arrayList, new cw1.q0());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db activityC13108x43db50db2 = this.f304860g;
        if (activityC13108x43db50db2.f177200r + activityC13108x43db50db2.f177199q > 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(4);
            long j18 = this.f304860g.f177200r;
            if (j18 > 0) {
                arrayList2.add(new cw1.v0(-2, j18, false));
            }
            long j19 = this.f304860g.f177199q;
            if (j19 > 0) {
                arrayList2.add(new cw1.v0(-1, j19, false));
            }
            if (arrayList2.size() > 1) {
                kz5.g0.t(arrayList2, new cw1.r0());
            }
            arrayList2.add(0, new cw1.v0(-3, 0L, false, 6, null));
            arrayList2.add(new cw1.v0(-4, 0L, false, 6, null));
            arrayList.addAll(0, arrayList2);
        }
        long j27 = this.f304860g.f177198p;
        if (j27 > 0) {
            arrayList.add(0, new cw1.v0(-5, j27, false));
        }
        ((ku5.t0) ku5.t0.f394148d).B(new cw1.s0(this, arrayList));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f304857d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        return ((cw1.v0) this.f304857d.get(i17)).f304892a;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        int i18 = ((cw1.v0) this.f304857d.get(i17)).f304892a;
        if (i18 != -5) {
            return (i18 == -4 || i18 == -3) ? 1 : 0;
        }
        return 2;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        java.lang.String string;
        android.view.View.OnClickListener z0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (holder instanceof cw1.b1) {
            cw1.b1 b1Var = (cw1.b1) holder;
            cw1.v0 gd6 = (cw1.v0) this.f304857d.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gd6, "gd");
            java.lang.String[] titles = this.f304858e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(titles, "titles");
            b1Var.f304336d = gd6;
            com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db activityC13108x43db50db = b1Var.f304342m;
            int i18 = gd6.f304892a;
            if (i18 == -2) {
                string = activityC13108x43db50db.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n8i);
            } else if (i18 != -1) {
                string = titles[i18];
            } else {
                string = activityC13108x43db50db.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n8j);
            }
            b1Var.f304338f.setText(string);
            android.view.View view = b1Var.f304340h;
            int i19 = (i18 == -2 || i18 == -1 || i18 == 3) ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$ItemViewHolder", "bind", "(Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$GroupData;[Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$ItemViewHolder", "bind", "(Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$GroupData;[Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (i18 == -2 || i18 == -1) {
                z0Var = new cw1.z0(activityC13108x43db50db, i18);
            } else {
                z0Var = i18 != 3 ? null : new cw1.a1(activityC13108x43db50db, gd6);
            }
            android.view.View view2 = b1Var.f304341i;
            view2.setOnClickListener(z0Var);
            dy1.a.c(view2);
            if (i18 == -2 || i18 == -1) {
                dy1.a.i(view2, "visual_origin_detail");
                java.lang.String str = activityC13108x43db50db.f177197o;
                if (str != null) {
                    dy1.a.j(view2, "cache_remove_sessionid", str);
                    dy1.a.j(view2, "cache_visual_type", java.lang.Integer.valueOf(i18 == -1 ? 1 : 2));
                    dy1.a.l(view2, 8, 32903);
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cleanSessionID");
                    throw null;
                }
            }
            b1Var.i();
            return;
        }
        if (holder instanceof cw1.c1) {
            cw1.c1 c1Var = (cw1.c1) holder;
            cw1.v0 gd7 = (cw1.v0) this.f304857d.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gd7, "gd");
            c1Var.f304380d.setVisibility(gd7.f304892a == -4 ? 8 : 0);
            return;
        }
        if (holder instanceof cw1.u0) {
            cw1.u0 u0Var = (cw1.u0) holder;
            cw1.v0 gd8 = (cw1.v0) this.f304857d.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gd8, "gd");
            u0Var.f304876d.setText(u0Var.f304877e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n8h, fp.n0.a(gd8.f304893b)));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(parent.getContext());
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db activityC13108x43db50db = this.f304860g;
        if (i17 == 0) {
            android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e2i, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            return new cw1.b1(activityC13108x43db50db, inflate);
        }
        if (i17 != 1) {
            android.view.View inflate2 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e2h, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
            return new cw1.u0(activityC13108x43db50db, inflate2);
        }
        android.view.View inflate3 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e2j, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate3, "inflate(...)");
        return new cw1.c1(activityC13108x43db50db, inflate3);
    }

    public final void x(int i17, long j17, boolean z17) {
        java.util.List list = this.f304857d;
        java.util.Iterator it = list.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            } else {
                if (((cw1.v0) it.next()).f304892a == i17) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        if (i18 < 0) {
            return;
        }
        ((cw1.v0) list.get(i18)).f304895d = j17;
        ((cw1.v0) list.get(i18)).f304894c = z17;
        m8148xed6e4d18(i18, "");
        this.f304859f.mo152xb9724478();
    }

    public final long y() {
        long j17 = 0;
        for (cw1.v0 v0Var : this.f304857d) {
            j17 += v0Var.f304892a >= 0 ? v0Var.f304895d : 0L;
        }
        return j17;
    }

    public final void z(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d c13100x4dbf8b6d;
        java.util.List<cw1.v0> list = this.f304857d;
        for (cw1.v0 v0Var : list) {
            if (v0Var.f304892a >= -2) {
                v0Var.f304895d = z17 ? v0Var.f304893b : 0L;
                v0Var.f304894c = z17;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db activityC13108x43db50db = this.f304860g;
        int length = activityC13108x43db50db.f177203u.length;
        for (int i17 = 0; i17 < length; i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d[] c13100x4dbf8b6dArr = activityC13108x43db50db.f177203u;
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d[] c13100x4dbf8b6dArr2 = activityC13108x43db50db.f177204v;
                if (c13100x4dbf8b6dArr2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("allOriginItems");
                    throw null;
                }
                c13100x4dbf8b6d = c13100x4dbf8b6dArr2[i17];
            } else {
                c13100x4dbf8b6d = activityC13108x43db50db.f177205w;
            }
            c13100x4dbf8b6dArr[i17] = c13100x4dbf8b6d;
        }
        m8152xc67946d3(0, list.size(), "");
        this.f304859f.mo152xb9724478();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17, java.util.List payloads) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        if (payloads.isEmpty()) {
            mo864xe5e2e48d(holder, i17);
        } else if (holder instanceof cw1.b1) {
            ((cw1.b1) holder).i();
        }
    }
}
