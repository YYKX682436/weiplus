package com.tencent.mm.contact;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.contact.n f64865d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.contact.n f64866e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.contact.n f64867f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.contact.n[] f64868g;

    static {
        com.tencent.mm.contact.n nVar = new com.tencent.mm.contact.n("Ok", 0);
        f64865d = nVar;
        com.tencent.mm.contact.n nVar2 = new com.tencent.mm.contact.n("Handled", 1);
        f64866e = nVar2;
        com.tencent.mm.contact.n nVar3 = new com.tencent.mm.contact.n("Unhandled", 2);
        f64867f = nVar3;
        com.tencent.mm.contact.n[] nVarArr = {nVar, nVar2, nVar3};
        f64868g = nVarArr;
        rz5.b.a(nVarArr);
    }

    public n(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.contact.n valueOf(java.lang.String str) {
        return (com.tencent.mm.contact.n) java.lang.Enum.valueOf(com.tencent.mm.contact.n.class, str);
    }

    public static com.tencent.mm.contact.n[] values() {
        return (com.tencent.mm.contact.n[]) f64868g.clone();
    }
}
