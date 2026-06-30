package a2;

/* loaded from: classes14.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final a2.j1 f82298a;

    /* renamed from: b, reason: collision with root package name */
    public final a2.g f82299b;

    /* renamed from: c, reason: collision with root package name */
    public final long f82300c;

    /* renamed from: d, reason: collision with root package name */
    public final float f82301d;

    /* renamed from: e, reason: collision with root package name */
    public final float f82302e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f82303f;

    public k1(a2.j1 j1Var, a2.g gVar, long j17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f82298a = j1Var;
        this.f82299b = gVar;
        this.f82300c = j17;
        java.util.ArrayList arrayList = (java.util.ArrayList) gVar.f82254h;
        float f17 = 0.0f;
        this.f82301d = arrayList.isEmpty() ? 0.0f : ((i2.c) ((a2.m) arrayList.get(0)).f82306a).f369383d.a(0);
        java.util.List list = gVar.f82254h;
        if (!((java.util.ArrayList) list).isEmpty()) {
            a2.m mVar = (a2.m) kz5.n0.i0(list);
            i2.c cVar = (i2.c) mVar.f82306a;
            b2.t tVar = cVar.f369383d;
            int i17 = tVar.f98850c;
            int i18 = cVar.f369381b;
            f17 = mVar.f82311f + (i18 < i17 ? tVar.a(i18 - 1) : tVar.a(i17 - 1));
        }
        this.f82302e = f17;
        this.f82303f = gVar.f82253g;
    }

    public final l2.e a(int i17) {
        a2.g gVar = this.f82299b;
        gVar.c(i17);
        int length = gVar.f82247a.f82281a.length();
        java.util.List list = gVar.f82254h;
        a2.m mVar = (a2.m) ((java.util.ArrayList) list).get(i17 == length ? kz5.c0.h(list) : a2.k.a(list, i17));
        return ((i2.c) mVar.f82306a).f369383d.f98849b.isRtlCharAt(mVar.b(i17)) ? l2.e.Rtl : l2.e.Ltr;
    }

    public final d1.g b(int i17) {
        a2.g gVar = this.f82299b;
        a2.j jVar = gVar.f82247a;
        if (!(i17 >= 0 && i17 < jVar.f82281a.f82214d.length())) {
            throw new java.lang.IllegalArgumentException(("offset(" + i17 + ") is out of bounds [0, " + jVar.f82281a.length() + ')').toString());
        }
        java.util.List list = gVar.f82254h;
        a2.m mVar = (a2.m) ((java.util.ArrayList) list).get(a2.k.a(list, i17));
        a2.l lVar = mVar.f82306a;
        int b17 = mVar.b(i17);
        b2.t tVar = ((i2.c) lVar).f369383d;
        float d17 = b2.t.d(tVar, b17, false, 2, null);
        float d18 = b2.t.d(tVar, b17 + 1, false, 2, null);
        int lineForOffset = tVar.f98849b.getLineForOffset(b17);
        return mVar.a(new d1.g(d17, tVar.c(lineForOffset), d18, tVar.b(lineForOffset)));
    }

    public final d1.g c(int i17) {
        a2.g gVar = this.f82299b;
        gVar.c(i17);
        int length = gVar.f82247a.f82281a.length();
        java.util.List list = gVar.f82254h;
        a2.m mVar = (a2.m) ((java.util.ArrayList) list).get(i17 == length ? kz5.c0.h(list) : a2.k.a(list, i17));
        a2.l lVar = mVar.f82306a;
        int b17 = mVar.b(i17);
        i2.c cVar = (i2.c) lVar;
        i2.e eVar = cVar.f369380a;
        if (b17 >= 0 && b17 <= eVar.f369390d.length()) {
            b2.t tVar = cVar.f369383d;
            float d17 = b2.t.d(tVar, b17, false, 2, null);
            int lineForOffset = tVar.f98849b.getLineForOffset(b17);
            return mVar.a(new d1.g(d17, tVar.c(lineForOffset), d17, tVar.b(lineForOffset)));
        }
        throw new java.lang.AssertionError("offset(" + b17 + ") is out of bounds (0," + eVar.f369390d.length());
    }

    public final float d(int i17) {
        a2.g gVar = this.f82299b;
        gVar.d(i17);
        java.util.List list = gVar.f82254h;
        a2.m mVar = (a2.m) ((java.util.ArrayList) list).get(a2.k.b(list, i17));
        a2.l lVar = mVar.f82306a;
        return ((i2.c) lVar).f369383d.b(i17 - mVar.f82309d) + mVar.f82311f;
    }

    public final int e(int i17, boolean z17) {
        int lineEnd;
        a2.g gVar = this.f82299b;
        gVar.d(i17);
        java.util.List list = gVar.f82254h;
        a2.m mVar = (a2.m) ((java.util.ArrayList) list).get(a2.k.b(list, i17));
        a2.l lVar = mVar.f82306a;
        int i18 = i17 - mVar.f82309d;
        b2.t tVar = ((i2.c) lVar).f369383d;
        if (z17) {
            android.text.Layout layout = tVar.f98849b;
            lineEnd = layout.getEllipsisStart(i18) == 0 ? layout.getLineVisibleEnd(i18) : layout.getEllipsisStart(i18) + layout.getLineStart(i18);
        } else {
            android.text.Layout layout2 = tVar.f98849b;
            lineEnd = layout2.getEllipsisStart(i18) == 0 ? layout2.getLineEnd(i18) : layout2.getText().length();
        }
        return lineEnd + mVar.f82307b;
    }

    /* renamed from: equals */
    public boolean m364xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2.k1)) {
            return false;
        }
        a2.k1 k1Var = (a2.k1) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82298a, k1Var.f82298a) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82299b, k1Var.f82299b) || !p2.q.a(this.f82300c, k1Var.f82300c)) {
            return false;
        }
        if (this.f82301d == k1Var.f82301d) {
            return ((this.f82302e > k1Var.f82302e ? 1 : (this.f82302e == k1Var.f82302e ? 0 : -1)) == 0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82303f, k1Var.f82303f);
        }
        return false;
    }

    public final int f(int i17) {
        a2.g gVar = this.f82299b;
        gVar.c(i17);
        int length = gVar.f82247a.f82281a.length();
        java.util.List list = gVar.f82254h;
        a2.m mVar = (a2.m) ((java.util.ArrayList) list).get(i17 == length ? kz5.c0.h(list) : a2.k.a(list, i17));
        return ((i2.c) mVar.f82306a).f369383d.f98849b.getLineForOffset(mVar.b(i17)) + mVar.f82309d;
    }

    public final int g(float f17) {
        a2.g gVar = this.f82299b;
        java.util.List list = gVar.f82254h;
        a2.m mVar = (a2.m) ((java.util.ArrayList) list).get(f17 <= 0.0f ? 0 : f17 >= gVar.f82251e ? kz5.c0.h(list) : a2.k.c(list, f17));
        int i17 = mVar.f82308c;
        int i18 = mVar.f82307b;
        if (i17 - i18 == 0) {
            return java.lang.Math.max(0, i18 - 1);
        }
        float f18 = f17 - mVar.f82311f;
        b2.t tVar = ((i2.c) mVar.f82306a).f369383d;
        return tVar.f98849b.getLineForVertical(tVar.f98851d + ((int) f18)) + mVar.f82309d;
    }

    public final float h(int i17) {
        a2.g gVar = this.f82299b;
        gVar.d(i17);
        java.util.List list = gVar.f82254h;
        a2.m mVar = (a2.m) ((java.util.ArrayList) list).get(a2.k.b(list, i17));
        a2.l lVar = mVar.f82306a;
        return ((i2.c) lVar).f369383d.f98849b.getLineLeft(i17 - mVar.f82309d);
    }

    /* renamed from: hashCode */
    public int m365x8cdac1b() {
        return (((((((((this.f82298a.m361x8cdac1b() * 31) + this.f82299b.hashCode()) * 31) + java.lang.Long.hashCode(this.f82300c)) * 31) + java.lang.Float.hashCode(this.f82301d)) * 31) + java.lang.Float.hashCode(this.f82302e)) * 31) + this.f82303f.hashCode();
    }

    public final float i(int i17) {
        a2.g gVar = this.f82299b;
        gVar.d(i17);
        java.util.List list = gVar.f82254h;
        a2.m mVar = (a2.m) ((java.util.ArrayList) list).get(a2.k.b(list, i17));
        a2.l lVar = mVar.f82306a;
        return ((i2.c) lVar).f369383d.f98849b.getLineRight(i17 - mVar.f82309d);
    }

    public final int j(int i17) {
        a2.g gVar = this.f82299b;
        gVar.d(i17);
        java.util.List list = gVar.f82254h;
        a2.m mVar = (a2.m) ((java.util.ArrayList) list).get(a2.k.b(list, i17));
        a2.l lVar = mVar.f82306a;
        return ((i2.c) lVar).f369383d.f98849b.getLineStart(i17 - mVar.f82309d) + mVar.f82307b;
    }

    public final float k(int i17) {
        a2.g gVar = this.f82299b;
        gVar.d(i17);
        java.util.List list = gVar.f82254h;
        a2.m mVar = (a2.m) ((java.util.ArrayList) list).get(a2.k.b(list, i17));
        a2.l lVar = mVar.f82306a;
        return ((i2.c) lVar).f369383d.c(i17 - mVar.f82309d) + mVar.f82311f;
    }

    public final int l(long j17) {
        a2.g gVar = this.f82299b;
        gVar.getClass();
        float d17 = d1.e.d(j17);
        java.util.List list = gVar.f82254h;
        a2.m mVar = (a2.m) ((java.util.ArrayList) list).get(d17 <= 0.0f ? 0 : d1.e.d(j17) >= gVar.f82251e ? kz5.c0.h(list) : a2.k.c(list, d1.e.d(j17)));
        int i17 = mVar.f82308c;
        int i18 = mVar.f82307b;
        if (i17 - i18 == 0) {
            return java.lang.Math.max(0, i18 - 1);
        }
        long a17 = d1.f.a(d1.e.c(j17), d1.e.d(j17) - mVar.f82311f);
        i2.c cVar = (i2.c) mVar.f82306a;
        cVar.getClass();
        int d18 = (int) d1.e.d(a17);
        b2.t tVar = cVar.f369383d;
        return tVar.f98849b.getOffsetForHorizontal(tVar.f98849b.getLineForVertical(tVar.f98851d + d18), d1.e.c(a17)) + i18;
    }

    public final l2.e m(int i17) {
        a2.g gVar = this.f82299b;
        gVar.c(i17);
        int length = gVar.f82247a.f82281a.length();
        java.util.List list = gVar.f82254h;
        a2.m mVar = (a2.m) ((java.util.ArrayList) list).get(i17 == length ? kz5.c0.h(list) : a2.k.a(list, i17));
        a2.l lVar = mVar.f82306a;
        int b17 = mVar.b(i17);
        b2.t tVar = ((i2.c) lVar).f369383d;
        return tVar.f98849b.getParagraphDirection(tVar.f98849b.getLineForOffset(b17)) == 1 ? l2.e.Ltr : l2.e.Rtl;
    }

    public final long n(int i17) {
        int i18;
        int preceding;
        int i19;
        int following;
        a2.g gVar = this.f82299b;
        gVar.c(i17);
        int length = gVar.f82247a.f82281a.length();
        java.util.List list = gVar.f82254h;
        a2.m mVar = (a2.m) ((java.util.ArrayList) list).get(i17 == length ? kz5.c0.h(list) : a2.k.a(list, i17));
        a2.l lVar = mVar.f82306a;
        int b17 = mVar.b(i17);
        i2.c cVar = (i2.c) lVar;
        c2.c cVar2 = ((c2.a) cVar.f369385f.mo141623x754a37bb()).f119503a;
        cVar2.a(b17);
        boolean e17 = cVar2.e(cVar2.f119508d.preceding(b17));
        java.text.BreakIterator breakIterator = cVar2.f119508d;
        if (e17) {
            cVar2.a(b17);
            i18 = b17;
            while (i18 != -1) {
                if (cVar2.e(i18) && !cVar2.c(i18)) {
                    break;
                }
                cVar2.a(i18);
                i18 = breakIterator.preceding(i18);
            }
        } else {
            cVar2.a(b17);
            if (cVar2.d(b17)) {
                if (!breakIterator.isBoundary(b17) || cVar2.b(b17)) {
                    preceding = breakIterator.preceding(b17);
                    i18 = preceding;
                } else {
                    i18 = b17;
                }
            } else if (cVar2.b(b17)) {
                preceding = breakIterator.preceding(b17);
                i18 = preceding;
            } else {
                i18 = -1;
            }
        }
        if (i18 == -1) {
            i18 = b17;
        }
        c2.c cVar3 = ((c2.a) cVar.f369385f.mo141623x754a37bb()).f119503a;
        cVar3.a(b17);
        boolean c17 = cVar3.c(cVar3.f119508d.following(b17));
        java.text.BreakIterator breakIterator2 = cVar3.f119508d;
        if (c17) {
            cVar3.a(b17);
            i19 = b17;
            while (i19 != -1) {
                if (!cVar3.e(i19) && cVar3.c(i19)) {
                    break;
                }
                cVar3.a(i19);
                i19 = breakIterator2.following(i19);
            }
        } else {
            cVar3.a(b17);
            if (cVar3.b(b17)) {
                if (!breakIterator2.isBoundary(b17) || cVar3.d(b17)) {
                    following = breakIterator2.following(b17);
                    i19 = following;
                } else {
                    i19 = b17;
                }
            } else if (cVar3.d(b17)) {
                following = breakIterator2.following(b17);
                i19 = following;
            } else {
                i19 = -1;
            }
        }
        if (i19 != -1) {
            b17 = i19;
        }
        long a17 = a2.n1.a(i18, b17);
        int i27 = a2.m1.f82315c;
        int i28 = mVar.f82307b;
        return a2.n1.a(((int) (a17 >> 32)) + i28, a2.m1.c(a17) + i28);
    }

    /* renamed from: toString */
    public java.lang.String m366x9616526c() {
        return "TextLayoutResult(layoutInput=" + this.f82298a + ", multiParagraph=" + this.f82299b + ", size=" + ((java.lang.Object) p2.q.c(this.f82300c)) + ", firstBaseline=" + this.f82301d + ", lastBaseline=" + this.f82302e + ", placeholderRects=" + this.f82303f + ')';
    }
}
