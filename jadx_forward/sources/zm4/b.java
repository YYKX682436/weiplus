package zm4;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f555710a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb f555711b;

    /* renamed from: c, reason: collision with root package name */
    public r45.f03 f555712c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb f555713d;

    /* renamed from: e, reason: collision with root package name */
    public int f555714e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f555715f;

    public final java.util.Map a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = this.f555711b;
        r45.f03 f03Var = this.f555712c;
        if (jbVar == null || f03Var == null) {
            return null;
        }
        dn4.a aVar = dn4.a.f323566a;
        java.util.HashMap hashMap = new java.util.HashMap();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        hashMap.put("my_finder_username", xy2.c.e(context));
        aVar.a(hashMap, jbVar);
        hashMap.put("show_path", f03Var.f455425i);
        hashMap.put("show_type", java.lang.Integer.valueOf(f03Var.f455420d));
        hashMap.put("show_parent_path", f03Var.f455426m);
        return hashMap;
    }

    public final java.util.Map b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = this.f555713d;
        int i17 = this.f555714e;
        if (jbVar == null || i17 <= 0) {
            return null;
        }
        dn4.a aVar = dn4.a.f323566a;
        java.util.HashMap hashMap = new java.util.HashMap();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        hashMap.put("my_finder_username", xy2.c.e(context));
        aVar.a(hashMap, jbVar);
        hashMap.put("message_num", java.lang.Integer.valueOf(i17));
        return hashMap;
    }

    /* renamed from: toString */
    public java.lang.String m179169x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{category:");
        sb6.append(this.f555710a);
        sb6.append(" isBubbleShowInTab:");
        sb6.append(this.f555715f);
        sb6.append(" hasContentRedDot:");
        sb6.append((this.f555711b == null || this.f555712c == null) ? false : true);
        sb6.append(" hasNumRedDot:");
        sb6.append(this.f555713d != null && this.f555714e > 0);
        sb6.append(" contentRedDot:");
        sb6.append(a());
        sb6.append(" numRedDot:");
        sb6.append(b());
        sb6.append('}');
        return sb6.toString();
    }
}
