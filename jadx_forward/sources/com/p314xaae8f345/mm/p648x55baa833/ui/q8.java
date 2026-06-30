package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public class q8 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f145989d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.a3 f145990e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p648x55baa833.ui.r8 f145991f;

    public q8(java.util.ArrayList memberList, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var, com.p314xaae8f345.mm.p648x55baa833.ui.r8 r8Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(memberList, "memberList");
        this.f145989d = memberList;
        this.f145990e = a3Var;
        this.f145991f = r8Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f145989d.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.CharSequence] */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.lang.String z07;
        android.text.SpannableString j17;
        com.p314xaae8f345.mm.p648x55baa833.ui.u8 viewHolder = (com.p314xaae8f345.mm.p648x55baa833.ui.u8) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        java.lang.Object obj = this.f145989d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) obj;
        android.widget.TextView textView = viewHolder.f146110h;
        textView.setVisibility(0);
        java.lang.String d17 = z3Var.d1();
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = Bi.n(d17 == null ? "" : d17, true);
        if (n17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RoomFollowMemberAdapter", "ct == null");
            j17 = null;
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.w0())) {
                com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = viewHolder.f146107e;
                z07 = a3Var != null ? a3Var.z0(d17) : null;
            } else {
                z07 = n17.w0();
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07)) {
                z07 = n17.w0();
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07)) {
                z07 = n17.f2();
            }
            ((za0.k) ((ab0.z) i95.n0.c(ab0.z.class))).getClass();
            ?? a17 = t41.c.a(n17, z07);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = a17 != 0 ? a17 : "";
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            j17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(viewHolder.f146106d, str, textSize);
        }
        textView.setText(j17);
        kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
        java.lang.String d18 = z3Var.d1();
        android.widget.ImageView imageView = viewHolder.f146109g;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) zVar).Ai(imageView, d18, null);
        android.widget.TextView textView2 = viewHolder.f146111i;
        if (textView2 != null) {
            com.p314xaae8f345.mm.ui.bk.s0(textView2.getPaint());
            textView2.setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.s8(viewHolder, z3Var));
        }
        if (imageView != null) {
            imageView.setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.t8(viewHolder, z3Var));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: x */
    public com.p314xaae8f345.mm.p648x55baa833.ui.u8 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "viewGroup");
        android.content.Context context = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569939sf, viewGroup, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new com.p314xaae8f345.mm.p648x55baa833.ui.u8(context, this.f145990e, inflate, this.f145991f);
    }
}
