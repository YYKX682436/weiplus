package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes10.dex */
public final class jq extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14125xe2977688 f191738d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14125xe2977688 activityC14125xe2977688) {
        super(0);
        this.f191738d = activityC14125xe2977688;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deleteCacheFile: curUploadingPath=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14125xe2977688 activityC14125xe2977688 = this.f191738d;
        sb6.append(activityC14125xe2977688.f191170o);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSelectLocalFileUI", sb6.toString());
        if ((activityC14125xe2977688.f191170o.length() > 0) && r26.n0.D(activityC14125xe2977688.f191170o, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183676l, false, 2, null)) {
            com.p314xaae8f345.mm.vfs.w6.h(activityC14125xe2977688.f191170o);
        }
        return jz5.f0.f384359a;
    }
}
