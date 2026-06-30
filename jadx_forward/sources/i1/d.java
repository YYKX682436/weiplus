package i1;

/* loaded from: classes13.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f368385a;

    /* renamed from: b, reason: collision with root package name */
    public final float f368386b;

    /* renamed from: c, reason: collision with root package name */
    public final float f368387c;

    /* renamed from: d, reason: collision with root package name */
    public final float f368388d;

    /* renamed from: e, reason: collision with root package name */
    public final float f368389e;

    /* renamed from: f, reason: collision with root package name */
    public final long f368390f;

    /* renamed from: g, reason: collision with root package name */
    public final int f368391g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f368392h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f368393i;

    /* renamed from: j, reason: collision with root package name */
    public final i1.c f368394j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f368395k;

    public d(java.lang.String str, float f17, float f18, float f19, float f27, long j17, int i17, boolean z17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        long j18;
        java.lang.String str2 = (i18 & 1) != 0 ? "" : str;
        if ((i18 & 32) != 0) {
            int i19 = e1.y.f327854l;
            j18 = e1.y.f327853k;
        } else {
            j18 = j17;
        }
        int i27 = (i18 & 64) != 0 ? 5 : i17;
        boolean z18 = (i18 & 128) != 0 ? false : z17;
        this.f368385a = str2;
        this.f368386b = f17;
        this.f368387c = f18;
        this.f368388d = f19;
        this.f368389e = f27;
        this.f368390f = j18;
        this.f368391g = i27;
        this.f368392h = z18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f368393i = arrayList;
        i1.c cVar = new i1.c(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
        this.f368394j = cVar;
        arrayList.add(cVar);
    }

    public final i1.d a(java.lang.String name, float f17, float f18, float f19, float f27, float f28, float f29, float f37, java.util.List clipPathData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clipPathData, "clipPathData");
        c();
        this.f368393i.add(new i1.c(name, f17, f18, f19, f27, f28, f29, f37, clipPathData, null, 512, null));
        return this;
    }

    public final i1.d b() {
        c();
        java.util.ArrayList arrayList = this.f368393i;
        i1.c cVar = (i1.c) arrayList.remove(arrayList.size() - 1);
        ((i1.c) arrayList.get(arrayList.size() - 1)).f368378j.add(new i1.o1(cVar.f368369a, cVar.f368370b, cVar.f368371c, cVar.f368372d, cVar.f368373e, cVar.f368374f, cVar.f368375g, cVar.f368376h, cVar.f368377i, cVar.f368378j));
        return this;
    }

    public final void c() {
        if (!(!this.f368395k)) {
            throw new java.lang.IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector".toString());
        }
    }
}
