package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class b9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.c9 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f166060a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(java.lang.String value) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.f166060a = value;
    }

    /* renamed from: equals */
    public boolean m51694xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.b9.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.launching.LaunchTimeoutFallbackBackupWxaAttrUtils.KEY.USERNAME");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f166060a, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.b9) obj).f166060a);
    }

    /* renamed from: hashCode */
    public int m51695x8cdac1b() {
        return this.f166060a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m51696x9616526c() {
        return "USERNAME(value=" + this.f166060a + ')';
    }
}
