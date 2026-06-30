package com.tencent.mm.model.gdpr;

/* loaded from: classes.dex */
public enum a {
    /* JADX INFO: Fake field, exist only in values array */
    MINI_PROGRAM("miniProgram", 1),
    BIZ("officialAccount", 0),
    OPENSDK("OPENSDK", 2);


    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f70370d;

    /* renamed from: e, reason: collision with root package name */
    public final int f70371e;

    a(java.lang.String str, int i17) {
        this.f70370d = str;
        this.f70371e = i17;
    }

    public static com.tencent.mm.model.gdpr.a a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        for (com.tencent.mm.model.gdpr.a aVar : values()) {
            if (str.equals(aVar.f70370d)) {
                return aVar;
            }
        }
        return null;
    }
}
