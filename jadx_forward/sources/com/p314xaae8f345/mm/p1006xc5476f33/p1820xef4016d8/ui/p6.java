package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class p6 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16370x5a91dd69 f228840d;

    public p6(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16370x5a91dd69 activityC16370x5a91dd69) {
        this.f228840d = activityC16370x5a91dd69;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        if (i17 >= 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16370x5a91dd69 activityC16370x5a91dd69 = this.f228840d;
            if (i17 <= activityC16370x5a91dd69.f227699v.getCount()) {
                db5.e1.e(activityC16370x5a91dd69, activityC16370x5a91dd69.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.glj), null, activityC16370x5a91dd69.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0), new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.o6(this, i17 - 1));
            }
        }
        return true;
    }
}
