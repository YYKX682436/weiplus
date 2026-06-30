package r35;

/* loaded from: classes11.dex */
public class v1 extends android.widget.BaseAdapter {
    public static int K = 19;
    public static int L = 19;
    public static int M = 5;
    public java.lang.String C;
    public java.lang.String D;

    /* renamed from: d, reason: collision with root package name */
    public lz.g f450821d;

    /* renamed from: e, reason: collision with root package name */
    public r35.e2 f450822e;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f450825h;

    /* renamed from: m, reason: collision with root package name */
    public boolean f450827m;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 f450831q;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.b0 f450836v;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f450823f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f450824g = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public boolean f450828n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f450829o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f450830p = false;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f450832r = new java.util.ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f450833s = new java.util.ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public int f450834t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f450835u = 0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f450837w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f450838x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f450839y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f450840z = true;
    public boolean A = false;
    public final int B = 12;
    public o11.g E = null;
    public boolean F = false;
    public boolean G = false;
    public final boolean H = true;
    public boolean I = false;

    /* renamed from: J, reason: collision with root package name */
    public final java.util.HashMap f450820J = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public boolean f450826i = false;

    public v1(android.content.Context context) {
        this.f450825h = context;
        context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactsListArchAdapter", "init, wrapColNum: %d", java.lang.Integer.valueOf(f(context)));
    }

