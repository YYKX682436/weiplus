package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes4.dex */
public final class m7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.extension.reddot.m7 f105709d = new com.tencent.mm.plugin.finder.extension.reddot.m7();

    public m7() {
        super(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if (r0.f388492m != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        if (r1 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        r0 = r0.f388492m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (r0 < c01.id.e()) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0039, code lost:
    
        if ((r0.length() == 0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if ((r0.length() > 0) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        r0 = r6.field_ctrInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
    
        if (r0 == null) goto L21;
     */
    @Override // yz5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r6) {
        /*
            r5 = this;
            com.tencent.mm.plugin.finder.extension.reddot.jb r6 = (com.tencent.mm.plugin.finder.extension.reddot.jb) r6
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.g(r6, r0)
            android.content.Context r0 = com.tencent.mm.sdk.platformtools.x2.f193071a
            java.lang.String r1 = "getContext(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            java.lang.String r0 = xy2.c.e(r0)
            int r1 = r6.getType()
            r2 = 1015(0x3f7, float:1.422E-42)
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L28
            int r1 = r0.length()
            if (r1 <= 0) goto L25
            r1 = r3
            goto L26
        L25:
            r1 = r4
        L26:
            if (r1 != 0) goto L3b
        L28:
            int r1 = r6.getType()
            r2 = 1016(0x3f8, float:1.424E-42)
            if (r1 != r2) goto L55
            int r0 = r0.length()
            if (r0 != 0) goto L38
            r0 = r3
            goto L39
        L38:
            r0 = r4
        L39:
            if (r0 == 0) goto L55
        L3b:
            r45.vs2 r0 = r6.field_ctrInfo
            if (r0 == 0) goto L45
            int r1 = r0.f388492m
            if (r1 != 0) goto L45
            r1 = r3
            goto L46
        L45:
            r1 = r4
        L46:
            if (r1 != 0) goto L55
            if (r0 == 0) goto L4d
            int r0 = r0.f388492m
            goto L4e
        L4d:
            r0 = r4
        L4e:
            int r1 = c01.id.e()
            if (r0 < r1) goto L55
            goto L56
        L55:
            r3 = r4
        L56:
            if (r3 == 0) goto L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[disposeRedDotAtPathIgnoreList]  match,红包活动红点还没到活动开始时间,不能dispose, startTime:"
            r0.<init>(r1)
            r45.vs2 r6 = r6.field_ctrInfo
            if (r6 == 0) goto L65
            int r4 = r6.f388492m
        L65:
            r0.append(r4)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "Finder.RedDotManager"
            com.tencent.mars.xlog.Log.i(r0, r6)
        L71:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.m7.invoke(java.lang.Object):java.lang.Object");
    }
}
