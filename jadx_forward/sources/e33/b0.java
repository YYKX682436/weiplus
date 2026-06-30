package e33;

/* loaded from: classes10.dex */
public class b0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 implements e33.j2 {
    public boolean A;
    public boolean B;
    public f60.a C;
    public boolean D;
    public boolean E;
    public final kn5.e F;
    public final kn5.g G;
    public final android.view.View.OnLongClickListener H;
    public final android.view.View.OnClickListener I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f328660J;
    public long K;
    public e33.r L;
    public final android.view.View.OnClickListener M;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f328662e;

    /* renamed from: h, reason: collision with root package name */
    public final e33.i2 f328665h;

    /* renamed from: m, reason: collision with root package name */
    public int f328667m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f328668n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f328670p;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f328676v;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f328678x;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f328680z;

    /* renamed from: d, reason: collision with root package name */
    public int f328661d = 9;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f328663f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f328664g = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.text.SimpleDateFormat f328666i = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm", java.util.Locale.getDefault());

    /* renamed from: o, reason: collision with root package name */
    public int f328669o = 10;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f328671q = "";

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f328672r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f328673s = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public boolean f328674t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f328675u = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f328677w = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f328679y = false;

    public b0(boolean z17, android.content.Context context, e33.i2 i2Var) {
        this.f328676v = false;
        this.f328678x = false;
        this.f328680z = t23.p0.k().f496830f == 3 && ((d40.n) ((e40.v) i95.n0.c(e40.v.class))).wi();
        this.A = false;
        this.B = false;
        this.C = null;
        this.D = false;
        this.E = false;
        e33.d dVar = new e33.d(this);
        this.G = new e33.g(this);
        this.H = new e33.h(this);
        this.I = new e33.i(this);
        this.M = new e33.b(this);
        this.f328662e = context;
        this.f328665h = i2Var;
        this.f328676v = z17;
        this.F = kn5.e.E.a(context, dVar, new e33.c(this, context));
        this.f328678x = bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2507xdbb7bd.C19923x17d56587()) == 1;
        for (int i17 = 0; i17 < 32; i17++) {
            this.f328663f.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15631xba892b3b());
        }
        m8146xced61ae5();
    }

    public static void x(e33.b0 b0Var, android.view.View view) {
        b0Var.getClass();
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.f566921hj1);
        if (tag instanceof java.lang.Integer) {
            int intValue = ((java.lang.Integer) tag).intValue();
            b0Var.E = b0Var.f328664g.contains(b0Var.E(intValue));
            b0Var.F.f(true, intValue);
        }
    }

    public java.lang.String B(int i17) {
        java.util.LinkedList linkedList = this.f328672r;
        if (i17 < linkedList.size()) {
            i17 = linkedList.size();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 E = E(i17);
        if (E == null) {
            return "";
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(E.f219974s)) {
            return E.f219974s;
        }
        return com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().d(new java.util.Date(E.f219968m), this.f328662e);
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 E(int i17) {
        java.util.LinkedList linkedList = this.f328672r;
        if (i17 < linkedList.size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumAdapter", "get header, pos[%d]", java.lang.Integer.valueOf(i17));
            return null;
        }
        if (i17 >= z() + I()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumAdapter", "get footer, pos[%d]", java.lang.Integer.valueOf(i17));
            return null;
        }
        int size = i17 - linkedList.size();
        java.util.ArrayList arrayList = this.f328663f;
        if (size < arrayList.size()) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList.get(size);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AlbumAdapter", "get item error, media items size[%d], adjustPos[%d]", java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(size));
        return null;
    }

    public int I() {
        return this.f328663f.size();
    }

    public int J() {
        return this.f328664g.size();
    }

    public java.util.ArrayList K() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f328664g.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it.next()).f219963e);
        }
        return arrayList;
    }

    public java.util.ArrayList L(int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f328663f.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it.next();
            if (i17 == 2) {
                if (abstractC15633xee433078.mo63659xfb85f7b0() == i17) {
                    arrayList.add(abstractC15633xee433078);
                }
            } else if (abstractC15633xee433078.r()) {
                arrayList.add(abstractC15633xee433078);
            }
        }
        return arrayList;
    }

    public void M(x.d dVar) {
        int i17 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.f328664g;
            if (i17 >= arrayList.size()) {
                break;
            }
            int indexOf = this.f328663f.indexOf((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList.get(i17));
            if (indexOf != -1) {
                dVar.add(java.lang.Integer.valueOf(indexOf));
            }
            i17++;
        }
        java.util.Iterator it = dVar.iterator();
        while (it.hasNext()) {
            m8147xed6e4d18(((java.lang.Integer) it.next()).intValue() + z());
        }
    }

    public void N(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078) {
        java.util.ArrayList arrayList = this.f328664g;
        if (arrayList.contains(abstractC15633xee433078)) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (int indexOf = arrayList.indexOf(abstractC15633xee433078); indexOf < arrayList.size(); indexOf++) {
                int indexOf2 = this.f328663f.indexOf((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList.get(indexOf));
                if (indexOf2 != -1) {
                    arrayList2.add(java.lang.Integer.valueOf(indexOf2));
                }
            }
            arrayList.remove(abstractC15633xee433078);
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                m8147xed6e4d18(((java.lang.Integer) it.next()).intValue() + z());
            }
        }
    }

    public void O(java.util.ArrayList arrayList, java.util.List list) {
        java.util.ArrayList arrayList2 = this.f328664g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumAdapter", "before set selected paths, selected[%s].", arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2);
        arrayList2.clear();
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078.b(0, 0L, str, "", "");
                if (list != null) {
                    int indexOf = list.indexOf(b17);
                    if (indexOf >= 0) {
                        arrayList2.add((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) list.get(indexOf));
                    } else {
                        java.lang.String c17 = q75.g.c(str);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumAdapter", "media item no exist on preview items.");
                        int indexOf2 = arrayList3.indexOf(b17);
                        if (indexOf2 >= 0) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList3.get(indexOf2);
                            if (abstractC15633xee433078.mo63659xfb85f7b0() == 6) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumAdapter", "setSelectedMediaPaths >> previewList is no exist in other folder mediaId: %d", java.lang.Long.valueOf(abstractC15633xee433078.f219967i));
                                arrayList2.add(abstractC15633xee433078);
                            }
                        }
                        if (str.toLowerCase().endsWith("mp4")) {
                            arrayList2.add(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078.b(2, 0L, str, "", ""));
                        } else {
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17)) {
                                c17 = "";
                            }
                            arrayList2.add(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078.b(1, 0L, str, "", c17));
                        }
                    }
                }
            }
        }
    }

    public final void P(java.lang.String str) {
        android.content.Context context = this.f328662e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.u(str);
        u1Var.n(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fil));
        u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.C13602x6871ba6());
        u1Var.q(false);
        if (this.D) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new e33.a(this), 200L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x02fc, code lost:
    
        if (r2 == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0371, code lost:
    
        if (((r5 != null ? r5.f219979x : 0) / 1000) > r4) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0297, code lost:
    
        if ((r2 != null && r2.a() == r5) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0275, code lost:
    
        if (r2.d() != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0277, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:194:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x028c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Q(int r23, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 r24, android.view.View r25) {
        /*
            Method dump skipped, instructions count: 1352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e33.b0.Q(int, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem, android.view.View):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return z() + this.f328673s.size() + I();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        return i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        java.util.LinkedList linkedList = this.f328672r;
        if (i17 < linkedList.size()) {
            return ((e33.q) linkedList.get(i17)).f328970a;
        }
        int mo1894x7e414b06 = mo1894x7e414b06();
        java.util.LinkedList linkedList2 = this.f328673s;
        if (i17 < mo1894x7e414b06 - linkedList2.size()) {
            return 1;
        }
        int mo1894x7e414b062 = i17 - (mo1894x7e414b06() - linkedList2.size());
        if (linkedList2.size() > mo1894x7e414b062) {
            return ((e33.p) linkedList2.get(mo1894x7e414b062)).f328961a;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlbumAdapter", "getItemViewType: pos=%d, get footer type error", java.lang.Integer.valueOf(i17));
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x06a0  */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v42 */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r44, int r45) {
        /*
            Method dump skipped, instructions count: 2105
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e33.b0.mo864xe5e2e48d(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        android.content.Context context = this.f328662e;
        return i17 != 0 ? (i17 == 2 || i17 == 3) ? new e33.u(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bdk, viewGroup, false)) : i17 != 4 ? new e33.m(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cie, viewGroup, false)) : new e33.w(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.an_, viewGroup, false)) : new e33.o(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.o_, viewGroup, false));
    }

    public void y(e33.q qVar) {
        if (qVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AlbumAdapter", "addHeader error, header is null");
            return;
        }
        java.util.LinkedList linkedList = this.f328672r;
        linkedList.remove(qVar);
        linkedList.add(qVar);
    }

    public int z() {
        return this.f328672r.size();
    }
}
