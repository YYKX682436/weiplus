package com.google.protobuf;

/* loaded from: classes13.dex */
public class oa {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f45369b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f45370a;

    static {
        java.util.logging.Logger.getLogger(com.google.protobuf.oa.class.getName());
    }

    public oa(java.util.Map map) {
        this.f45370a = map;
    }

    public final com.google.protobuf.r3 a(java.lang.String str) {
        java.lang.String[] split = str.split("/");
        if (split.length == 1) {
            throw new com.google.protobuf.y6(str.length() != 0 ? "Invalid type url found: ".concat(str) : new java.lang.String("Invalid type url found: "));
        }
        return (com.google.protobuf.r3) this.f45370a.get(split[split.length - 1]);
    }
}
