package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes9.dex */
public final class h0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f282504d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f282505e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f282506f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f282507g;

    public h0(android.content.Context context, java.lang.String mTalker, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mTalker, "mTalker");
        this.f282504d = context;
        this.f282505e = mTalker;
        this.f282506f = z17;
        this.f282507g = new java.util.ArrayList();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f282507g.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((zb5.c) this.f282507g.get(i17)).f552843c;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (((zb5.c) ((java.util.ArrayList) this.f282507g).get(i17)).f552843c != 0) {
            if (((zb5.c) ((java.util.ArrayList) this.f282507g).get(i17)).f552843c == 1) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.w) holder).f283060d.setText(((zb5.c) ((java.util.ArrayList) this.f282507g).get(i17)).f552844d);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = ((zb5.c) ((java.util.ArrayList) this.f282507g).get(i17)).f552841a;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = ((zb5.c) ((java.util.ArrayList) this.f282507g).get(i17)).f552842b;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p0 p0Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p0) holder;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19694xdfd03243 c19694xdfd03243 = p0Var.f282791d;
        if (c19694xdfd03243.getChildCount() == 0) {
            c19694xdfd03243.a();
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            c19694xdfd03243.addView(c19694xdfd03243.f272359m, layoutParams);
            c19694xdfd03243.m75582x5f9a8547(c19694xdfd03243.getLayoutParams().width);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19694xdfd03243 c19694xdfd032432 = p0Var.f282791d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = ((zb5.c) ((java.util.ArrayList) this.f282507g).get(i17)).f552842b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f9Var2);
        c19694xdfd032432.c(c21053xdbf1e5f4, f9Var2.m124847x74d37ac6(), true, true);
        holder.f3639x46306858.setOnLongClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.f0(f9Var, this, holder));
        holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g0(f9Var, c21053xdbf1e5f4, this));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == 0) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.efl, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p0(inflate);
        }
        if (i17 != 1) {
            android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.efi, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
            return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.v(inflate2);
        }
        android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.efk, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate3);
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.w(inflate3);
    }

    public final boolean x(long j17) {
        if (pt0.f0.f439742b1.k(this.f282505e, j17) != null) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmojiHistoryListAdapter", "[checkIsMsgValid] msgId: " + j17 + " not found, may have been deleted");
        android.content.Context context = this.f282504d;
        db5.e1.t(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p5z), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jz9), null);
        java.util.Iterator it = ((java.util.ArrayList) this.f282507g).iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = ((zb5.c) it.next()).f552842b;
            if (f9Var != null && f9Var.m124847x74d37ac6() == j17) {
                break;
            }
            i17++;
        }
        ((java.util.ArrayList) this.f282507g).removeIf(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.b0(j17));
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c0(this, i17));
        return false;
    }
}
