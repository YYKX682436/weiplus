package o0;

/* loaded from: classes14.dex */
public final class i implements java.util.RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object[] f423383d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f423384e;

    /* renamed from: f, reason: collision with root package name */
    public int f423385f;

    public i(java.lang.Object[] content, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        this.f423383d = content;
        this.f423385f = i17;
    }

    public final void a(int i17, java.lang.Object obj) {
        g(this.f423385f + 1);
        java.lang.Object[] objArr = this.f423383d;
        int i18 = this.f423385f;
        if (i17 != i18) {
            kz5.v.k(objArr, objArr, i17 + 1, i17, i18);
        }
        objArr[i17] = obj;
        this.f423385f++;
    }

    public final boolean b(java.lang.Object obj) {
        g(this.f423385f + 1);
        java.lang.Object[] objArr = this.f423383d;
        int i17 = this.f423385f;
        objArr[i17] = obj;
        this.f423385f = i17 + 1;
        return true;
    }

    public final boolean c(int i17, java.util.Collection elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        int i18 = 0;
        if (elements.isEmpty()) {
            return false;
        }
        g(this.f423385f + elements.size());
        java.lang.Object[] objArr = this.f423383d;
        if (i17 != this.f423385f) {
            kz5.v.k(objArr, objArr, elements.size() + i17, i17, this.f423385f);
        }
        for (java.lang.Object obj : elements) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            objArr[i18 + i17] = obj;
            i18 = i19;
        }
        this.f423385f += elements.size();
        return true;
    }

    public final boolean d(int i17, o0.i elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        if (elements.i()) {
            return false;
        }
        g(this.f423385f + elements.f423385f);
        java.lang.Object[] objArr = this.f423383d;
        int i18 = this.f423385f;
        if (i17 != i18) {
            kz5.v.k(objArr, objArr, elements.f423385f + i17, i17, i18);
        }
        kz5.v.k(elements.f423383d, objArr, i17, 0, elements.f423385f);
        this.f423385f += elements.f423385f;
        return true;
    }

    public final void e() {
        java.lang.Object[] objArr = this.f423383d;
        int i17 = this.f423385f;
        while (true) {
            i17--;
            if (-1 >= i17) {
                this.f423385f = 0;
                return;
            }
            objArr[i17] = null;
        }
    }

    public final boolean f(java.lang.Object obj) {
        int i17 = this.f423385f - 1;
        if (i17 >= 0) {
            for (int i18 = 0; !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f423383d[i18], obj); i18++) {
                if (i18 != i17) {
                }
            }
            return true;
        }
        return false;
    }

    public final void g(int i17) {
        java.lang.Object[] objArr = this.f423383d;
        if (objArr.length < i17) {
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, java.lang.Math.max(i17, objArr.length * 2));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "copyOf(this, newSize)");
            this.f423383d = copyOf;
        }
    }

    public final int h(java.lang.Object obj) {
        int i17 = this.f423385f;
        if (i17 <= 0) {
            return -1;
        }
        java.lang.Object[] objArr = this.f423383d;
        int i18 = 0;
        while (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, objArr[i18])) {
            i18++;
            if (i18 >= i17) {
                return -1;
            }
        }
        return i18;
    }

    public final boolean i() {
        return this.f423385f == 0;
    }

    public final boolean j() {
        return this.f423385f != 0;
    }

    public final boolean k(java.lang.Object obj) {
        int h17 = h(obj);
        if (h17 < 0) {
            return false;
        }
        m(h17);
        return true;
    }

    public final boolean l(o0.i elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        int i17 = this.f423385f;
        int i18 = elements.f423385f - 1;
        if (i18 >= 0) {
            int i19 = 0;
            while (true) {
                k(elements.f423383d[i19]);
                if (i19 == i18) {
                    break;
                }
                i19++;
            }
        }
        return i17 != this.f423385f;
    }

    public final java.lang.Object m(int i17) {
        java.lang.Object[] objArr = this.f423383d;
        java.lang.Object obj = objArr[i17];
        int i18 = this.f423385f;
        if (i17 != i18 - 1) {
            kz5.v.k(objArr, objArr, i17, i17 + 1, i18);
        }
        int i19 = this.f423385f - 1;
        this.f423385f = i19;
        objArr[i19] = null;
        return obj;
    }
}
