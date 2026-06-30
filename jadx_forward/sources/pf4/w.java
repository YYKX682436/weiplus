package pf4;

/* loaded from: classes4.dex */
public final class w extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f435434d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f435435e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f435436f;

    /* renamed from: g, reason: collision with root package name */
    public nf4.j f435437g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f435438h;

    public w(java.util.ArrayList commentDatas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentDatas, "commentDatas");
        this.f435434d = commentDatas;
        this.f435435e = "MicroMsg.StoryCommentListAdapter";
        this.f435436f = new java.util.HashMap();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f435434d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.lang.String valueOf;
        pf4.s holder = (pf4.s) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f435434d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        gf4.a aVar = (gf4.a) obj;
        holder.f3639x46306858.setOnClickListener(new pf4.t(this, aVar));
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(aVar.f352863a, true);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.widget.TextView textView = holder.f435425f;
        android.content.Context context = textView.getContext();
        java.lang.String g27 = n17 != null ? n17.g2() : null;
        if (g27 == null) {
            g27 = "";
        }
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        android.text.SpannableString j17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, g27, textSize);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(aVar.f352872j, true);
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context2 = textView.getContext();
        java.lang.String g28 = n18 != null ? n18.g2() : null;
        java.lang.String str = g28 != null ? g28 : "";
        float textSize2 = textView.getTextSize();
        ((ke0.e) xVar2).getClass();
        android.text.SpannableString j18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context2, str, textSize2);
        if (aVar.f352874l != 0) {
            valueOf = ((java.lang.Object) j17) + ' ' + textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572074y0) + ' ' + ((java.lang.Object) j18);
        } else {
            valueOf = java.lang.String.valueOf(j17);
        }
        textView.setText(valueOf);
        le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
        android.widget.TextView textView2 = holder.f435426g;
        android.content.Context context3 = textView2.getContext();
        float textSize3 = textView2.getTextSize();
        ((ke0.e) xVar3).getClass();
        textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context3, aVar.f352864b, textSize3));
        com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w wVar = (com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class));
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18473x88f71108 c18473x88f71108 = holder.f435424e;
        java.lang.String userName = aVar.f352863a;
        wVar.Ni(c18473x88f71108, userName);
        if (aVar.f352868f) {
            c18473x88f71108.setBackground(c18473x88f71108.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.b4e));
            int i18 = holder.f435423d;
            c18473x88f71108.setPadding(i18, i18, i18, i18);
        } else {
            c18473x88f71108.setBackground(null);
            c18473x88f71108.setPadding(0, 0, 0, 0);
        }
        java.util.HashMap hashMap = holder.f435427h.f435436f;
        ef4.v vVar = ef4.w.f334001t;
        hashMap.put(userName, java.lang.Boolean.valueOf(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(vVar.e(), userName) && vVar.g().P0(userName).t0()));
        c18473x88f71108.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        if (!android.text.TextUtils.equals(c18473x88f71108.f253413d, userName)) {
            c18473x88f71108.f253413d = userName;
        }
        c18473x88f71108.setOnClickListener(new pf4.r(aVar, holder));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.cwx, null);
        inflate.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        return new pf4.s(this, inflate, 0, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0062 A[EDGE_INSN: B:11:0x0062->B:12:0x0062 BREAK  A[LOOP:0: B:2:0x0010->B:18:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[LOOP:0: B:2:0x0010->B:18:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(java.util.List r8) {
        /*
            r7 = this;
            java.lang.String r0 = "newComments"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            java.util.HashMap r0 = r7.f435436f
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L61
            java.lang.Object r1 = r0.next()
            java.lang.String r3 = "next(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r3)
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            ef4.v r3 = ef4.w.f334001t
            java.lang.String r4 = r3.e()
            java.lang.Object r5 = r1.getKey()
            java.lang.String r5 = (java.lang.String) r5
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(r4, r5)
            r5 = 1
            if (r4 != 0) goto L51
            nf4.g r3 = r3.g()
            java.lang.Object r4 = r1.getKey()
            java.lang.String r6 = "<get-key>(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r6)
            java.lang.String r4 = (java.lang.String) r4
            nf4.f r3 = r3.P0(r4)
            boolean r3 = r3.t0()
            if (r3 == 0) goto L51
            r3 = r5
            goto L52
        L51:
            r3 = r2
        L52:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.Object r1 = r1.getValue()
            boolean r1 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r3, r1)
            if (r1 != 0) goto L10
            goto L62
        L61:
            r5 = r2
        L62:
            if (r5 == 0) goto L70
            java.util.ArrayList r0 = r7.f435434d
            r0.clear()
            r0.addAll(r8)
            r7.m8146xced61ae5()
            goto L81
        L70:
            pf4.v r0 = new pf4.v
            r0.<init>(r7, r8)
            androidx.recyclerview.widget.c0 r0 = p012xc85e97e9.p103xe821e364.p104xd1075a44.h0.a(r0, r2)
            pf4.u r1 = new pf4.u
            r1.<init>(r7, r8)
            r0.a(r1)
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf4.w.x(java.util.List):void");
    }
}
