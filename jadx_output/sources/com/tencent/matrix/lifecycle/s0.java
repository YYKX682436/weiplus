package com.tencent.matrix.lifecycle;

/* loaded from: classes9.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.matrix.lifecycle.s0 f52790d = new com.tencent.matrix.lifecycle.s0();

    public s0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        java.util.Collection statefuls = (java.util.Collection) obj;
        kotlin.jvm.internal.o.g(statefuls, "statefuls");
        java.util.Collection collection = statefuls;
        if (!collection.isEmpty()) {
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!((com.tencent.matrix.lifecycle.l) it.next()).active()) {
                    z17 = false;
                    break;
                }
            }
        }
        z17 = true;
        return java.lang.Boolean.valueOf(z17);
    }
}
