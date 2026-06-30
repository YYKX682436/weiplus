package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public final class f7 implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final long f99458d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.ab0 f99459e;

    public f7(com.tencent.mm.plugin.exdevice.ui.SportHistoryUI sportHistoryUI, long j17, r45.ab0 record) {
        kotlin.jvm.internal.o.g(record, "record");
        this.f99458d = j17;
        this.f99459e = record;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f99458d;
    }

    @Override // in5.c
    public int h() {
        return 5;
    }
}
