package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public abstract class dl<R extends com.tencent.mapsdk.internal.cn.a> implements com.tencent.mapsdk.internal.cn<R> {

    /* renamed from: a, reason: collision with root package name */
    public boolean f49201a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f49202b = true;

    /* renamed from: c, reason: collision with root package name */
    public boolean f49203c = true;

    /* renamed from: d, reason: collision with root package name */
    private volatile R f49204d;

    /* renamed from: e, reason: collision with root package name */
    private java.util.Map<java.lang.String, java.lang.String> f49205e;

    /* renamed from: com.tencent.mapsdk.internal.dl$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f49206a;

        static {
            int[] iArr = new int[com.tencent.map.tools.net.NetMethod.values().length];
            f49206a = iArr;
            try {
                iArr[com.tencent.map.tools.net.NetMethod.GET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f49206a[com.tencent.map.tools.net.NetMethod.POST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        java.lang.String f49207a;

        /* renamed from: b, reason: collision with root package name */
        java.lang.String f49208b;

        /* renamed from: c, reason: collision with root package name */
        java.lang.String f49209c;

        /* renamed from: d, reason: collision with root package name */
        java.lang.String f49210d;

        /* renamed from: e, reason: collision with root package name */
        java.lang.String[] f49211e;

        /* renamed from: f, reason: collision with root package name */
        java.util.HashMap<java.lang.String, java.lang.String> f49212f;

        /* renamed from: g, reason: collision with root package name */
        java.lang.String f49213g;

        /* renamed from: h, reason: collision with root package name */
        java.lang.String f49214h;

        /* renamed from: i, reason: collision with root package name */
        int f49215i;

        /* renamed from: j, reason: collision with root package name */
        boolean f49216j;

        /* renamed from: k, reason: collision with root package name */
        com.tencent.map.tools.net.NetMethod f49217k;

        /* renamed from: l, reason: collision with root package name */
        com.tencent.mapsdk.internal.ed f49218l;

        /* renamed from: m, reason: collision with root package name */
        int[] f49219m;

        private a() {
        }

        public /* synthetic */ a(byte b17) {
            this();
        }

        public final java.lang.String toString() {
            return "RequestEntity{service='" + this.f49207a + "', request='" + this.f49208b + "', method=" + this.f49217k + ", heads=" + this.f49212f + ", authority=" + this.f49210d + ", queryKeys=" + java.util.Arrays.toString(this.f49211e) + ", constQuery='" + this.f49213g + "', useAgent='" + this.f49214h + "', resolver='" + this.f49218l + "', retry=" + this.f49215i + ", useExtraQuery=" + this.f49216j + "\nurl='" + this.f49209c + "'}";
        }
    }

    /* loaded from: classes13.dex */
    public class b implements java.lang.reflect.InvocationHandler {

        /* renamed from: b, reason: collision with root package name */
        private java.lang.Class<? extends com.tencent.mapsdk.internal.dl> f49221b;

        public b(java.lang.Class<? extends com.tencent.mapsdk.internal.dl> cls) {
            this.f49221b = cls;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private com.tencent.mapsdk.internal.dl.a a(java.lang.reflect.Method method) {
            java.lang.String str;
            com.tencent.mapsdk.internal.dl.a aVar = new com.tencent.mapsdk.internal.dl.a(0 == true ? 1 : 0);
            com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetJceResolver netJceResolver = (com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetJceResolver) method.getAnnotation(com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetJceResolver.class);
            com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetFileResolver netFileResolver = (com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetFileResolver) method.getAnnotation(com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetFileResolver.class);
            com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetJsonResolver netJsonResolver = (com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetJsonResolver) method.getAnnotation(com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetJsonResolver.class);
            com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest netRequest = (com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest) method.getAnnotation(com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest.class);
            if (netJceResolver != null) {
                aVar.f49218l = new com.tencent.mapsdk.internal.eb(netJceResolver.inJce(), netJceResolver.outJce());
                aVar.f49219m = netJceResolver.queryRange();
            } else if (netFileResolver != null) {
                aVar.f49218l = new com.tencent.mapsdk.internal.ea(netFileResolver.outFile());
                aVar.f49219m = netFileResolver.queryRange();
            } else if (netJsonResolver != null) {
                aVar.f49218l = new com.tencent.mapsdk.internal.ec(netJsonResolver.outModel());
                aVar.f49219m = netJsonResolver.queryRange();
            }
            if (netRequest != null) {
                aVar.f49207a = this.f49221b.getSimpleName();
                aVar.f49217k = netRequest.method();
                aVar.f49208b = method.getName();
                aVar.f49210d = netRequest.authority();
                aVar.f49214h = netRequest.userAgent();
                aVar.f49211e = netRequest.queryKeys();
                aVar.f49215i = netRequest.retry();
                aVar.f49216j = netRequest.useExtraQuery();
                com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetHead head = netRequest.head();
                java.lang.String[] keys = head.keys();
                java.lang.String[] values = head.values();
                if (keys.length > 0 && keys.length == values.length) {
                    aVar.f49212f = new java.util.HashMap<>();
                    for (int i17 = 0; i17 < keys.length; i17++) {
                        aVar.f49212f.put(keys[i17], values[i17]);
                    }
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                com.tencent.mapsdk.internal.dl dlVar = com.tencent.mapsdk.internal.dl.this;
                java.lang.String str2 = aVar.f49210d;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                if (com.tencent.mapsdk.internal.hr.a(str2)) {
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
                java.lang.String path = netRequest.path();
                if (path.length() != 0) {
                    sb6.append("/");
                    sb6.append(path);
                }
                aVar.f49213g = netRequest.constQuery();
                aVar.f49209c = sb6.toString();
            }
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.reflect.InvocationHandler
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
            java.lang.String str;
            com.tencent.mapsdk.internal.dl.a aVar = new com.tencent.mapsdk.internal.dl.a(0 == true ? 1 : 0);
            com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetJceResolver netJceResolver = (com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetJceResolver) method.getAnnotation(com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetJceResolver.class);
            com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetFileResolver netFileResolver = (com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetFileResolver) method.getAnnotation(com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetFileResolver.class);
            com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetJsonResolver netJsonResolver = (com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetJsonResolver) method.getAnnotation(com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetJsonResolver.class);
            com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest netRequest = (com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest) method.getAnnotation(com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest.class);
            if (netJceResolver != null) {
                aVar.f49218l = new com.tencent.mapsdk.internal.eb(netJceResolver.inJce(), netJceResolver.outJce());
                aVar.f49219m = netJceResolver.queryRange();
            } else if (netFileResolver != null) {
                aVar.f49218l = new com.tencent.mapsdk.internal.ea(netFileResolver.outFile());
                aVar.f49219m = netFileResolver.queryRange();
            } else if (netJsonResolver != null) {
                aVar.f49218l = new com.tencent.mapsdk.internal.ec(netJsonResolver.outModel());
                aVar.f49219m = netJsonResolver.queryRange();
            }
            if (netRequest != null) {
                aVar.f49207a = this.f49221b.getSimpleName();
                aVar.f49217k = netRequest.method();
                aVar.f49208b = method.getName();
                aVar.f49210d = netRequest.authority();
                aVar.f49214h = netRequest.userAgent();
                aVar.f49211e = netRequest.queryKeys();
                aVar.f49215i = netRequest.retry();
                aVar.f49216j = netRequest.useExtraQuery();
                com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetHead head = netRequest.head();
                java.lang.String[] keys = head.keys();
                java.lang.String[] values = head.values();
                if (keys.length > 0 && keys.length == values.length) {
                    aVar.f49212f = new java.util.HashMap<>();
                    for (int i17 = 0; i17 < keys.length; i17++) {
                        aVar.f49212f.put(keys[i17], values[i17]);
                    }
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                com.tencent.mapsdk.internal.dl dlVar = com.tencent.mapsdk.internal.dl.this;
                java.lang.String str2 = aVar.f49210d;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                if (com.tencent.mapsdk.internal.hr.a(str2)) {
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
                java.lang.String path = netRequest.path();
                if (path.length() != 0) {
                    sb6.append("/");
                    sb6.append(path);
                }
                aVar.f49213g = netRequest.constQuery();
                aVar.f49209c = sb6.toString();
            }
            com.tencent.mapsdk.internal.dl dlVar2 = com.tencent.mapsdk.internal.dl.this;
            if (!dlVar2.f49203c) {
                com.tencent.mapsdk.core.utils.log.LogUtil.d(com.tencent.mapsdk.internal.kx.f50207h, "The Service[" + this.f49221b.getSimpleName() + "] is block!!  Please check the ServiceProtocol for corrected, or contact the Tencent MapSdk Office to enable it. ");
                if (aVar.f49217k == com.tencent.map.tools.net.NetMethod.URL) {
                    return "";
                }
                return null;
            }
            if (aVar.f49217k != com.tencent.map.tools.net.NetMethod.URL) {
                com.tencent.mapsdk.internal.ed edVar = aVar.f49218l;
                if (edVar == null) {
                    return dlVar2.a(aVar, objArr);
                }
                return aVar.f49218l.a(com.tencent.mapsdk.internal.dl.this.a(aVar, edVar.a(aVar.f49219m, objArr)));
            }
            java.lang.String str3 = aVar.f49209c;
            java.lang.String b17 = dlVar2.b(aVar, objArr);
            if (b17.length() != 0) {
                str3 = str3 + "?" + b17;
            }
            aVar.f49209c = str3;
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50207h, aVar.toString());
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

    @Override // com.tencent.mapsdk.internal.cn
    public final boolean c() {
        return this.f49202b;
    }

    @Override // com.tencent.mapsdk.internal.cn
    public final boolean d() {
        return this.f49201a;
    }

    @Override // com.tencent.mapsdk.internal.cn
    public final boolean e() {
        return this.f49203c;
    }

    @Override // com.tencent.mapsdk.internal.cn
    public java.lang.String g() {
        return null;
    }

    @Override // com.tencent.mapsdk.internal.cn
    public final java.lang.String h() {
        return null;
    }

    @Override // com.tencent.mapsdk.internal.cn
    public final R i() {
        if (this.f49204d != null) {
            return this.f49204d;
        }
        this.f49204d = l();
        return this.f49204d;
    }

    public final java.lang.String j() {
        return this.f49201a ? g() : f();
    }

    public final java.lang.String k() {
        return this.f49202b ? "https" : "http";
    }

    @Override // com.tencent.mapsdk.internal.cn
    public final void a(java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.Map<java.lang.String, java.lang.String> map2 = this.f49205e;
        if (map2 != null) {
            map2.putAll(map);
        } else {
            this.f49205e = map;
        }
    }

    @Override // com.tencent.mapsdk.internal.cm.a
    public final void b(boolean z17) {
        this.f49201a = z17;
    }

    @Override // com.tencent.mapsdk.internal.cm.a
    public final void c(boolean z17) {
        this.f49202b = z17;
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
        this.f49203c = z17;
    }

    private java.lang.String a(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (com.tencent.mapsdk.internal.hr.a(str)) {
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
        java.lang.String[] strArr = aVar.f49211e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (strArr != null && objArr != null && strArr.length <= objArr.length) {
            for (java.lang.String str : strArr) {
                sb6.append(str);
                sb6.append("=%s&");
            }
        }
        java.lang.String str2 = aVar.f49213g;
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
        if (aVar.f49216j && (map = this.f49205e) != null && !map.isEmpty()) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.f49205e.entrySet()) {
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

    public final com.tencent.map.tools.net.NetResponse a(com.tencent.mapsdk.internal.dl.a aVar, java.lang.Object... objArr) {
        if (aVar == null) {
            return null;
        }
        java.lang.String str = aVar.f49209c;
        try {
            java.lang.String b17 = b(aVar, objArr);
            if (!android.text.TextUtils.isEmpty(b17)) {
                str = str + "?" + b17;
            }
            aVar.f49209c = str;
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50207h, aVar.toString());
            int i17 = com.tencent.mapsdk.internal.dl.AnonymousClass1.f49206a[aVar.f49217k.ordinal()];
            if (i17 == 1) {
                return com.tencent.map.tools.net.NetManager.getInstance().builder().forceHttps(false).userAgent(aVar.f49214h).url(str).retryNum(aVar.f49215i).header(aVar.f49212f).doGet();
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
            return com.tencent.map.tools.net.NetManager.getInstance().builder().userAgent(aVar.f49214h).forceHttps(false).url(str).retryNum(aVar.f49215i).header(aVar.f49212f).postData(bArr).doPost();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private static /* synthetic */ java.lang.String a(com.tencent.mapsdk.internal.dl dlVar, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (com.tencent.mapsdk.internal.hr.a(str)) {
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
