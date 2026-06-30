package lm2;

/* loaded from: classes3.dex */
public final class b extends lm2.c {

    /* renamed from: i, reason: collision with root package name */
    public r45.gi1 f400900i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f400901m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f400902n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(boolean r3, r45.ch1 r4) {
        /*
            r2 = this;
            java.lang.String r0 = "source"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            r2.<init>(r3, r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f400902n = r3
            r45.gi1 r3 = new r45.gi1
            r3.<init>()
            r0 = 4
            com.tencent.mm.protobuf.g r4 = r4.m75934xbce7f2f(r0)
            r0 = 0
            if (r4 == 0) goto L21
            byte[] r4 = r4.g()
            goto L22
        L21:
            r4 = r0
        L22:
            java.lang.String r1 = ""
            if (r4 != 0) goto L27
            goto L35
        L27:
            r3.mo11468x92b714fd(r4)     // Catch: java.lang.Exception -> L2b
            goto L36
        L2b:
            r3 = move-exception
            java.lang.String r4 = "safeParser"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r4, r1, r3)
        L35:
            r3 = r0
        L36:
            if (r3 == 0) goto L5a
            r2.f400900i = r3
            r4 = 0
            java.lang.String r3 = r3.m75945x2fec8307(r4)
            if (r3 != 0) goto L42
            goto L43
        L42:
            r1 = r3
        L43:
            r2.f400901m = r1
            java.util.ArrayList r3 = r2.f400902n
            r45.gi1 r4 = r2.f400900i
            if (r4 == 0) goto L54
            r0 = 1
            java.util.LinkedList r4 = r4.m75941xfb821914(r0)
            r3.addAll(r4)
            goto L63
        L54:
            java.lang.String r3 = "payload"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r3)
            throw r0
        L5a:
            r45.gi1 r3 = new r45.gi1
            r3.<init>()
            r2.f400900i = r3
            r2.f400901m = r1
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lm2.b.<init>(boolean, r45.ch1):void");
    }

    @Override // lm2.c, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        if (obj instanceof lm2.b) {
            return super.d(obj);
        }
        return -1;
    }

    @Override // lm2.c
    public java.lang.String g() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("AtBoxMsg, content:");
        java.lang.String str = this.f400901m;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("msgContent");
            throw null;
        }
        sb6.append(str);
        sb6.append(", contacts:");
        sb6.append(kz5.n0.g0(this.f400902n, null, null, null, 0, null, lm2.a.f400898d, 31, null));
        sb6.append(", ");
        sb6.append(super.g());
        return sb6.toString();
    }

    @Override // lm2.i0
    public java.lang.String j() {
        java.lang.String str = this.f400901m;
        if (str != null) {
            return str;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("msgContent");
        throw null;
    }
}
