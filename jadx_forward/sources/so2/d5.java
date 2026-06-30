package so2;

/* loaded from: classes2.dex */
public final class d5 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.r03 f491847d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.r23 f491848e;

    public d5(r45.r03 topicInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topicInfo, "topicInfo");
        this.f491847d = topicInfo;
        this.f491848e = (r45.r23) topicInfo.m75936x14adae67(23);
    }

    public final java.lang.String a() {
        r45.rz6 rz6Var;
        r45.b70 b70Var;
        r45.r23 r23Var = (r45.r23) this.f491847d.m75936x14adae67(23);
        java.lang.String str = (r23Var == null || (rz6Var = (r45.rz6) r23Var.m75936x14adae67(1)) == null || (b70Var = rz6Var.f466856g) == null) ? null : b70Var.f452118g;
        return str == null ? "" : str;
    }

    public final java.lang.String b() {
        r45.rz6 rz6Var;
        r45.b70 b70Var;
        r45.r23 r23Var = (r45.r23) this.f491847d.m75936x14adae67(23);
        java.lang.String str = (r23Var == null || (rz6Var = (r45.rz6) r23Var.m75936x14adae67(1)) == null || (b70Var = rz6Var.f466856g) == null) ? null : b70Var.f452115d;
        return str == null ? "" : str;
    }

    public final int c() {
        r45.rz6 rz6Var;
        r45.b70 b70Var;
        r45.r23 r23Var = (r45.r23) this.f491847d.m75936x14adae67(23);
        if (r23Var == null || (rz6Var = (r45.rz6) r23Var.m75936x14adae67(1)) == null || (b70Var = rz6Var.f466856g) == null) {
            return 0;
        }
        return b70Var.f452116e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        r45.r23 r23Var;
        r45.rz6 rz6Var;
        java.lang.String str;
        r45.rz6 rz6Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        if (!(obj instanceof so2.d5) || (r23Var = this.f491848e) == null || (rz6Var = (r45.rz6) r23Var.m75936x14adae67(1)) == null || (str = rz6Var.f466853d) == null) {
            return 0;
        }
        r45.r23 r23Var2 = ((so2.d5) obj).f491848e;
        java.lang.String str2 = (r23Var2 == null || (rz6Var2 = (r45.rz6) r23Var2.m75936x14adae67(1)) == null) ? null : rz6Var2.f466853d;
        if (str2 == null) {
            str2 = "";
        }
        return str.compareTo(str2);
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return so2.d5.class.getName().hashCode();
    }
}
