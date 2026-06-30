package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class w7 implements java.lang.Comparable {

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w7 f289753f = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w7(0, 0);

    /* renamed from: d, reason: collision with root package name */
    public long f289754d;

    /* renamed from: e, reason: collision with root package name */
    public int f289755e;

    public w7() {
        this.f289754d = 0L;
        this.f289755e = 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w7 w7Var) {
        if (this == w7Var) {
            return 0;
        }
        if (w7Var != null && f289753f != w7Var) {
            int i17 = this.f289755e;
            int i18 = w7Var.f289755e;
            if (i17 == i18 && this.f289754d == w7Var.f289754d) {
                return 0;
            }
            if (i17 != i18) {
                return i17 - i18;
            }
            long j17 = this.f289754d - w7Var.f289754d;
            if (j17 < 0) {
                return -1;
            }
            if (j17 == 0) {
                return 0;
            }
        }
        return 1;
    }

    /* renamed from: hashCode */
    public int m80623x8cdac1b() {
        return (this.f289755e << 31) | ((int) this.f289754d);
    }

    public w7(long j17, int i17) {
        this.f289754d = j17;
        this.f289755e = i17;
    }
}
