package ea3;

/* loaded from: classes10.dex */
public class n extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f332161e;

    /* renamed from: h, reason: collision with root package name */
    public final ea3.j f332164h;

    /* renamed from: m, reason: collision with root package name */
    public int f332166m;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f332172s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f332173t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View.OnClickListener f332174u;

    /* renamed from: v, reason: collision with root package name */
    public ea3.k f332175v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View.OnClickListener f332176w;

    /* renamed from: d, reason: collision with root package name */
    public int f332160d = 9;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f332162f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f332163g = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.text.SimpleDateFormat f332165i = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm", java.util.Locale.getDefault());

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f332167n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f332168o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public boolean f332169p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f332170q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f332171r = true;

    public n(android.content.Context context, ea3.j jVar) {
        this.f332172s = false;
        ea3.b bVar = new ea3.b(this);
        this.f332173t = new ea3.d(this);
        this.f332174u = new ea3.e(this);
        this.f332176w = new ea3.f(this);
        this.f332161e = context;
        this.f332164h = jVar;
        kn5.e.E.a(context, bVar, new ea3.a(this, context));
        this.f332172s = bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2507xdbb7bd.C19923x17d56587()) == 1;
        for (int i17 = 0; i17 < 32; i17++) {
            this.f332162f.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15631xba892b3b());
        }
        m8146xced61ae5();
    }

    public int B() {
        return this.f332163g.size();
    }

    public void E(int i17) {
        java.util.Iterator it = this.f332167n.iterator();
        while (it.hasNext()) {
            if (((ea3.i) it.next()).f332159a == i17) {
                it.remove();
            }
        }
    }

    public void I(int i17) {
        if (B() > i17) {
            x();
        } else if ((i17 == 1 || this.f332160d == 1) && !this.f332171r) {
            m8146xced61ae5();
        }
        this.f332160d = i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0124, code lost:
    
        if (r7 >= r11.f332160d) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0131, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x012f, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x012d, code lost:
    
        if (r14.size() >= r11.f332160d) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(int r12, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 r13, android.view.View r14) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ea3.n.J(int, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem, android.view.View):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return y() + this.f332168o.size() + this.f332162f.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        return i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        java.util.LinkedList linkedList = this.f332167n;
        if (i17 < linkedList.size()) {
            return ((ea3.i) linkedList.get(i17)).f332159a;
        }
        int mo1894x7e414b06 = mo1894x7e414b06();
        java.util.LinkedList linkedList2 = this.f332168o;
        if (i17 < mo1894x7e414b06 - linkedList2.size()) {
            return 1;
        }
        int mo1894x7e414b062 = i17 - (mo1894x7e414b06() - linkedList2.size());
        if (linkedList2.size() <= mo1894x7e414b062) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppAlbumAdapter", "getItemViewType: pos=%d, get footer type error", java.lang.Integer.valueOf(i17));
            return -1;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(linkedList2.get(mo1894x7e414b062));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x048c  */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r34, int r35) {
        /*
            Method dump skipped, instructions count: 1387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ea3.n.mo864xe5e2e48d(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppAlbumAdapter", "onCreateViewHolder: viewType=%d", java.lang.Integer.valueOf(i17));
        android.content.Context context = this.f332161e;
        return i17 != 2 ? new ea3.h(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eir, viewGroup, false)) : new ea3.m(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eio, viewGroup, false));
    }

    public void x() {
        this.f332163g.clear();
        m8146xced61ae5();
        ((ea3.p) this.f332164h).m(B(), 0, 0, 1);
    }

    public int y() {
        return this.f332167n.size();
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 z(int i17) {
        java.util.LinkedList linkedList = this.f332167n;
        if (i17 < linkedList.size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppAlbumAdapter", "get header, pos[%d]", java.lang.Integer.valueOf(i17));
            return null;
        }
        int y17 = y();
        java.util.ArrayList arrayList = this.f332162f;
        if (i17 >= y17 + arrayList.size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppAlbumAdapter", "get footer, pos[%d]", java.lang.Integer.valueOf(i17));
            return null;
        }
        int size = i17 - linkedList.size();
        if (size < arrayList.size()) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList.get(size);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiteAppAlbumAdapter", "get item error, media items size[%d], adjustPos[%d]", java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(size));
        return null;
    }
}
