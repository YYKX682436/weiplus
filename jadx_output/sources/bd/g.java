package bd;

/* loaded from: classes15.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f19208a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f19209b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Class f19210c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f19211d;

    public g(java.lang.String str, java.lang.Class cls) {
        this.f19211d = str;
        this.f19210c = cls;
        for (java.lang.reflect.Method method : cls.getMethods()) {
            java.lang.annotation.Annotation annotation = method.getAnnotation(bd.c.class);
            if (annotation != null) {
                bd.c cVar = (bd.c) annotation;
                bd.f fVar = new bd.f(this);
                fVar.f19203a = method;
                if (cVar.returnType() != null && cVar.returnType() != bd.k.class) {
                    fVar.f19207e = cVar.returnType();
                }
                if (cVar.uiThread()) {
                    if (cVar.isReturnBuffer()) {
                        fVar.f19204b = java.lang.Boolean.TRUE;
                    } else {
                        fVar.f19204b = java.lang.Boolean.FALSE;
                    }
                    this.f19209b.put(method.getName(), fVar);
                } else {
                    this.f19208a.put(method.getName(), fVar);
                }
            }
        }
    }
}
