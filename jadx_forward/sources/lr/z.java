package lr;

/* loaded from: classes15.dex */
public class z extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 implements lr.m0 {

    /* renamed from: d, reason: collision with root package name */
    public final ir.h f402150d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f402151e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f402152f;

    /* renamed from: g, reason: collision with root package name */
    public lr.k0 f402153g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f402154h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f402155i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f402156m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f402157n;

    public z(ir.h hVar) {
        this.f402150d = hVar;
        this.f402151e = "MicroMsg.EmojiPanelItemAdapter";
        this.f402152f = new java.util.ArrayList();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: B */
    public lr.s0 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.util.SparseArray sparseArray = ir.c0.f375353a;
        ir.b0 b0Var = (ir.b0) ir.c0.f375353a.get(i17);
        if (b0Var != null) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bmg, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return new to4.c(inflate, ((to4.d) b0Var).f502523a);
        }
        android.view.LayoutInflater from = android.view.LayoutInflater.from(parent.getContext());
        ir.h hVar = this.f402150d;
        switch (i17) {
            case 1:
                android.view.View inflate2 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570267a73, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
                return new lr.b1(inflate2, this.f402153g);
            case 2:
                android.view.View inflate3 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570269a75, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate3);
                return new lr.j1(inflate3, this.f402153g, hVar);
            case 3:
                android.view.View inflate4 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.co8, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate4);
                return new lr.d0(inflate4, this.f402153g);
            case 4:
                android.view.View inflate5 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570264a70, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate5);
                return new lr.e0(inflate5, this.f402153g);
            case 5:
                android.view.View inflate6 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.co9, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate6);
                return new lr.s0(inflate6, this.f402153g);
            case 6:
                android.view.View inflate7 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a6z, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate7);
                return new lr.d(inflate7, this.f402153g);
            case 7:
                android.view.View inflate8 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a6x, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate8);
                return new lr.b(inflate8, this.f402153g);
            case 8:
                android.view.View inflate9 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570266a72, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate9);
                return new lr.g(inflate9, this.f402153g);
            case 9:
                android.view.View inflate10 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570268a74, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate10);
                return new lr.j0(inflate10, this.f402153g);
            case 10:
                return new ir.y(parent, this.f402153g, hVar);
            default:
                android.view.View inflate11 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a6y, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate11);
                return new lr.c0(inflate11, this.f402153g);
        }
    }

    public void E(java.util.List items) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        java.util.ArrayList<ir.u0> arrayList = this.f402152f;
        arrayList.clear();
        arrayList.addAll(items);
        if (this.f402155i) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            for (ir.u0 u0Var : arrayList) {
                if (u0Var instanceof ir.a1) {
                    ir.a1 a1Var = (ir.a1) u0Var;
                    if (a1Var.f375348c) {
                        sb6.append(a1Var.f375347b.f356196a + ", ");
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402151e, "smiley_log recent smiley " + ((java.lang.Object) sb6));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f402152f.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        ir.u0 y17 = y(i17);
        if (y17 != null) {
            return y17.f375440a;
        }
        return 0;
    }

    public final void x(int i17, ir.u0 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f402152f.add(i17, item);
    }

    public ir.u0 y(int i17) {
        return (ir.u0) kz5.n0.a0(this.f402152f, i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo864xe5e2e48d(lr.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.util.ArrayList arrayList = this.f402152f;
        java.lang.Object obj = arrayList.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        ir.u0 u0Var = (ir.u0) obj;
        if (this.f402154h && (u0Var instanceof ir.g)) {
            java.lang.String str = this.f402151e;
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = ((ir.g) u0Var).f375369b;
            if (interfaceC4987x84e327cb != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("9bd1281af3a31710a45b84d736363691", interfaceC4987x84e327cb.mo42933xb5885648())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "position hasJSB " + i17);
                this.f402157n = true;
            }
            if (interfaceC4987x84e327cb != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("08f223fa83f1ca34e143d1e580252c7c", interfaceC4987x84e327cb.mo42933xb5885648())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "position hasDice " + i17);
                this.f402156m = true;
            }
            if (i17 > 0 && i17 == arrayList.size() - 1 && (!this.f402156m || !this.f402157n)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "no find game from board " + this.f402156m + ", " + this.f402157n);
            }
        }
        holder.i(u0Var);
    }

    public /* synthetic */ z(ir.h hVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? null : hVar);
    }
}
