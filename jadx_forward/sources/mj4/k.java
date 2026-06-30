package mj4;

/* loaded from: classes11.dex */
public final class k implements mj4.h {

    /* renamed from: b, reason: collision with root package name */
    public final mj4.a f408600b;

    /* renamed from: c, reason: collision with root package name */
    public pj4.z f408601c;

    /* renamed from: d, reason: collision with root package name */
    public int f408602d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f408603e;

    /* renamed from: f, reason: collision with root package name */
    public int f408604f;

    /* renamed from: g, reason: collision with root package name */
    public pj4.r f408605g;

    /* renamed from: h, reason: collision with root package name */
    public int f408606h;

    /* renamed from: i, reason: collision with root package name */
    public pj4.o0 f408607i;

    /* renamed from: j, reason: collision with root package name */
    public int f408608j;

    public k(mj4.a baseData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseData, "baseData");
        this.f408600b = baseData;
    }

    public java.lang.String c() {
        return bk4.i.a().K() ? java.lang.String.valueOf((int) (c01.id.f(this.f408600b.f76512x81959a6e) / 3600)) : mj4.d.b(xe0.j0.a(this, false, 1, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if ((r26.n0.N(i())) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if ((r26.n0.N(j())) != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int d(java.lang.String r4, pj4.b0 r5, boolean r6) {
        /*
            r3 = this;
            java.lang.String r0 = "newStatusId"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            java.lang.String r0 = "newInfo"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            java.lang.String r0 = r3.l()
            boolean r4 = android.text.TextUtils.equals(r0, r4)
            if (r4 != 0) goto L18
            r4 = 7
            return r4
        L18:
            r4 = 1
            r0 = 0
            if (r6 == 0) goto L2b
            java.lang.String r1 = r3.i()
            boolean r1 = r26.n0.N(r1)
            if (r1 == 0) goto L28
            r1 = r4
            goto L29
        L28:
            r1 = r0
        L29:
            if (r1 == 0) goto L2d
        L2b:
            if (r6 != 0) goto L2f
        L2d:
            r1 = r4
            goto L30
        L2f:
            r1 = r0
        L30:
            if (r1 == 0) goto L40
            java.lang.String r1 = r3.i()
            java.lang.String r2 = r5.f436511m
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L40
            r1 = r4
            goto L41
        L40:
            r1 = r0
        L41:
            if (r6 == 0) goto L52
            java.lang.String r2 = r3.j()
            boolean r2 = r26.n0.N(r2)
            if (r2 == 0) goto L4f
            r2 = r4
            goto L50
        L4f:
            r2 = r0
        L50:
            if (r2 == 0) goto L56
        L52:
            if (r6 != 0) goto L55
            goto L56
        L55:
            r4 = r0
        L56:
            if (r4 == 0) goto L68
            java.lang.String r4 = r3.j()
            java.lang.String r5 = r5.f436509h
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 != 0) goto L68
            r4 = r1 | 2
            r1 = r4 | 4
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mj4.k.d(java.lang.String, pj4.b0, boolean):int");
    }

    public pj4.z e() {
        mj4.a aVar = this.f408600b;
        byte[] bArr = aVar.f76514x769010ef;
        if (bArr == null) {
            bArr = new byte[0];
        }
        if (this.f408602d == bArr.hashCode()) {
            pj4.z zVar = this.f408601c;
            return zVar == null ? new pj4.z() : zVar;
        }
        pj4.z zVar2 = new pj4.z();
        byte[] bArr2 = aVar.f76514x769010ef;
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        zVar2.mo11468x92b714fd(bArr2);
        this.f408602d = bArr2.hashCode();
        this.f408601c = zVar2;
        return zVar2;
    }

    public java.lang.String f() {
        java.lang.String str = this.f408600b.f76508x224bb1b0;
        return str == null ? "" : str;
    }

    public java.lang.String g() {
        java.lang.String str = this.f408600b.f76513x685e8417;
        return str == null ? "" : str;
    }

    public java.lang.String h() {
        java.lang.String str = this.f408600b.f76517xc80c2659;
        return str == null ? "" : str;
    }

    public java.lang.String i() {
        java.lang.String str = this.f408600b.f76524x2a6c5918;
        return str == null ? "" : str;
    }

    public java.lang.String j() {
        java.lang.String str = this.f408600b.f76526xebec90b0;
        return str == null ? "" : str;
    }

    public java.lang.String k() {
        java.lang.String str = this.f408600b.f76528xbfdbb190;
        return str == null ? "" : str;
    }

    public java.lang.String l() {
        java.lang.String str = this.f408600b.f76532x70371252;
        return str == null ? "" : str;
    }

    public java.lang.String m() {
        java.lang.String str = this.f408600b.f76533x93e38c45;
        return str == null ? "" : str;
    }

    public byte[] n() {
        byte[] bArr = this.f408600b.f76534x2931c158;
        return bArr == null ? new byte[0] : bArr;
    }

    public java.lang.String o() {
        java.lang.String str = this.f408600b.f76535x11b86abb;
        return str == null ? "" : str;
    }

    public java.lang.String p() {
        java.lang.String str = this.f408600b.f76537xf8037a0e;
        return str == null ? "" : str;
    }

    public long q() {
        java.lang.Long l17 = this.f408600b.f76543x99db75a;
        if (l17 == null) {
            return 0L;
        }
        return l17.longValue();
    }

    public byte[] r() {
        byte[] bArr = this.f408600b.f76550x1164c0dd;
        return bArr == null ? new byte[0] : bArr;
    }

    public long s() {
        java.lang.Long l17 = this.f408600b.f76543x99db75a;
        if (l17 == null) {
            return 0L;
        }
        return l17.longValue();
    }

    public pj4.r t() {
        byte[] bArr = this.f408600b.f76529x44a884ec;
        if (this.f408605g != null && bArr != null && this.f408606h == bArr.hashCode()) {
            return this.f408605g;
        }
        if (bArr != null) {
            if (!(bArr.length == 0)) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new pj4.r().mo11468x92b714fd(bArr);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.PrivateInfo");
                this.f408605g = (pj4.r) mo11468x92b714fd;
                this.f408606h = bArr.hashCode();
            }
        }
        return this.f408605g;
    }

    /* renamed from: toString */
    public java.lang.String m147398x9616526c() {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[ TSItem() username:");
        sb6.append(o());
        sb6.append(", statusId:");
        sb6.append(l());
        sb6.append(" ,TopicId:");
        sb6.append(m());
        sb6.append(",sourceId:");
        mj4.a aVar = this.f408600b;
        java.lang.String str = aVar.f76531x89b4443b;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(",IconID:");
        sb6.append(h());
        sb6.append(",MediaType:");
        sb6.append(aVar.f76525x91a52c19);
        sb6.append(",mediaUrl:");
        sb6.append(j());
        sb6.append(",thumb:");
        sb6.append(i());
        sb6.append("state:");
        sb6.append(aVar.f76549x29d3a50c);
        sb6.append(",bid:");
        sb6.append(p());
        sb6.append(",likeCont:");
        sb6.append(aVar.f76519x6c32293);
        sb6.append(",CommentCont:");
        sb6.append(aVar.f76511x43d69935);
        sb6.append(",mwidth");
        sb6.append(aVar.f76542x2c5150a7);
        sb6.append(",mheight");
        sb6.append(aVar.f76541x4409ca66);
        sb6.append(",etime:");
        sb6.append(aVar.f76515xfe382d11);
        sb6.append(", contentScore:");
        sb6.append(aVar.f76538x3d0facbe);
        sb6.append(", isLocal=");
        sb6.append(y());
        sb6.append(", visibility=");
        sb6.append(aVar.f76536xa3af7397);
        sb6.append(", whiteListCount:");
        pj4.r t17 = t();
        java.lang.Integer num = null;
        sb6.append((t17 == null || (linkedList2 = t17.f436804g) == null) ? null : java.lang.Integer.valueOf(linkedList2.size()));
        sb6.append(", whiteUserCount:");
        pj4.r t18 = t();
        if (t18 != null && (linkedList = t18.f436803f) != null) {
            num = java.lang.Integer.valueOf(linkedList.size());
        }
        sb6.append(num);
        sb6.append("]\n");
        return sb6.toString();
    }

    public pj4.o0 u(boolean z17) {
        if (!z17) {
            if (this.f408608j == n().hashCode()) {
                pj4.o0 o0Var = this.f408607i;
                return o0Var == null ? new pj4.o0() : o0Var;
            }
        }
        pj4.o0 o0Var2 = new pj4.o0();
        byte[] n17 = n();
        o0Var2.mo11468x92b714fd(n17);
        this.f408608j = n17.hashCode();
        this.f408607i = o0Var2;
        return o0Var2;
    }

    public boolean v() {
        return (s() & 1) != 0;
    }

    public boolean w() {
        return this.f408600b.t0();
    }

    public boolean x() {
        return (s() & 128) != 0;
    }

    public boolean y() {
        return (l().length() == 0) || this.f408600b.f408588o2;
    }

    public boolean z() {
        int i17 = this.f408600b.f76549x29d3a50c;
        mj4.h.f408597a.getClass();
        return i17 == mj4.g.f408596c;
    }
}
