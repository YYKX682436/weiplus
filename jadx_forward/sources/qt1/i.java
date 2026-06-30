package qt1;

/* loaded from: classes7.dex */
public final class i extends qt1.c {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f448064c;

    /* renamed from: d, reason: collision with root package name */
    public final qt1.g f448065d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f448066e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f448067f;

    /* renamed from: g, reason: collision with root package name */
    public final int f448068g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(java.lang.String r3, qt1.g r4, boolean r5) {
        /*
            r2 = this;
            java.lang.String r0 = "scene"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            r45.oq3 r0 = new r45.oq3
            r0.<init>()
            r0.f463977d = r3
            int r1 = r4.f448060d
            r0.f463978e = r1
            r0.f463979f = r5
            r45.pq3 r5 = new r45.pq3
            r5.<init>()
            r2.<init>(r0, r5)
            r2.f448064c = r3
            r2.f448065d = r4
            java.lang.String r3 = "MicroMsg.CgiGetAllPlateNo"
            r2.f448066e = r3
            java.lang.String r3 = "/cgi-bin/mmbiz-bin/wxabusiness/getuserplateinfo"
            r2.f448067f = r3
            r3 = 5976(0x1758, float:8.374E-42)
            r2.f448068g = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qt1.i.<init>(java.lang.String, qt1.g, boolean):void");
    }

    @Override // qt1.c
    public int a() {
        return this.f448068g;
    }

    @Override // qt1.c
    public java.lang.String b() {
        return this.f448066e;
    }

    @Override // qt1.c
    public java.lang.String c() {
        return this.f448067f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // qt1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof qt1.h
            if (r0 == 0) goto L13
            r0 = r8
            qt1.h r0 = (qt1.h) r0
            int r1 = r0.f448063f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f448063f = r1
            goto L18
        L13:
            qt1.h r0 = new qt1.h
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f448061d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f448063f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L59
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "send with appId:"
            r8.<init>(r2)
            java.lang.String r2 = r7.f448064c
            r8.append(r2)
            java.lang.String r2 = ", scene:"
            r8.append(r2)
            qt1.g r2 = r7.f448065d
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            r7.d(r8)
            r0.f448063f = r3
            java.lang.Object r8 = super.e(r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            r0 = r8
            r45.pq3 r0 = (r45.pq3) r0
            java.lang.String r1 = r0.f464839e
            r2 = 0
            if (r1 == 0) goto L7a
            int r4 = r1.length()
            if (r4 <= 0) goto L69
            r4 = r3
            goto L6a
        L69:
            r4 = r2
        L6a:
            if (r4 == 0) goto L7a
            pt1.b r4 = pt1.b.f439762a
            r4.getClass()
            f06.v[] r5 = pt1.b.f439763b
            r5 = r5[r2]
            nf.r r6 = pt1.b.f439764c
            r6.c(r4, r5, r1)
        L7a:
            java.lang.String r1 = r0.f464840f
            if (r1 == 0) goto L96
            int r4 = r1.length()
            if (r4 <= 0) goto L85
            r2 = r3
        L85:
            if (r2 == 0) goto L96
            pt1.b r2 = pt1.b.f439762a
            r2.getClass()
            f06.v[] r4 = pt1.b.f439763b
            r5 = 2
            r4 = r4[r5]
            nf.r r5 = pt1.b.f439766e
            r5.c(r2, r4, r1)
        L96:
            r45.i7 r1 = r0.f464841g
            if (r1 == 0) goto La8
            pt1.b r2 = pt1.b.f439762a
            r2.getClass()
            f06.v[] r4 = pt1.b.f439763b
            r3 = r4[r3]
            nf.r r4 = pt1.b.f439765d
            r4.c(r2, r3, r1)
        La8:
            r45.pw6 r0 = r0.f464842h
            if (r0 == 0) goto Lb3
            pt1.b r1 = pt1.b.f439762a
            r1.getClass()
            pt1.b.f439767f = r0
        Lb3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: qt1.i.e(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
