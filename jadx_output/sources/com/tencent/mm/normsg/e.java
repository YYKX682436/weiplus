package com.tencent.mm.normsg;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: ca, reason: collision with root package name */
    private long f72197ca;

    /* renamed from: cb, reason: collision with root package name */
    private java.lang.String f72198cb;

    /* renamed from: cc, reason: collision with root package name */
    private long f72199cc;

    /* renamed from: ce, reason: collision with root package name */
    private java.lang.String f72201ce;

    /* renamed from: cf, reason: collision with root package name */
    private long f72202cf;

    /* renamed from: cd, reason: collision with root package name */
    private java.util.ArrayList<com.tencent.mm.normsg.d> f72200cd = new java.util.ArrayList<>();

    /* renamed from: cg, reason: collision with root package name */
    private java.util.ArrayList<com.tencent.mm.normsg.d> f72203cg = new java.util.ArrayList<>();

    public e(long j17, java.lang.String str, long j18, java.util.ArrayList arrayList, java.lang.String str2, long j19, java.util.ArrayList arrayList2) {
        this.f72197ca = 0L;
        this.f72198cb = "";
        this.f72199cc = 0L;
        this.f72201ce = "";
        this.f72202cf = 0L;
        this.f72197ca = j17;
        this.f72198cb = str == null ? "" : str;
        this.f72199cc = j18;
        if (arrayList != null) {
            this.f72200cd.addAll(arrayList);
        }
        this.f72201ce = str2 == null ? "" : str2;
        this.f72202cf = j19;
        if (arrayList2 != null) {
            this.f72203cg.addAll(arrayList2);
        }
    }
}
