package ep2;

/* loaded from: classes2.dex */
public final class e extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f337238e;

    /* renamed from: f, reason: collision with root package name */
    public final int f337239f;

    /* renamed from: g, reason: collision with root package name */
    public final float f337240g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.p f337241h;

    /* renamed from: i, reason: collision with root package name */
    public final float f337242i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f337243m;

    public e(boolean z17, int i17, float f17, yz5.p jumProfileCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumProfileCallback, "jumProfileCallback");
        this.f337238e = z17;
        this.f337239f = i17;
        this.f337240g = f17;
        this.f337241h = jumProfileCallback;
        this.f337242i = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570872c64;
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x00d6, code lost:
    
        if (r6 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00aa, code lost:
    
        if (r6 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00dd, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d8, code lost:
    
        r6 = r6.m76175x6d346f39();
     */
    /* JADX WARN: Removed duplicated region for block: B:153:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r23, in5.c r24, int r25, int r26, boolean r27, java.util.List r28) {
        /*
            Method dump skipped, instructions count: 1374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ep2.e.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    public final void n(in5.s0 s0Var, r45.mb4 mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.e30 e30Var) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016663;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e3;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e3;
        android.widget.ImageView imageView = (android.widget.ImageView) s0Var.p(com.p314xaae8f345.mm.R.id.f568828o70);
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.icp);
        if (imageView == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.Loader", "bindCover return for thumbIv is null.");
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.j8k);
        float f17 = this.f337242i;
        int i17 = (this.f337239f - ((int) f17)) / 2;
        float f18 = this.f337240g;
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i18 = (int) (i17 * 0.6666f * f18);
        layoutParams.height = i18;
        imageView.setLayoutParams(layoutParams);
        p17.getLayoutParams().width = layoutParams.width;
        p17.getLayoutParams().height = layoutParams.height;
        viewGroup.getLayoutParams().height = i18;
        android.view.ViewGroup viewGroup2 = this.f337243m;
        android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup2 != null ? viewGroup2.getLayoutParams() : null;
        if (layoutParams2 != null) {
            layoutParams2.width = i17;
        }
        android.view.ViewGroup viewGroup3 = this.f337243m;
        android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup3 != null ? viewGroup3.getLayoutParams() : null;
        if (layoutParams3 != null) {
            layoutParams3.height = (int) (((r9 - (((int) f17) * 2)) / 2) * f18);
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) s0Var.p(com.p314xaae8f345.mm.R.id.f568129lt1);
        imageView2.getLayoutParams().height = layoutParams.height / 3;
        android.widget.ImageView imageView3 = (android.widget.ImageView) s0Var.p(com.p314xaae8f345.mm.R.id.f568130lt2);
        imageView3.getLayoutParams().height = layoutParams.height / 3;
        android.widget.ImageView imageView4 = (android.widget.ImageView) s0Var.p(com.p314xaae8f345.mm.R.id.f568131lt3);
        imageView4.getLayoutParams().height = layoutParams.height / 3;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) kz5.n0.a0(e30Var.f188155o, 0);
        if (c19792x256d2725 == null || (m76802x2dd016663 = c19792x256d2725.m76802x2dd01666()) == null || (m76962x74cd162e3 = m76802x2dd016663.m76962x74cd162e()) == null || (c19788xd7cfd73e3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e3)) == null) {
            str = null;
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(c19788xd7cfd73e3.m76623xd93f812f());
            java.lang.String m76624x4c9b7dca = c19788xd7cfd73e3.m76624x4c9b7dca();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (m76624x4c9b7dca == null) {
                m76624x4c9b7dca = "";
            }
            sb6.append(m76624x4c9b7dca);
            str = sb6.toString();
        }
        java.util.List list = e30Var.f188155o;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) kz5.n0.a0(list, 1);
        if (c19792x256d27252 == null || (m76802x2dd016662 = c19792x256d27252.m76802x2dd01666()) == null || (m76962x74cd162e2 = m76802x2dd016662.m76962x74cd162e()) == null || (c19788xd7cfd73e2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e2)) == null) {
            str2 = null;
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(c19788xd7cfd73e2.m76623xd93f812f());
            java.lang.String m76624x4c9b7dca2 = c19788xd7cfd73e2.m76624x4c9b7dca();
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (m76624x4c9b7dca2 == null) {
                m76624x4c9b7dca2 = "";
            }
            sb7.append(m76624x4c9b7dca2);
            str2 = sb7.toString();
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) kz5.n0.a0(list, 2);
        if (c19792x256d27253 == null || (m76802x2dd01666 = c19792x256d27253.m76802x2dd01666()) == null || (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) == null || (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) == null) {
            str3 = null;
        } else {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(c19788xd7cfd73e.m76623xd93f812f());
            java.lang.String m76624x4c9b7dca3 = c19788xd7cfd73e.m76624x4c9b7dca();
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (m76624x4c9b7dca3 == null) {
                m76624x4c9b7dca3 = "";
            }
            sb8.append(m76624x4c9b7dca3);
            str3 = sb8.toString();
        }
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d e17 = g1Var.e();
        mn2.n nVar = new mn2.n(str, null, 2, null);
        mn2.f1 f1Var = mn2.f1.f411498s;
        e17.c(nVar, imageView2, g1Var.h(f1Var));
        g1Var.e().c(new mn2.n(str2, null, 2, null), imageView3, g1Var.h(f1Var));
        g1Var.e().c(new mn2.n(str3, null, 2, null), imageView4, g1Var.h(f1Var));
        java.lang.String m75945x2fec8307 = mb4Var.m75945x2fec8307(16);
        boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        java.lang.String m75945x2fec83072 = mb4Var.m75945x2fec8307(20);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        java.lang.String concat = m75945x2fec8307.concat(m75945x2fec83072);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(concat)) {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(mb4Var.m75945x2fec8307(1));
            java.lang.String m75945x2fec83073 = mb4Var.m75945x2fec8307(19);
            sb9.append(m75945x2fec83073 != null ? m75945x2fec83073 : "");
            concat = sb9.toString();
        }
        java.lang.String str4 = concat;
        r45.nw1 m59258xd0557130 = e30Var.getFeedObject().m59258xd0557130();
        if (m59258xd0557130 != null && m59258xd0557130.m75939xb282bd08(2) == 1) {
            g1Var.e().c(new mn2.q3(str4, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), imageView, this.f337238e ? g1Var.h(mn2.f1.f411501v) : g1Var.h(mn2.f1.f411486d));
            return;
        }
        i95.m c17 = i95.n0.c(c61.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.zb.g7((c61.zb) c17, imageView, str4, 0, 4, null);
    }
}
