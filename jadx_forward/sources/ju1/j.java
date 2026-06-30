package ju1;

/* loaded from: classes9.dex */
public final class j extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f383273d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f383274e;

    public j(boolean z17) {
        this.f383273d = z17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        java.util.ArrayList arrayList = this.f383274e;
        if (arrayList != null) {
            return 0 + arrayList.size();
        }
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        ju1.a x17 = x(i17);
        if (x17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CouponAndGiftCardListAdapter", "[getItemId] position=" + i17 + " itemCount=" + mo1894x7e414b06() + " }");
            return 0L;
        }
        java.lang.String str = x17.f383222b;
        if (str == null) {
            str = "";
        }
        r45.tt ttVar = x17.f383223c;
        java.lang.String str2 = ttVar != null ? ttVar.f468298d : null;
        java.lang.String concat = str.concat(str2 != null ? str2 : "");
        if (concat == null || concat.length() == 0) {
            return x17.hashCode();
        }
        return (concat + i17).hashCode();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        ju1.a x17 = x(i17);
        if (x17 != null) {
            return x17.f383221a;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r3 != 5) goto L149;
     */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r23, int r24) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ju1.j.mo864xe5e2e48d(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(i17 != 0 ? (i17 == 1 || !(i17 == 2 || i17 == 3 || i17 == 4 || i17 != 5)) ? com.p314xaae8f345.mm.R.C30864xbddafb2a.f569822p7 : com.p314xaae8f345.mm.R.C30864xbddafb2a.f569838pn : com.p314xaae8f345.mm.R.C30864xbddafb2a.f569904ri, parent, false);
        if (this.f383273d) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.6f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/v4/CardsAndOffersAdapter", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/tencent/mm/plugin/card/ui/v4/CardsAndOffersAdapter$CardTicketVH;", "android/view/View_EXEC_", "setAlpha", "(F)V");
            inflate.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(inflate, "com/tencent/mm/plugin/card/ui/v4/CardsAndOffersAdapter", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/tencent/mm/plugin/card/ui/v4/CardsAndOffersAdapter$CardTicketVH;", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new ju1.i(inflate, i17);
    }

    public final ju1.a x(int i17) {
        java.util.ArrayList arrayList = this.f383274e;
        if (arrayList == null) {
            return null;
        }
        boolean z17 = false;
        if (i17 >= 0 && i17 < arrayList.size()) {
            z17 = true;
        }
        if (z17) {
            return (ju1.a) arrayList.get(i17);
        }
        return null;
    }
}
