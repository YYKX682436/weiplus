package bd;

/* loaded from: classes15.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f100741a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f100742b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Class f100743c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f100744d;

    public g(java.lang.String str, java.lang.Class cls) {
        this.f100744d = str;
        this.f100743c = cls;
        for (java.lang.reflect.Method method : cls.getMethods()) {
            java.lang.annotation.Annotation annotation = method.getAnnotation(bd.c.class);
            if (annotation != null) {
                bd.c cVar = (bd.c) annotation;
                bd.f fVar = new bd.f(this);
                fVar.f100736a = method;
                if (cVar.m10164x4fb4288a() != null && cVar.m10164x4fb4288a() != bd.k.class) {
                    fVar.f100740e = cVar.m10164x4fb4288a();
                }
                if (cVar.m10165xc19dc9be()) {
                    if (cVar.m10163xe6f70bda()) {
                        fVar.f100737b = java.lang.Boolean.TRUE;
                    } else {
                        fVar.f100737b = java.lang.Boolean.FALSE;
                    }
                    this.f100742b.put(method.getName(), fVar);
                } else {
                    this.f100741a.put(method.getName(), fVar);
                }
            }
        }
    }
}
