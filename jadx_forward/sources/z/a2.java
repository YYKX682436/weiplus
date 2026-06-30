package z;

/* loaded from: classes13.dex */
public final class a2 implements z.l {

    /* renamed from: a, reason: collision with root package name */
    public final z.r3 f550103a;

    /* renamed from: b, reason: collision with root package name */
    public final z.w2 f550104b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f550105c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f550106d;

    /* renamed from: e, reason: collision with root package name */
    public final z.w f550107e;

    /* renamed from: f, reason: collision with root package name */
    public final z.w f550108f;

    /* renamed from: g, reason: collision with root package name */
    public final z.w f550109g;

    /* renamed from: h, reason: collision with root package name */
    public final long f550110h;

    /* renamed from: i, reason: collision with root package name */
    public final z.w f550111i;

    public /* synthetic */ a2(z.p pVar, z.w2 w2Var, java.lang.Object obj, java.lang.Object obj2, z.w wVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(pVar, w2Var, obj, obj2, (i17 & 16) != 0 ? null : wVar);
    }

    @Override // z.l
    public boolean a() {
        return this.f550103a.a();
    }

    @Override // z.l
    public boolean b(long j17) {
        return z.k.a(this, j17);
    }

    @Override // z.l
    public long c() {
        return this.f550110h;
    }

    @Override // z.l
    public z.w2 d() {
        return this.f550104b;
    }

    @Override // z.l
    public java.lang.Object e(long j17) {
        return !z.k.a(this, j17) ? ((z.x2) this.f550104b).f550407b.mo146xb9724478(this.f550103a.c(j17, this.f550107e, this.f550108f, this.f550109g)) : this.f550106d;
    }

    @Override // z.l
    public java.lang.Object f() {
        return this.f550106d;
    }

    @Override // z.l
    public z.w g(long j17) {
        return !z.k.a(this, j17) ? this.f550103a.f(j17, this.f550107e, this.f550108f, this.f550109g) : this.f550111i;
    }

    /* renamed from: toString */
    public java.lang.String m178138x9616526c() {
        return "TargetBasedAnimation: " + this.f550105c + " -> " + this.f550106d + ",initial velocity: " + this.f550109g + ", duration: " + (c() / 1000000) + " ms";
    }

    public a2(z.p animationSpec, z.w2 typeConverter, java.lang.Object obj, java.lang.Object obj2, z.w wVar) {
        z.w c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationSpec, "animationSpec");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeConverter, "typeConverter");
        z.r3 animationSpec2 = animationSpec.a(typeConverter);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationSpec2, "animationSpec");
        this.f550103a = animationSpec2;
        this.f550104b = typeConverter;
        this.f550105c = obj;
        this.f550106d = obj2;
        yz5.l lVar = ((z.x2) typeConverter).f550406a;
        z.w wVar2 = (z.w) lVar.mo146xb9724478(obj);
        this.f550107e = wVar2;
        z.w wVar3 = (z.w) lVar.mo146xb9724478(obj2);
        this.f550108f = wVar3;
        if (wVar != null) {
            c17 = z.x.a(wVar);
        } else {
            z.w wVar4 = (z.w) lVar.mo146xb9724478(obj);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wVar4, "<this>");
            c17 = wVar4.c();
        }
        this.f550109g = c17;
        this.f550110h = animationSpec2.d(wVar2, wVar3, c17);
        this.f550111i = animationSpec2.b(wVar2, wVar3, c17);
    }
}
