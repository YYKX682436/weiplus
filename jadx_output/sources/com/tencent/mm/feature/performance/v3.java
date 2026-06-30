package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public final class v3 implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return mz5.a.b(java.lang.Long.valueOf(((com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerTracker) ((java.util.Map.Entry) obj).getValue()).trackMs), java.lang.Long.valueOf(((com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerTracker) ((java.util.Map.Entry) obj2).getValue()).trackMs));
    }
}
