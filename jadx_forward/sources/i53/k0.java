package i53;

/* loaded from: classes8.dex */
public class k0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f370155d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f370156e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f370157f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f370158g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f370159h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f370160i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public vl1.p f370161m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i53.n0 f370162n;

    public k0(i53.n0 n0Var, android.content.Context context) {
        this.f370162n = n0Var;
        this.f370155d = context;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f370160i.size() + (!this.f370158g.isEmpty() ? 1 : 0) + (!this.f370159h.isEmpty() ? 1 : 0);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        if (i17 >= 0 && i17 < mo1894x7e414b06()) {
            java.util.LinkedList linkedList = this.f370158g;
            if (i17 == 0 && !linkedList.isEmpty()) {
                return Integer.MAX_VALUE;
            }
            if (i17 == mo1894x7e414b06() - 1 && !this.f370159h.isEmpty()) {
                return 2147483646;
            }
            int i18 = i17 - (!linkedList.isEmpty() ? 1 : 0);
            if (i18 >= 0) {
                java.util.LinkedList linkedList2 = this.f370160i;
                if (i18 < linkedList2.size()) {
                    p33.l lVar = (p33.l) linkedList2.get(i18);
                    if (lVar != null && lVar.f433136e) {
                        return 1;
                    }
                    if (lVar != null && lVar.f433137f) {
                        return 2;
                    }
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r9, int r10) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i53.k0.mo864xe5e2e48d(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        if (i17 == Integer.MAX_VALUE) {
            if (this.f370156e == null) {
                this.f370156e = (android.view.ViewGroup) android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cxf, viewGroup, false);
            }
            this.f370156e.removeAllViews();
            java.util.Iterator it = this.f370158g.iterator();
            while (it.hasNext()) {
                this.f370156e.addView((android.view.View) it.next());
            }
            return new i53.m0(this.f370156e);
        }
        if (i17 != 2147483646) {
            android.content.Context context = this.f370155d;
            return i17 == 1 ? new i53.m0(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570692bi2, viewGroup, false)) : i17 == 2 ? new i53.m0(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bg7, viewGroup, false)) : new i53.m0(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570690bi0, viewGroup, false));
        }
        if (this.f370157f == null) {
            this.f370157f = (android.view.ViewGroup) android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cxf, viewGroup, false);
        }
        this.f370157f.removeAllViews();
        java.util.Iterator it6 = this.f370159h.iterator();
        while (it6.hasNext()) {
            this.f370157f.addView((android.view.View) it6.next());
        }
        return new i53.m0(this.f370157f);
    }

    public final int x(int i17) {
        if (i17 >= 0) {
            java.util.LinkedList linkedList = this.f370160i;
            if (i17 < linkedList.size()) {
                int i18 = 0;
                for (int i19 = 0; i19 < i17 + 1; i19++) {
                    p33.l lVar = (p33.l) linkedList.get(i19);
                    if (!lVar.f433136e && !lVar.f433137f) {
                        i18++;
                    }
                }
                return i18;
            }
        }
        return i17;
    }

    public final void y(int i17, int i18, java.lang.String str, java.lang.String str2) {
        i53.n0 n0Var = this.f370162n;
        int i19 = n0Var.f370201b2 == 8762 ? 7 : 6;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("videoid", str2);
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 87, n0Var.f370201b2, i17, i18, str, n0Var.f370202c2, lj0.a.a(i19, hashMap));
    }
}
