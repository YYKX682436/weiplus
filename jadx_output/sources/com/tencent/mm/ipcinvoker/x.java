package com.tencent.mm.ipcinvoker;

/* loaded from: classes11.dex */
public abstract class x implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f68467d;

    public x(java.lang.String str) {
        this.f68467d = str;
        iz5.a.d(null, str);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.tencent.mm.ipcinvoker.x)) {
            return false;
        }
        return this.f68467d.equals(((com.tencent.mm.ipcinvoker.x) obj).f68467d);
    }
}
