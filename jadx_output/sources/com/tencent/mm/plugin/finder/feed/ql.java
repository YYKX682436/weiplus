package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ql extends androidx.recyclerview.widget.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f108834n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql(int i17, com.tencent.mm.ui.MMActivity mMActivity) {
        super(mMActivity);
        this.f108834n = i17;
    }

    @Override // androidx.recyclerview.widget.o1
    public int k(int i17) {
        int i18 = this.f108834n;
        return i18 > 0 ? i18 : super.k(i17);
    }

    @Override // androidx.recyclerview.widget.o1
    public int l(int i17) {
        int i18 = this.f108834n;
        return i18 > 0 ? i18 : super.l(i17);
    }

    @Override // androidx.recyclerview.widget.o1
    public int n() {
        return -1;
    }
}
