package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes7.dex */
public final class k8 extends java.util.LinkedHashMap {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f274347d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(int i17) {
        super(i17);
        this.f274347d = i17;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(java.util.Map.Entry entry) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entry, "entry");
        return super.size() > this.f274347d;
    }
}
