package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class a implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public r45.yt f95284d;

    public final r45.yt a() {
        r45.yt ytVar = this.f95284d;
        if (ytVar != null) {
            return ytVar;
        }
        kotlin.jvm.internal.o.o("recentlyUsedCell");
        throw null;
    }

    @Override // in5.c
    public long getItemId() {
        return a().f391341d.hashCode();
    }

    @Override // in5.c
    public int h() {
        return 1;
    }
}
