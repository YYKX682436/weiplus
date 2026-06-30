package lm2;

/* loaded from: classes3.dex */
public final class l0 extends lm2.c {

    /* renamed from: i, reason: collision with root package name */
    public r45.gj1 f400953i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f400954m;

    /* renamed from: n, reason: collision with root package name */
    public r45.ze2 f400955n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l0(boolean r3, r45.ch1 r4) {
        /*
            r2 = this;
            java.lang.String r0 = "source"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            r2.<init>(r3, r4)
            r45.gj1 r3 = new r45.gj1
            r3.<init>()
            r0 = 4
            com.tencent.mm.protobuf.g r4 = r4.m75934xbce7f2f(r0)
            r0 = 0
            if (r4 == 0) goto L1a
            byte[] r4 = r4.g()
            goto L1b
        L1a:
            r4 = r0
        L1b:
            java.lang.String r1 = ""
            if (r4 != 0) goto L20
            goto L2e
        L20:
            r3.mo11468x92b714fd(r4)     // Catch: java.lang.Exception -> L24
            goto L2f
        L24:
            r3 = move-exception
            java.lang.String r4 = "safeParser"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r4, r1, r3)
        L2e:
            r3 = r0
        L2f:
            if (r3 == 0) goto L5a
            r2.f400953i = r3
            r4 = 1
            java.lang.String r3 = r3.m75945x2fec8307(r4)
            if (r3 != 0) goto L3b
            r3 = r1
        L3b:
            r2.f400954m = r3
            r45.gj1 r3 = r2.f400953i
            if (r3 == 0) goto L54
            r4 = 0
            com.tencent.mm.protobuf.f r3 = r3.m75936x14adae67(r4)
            r45.ze2 r3 = (r45.ze2) r3
            if (r3 != 0) goto L4f
            r45.ze2 r3 = new r45.ze2
            r3.<init>()
        L4f:
            r2.f400955n = r3
            jz5.f0 r0 = jz5.f0.f384359a
            goto L5a
        L54:
            java.lang.String r3 = "payload"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r3)
            throw r0
        L5a:
            if (r0 != 0) goto L6c
            r45.gj1 r3 = new r45.gj1
            r3.<init>()
            r2.f400953i = r3
            r2.f400954m = r1
            r45.ze2 r3 = new r45.ze2
            r3.<init>()
            r2.f400955n = r3
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lm2.l0.<init>(boolean, r45.ch1):void");
    }

    @Override // lm2.c, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        if (obj instanceof lm2.l0) {
            return super.d(obj);
        }
        return -1;
    }

    @Override // lm2.c
    public java.lang.String g() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LocationBoxMsg content:");
        java.lang.String str = this.f400954m;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("msgContent");
            throw null;
        }
        sb6.append(str);
        sb6.append(", location:");
        sb6.append(i().m75945x2fec8307(2));
        sb6.append(super.g());
        return sb6.toString();
    }

    public final r45.ze2 i() {
        r45.ze2 ze2Var = this.f400955n;
        if (ze2Var != null) {
            return ze2Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(ya.b.f77489x9ff58fb5);
        throw null;
    }

    @Override // lm2.i0
    public java.lang.String j() {
        java.lang.String m75945x2fec8307 = i().m75945x2fec8307(2);
        java.lang.String str = this.f400954m;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("msgContent");
            throw null;
        }
        if (str.length() == 0) {
            if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573033da0, m75945x2fec8307);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                return string;
            }
        }
        java.lang.String str2 = this.f400954m;
        if (str2 != null) {
            return str2;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("msgContent");
        throw null;
    }
}
