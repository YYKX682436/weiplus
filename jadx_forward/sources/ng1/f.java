package ng1;

/* loaded from: classes7.dex */
public abstract class f {
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ng1.f r12, ng1.g r13, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r14) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ng1.f.b(ng1.f, ng1.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final k91.v5 a(ng1.g gVar) {
        java.lang.String str = gVar.f418459b;
        boolean z17 = true;
        if (!(str == null || str.length() == 0)) {
            return k91.w5.f387346b.b(gVar.f418459b, new java.lang.String[0]);
        }
        java.lang.String str2 = gVar.f418458a;
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        if (z17) {
            throw new java.lang.IllegalArgumentException("both username & appId is empty");
        }
        k91.w5 w5Var = k91.w5.f387346b;
        w5Var.getClass();
        return w5Var.c(null, java.lang.String.format("%s=?", dm.i4.f66875xa013b0d5), new java.lang.String[]{str2});
    }
}
