package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2;

/* renamed from: com.google.android.gms.auth.api.signin.GoogleSignIn */
/* loaded from: classes13.dex */
public final class C1678x8a3dbb7b {
    private C1678x8a3dbb7b() {
    }

    /* renamed from: getAccountForExtension */
    public static com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 m17467x416ce10d(android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.InterfaceC1683xbf7cf0dc interfaceC1683xbf7cf0dc) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(context, "please provide a valid Context object");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(interfaceC1683xbf7cf0dc, "please provide valid GoogleSignInOptionsExtension");
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 m17471x4722a4e0 = m17471x4722a4e0(context);
        if (m17471x4722a4e0 == null) {
            m17471x4722a4e0 = com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632.m17480xe1faf9a5();
        }
        return m17471x4722a4e0.m17497x706096c0(zzd(interfaceC1683xbf7cf0dc.m17535x13eb97b1()));
    }

    /* renamed from: getAccountForScopes */
    public static com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 m17468x8a71aa91(android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34 c1762x4c04e34, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34... c1762x4c04e34Arr) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(context, "please provide a valid Context object");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(c1762x4c04e34, "please provide at least one valid scope");
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 m17471x4722a4e0 = m17471x4722a4e0(context);
        if (m17471x4722a4e0 == null) {
            m17471x4722a4e0 = com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632.m17480xe1faf9a5();
        }
        m17471x4722a4e0.m17497x706096c0(c1762x4c04e34);
        m17471x4722a4e0.m17497x706096c0(c1762x4c04e34Arr);
        return m17471x4722a4e0;
    }

    /* renamed from: getClient */
    public static com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1681x38dbd326 m17469x142a16c1(android.app.Activity activity, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3 c1682x64d992a3) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1681x38dbd326(activity, (com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c1682x64d992a3));
    }

    /* renamed from: getLastSignedInAccount */
    public static com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 m17471x4722a4e0(android.content.Context context) {
        return com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzq.zze(context).zzo();
    }

    /* renamed from: getSignedInAccountFromIntent */
    public static com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632> m17472xda912edc(android.content.Intent intent) {
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1684x5216a778 m17566x13f699bb = com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd.zzi.m17566x13f699bb(intent);
        return m17566x13f699bb == null ? com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2442x4cd8b6e.m19613x3867b586(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1898x7a082917.m18078x8098ec3c(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12.f5901x9c108648)) : (!m17566x13f699bb.mo17538x2fe4f2e8().m17855x6e268779() || m17566x13f699bb.m17537xf0fc1455() == null) ? com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2442x4cd8b6e.m19613x3867b586(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1898x7a082917.m18078x8098ec3c(m17566x13f699bb.mo17538x2fe4f2e8())) : com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2442x4cd8b6e.m19614x3e1fc646(m17566x13f699bb.m17537xf0fc1455());
    }

    /* renamed from: hasPermissions */
    public static boolean m17473x3d89458a(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 c1679x69269632, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.InterfaceC1683xbf7cf0dc interfaceC1683xbf7cf0dc) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(interfaceC1683xbf7cf0dc, "Please provide a non-null GoogleSignInOptionsExtension");
        return m17474x3d89458a(c1679x69269632, zzd(interfaceC1683xbf7cf0dc.m17535x13eb97b1()));
    }

    /* renamed from: requestPermissions */
    public static void m17475x637dca75(android.app.Activity activity, int i17, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 c1679x69269632, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.InterfaceC1683xbf7cf0dc interfaceC1683xbf7cf0dc) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(activity, "Please provide a non-null Activity");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(interfaceC1683xbf7cf0dc, "Please provide a non-null GoogleSignInOptionsExtension");
        m17476x637dca75(activity, i17, c1679x69269632, zzd(interfaceC1683xbf7cf0dc.m17535x13eb97b1()));
    }

    private static android.content.Intent zzd(android.app.Activity activity, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 c1679x69269632, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34... c1762x4c04e34Arr) {
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3.Builder builder = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3.Builder();
        if (c1762x4c04e34Arr.length > 0) {
            builder.m17528x52b6040e(c1762x4c04e34Arr[0], c1762x4c04e34Arr);
        }
        if (c1679x69269632 != null && !android.text.TextUtils.isEmpty(c1679x69269632.m17486x745ff1e6())) {
            builder.m17531xa3d95496(c1679x69269632.m17486x745ff1e6());
        }
        return new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1681x38dbd326(activity, builder.m17523x59bc66e()).m17504xc37ac774();
    }

    /* renamed from: getClient */
    public static com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1681x38dbd326 m17470x142a16c1(android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3 c1682x64d992a3) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1681x38dbd326(context, (com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1682x64d992a3) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c1682x64d992a3));
    }

    /* renamed from: hasPermissions */
    public static boolean m17474x3d89458a(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 c1679x69269632, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34... c1762x4c04e34Arr) {
        if (c1679x69269632 == null) {
            return false;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Collections.addAll(hashSet, c1762x4c04e34Arr);
        return c1679x69269632.m17489xeb7af384().containsAll(hashSet);
    }

    /* renamed from: requestPermissions */
    public static void m17477x637dca75(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, int i17, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 c1679x69269632, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.InterfaceC1683xbf7cf0dc interfaceC1683xbf7cf0dc) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(componentCallbacksC1101xa17d4670, "Please provide a non-null Fragment");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(interfaceC1683xbf7cf0dc, "Please provide a non-null GoogleSignInOptionsExtension");
        m17478x637dca75(componentCallbacksC1101xa17d4670, i17, c1679x69269632, zzd(interfaceC1683xbf7cf0dc.m17535x13eb97b1()));
    }

    private static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34[] zzd(java.util.List<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34> list) {
        return list == null ? new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34[0] : (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34[]) list.toArray(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34[list.size()]);
    }

    /* renamed from: requestPermissions */
    public static void m17478x637dca75(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, int i17, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 c1679x69269632, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34... c1762x4c04e34Arr) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(componentCallbacksC1101xa17d4670, "Please provide a non-null Fragment");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(c1762x4c04e34Arr, "Please provide at least one scope");
        componentCallbacksC1101xa17d4670.m7587x5dc77fb5(zzd(componentCallbacksC1101xa17d4670.mo7430x19263085(), c1679x69269632, c1762x4c04e34Arr), i17);
    }

    /* renamed from: requestPermissions */
    public static void m17476x637dca75(android.app.Activity activity, int i17, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.C1679x69269632 c1679x69269632, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1762x4c04e34... c1762x4c04e34Arr) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(activity, "Please provide a non-null Activity");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(c1762x4c04e34Arr, "Please provide at least one scope");
        android.content.Intent zzd = zzd(activity, c1679x69269632, c1762x4c04e34Arr);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(zzd);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/google/android/gms/auth/api/signin/GoogleSignIn", "requestPermissions", "(Landroid/app/Activity;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;[Lcom/google/android/gms/common/api/Scope;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }
}
