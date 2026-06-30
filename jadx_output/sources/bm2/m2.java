package bm2;

/* loaded from: classes3.dex */
public final class m2 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f22090d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f22091e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f22092f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f22093g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f22094h;

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f22091e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        bm2.g2 holder = (bm2.g2) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        java.util.ArrayList arrayList = this.f22091e;
        h0Var.f310123d = ((bm2.l2) arrayList.get(i17)).f22063a;
        com.tencent.mm.ui.base.EllipsizeTextView ellipsizeTextView = holder.f21905e;
        ellipsizeTextView.setVisibility(0);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String string = ((r45.ty1) h0Var.f310123d).getString(1);
        ((ke0.e) xVar).getClass();
        ellipsizeTextView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, string));
        mn2.g1 g1Var = mn2.g1.f329975a;
        wo0.c b17 = g1Var.l().b(new mn2.n(((r45.ty1) h0Var.f310123d).getString(4), null, 2, null), g1Var.h(mn2.f1.f329961o));
        bm2.i2 i2Var = new bm2.i2(holder);
        b17.getClass();
        b17.f447873d = i2Var;
        b17.f();
        holder.f21906f.setChecked(((bm2.l2) arrayList.get(i17)).f22064b);
        holder.f21907g.setOnClickListener(new bm2.j2(this, h0Var));
        holder.itemView.setOnClickListener(new bm2.k2(this, i17, holder));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.aua, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new bm2.g2(this, inflate);
    }

    public final java.util.List x() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = this.f22091e;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((bm2.l2) next).f22064b) {
                arrayList3.add(next);
            }
        }
        java.util.Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            java.lang.String string = ((bm2.l2) it6.next()).f22063a.getString(0);
            if (string != null) {
                arrayList.add(string);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0026 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "matchStr"
            kotlin.jvm.internal.o.g(r10, r0)
            java.util.ArrayList r0 = r9.f22091e
            r0.clear()
            int r1 = r10.length()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L14
            r1 = r2
            goto L15
        L14:
            r1 = r3
        L15:
            java.util.ArrayList r4 = r9.f22090d
            if (r1 == 0) goto L1d
            r0.addAll(r4)
            goto L5f
        L1d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r4.iterator()
        L26:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L5c
            java.lang.Object r5 = r4.next()
            r6 = r5
            bm2.l2 r6 = (bm2.l2) r6
            r45.ty1 r6 = r6.f22063a
            java.lang.String r6 = r6.getString(r2)
            if (r6 == 0) goto L55
            java.util.Locale r7 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r7)
            java.lang.String r8 = "toLowerCase(...)"
            kotlin.jvm.internal.o.f(r6, r8)
            java.lang.String r7 = r10.toLowerCase(r7)
            kotlin.jvm.internal.o.f(r7, r8)
            boolean r6 = r26.n0.B(r6, r7, r3)
            if (r6 != r2) goto L55
            r6 = r2
            goto L56
        L55:
            r6 = r3
        L56:
            if (r6 == 0) goto L26
            r1.add(r5)
            goto L26
        L5c:
            r0.addAll(r1)
        L5f:
            yz5.l r10 = r9.f22094h
            if (r10 == 0) goto L72
            int r0 = r0.size()
            if (r0 != 0) goto L6a
            goto L6b
        L6a:
            r2 = r3
        L6b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r10.invoke(r0)
        L72:
            r9.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bm2.m2.y(java.lang.String):void");
    }
}
