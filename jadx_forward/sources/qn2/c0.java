package qn2;

/* loaded from: classes3.dex */
public final class c0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f446580d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f446581e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cz1 f446582f;

    public c0(gk2.e liveData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        this.f446580d = liveData;
        this.f446581e = new java.util.LinkedList();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f446581e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570453au3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new qn2.b0(this, inflate);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x03c6, code lost:
    
        if (r2.m75933x41a8a7f2(1) != true) goto L124;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0411  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v1, types: [rn2.x2] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v35 */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo864xe5e2e48d(qn2.b0 r23, int r24) {
        /*
            Method dump skipped, instructions count: 1183
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qn2.c0.mo864xe5e2e48d(qn2.b0, int):void");
    }

    public final void y(java.util.LinkedList linkedList, r45.cz1 cz1Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateWinnerList,ori size:");
        java.util.LinkedList linkedList2 = this.f446581e;
        sb6.append(linkedList2.size());
        sb6.append(",new size:");
        sb6.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveLotteryWinnerListAdapter", sb6.toString());
        this.f446582f = cz1Var;
        linkedList2.clear();
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                linkedList2.add((r45.zy1) it.next());
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List payloads) {
        qn2.b0 holder = (qn2.b0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveLotteryWinnerListAdapter", "onBindViewHolder payload, pos:" + i17 + ",payloads:" + payloads);
        if (!payloads.isEmpty()) {
            java.util.Iterator it = payloads.iterator();
            while (it.hasNext()) {
                it.next();
            }
            return;
        }
        mo864xe5e2e48d(holder, i17);
    }
}
