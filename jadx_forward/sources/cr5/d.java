package cr5;

/* loaded from: classes11.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f303543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f303544e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zq5.e f303545f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cr5.f f303546g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Canvas f303547h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f303548i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f303549m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f303550n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f303551o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f303552p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.util.List list, java.util.List list2, zq5.e eVar, cr5.f fVar, android.graphics.Canvas canvas, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var3, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var4) {
        super(1);
        this.f303543d = list;
        this.f303544e = list2;
        this.f303545f = eVar;
        this.f303546g = fVar;
        this.f303547h = canvas;
        this.f303548i = f0Var;
        this.f303549m = f0Var2;
        this.f303550n = z17;
        this.f303551o = f0Var3;
        this.f303552p = f0Var4;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        zq5.e eVar;
        cr5.f fVar;
        android.graphics.Canvas canvas;
        android.graphics.Canvas withZooming = (android.graphics.Canvas) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(withZooming, "$this$withZooming");
        java.util.Iterator it = this.f303543d.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            eVar = this.f303545f;
            fVar = this.f303546g;
            canvas = this.f303547h;
            if (!hasNext) {
                break;
            }
            yq5.r rVar = (yq5.r) it.next();
            if (rVar.f546152b.b(eVar) && cr5.f.a(fVar, canvas, rVar, false)) {
                this.f303548i.f391649d++;
            }
        }
        for (yq5.r rVar2 : this.f303544e) {
            if (rVar2.f546152b.b(eVar)) {
                this.f303549m.f391649d++;
                if (cr5.f.a(fVar, canvas, rVar2, this.f303550n)) {
                    this.f303551o.f391649d++;
                }
            } else {
                this.f303552p.f391649d++;
            }
        }
        return jz5.f0.f384359a;
    }
}
