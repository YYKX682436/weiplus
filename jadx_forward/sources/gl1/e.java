package gl1;

/* loaded from: classes7.dex */
public class e extends gl1.f implements gl1.a {

    /* renamed from: e, reason: collision with root package name */
    public sd1.c f354328e;

    /* renamed from: f, reason: collision with root package name */
    public c01.l2 f354329f;

    public e(android.content.Context context) {
        super(context);
        this.f354328e = null;
    }

    @Override // gl1.a
    /* renamed from: getKeyValueSet */
    public c01.l2 mo51882x3a8beb7a() {
        return this.f354329f;
    }

    @Override // sd1.b
    /* renamed from: getReferrerPolicy */
    public sd1.c mo51883x546d0727() {
        return this.f354328e;
    }

    @Override // gl1.a
    /* renamed from: getView */
    public android.view.View mo51884xfb86a31b() {
        return this;
    }

    @Override // gl1.c
    /* renamed from: setImageByteArray */
    public void mo51886x17258818(byte[] bArr) {
    }

    /* renamed from: setImageFilePath */
    public void m131730x75cc54fa(java.lang.String str) {
    }

    /* renamed from: setInterceptEvent */
    public void m131731x1b3dbffa(boolean z17) {
        this.f354330d = z17;
    }

    @Override // gl1.a
    /* renamed from: setKeyValueSet */
    public void mo51889xd0f15eee(c01.l2 l2Var) {
        this.f354329f = l2Var;
    }

    @Override // sd1.b
    /* renamed from: setReferrerPolicy */
    public void mo51890x1c636f33(sd1.c cVar) {
        this.f354328e = cVar;
    }
}
