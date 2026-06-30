package com.p176xb6135e39.p271xde6bf207.p275xe5548316;

/* renamed from: com.google.firebase.components.Component */
/* loaded from: classes13.dex */
public final class C2734x24013cdd<T> {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f126170a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f126171b;

    /* renamed from: c, reason: collision with root package name */
    public final int f126172c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p176xb6135e39.p271xde6bf207.p275xe5548316.InterfaceC2737x1eeac96d f126173d;

    /* renamed from: com.google.firebase.components.Component$Builder */
    /* loaded from: classes13.dex */
    public static class Builder<T> {

        /* renamed from: a, reason: collision with root package name */
        public final java.util.Set f126174a;

        /* renamed from: b, reason: collision with root package name */
        public final java.util.Set f126175b;

        /* renamed from: c, reason: collision with root package name */
        public int f126176c;

        /* renamed from: d, reason: collision with root package name */
        public com.p176xb6135e39.p271xde6bf207.p275xe5548316.InterfaceC2737x1eeac96d f126177d;

        public Builder(java.lang.Class cls, java.lang.Class[] clsArr, bb.c cVar) {
            java.util.HashSet hashSet = new java.util.HashSet();
            this.f126174a = hashSet;
            this.f126175b = new java.util.HashSet();
            this.f126176c = 0;
            if (cls == null) {
                throw new java.lang.NullPointerException("Null interface");
            }
            hashSet.add(cls);
            for (java.lang.Class cls2 : clsArr) {
                if (cls2 == null) {
                    throw new java.lang.NullPointerException("Null interface");
                }
            }
            java.util.Collections.addAll(this.f126174a, clsArr);
        }

        public com.p176xb6135e39.p271xde6bf207.p275xe5548316.C2734x24013cdd.Builder<T> add(com.p176xb6135e39.p271xde6bf207.p275xe5548316.C2739x7540af6b c2739x7540af6b) {
            if (c2739x7540af6b == null) {
                throw new java.lang.NullPointerException("Null dependency");
            }
            if (!(!((java.util.HashSet) this.f126174a).contains(c2739x7540af6b.f126178a))) {
                throw new java.lang.IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
            }
            ((java.util.HashSet) this.f126175b).add(c2739x7540af6b);
            return this;
        }

        /* renamed from: alwaysEager */
        public com.p176xb6135e39.p271xde6bf207.p275xe5548316.C2734x24013cdd.Builder<T> m20454x8ace5c69() {
            if (!(this.f126176c == 0)) {
                throw new java.lang.IllegalStateException("Instantiation type has already been set.");
            }
            this.f126176c = 1;
            return this;
        }

        /* renamed from: build */
        public com.p176xb6135e39.p271xde6bf207.p275xe5548316.C2734x24013cdd<T> m20455x59bc66e() {
            if (this.f126177d != null) {
                return new com.p176xb6135e39.p271xde6bf207.p275xe5548316.C2734x24013cdd<>(new java.util.HashSet(this.f126174a), new java.util.HashSet(this.f126175b), this.f126176c, this.f126177d, null);
            }
            throw new java.lang.IllegalStateException("Missing required property: factory.");
        }

        /* renamed from: factory */
        public com.p176xb6135e39.p271xde6bf207.p275xe5548316.C2734x24013cdd.Builder<T> m20456xbeeb310a(com.p176xb6135e39.p271xde6bf207.p275xe5548316.InterfaceC2737x1eeac96d<T> interfaceC2737x1eeac96d) {
            if (interfaceC2737x1eeac96d == null) {
                throw new java.lang.NullPointerException("Null factory");
            }
            this.f126177d = interfaceC2737x1eeac96d;
            return this;
        }
    }

    public C2734x24013cdd(java.util.Set set, java.util.Set set2, int i17, com.p176xb6135e39.p271xde6bf207.p275xe5548316.InterfaceC2737x1eeac96d interfaceC2737x1eeac96d, bb.c cVar) {
        this.f126170a = java.util.Collections.unmodifiableSet(set);
        this.f126171b = java.util.Collections.unmodifiableSet(set2);
        this.f126172c = i17;
        this.f126173d = interfaceC2737x1eeac96d;
    }

    /* renamed from: builder */
    public static <T> com.p176xb6135e39.p271xde6bf207.p275xe5548316.C2734x24013cdd.Builder<T> m20452xdc3ef9b(java.lang.Class<T> cls) {
        return new com.p176xb6135e39.p271xde6bf207.p275xe5548316.C2734x24013cdd.Builder<>(cls, new java.lang.Class[0], null);
    }

    public static <T> com.p176xb6135e39.p271xde6bf207.p275xe5548316.C2734x24013cdd<T> of(java.lang.Class<T> cls, final T t17) {
        return m20452xdc3ef9b(cls).m20456xbeeb310a(new com.p176xb6135e39.p271xde6bf207.p275xe5548316.InterfaceC2737x1eeac96d(t17) { // from class: bb.b

            /* renamed from: a, reason: collision with root package name */
            public final java.lang.Object f100238a;

            {
                this.f100238a = t17;
            }

            @Override // com.p176xb6135e39.p271xde6bf207.p275xe5548316.InterfaceC2737x1eeac96d
            /* renamed from: create */
            public final java.lang.Object mo947xaf65a0fc(com.p176xb6135e39.p271xde6bf207.p275xe5548316.InterfaceC2735x45fc5824 interfaceC2735x45fc5824) {
                return this.f100238a;
            }
        }).m20455x59bc66e();
    }

    /* renamed from: toString */
    public final java.lang.String m20453x9616526c() {
        return "Component<" + java.util.Arrays.toString(this.f126170a.toArray()) + ">{" + this.f126172c + ", deps=" + java.util.Arrays.toString(this.f126171b.toArray()) + "}";
    }
}
