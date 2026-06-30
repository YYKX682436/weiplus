package bk4;

/* loaded from: classes11.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final bk4.q0 f103071a = new bk4.q0();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f103072b = jz5.h.b(bk4.o0.f103054d);

    public final void a(int i17, java.util.Collection labelIdList, java.util.Collection userNameList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(labelIdList, "labelIdList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userNameList, "userNameList");
        if (i17 == 2 || i17 == 3) {
            boolean z17 = !userNameList.isEmpty();
            boolean z18 = !labelIdList.isEmpty();
            if (z17 || z18) {
                pj4.k2 k2Var = new pj4.k2();
                k2Var.f436692d = i17;
                k2Var.f436694f.addAll(labelIdList);
                k2Var.f436693e.addAll(userNameList);
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) f103072b).mo141623x754a37bb()).H("KEY_TEXTSTATUS_RECENT_RANGE", k2Var.mo14344x5f01b1f6());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.content.Context r20, mj4.h r21, n80.c r22) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bk4.q0.b(android.content.Context, mj4.h, n80.c):void");
    }

    public final pj4.k2 c() {
        try {
            byte[] j17 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) f103072b).mo141623x754a37bb()).j("KEY_TEXTSTATUS_RECENT_RANGE");
            pj4.k2 k2Var = new pj4.k2();
            k2Var.mo11468x92b714fd(j17);
            return k2Var;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.TextStatusGroupVisibilityHelper", "readRecentRange failed", new java.lang.Object[0]);
            return null;
        }
    }
}
