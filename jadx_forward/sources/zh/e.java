package zh;

/* loaded from: classes12.dex */
public abstract class e {
    public static final zh.h a() {
        com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.f134187c.a();
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        java.lang.Thread thread = new java.lang.Thread(new zh.g(atomicInteger, atomicBoolean, "Matrix.PthreadHackJni.test.affinity"), "Matrix.PthreadHackJni.test.affinity");
        thread.start();
        jz5.o oVar = new jz5.o(atomicInteger, atomicBoolean, thread);
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = (java.util.concurrent.atomic.AtomicInteger) oVar.f384374d;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = (java.util.concurrent.atomic.AtomicBoolean) oVar.f384375e;
        do {
        } while (atomicInteger2.get() == 0);
        try {
            com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.e(true);
            int i17 = atomicInteger2.get();
            boolean[] f17 = zh.c.f();
            if (!zh.c.a(f17)) {
                f17 = zh.c.d();
            }
            java.lang.String subReason = "";
            java.lang.String subReason2 = "null";
            if (f17 != null && zh.c.a(f17)) {
                boolean[] b17 = com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.b(i17);
                if (b17 != null && b17.length == f17.length) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.f(i17, f17));
                    if (!(valueOf.intValue() != 0)) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        java.lang.String subReason3 = java.lang.String.valueOf(valueOf.intValue());
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subReason3, "subReason");
                        return new zh.h(-3, "SetEffFail", subReason3);
                    }
                    boolean[] b18 = com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.b(i17);
                    if (b18 != null && java.util.Arrays.equals(f17, b18)) {
                        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.f(i17, b17));
                        if (!(valueOf2.intValue() != 0)) {
                            valueOf2 = null;
                        }
                        if (valueOf2 != null) {
                            java.lang.String subReason4 = java.lang.String.valueOf(valueOf2.intValue());
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subReason4, "subReason");
                            return new zh.h(-5, "RevertFail", subReason4);
                        }
                        boolean[] b19 = com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.b(i17);
                        if (b19 != null && java.util.Arrays.equals(b17, b19)) {
                            java.lang.String reason = (6 & 2) != 0 ? "" : null;
                            if ((6 & 4) == 0) {
                                subReason = null;
                            }
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subReason, "subReason");
                            return new zh.h(0, reason, subReason);
                        }
                        if (b19 != null) {
                            subReason2 = "Mismatch:" + zh.c.b(b17) + '|' + zh.c.b(b19);
                        }
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subReason2, "subReason");
                        return new zh.h(-6, "RevertFailCheck", subReason2);
                    }
                    if (b18 != null) {
                        subReason2 = "Mismatch:" + zh.c.b(f17) + '|' + zh.c.b(b18);
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subReason2, "subReason");
                    return new zh.h(-4, "SetEffFailCheck", subReason2);
                }
                if (b17 != null) {
                    subReason2 = "MismatchNum:" + f17.length + '|' + b17.length;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subReason2, "subReason");
                return new zh.h(-2, "GetOldFail", subReason2);
            }
            if (f17 == null) {
                subReason = "null";
            } else if (!zh.c.a(f17)) {
                subReason = "invalid";
            }
            return new zh.h(-1, "GetEffFail", subReason);
        } finally {
            com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.e(false);
            atomicBoolean2.set(true);
        }
    }

    public static final zh.h b() {
        zh.h hVar;
        zh.h hVar2;
        com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.f134187c.a();
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        new java.lang.Thread(new zh.g(atomicInteger, atomicBoolean, "Matrix.PthreadHackJni.test.tidPriority"), "Matrix.PthreadHackJni.test.tidPriority").start();
        do {
        } while (atomicInteger.get() == 0);
        try {
            com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.e(true);
            int i17 = atomicInteger.get();
            jz5.l c17 = com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.c(i17);
            int intValue = ((java.lang.Number) c17.f384366d).intValue();
            int intValue2 = ((java.lang.Number) c17.f384367e).intValue();
            if (intValue < 0 || intValue2 < 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(intValue);
                sb6.append(':');
                sb6.append(intValue2);
                java.lang.String subReason = sb6.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subReason, "subReason");
                hVar = new zh.h(-1, "GetOldFail", subReason);
            } else {
                com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a c4652xc579910a = com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.f134187c;
                c4652xc579910a.a();
                java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.m40916xe8a94c65(i17, 5, 0));
                if (!(valueOf.intValue() != 0)) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    java.lang.String subReason2 = java.lang.String.valueOf(valueOf.intValue());
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subReason2, "subReason");
                    hVar = new zh.h(-2, "SetNewFail", subReason2);
                } else {
                    jz5.l c18 = com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.c(i17);
                    int intValue3 = ((java.lang.Number) c18.f384366d).intValue();
                    int intValue4 = ((java.lang.Number) c18.f384367e).intValue();
                    if (intValue3 == 5 && intValue4 == 0) {
                        c4652xc579910a.a();
                        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.m40916xe8a94c65(i17, intValue, intValue2));
                        java.lang.Integer num = valueOf2.intValue() != 0 ? valueOf2 : null;
                        if (num == null) {
                            jz5.l c19 = com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.c(i17);
                            int intValue5 = ((java.lang.Number) c19.f384366d).intValue();
                            int intValue6 = ((java.lang.Number) c19.f384367e).intValue();
                            if (intValue5 == intValue && intValue6 == intValue2) {
                                hVar2 = new zh.h(0, "", "");
                                return hVar2;
                            }
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                            sb7.append(intValue);
                            sb7.append(':');
                            sb7.append(intValue2);
                            sb7.append('|');
                            sb7.append(intValue5);
                            sb7.append(':');
                            sb7.append(intValue6);
                            java.lang.String subReason3 = sb7.toString();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subReason3, "subReason");
                            hVar2 = new zh.h(-5, "RevertFailCheck", subReason3);
                            return hVar2;
                        }
                        java.lang.String subReason4 = java.lang.String.valueOf(num.intValue());
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subReason4, "subReason");
                        hVar = new zh.h(-4, "RevertFail", subReason4);
                    }
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                    sb8.append(5);
                    sb8.append(':');
                    sb8.append(0);
                    sb8.append('|');
                    sb8.append(intValue3);
                    sb8.append(':');
                    sb8.append(intValue4);
                    java.lang.String subReason5 = sb8.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subReason5, "subReason");
                    hVar = new zh.h(-3, "SetNewFailCheck", subReason5);
                }
            }
            return hVar;
        } finally {
            com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.e(false);
            atomicBoolean.set(true);
        }
    }
}
