package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes.dex */
public final class s8 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.d0 {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.d0
    public int a() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.axg;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.d0
    public void b(android.content.Context context, java.lang.String data, yz5.l onWidgetCreated) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onWidgetCreated, "onWidgetCreated");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.d0
    public android.widget.RelativeLayout.LayoutParams c() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(i65.a.b(context, 72), i65.a.b(context, 89));
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        layoutParams.topMargin = i65.a.b(context, 12);
        layoutParams.rightMargin = i65.a.b(context, 12);
        return layoutParams;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.d0
    public android.view.View d(android.content.Context context, java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570501dj, (android.view.ViewGroup) null);
        try {
            if (new org.json.JSONObject(data).has("image_path")) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
                e(inflate, data);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveProductRecordPlayWidget", "No img path try fetchDataTask");
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.i8(inflate));
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(data), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.h8.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.j8(this, inflate), null);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderLiveProductRecordPlayWidget", th6, "createWidget failed, data:".concat(data), new java.lang.Object[0]);
        }
        inflate.setTag("isAsyncFinderRecordPlayWidget");
        return inflate;
    }

    public final void e(android.view.View view, java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveProductRecordPlayWidget", "updateWidgetVisibilityAndImage data is null");
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k8(view));
            return;
        }
        try {
            java.lang.String optString = new org.json.JSONObject(str).optString("image_path");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveProductRecordPlayWidget", "updateWidgetVisibilityAndImage but no imgData");
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.l8(view));
                return;
            }
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.o8(view, str));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) view.findViewById(com.p314xaae8f345.mm.R.id.uuu);
            if (c22628xfde5d61d != null) {
                pm0.v.w(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.q8(optString, c22628xfde5d61d));
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderLiveProductRecordPlayWidget", th6, "updateWidgetVisibilityAndImage error", new java.lang.Object[0]);
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.r8(view));
        }
    }
}
