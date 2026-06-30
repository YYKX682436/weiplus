package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752;

/* loaded from: classes2.dex */
public final class v extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.m {

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f192947c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f192948d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.a data) {
        super(data);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.m, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d
    public boolean d() {
        return !k();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.m, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d
    public int g() {
        return 10006;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.m, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d
    public void h(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, int i17, int i18, android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.c curActivity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curActivity, "curActivity");
        byte[] byteArrayExtra = intent != null ? intent.getByteArrayExtra("SELECT_OBJECT") : null;
        if (byteArrayExtra != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
            c19792x256d2725.mo11468x92b714fd(byteArrayExtra);
            this.f192948d = c19792x256d2725;
        }
        int ordinal = curActivity.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return;
            }
            l(i17, i18, activity, true);
        } else if (!l(i17, i18, activity, false) && i17 == 20000 && i18 == -1) {
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.m, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d
    public void i(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, java.util.List dataList, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        this.f192947c = feed;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("SELECT_OBJECT", feed.getFeedObject().getFeedObject().mo14344x5f01b1f6());
        intent.setClassName(activity, "com.tencent.mm.plugin.masssend.ui.MassSendSelectPreviewFinderActivity");
        activity.startActivityForResult(intent, 10006);
    }

    public final boolean l(int i17, int i18, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f192947c;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f192948d;
        if (c19792x256d2725 == null) {
            c19792x256d2725 = abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.getFeedObject().getFeedObject() : null;
        }
        if (i17 != 10006 || i18 != -1 || c19792x256d2725 == null) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("SELECT_OBJECT", c19792x256d2725.mo14344x5f01b1f6());
        abstractActivityC21394xb3d2c0cf.setResult(-1, intent);
        abstractActivityC21394xb3d2c0cf.finish();
        return true;
    }
}
