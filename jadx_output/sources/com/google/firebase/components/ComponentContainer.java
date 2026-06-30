package com.google.firebase.components;

/* loaded from: classes13.dex */
public interface ComponentContainer {
    <T> T get(java.lang.Class<T> cls);

    <T> com.google.firebase.inject.Provider<T> getProvider(java.lang.Class<T> cls);
}
