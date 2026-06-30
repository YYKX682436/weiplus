package p3321xbce91901.jvm.p3324x21ffc6bd;

/* loaded from: classes16.dex */
public abstract class e implements f06.c, java.io.Serializable {

    /* renamed from: NO_RECEIVER */
    public static final java.lang.Object f72681xc42f6aad = p3321xbce91901.jvm.p3324x21ffc6bd.d.f391646d;

    /* renamed from: isTopLevel */
    private final boolean f72682x96111e79;

    /* renamed from: name */
    private final java.lang.String f72683x337a8b;

    /* renamed from: owner */
    private final java.lang.Class f72684x653f2b3;

    /* renamed from: receiver */
    protected final java.lang.Object f72685xcfcbe9ef;

    /* renamed from: reflected */
    private transient f06.c f72686xd415281c;

    /* renamed from: signature */
    private final java.lang.String f72687x3ffd98b8;

    public e(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, boolean z17) {
        this.f72685xcfcbe9ef = obj;
        this.f72684x653f2b3 = cls;
        this.f72683x337a8b = str;
        this.f72687x3ffd98b8 = str2;
        this.f72682x96111e79 = z17;
    }

    @Override // f06.c
    /* renamed from: call */
    public java.lang.Object mo128633x2e7a5e(java.lang.Object... objArr) {
        return mo143935xd3829966().mo128633x2e7a5e(objArr);
    }

    @Override // f06.c
    /* renamed from: callBy */
    public java.lang.Object mo128634xae796355(java.util.Map map) {
        return mo143935xd3829966().mo128634xae796355(map);
    }

    /* renamed from: compute */
    public f06.c mo143933x38a78837() {
        f06.c cVar = this.f72686xd415281c;
        if (cVar != null) {
            return cVar;
        }
        f06.c mo143942x5ea00da5 = mo143942x5ea00da5();
        this.f72686xd415281c = mo143942x5ea00da5;
        return mo143942x5ea00da5;
    }

    /* renamed from: computeReflected */
    public abstract f06.c mo143942x5ea00da5();

    @Override // f06.b
    /* renamed from: getAnnotations */
    public java.util.List<java.lang.annotation.Annotation> mo128629xa083c1ee() {
        return mo143935xd3829966().mo128629xa083c1ee();
    }

    /* renamed from: getBoundReceiver */
    public java.lang.Object m143943x2404e5d7() {
        return this.f72685xcfcbe9ef;
    }

    @Override // f06.c
    /* renamed from: getName */
    public java.lang.String mo9624xfb82e301() {
        return this.f72683x337a8b;
    }

    /* renamed from: getOwner */
    public f06.f mo9625x74f198fd() {
        java.lang.Class cls = this.f72684x653f2b3;
        if (cls == null) {
            return null;
        }
        return this.f72682x96111e79 ? p3321xbce91901.jvm.p3324x21ffc6bd.i0.f391657a.c(cls, "") : p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(cls);
    }

    @Override // f06.c
    /* renamed from: getParameters */
    public java.util.List<f06.o> mo128635x99879e0() {
        return mo143935xd3829966().mo128635x99879e0();
    }

    /* renamed from: getReflected */
    public abstract f06.c mo143935xd3829966();

    @Override // f06.c
    /* renamed from: getReturnType */
    public f06.w mo128636x3df4e080() {
        return mo143935xd3829966().mo128636x3df4e080();
    }

    /* renamed from: getSignature */
    public java.lang.String mo9626x3f6b0a02() {
        return this.f72687x3ffd98b8;
    }

    @Override // f06.c
    /* renamed from: getTypeParameters */
    public java.util.List<f06.x> mo128637xb121b9ba() {
        return mo143935xd3829966().mo128637xb121b9ba();
    }

    @Override // f06.c
    /* renamed from: getVisibility */
    public f06.b0 mo128638x61f71b08() {
        return mo143935xd3829966().mo128638x61f71b08();
    }

    @Override // f06.c
    /* renamed from: isAbstract */
    public boolean mo128639x3801976c() {
        return mo143935xd3829966().mo128639x3801976c();
    }

    @Override // f06.c
    /* renamed from: isFinal */
    public boolean mo128640x7ab76e6c() {
        return mo143935xd3829966().mo128640x7ab76e6c();
    }

    @Override // f06.c
    /* renamed from: isOpen */
    public boolean mo128641xb9a70294() {
        return mo143935xd3829966().mo128641xb9a70294();
    }
}
