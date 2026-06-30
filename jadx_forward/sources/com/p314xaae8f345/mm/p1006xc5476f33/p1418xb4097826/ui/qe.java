package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class qe implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 f211267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.ViewOnClickListenerC22813xf4f26671 f211268b;

    public qe(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949, com.p314xaae8f345.mm.p2776x373aa5.ViewOnClickListenerC22813xf4f26671 viewOnClickListenerC22813xf4f26671) {
        this.f211267a = activityC15059x3e98c949;
        this.f211268b = viewOnClickListenerC22813xf4f26671;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l lVar = new jz5.l("video_duration_time", java.lang.Integer.valueOf(this.f211267a.D1));
        com.p314xaae8f345.mm.p2776x373aa5.ViewOnClickListenerC22813xf4f26671 viewOnClickListenerC22813xf4f26671 = this.f211268b;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(viewOnClickListenerC22813xf4f26671.curMode);
        java.util.List list = viewOnClickListenerC22813xf4f26671.modeList;
        return kz5.c1.k(lVar, new jz5.l("word_style", java.lang.Integer.valueOf(((java.lang.Number) list.get((list.indexOf(valueOf) + 1) % list.size())).intValue())));
    }
}
