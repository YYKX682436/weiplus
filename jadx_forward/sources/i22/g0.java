package i22;

/* loaded from: classes15.dex */
public final class g0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f369499d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f369500e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f369501f;

    /* renamed from: g, reason: collision with root package name */
    public i22.o0 f369502g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f369503h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f369504i;

    /* renamed from: m, reason: collision with root package name */
    public int f369505m;

    /* renamed from: n, reason: collision with root package name */
    public int f369506n;

    /* renamed from: o, reason: collision with root package name */
    public final i22.x0 f369507o;

    /* renamed from: p, reason: collision with root package name */
    public int f369508p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.l f369509q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f369510r;

    public g0(android.content.Context context, java.util.List itemListData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemListData, "itemListData");
        this.f369499d = context;
        this.f369500e = itemListData;
        this.f369501f = "MicroMsg.EmojiStoreV3SingleProductAdapter";
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.byv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        this.f369507o = new i22.x0(string);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f369500e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        i22.n0 n0Var = (i22.n0) kz5.n0.a0(this.f369500e, i17);
        if (n0Var != null) {
            return n0Var.mo134661xfb85f7b0();
        }
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onAttachedToRecyclerView */
    public void mo8156x4147ed22(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        super.mo8156x4147ed22(recyclerView);
        recyclerView.i(new i22.f0(this));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        yz5.a aVar;
        i22.m holder = (i22.m) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        holder.i((i22.n0) this.f369500e.get(i17), new java.util.ArrayList());
        if (this.f369503h != null) {
            int mo1894x7e414b06 = (mo1894x7e414b06() - 1) - this.f369505m;
            if (mo1894x7e414b06 < 0) {
                mo1894x7e414b06 = 0;
            }
            if (i17 != mo1894x7e414b06 || this.f369506n == 0 || (aVar = this.f369503h) == null) {
                return;
            }
            aVar.mo152xb9724478();
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(parent.getContext());
        if (i17 == 4) {
            android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a8q, parent, false);
            android.content.Context context = this.f369499d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return new i22.e0(context, inflate, this.f369502g, null, 8, null);
        }
        if (i17 == 8) {
            android.view.View inflate2 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a8m, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
            return new i22.d0(inflate2);
        }
        android.view.View inflate3 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a8p, parent, false);
        this.f369508p++;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate3);
        return new i22.c0(inflate3);
    }

    public final void x(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager) {
        yz5.l lVar;
        if (layoutManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f369501f, "reportExposeData failed, recyclerview layoutManager null");
            return;
        }
        if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
            int w17 = c1162x665295de.w();
            int y17 = c1162x665295de.y();
            if (y17 - w17 <= 0) {
                return;
            }
            e06.k kVar = new e06.k(w17, y17);
            int i17 = this.f369508p;
            j22.l lVar2 = new j22.l(0L, null, 0, 0, null, null, 63, null);
            java.lang.StringBuilder sb6 = lVar2.f378799d;
            java.lang.StringBuilder sb7 = lVar2.f378798c;
            int i18 = kVar.f327743e;
            if (w17 <= i18) {
                boolean z17 = true;
                while (true) {
                    i22.n0 n0Var = (i22.n0) this.f369500e.get(w17);
                    if (n0Var instanceof i22.c1) {
                        if (!z17) {
                            sb7.append("#");
                            sb6.append("#");
                        }
                        r45.ri0 ri0Var = ((i22.c1) n0Var).f369485a;
                        sb7.append(ri0Var != null ? ri0Var.f466419d : null);
                        sb6.append((w17 + 1) - i17);
                        z17 = false;
                    }
                    if (w17 == i18) {
                        break;
                    } else {
                        w17++;
                    }
                }
            }
            if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(sb7.toString()) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(sb6.toString())) || (lVar = this.f369509q) == null) {
                return;
            }
            lVar.mo146xb9724478(lVar2);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List payloads) {
        i22.m holder = (i22.m) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        if (!payloads.isEmpty()) {
            holder.i((i22.n0) this.f369500e.get(i17), payloads);
        } else {
            super.mo8157xe5e2e48d(holder, i17, payloads);
        }
    }
}
