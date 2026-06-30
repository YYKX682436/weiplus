package wr3;

/* loaded from: classes11.dex */
public abstract class f0 extends wr3.i {

    /* renamed from: m, reason: collision with root package name */
    public final android.content.Context f530311m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f530312n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f530313o;

    /* renamed from: p, reason: collision with root package name */
    public final int f530314p;

    /* renamed from: q, reason: collision with root package name */
    public final long f530315q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f530316r;

    /* renamed from: s, reason: collision with root package name */
    public final sr3.g f530317s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.z3 f530318t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f530319u;

    /* renamed from: v, reason: collision with root package name */
    public r45.ul f530320v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f530321w;

    public f0(android.content.Context context, java.lang.String bizUsername, boolean z17, int i17, long j17, boolean z18, sr3.g config, com.p314xaae8f345.mm.p2621x8fb0427b.z3 contact) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        this.f530311m = context;
        this.f530312n = bizUsername;
        this.f530313o = z17;
        this.f530314p = i17;
        this.f530315q = j17;
        this.f530316r = z18;
        this.f530317s = config;
        this.f530318t = contact;
        this.f530319u = new java.util.ArrayList();
    }

    @Override // wr3.i
    public android.content.Context B() {
        return this.f530311m;
    }

    @Override // wr3.i
    public long E() {
        return this.f530315q;
    }

    @Override // wr3.i
    public boolean J() {
        return this.f530313o;
    }

    @Override // wr3.i
    public boolean K() {
        return this.f530316r;
    }

    public abstract void L(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17);

    public java.util.List M(java.util.List msgList, java.util.LinkedList linkedList, java.util.LinkedList linkedList2) {
        java.util.LinkedList<r45.o5> linkedList3;
        r45.l5 l5Var;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (linkedList2 != null) {
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                vr3.h hVar = (vr3.h) it.next();
                r45.s5 s5Var = hVar.f521164a;
                if (s5Var != null && S(s5Var)) {
                    wr3.n0 n0Var = hVar.f521165b;
                    if (n0Var == null) {
                        n0Var = wr3.n0.f530375f;
                    }
                    arrayList.add(N(n0Var, s5Var, R()));
                }
            }
        }
        if (linkedList != null) {
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                r45.s5 s5Var2 = (r45.s5) it6.next();
                r45.p5 p5Var = s5Var2.f467047i;
                if (p5Var != null && (linkedList3 = p5Var.f464287e) != null) {
                    for (r45.o5 o5Var : linkedList3) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(o5Var);
                        r45.s5 s5Var3 = null;
                        try {
                            r45.p5 p5Var2 = s5Var2.f467047i;
                            if (p5Var2 != null && (l5Var = p5Var2.f464286d) != null) {
                                r45.s5 s5Var4 = new r45.s5();
                                r45.y5 y5Var = s5Var2.f467042d;
                                if (y5Var != null) {
                                    r45.y5 y5Var2 = new r45.y5();
                                    y5Var2.f472324e = y5Var.f472324e;
                                    y5Var2.f472325f = y5Var.f472325f;
                                    y5Var2.f472323d = y5Var.f472323d;
                                    y5Var2.f472326g = y5Var.f472326g;
                                    y5Var2.f472327h = y5Var.f472327h;
                                    y5Var2.f472328i = y5Var.f472328i;
                                    s5Var4.f467042d = y5Var2;
                                }
                                r45.z5 z5Var = o5Var.R;
                                if (z5Var != null) {
                                    i17 = z5Var.f473251e;
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("BizProfileTabCommonAdapter", "expandFeaturedDetailInfoToMessage appMsgId use originAppMsgBaseInfo");
                                    i17 = l5Var.f460671d;
                                }
                                r45.p5 p5Var3 = new r45.p5();
                                r45.l5 l5Var2 = new r45.l5();
                                l5Var2.f460671d = i17;
                                l5Var2.f460672e = l5Var.f460672e;
                                l5Var2.f460673f = l5Var.f460673f;
                                l5Var2.f460674g = l5Var.f460674g;
                                l5Var2.f460675h = l5Var.f460675h;
                                l5Var2.f460676i = l5Var.f460676i;
                                p5Var3.f464286d = l5Var2;
                                p5Var3.f464287e.add(o5Var);
                                s5Var4.f467047i = p5Var3;
                                s5Var3 = s5Var4;
                            }
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BizProfileTabCommonAdapter", "expandFeaturedDetailInfoToMessage failed: " + e17.getMessage(), e17);
                        }
                        if (s5Var3 != null && S(s5Var3)) {
                            arrayList.add(N(wr3.n0.f530379m, s5Var3, R()));
                        }
                    }
                }
            }
        }
        java.util.Iterator it7 = msgList.iterator();
        while (it7.hasNext()) {
            r45.s5 s5Var5 = (r45.s5) it7.next();
            if (S(s5Var5)) {
                arrayList.add(N(wr3.n0.f530375f, s5Var5, R()));
            }
        }
        return arrayList;
    }

    public abstract wr3.c0 N(wr3.n0 n0Var, r45.s5 s5Var, int i17);

    public abstract p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 O(android.view.ViewGroup viewGroup, int i17);

    public abstract int P();

    public abstract int Q();

    public abstract int R();

    public boolean S(r45.s5 bizMessage) {
        java.util.LinkedList linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizMessage, "bizMessage");
        r45.p5 p5Var = bizMessage.f467047i;
        return (p5Var == null || (linkedList = p5Var.f464287e) == null || !(linkedList.isEmpty() ^ true)) ? false : true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        java.util.ArrayList arrayList = this.f530319u;
        if (arrayList.isEmpty()) {
            return 1;
        }
        return 1 + arrayList.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        java.util.ArrayList arrayList = this.f530319u;
        if (i17 >= arrayList.size()) {
            return this.f530321w ? P() : Q();
        }
        java.lang.Object obj = arrayList.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        return ((wr3.c0) obj).a();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (!(holder instanceof wr3.d0)) {
            if (holder instanceof wr3.e0) {
                return;
            }
            L(holder, i17);
        } else {
            yz5.a aVar = this.f530348e;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(parent.getContext());
        if (i17 == P()) {
            android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a19, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            return new wr3.d0(inflate);
        }
        if (i17 != Q()) {
            return O(parent, i17);
        }
        android.view.View inflate2 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e3k, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
        return new wr3.e0(inflate2);
    }

    @Override // wr3.i
    public int x() {
        return this.f530314p;
    }

    @Override // wr3.i
    public sr3.g y() {
        return this.f530317s;
    }

    @Override // wr3.i
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 z() {
        return this.f530318t;
    }
}
