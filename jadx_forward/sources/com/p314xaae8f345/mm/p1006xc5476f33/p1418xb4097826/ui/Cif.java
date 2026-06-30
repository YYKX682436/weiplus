package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* renamed from: com.tencent.mm.plugin.finder.ui.if, reason: invalid class name */
/* loaded from: classes10.dex */
public final class Cif implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 f210898d;

    public Cif(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949) {
        this.f210898d = activityC15059x3e98c949;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949 = this.f210898d;
        activityC15059x3e98c949.N1 = true;
        activityC15059x3e98c949.getIntent().putExtra("cover_time_ms", activityC15059x3e98c949.getIntent().getLongExtra("key_other_cover_time_ms", 0L));
        activityC15059x3e98c949.getIntent().putExtra("key_full_cover_path", activityC15059x3e98c949.getIntent().getStringExtra("key_other_full_cover_path"));
        int intExtra = activityC15059x3e98c949.getIntent().getIntExtra("key_other_cover_select_source", 0);
        activityC15059x3e98c949.getIntent().putExtra("key_cover_select_source", intExtra);
        activityC15059x3e98c949.getIntent().removeExtra("cover_crop_model");
        activityC15059x3e98c949.getIntent().removeExtra("cover_word_info_wrap");
        activityC15059x3e98c949.L1 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.td.f211407f;
        activityC15059x3e98c949.v7(intExtra, true);
    }
}
