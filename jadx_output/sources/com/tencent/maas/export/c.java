package com.tencent.maas.export;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.maas.export.c f48009b = new com.tencent.maas.export.c("");

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f48010a;

    public c(java.lang.String str) {
        this.f48010a = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.tencent.maas.export.c.class != obj.getClass()) {
            return false;
        }
        return this.f48010a.equals(((com.tencent.maas.export.c) obj).f48010a);
    }

    public int hashCode() {
        return java.util.Objects.hash(this.f48010a);
    }

    public java.lang.String toString() {
        return "TaskID{value=" + this.f48010a + '}';
    }
}
