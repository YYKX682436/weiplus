package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.RTCStats */
/* loaded from: classes.dex */
public class C29842x18c856de {

    /* renamed from: id, reason: collision with root package name */
    private final java.lang.String f429452id;

    /* renamed from: members */
    private final java.util.Map<java.lang.String, java.lang.Object> f75860x388ec919;

    /* renamed from: timestampUs */
    private final long f75861x55a34654;

    /* renamed from: type */
    private final java.lang.String f75862x368f3a;

    public C29842x18c856de(long j17, java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.Object> map) {
        this.f75861x55a34654 = j17;
        this.f75862x368f3a = str;
        this.f429452id = str2;
        this.f75860x388ec919 = map;
    }

    /* renamed from: appendValue */
    private static void m156213x8f0c3277(java.lang.StringBuilder sb6, java.lang.Object obj) {
        if (!(obj instanceof java.lang.Object[])) {
            if (!(obj instanceof java.lang.String)) {
                sb6.append(obj);
                return;
            }
            sb6.append('\"');
            sb6.append(obj);
            sb6.append('\"');
            return;
        }
        java.lang.Object[] objArr = (java.lang.Object[]) obj;
        sb6.append('[');
        for (int i17 = 0; i17 < objArr.length; i17++) {
            if (i17 != 0) {
                sb6.append(", ");
            }
            m156213x8f0c3277(sb6, objArr[i17]);
        }
        sb6.append(']');
    }

    /* renamed from: create */
    public static org.p3371xd0ce3e8d.C29842x18c856de m156214xaf65a0fc(long j17, java.lang.String str, java.lang.String str2, java.util.Map map) {
        return new org.p3371xd0ce3e8d.C29842x18c856de(j17, str, str2, map);
    }

    /* renamed from: getId */
    public java.lang.String m156215x5db1b11() {
        return this.f429452id;
    }

    /* renamed from: getMembers */
    public java.util.Map<java.lang.String, java.lang.Object> m156216x765c04e3() {
        return this.f75860x388ec919;
    }

    /* renamed from: getTimestampUs */
    public double m156217x2f798d1e() {
        return this.f75861x55a34654;
    }

    /* renamed from: getType */
    public java.lang.String m156218xfb85f7b0() {
        return this.f75862x368f3a;
    }

    /* renamed from: toString */
    public java.lang.String m156219x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("{ timestampUs: ");
        sb6.append(this.f75861x55a34654);
        sb6.append(", type: ");
        sb6.append(this.f75862x368f3a);
        sb6.append(", id: ");
        sb6.append(this.f429452id);
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : this.f75860x388ec919.entrySet()) {
            sb6.append(", ");
            sb6.append(entry.getKey());
            sb6.append(": ");
            m156213x8f0c3277(sb6, entry.getValue());
        }
        sb6.append(" }");
        return sb6.toString();
    }
}
