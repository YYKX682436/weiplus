package aq2;

/* loaded from: classes2.dex */
public final class c extends aq2.b {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(aq2.a r2, r45.qt2 r3, im5.b r4, int r5, kotlin.jvm.internal.i r6) {
        /*
            r1 = this;
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = r0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = r0
        Lb:
            java.lang.String r5 = "userRequest"
            kotlin.jvm.internal.o.g(r2, r5)
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aq2.c.<init>(aq2.a, r45.qt2, im5.b, int, kotlin.jvm.internal.i):void");
    }

    @Override // aq2.b, az2.j, ay1.m
    /* renamed from: x */
    public java.lang.String getF123276h() {
        java.util.LinkedList list;
        r45.dd2 dd2Var;
        aq2.a aVar = this.f13119t;
        int i17 = aVar.f13102a;
        int i18 = 0;
        if (i17 == 12 || i17 == 14 || i17 == 15) {
            i17 = 0;
        }
        r45.dd2 dd2Var2 = aVar.f13110i;
        int integer = dd2Var2 != null ? dd2Var2.getInteger(0) : 0;
        r45.dd2 dd2Var3 = aVar.f13110i;
        if (dd2Var3 != null && (list = dd2Var3.getList(6)) != null && (dd2Var = (r45.dd2) kz5.n0.a0(list, 0)) != null) {
            i18 = dd2Var.getInteger(0);
        }
        com.tencent.mars.xlog.Log.i("CgiFinderNavLiveVertica", "CgiFinderNavLiveVerticalStream getKey tabId: " + integer + " subTabId: " + i18 + " pullType: " + i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(integer);
        sb6.append('_');
        sb6.append(i18);
        sb6.append('_');
        sb6.append(i17);
        return sb6.toString();
    }
}
