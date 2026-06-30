package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class e extends com.p314xaae8f345.mm.ui.k3 implements l75.z0 {
    public int[] A;
    public java.lang.String[] B;
    public db5.f6 C;
    public db5.b6 D;
    public final db5.c6 E;
    public com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.AddressUIFragment F;
    public final java.util.Set G;
    public int H;
    public final boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f288204J;
    public boolean K;
    public final java.lang.ref.WeakReference L;
    public final java.util.LinkedList M;
    public boolean N;
    public final java.util.HashMap P;
    public final db5.v8 Q;
    public final android.util.SparseArray R;
    public final java.util.HashSet S;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f288205v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f288206w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.List f288207x;

    /* renamed from: y, reason: collision with root package name */
    public final int f288208y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f288209z;

    static {
        i65.a.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30859x5a72f63.f560946yk);
        i65.a.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk);
    }

    public e(android.content.Context context, java.lang.String str, java.lang.String str2, int i17, boolean z17) {
        super(true, context, 5000);
        this.f288205v = null;
        this.f288206w = null;
        this.f288207x = null;
        this.f288209z = "";
        this.E = com.p314xaae8f345.mm.ui.p2642x2e06d1.C21514xd47fe41f.m79111x6b320260();
        this.G = new java.util.HashSet();
        this.H = 0;
        this.I = true;
        this.f288204J = false;
        this.K = false;
        this.M = new java.util.LinkedList();
        this.P = new java.util.HashMap();
        this.Q = new com.p314xaae8f345.mm.ui.p2690x38b72420.b(this);
        this.R = new android.util.SparseArray();
        new android.util.SparseArray();
        this.S = new java.util.HashSet();
        new java.util.HashMap();
        this.L = new java.lang.ref.WeakReference(context);
        this.f290554h = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        this.f288205v = str;
        this.f288206w = str2;
        this.f288208y = i17;
        this.f288204J = z17;
        new java.util.LinkedList();
        new java.util.LinkedList();
        c01.z1.r();
        this.f290550d = "MiscroMsg.AddressDrawWithCacheAdapter";
    }

    public final void A(com.p314xaae8f345.mm.ui.p2690x38b72420.d dVar) {
        dVar.f288187g.setVisibility(8);
        dVar.f288181a.setVisibility(8);
        dVar.f288186f.setVisibility(8);
    }

    public void B() {
        int count = getCount();
        if (count == 0) {
            return;
        }
        this.H = k(0);
        com.p314xaae8f345.mm.ui.f3 f3Var = this.f290552f;
        if (f3Var == null ? false : f3Var.f331971a.y()) {
            java.lang.System.currentTimeMillis();
            java.util.HashSet hashSet = new java.util.HashSet();
            this.A = new int[30];
            this.B = new java.lang.String[30];
            int i17 = 0;
            for (int i18 = this.H; i18 < count; i18++) {
                com.p314xaae8f345.mm.p2621x8fb0427b.g item = getItem(i18);
                if (item != null) {
                    java.lang.String w17 = w(item, i18);
                    if (hashSet.add(w17)) {
                        this.A[i17] = i18 - this.H;
                        this.B[i17] = w17;
                        i17++;
                    }
                }
            }
            java.lang.System.currentTimeMillis();
        } else {
            java.lang.System.currentTimeMillis();
            java.util.List list = this.f288207x;
            java.lang.String str = this.f288205v;
            java.lang.String str2 = this.f288206w;
            java.lang.String str3 = this.f288209z;
            this.A = c01.e2.w(null, str, str2, list, str3);
            this.B = c01.e2.y(null, str, str2, str3, this.f288207x);
            java.lang.System.currentTimeMillis();
        }
        java.util.HashSet hashSet2 = (java.util.HashSet) this.G;
        hashSet2.clear();
        int[] iArr = this.A;
        if (iArr != null) {
            for (int i19 : iArr) {
                hashSet2.add(java.lang.Integer.valueOf(i19 - 1));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r0.moveToFirst() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        r1.add(r0.getString(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        if (r0.moveToNext() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        r0.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C(java.util.List r5) {
        /*
            r4 = this;
            int r0 = r4.f288208y
            r1 = 2
            if (r0 == r1) goto Lc
            java.lang.String r2 = c01.z1.r()
            r5.add(r2)
        Lc:
            c01.f r2 = c01.d9.b()
            xg3.r0 r2 = r2.y()
            java.lang.String r3 = "@t.qq.com"
            com.tencent.mm.storage.ka r2 = (com.p314xaae8f345.mm.p2621x8fb0427b.ka) r2
            com.tencent.mm.storage.ja r2 = r2.m0(r3)
            if (r2 == 0) goto L23
            java.lang.String r2 = r2.f276591b
            r5.add(r2)
        L23:
            r2 = 3
            if (r0 == r2) goto L31
            r2 = 5
            if (r0 == r2) goto L31
            r2 = 4
            if (r0 == r2) goto L31
            r2 = 1
            if (r0 == r2) goto L31
            if (r0 != 0) goto L90
        L31:
            java.util.Set r0 = c01.e2.f118650a
            java.lang.Class<vg3.x3> r0 = vg3.x3.class
            lm0.a r0 = gm0.j1.s(r0)
            vg3.x3 r0 = (vg3.x3) r0
            com.tencent.mm.plugin.messenger.foundation.h2 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) r0
            com.tencent.mm.storage.k4 r0 = r0.Bi()
            r0.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "select username from rcontact where "
            r2.<init>(r3)
            java.lang.String r3 = com.p314xaae8f345.mm.p2621x8fb0427b.k4.M()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            l75.k0 r0 = r0.f276604d
            r3 = 0
            android.database.Cursor r0 = r0.f(r2, r3, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r0 != 0) goto L65
            goto L7c
        L65:
            boolean r2 = r0.moveToFirst()
            if (r2 == 0) goto L79
        L6b:
            r2 = 0
            java.lang.String r2 = r0.getString(r2)
            r1.add(r2)
            boolean r2 = r0.moveToNext()
            if (r2 != 0) goto L6b
        L79:
            r0.close()
        L7c:
            java.util.Iterator r0 = r1.iterator()
        L80:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L90
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r5.add(r1)
            goto L80
        L90:
            java.lang.String r0 = "blogapp"
            r5.add(r0)
            r4.f288207x = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2690x38b72420.e.C(java.util.List):void");
    }

    @Override // com.p314xaae8f345.mm.ui.k3
    public e95.h f() {
        return (e95.h) v();
    }

    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.AddressUIFragment addressUIFragment;
        if (obj != null && (obj instanceof java.lang.String) && a1Var == c01.d9.b().q()) {
            java.lang.String str = (java.lang.String) obj;
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.E4(str) || this.S.contains(str)) {
                return;
            }
            n(str, 2);
            if (!this.K || (addressUIFragment = this.F) == null) {
                return;
            }
            addressUIFragment.K = true;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.k3, android.widget.Adapter
    public int getCount() {
        return super.getCount();
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.d dVar;
        java.lang.ref.WeakReference weakReference = this.L;
        android.content.Context context = (android.content.Context) weakReference.get();
        if (context == null) {
            return view;
        }
        boolean z17 = this.N;
        java.util.LinkedList linkedList = this.M;
        if (!z17) {
            for (int i18 = 0; i18 < 8; i18++) {
                linkedList.add(com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569523dg, (android.view.ViewGroup) null));
            }
            this.N = true;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.g item = getItem(i17);
        if (view == null) {
            if (linkedList.size() > 0) {
                view = (android.view.View) linkedList.getFirst();
                linkedList.removeFirst();
            } else {
                view = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569523dg, null);
            }
            dVar = new com.p314xaae8f345.mm.ui.p2690x38b72420.d();
            dVar.f288181a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cfx);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659 c21526xca364659 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659) view.findViewById(com.p314xaae8f345.mm.R.id.k3e);
            dVar.f288182b = c21526xca364659;
            c21526xca364659.m79257x600eea91(this.Q);
            dVar.f288182b.i(0, i65.a.h(this.f290554h, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
            dVar.f288182b.m79266x3b2de958(true);
            if (dVar.f288182b.m79227x74f59ea8() != null) {
                com.p314xaae8f345.mm.ui.bk.r0(dVar.f288182b.m79227x74f59ea8(), 0.1f);
            }
            dVar.f288182b.m79272x1c5c5ff4(i65.a.e(this.f290554h, com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            dVar.f288182b.m79254xc1f6fb8c(16);
            dVar.f288183c = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f564279mt);
            dVar.f288184d = view.findViewById(com.p314xaae8f345.mm.R.id.f565451cg5);
            dVar.f288185e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kjo);
            dVar.f288186f = (com.p314xaae8f345.mm.ui.p2690x38b72420.C22291x3eba42e2) view.findViewById(com.p314xaae8f345.mm.R.id.cfy);
            dVar.f288187g = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.cfw);
            android.view.ViewGroup.LayoutParams layoutParams = dVar.f288184d.getLayoutParams();
            layoutParams.height = (int) (i65.a.f(this.f290554h, com.p314xaae8f345.mm.R.C30860x5b28f31.f561146ao) * i65.a.A(this.f290554h));
            dVar.f288184d.setLayoutParams(layoutParams);
            view.setTag(dVar);
        } else {
            dVar = (com.p314xaae8f345.mm.ui.p2690x38b72420.d) view.getTag();
        }
        if (item != null) {
            int i19 = i17 - 1;
            com.p314xaae8f345.mm.p2621x8fb0427b.g item2 = getItem(i19);
            int i27 = i17 + 1;
            com.p314xaae8f345.mm.p2621x8fb0427b.g item3 = getItem(i27);
            int y17 = item2 == null ? -1 : y(item2, i19);
            int y18 = y(item, i17);
            if (item3 != null) {
                y(item3, i27);
            }
            dVar.f288186f.setTag(java.lang.Integer.valueOf(y18));
            if (!this.I) {
                A(dVar);
            } else if (i17 < 0 || y18 == y17) {
                A(dVar);
            } else {
                java.lang.String w17 = w(item, i17);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w17)) {
                    A(dVar);
                } else {
                    dVar.f288187g.setVisibility(0);
                    dVar.f288181a.setVisibility(0);
                    dVar.f288181a.setText(w17);
                    com.p314xaae8f345.mm.ui.p2690x38b72420.C22291x3eba42e2 c22291x3eba42e2 = dVar.f288186f;
                    ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).getClass();
                    c22291x3eba42e2.a(ef4.i.f333980b);
                }
            }
            java.lang.String w18 = w(item, i17);
            java.lang.String w19 = item3 == null ? null : w(item3, i27);
            int paddingLeft = dVar.f288184d.getPaddingLeft();
            android.app.Activity activity = (android.app.Activity) weakReference.get();
            if (w18 == null || w18.equals(w19)) {
                dVar.f288182b.setBackground(com.p314xaae8f345.mm.ui.zk.d(activity, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559855gp));
                dVar.f288184d.setBackground(null);
            } else {
                dVar.f288182b.setBackground(null);
                dVar.f288184d.setBackground(com.p314xaae8f345.mm.ui.zk.d(activity, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559855gp));
            }
            dVar.f288184d.setPadding(paddingLeft, 0, 0, 0);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(dVar.f288183c, item.e(), null);
            s(item, dVar);
            t(item, dVar);
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21892x3f8cbd27) dVar.f288183c).getClass();
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21892x3f8cbd27) dVar.f288183c).setTag(item.e());
        }
        dVar.f288183c.setOnClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.a(this));
        return view;
    }

    @Override // com.p314xaae8f345.mm.ui.k3
    public com.p314xaae8f345.mm.ui.f3 h(e95.h hVar) {
        return android.os.Looper.myLooper() != android.os.Looper.getMainLooper() ? new com.p314xaae8f345.mm.ui.f3(this, hVar) : new com.p314xaae8f345.mm.ui.f3(this, hVar, true);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        c01.z1.r();
        if (this.A == null) {
            B();
        }
        if (getCount() == 0) {
            super.notifyDataSetChanged();
            return;
        }
        int k17 = k(0);
        this.H = k17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddressAdapter", "newcursor favourCount %d", java.lang.Integer.valueOf(k17));
        super.notifyDataSetChanged();
    }

    public void s(com.p314xaae8f345.mm.p2621x8fb0427b.g gVar, com.p314xaae8f345.mm.ui.p2690x38b72420.d dVar) {
        java.lang.CharSequence charSequence = null;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(gVar.e())) {
            java.lang.String fj6 = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(gVar.f39225xd03b1ec9, gVar.f39221xb5bc69bd);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(fj6)) {
                dVar.f288182b.g(null, 0, 0);
            } else {
                if ("3552365301".equals(gVar.f39225xd03b1ec9)) {
                    fj6 = "@" + fj6;
                }
                dVar.f288182b.g(fj6, com.p314xaae8f345.mm.R.C30859x5a72f63.f560825v8, 14);
            }
        } else {
            dVar.f288182b.g(null, 0, 0);
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(gVar.e()) || c01.e2.E(gVar.e())) {
            dVar.f288182b.m79243xc0a6ee2e(com.p314xaae8f345.mm.R.raw.f80791xd2795aeb);
            dVar.f288182b.m79247xe39e0fb4(true);
        } else {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659 c21526xca364659 = dVar.f288182b;
            if (c21526xca364659.G) {
                c21526xca364659.m79247xe39e0fb4(false);
            }
        }
        try {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = this.f290554h;
            java.lang.String c17 = gVar.c();
            java.lang.String e17 = gVar.e();
            if (c17 == null || c17.length() <= 0) {
                c17 = e17;
            }
            charSequence = ((ke0.e) xVar).bj(context, c17, i65.a.h(this.f290554h, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
        } catch (java.lang.Exception unused) {
        }
        if (charSequence == null) {
            charSequence = "";
        }
        dVar.f288182b.m79270x765074af(charSequence);
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).rj(dVar.f288182b, gVar.e(), bi4.c.CONTACT_LIST);
    }

    public void t(com.p314xaae8f345.mm.p2621x8fb0427b.g gVar, com.p314xaae8f345.mm.ui.p2690x38b72420.d dVar) {
        try {
            dVar.f288185e.setText((java.lang.CharSequence) null);
            dVar.f288185e.setVisibility(8);
        } catch (java.lang.Throwable unused) {
        }
    }

    public final boolean u() {
        java.lang.String str = this.f288205v;
        return str.equals("@micromsg.qq.com") || str.equals("@all.contact.without.chatroom") || str.equals("@all.contact.without.chatroom.without.openim");
    }

    public android.database.Cursor v() {
        java.lang.System.currentTimeMillis();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add("weixin");
        android.database.Cursor A = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).A(this.f288205v, this.f288206w, this.f288207x, linkedList, u(), this.f288204J);
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2690x38b72420.c(this, linkedList));
        java.lang.System.currentTimeMillis();
        return A;
    }

    public java.lang.String w(com.p314xaae8f345.mm.p2621x8fb0427b.g gVar, int i17) {
        if (i17 < this.H) {
            return z(com.p314xaae8f345.mm.R.C30867xcad56011.f571434ex);
        }
        int i18 = gVar.f39227x98b6022;
        if (i18 == 31) {
            return "";
        }
        if (i18 == 123) {
            return "#";
        }
        if (i18 == 33) {
            return z(com.p314xaae8f345.mm.R.C30867xcad56011.f571395ds);
        }
        if (i18 == 43) {
            return z(com.p314xaae8f345.mm.R.C30867xcad56011.i4y);
        }
        if (i18 == 32) {
            return z(com.p314xaae8f345.mm.R.C30867xcad56011.f571434ex);
        }
        android.util.SparseArray sparseArray = this.R;
        java.lang.String str = (java.lang.String) sparseArray.get(i18);
        if (str != null) {
            return str;
        }
        java.lang.String valueOf = java.lang.String.valueOf((char) gVar.f39227x98b6022);
        sparseArray.put(gVar.f39227x98b6022, valueOf);
        return valueOf;
    }

    @Override // android.widget.Adapter
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p2621x8fb0427b.g getItem(int i17) {
        if (this.f290552f == null) {
            q(f());
        }
        a("getItem", false);
        this.f290552f.f331971a.moveToPosition(i17);
        e95.a mo123785xfb80e389 = this.f290552f.f331971a.mo123785xfb80e389(i17);
        if (mo123785xfb80e389 != null) {
            e95.h hVar = this.f290552f.f331971a;
            mo123785xfb80e389.v();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f290550d, "newcursor getItem error %d", java.lang.Integer.valueOf(i17));
        }
        return (com.p314xaae8f345.mm.p2621x8fb0427b.g) mo123785xfb80e389;
    }

    public int y(com.p314xaae8f345.mm.p2621x8fb0427b.g gVar, int i17) {
        if (i17 < this.H) {
            return 32;
        }
        if (gVar != null) {
            return gVar.f39227x98b6022;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AddressAdapter", "contact is null, position:%d", java.lang.Integer.valueOf(i17));
        return -1;
    }

    public final java.lang.String z(int i17) {
        android.util.SparseArray sparseArray = this.R;
        java.lang.String str = (java.lang.String) sparseArray.get(i17);
        if (str != null) {
            return str;
        }
        java.lang.String string = this.f290554h.getString(i17);
        sparseArray.put(i17, string);
        return string;
    }
}
