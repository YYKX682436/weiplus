package zp0;

/* loaded from: classes5.dex */
public interface e {
    default java.lang.String a() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", mo174917xfb82e301());
        hashMap.put("param", b());
        nf.f.c(hashMap);
        java.lang.String gVar = new cl0.g(hashMap).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "toString(...)");
        return gVar;
    }

    java.util.Map b();

    /* renamed from: getName */
    java.lang.String mo174917xfb82e301();
}
