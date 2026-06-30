package com.google.firebase.iid;

/* loaded from: classes13.dex */
public final class Registrar implements com.google.firebase.components.ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final java.util.List<com.google.firebase.components.Component<?>> getComponents() {
        return java.util.Arrays.asList(com.google.firebase.components.Component.builder(com.google.firebase.iid.FirebaseInstanceId.class).add(com.google.firebase.components.Dependency.required(xa.b.class)).factory(cb.g.f40125a).alwaysEager().build(), com.google.firebase.components.Component.builder(com.google.firebase.iid.internal.FirebaseInstanceIdInternal.class).add(com.google.firebase.components.Dependency.required(com.google.firebase.iid.FirebaseInstanceId.class)).factory(cb.h.f40126a).build());
    }
}
