package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class q8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.q8 f102489d = new com.tencent.mm.plugin.finder.assist.q8();

    public q8() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = com.tencent.mm.plugin.finder.assist.t8.f102556b.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.finder.assist.s8 s8Var = (com.tencent.mm.plugin.finder.assist.s8) it.next();
            if (hashMap.containsKey(s8Var.f102540b)) {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            }
            hashMap.put(s8Var.f102540b, java.lang.Integer.valueOf(s8Var.f102539a));
        }
        return hashMap;
    }
}
