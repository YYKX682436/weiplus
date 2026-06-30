package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.MutableStateObservable */
/* loaded from: classes14.dex */
public class C0732xed23d0ce<T> extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0755x8c0f8c94<T> {
    private C0732xed23d0ce(java.lang.Object obj, boolean z17) {
        super(obj, z17);
    }

    /* renamed from: withInitialError */
    public static <T> p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0732xed23d0ce<T> m5526xe37a810a(java.lang.Throwable th6) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0732xed23d0ce<>(th6, true);
    }

    /* renamed from: withInitialState */
    public static <T> p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0732xed23d0ce<T> m5527xe4407393(T t17) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0732xed23d0ce<>(t17, false);
    }

    /* renamed from: setError */
    public void m5528x52f092c6(java.lang.Throwable th6) {
        m5667xa3e70a8e(th6);
    }

    /* renamed from: setState */
    public void m5529x53b6854f(T t17) {
        m5666xdd28b148(t17);
    }
}
