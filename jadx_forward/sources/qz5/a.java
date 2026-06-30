package qz5;

/* loaded from: classes14.dex */
public abstract class a implements p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57, qz5.e, java.io.Serializable {

    /* renamed from: completion */
    private final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<java.lang.Object> f76487xdfbde3dc;

    public a(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f76487xdfbde3dc = interfaceC29045xdcb5ca57;
    }

    /* renamed from: create */
    public p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<jz5.f0> mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<?> completion) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completion, "completion");
        throw new java.lang.UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // qz5.e
    /* renamed from: getCallerFrame */
    public qz5.e mo144028x366976c() {
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<java.lang.Object> interfaceC29045xdcb5ca57 = this.f76487xdfbde3dc;
        if (interfaceC29045xdcb5ca57 instanceof qz5.e) {
            return (qz5.e) interfaceC29045xdcb5ca57;
        }
        return null;
    }

    /* renamed from: getCompletion */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<java.lang.Object> m161160xcdfe9bd2() {
        return this.f76487xdfbde3dc;
    }

    /* renamed from: getStackTraceElement */
    public java.lang.StackTraceElement mo161161x91a6cfe9() {
        int i17;
        java.lang.String str;
        qz5.f fVar = (qz5.f) getClass().getAnnotation(qz5.f.class);
        java.lang.String str2 = null;
        if (fVar == null) {
            return null;
        }
        int v17 = fVar.v();
        if (v17 > 1) {
            throw new java.lang.IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v17 + ". Please update the Kotlin standard library.").toString());
        }
        try {
            java.lang.reflect.Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(this);
            java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
            i17 = (num != null ? num.intValue() : 0) - 1;
        } catch (java.lang.Exception unused) {
            i17 = -1;
        }
        int i18 = i17 >= 0 ? fVar.l()[i17] : -1;
        qz5.h hVar = qz5.i.f449476b;
        qz5.h hVar2 = qz5.i.f449475a;
        if (hVar == null) {
            try {
                qz5.h hVar3 = new qz5.h(java.lang.Class.class.getDeclaredMethod("getModule", new java.lang.Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new java.lang.Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, new java.lang.Class[0]));
                qz5.i.f449476b = hVar3;
                hVar = hVar3;
            } catch (java.lang.Exception unused2) {
                qz5.i.f449476b = hVar2;
                hVar = hVar2;
            }
        }
        if (hVar != hVar2) {
            java.lang.reflect.Method method = hVar.f449472a;
            java.lang.Object invoke = method != null ? method.invoke(getClass(), new java.lang.Object[0]) : null;
            if (invoke != null) {
                java.lang.reflect.Method method2 = hVar.f449473b;
                java.lang.Object invoke2 = method2 != null ? method2.invoke(invoke, new java.lang.Object[0]) : null;
                if (invoke2 != null) {
                    java.lang.reflect.Method method3 = hVar.f449474c;
                    java.lang.Object invoke3 = method3 != null ? method3.invoke(invoke2, new java.lang.Object[0]) : null;
                    if (invoke3 instanceof java.lang.String) {
                        str2 = (java.lang.String) invoke3;
                    }
                }
            }
        }
        if (str2 == null) {
            str = fVar.c();
        } else {
            str = str2 + '/' + fVar.c();
        }
        return new java.lang.StackTraceElement(str, fVar.m(), fVar.f(), i18);
    }

    /* renamed from: invokeSuspend */
    public abstract java.lang.Object mo150x989b7ca4(java.lang.Object obj);

    /* renamed from: releaseIntercepted */
    public void mo161162x90ea0a5a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57
    /* renamed from: resumeWith */
    public final void mo48700xdecd0e93(java.lang.Object obj) {
        java.lang.Object mo150x989b7ca4;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this;
        while (true) {
            qz5.a aVar = (qz5.a) interfaceC29045xdcb5ca57;
            p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca572 = aVar.f76487xdfbde3dc;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(interfaceC29045xdcb5ca572);
            try {
                mo150x989b7ca4 = aVar.mo150x989b7ca4(obj);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                obj = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            if (mo150x989b7ca4 == pz5.a.f440719d) {
                return;
            }
            obj = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(mo150x989b7ca4);
            aVar.mo161162x90ea0a5a();
            if (!(interfaceC29045xdcb5ca572 instanceof qz5.a)) {
                interfaceC29045xdcb5ca572.mo48700xdecd0e93(obj);
                return;
            }
            interfaceC29045xdcb5ca57 = interfaceC29045xdcb5ca572;
        }
    }

    /* renamed from: toString */
    public java.lang.String mo161163x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Continuation at ");
        java.lang.Object mo161161x91a6cfe9 = mo161161x91a6cfe9();
        if (mo161161x91a6cfe9 == null) {
            mo161161x91a6cfe9 = getClass().getName();
        }
        sb6.append(mo161161x91a6cfe9);
        return sb6.toString();
    }

    /* renamed from: create */
    public p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<jz5.f0> mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<?> completion) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completion, "completion");
        throw new java.lang.UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
