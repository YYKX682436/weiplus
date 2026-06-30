package h;

/* loaded from: classes13.dex */
public final class d extends h.b {
    static {
        new h.c(null);
    }

    @Override // h.b
    public android.content.Intent a(android.content.Context context, java.lang.Object obj) {
        java.lang.String[] input = (java.lang.String[]) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        android.content.Intent putExtra = new android.content.Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    @Override // h.b
    public h.a b(android.content.Context context, java.lang.Object obj) {
        java.lang.String[] input = (java.lang.String[]) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        boolean z17 = true;
        if (input.length == 0) {
            return new h.a(kz5.q0.f395534d);
        }
        int length = input.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                break;
            }
            if (!(b3.l.m9698x3fed0563(context, input[i17]) == 0)) {
                z17 = false;
                break;
            }
            i17++;
        }
        if (!z17) {
            return null;
        }
        int d17 = kz5.b1.d(input.length);
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        for (java.lang.String str : input) {
            linkedHashMap.put(str, java.lang.Boolean.TRUE);
        }
        return new h.a(linkedHashMap);
    }

    @Override // h.b
    public java.lang.Object c(int i17, android.content.Intent intent) {
        kz5.q0 q0Var = kz5.q0.f395534d;
        if (i17 != -1 || intent == null) {
            return q0Var;
        }
        java.lang.String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return q0Var;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(intArrayExtra.length);
        for (int i18 : intArrayExtra) {
            arrayList.add(java.lang.Boolean.valueOf(i18 == 0));
        }
        return kz5.c1.q(kz5.n0.a1(kz5.z.I(stringArrayExtra), arrayList));
    }
}
