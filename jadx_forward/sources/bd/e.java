package bd;

/* loaded from: classes15.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f100730a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f100731b;

    /* renamed from: c, reason: collision with root package name */
    public final long f100732c;

    /* renamed from: d, reason: collision with root package name */
    public final long f100733d;

    /* renamed from: e, reason: collision with root package name */
    public final int f100734e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f100735f;

    public e(long j17, java.lang.String str, long j18, long j19, int i17, boolean z17) {
        this.f100730a = j17;
        this.f100731b = str;
        this.f100732c = j18;
        this.f100733d = j19;
        this.f100734e = i17;
        this.f100735f = z17;
    }

    public final void a(java.lang.Object obj, boolean z17, boolean z18) {
        if (this.f100733d <= 0) {
            return;
        }
        java.lang.Object jSONObject = obj == null ? new org.json.JSONObject() : obj;
        boolean z19 = jSONObject instanceof java.nio.ByteBuffer;
        boolean z27 = this.f100735f;
        long j17 = this.f100730a;
        java.lang.String str = this.f100731b;
        if (z19) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65233x3b9fa0d0(this.f100731b, this.f100730a, this.f100732c, this.f100733d, "{\"__id\":" + com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65461x627eb42(str, j17, ((java.nio.ByteBuffer) jSONObject).array(), z27) + "}", z18, z17, this.f100735f);
        } else if (jSONObject instanceof java.lang.String) {
            java.lang.String str2 = (java.lang.String) jSONObject;
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65382xb9a4c932(str2)) {
                str2 = "\"" + com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65287x77baa7f2(str2) + "\"";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65233x3b9fa0d0(this.f100731b, this.f100730a, this.f100732c, this.f100733d, str2, z18, z17, this.f100735f);
        } else if (jSONObject instanceof bd.a) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65233x3b9fa0d0(this.f100731b, this.f100730a, this.f100732c, this.f100733d, bd.j.a((bd.a) jSONObject, str, j17, z27), z18, z17, this.f100735f);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65233x3b9fa0d0(this.f100731b, this.f100730a, this.f100732c, this.f100733d, jSONObject.toString(), z18, z17, this.f100735f);
        }
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37143x4c65a0e3.remove(java.lang.Integer.valueOf(this.f100734e));
    }
}
