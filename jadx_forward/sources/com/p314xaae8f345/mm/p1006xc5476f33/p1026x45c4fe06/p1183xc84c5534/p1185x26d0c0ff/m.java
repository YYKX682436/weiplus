package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff;

/* loaded from: classes7.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f169760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 f169761e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 f169762f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 c12566x87f2d8b7, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4) {
        super(0);
        this.f169760d = i17;
        this.f169761e = c12566x87f2d8b7;
        this.f169762f = c11809xbc286be4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.String[] strArr = gm0.j1.f354738l;
        int i18 = 0;
        while (true) {
            i17 = this.f169760d;
            if (i18 >= 5) {
                break;
            }
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + strArr[i18];
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bm5.f1.a(), str)) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.o(str)) {
                    com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2 c10754x630c9a2 = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(str, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.k.class);
                    i17 = c10754x630c9a2 != null ? c10754x630c9a2.f149937d : 0;
                } else {
                    i17 = -1;
                }
            }
            linkedList.addLast(java.lang.Integer.valueOf(i17));
            i18++;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7103x1f62131a c7103x1f62131a = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7103x1f62131a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 c12566x87f2d8b7 = this.f169761e;
        c7103x1f62131a.f144179d = c7103x1f62131a.b("InstanceId", c12566x87f2d8b7.f169667d, true);
        c7103x1f62131a.f144180e = c7103x1f62131a.b("AppId", c12566x87f2d8b7.f169668e, true);
        c7103x1f62131a.f144181f = c12566x87f2d8b7.f169672i;
        int i19 = c12566x87f2d8b7.f169669f;
        c7103x1f62131a.f144182g = i19 != 1 ? i19 != 2 ? i19 != 3 ? null : cm.c0.demo : cm.c0.debug : cm.c0.release;
        c7103x1f62131a.f144183h = c12566x87f2d8b7.f169670g;
        c7103x1f62131a.f144184i = c12566x87f2d8b7.f169671h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : linkedList) {
            if ((((java.lang.Number) obj).intValue() >= 0) != false) {
                arrayList.add(obj);
            }
        }
        c7103x1f62131a.f144185j = arrayList.size() - (this.f169762f.f158829i2 ? 1L : 0L);
        c7103x1f62131a.f144186k = i17;
        c7103x1f62131a.f144187l = c7103x1f62131a.b("distribution", u46.l.h(linkedList, "_"), true);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        sb6.append(":tools");
        c7103x1f62131a.f144188m = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.o(sb6.toString()) ? 1L : 0L;
        c7103x1f62131a.k();
        return jz5.f0.f384359a;
    }
}
