package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class ve extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g {

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f201597h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15312xb2c5e319 f201598i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve(android.content.Context context) {
        super(context, false, null, false, 14, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.diq;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int l() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        android.content.Context context;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 1; i17 < 21; i17++) {
            arrayList.add(java.lang.String.valueOf(i17));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            context = this.f199914d;
            if (!hasNext) {
                break;
            } else {
                arrayList2.add(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ltz, (java.lang.String) it.next()));
            }
        }
        java.lang.String[] strArr = (java.lang.String[]) arrayList2.toArray(new java.lang.String[0]);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) rootView.findViewById(com.p314xaae8f345.mm.R.id.qlk);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15312xb2c5e319 c15312xb2c5e319 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15312xb2c5e319(context);
        this.f201598i = c15312xb2c5e319;
        c15312xb2c5e319.m82070x203ffbdd(strArr);
        viewGroup.removeAllViews();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15312xb2c5e319 c15312xb2c5e3192 = this.f201598i;
        if (c15312xb2c5e3192 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("picker");
            throw null;
        }
        viewGroup.addView(c15312xb2c5e3192.m82065xfb86a31b(), new android.view.ViewGroup.LayoutParams(-1, -1));
        rootView.findViewById(com.p314xaae8f345.mm.R.id.b5i).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.te(this));
        rootView.findViewById(com.p314xaae8f345.mm.R.id.c9z).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ue(this));
    }
}
