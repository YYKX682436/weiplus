package xh2;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f536064a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Rect f536065b;

    /* renamed from: c, reason: collision with root package name */
    public int f536066c;

    /* renamed from: d, reason: collision with root package name */
    public final int f536067d;

    /* renamed from: e, reason: collision with root package name */
    public final int f536068e;

    /* renamed from: f, reason: collision with root package name */
    public final int f536069f;

    /* renamed from: g, reason: collision with root package name */
    public final float f536070g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f536071h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f536072i;

    public c(java.util.LinkedList dataList, android.graphics.Rect viewRect, int i17, int i18, int i19, int i27, float f17, boolean z17, java.util.LinkedList holeDataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewRect, "viewRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holeDataList, "holeDataList");
        this.f536064a = dataList;
        this.f536065b = viewRect;
        this.f536066c = i17;
        this.f536067d = i18;
        this.f536068e = i19;
        this.f536069f = i27;
        this.f536070g = f17;
        this.f536071h = z17;
        this.f536072i = holeDataList;
    }

    public final xh2.c a() {
        java.util.LinkedList linkedList = this.f536064a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(linkedList, "<this>");
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            linkedList2.add(((xh2.a) it.next()).a());
        }
        return new xh2.c(linkedList2, this.f536065b, this.f536066c, this.f536067d, this.f536068e, this.f536069f, this.f536070g, this.f536071h, this.f536072i);
    }

    public final boolean b() {
        int i17 = this.f536067d;
        return (i17 == 0 && this.f536069f == 2) || (i17 == 2 && this.f536068e == 2);
    }

    /* renamed from: equals */
    public boolean m175539xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh2.c)) {
            return false;
        }
        xh2.c cVar = (xh2.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f536064a, cVar.f536064a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f536065b, cVar.f536065b) && this.f536066c == cVar.f536066c && this.f536067d == cVar.f536067d && this.f536068e == cVar.f536068e && this.f536069f == cVar.f536069f && java.lang.Float.compare(this.f536070g, cVar.f536070g) == 0 && this.f536071h == cVar.f536071h && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f536072i, cVar.f536072i);
    }

    /* renamed from: hashCode */
    public int m175540x8cdac1b() {
        return (((((((((((((((this.f536064a.hashCode() * 31) + this.f536065b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f536066c)) * 31) + java.lang.Integer.hashCode(this.f536067d)) * 31) + java.lang.Integer.hashCode(this.f536068e)) * 31) + java.lang.Integer.hashCode(this.f536069f)) * 31) + java.lang.Float.hashCode(this.f536070g)) * 31) + java.lang.Boolean.hashCode(this.f536071h)) * 31) + this.f536072i.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m175541x9616526c() {
        return "FinderLiveMicNotifyEvent(dataList=" + this.f536064a + ", viewRect=" + this.f536065b + ", mode=" + this.f536066c + ", liveMode=" + this.f536067d + ", liveSubMode=" + this.f536068e + ", voiceMode=" + this.f536069f + ", anchorVideoRate=" + this.f536070g + ", shouldShowMicTopic=" + this.f536071h + ", holeDataList=" + this.f536072i + ')';
    }
}
