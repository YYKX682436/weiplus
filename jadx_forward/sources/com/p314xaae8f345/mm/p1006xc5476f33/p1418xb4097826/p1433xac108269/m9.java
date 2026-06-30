package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes3.dex */
public final class m9 {

    /* renamed from: a, reason: collision with root package name */
    public final int f183921a;

    /* renamed from: b, reason: collision with root package name */
    public final int f183922b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f183923c;

    public m9(int i17, int i18, java.lang.String topic) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topic, "topic");
        this.f183921a = i17;
        this.f183922b = i18;
        this.f183923c = topic;
    }

    /* renamed from: equals */
    public boolean m55518xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m9)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m9 m9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m9) obj;
        return this.f183921a == m9Var.f183921a && this.f183922b == m9Var.f183922b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f183923c, m9Var.f183923c);
    }

    /* renamed from: hashCode */
    public int m55519x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f183921a) * 31) + java.lang.Integer.hashCode(this.f183922b)) * 31) + this.f183923c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m55520x9616526c() {
        return "TopicStringInfo(start=" + this.f183921a + ", count=" + this.f183922b + ", topic=" + this.f183923c + ')';
    }
}
