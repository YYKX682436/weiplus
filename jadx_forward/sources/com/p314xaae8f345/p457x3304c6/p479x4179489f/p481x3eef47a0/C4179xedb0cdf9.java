package com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0;

/* renamed from: com.tencent.maas.moviecomposing.segments.CaptionItem */
/* loaded from: classes5.dex */
public class C4179xedb0cdf9 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f130055a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 f130056b;

    public C4179xedb0cdf9(java.lang.String str, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553) {
        this.f130055a = str;
        this.f130056b = c4129xdee64553;
    }

    /* renamed from: equals */
    public boolean m34365xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4179xedb0cdf9 c4179xedb0cdf9 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4179xedb0cdf9) obj;
        return java.util.Objects.equals(this.f130055a, c4179xedb0cdf9.f130055a) && java.util.Objects.equals(this.f130056b, c4179xedb0cdf9.f130056b);
    }

    /* renamed from: getText */
    public java.lang.String m34366xfb85ada3() {
        return this.f130055a;
    }

    /* renamed from: getTimeRange */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 m34367xdd1fba() {
        return this.f130056b;
    }

    /* renamed from: toString */
    public java.lang.String m34368x9616526c() {
        return "CaptionItem{text='" + this.f130055a + "', timeRange=" + this.f130056b + '}';
    }
}
