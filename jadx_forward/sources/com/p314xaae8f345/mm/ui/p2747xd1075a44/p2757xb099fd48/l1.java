package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes8.dex */
public class l1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f293447d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f293448e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.AdapterView.OnItemLongClickListener f293449f;

    /* renamed from: g, reason: collision with root package name */
    public db5.g4 f293450g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f293451h;

    public l1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, boolean z17) {
        this.f293451h = k0Var;
        this.f293447d = z17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        int size = this.f293450g.size();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f293451h;
        boolean z17 = this.f293447d;
        if (!z17 || !k0Var.f293394g2) {
            size += k0Var.M.size();
        }
        return k0Var.f293424y1 ? (z17 && k0Var.f293394g2) ? size : size + 1 : size;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        if (i17 < 0 || i17 >= this.f293450g.size()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f293451h;
            if (k0Var.M.size() > 0 && i17 < this.f293450g.size() + k0Var.M.size()) {
                return 2;
            }
            if (k0Var.f293424y1 && i17 == this.f293450g.size() + k0Var.M.size()) {
                return 3;
            }
        } else {
            android.view.MenuItem item = this.f293450g.getItem(i17);
            boolean z17 = item instanceof db5.h4;
            if (z17 && ((db5.h4) item).H) {
                return 5;
            }
            if (item instanceof db5.v5) {
                if (((db5.v5) item).M == 1) {
                    return 4;
                }
            }
            if (z17 && !((db5.h4) item).f309913x) {
                return 1;
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03e5  */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r41, int r42) {
        /*
            Method dump skipped, instructions count: 2230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.l1.mo864xe5e2e48d(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f293451h;
        int i18 = k0Var.R1;
        return new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k1(this, i18 == 0 ? android.view.LayoutInflater.from(k0Var.f293403m).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570802by0, viewGroup, false) : i18 == 2 ? android.view.LayoutInflater.from(k0Var.f293403m).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570803by1, viewGroup, false) : i17 == 5 ? android.view.LayoutInflater.from(k0Var.f293403m).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ejx, viewGroup, false) : android.view.LayoutInflater.from(k0Var.f293403m).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570804by2, viewGroup, false));
    }
}
