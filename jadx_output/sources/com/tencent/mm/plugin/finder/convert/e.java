package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f103208a;

    /* renamed from: b, reason: collision with root package name */
    public final int f103209b;

    /* renamed from: c, reason: collision with root package name */
    public final int f103210c;

    public e(int i17, int i18, int i19) {
        this.f103208a = i17;
        this.f103209b = i18;
        this.f103210c = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.convert.e)) {
            return false;
        }
        com.tencent.mm.plugin.finder.convert.e eVar = (com.tencent.mm.plugin.finder.convert.e) obj;
        return this.f103208a == eVar.f103208a && this.f103209b == eVar.f103209b && this.f103210c == eVar.f103210c;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f103208a) * 31) + java.lang.Integer.hashCode(this.f103209b)) * 31) + java.lang.Integer.hashCode(this.f103210c);
    }

    public java.lang.String toString() {
        return "PlayParams(percentageNum=" + this.f103208a + ", progressMs=" + this.f103209b + ", durationMs=" + this.f103210c + ')';
    }
}
