package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes.dex */
public final class t3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.t3 f102548d = new com.tencent.mm.plugin.finder.assist.t3();

    public t3() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.rn5 rn5Var = (r45.rn5) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        kotlin.jvm.internal.o.d(rn5Var);
        sb6.append("related_event_type:" + rn5Var.getInteger(0) + ", related_event_id:" + rn5Var.getString(1));
        sb6.append(',');
        return sb6.toString();
    }
}
