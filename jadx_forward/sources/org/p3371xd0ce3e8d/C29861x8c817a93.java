package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.StatsReport */
/* loaded from: classes11.dex */
public class C29861x8c817a93 {

    /* renamed from: id, reason: collision with root package name */
    public final java.lang.String f429454id;

    /* renamed from: timestamp */
    public final double f75951x3492916;

    /* renamed from: type */
    public final java.lang.String f75952x368f3a;

    /* renamed from: values */
    public final org.p3371xd0ce3e8d.C29861x8c817a93.Value[] f75953xcee59d22;

    /* renamed from: org.webrtc.StatsReport$Value */
    /* loaded from: classes11.dex */
    public static class Value {

        /* renamed from: name */
        public final java.lang.String f75954x337a8b;

        /* renamed from: value */
        public final java.lang.String f75955x6ac9171;

        public Value(java.lang.String str, java.lang.String str2) {
            this.f75954x337a8b = str;
            this.f75955x6ac9171 = str2;
        }

        /* renamed from: toString */
        public java.lang.String m156376x9616526c() {
            return "[" + this.f75954x337a8b + ": " + this.f75955x6ac9171 + "]";
        }
    }

    public C29861x8c817a93(java.lang.String str, java.lang.String str2, double d17, org.p3371xd0ce3e8d.C29861x8c817a93.Value[] valueArr) {
        this.f429454id = str;
        this.f75952x368f3a = str2;
        this.f75951x3492916 = d17;
        this.f75953xcee59d22 = valueArr;
    }

    /* renamed from: toString */
    public java.lang.String m156375x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id: ");
        sb6.append(this.f429454id);
        sb6.append(", type: ");
        sb6.append(this.f75952x368f3a);
        sb6.append(", timestamp: ");
        sb6.append(this.f75951x3492916);
        sb6.append(", values: ");
        int i17 = 0;
        while (true) {
            org.p3371xd0ce3e8d.C29861x8c817a93.Value[] valueArr = this.f75953xcee59d22;
            if (i17 >= valueArr.length) {
                return sb6.toString();
            }
            sb6.append(valueArr[i17].m156376x9616526c());
            sb6.append(", ");
            i17++;
        }
    }
}
