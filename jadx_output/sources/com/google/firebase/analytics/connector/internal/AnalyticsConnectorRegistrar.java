package com.google.firebase.analytics.connector.internal;

/* loaded from: classes13.dex */
public class AnalyticsConnectorRegistrar implements com.google.firebase.components.ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<com.google.firebase.components.Component<?>> getComponents() {
        return java.util.Collections.singletonList(com.google.firebase.components.Component.builder(za.a.class).add(com.google.firebase.components.Dependency.required(xa.b.class)).add(com.google.firebase.components.Dependency.required(android.content.Context.class)).factory(ab.a.f2691a).build());
    }
}
