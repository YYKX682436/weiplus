package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class p1 extends com.p314xaae8f345.mm.vfs.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.q2 f294653e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f294654f;

    /* renamed from: g, reason: collision with root package name */
    public final long f294655g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.C22747x9dc2c96a f294656h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.p314xaae8f345.mm.vfs.C22747x9dc2c96a c22747x9dc2c96a, com.p314xaae8f345.mm.vfs.q2 q2Var, long j17, java.util.Map map) {
        super(c22747x9dc2c96a, map);
        this.f294656h = c22747x9dc2c96a;
        this.f294653e = q2Var;
        this.f294654f = java.util.Collections.singletonList(q2Var);
        this.f294655g = j17;
    }

    @Override // com.p314xaae8f345.mm.vfs.m0
    public java.util.List K() {
        return this.f294654f;
    }

    @Override // com.p314xaae8f345.mm.vfs.m0
    public com.p314xaae8f345.mm.vfs.q2 L(java.lang.String str, int i17) {
        return this.f294653e;
    }

    /* renamed from: equals */
    public boolean m82454xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.mm.vfs.p1)) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.p1 p1Var = (com.p314xaae8f345.mm.vfs.p1) obj;
        return this.f294653e.equals(p1Var.f294653e) && this.f294655g == p1Var.f294655g;
    }

    /* renamed from: hashCode */
    public int m82455x8cdac1b() {
        int hashCode = com.p314xaae8f345.mm.vfs.p1.class.hashCode();
        java.lang.Object[] objArr = {this.f294653e, java.lang.Long.valueOf(this.f294655g)};
        java.util.regex.Pattern pattern = com.p314xaae8f345.mm.vfs.e8.f294450a;
        return hashCode ^ java.util.Arrays.deepHashCode(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
    @Override // com.p314xaae8f345.mm.vfs.m0, com.p314xaae8f345.mm.vfs.a, com.p314xaae8f345.mm.vfs.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(android.os.CancellationSignal r18) {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r2 = "deleteFiles"
            java.lang.String r3 = "deleteSize"
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r1.f294655g
            long r4 = r4 - r6
            r6 = 0
            r8 = 0
            com.tencent.mm.vfs.q2 r0 = r1.f294653e     // Catch: java.lang.Throwable -> L85 java.lang.Exception -> L8a
            java.lang.String r10 = ""
            r11 = 0
            r12 = 1
            java.lang.Iterable r0 = com.p314xaae8f345.mm.vfs.e8.p(r0, r10, r12, r11)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L85
            if (r0 == 0) goto L6e
            pm5.b r0 = (pm5.b) r0     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L8a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L8a
            r10 = r6
            r13 = r8
        L24:
            boolean r14 = r0.hasNext()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L65
            if (r14 == 0) goto L5e
            java.lang.Object r14 = r0.next()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L65
            com.tencent.mm.vfs.x1 r14 = (com.p314xaae8f345.mm.vfs.x1) r14     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L65
            r18.throwIfCanceled()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L65
            boolean r15 = r14.f294769f     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L65
            if (r15 == 0) goto L45
            com.tencent.mm.vfs.ExpireFileSystem r15 = r1.f294656h     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L65
            boolean r15 = r15.f294245h     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L65
            if (r15 == 0) goto L5c
            com.tencent.mm.vfs.q2 r15 = r14.f294770g     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L65
            java.lang.String r14 = r14.f294764a     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L65
            r15.e(r14, r8)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L65
            goto L5c
        L45:
            long r8 = r14.f294768e     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L65
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 > 0) goto L5c
            boolean r8 = r14.b(r12)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L65
            if (r8 == 0) goto L5c
            long r8 = r14.f294767d     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L65
            int r16 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r16 >= 0) goto L59
            long r8 = r14.f294766c     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L65
        L59:
            long r10 = r10 + r8
            int r13 = r13 + 1
        L5c:
            r8 = 0
            goto L24
        L5e:
            r6 = r10
            r8 = r13
            goto L6f
        L61:
            r0 = move-exception
            r6 = r10
            r8 = r13
            goto L6c
        L65:
            r0 = move-exception
            r6 = r10
            r8 = r13
            r4 = 3
            goto L8d
        L6a:
            r0 = move-exception
            r8 = 0
        L6c:
            r9 = 3
            goto L9a
        L6e:
            r8 = 0
        L6f:
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0, r2, r4}
            r4 = 3
            r1.J(r4, r0)
            super.q(r18)
            return
        L83:
            r0 = move-exception
            goto L8b
        L85:
            r0 = move-exception
            r4 = 3
            r9 = r4
            r8 = 0
            goto L9a
        L8a:
            r0 = move-exception
        L8b:
            r4 = 3
            r8 = 0
        L8d:
            boolean r4 = r0 instanceof android.os.OperationCanceledException     // Catch: java.lang.Throwable -> L98
            if (r4 == 0) goto L93
            r4 = 4
            goto L94
        L93:
            r4 = 5
        L94:
            r9 = r4
            throw r0     // Catch: java.lang.Throwable -> L96
        L96:
            r0 = move-exception
            goto L9a
        L98:
            r0 = move-exception
            r9 = r4
        L9a:
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r4, r2, r5}
            r1.J(r9, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.vfs.p1.q(android.os.CancellationSignal):void");
    }

    @Override // com.p314xaae8f345.mm.vfs.a
    /* renamed from: toString */
    public java.lang.String mo82287x9616526c() {
        return "expire(" + com.p314xaae8f345.mm.vfs.e8.h(this.f294655g) + ") <- " + this.f294653e;
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb y() {
        return this.f294656h;
    }
}
