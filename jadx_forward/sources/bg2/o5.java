package bg2;

/* loaded from: classes2.dex */
public final class o5 extends tc2.c implements tc2.h, uc2.h {

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f101895e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f101896f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f101897g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 f101898h;

    /* renamed from: i, reason: collision with root package name */
    public r45.pg6 f101899i;

    /* renamed from: m, reason: collision with root package name */
    public r45.cg6 f101900m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Integer f101901n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    @Override // tc2.c
    public void P6() {
        java.lang.CharSequence charSequence;
        java.lang.CharSequence charSequence2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject3;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject4;
        r45.dm2 m76806xdef68064;
        r45.t94 t94Var;
        r45.kr0 d17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject6;
        r45.kr0 m59293x6b032749;
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj;
        java.lang.Object obj2;
        tc2.g gVar = this.f498674d;
        in5.s0 s0Var = gVar.f498682i;
        android.view.ViewGroup viewGroup = s0Var != null ? (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.f567873sa4) : null;
        this.f101895e = viewGroup;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new bg2.k5(this));
        }
        in5.s0 s0Var2 = gVar.f498682i;
        this.f101896f = s0Var2 != null ? (android.view.ViewGroup) s0Var2.p(com.p314xaae8f345.mm.R.id.iho) : null;
        in5.s0 s0Var3 = gVar.f498682i;
        this.f101897g = s0Var3 != null ? (android.view.ViewGroup) s0Var3.p(com.p314xaae8f345.mm.R.id.hyr) : null;
        in5.s0 s0Var4 = gVar.f498682i;
        this.f101898h = s0Var4 != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) s0Var4.p(com.p314xaae8f345.mm.R.id.t8z) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = gVar.f498681h;
        if (abstractC14490x69736cb5 != null && (feedObject6 = abstractC14490x69736cb5.getFeedObject()) != null && (m59293x6b032749 = feedObject6.m59293x6b032749()) != null && (m75941xfb821914 = m59293x6b032749.m75941xfb821914(12)) != null) {
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.kz3) obj).m75939xb282bd08(0) == 13) {
                        break;
                    }
                }
            }
            r45.kz3 kz3Var = (r45.kz3) obj;
            this.f101899i = kz3Var != null ? (r45.pg6) kz3Var.m75936x14adae67(5) : null;
            java.util.Iterator it6 = m75941xfb821914.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it6.next();
                    if (((r45.kz3) obj2).m75939xb282bd08(0) == 15) {
                        break;
                    }
                }
            }
            r45.kz3 kz3Var2 = (r45.kz3) obj2;
            this.f101900m = kz3Var2 != null ? (r45.cg6) kz3Var2.m75936x14adae67(7) : null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = gVar.f498681h;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m59240x7c94657b = (abstractC14490x69736cb52 == null || (feedObject5 = abstractC14490x69736cb52.getFeedObject()) == null) ? null : feedObject5.m59240x7c94657b();
        boolean z17 = ((m59240x7c94657b == null || (d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.d(m59240x7c94657b)) == null) ? 0 : d17.m75939xb282bd08(0)) > 0;
        r45.cg6 cg6Var = this.f101900m;
        boolean z18 = cg6Var != null && cg6Var.m75933x41a8a7f2(0);
        boolean z19 = this.f101899i != null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb53 = gVar.f498681h;
        boolean z27 = (abstractC14490x69736cb53 == null || (feedObject3 = abstractC14490x69736cb53.getFeedObject()) == null || (feedObject4 = feedObject3.getFeedObject()) == null || (m76806xdef68064 = feedObject4.m76806xdef68064()) == null || (t94Var = (r45.t94) m76806xdef68064.m75936x14adae67(44)) == null || !t94Var.m75933x41a8a7f2(0)) ? false : true;
        if (z17 || !(z18 || z19 || z27)) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = this.f101898h;
            if (c22624x85d69039 != null) {
                c22624x85d69039.setVisibility(8);
            }
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690392 = this.f101898h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb54 = gVar.f498681h;
            java.lang.CharSequence charSequence3 = "";
            if (abstractC14490x69736cb54 == null || (feedObject2 = abstractC14490x69736cb54.getFeedObject()) == null || (charSequence = feedObject2.getDescriptionSpan()) == null) {
                charSequence = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.h2 h2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.h2.f191635a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.sq b17 = h2Var.b(c22624x85d690392 != null ? c22624x85d690392.getContext() : null, gVar.f498681h);
            if ((charSequence.length() == 0) && b17 == null) {
                if (c22624x85d690392 != null) {
                    c22624x85d690392.setVisibility(8);
                }
            } else if (c22624x85d690392 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb55 = gVar.f498681h;
                if (abstractC14490x69736cb55 == null || (feedObject = abstractC14490x69736cb55.getFeedObject()) == null || (charSequence2 = feedObject.getDescriptionSpan()) == null) {
                    charSequence2 = "";
                }
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(charSequence2);
                if (b17 != null) {
                    spannableStringBuilder.insert(0, (java.lang.CharSequence) " ");
                    spannableStringBuilder.setSpan(b17, 0, 1, 17);
                }
                in5.s0 s0Var5 = gVar.f498682i;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.sq a17 = h2Var.a(s0Var5 != null ? s0Var5.f374654e : null, gVar.f498681h);
                if (a17 != null) {
                    int H = r26.n0.H(spannableStringBuilder);
                    while (true) {
                        if (-1 >= H) {
                            break;
                        }
                        if (!(spannableStringBuilder.charAt(H) == '\n')) {
                            charSequence3 = spannableStringBuilder.subSequence(0, H + 1);
                            break;
                        }
                        H--;
                    }
                    spannableStringBuilder = new android.text.SpannableStringBuilder(charSequence3);
                    spannableStringBuilder.append((java.lang.CharSequence) " ");
                    spannableStringBuilder.setSpan(a17, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                c22624x85d690392.b(new android.text.SpannableString(spannableStringBuilder));
                c22624x85d690392.setVisibility(0);
            }
        }
        android.view.ViewGroup viewGroup2 = this.f101896f;
        if (viewGroup2 != null) {
            ym5.a1.h(viewGroup2, new bg2.l5(this));
        }
        android.view.ViewGroup viewGroup3 = this.f101896f;
        if (viewGroup3 != null) {
            viewGroup3.setOnClickListener(new bg2.m5(this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0145  */
    @Override // tc2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Q6() {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.o5.Q6():void");
    }

    @Override // tc2.c
    public void U6() {
        android.view.ViewGroup viewGroup = this.f101895e;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }
}
