package com.tencent.mm.hardcoder;

/* loaded from: classes13.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f68270a;

    /* renamed from: b, reason: collision with root package name */
    public final long f68271b;

    /* renamed from: c, reason: collision with root package name */
    public final int f68272c;

    /* renamed from: d, reason: collision with root package name */
    public final int f68273d;

    /* renamed from: e, reason: collision with root package name */
    public final int f68274e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f68275f;

    public k(int i17, long j17, int i18, int i19, int i27, int[] iArr) {
        this.f68270a = i17;
        this.f68271b = j17;
        this.f68272c = i18;
        this.f68273d = i19;
        this.f68274e = i27;
        this.f68275f = (int[]) iArr.clone();
    }

    public java.lang.String toString() {
        return "[RequestStatus, scene:" + this.f68270a + ", action:" + this.f68271b + ", cpulevel:" + this.f68272c + ", gpulevel:" + this.f68273d + ", iolevel:" + this.f68274e + ", bindtids size:" + this.f68275f.length + "]";
    }
}
