package cm2;

/* loaded from: classes3.dex */
public final class e implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final r45.of1 f43336d;

    public e(r45.of1 aliasInfo) {
        kotlin.jvm.internal.o.g(aliasInfo, "aliasInfo");
        this.f43336d = aliasInfo;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f43336d.hashCode();
    }

    @Override // in5.c
    public int h() {
        return 1;
    }
}
