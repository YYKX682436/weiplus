package sj3;

/* loaded from: classes14.dex */
public final class d extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f489992d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f489993e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f489994f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.HashSet f489995g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f489996h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.HashSet f489997i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f489998m;

    /* renamed from: n, reason: collision with root package name */
    public final int f489999n;

    /* renamed from: o, reason: collision with root package name */
    public int f490000o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.j f490001p;

    public d(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f489992d = context;
        this.f489993e = new java.util.concurrent.CopyOnWriteArrayList();
        this.f489999n = 1;
        this.f490000o = 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f489993e;
        int size = copyOnWriteArrayList.size();
        int i17 = this.f489999n;
        if (size > 12) {
            this.f489998m = true;
            this.f490000o = 1;
            return copyOnWriteArrayList.size() + i17 + this.f490000o;
        }
        this.f489998m = false;
        this.f490000o = 0;
        return copyOnWriteArrayList.size() + i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        if (i17 == 0) {
            return 2;
        }
        return (i17 == mo1894x7e414b06() - 1 && this.f489998m) ? 3 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0187  */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r28, int r29) {
        /*
            Method dump skipped, instructions count: 1437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sj3.d.mo864xe5e2e48d(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f489992d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bvq, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new sj3.j(inflate);
    }

    public final int x() {
        android.content.Context context = this.f489992d;
        int k17 = i65.a.k(context) - i65.a.b(context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.k2.f34622x366c91de);
        int i17 = com.p314xaae8f345.mm.ui.bk.h(context).x;
        int i18 = this.f489999n;
        return k17 > i17 ? (mo1894x7e414b06() - i18) - this.f490000o < 5 ? i17 / 2 : i17 / 3 : (mo1894x7e414b06() - i18) - this.f490000o < 5 ? k17 / 2 : k17 / 3;
    }
}
