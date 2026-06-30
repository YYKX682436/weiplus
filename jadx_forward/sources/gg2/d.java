package gg2;

/* loaded from: classes2.dex */
public final class d extends gg2.b {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f353199b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f353199b = "LiveExpNineteenItem";
    }

    @Override // gg2.b
    public java.lang.Object a(android.view.View view, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.CharSequence charSequence;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        java.lang.CharSequence descriptionSpan;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject2;
        view.setOnClickListener(new gg2.c(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) view.findViewById(com.p314xaae8f345.mm.R.id.f565783t90);
        if (c22624x85d69039 == null) {
            return java.lang.Boolean.FALSE;
        }
        boolean z17 = true;
        c22624x85d69039.m84175x8dd5167d(1);
        tc2.g gVar = this.f353197a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = gVar.f498681h;
        java.lang.CharSequence charSequence2 = "";
        if (abstractC14490x69736cb5 == null || (feedObject2 = abstractC14490x69736cb5.getFeedObject()) == null || (charSequence = feedObject2.getDescriptionSpan()) == null) {
            charSequence = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.sq b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.h2.f191635a.b(c22624x85d69039.getContext(), gVar.f498681h);
        if ((charSequence.length() == 0) && b17 == null) {
            c22624x85d69039.setVisibility(8);
            z17 = false;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = gVar.f498681h;
            if (abstractC14490x69736cb52 != null && (feedObject = abstractC14490x69736cb52.getFeedObject()) != null && (descriptionSpan = feedObject.getDescriptionSpan()) != null) {
                charSequence2 = descriptionSpan;
            }
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(charSequence2);
            if (b17 != null) {
                spannableStringBuilder.insert(0, (java.lang.CharSequence) " ");
                spannableStringBuilder.setSpan(b17, 0, 1, 17);
            }
            c22624x85d69039.b(new android.text.SpannableString(spannableStringBuilder));
            c22624x85d69039.setVisibility(0);
        }
        return java.lang.Boolean.valueOf(z17);
    }

    @Override // gg2.b
    public int c() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e_b;
    }

    @Override // gg2.b
    public int e() {
        return 1;
    }

    @Override // gg2.b
    public java.lang.String f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        android.text.SpannableString descriptionSpan;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f353197a.f498681h;
        java.lang.String spannableString = (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (descriptionSpan = feedObject.getDescriptionSpan()) == null) ? null : descriptionSpan.toString();
        return spannableString == null ? "" : spannableString;
    }

    @Override // gg2.b
    public int g() {
        return 19;
    }

    @Override // gg2.b
    public java.lang.String i() {
        return this.f353199b;
    }
}
