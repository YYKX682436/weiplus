package in2;

/* loaded from: classes10.dex */
public final class f0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f374355d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f374356e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f374357f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f374358g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f374359h;

    /* renamed from: i, reason: collision with root package name */
    public final int f374360i;

    /* renamed from: m, reason: collision with root package name */
    public final int f374361m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f374362n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.q f374363o;

    /* renamed from: p, reason: collision with root package name */
    public yz5.l f374364p;

    /* renamed from: q, reason: collision with root package name */
    public int f374365q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f374366r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f374367s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f374368t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f374369u;

    /* renamed from: v, reason: collision with root package name */
    public yz5.a f374370v;

    public f0(android.content.Context context, gk2.e liveData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        this.f374355d = "FinderLiveAnchorSingSongAddAdapter";
        this.f374356e = "save_str";
        this.f374357f = "PAY_LOAD_EMOJI_TIPS_SHOW";
        this.f374358g = "PAY_LOAD_EMOJI_TIPS_HIDE";
        this.f374359h = new java.util.ArrayList();
        this.f374360i = 100;
        this.f374361m = 30;
        this.f374365q = -1;
        this.f374366r = true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        int size = this.f374359h.size();
        zl2.r4.f555483a.M2(this.f374355d, "getItemCount " + size);
        return size;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570380an1, parent, false);
        android.widget.EditText editText = (android.widget.EditText) inflate.findViewById(com.p314xaae8f345.mm.R.id.jzh);
        if (editText != null) {
            editText.setHint(com.p314xaae8f345.mm.R.C30867xcad56011.p1k);
        }
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.v5o);
        if (textView != null) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.p1l);
        }
        return new in2.t(this, inflate);
    }

    public final boolean x(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int i17 = this.f374365q;
        if (i17 != -1) {
            java.util.ArrayList arrayList = this.f374359h;
            if (i17 <= arrayList.size() - 1) {
                int i18 = 0;
                for (java.lang.Object obj : arrayList) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    dk2.yg ygVar = (dk2.yg) obj;
                    int i27 = this.f374365q;
                    if (i27 != i18 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ygVar.f315926a, ((dk2.yg) arrayList.get(i27)).f315926a)) {
                        if (ygVar.f315926a.length() > 0) {
                            db5.t7.g(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p1u));
                            int i28 = this.f374365q;
                            m8148xed6e4d18(i28, java.lang.Integer.valueOf(i28));
                            return false;
                        }
                    }
                    i18 = i19;
                }
                return true;
            }
        }
        this.f374365q = -1;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x027e, code lost:
    
        if (((dk2.yg) r3.get(r28 + 1)).f315928c == 1) goto L21;
     */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo864xe5e2e48d(in2.t r27, int r28) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: in2.f0.mo864xe5e2e48d(in2.t, int):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List payloads) {
        in2.t holder = (in2.t) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        if (payloads.isEmpty()) {
            mo864xe5e2e48d(holder, i17);
            return;
        }
        for (java.lang.Object obj : payloads) {
            boolean z17 = obj instanceof java.lang.Integer;
            android.widget.EditText editText = holder.f374435h;
            if (z17 && z17 && i17 == ((java.lang.Number) obj).intValue()) {
                this.f374368t = true;
                this.f374367s = true;
                editText.postDelayed(new in2.c0(holder), 300L);
            }
            boolean z18 = obj instanceof java.lang.Boolean;
            java.util.ArrayList arrayList = this.f374359h;
            if (z18 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, java.lang.Boolean.TRUE)) {
                if (editText.hasFocus()) {
                    dk2.yg ygVar = (dk2.yg) arrayList.get(i17);
                    java.lang.String obj2 = r26.n0.u0(editText.getEditableText().toString()).toString();
                    ygVar.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj2, "<set-?>");
                    ygVar.f315926a = obj2;
                    editText.clearFocus();
                }
                yz5.a aVar = this.f374370v;
                if (aVar != null) {
                    aVar.mo152xb9724478();
                }
                this.f374370v = null;
            }
            boolean z19 = obj instanceof java.lang.String;
            if (z19 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, this.f374356e)) {
                if (this.f374365q == i17) {
                    dk2.yg ygVar2 = (dk2.yg) arrayList.get(i17);
                    java.lang.String obj3 = r26.n0.u0(editText.getEditableText().toString()).toString();
                    ygVar2.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj3, "<set-?>");
                    ygVar2.f315926a = obj3;
                }
                mo864xe5e2e48d(holder, i17);
            }
            android.widget.TextView textView = holder.f374437m;
            if (z19 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, this.f374358g)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView, "<get-auditStatus>(...)");
                java.lang.Object obj4 = arrayList.get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj4, "get(...)");
                in2.b1.a(textView, (dk2.yg) obj4);
            }
            if (z19 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, this.f374357f)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(textView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongAddAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongAddAdapter$SingSongAddViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongAddAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongAddAdapter$SingSongAddViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setText(textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.li6));
                textView.setTextColor(textView.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
            }
        }
    }
}
