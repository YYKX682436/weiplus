package cw0;

/* loaded from: classes5.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f304159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f304160e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(java.lang.String str, java.lang.String str2) {
        super(1);
        this.f304159d = str;
        this.f304160e = str2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ex0.q vm6 = (ex0.q) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vm6, "vm");
        java.lang.String roleName = this.f304160e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(roleName, "$roleName");
        java.lang.String roleID = this.f304159d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roleID, "roleID");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951 c4189xeb0c3951 = vm6.f338695q;
        c4189xeb0c3951.getClass();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4189xeb0c3951.D();
        if (D != null) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951.A1(c4189xeb0c3951, roleID, roleName, D);
        }
        return jz5.f0.f384359a;
    }
}
