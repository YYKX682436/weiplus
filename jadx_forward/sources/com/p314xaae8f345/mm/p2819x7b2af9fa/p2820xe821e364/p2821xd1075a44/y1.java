package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes15.dex */
public abstract class y1 {

    /* renamed from: z, reason: collision with root package name */
    public static final java.util.List f296235z = java.util.Collections.emptyList();

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f296236d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f296237e;

    /* renamed from: p, reason: collision with root package name */
    public int f296245p;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 f296253x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.u0 f296254y;

    /* renamed from: f, reason: collision with root package name */
    public int f296238f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f296239g = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f296240h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f296241i = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f296242m = -1;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 f296243n = null;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 f296244o = null;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f296246q = null;

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f296247r = null;

    /* renamed from: s, reason: collision with root package name */
    public int f296248s = 0;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.n1 f296249t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f296250u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f296251v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f296252w = -1;

    public y1(android.view.View view) {
        if (view == null) {
            throw new java.lang.IllegalArgumentException("itemView may not be null");
        }
        this.f296236d = view;
    }

    public void b(java.lang.Object obj) {
        if (obj == null) {
            c(1024);
            return;
        }
        if ((1024 & this.f296245p) == 0) {
            if (this.f296246q == null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                this.f296246q = arrayList;
                this.f296247r = java.util.Collections.unmodifiableList(arrayList);
            }
            ((java.util.ArrayList) this.f296246q).add(obj);
        }
    }

    public void c(int i17) {
        this.f296245p = i17 | this.f296245p;
    }

    public final int e() {
        int i17 = this.f296242m;
        return i17 == -1 ? this.f296238f : i17;
    }

    public java.util.List f() {
        java.util.List list;
        return ((this.f296245p & 1024) != 0 || (list = this.f296246q) == null || ((java.util.ArrayList) list).size() == 0) ? f296235z : this.f296247r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h() {
        return (this.f296245p & 1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j() {
        return (this.f296245p & 4) != 0;
    }

    public final boolean k() {
        if ((this.f296245p & 16) == 0) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (!n3.u0.i(this.f296236d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m() {
        return (this.f296245p & 8) != 0;
    }

    public boolean r() {
        return this.f296249t != null;
    }

    public boolean s() {
        return (this.f296245p & 256) != 0;
    }

    /* renamed from: toString */
    public java.lang.String m83643x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + java.lang.Integer.toHexString(hashCode()) + " position=" + this.f296238f + " id=" + this.f296240h + ", oldPos=" + this.f296239g + ", pLpos:" + this.f296242m);
        if (r()) {
            sb6.append(" scrap ");
            sb6.append(this.f296250u ? "[changeScrap]" : "[attachedScrap]");
        }
        if (j()) {
            sb6.append(" invalid");
        }
        if (!h()) {
            sb6.append(" unbound");
        }
        boolean z17 = true;
        if ((this.f296245p & 2) != 0) {
            sb6.append(" update");
        }
        if (m()) {
            sb6.append(" removed");
        }
        if (y()) {
            sb6.append(" ignored");
        }
        if (s()) {
            sb6.append(" tmpDetached");
        }
        if (!k()) {
            sb6.append(" not recyclable(" + this.f296248s + ")");
        }
        if ((this.f296245p & 512) == 0 && !j()) {
            z17 = false;
        }
        if (z17) {
            sb6.append(" undefined adapter position");
        }
        if (this.f296236d.getParent() == null) {
            sb6.append(" no parent");
        }
        sb6.append("}");
        return sb6.toString();
    }

    public void v(int i17, boolean z17) {
        if (this.f296239g == -1) {
            this.f296239g = this.f296238f;
        }
        if (this.f296242m == -1) {
            this.f296242m = this.f296238f;
        }
        if (z17) {
            this.f296242m += i17;
        }
        this.f296238f += i17;
        android.view.View view = this.f296236d;
        if (view.getLayoutParams() != null) {
            ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.LayoutParams) view.getLayoutParams()).f295960c = true;
        }
    }

    public void w() {
        if (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.Y1 && s()) {
            throw new java.lang.IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.f296245p = 0;
        this.f296238f = -1;
        this.f296239g = -1;
        this.f296240h = -1L;
        this.f296242m = -1;
        this.f296248s = 0;
        this.f296243n = null;
        this.f296244o = null;
        java.util.List list = this.f296246q;
        if (list != null) {
            ((java.util.ArrayList) list).clear();
        }
        this.f296245p &= -1025;
        this.f296251v = 0;
        this.f296252w = -1;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.j(this);
    }

    public final void x(boolean z17) {
        int i17 = this.f296248s;
        int i18 = z17 ? i17 - 1 : i17 + 1;
        this.f296248s = i18;
        if (i18 < 0) {
            this.f296248s = 0;
            if (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.Y1) {
                throw new java.lang.RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            m83643x9616526c();
        } else if (!z17 && i18 == 1) {
            this.f296245p |= 16;
        } else if (z17 && i18 == 0) {
            this.f296245p &= -17;
        }
        if (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.Z1) {
            m83643x9616526c();
        }
    }

    public boolean y() {
        return (this.f296245p & 128) != 0;
    }
}
