package zu3;

/* loaded from: classes10.dex */
public final class d extends zu3.a {

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f557325g;

    /* renamed from: h, reason: collision with root package name */
    public int f557326h;

    /* renamed from: i, reason: collision with root package name */
    public int f557327i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f557328j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(zu3.e type) {
        super(type);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f557325g = new java.util.ArrayList();
    }

    public final r45.is i(long j17) {
        for (r45.is isVar : this.f557325g) {
            if (isVar.f458831e <= j17 && isVar.f458832f >= j17) {
                return isVar;
            }
        }
        return null;
    }

    @Override // zu3.o
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public r45.ot mo179488xc3d7db06() {
        r45.ot otVar = new r45.ot();
        otVar.f464035d.addAll(this.f557325g);
        otVar.f464036e = f(this.f557296f);
        otVar.f464038g = this.f557327i;
        otVar.f464037f = this.f557326h;
        otVar.f464039h = this.f557328j;
        return otVar;
    }

    /* renamed from: toString */
    public java.lang.String m179527x9616526c() {
        java.util.Iterator it = this.f557325g.iterator();
        while (it.hasNext()) {
            r45.is isVar = (r45.is) it.next();
            long j17 = isVar.f458831e;
            isVar.f458830d.h(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        }
        return "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(zu3.e type, java.util.ArrayList list, android.graphics.Matrix matrix) {
        super(type);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matrix, "matrix");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f557325g = arrayList;
        arrayList.clear();
        arrayList.addAll(list);
        this.f557296f.set(matrix);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(zu3.e type, byte[] byteArray) {
        super(type);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(byteArray, "byteArray");
        this.f557325g = new java.util.ArrayList();
        try {
            r45.ot otVar = new r45.ot();
            try {
                otVar.mo11468x92b714fd(byteArray);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                otVar = null;
            }
            if (otVar != null) {
                this.f557325g.clear();
                this.f557325g.addAll(otVar.f464035d);
                android.graphics.Matrix matrix = this.f557296f;
                r45.zz6 matrix2 = otVar.f464036e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(matrix2, "matrix");
                matrix.setValues(g(matrix2));
                this.f557327i = otVar.f464038g;
                this.f557326h = otVar.f464037f;
                this.f557328j = otVar.f464039h;
                m179527x9616526c();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CaptionItem", "");
            }
        } catch (java.io.IOException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CaptionItem", e18, "LocationItem parse error", new java.lang.Object[0]);
        }
    }
}
