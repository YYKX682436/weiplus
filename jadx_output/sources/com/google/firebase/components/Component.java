package com.google.firebase.components;

/* loaded from: classes13.dex */
public final class Component<T> {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f44637a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f44638b;

    /* renamed from: c, reason: collision with root package name */
    public final int f44639c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.firebase.components.ComponentFactory f44640d;

    /* loaded from: classes13.dex */
    public static class Builder<T> {

        /* renamed from: a, reason: collision with root package name */
        public final java.util.Set f44641a;

        /* renamed from: b, reason: collision with root package name */
        public final java.util.Set f44642b;

        /* renamed from: c, reason: collision with root package name */
        public int f44643c;

        /* renamed from: d, reason: collision with root package name */
        public com.google.firebase.components.ComponentFactory f44644d;

        public Builder(java.lang.Class cls, java.lang.Class[] clsArr, bb.c cVar) {
            java.util.HashSet hashSet = new java.util.HashSet();
            this.f44641a = hashSet;
            this.f44642b = new java.util.HashSet();
            this.f44643c = 0;
            if (cls == null) {
                throw new java.lang.NullPointerException("Null interface");
            }
            hashSet.add(cls);
            for (java.lang.Class cls2 : clsArr) {
                if (cls2 == null) {
                    throw new java.lang.NullPointerException("Null interface");
                }
            }
            java.util.Collections.addAll(this.f44641a, clsArr);
        }

        public com.google.firebase.components.Component.Builder<T> add(com.google.firebase.components.Dependency dependency) {
            if (dependency == null) {
                throw new java.lang.NullPointerException("Null dependency");
            }
            if (!(!((java.util.HashSet) this.f44641a).contains(dependency.f44645a))) {
                throw new java.lang.IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
            }
            ((java.util.HashSet) this.f44642b).add(dependency);
            return this;
        }

        public com.google.firebase.components.Component.Builder<T> alwaysEager() {
            if (!(this.f44643c == 0)) {
                throw new java.lang.IllegalStateException("Instantiation type has already been set.");
            }
            this.f44643c = 1;
            return this;
        }

        public com.google.firebase.components.Component<T> build() {
            if (this.f44644d != null) {
                return new com.google.firebase.components.Component<>(new java.util.HashSet(this.f44641a), new java.util.HashSet(this.f44642b), this.f44643c, this.f44644d, null);
            }
            throw new java.lang.IllegalStateException("Missing required property: factory.");
        }

        public com.google.firebase.components.Component.Builder<T> factory(com.google.firebase.components.ComponentFactory<T> componentFactory) {
            if (componentFactory == null) {
                throw new java.lang.NullPointerException("Null factory");
            }
            this.f44644d = componentFactory;
            return this;
        }
    }

    public Component(java.util.Set set, java.util.Set set2, int i17, com.google.firebase.components.ComponentFactory componentFactory, bb.c cVar) {
        this.f44637a = java.util.Collections.unmodifiableSet(set);
        this.f44638b = java.util.Collections.unmodifiableSet(set2);
        this.f44639c = i17;
        this.f44640d = componentFactory;
    }

    public static <T> com.google.firebase.components.Component.Builder<T> builder(java.lang.Class<T> cls) {
        return new com.google.firebase.components.Component.Builder<>(cls, new java.lang.Class[0], null);
    }

    public static <T> com.google.firebase.components.Component<T> of(java.lang.Class<T> cls, final T t17) {
        return builder(cls).factory(new com.google.firebase.components.ComponentFactory(t17) { // from class: bb.b

            /* renamed from: a, reason: collision with root package name */
            public final java.lang.Object f18705a;

            {
                this.f18705a = t17;
            }

            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                return this.f18705a;
            }
        }).build();
    }

    public final java.lang.String toString() {
        return "Component<" + java.util.Arrays.toString(this.f44637a.toArray()) + ">{" + this.f44639c + ", deps=" + java.util.Arrays.toString(this.f44638b.toArray()) + "}";
    }
}
