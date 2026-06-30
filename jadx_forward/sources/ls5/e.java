package ls5;

/* loaded from: classes10.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls5.f f402662d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f402663e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ls5.f fVar, java.lang.Throwable th6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f402662d = fVar;
        this.f402663e = th6;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ls5.e(this.f402662d, this.f402663e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ls5.e eVar = (ls5.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        eVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.String stackTraceString = android.util.Log.getStackTraceString(this.f402663e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stackTraceString, "getStackTraceString(...)");
        ls5.f fVar = this.f402662d;
        fVar.getClass();
        fVar.f402665b = stackTraceString;
        java.lang.String str2 = fVar.f402665b;
        fVar.getClass();
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-1");
            java.nio.charset.Charset forName = java.nio.charset.Charset.forName("iso-8859-1");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(forName, "forName(...)");
            byte[] bytes = str2.getBytes(forName);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            messageDigest.update(bytes, 0, str2.length());
            byte[] digest = messageDigest.digest();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(digest, "digest(...)");
            str = fVar.a(digest);
        } catch (java.lang.Throwable unused) {
            str = "";
        }
        fVar.getClass();
        fVar.f402667d = str;
        return jz5.f0.f384359a;
    }
}
