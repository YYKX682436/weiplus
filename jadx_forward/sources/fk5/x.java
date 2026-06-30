package fk5;

/* loaded from: classes12.dex */
public final class x implements gy1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f345214a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345215b;

    public x(long j17, java.lang.String str) {
        this.f345214a = j17;
        this.f345215b = str;
    }

    @Override // gy1.d
    public final void a(java.lang.Object obj) {
        java.util.Map map = p3321xbce91901.jvm.p3324x21ffc6bd.m0.h(obj) ? (java.util.Map) obj : null;
        if (map != null) {
            fk5.y.f345216d.a(this.f345214a, map, new fk5.w(this.f345215b));
        }
    }
}
