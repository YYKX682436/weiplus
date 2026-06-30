package vu4;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final vu4.h f521865a;

    /* renamed from: b, reason: collision with root package name */
    public final vu4.j f521866b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f521867c;

    /* renamed from: d, reason: collision with root package name */
    public final int f521868d;

    /* renamed from: e, reason: collision with root package name */
    public final int f521869e;

    /* renamed from: f, reason: collision with root package name */
    public final int f521870f;

    public i(vu4.h actionType, vu4.j packageType, java.lang.String result, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packageType, "packageType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        this.f521865a = actionType;
        this.f521866b = packageType;
        this.f521867c = result;
        this.f521868d = i17;
        this.f521869e = i18;
        this.f521870f = i19;
    }

    public final void a() {
        int i17 = this.f521870f;
        try {
            uv4.g c17 = uv4.x.f512991a.c(i17, java.lang.Boolean.FALSE);
            int m17 = c17 != null ? ((uv4.b) c17).m() : 1;
            java.lang.String str = this.f521865a.f521864d + ',' + this.f521866b.f521875d + ',' + this.f521867c + ',' + this.f521868d + ',' + this.f521869e + ',' + (i17 != 0 ? i17 != 6 ? i17 != 10 ? com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a : "emoji_search" : "tag_search" : "web_search") + ',' + m17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Report36771Item", "report: " + str);
            jx3.f.INSTANCE.mo68478xbd3cda5f(36771, str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Report36771Item", e17, "report36771 failed", new java.lang.Object[0]);
        }
    }

    /* renamed from: equals */
    public boolean m172670xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu4.i)) {
            return false;
        }
        vu4.i iVar = (vu4.i) obj;
        return this.f521865a == iVar.f521865a && this.f521866b == iVar.f521866b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521867c, iVar.f521867c) && this.f521868d == iVar.f521868d && this.f521869e == iVar.f521869e && this.f521870f == iVar.f521870f;
    }

    /* renamed from: hashCode */
    public int m172671x8cdac1b() {
        return (((((((((this.f521865a.hashCode() * 31) + this.f521866b.hashCode()) * 31) + this.f521867c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f521868d)) * 31) + java.lang.Integer.hashCode(this.f521869e)) * 31) + java.lang.Integer.hashCode(this.f521870f);
    }

    /* renamed from: toString */
    public java.lang.String m172672x9616526c() {
        return "Report36771Item(actionType=" + this.f521865a + ", packageType=" + this.f521866b + ", result=" + this.f521867c + ", exptLevel=" + this.f521868d + ", h5Version=" + this.f521869e + ", templateType=" + this.f521870f + ')';
    }
}
