package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c;

/* loaded from: classes11.dex */
public class l0 extends s35.b {

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f289075m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f289076n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f289077o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f289078p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.n f289079q;

    public l0(android.content.Context context) {
        super(context);
        this.f289079q = com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.n.ExtDeviceSync_Unknow;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.m mVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.m.f298233c;
        this.f289079q = mVar.a("");
        i();
        mVar.d("device_sync_status_changed_Android", new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.C22389x608481d(this));
    }

    @Override // s35.b
    public void a() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.m.f298233c.f("device_sync_status_changed_Android");
    }

    @Override // s35.b
    public int b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c8u;
    }

    @Override // s35.b
    public int c() {
        return 2;
    }

    @Override // s35.b
    public void h(android.view.View view) {
        this.f289076n = view.findViewById(com.p314xaae8f345.mm.R.id.aey);
        this.f289075m = view.findViewById(com.p314xaae8f345.mm.R.id.f564884af3);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.f564880af0);
        this.f289078p = c22699x3dcdb352;
        c22699x3dcdb352.m82040x7541828(((android.content.Context) this.f484375g.get()).getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77687x3cb06c5));
        this.f289077o = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f564886af5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x004d, code lost:
    
        if (((ug3.i.f509074o & 2) != 0) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x006a, code lost:
    
        if (r0 == 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ea, code lost:
    
        if ((ug3.i.f509072m != c01.d9.b().x()) != false) goto L149;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    @Override // s35.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean i() {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.l0.i():boolean");
    }

    @Override // s35.b
    public void k(int i17) {
        if (!this.f484377i) {
            if (i17 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OtherOnlineBanner", "isViewInitialized() should not be false!");
                return;
            }
            return;
        }
        android.view.View view = this.f289076n;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/banner/OtherOnlineBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/conversation/banner/OtherOnlineBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void l(java.lang.StringBuilder sb6) {
        int ordinal = this.f289079q.ordinal();
        java.lang.String string = ordinal != 2 ? ordinal != 4 ? null : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p5c) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p5d);
        if (string != null) {
            sb6.append(java.lang.String.format("（%s）", string));
        }
    }

    public final void m(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, int i17) {
        java.lang.Object tag = c22699x3dcdb352.getTag();
        boolean z17 = true;
        if (tag != null && ((java.lang.Integer) tag).intValue() == i17) {
            z17 = false;
        }
        if (z17) {
            c22699x3dcdb352.setTag(java.lang.Integer.valueOf(i17));
            c22699x3dcdb352.setImageResource(i17);
        }
    }
}
