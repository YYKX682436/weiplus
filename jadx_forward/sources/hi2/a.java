package hi2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f363036a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f363037b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f363038c;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f363036a = str;
        this.f363037b = str2;
        this.f363038c = str3;
    }

    /* renamed from: equals */
    public boolean m133565xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi2.a)) {
            return false;
        }
        hi2.a aVar = (hi2.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f363036a, aVar.f363036a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f363037b, aVar.f363037b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f363038c, aVar.f363038c);
    }

    /* renamed from: hashCode */
    public int m133566x8cdac1b() {
        java.lang.String str = this.f363036a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f363037b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f363038c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m133567x9616526c() {
        return "FinderLiveMicAnchorReportStruct(finderUsername=" + this.f363036a + ", feedId=" + this.f363037b + ", candidateRequestId=" + this.f363038c + ')';
    }

    public a(r45.xn1 xn1Var) {
        this((xn1Var == null || (r2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : r2.m76197x6c03c64c(), (xn1Var == null || (r6 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null || (r6 = r6.m76178x3b8c916b()) == null) ? null : pm0.v.u(r6.m75942xfb822ef2(11)), null);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        r45.kz0 m76178x3b8c916b;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(km2.q r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
            if (r6 == 0) goto L15
            r45.xn1 r2 = r6.f390720r
            if (r2 == 0) goto L15
            com.tencent.mm.protobuf.f r2 = r2.m75936x14adae67(r0)
            com.tencent.mm.protocal.protobuf.FinderContact r2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) r2
            if (r2 == 0) goto L15
            java.lang.String r2 = r2.m76197x6c03c64c()
            goto L16
        L15:
            r2 = r1
        L16:
            if (r6 == 0) goto L25
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r6.E
            if (r3 == 0) goto L25
            long r3 = r3.m59251x5db1b11()
        L20:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            goto L41
        L25:
            if (r6 == 0) goto L40
            r45.xn1 r3 = r6.f390720r
            if (r3 == 0) goto L40
            com.tencent.mm.protobuf.f r0 = r3.m75936x14adae67(r0)
            com.tencent.mm.protocal.protobuf.FinderContact r0 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) r0
            if (r0 == 0) goto L40
            r45.kz0 r0 = r0.m76178x3b8c916b()
            if (r0 == 0) goto L40
            r3 = 11
            long r3 = r0.m75942xfb822ef2(r3)
            goto L20
        L40:
            r0 = r1
        L41:
            if (r0 == 0) goto L4c
            long r3 = r0.longValue()
            java.lang.String r0 = pm0.v.u(r3)
            goto L4d
        L4c:
            r0 = r1
        L4d:
            if (r6 == 0) goto L51
            java.lang.String r1 = r6.F
        L51:
            r5.<init>(r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hi2.a.<init>(km2.q):void");
    }
}
