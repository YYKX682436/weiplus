package cp2;

/* loaded from: classes2.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc f302400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f302401e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f302402f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f302403g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa f302404h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f302405i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f302406m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f302407n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f302408o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f302409p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, long j17, java.util.LinkedList linkedList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa c13924x37151faa, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var3, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var4, ym5.s3 s3Var) {
        super(0);
        this.f302400d = c14500x958689dc;
        this.f302401e = h0Var;
        this.f302402f = j17;
        this.f302403g = linkedList;
        this.f302404h = c13924x37151faa;
        this.f302405i = f0Var;
        this.f302406m = f0Var2;
        this.f302407n = f0Var3;
        this.f302408o = f0Var4;
        this.f302409p = s3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc = this.f302400d;
        c14500x958689dc.m56387xe6796cde().clear();
        java.util.AbstractCollection m56387xe6796cde = c14500x958689dc.m56387xe6796cde();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f302401e;
        m56387xe6796cde.addAll((java.util.Collection) h0Var.f391656d);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f302402f;
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        java.lang.String p17 = hc2.o0.p((java.util.List) h0Var.f391656d);
        java.lang.String p18 = hc2.o0.p(this.f302403g);
        long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime2;
        java.lang.String b17 = c14500x958689dc.getB();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mergeRefresh() mergeTime:");
        sb6.append(elapsedRealtime);
        sb6.append(" collectInfoTime:");
        sb6.append(elapsedRealtime3);
        sb6.append(" hasMore:");
        sb6.append(this.f302404h.getHasMore());
        sb6.append(" removeIndex:");
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f302405i;
        sb6.append(f0Var.f391649d);
        sb6.append("  removeSize:");
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = this.f302406m;
        sb6.append(f0Var2.f391649d);
        sb6.append(" insertIndex:");
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var3 = this.f302407n;
        sb6.append(f0Var3.f391649d);
        sb6.append("  insertSize:");
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var4 = this.f302408o;
        sb6.append(f0Var4.f391649d);
        sb6.append(" newList:");
        sb6.append(p17);
        sb6.append(" oldList:");
        sb6.append(p18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b17, sb6.toString());
        if (f0Var.f391649d >= 0 && f0Var2.f391649d > 0) {
            c14500x958689dc.getDispatcher().e(f0Var.f391649d, f0Var2.f391649d);
        }
        if (f0Var3.f391649d >= 0 && f0Var4.f391649d > 0) {
            c14500x958689dc.getDispatcher().d(f0Var3.f391649d, f0Var4.f391649d);
        }
        int i17 = f0Var4.f391649d;
        ym5.s3 s3Var = this.f302409p;
        s3Var.f545056h = i17;
        c14500x958689dc.getDispatcher().g(s3Var);
        return jz5.f0.f384359a;
    }
}
