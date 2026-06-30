package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class t0 implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public r45.tt f95376d;

    public final r45.tt a() {
        r45.tt ttVar = this.f95376d;
        if (ttVar != null) {
            return ttVar;
        }
        kotlin.jvm.internal.o.o("vipCardInfo");
        throw null;
    }

    @Override // in5.c
    public long getItemId() {
        return a().f386765d.hashCode();
    }

    @Override // in5.c
    public int h() {
        return 1;
    }
}
