package com.p314xaae8f345.p3118xeeebfacc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0004J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\r\u0010\u0011\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\tR\u0012\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tencent/unit_rc/WeakPtr;", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3, "", "obj", "(Ljava/lang/Object;)V", "strongPtr", "Ljava/lang/Object;", "value", "getValue", "()Ljava/lang/Object;", "weakPtr", "Ljava/lang/ref/WeakReference;", "equals", "", "other", "hashCode", "", "lock", "unit_rc_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: com.tencent.unit_rc.WeakPtr */
/* loaded from: classes11.dex */
public final class C26845xac206036<T> {
    private T strongPtr;
    private java.lang.ref.WeakReference<T> weakPtr;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C26845xac206036() {
        /*
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3118xeeebfacc.C26845xac206036.<init>():void");
    }

    /* renamed from: getValue */
    private final T m106049x754a37bb() {
        T t17 = this.strongPtr;
        if (t17 != null) {
            return t17;
        }
        java.lang.ref.WeakReference<T> weakReference = this.weakPtr;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: equals */
    public boolean m106050xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.p3118xeeebfacc.C26845xac206036.class, other != null ? other.getClass() : null)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(other, "null cannot be cast to non-null type com.tencent.unit_rc.WeakPtr<*>");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m106049x754a37bb(), ((com.p314xaae8f345.p3118xeeebfacc.C26845xac206036) other).m106049x754a37bb());
    }

    /* renamed from: hashCode */
    public int m106051x8cdac1b() {
        T m106049x754a37bb = m106049x754a37bb();
        if (m106049x754a37bb != null) {
            return m106049x754a37bb.hashCode();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: lock */
    public final T m106052x32c52b() {
        T m106049x754a37bb = m106049x754a37bb();
        if (!(m106049x754a37bb instanceof com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190)) {
            return m106049x754a37bb;
        }
        com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190 abstractC26825x3e3f5190 = (com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190) m106049x754a37bb;
        return abstractC26825x3e3f5190.mo105981x7b487764() ? (T) abstractC26825x3e3f5190.m105983x605e7639() : m106049x754a37bb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C26845xac206036(T t17) {
        if (t17 != 0) {
            if (t17 instanceof com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190) {
                com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190 abstractC26825x3e3f5190 = (com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190) t17;
                if (abstractC26825x3e3f5190.mo105981x7b487764()) {
                    this.strongPtr = (T) abstractC26825x3e3f5190.m105984xfbdcb25a();
                    return;
                }
            }
            this.weakPtr = new java.lang.ref.WeakReference<>(t17);
        }
    }

    public /* synthetic */ C26845xac206036(java.lang.Object obj, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? null : obj);
    }
}
