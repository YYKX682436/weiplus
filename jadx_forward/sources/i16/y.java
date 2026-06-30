package i16;

/* loaded from: classes16.dex */
public enum y implements p16.w {
    AT_MOST_ONCE(0, 0),
    EXACTLY_ONCE(1, 1),
    AT_LEAST_ONCE(2, 2);


    /* renamed from: d, reason: collision with root package name */
    public final int f369347d;

    y(int i17, int i18) {
        this.f369347d = i18;
    }

    @Override // p16.w
    /* renamed from: getNumber */
    public final int mo134573x276ffe3f() {
        return this.f369347d;
    }
}