    public boolean a(int i17) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar;
        if (this.f450826i) {
            return false;
        }
        if (i17 < this.f450835u) {
            this.f450826i = true;
            lz.g gVar = this.f450821d;
            if (gVar != null && (rVar = ((r35.t1) gVar).f450794a.f450803b) != null) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).notifyDataSetChanged();
            }
        }
        return true;
    }

    public final r35.b2 c(android.view.View view) {
        r35.b2 b2Var = new r35.b2(this);
        b2Var.f450582g = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.m6y);
        b2Var.f450576a = (com.p314xaae8f345.mm.p1006xc5476f33.p1943xc4ac0ffe.ui.C16784x72b881cf) view.findViewById(com.p314xaae8f345.mm.R.id.m7e);
        b2Var.f450577b = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.m6x);
        b2Var.f450578c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.m7a);
        b2Var.f450579d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.m7b);
        b2Var.f450580e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.m7d);
        b2Var.f450581f = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.m6z);
        b2Var.f450583h = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.spk);
        view.setTag(b2Var);
        return b2Var;
    }

    public final int d() {
        int size;
        int i17;
        int i18;
        int i19;
        if (this.f450828n) {
            size = ((java.util.ArrayList) this.f450833s).size();
        } else {
            boolean z17 = this.f450827m;
            java.util.List list = this.f450832r;
            if (z17) {
                com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = this.f450831q;
                if (a3Var == null || a3Var.P0()) {
                    int size2 = ((java.util.ArrayList) list).size();
                    int i27 = K;
                    if (size2 >= i27 - 1) {
                        i17 = i27 - 1;
                        size = i17;
                    } else {
                        size = ((java.util.ArrayList) list).size();
                    }
                } else {
                    int size3 = ((java.util.ArrayList) list).size();
                    i17 = K;
                    if (size3 < i17) {
                        size = ((java.util.ArrayList) list).size();
                    }
                    size = i17;
                }
            } else {
                size = ((java.util.ArrayList) list).size();
            }
        }
        if (size == 0) {
            return M;
        }
        boolean z18 = this.f450838x;
        if (z18 && this.f450837w && this.f450839y) {
            i18 = M;
            i19 = (size + 2) / i18;
        } else if ((z18 && this.f450837w && !this.f450839y) || ((z18 && !this.f450837w && this.f450839y) || (!z18 && this.f450837w && this.f450839y))) {
            i18 = M;
            i19 = (size + 1) / i18;
        } else if ((z18 && !this.f450837w && !this.f450839y) || ((!z18 && this.f450837w && !this.f450839y) || (!z18 && !this.f450837w && this.f450839y))) {
            i18 = M;
            i19 = size / i18;
        } else if (z18 || this.f450837w || this.f450839y) {
            i18 = M;
            i19 = size / i18;
        } else {
            i18 = M;
            i19 = (size - 1) / i18;
        }
        return (i19 + 1) * i18;
    }

    public int f(android.content.Context context) {
        if (context == null) {
            return 0;
        }
        android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        if (width / (context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561425i5) + (context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561417hx) * 2.0f)) < 5.0f || height <= width) {
            this.I = false;
        } else {
            this.I = true;
        }
        float dimension = context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561417hx) * 2.0f;
        boolean z17 = this.I;
        android.content.res.Resources resources = context.getResources();
        int dimension2 = width / ((int) (dimension + (z17 ? resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561425i5) : resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561423i3))));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactsListArchAdapter", "[getWrapColNum] :%s", java.lang.Integer.valueOf(dimension2));
        M = dimension2;
        if (dimension2 == 4 && !this.F) {
            K = 15;
            L = 15;
        }
        return dimension2;
    }

    public boolean g(int i17) {
        return i17 < this.f450835u;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.A ? java.lang.Math.min(this.B, this.f450834t) : this.f450834t;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        if (i17 < this.f450835u) {
            return this.f450828n ? ((java.util.ArrayList) this.f450833s).get(i17) : ((java.util.ArrayList) this.f450832r).get(i17);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x02fb, code lost:
    
        if (r4.equals(((s01.a0) r11).f65840x13fe5d2b) == false) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x05a4  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r23, android.view.View r24, android.view.ViewGroup r25) {
        /*
            Method dump skipped, instructions count: 1707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r35.v1.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public void h() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar;
        java.util.List list = this.f450823f;
        if (list == null && this.f450824g == null) {
            return;
        }
        boolean z17 = this.f450840z;
        java.util.List list2 = this.f450832r;
        if (!z17) {
            java.util.ArrayList arrayList = this.f450824g;
            if (arrayList != null) {
                arrayList.size();
                java.util.ArrayList arrayList2 = (java.util.ArrayList) list2;
                arrayList2.clear();
                if (this.f450824g.size() > 0) {
                    java.util.Iterator it = this.f450824g.iterator();
                    while (it.hasNext()) {
                        arrayList2.add((com.p314xaae8f345.mm.p2621x8fb0427b.z3) it.next());
                    }
                }
                this.f450835u = arrayList2.size();
            }
        } else if (list != null) {
            list.size();
            java.util.ArrayList arrayList3 = (java.util.ArrayList) list2;
            arrayList3.clear();
            java.util.ArrayList arrayList4 = (java.util.ArrayList) this.f450833s;
            arrayList4.clear();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            if (this.f450823f.size() > 0) {
                int i17 = 1;
                for (java.lang.String str : this.f450823f) {
                    if (this.f450828n) {
                        ((r35.t) ((r35.p3) i95.n0.c(r35.p3.class))).getClass();
                        s01.a0 y07 = r01.q3.Vi().y0(str);
                        if (y07 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y07.f65840x13fe5d2b) || !y07.f65840x13fe5d2b.equals(str)) {
                            y07 = new s01.a0();
                            y07.f65840x13fe5d2b = str;
                        }
                        arrayList4.add(y07);
                    } else {
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
                        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = this.f450831q;
                        if (a3Var == null || !str.equals(a3Var.f69107x5be1edb3)) {
                            com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var2 = this.f450831q;
                            if (a3Var2 == null || !a3Var2.G0(n17.d1())) {
                                linkedList.add(new r35.a2(this, n17, 100));
                            } else {
                                linkedList.add(new r35.a2(this, n17, i17));
                                i17++;
                            }
                        } else {
                            linkedList.add(new r35.a2(this, n17, 0));
                        }
                    }
                    j(str);
                }
                j("add_more_user");
                j("del_more_user");
                this.G = !this.F;
                if (this.H) {
                    java.util.Collections.sort(linkedList, new r35.w1(this));
                }
                if (!this.f450828n) {
                    java.util.Iterator it6 = linkedList.iterator();
                    while (it6.hasNext()) {
                        arrayList3.add((com.p314xaae8f345.mm.p2621x8fb0427b.z3) ((r35.a2) it6.next()).f450572a);
                    }
                }
            }
            if (this.f450828n) {
                this.f450835u = arrayList4.size();
            } else if (this.f450827m) {
                com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var3 = this.f450831q;
                if (a3Var3 == null || a3Var3.P0()) {
                    int size = arrayList3.size();
                    int i18 = L;
                    this.f450835u = size >= i18 + (-1) ? i18 - 1 : arrayList3.size();
                } else {
                    int size2 = arrayList3.size();
                    int i19 = L;
                    if (size2 < i19) {
                        i19 = arrayList3.size();
                    }
                    this.f450835u = i19;
                }
            } else {
                this.f450835u = arrayList3.size();
            }
        }
        int i27 = this.f450835u;
        if (i27 == 0) {
            this.f450834t = M;
        } else {
            boolean z18 = this.f450838x;
            if (z18 && this.f450837w && this.f450839y) {
                int i28 = M;
                this.f450834t = (((i27 + 2) / i28) + 1) * i28;
            } else if ((z18 && this.f450837w && !this.f450839y) || ((z18 && !this.f450837w && this.f450839y) || (!z18 && this.f450837w && this.f450839y))) {
                int i29 = M;
                this.f450834t = (((i27 + 1) / i29) + 1) * i29;
            } else if ((z18 && !this.f450837w && !this.f450839y) || ((!z18 && this.f450837w && !this.f450839y) || (!z18 && !this.f450837w && this.f450839y))) {
                int i37 = M;
                this.f450834t = ((i27 / i37) + 1) * i37;
            } else if (!z18 && !this.f450837w && !this.f450839y) {
                int i38 = M;
                this.f450834t = (((i27 - 1) / i38) + 1) * i38;
            }
        }
        lz.g gVar = this.f450821d;
        if (gVar == null || (rVar = ((r35.t1) gVar).f450794a.f450803b) == null) {
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).notifyDataSetChanged();
    }

    public final void j(java.lang.String str) {
        java.util.HashMap hashMap = this.f450820J;
        r35.x1 x1Var = (r35.x1) hashMap.get(str);
        if (x1Var == null || this.F != x1Var.f450855a) {
            hashMap.put(str, new r35.x1(this.F, false));
        }
    }
}
