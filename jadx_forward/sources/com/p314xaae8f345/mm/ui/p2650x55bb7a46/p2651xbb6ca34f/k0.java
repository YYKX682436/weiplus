package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f;

/* loaded from: classes9.dex */
public class k0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: f, reason: collision with root package name */
    public static com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.i0 f279963f;

    /* renamed from: g, reason: collision with root package name */
    public static com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.j0 f279964g;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f279965d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f279966e;

    public k0(android.content.Context context, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.j0 j0Var) {
        f279964g = j0Var;
        this.f279965d = context;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.j0 j0Var = f279964g;
        int size = (j0Var == null || (arrayList = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y) j0Var).f284079i) == null) ? 0 : arrayList.size();
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(f279964g == null);
        objArr[1] = java.lang.Integer.valueOf(size);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryListAdapter", " null == mIDetail?%s getItemCount:%s", objArr);
        return size;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y) f279964g).h(i17).a();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        int mo863xcdaf1228 = mo863xcdaf1228(i17);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0 h17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y) f279964g).h(i17);
        android.content.Context context = this.f279965d;
        if (mo863xcdaf1228 == Integer.MAX_VALUE) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0 h18 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y) f279964g).h(i17 + 1);
            if (i17 != mo1894x7e414b06() - 1) {
                if (com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().a(new java.util.Date(h18.f279941a)) == com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().a(new java.util.Date(h17.f279941a))) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.h0 h0Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.h0) k3Var;
                    h0Var.f279952d.setVisibility(0);
                    h0Var.f279952d.setText(com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().d(new java.util.Date(h17.f279941a), context));
                    f279964g.d(k3Var, i17, mo863xcdaf1228);
                    return;
                }
            }
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.h0) k3Var).f279952d.setVisibility(8);
            return;
        }
        if (mo863xcdaf1228 == 2147483646) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.e0 e0Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.e0) k3Var;
        e0Var.f279938h.setTag(java.lang.Integer.valueOf(i17));
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(e0Var.f279934d, h17.f279945e, null);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f279966e);
        java.lang.String str = h17.f279948h;
        java.lang.String str2 = h17.f279947g;
        if (K0) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    str = h17.f279946f;
                }
            }
            str = str2;
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str = h17.f279946f;
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.f279946f) && h17.f279946f.contains(this.f279966e)) {
                str = str + "(" + h17.f279946f + ")";
            }
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.contains(this.f279966e)) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.f279946f) && h17.f279946f.contains(this.f279966e)) {
                str = str2 + "(" + h17.f279946f + ")";
            }
            str = str2;
        } else {
            str = str2 + "(" + str + ")";
        }
        android.widget.TextView textView = e0Var.f279935e;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize));
        e0Var.f279936f.setText(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.w6.c(context, h17.f279941a));
        java.lang.String str3 = h17.f279943c;
        android.widget.TextView textView2 = e0Var.f279937g;
        textView2.setText(str3);
        f279964g.f(e0Var, i17, mo863xcdaf1228);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f279966e)) {
            return;
        }
        e0Var.i(textView, this.f279966e);
        e0Var.i(textView2, this.f279966e);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        if (i17 != Integer.MAX_VALUE) {
            return i17 == 2147483646 ? new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.b0(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bcc, viewGroup, false)) : f279964g.c(viewGroup, i17);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 e17 = f279964g.e(viewGroup, i17);
        return e17 == null ? new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.h0(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bdj, viewGroup, false)) : e17;
    }
}
