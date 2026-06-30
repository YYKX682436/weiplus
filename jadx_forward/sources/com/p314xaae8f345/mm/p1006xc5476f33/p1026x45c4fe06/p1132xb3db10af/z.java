package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af;

/* loaded from: classes7.dex */
public final class z implements kg1.f {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.regex.Pattern f165739b = java.util.regex.Pattern.compile(java.lang.String.format("%s(.*)%s", "<kLog>", "</kLog>"));

    /* renamed from: a, reason: collision with root package name */
    public kg1.f f165740a = null;

    @Override // kg1.f
    public java.util.List a(java.lang.String str, long j17) {
        kg1.f fVar = this.f165740a;
        return fVar == null ? new java.util.ArrayList() : fVar.a(str, j17);
    }

    @Override // kg1.f
    public void b(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        kg1.f fVar = this.f165740a;
        if (fVar == null) {
            return;
        }
        fVar.b(str, java.lang.String.format("%s%s%s", "<kLog>", str2, "</kLog>"), objArr);
    }
}
