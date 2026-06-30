package j0;

/* loaded from: classes14.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0.c5 f378106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g2.e0 f378107e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g2.v f378108f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(j0.c5 c5Var, g2.e0 e0Var, g2.v vVar) {
        super(1);
        this.f378106d = c5Var;
        this.f378107e = e0Var;
        this.f378108f = vVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int f17;
        int e17;
        e1.p0 p0Var;
        java.util.ArrayList arrayList;
        int i17;
        boolean z17;
        g1.i drawBehind = (g1.i) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawBehind, "$this$drawBehind");
        j0.c5 c5Var = this.f378106d;
        j0.d5 d5Var = c5Var.f377772g;
        if (d5Var != null) {
            e1.u canvas = ((g1.b) drawBehind.p()).a();
            e1.n0 selectionPaint = c5Var.f377782q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
            g2.e0 value = this.f378107e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
            g2.v offsetMapping = this.f378108f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(offsetMapping, "offsetMapping");
            a2.k1 textLayoutResult = d5Var.f377798a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textLayoutResult, "textLayoutResult");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectionPaint, "selectionPaint");
            long j17 = value.f349227b;
            if (!a2.m1.b(j17) && (f17 = a2.m1.f(j17)) != (e17 = a2.m1.e(j17))) {
                a2.g gVar = textLayoutResult.f82299b;
                gVar.getClass();
                boolean z18 = f17 >= 0 && f17 <= e17;
                a2.j jVar = gVar.f82247a;
                if (!(z18 && e17 <= jVar.f82281a.f82214d.length())) {
                    throw new java.lang.IllegalArgumentException(("Start(" + f17 + ") or End(" + e17 + ") is out of range [0.." + jVar.f82281a.f82214d.length() + "), or start > end!").toString());
                }
                if (f17 == e17) {
                    p0Var = e1.k.a();
                } else {
                    java.util.List list = gVar.f82254h;
                    int a17 = a2.k.a(list, f17);
                    e1.p0 a18 = e1.k.a();
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
                    int size = arrayList2.size();
                    while (a17 < size) {
                        a2.m mVar = (a2.m) arrayList2.get(a17);
                        int i18 = mVar.f82307b;
                        if (i18 >= e17) {
                            break;
                        }
                        if (i18 != mVar.f82308c) {
                            int b17 = mVar.b(f17);
                            int b18 = mVar.b(e17);
                            i2.c cVar = (i2.c) mVar.f82306a;
                            cVar.getClass();
                            if (b17 < 0 || b17 > b18) {
                                arrayList = arrayList2;
                                z17 = false;
                            } else {
                                arrayList = arrayList2;
                                z17 = true;
                            }
                            i2.e eVar = cVar.f369380a;
                            if (z17) {
                                int i19 = size;
                                if (b18 <= eVar.f369390d.length()) {
                                    android.graphics.Path path = new android.graphics.Path();
                                    b2.t tVar = cVar.f369383d;
                                    tVar.getClass();
                                    tVar.f98849b.getSelectionPath(b17, b18, path);
                                    int i27 = tVar.f98851d;
                                    if (i27 != 0 && !path.isEmpty()) {
                                        path.offset(0.0f, i27);
                                    }
                                    e1.i iVar = new e1.i(path);
                                    long a19 = d1.f.a(0.0f, mVar.f82311f);
                                    android.graphics.Matrix matrix = iVar.f327799d;
                                    matrix.reset();
                                    matrix.setTranslate(d1.e.c(a19), d1.e.d(a19));
                                    iVar.f327796a.transform(matrix);
                                    i17 = i19;
                                    e1.o0.a(a18, iVar, 0L, 2, null);
                                }
                            }
                            throw new java.lang.AssertionError("Start(" + b17 + ") or End(" + b18 + ") is out of Range(0.." + eVar.f369390d.length() + "), or start > end!");
                        }
                        arrayList = arrayList2;
                        i17 = size;
                        a17++;
                        size = i17;
                        arrayList2 = arrayList;
                    }
                    p0Var = a18;
                }
                canvas.l(p0Var, selectionPaint);
            }
            a2.l1.f82305a.a(canvas, textLayoutResult);
        }
        return jz5.f0.f384359a;
    }
}
