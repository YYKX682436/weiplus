package com.p314xaae8f345.mm.vfs;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class v {

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.v f294745e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ com.p314xaae8f345.mm.vfs.v[] f294746f;

    /* renamed from: d, reason: collision with root package name */
    public final int f294747d;

    static {
        com.p314xaae8f345.mm.vfs.v vVar = new com.p314xaae8f345.mm.vfs.v(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26961x60ffeeef.f58296x406ff879, 0, 0);
        com.p314xaae8f345.mm.vfs.v vVar2 = new com.p314xaae8f345.mm.vfs.v("LRU_EXPIRE", 1, 1);
        com.p314xaae8f345.mm.vfs.v vVar3 = new com.p314xaae8f345.mm.vfs.v("EXPIRE", 2, 2);
        f294745e = vVar3;
        com.p314xaae8f345.mm.vfs.v[] vVarArr = {vVar, vVar2, vVar3, new com.p314xaae8f345.mm.vfs.v("LRU", 3, 3)};
        f294746f = vVarArr;
        rz5.b.a(vVarArr);
    }

    public v(java.lang.String str, int i17, int i18) {
        this.f294747d = i18;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.mm.vfs.v m82483xdce0328(java.lang.String str) {
        return (com.p314xaae8f345.mm.vfs.v) java.lang.Enum.valueOf(com.p314xaae8f345.mm.vfs.v.class, str);
    }

    /* renamed from: values */
    public static com.p314xaae8f345.mm.vfs.v[] m82484xcee59d22() {
        return (com.p314xaae8f345.mm.vfs.v[]) f294746f.clone();
    }
}
