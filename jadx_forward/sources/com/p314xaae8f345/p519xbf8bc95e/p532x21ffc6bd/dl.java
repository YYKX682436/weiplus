package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public abstract class dl<R extends com.tencent.mapsdk.internal.cn.a> implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cn<R> {

    /* renamed from: a, reason: collision with root package name */
    public boolean f130734a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f130735b = true;

    /* renamed from: c, reason: collision with root package name */
    public boolean f130736c = true;

    /* renamed from: d, reason: collision with root package name */
    private volatile R f130737d;

    /* renamed from: e, reason: collision with root package name */
    private java.util.Map<java.lang.String, java.lang.String> f130738e;

    /* renamed from: com.tencent.mapsdk.internal.dl$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f130739a;

        static {
            int[] iArr = new int[com.p314xaae8f345.map.p511x696c9db.net.EnumC4328xaa2e1cbe.m35949xcee59d22().length];
            f130739a = iArr;
            try {
                iArr[com.p314xaae8f345.map.p511x696c9db.net.EnumC4328xaa2e1cbe.GET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f130739a[com.p314xaae8f345.map.p511x696c9db.net.EnumC4328xaa2e1cbe.POST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        java.lang.String f130740a;

        /* renamed from: b, reason: collision with root package name */
        java.lang.String f130741b;

        /* renamed from: c, reason: collision with root package name */
        java.lang.String f130742c;

        /* renamed from: d, reason: collision with root package name */
        java.lang.String f130743d;

        /* renamed from: e, reason: collision with root package name */
        java.lang.String[] f130744e;

        /* renamed from: f, reason: collision with root package name */
        java.util.HashMap<java.lang.String, java.lang.String> f130745f;

        /* renamed from: g, reason: collision with root package name */
        java.lang.String f130746g;

        /* renamed from: h, reason: collision with root package name */
        java.lang.String f130747h;

        /* renamed from: i, reason: collision with root package name */
        int f130748i;

        /* renamed from: j, reason: collision with root package name */
        boolean f130749j;

        /* renamed from: k, reason: collision with root package name */
        com.p314xaae8f345.map.p511x696c9db.net.EnumC4328xaa2e1cbe f130750k;

        /* renamed from: l, reason: collision with root package name */
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ed f130751l;

        /* renamed from: m, reason: collision with root package name */
        int[] f130752m;

        private a() {
        }

        public /* synthetic */ a(byte b17) {
            this();
        }

        /* renamed from: toString */
        public final java.lang.String m36703x9616526c() {
            return "RequestEntity{service='" + this.f130740a + "', request='" + this.f130741b + "', method=" + this.f130750k + ", heads=" + this.f130745f + ", authority=" + this.f130743d + ", queryKeys=" + java.util.Arrays.toString(this.f130744e) + ", constQuery='" + this.f130746g + "', useAgent='" + this.f130747h + "', resolver='" + this.f130751l + "', retry=" + this.f130748i + ", useExtraQuery=" + this.f130749j + "\nurl='" + this.f130742c + "'}";
        }
    }

    /* loaded from: classes13.dex */
    public class b implements java.lang.reflect.InvocationHandler {

        /* renamed from: b, reason: collision with root package name */
        private java.lang.Class<? extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dl> f130754b;

        public b(java.lang.Class<? extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dl> cls) {
            this.f130754b = cls;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private com.tencent.mapsdk.internal.dl.a a(java.lang.reflect.Method method) {
            java.lang.String str;
            com.tencent.mapsdk.internal.dl.a aVar = new com.tencent.mapsdk.internal.dl.a(0 == true ? 1 : 0);
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.p526x7643c6b5.net.p527xa34feb2f.InterfaceC4380x58c844b5 interfaceC4380x58c844b5 = (com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.p526x7643c6b5.net.p527xa34feb2f.InterfaceC4380x58c844b5) method.getAnnotation(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.p526x7643c6b5.net.p527xa34feb2f.InterfaceC4380x58c844b5.class);
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.p526x7643c6b5.net.p527xa34feb2f.InterfaceC4378x3a980bbf interfaceC4378x3a980bbf = (com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.p526x7643c6b5.net.p527xa34feb2f.InterfaceC4378x3a980bbf) method.getAnnotation(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.p526x7643c6b5.net.p527xa34feb2f.InterfaceC4378x3a980bbf.class);
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.p526x7643c6b5.net.p527xa34feb2f.InterfaceC4381x3d91d72b interfaceC4381x3d91d72b = (com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.p526x7643c6b5.net.p527xa34feb2f.InterfaceC4381x3d91d72b) method.getAnnotation(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.p526x7643c6b5.net.p527xa34feb2f.InterfaceC4381x3d91d72b.class);
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.p526x7643c6b5.net.p527xa34feb2f.InterfaceC4382xa3f02252 interfaceC4382xa3f02252 = (com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.p526x7643c6b5.net.p527xa34feb2f.InterfaceC4382xa3f02252) method.getAnnotation(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.p526x7643c6b5.net.p527xa34feb2f.InterfaceC4382xa3f02252.class);
            if (interfaceC4380x58c844b5 != null) {
                aVar.f130751l = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eb(interfaceC4380x58c844b5.m36121x5fac6e7(), interfaceC4380x58c844b5.m36122xc410881e());
                aVar.f130752m = interfaceC4380x58c844b5.m36123xf53a6d55();
            } else if (interfaceC4378x3a980bbf != null) {
                aVar.f130751l = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ea(interfaceC4378x3a980bbf.m36117xbdfec1ea());
                aVar.f130752m = interfaceC4378x3a980bbf.m36118xf53a6d55();
            } else if (interfaceC4381x3d91d72b != null) {
                aVar.f130751l = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ec(interfaceC4381x3d91d72b.m36124x23ebc7b());
                aVar.f130752m = interfaceC4381x3d91d72b.m36125xf53a6d55();
            }
            if (interfaceC4382xa3f02252 != null) {
                aVar.f130740a = this.f130754b.getSimpleName();
                aVar.f130750k = interfaceC4382xa3f02252.m36129xbfc5d0e1();
                aVar.f130741b = method.getName();
                aVar.f130743d = interfaceC4382xa3f02252.m36126x57f40743();
                aVar.f130747h = interfaceC4382xa3f02252.m36134x12900dfa();
                aVar.f130744e = interfaceC4382xa3f02252.m36131x944916dc();
                aVar.f130748i = interfaceC4382xa3f02252.m36132x67622a8();
                aVar.f130749j = interfaceC4382xa3f02252.m36133xd78a437f();
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.p526x7643c6b5.net.p527xa34feb2f.InterfaceC4379xd1046cfd m36128x30cde0 = interfaceC4382xa3f02252.m36128x30cde0();
                java.lang.String[] m36119x322df4 = m36128x30cde0.m36119x322df4();
                java.lang.String[] m36120xcee59d22 = m36128x30cde0.m36120xcee59d22();
                if (m36119x322df4.length > 0 && m36119x322df4.length == m36120xcee59d22.length) {
                    aVar.f130745f = new java.util.HashMap<>();
                    for (int i17 = 0; i17 < m36119x322df4.length; i17++) {
                        aVar.f130745f.put(m36119x322df4[i17], m36120xcee59d22[i17]);
                    }
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dl dlVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dl.this;
                java.lang.String str2 = aVar.f130743d;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(str2)) {
                    str2 = dlVar.j();
                }
                if (android.text.TextUtils.isEmpty(str2)) {
                    str = null;
                } else {
                    java.lang.String k17 = dlVar.k();
                    if (!android.text.TextUtils.isEmpty(k17)) {
                        sb7.append(k17);
                        sb7.append("://");
                    }
                    sb7.append(str2);
                    str = sb7.toString();
                }
                if (!android.text.TextUtils.isEmpty(str)) {
                    sb6.append(str);
                }
                java.lang.String m36130x346425 = interfaceC4382xa3f02252.m36130x346425();
                if (m36130x346425.length() != 0) {
                    sb6.append("/");
                    sb6.append(m36130x346425);
                }
                aVar.f130746g = interfaceC4382xa3f02252.m36127xf2df1725();
                aVar.f130742c = sb6.toString();
            }
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.reflect.InvocationHandler
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
            java.lang.String str;
            com.tencent.mapsdk.internal.dl.a aVar = new com.tencent.mapsdk.internal.dl.a(0 == true ? 1 : 0);
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.p526x7643c6b5.net.p527xa34feb2f.InterfaceC4380x58c844b5 interfaceC4380x58c844b5 = (com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.p526x7643c6b5.net.p527xa34feb2f.InterfaceC4380x58c844b5) method.getAnnotation(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.p526x7643c6b5.net.p527xa34feb2f.InterfaceC4380x58c844b5.class);
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.p526x7643c6b5.net.p527xa34feb2f.InterfaceC4378x3a980bbf interfaceC4378x3a980bbf = (com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.p526x7643c6b5.net.p527xa34feb2f.InterfaceC4378x3a980bbf) method.getAnnotation(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.p526x7643c6b5.net.p527xa34feb2f.InterfaceC4378x3a980bbf.class);
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.p526x7643c6b5.net.p527xa34feb2f.InterfaceC4381x3d91d72b interfaceC4381x3d91d72b = (com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.p526x7643c6b5.net.p527xa34feb2f.InterfaceC4381x3d91d72b) method.getAnnotation(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.p526x7643c6b5.net.p527xa34feb2f.InterfaceC4381x3d91d72b.class);
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.p526x7643c6b5.net.p527xa34feb2f.InterfaceC4382xa3f02252 interfaceC4382xa3f02252 = (com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.p526x7643c6b5.net.p527xa34feb2f.InterfaceC4382xa3f02252) method.getAnnotation(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.p526x7643c6b5.net.p527xa34feb2f.InterfaceC4382xa3f02252.class);
            if (interfaceC4380x58c844b5 != null) {
                aVar.f130751l = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.eb(interfaceC4380x58c844b5.m36121x5fac6e7(), interfaceC4380x58c844b5.m36122xc410881e());
                aVar.f130752m = interfaceC4380x58c844b5.m36123xf53a6d55();
            } else if (interfaceC4378x3a980bbf != null) {
                aVar.f130751l = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ea(interfaceC4378x3a980bbf.m36117xbdfec1ea());
                aVar.f130752m = interfaceC4378x3a980bbf.m36118xf53a6d55();
            } else if (interfaceC4381x3d91d72b != null) {
                aVar.f130751l = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ec(interfaceC4381x3d91d72b.m36124x23ebc7b());
                aVar.f130752m = interfaceC4381x3d91d72b.m36125xf53a6d55();
            }
            if (interfaceC4382xa3f02252 != null) {
                aVar.f130740a = this.f130754b.getSimpleName();
                aVar.f130750k = interfaceC4382xa3f02252.m36129xbfc5d0e1();
                aVar.f130741b = method.getName();
                aVar.f130743d = interfaceC4382xa3f02252.m36126x57f40743();
                aVar.f130747h = interfaceC4382xa3f02252.m36134x12900dfa();
                aVar.f130744e = interfaceC4382xa3f02252.m36131x944916dc();
                aVar.f130748i = interfaceC4382xa3f02252.m36132x67622a8();
                aVar.f130749j = interfaceC4382xa3f02252.m36133xd78a437f();
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.p526x7643c6b5.net.p527xa34feb2f.InterfaceC4379xd1046cfd m36128x30cde0 = interfaceC4382xa3f02252.m36128x30cde0();
                java.lang.String[] m36119x322df4 = m36128x30cde0.m36119x322df4();
                java.lang.String[] m36120xcee59d22 = m36128x30cde0.m36120xcee59d22();
                if (m36119x322df4.length > 0 && m36119x322df4.length == m36120xcee59d22.length) {
                    aVar.f130745f = new java.util.HashMap<>();
                    for (int i17 = 0; i17 < m36119x322df4.length; i17++) {
                        aVar.f130745f.put(m36119x322df4[i17], m36120xcee59d22[i17]);
                    }
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dl dlVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dl.this;
                java.lang.String str2 = aVar.f130743d;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(str2)) {
                    str2 = dlVar.j();
                }
                if (android.text.TextUtils.isEmpty(str2)) {
                    str = null;
                } else {
                    java.lang.String k17 = dlVar.k();
                    if (!android.text.TextUtils.isEmpty(k17)) {
                        sb7.append(k17);
                        sb7.append("://");
                    }
                    sb7.append(str2);
                    str = sb7.toString();
                }
                if (!android.text.TextUtils.isEmpty(str)) {
                    sb6.append(str);
                }
                java.lang.String m36130x346425 = interfaceC4382xa3f02252.m36130x346425();
                if (m36130x346425.length() != 0) {
                    sb6.append("/");
                    sb6.append(m36130x346425);
                }
                aVar.f130746g = interfaceC4382xa3f02252.m36127xf2df1725();
                aVar.f130742c = sb6.toString();
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dl dlVar2 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dl.this;
            if (!dlVar2.f130736c) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131740h, "The Service[" + this.f130754b.getSimpleName() + "] is block!!  Please check the ServiceProtocol for corrected, or contact the Tencent MapSdk Office to enable it. ");
                if (aVar.f130750k == com.p314xaae8f345.map.p511x696c9db.net.EnumC4328xaa2e1cbe.URL) {
                    return "";
                }
                return null;
            }
            if (aVar.f130750k != com.p314xaae8f345.map.p511x696c9db.net.EnumC4328xaa2e1cbe.URL) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ed edVar = aVar.f130751l;
                if (edVar == null) {
                    return dlVar2.a(aVar, objArr);
                }
                return aVar.f130751l.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dl.this.a(aVar, edVar.a(aVar.f130752m, objArr)));
            }
            java.lang.String str3 = aVar.f130742c;
            java.lang.String b17 = dlVar2.b(aVar, objArr);
            if (b17.length() != 0) {
                str3 = str3 + "?" + b17;
            }
            aVar.f130742c = str3;
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131740h, aVar.m36703x9616526c());
            return str3;
        }
    }

    private R l() {
        java.lang.reflect.Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof java.lang.reflect.ParameterizedType) {
            java.lang.reflect.Type[] actualTypeArguments = ((java.lang.reflect.ParameterizedType) genericSuperclass).getActualTypeArguments();
            if (actualTypeArguments.length > 0) {
                java.lang.reflect.Type type = actualTypeArguments[0];
                if (type instanceof java.lang.Class) {
                    java.lang.Class<?> cls = (java.lang.Class) type;
                    java.lang.ClassLoader classLoader = cls.getClassLoader();
                    java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                    if (cls.isInterface()) {
                        clsArr[0] = cls;
                    } else {
                        clsArr = cls.getInterfaces();
                    }
                    return (R) java.lang.reflect.Proxy.newProxyInstance(classLoader, clsArr, new com.tencent.mapsdk.internal.dl.b(getClass()));
                }
            }
        }
        return null;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cn
    public final boolean c() {
        return this.f130735b;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cn
    public final boolean d() {
        return this.f130734a;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cn
    public final boolean e() {
        return this.f130736c;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cn
    public java.lang.String g() {
        return null;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cn
    public final java.lang.String h() {
        return null;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cn
    public final R i() {
        if (this.f130737d != null) {
            return this.f130737d;
        }
        this.f130737d = l();
        return this.f130737d;
    }

    public final java.lang.String j() {
        return this.f130734a ? g() : f();
    }

    public final java.lang.String k() {
        return this.f130735b ? "https" : "http";
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cn
    public final void a(java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.Map<java.lang.String, java.lang.String> map2 = this.f130738e;
        if (map2 != null) {
            map2.putAll(map);
        } else {
            this.f130738e = map;
        }
    }

    @Override // com.tencent.mapsdk.internal.cm.a
    public final void b(boolean z17) {
        this.f130734a = z17;
    }

    @Override // com.tencent.mapsdk.internal.cm.a
    public final void c(boolean z17) {
        this.f130735b = z17;
    }

    private java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String j17 = j();
        if (android.text.TextUtils.isEmpty(j17)) {
            return null;
        }
        java.lang.String k17 = k();
        if (!android.text.TextUtils.isEmpty(k17)) {
            sb6.append(k17);
            sb6.append("://");
        }
        sb6.append(j17);
        return sb6.toString();
    }

    @Override // com.tencent.mapsdk.internal.cm.a
    public final void a(boolean z17) {
        this.f130736c = z17;
    }

    private java.lang.String a(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(str)) {
            str = j();
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.lang.String k17 = k();
        if (!android.text.TextUtils.isEmpty(k17)) {
            sb6.append(k17);
            sb6.append("://");
        }
        sb6.append(str);
        return sb6.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String b(com.tencent.mapsdk.internal.dl.a aVar, java.lang.Object... objArr) {
        java.util.Map<java.lang.String, java.lang.String> map;
        java.lang.String[] strArr = aVar.f130744e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (strArr != null && objArr != null && strArr.length <= objArr.length) {
            for (java.lang.String str : strArr) {
                sb6.append(str);
                sb6.append("=%s&");
            }
        }
        java.lang.String str2 = aVar.f130746g;
        if (!android.text.TextUtils.isEmpty(str2)) {
            for (java.lang.String str3 : str2.split("&")) {
                java.lang.String[] split = str3.split("=");
                if (split.length == 2) {
                    sb6.append(split[0]);
                    sb6.append("=");
                    sb6.append(split[1]);
                    sb6.append("&");
                }
            }
        }
        if (aVar.f130749j && (map = this.f130738e) != null && !map.isEmpty()) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.f130738e.entrySet()) {
                sb6.append(entry.getKey());
                sb6.append("=");
                sb6.append(entry.getValue());
                sb6.append("&");
            }
        }
        int lastIndexOf = sb6.lastIndexOf("&");
        if (lastIndexOf >= 0 && lastIndexOf == sb6.length() - 1) {
            sb6.deleteCharAt(lastIndexOf);
        }
        return java.lang.String.format(sb6.toString(), objArr);
    }

    public final com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde a(com.tencent.mapsdk.internal.dl.a aVar, java.lang.Object... objArr) {
        if (aVar == null) {
            return null;
        }
        java.lang.String str = aVar.f130742c;
        try {
            java.lang.String b17 = b(aVar, objArr);
            if (!android.text.TextUtils.isEmpty(b17)) {
                str = str + "?" + b17;
            }
            aVar.f130742c = str;
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131740h, aVar.m36703x9616526c());
            int i17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dl.AnonymousClass1.f130739a[aVar.f130750k.ordinal()];
            if (i17 == 1) {
                return com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70.m35928x9cf0d20b().m35934xdc3ef9b().m36001x6c4a8c0(false).m36016x12900dfa(aVar.f130747h).url(str).m36010xed8c2fbe(aVar.f130748i).m36005xb734e28d(aVar.f130745f).m35995x5b4bacb();
            }
            if (i17 != 2) {
                return null;
            }
            byte[] bArr = new byte[0];
            if (objArr.length > 0) {
                int length = objArr.length;
                int i18 = 0;
                while (true) {
                    if (i18 >= length) {
                        break;
                    }
                    java.lang.Object obj = objArr[i18];
                    if (obj instanceof byte[]) {
                        bArr = (byte[]) obj;
                        break;
                    }
                    i18++;
                }
            }
            return com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70.m35928x9cf0d20b().m35934xdc3ef9b().m36016x12900dfa(aVar.f130747h).m36001x6c4a8c0(false).url(str).m36010xed8c2fbe(aVar.f130748i).m36005xb734e28d(aVar.f130745f).m36007x2d17ac6a(bArr).m35996xb0e6dbcb();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private static /* synthetic */ java.lang.String a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dl dlVar, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(str)) {
            str = dlVar.j();
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.lang.String k17 = dlVar.k();
        if (!android.text.TextUtils.isEmpty(k17)) {
            sb6.append(k17);
            sb6.append("://");
        }
        sb6.append(str);
        return sb6.toString();
    }
}
