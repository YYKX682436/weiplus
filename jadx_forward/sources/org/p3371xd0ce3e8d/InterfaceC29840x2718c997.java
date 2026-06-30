package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.Predicate */
/* loaded from: classes16.dex */
public interface InterfaceC29840x2718c997<T> {
    default org.p3371xd0ce3e8d.InterfaceC29840x2718c997<T> and(final org.p3371xd0ce3e8d.InterfaceC29840x2718c997<? super T> interfaceC29840x2718c997) {
        return new org.p3371xd0ce3e8d.InterfaceC29840x2718c997<T>() { // from class: org.webrtc.Predicate.2
            @Override // org.p3371xd0ce3e8d.InterfaceC29840x2718c997
            /* renamed from: test */
            public boolean mo155569x364492(T t17) {
                return org.p3371xd0ce3e8d.InterfaceC29840x2718c997.this.mo155569x364492(t17) && interfaceC29840x2718c997.mo155569x364492(t17);
            }
        };
    }

    /* renamed from: negate */
    default org.p3371xd0ce3e8d.InterfaceC29840x2718c997<T> m156212xc174a702() {
        return new org.p3371xd0ce3e8d.InterfaceC29840x2718c997<T>() { // from class: org.webrtc.Predicate.3
            @Override // org.p3371xd0ce3e8d.InterfaceC29840x2718c997
            /* renamed from: test */
            public boolean mo155569x364492(T t17) {
                return !org.p3371xd0ce3e8d.InterfaceC29840x2718c997.this.mo155569x364492(t17);
            }
        };
    }

    default org.p3371xd0ce3e8d.InterfaceC29840x2718c997<T> or(final org.p3371xd0ce3e8d.InterfaceC29840x2718c997<? super T> interfaceC29840x2718c997) {
        return new org.p3371xd0ce3e8d.InterfaceC29840x2718c997<T>() { // from class: org.webrtc.Predicate.1
            @Override // org.p3371xd0ce3e8d.InterfaceC29840x2718c997
            /* renamed from: test */
            public boolean mo155569x364492(T t17) {
                return org.p3371xd0ce3e8d.InterfaceC29840x2718c997.this.mo155569x364492(t17) || interfaceC29840x2718c997.mo155569x364492(t17);
            }
        };
    }

    /* renamed from: test */
    boolean mo155569x364492(T t17);
}
