package tt2;

/* loaded from: classes3.dex */
public final class a extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f503355d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f503356e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f503357f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f503358g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f503359h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f503360i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.nd f503361m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f503362n;

    public a(android.content.Context context, boolean z17, gk2.e liveData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        this.f503355d = context;
        this.f503356e = liveData;
        this.f503357f = new java.util.ArrayList();
        this.f503358g = new java.util.ArrayList();
        this.f503359h = kz5.p0.f395529d;
        this.f503360i = new java.util.LinkedList();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f503360i.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((so2.j5) ((java.util.ArrayList) x()).get(i17)) instanceof cm2.k0 ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r11, int r12) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tt2.a.mo864xe5e2e48d(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.content.Context context = this.f503355d;
        if (i17 == 0) {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dnw, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            return new ut2.n0(inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.azb, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
        ut2.o0 o0Var = new ut2.o0(inflate2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.nd ndVar = this.f503361m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15317x5870b165 c15317x5870b165 = o0Var.f512553e;
        c15317x5870b165.m62187x6c4ebec7(ndVar);
        c15317x5870b165.m62188xdc43bfa3(this.f503362n);
        return o0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.List x() {
        java.lang.String string;
        java.lang.String str;
        r45.c56 c56Var;
        r45.c56 c56Var2;
        java.lang.String string2;
        r45.zv2 zv2Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = this.f503357f;
        int i17 = !list.isEmpty() ? 1 : 0;
        if (!this.f503358g.isEmpty()) {
            i17++;
        }
        if (!this.f503359h.isEmpty()) {
            i17++;
        }
        java.lang.Object[] objArr = i17 > 1;
        boolean z17 = !this.f503359h.isEmpty();
        android.content.Context context = this.f503355d;
        gk2.e eVar = this.f503356e;
        if (z17) {
            if (objArr != false) {
                r45.dv1 dv1Var = ((mm2.f6) eVar.a(mm2.f6.class)).P;
                if (dv1Var == null || (zv2Var = (r45.zv2) dv1Var.m75936x14adae67(34)) == null || (string2 = zv2Var.m75945x2fec8307(1)) == null) {
                    string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nvk);
                }
                java.lang.String str2 = string2;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                arrayList.add(new cm2.j0(str2, null, null, 6, null));
            }
            arrayList.addAll(this.f503359h);
        }
        if (!this.f503358g.isEmpty()) {
            if (objArr != false) {
                java.lang.String str3 = ((mm2.f6) eVar.a(mm2.f6.class)).f410578s;
                java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573108m85);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                arrayList.add(new cm2.j0(string3, str3, null, 4, null));
            }
            arrayList.addAll(this.f503358g);
        }
        r45.dv1 dv1Var2 = ((mm2.f6) eVar.a(mm2.f6.class)).P;
        if (dv1Var2 == null || (c56Var2 = (r45.c56) dv1Var2.m75936x14adae67(33)) == null || (string = c56Var2.m75945x2fec8307(1)) == null) {
            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m9f);
        }
        java.lang.String str4 = string;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
        r45.dv1 dv1Var3 = ((mm2.f6) eVar.a(mm2.f6.class)).P;
        if (dv1Var3 == null || (c56Var = (r45.c56) dv1Var3.m75936x14adae67(33)) == null || (str = c56Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        java.lang.String str5 = str;
        if (objArr != false) {
            arrayList.add(new cm2.j0(str4, null, str5, 2, null));
        }
        arrayList.addAll(list);
        return arrayList;
    }
}
