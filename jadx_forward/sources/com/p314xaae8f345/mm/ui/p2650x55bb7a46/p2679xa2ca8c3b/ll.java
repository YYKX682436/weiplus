package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public final class ll {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f286025a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f286026b;

    public ll(java.lang.String topic, java.lang.String content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topic, "topic");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        this.f286025a = topic;
        this.f286026b = content;
    }

    /* renamed from: equals */
    public boolean m80074xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ll)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ll llVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ll) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f286025a, llVar.f286025a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f286026b, llVar.f286026b);
    }

    /* renamed from: hashCode */
    public int m80075x8cdac1b() {
        return (this.f286025a.hashCode() * 31) + this.f286026b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m80076x9616526c() {
        return "InfoItem(topic=" + this.f286025a + ", content=" + this.f286026b + ')';
    }
}
