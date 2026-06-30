package a2;

/* loaded from: classes14.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final a2.j1 f765a;

    /* renamed from: b, reason: collision with root package name */
    public final a2.g f766b;

    /* renamed from: c, reason: collision with root package name */
    public final long f767c;

    /* renamed from: d, reason: collision with root package name */
    public final float f768d;

    /* renamed from: e, reason: collision with root package name */
    public final float f769e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f770f;

    public k1(a2.j1 j1Var, a2.g gVar, long j17, kotlin.jvm.internal.i iVar) {
        this.f765a = j1Var;
        this.f766b = gVar;
        this.f767c = j17;
        java.util.ArrayList arrayList = (java.util.ArrayList) gVar.f721h;
        float f17 = 0.0f;
        this.f768d = arrayList.isEmpty() ? 0.0f : ((i2.c) ((a2.m) arrayList.get(0)).f773a).f287850d.a(0);
        java.util.List list = gVar.f721h;
        if (!((java.util.ArrayList) list).isEmpty()) {
            a2.m mVar = (a2.m) kz5.n0.i0(list);
            i2.c cVar = (i2.c) mVar.f773a;
            b2.t tVar = cVar.f287850d;
            int i17 = tVar.f17317c;
            int i18 = cVar.f287848b;
            f17 = mVar.f778f + (i18 < i17 ? tVar.a(i18 - 1) : tVar.a(i17 - 1));
        }
        this.f769e = f17;
        this.f770f = gVar.f720g;
    }

    public final l2.e a(int i17) {
        a2.g gVar = this.f766b;
        gVar.c(i17);
        int length = gVar.f714a.f748a.length();
        java.util.List list = gVar.f721h;
        a2.m mVar = (a2.m) ((java.util.ArrayList) list).get(i17 == length ? kz5.c0.h(list) : a2.k.a(list, i17));
        return ((i2.c) mVar.f773a).f287850d.f17316b.isRtlCharAt(mVar.b(i17)) ? l2.e.Rtl : l2.e.Ltr;
    }

    public final d1.g b(int i17) {
        a2.g gVar = this.f766b;
        a2.j jVar = gVar.f714a;
        if (!(i17 >= 0 && i17 < jVar.f748a.f681d.length())) {
            throw new java.lang.IllegalArgumentException(("offset(" + i17 + ") is out of bounds [0, " + jVar.f748a.length() + ')').toString());
        }
        java.util.List list = gVar.f721h;
        a2.m mVar = (a2.m) ((java.util.ArrayList) list).get(a2.k.a(list, i17));
        a2.l lVar = mVar.f773a;
        int b17 = mVar.b(i17);
        b2.t tVar = ((i2.c) lVar).f287850d;
        float d17 = b2.t.d(tVar, b17, false, 2, null);
        float d18 = b2.t.d(tVar, b17 + 1, false, 2, null);
        int lineForOffset = tVar.f17316b.getLineForOffset(b17);
        return mVar.a(new d1.g(d17, tVar.c(lineForOffset), d18, tVar.b(lineForOffset)));
    }

    public final d1.g c(int i17) {
        a2.g gVar = this.f766b;
        gVar.c(i17);
        int length = gVar.f714a.f748a.length();
        java.util.List list = gVar.f721h;
        a2.m mVar = (a2.m) ((java.util.ArrayList) list).get(i17 == length ? kz5.c0.h(list) : a2.k.a(list, i17));
        a2.l lVar = mVar.f773a;
        int b17 = mVar.b(i17);
        i2.c cVar = (i2.c) lVar;
        i2.e eVar = cVar.f287847a;
        if (b17 >= 0 && b17 <= eVar.f287857d.length()) {
            b2.t tVar = cVar.f287850d;
            float d17 = b2.t.d(tVar, b17, false, 2, null);
            int lineForOffset = tVar.f17316b.getLineForOffset(b17);
            return mVar.a(new d1.g(d17, tVar.c(lineForOffset), d17, tVar.b(lineForOffset)));
        }
        throw new java.lang.AssertionError("offset(" + b17 + ") is out of bounds (0," + eVar.f287857d.length());
    }

    public final float d(int i17) {
        a2.g gVar = this.f766b;
        gVar.d(i17);
        java.util.List list = gVar.f721h;
        a2.m mVar = (a2.m) ((java.util.ArrayList) list).get(a2.k.b(list, i17));
        a2.l lVar = mVar.f773a;
        return ((i2.c) lVar).f287850d.b(i17 - mVar.f776d) + mVar.f778f;
    }

    public final int e(int i17, boolean z17) {
        int lineEnd;
        a2.g gVar = this.f766b;
        gVar.d(i17);
        java.util.List list = gVar.f721h;
        a2.m mVar = (a2.m) ((java.util.ArrayList) list).get(a2.k.b(list, i17));
        a2.l lVar = mVar.f773a;
        int i18 = i17 - mVar.f776d;
        b2.t tVar = ((i2.c) lVar).f287850d;
        if (z17) {
            android.text.Layout layout = tVar.f17316b;
            lineEnd = layout.getEllipsisStart(i18) == 0 ? layout.getLineVisibleEnd(i18) : layout.getEllipsisStart(i18) + layout.getLineStart(i18);
        } else {
            android.text.Layout layout2 = tVar.f17316b;
            lineEnd = layout2.getEllipsisStart(i18) == 0 ? layout2.getLineEnd(i18) : layout2.getText().length();
        }
        return lineEnd + mVar.f774b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2.k1)) {
            return false;
        }
        a2.k1 k1Var = (a2.k1) obj;
        if (!kotlin.jvm.internal.o.b(this.f765a, k1Var.f765a) || !kotlin.jvm.internal.o.b(this.f766b, k1Var.f766b) || !p2.q.a(this.f767c, k1Var.f767c)) {
            return false;
        }
        if (this.f768d == k1Var.f768d) {
            return ((this.f769e > k1Var.f769e ? 1 : (this.f769e == k1Var.f769e ? 0 : -1)) == 0) && kotlin.jvm.internal.o.b(this.f770f, k1Var.f770f);
        }
        return false;
    }

    public final int f(int i17) {
        a2.g gVar = this.f766b;
        gVar.c(i17);
        int length = gVar.f714a.f748a.length();
        java.util.List list = gVar.f721h;
        a2.m mVar = (a2.m) ((java.util.ArrayList) list).get(i17 == length ? kz5.c0.h(list) : a2.k.a(list, i17));
        return ((i2.c) mVar.f773a).f287850d.f17316b.getLineForOffset(mVar.b(i17)) + mVar.f776d;
    }

    public final int g(float f17) {
        a2.g gVar = this.f766b;
        java.util.List list = gVar.f721h;
        a2.m mVar = (a2.m) ((java.util.ArrayList) list).get(f17 <= 0.0f ? 0 : f17 >= gVar.f718e ? kz5.c0.h(list) : a2.k.c(list, f17));
        int i17 = mVar.f775c;
        int i18 = mVar.f774b;
        if (i17 - i18 == 0) {
            return java.lang.Math.max(0, i18 - 1);
        }
        float f18 = f17 - mVar.f778f;
        b2.t tVar = ((i2.c) mVar.f773a).f287850d;
        return tVar.f17316b.getLineForVertical(tVar.f17318d + ((int) f18)) + mVar.f776d;
    }

    public final float h(int i17) {
        a2.g gVar = this.f766b;
        gVar.d(i17);
        java.util.List list = gVar.f721h;
        a2.m mVar = (a2.m) ((java.util.ArrayList) list).get(a2.k.b(list, i17));
        a2.l lVar = mVar.f773a;
        return ((i2.c) lVar).f287850d.f17316b.getLineLeft(i17 - mVar.f776d);
    }

    public int hashCode() {
        return (((((((((this.f765a.hashCode() * 31) + this.f766b.hashCode()) * 31) + java.lang.Long.hashCode(this.f767c)) * 31) + java.lang.Float.hashCode(this.f768d)) * 31) + java.lang.Float.hashCode(this.f769e)) * 31) + this.f770f.hashCode();
    }

    public final float i(int i17) {
        a2.g gVar = this.f766b;
        gVar.d(i17);
        java.util.List list = gVar.f721h;
        a2.m mVar = (a2.m) ((java.util.ArrayList) list).get(a2.k.b(list, i17));
        a2.l lVar = mVar.f773a;
        return ((i2.c) lVar).f287850d.f17316b.getLineRight(i17 - mVar.f776d);
    }

    public final int j(int i17) {
        a2.g gVar = this.f766b;
        gVar.d(i17);
        java.util.List list = gVar.f721h;
        a2.m mVar = (a2.m) ((java.util.ArrayList) list).get(a2.k.b(list, i17));
        a2.l lVar = mVar.f773a;
        return ((i2.c) lVar).f287850d.f17316b.getLineStart(i17 - mVar.f776d) + mVar.f774b;
    }

    public final float k(int i17) {
        a2.g gVar = this.f766b;
        gVar.d(i17);
        java.util.List list = gVar.f721h;
        a2.m mVar = (a2.m) ((java.util.ArrayList) list).get(a2.k.b(list, i17));
        a2.l lVar = mVar.f773a;
        return ((i2.c) lVar).f287850d.c(i17 - mVar.f776d) + mVar.f778f;
    }

    public final int l(long j17) {
        a2.g gVar = this.f766b;
        gVar.getClass();
        float d17 = d1.e.d(j17);
        java.util.List list = gVar.f721h;
        a2.m mVar = (a2.m) ((java.util.ArrayList) list).get(d17 <= 0.0f ? 0 : d1.e.d(j17) >= gVar.f718e ? kz5.c0.h(list) : a2.k.c(list, d1.e.d(j17)));
        int i17 = mVar.f775c;
        int i18 = mVar.f774b;
        if (i17 - i18 == 0) {
            return java.lang.Math.max(0, i18 - 1);
        }
        long a17 = d1.f.a(d1.e.c(j17), d1.e.d(j17) - mVar.f778f);
        i2.c cVar = (i2.c) mVar.f773a;
        cVar.getClass();
        int d18 = (int) d1.e.d(a17);
        b2.t tVar = cVar.f287850d;
        return tVar.f17316b.getOffsetForHorizontal(tVar.f17316b.getLineForVertical(tVar.f17318d + d18), d1.e.c(a17)) + i18;
    }

    public final l2.e m(int i17) {
        a2.g gVar = this.f766b;
        gVar.c(i17);
        int length = gVar.f714a.f748a.length();
        java.util.List list = gVar.f721h;
        a2.m mVar = (a2.m) ((java.util.ArrayList) list).get(i17 == length ? kz5.c0.h(list) : a2.k.a(list, i17));
        a2.l lVar = mVar.f773a;
        int b17 = mVar.b(i17);
        b2.t tVar = ((i2.c) lVar).f287850d;
        return tVar.f17316b.getParagraphDirection(tVar.f17316b.getLineForOffset(b17)) == 1 ? l2.e.Ltr : l2.e.Rtl;
    }

    public final long n(int i17) {
        int i18;
        int preceding;
        int i19;
        int following;
        a2.g gVar = this.f766b;
        gVar.c(i17);
        int length = gVar.f714a.f748a.length();
        java.util.List list = gVar.f721h;
        a2.m mVar = (a2.m) ((java.util.ArrayList) list).get(i17 == length ? kz5.c0.h(list) : a2.k.a(list, i17));
        a2.l lVar = mVar.f773a;
        int b17 = mVar.b(i17);
        i2.c cVar = (i2.c) lVar;
        c2.c cVar2 = ((c2.a) cVar.f287852f.getValue()).f37970a;
        cVar2.a(b17);
        boolean e17 = cVar2.e(cVar2.f37975d.preceding(b17));
        java.text.BreakIterator breakIterator = cVar2.f37975d;
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
        c2.c cVar3 = ((c2.a) cVar.f287852f.getValue()).f37970a;
        cVar3.a(b17);
        boolean c17 = cVar3.c(cVar3.f37975d.following(b17));
        java.text.BreakIterator breakIterator2 = cVar3.f37975d;
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
        int i27 = a2.m1.f782c;
        int i28 = mVar.f774b;
        return a2.n1.a(((int) (a17 >> 32)) + i28, a2.m1.c(a17) + i28);
    }

    public java.lang.String toString() {
        return "TextLayoutResult(layoutInput=" + this.f765a + ", multiParagraph=" + this.f766b + ", size=" + ((java.lang.Object) p2.q.c(this.f767c)) + ", firstBaseline=" + this.f768d + ", lastBaseline=" + this.f769e + ", placeholderRects=" + this.f770f + ')';
    }
}
