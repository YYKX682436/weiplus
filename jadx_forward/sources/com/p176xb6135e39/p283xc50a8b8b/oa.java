package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes13.dex */
public class oa {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f126902b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f126903a;

    static {
        java.util.logging.Logger.getLogger(com.p176xb6135e39.p283xc50a8b8b.oa.class.getName());
    }

    public oa(java.util.Map map) {
        this.f126903a = map;
    }

    public final com.p176xb6135e39.p283xc50a8b8b.r3 a(java.lang.String str) {
        java.lang.String[] split = str.split("/");
        if (split.length == 1) {
            throw new com.p176xb6135e39.p283xc50a8b8b.y6(str.length() != 0 ? "Invalid type url found: ".concat(str) : new java.lang.String("Invalid type url found: "));
        }
        return (com.p176xb6135e39.p283xc50a8b8b.r3) this.f126903a.get(split[split.length - 1]);
    }
}
