package bg2;

/* loaded from: classes2.dex */
public final class o5 extends tc2.c implements tc2.h, uc2.h {

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f20362e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f20363f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f20364g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMNeat7extView f20365h;

    /* renamed from: i, reason: collision with root package name */
    public r45.pg6 f20366i;

    /* renamed from: m, reason: collision with root package name */
    public r45.cg6 f20367m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Integer f20368n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    @Override // tc2.c
    public void P6() {
        java.lang.CharSequence charSequence;
        java.lang.CharSequence charSequence2;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject3;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject4;
        r45.dm2 object_extend;
        r45.t94 t94Var;
        r45.kr0 d17;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject5;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject6;
        r45.kr0 styleInfo;
        java.util.LinkedList list;
        java.lang.Object obj;
        java.lang.Object obj2;
        tc2.g gVar = this.f417141d;
        in5.s0 s0Var = gVar.f417149i;
        android.view.ViewGroup viewGroup = s0Var != null ? (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.f486340sa4) : null;
        this.f20362e = viewGroup;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new bg2.k5(this));
        }
        in5.s0 s0Var2 = gVar.f417149i;
        this.f20363f = s0Var2 != null ? (android.view.ViewGroup) s0Var2.p(com.tencent.mm.R.id.iho) : null;
        in5.s0 s0Var3 = gVar.f417149i;
        this.f20364g = s0Var3 != null ? (android.view.ViewGroup) s0Var3.p(com.tencent.mm.R.id.hyr) : null;
        in5.s0 s0Var4 = gVar.f417149i;
        this.f20365h = s0Var4 != null ? (com.tencent.mm.ui.widget.MMNeat7extView) s0Var4.p(com.tencent.mm.R.id.t8z) : null;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = gVar.f417148h;
        if (baseFinderFeed != null && (feedObject6 = baseFinderFeed.getFeedObject()) != null && (styleInfo = feedObject6.getStyleInfo()) != null && (list = styleInfo.getList(12)) != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.kz3) obj).getInteger(0) == 13) {
                        break;
                    }
                }
            }
            r45.kz3 kz3Var = (r45.kz3) obj;
            this.f20366i = kz3Var != null ? (r45.pg6) kz3Var.getCustom(5) : null;
            java.util.Iterator it6 = list.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it6.next();
                    if (((r45.kz3) obj2).getInteger(0) == 15) {
                        break;
                    }
                }
            }
            r45.kz3 kz3Var2 = (r45.kz3) obj2;
            this.f20367m = kz3Var2 != null ? (r45.cg6) kz3Var2.getCustom(7) : null;
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = gVar.f417148h;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (baseFinderFeed2 == null || (feedObject5 = baseFinderFeed2.getFeedObject()) == null) ? null : feedObject5.getFinderObject();
        boolean z17 = ((finderObject == null || (d17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.d(finderObject)) == null) ? 0 : d17.getInteger(0)) > 0;
        r45.cg6 cg6Var = this.f20367m;
        boolean z18 = cg6Var != null && cg6Var.getBoolean(0);
        boolean z19 = this.f20366i != null;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = gVar.f417148h;
        boolean z27 = (baseFinderFeed3 == null || (feedObject3 = baseFinderFeed3.getFeedObject()) == null || (feedObject4 = feedObject3.getFeedObject()) == null || (object_extend = feedObject4.getObject_extend()) == null || (t94Var = (r45.t94) object_extend.getCustom(44)) == null || !t94Var.getBoolean(0)) ? false : true;
        if (z17 || !(z18 || z19 || z27)) {
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = this.f20365h;
            if (mMNeat7extView != null) {
                mMNeat7extView.setVisibility(8);
            }
        } else {
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView2 = this.f20365h;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed4 = gVar.f417148h;
            java.lang.CharSequence charSequence3 = "";
            if (baseFinderFeed4 == null || (feedObject2 = baseFinderFeed4.getFeedObject()) == null || (charSequence = feedObject2.getDescriptionSpan()) == null) {
                charSequence = "";
            }
            com.tencent.mm.plugin.finder.feed.ui.h2 h2Var = com.tencent.mm.plugin.finder.feed.ui.h2.f110102a;
            com.tencent.mm.plugin.finder.feed.ui.sq b17 = h2Var.b(mMNeat7extView2 != null ? mMNeat7extView2.getContext() : null, gVar.f417148h);
            if ((charSequence.length() == 0) && b17 == null) {
                if (mMNeat7extView2 != null) {
                    mMNeat7extView2.setVisibility(8);
                }
            } else if (mMNeat7extView2 != null) {
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed5 = gVar.f417148h;
                if (baseFinderFeed5 == null || (feedObject = baseFinderFeed5.getFeedObject()) == null || (charSequence2 = feedObject.getDescriptionSpan()) == null) {
                    charSequence2 = "";
                }
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(charSequence2);
                if (b17 != null) {
                    spannableStringBuilder.insert(0, (java.lang.CharSequence) " ");
                    spannableStringBuilder.setSpan(b17, 0, 1, 17);
                }
                in5.s0 s0Var5 = gVar.f417149i;
                com.tencent.mm.plugin.finder.feed.ui.sq a17 = h2Var.a(s0Var5 != null ? s0Var5.f293121e : null, gVar.f417148h);
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
                mMNeat7extView2.b(new android.text.SpannableString(spannableStringBuilder));
                mMNeat7extView2.setVisibility(0);
            }
        }
        android.view.ViewGroup viewGroup2 = this.f20363f;
        if (viewGroup2 != null) {
            ym5.a1.h(viewGroup2, new bg2.l5(this));
        }
        android.view.ViewGroup viewGroup3 = this.f20363f;
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
        android.view.ViewGroup viewGroup = this.f20362e;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }
}
