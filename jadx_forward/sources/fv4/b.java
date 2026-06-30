package fv4;

/* loaded from: classes8.dex */
public final class b implements java.lang.reflect.InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fv4.f f348517a;

    public b(fv4.f fVar) {
        this.f348517a = fVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        fv4.f fVar = this.f348517a;
        int i17 = 0;
        if (objArr != null) {
            try {
                if (!(objArr.length == 0)) {
                    java.lang.Object obj2 = fVar.f348525e;
                    if (obj2 == null) {
                        return null;
                    }
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(method != null ? method.getName() : null, "resize")) {
                        if (method != null) {
                            return method.invoke(obj2, java.util.Arrays.copyOf(objArr, objArr.length));
                        }
                        return null;
                    }
                    java.lang.Object obj3 = objArr[0];
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type kotlin.Int");
                    int intValue = ((java.lang.Integer) obj3).intValue();
                    java.lang.Object obj4 = objArr[1];
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj4, "null cannot be cast to non-null type kotlin.Int");
                    fv4.f.k(fVar, obj2, intValue, ((java.lang.Integer) obj4).intValue());
                    return null;
                }
            } catch (java.lang.Exception e17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hook func: ");
                sb6.append(method != null ? method.getName() : null);
                sb6.append(", exception: ");
                sb6.append(e17);
                java.lang.String content = sb6.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", content);
                return null;
            }
        }
        java.lang.Object obj5 = fVar.f348525e;
        if (obj5 == null) {
            return null;
        }
        java.lang.String name = method != null ? method.getName() : null;
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -816371593) {
                if (hashCode != 474985501) {
                    if (hashCode == 1654664470 && name.equals("scheduleFrame")) {
                        fv4.f.l(fVar, obj5);
                        return null;
                    }
                } else if (name.equals("getHeight")) {
                    if (fVar.f348532l || fVar.f348531k <= 0) {
                        if (fVar.f348533m) {
                            fVar.f348533m = false;
                            fVar.o();
                        }
                        fVar.f348532l = false;
                        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf interfaceC28721xe81de0bf = obj5 instanceof io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf ? (io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf) obj5 : null;
                        if (interfaceC28721xe81de0bf != null) {
                            i17 = interfaceC28721xe81de0bf.mo53762x1c4fb41d();
                        }
                    }
                    return java.lang.Integer.valueOf(i17);
                }
            } else if (name.equals("getSurface")) {
                return fv4.f.j(fVar, obj5);
            }
        }
        if (method != null) {
            return method.invoke(obj5, new java.lang.Object[0]);
        }
        return null;
    }
}
