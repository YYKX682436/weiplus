package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes3.dex */
public final class ea {

    /* renamed from: a, reason: collision with root package name */
    public final int f100837a;

    /* renamed from: b, reason: collision with root package name */
    public final int f100838b;

    public ea(int i17, int i18) {
        this.f100837a = i17;
        this.f100838b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.fav.ui.ea)) {
            return false;
        }
        com.tencent.mm.plugin.fav.ui.ea eaVar = (com.tencent.mm.plugin.fav.ui.ea) obj;
        return this.f100837a == eaVar.f100837a && this.f100838b == eaVar.f100838b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f100837a) * 31) + java.lang.Integer.hashCode(this.f100838b);
    }

    public java.lang.String toString() {
        return "FavSortItem(type=" + this.f100837a + ", count=" + this.f100838b + ')';
    }
}
